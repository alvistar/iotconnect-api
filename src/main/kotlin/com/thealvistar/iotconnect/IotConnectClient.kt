package com.thealvistar.iotconnect

import com.thealvistar.iotconnect.auth.client.apis.AuthApi
import com.thealvistar.iotconnect.auth.client.models.LoginRequest
import com.thealvistar.iotconnect.common.AccessTokenAuthenticator
import com.thealvistar.iotconnect.common.ApiClient
import com.thealvistar.iotconnect.device.client.apis.DeviceApi
import com.thealvistar.iotconnect.user.client.apis.EntityApi
import com.thealvistar.iotconnect.user.client.apis.UserApi

data class BaseUrls(
    val authClient: String = "https://avnetauth.iotconnect.io",
    val deviceClient: String = "https://avnetdevice.iotconnect.io",
    val userClient: String = "https://avnetuser.iotconnect.io",
)

class IotConnectClient(
    val username: String,
    val password: String,
    val solutionId: String,
    val baseUrls: BaseUrls = BaseUrls(),
) {
    val authenticator = AccessTokenAuthenticator(this)

    val authClient = ApiClient(
        baseUrl = baseUrls.authClient,
        authNames = arrayOf("Bearer"),
    )

    val authService = authClient.createService(AuthApi::class.java)

    val deviceClient = ApiClient(
        baseUrl = baseUrls.deviceClient,
        authNames = arrayOf("Bearer"),
        authenticator = authenticator,
    )

    val deviceService = deviceClient.createService(DeviceApi::class.java)

    val userClient = ApiClient(
        baseUrl = baseUrls.userClient,
        authNames = arrayOf("Bearer"),
        authenticator = authenticator,
    )

    val userService = userClient.createService(UserApi::class.java)
    val entityService = userClient.createService(EntityApi::class.java)

    fun setToken(token: String) {
        deviceClient.setApiKey("Bearer $token")
        userClient.setApiKey("Bearer $token")
    }

    fun getAccessToken(): String {
        val response = authService.apiV2AuthBasicTokenGet().execute()

        if (!response.isSuccessful) {
            throw Exception("Error getting basic token")
        }

        authClient.setApiKey(response.body()!!.data!!)

        val loginResponse = authService.apiV2AuthLoginPost(
            solutionId,
            LoginRequest(username = username, password = password),
        ).execute()

        if (!loginResponse.isSuccessful) {
            throw Exception("Error getting access token")
        }

        return loginResponse.body()!!.accessToken!!
    }

    fun login() {
        setToken(getAccessToken())
    }
}
