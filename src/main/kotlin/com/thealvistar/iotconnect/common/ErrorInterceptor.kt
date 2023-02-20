package com.thealvistar.iotconnect.common

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.thealvistar.iotconnect.common.models.ErrorsResponse
import okhttp3.Interceptor
import okhttp3.Response

class ErrorInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())

        if (!response.isSuccessful) {
            val responseBody = response.body!!.string()
            val errorsResponse = jacksonObjectMapper().readValue<ErrorsResponse>(responseBody)
            throw ApiException(errorsResponse)
        }

        return response
    }
}
