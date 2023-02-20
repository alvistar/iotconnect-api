package com.thealvistar.iotconnect.common

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import okhttp3.Authenticator
import okhttp3.Call
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class ApiClient(
    private var baseUrl: String = defaultBasePath,
    private val okHttpClientBuilder: OkHttpClient.Builder? = null,
    private val callFactory: Call.Factory? = null,
    private val converterFactory: Converter.Factory? = null,
) {
    private val apiAuthorizations = mutableMapOf<String, Interceptor>()
    var logger: ((String) -> Unit)? = null

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(
                JacksonConverterFactory.create(
                    jacksonObjectMapper().findAndRegisterModules(),
                ),
            )
            .apply {
                if (converterFactory != null) {
                    addConverterFactory(converterFactory)
                }
            }
    }

    private val clientBuilder: OkHttpClient.Builder by lazy {
        okHttpClientBuilder ?: defaultClientBuilder
    }

    private val defaultClientBuilder: OkHttpClient.Builder by lazy {
        OkHttpClient()
            .newBuilder()
            .addInterceptor(
                HttpLoggingInterceptor { message -> logger?.invoke(message) }
                    .apply { level = HttpLoggingInterceptor.Level.BODY },
            )
    }

    init {
        normalizeBaseUrl()
    }

    constructor(
        baseUrl: String = defaultBasePath,
        okHttpClientBuilder: OkHttpClient.Builder? = null,
        authNames: Array<String>,
        authenticator: Authenticator? = null,
    ) : this(baseUrl, okHttpClientBuilder) {
        authNames.forEach { authName ->
            val auth = when (authName) {
                "Bearer" -> ApiKeyAuth("header", "Authorization")
                else -> throw RuntimeException("auth name $authName not found in available auth names")
            }
            addAuthorization(authName, auth)
        }
        clientBuilder.addInterceptor(ErrorInterceptor())

        if (authenticator != null) {
            clientBuilder.authenticator(authenticator)
        }
    }

    /**
     * Adds an authorization to be used by the client
     * @param authName Authentication name
     * @param authorization Authorization interceptor
     * @return ApiClient
     */
    fun addAuthorization(authName: String, authorization: Interceptor): ApiClient {
        if (apiAuthorizations.containsKey(authName)) {
            throw RuntimeException("auth name $authName already in api authorizations")
        }
        apiAuthorizations[authName] = authorization
        clientBuilder.addInterceptor(authorization)
        return this
    }

    fun setLogger(logger: (String) -> Unit): ApiClient {
        this.logger = logger
        return this
    }

    fun setApiKey(apiKey: String) {
        (apiAuthorizations["Bearer"] as ApiKeyAuth).apiKey = apiKey
    }

    fun <S> createService(serviceClass: Class<S>): S {
        val usedCallFactory = this.callFactory ?: clientBuilder.build()
        return retrofitBuilder.callFactory(usedCallFactory).build().create(serviceClass)
    }

    private fun normalizeBaseUrl() {
        if (!baseUrl.endsWith("/")) {
            baseUrl += "/"
        }
    }

    private inline fun <T, reified U> Iterable<T>.runOnFirst(callback: U.() -> Unit) {
        for (element in this) {
            if (element is U) {
                callback.invoke(element)
                break
            }
        }
    }

    companion object {
        @JvmStatic
        protected val baseUrlKey = "com.thealvistar.iotconnect.device.client.baseUrl"

        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(baseUrlKey, "https://avnetdevice.iotconnect.io/")
        }
    }
}
