package com.thealvistar.iotconnect.common

import com.thealvistar.iotconnect.IotConnectClient
import mu.KotlinLogging
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route

val logger = KotlinLogging.logger {}

fun Response.isRequestWithAccessToken(): Boolean {
    return request.header("Authorization")?.startsWith("Bearer ") ?: false
}

fun Request.withAccessToken(token: String): Request {
    return newBuilder()
        .header("Authorization", "Bearer $token")
        .build()
}

class AccessTokenAuthenticator(
    val iotConnectClient: IotConnectClient,
) :
    Authenticator {

    override fun authenticate(route: Route?, response: Response): Request {
        logger.info { "401 Unauthenticated error" }
        if (!response.isRequestWithAccessToken()) {
            logger.info { "Token was not present, trying to get access token" }
            val accessToken = iotConnectClient.getAccessToken()
            logger.info { "Access token: $accessToken" }
            iotConnectClient.setToken(accessToken)
            return response.request.withAccessToken(accessToken)
        }

        TODO("Not yet implemented")
    }
}
