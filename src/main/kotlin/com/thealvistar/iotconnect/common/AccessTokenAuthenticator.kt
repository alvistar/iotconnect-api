package com.thealvistar.iotconnect.common

import com.thealvistar.iotconnect.IotConnectClient
import mu.KotlinLogging
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route

private val logger = KotlinLogging.logger {}

fun Response.isRequestWithAccessToken(): Boolean {
    return request.header("Authorization")?.startsWith("Bearer ") ?: false
}

fun Request.withAccessToken(token: String, tag: Boolean = false): Request {
    val builder = newBuilder().header("Authorization", "Bearer $token")

    if (tag) {
        builder.tag(Boolean::class.javaObjectType, true)
    }

    return builder.build()
}

class AccessTokenAuthenticator(
    val iotConnectClient: IotConnectClient,
) :
    Authenticator {

    override fun authenticate(route: Route?, response: Response): Request? {
        logger.info { "401 Unauthenticated error" }
        val tag = response.request.tag(Boolean::class.javaObjectType)

        if (!response.isRequestWithAccessToken() || tag == null) {
            if (!response.isRequestWithAccessToken()) {
                logger.info { "Original request without access token" }
            } else {
                logger.info { "Original Request with access token but did not retried" }
            }

            val accessToken = iotConnectClient.getAccessToken()
            logger.info { "Access token: $accessToken" }
            iotConnectClient.setToken(accessToken)
            return response.request.withAccessToken(accessToken, true)
        }

        logger.error { "Original request with access token and retried" }

        return null
    }
}
