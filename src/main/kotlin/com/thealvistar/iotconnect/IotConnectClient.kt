package com.thealvistar.iotconnect

import com.thealvistar.iotconnect.auth.client.apis.AuthApi
import com.thealvistar.iotconnect.auth.client.models.LoginRequest
import com.thealvistar.iotconnect.common.AccessTokenAuthenticator
import com.thealvistar.iotconnect.common.ApiClient
import com.thealvistar.iotconnect.device.client.apis.DeviceApi
import com.thealvistar.iotconnect.user.client.apis.EntityApi
import com.thealvistar.iotconnect.user.client.apis.UserApi

class IotConnectClient(val userName: String, val password: String, val solutionId: String) {
    val authenticator = AccessTokenAuthenticator(this)

    val authClient = ApiClient(
        baseUrl = "https://avnetauth.iotconnect.io",
        authNames = arrayOf("Bearer"),
    )

    val authService = authClient.createService(AuthApi::class.java)

    val deviceClient = ApiClient(
        baseUrl = "https://avnetdevice.iotconnect.io",
        authNames = arrayOf("Bearer"),
        authenticator = authenticator,
    )

    val deviceService = deviceClient.createService(DeviceApi::class.java)

    val userClient = ApiClient(
        baseUrl = "https://avnetuser.iotconnect.io",
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
            LoginRequest(username = userName, password = password),
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
