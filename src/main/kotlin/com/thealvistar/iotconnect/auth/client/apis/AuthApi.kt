package com.thealvistar.iotconnect.auth.client.apis

import com.thealvistar.iotconnect.auth.client.models.ArrayBaseResponse
import com.thealvistar.iotconnect.auth.client.models.BasicTokenCreateResponse
import com.thealvistar.iotconnect.auth.client.models.LoginRequest
import com.thealvistar.iotconnect.auth.client.models.LoginResponse
import com.thealvistar.iotconnect.auth.client.models.MobileLoginRequest
import com.thealvistar.iotconnect.auth.client.models.MobileLoginResponse
import com.thealvistar.iotconnect.auth.client.models.RefreshTokenRequest
import retrofit2.Call
import retrofit2.http.*

interface AuthApi {
    /**
     * Generate basic token
     * &lt;p&gt;We are using the OAuth 2.0 protocol for authentication and authorization. Login API endpoint needs basic authentication to validate your request. This API endpoint will generate that basic authentication token, which you need for the Login API endpoint. This token informs the API that the bearer of the token has been authorized to access the Login API.&lt;/p&gt;
     * Responses:
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that basic token is created successfully and returns generated basic token
     *
     * @return [Call]<[BasicTokenCreateResponse]>
     */
    @GET("api/v2/Auth/basic-token")
    fun apiV2AuthBasicTokenGet(): Call<BasicTokenCreateResponse>

    /**
     * Login
     * &lt;p&gt;Before you can access private data using IoTConnect API, you must obtain an access token that grants access to that API. A single access token can grant varying degrees of access to multiple IoTConnect APIs. Once you get an access token, send it to IoTConnect API in an HTTP authorization header. Access tokens are valid only for the set of operations and resources described in the scope of the token. Along with an access token, you will also receive a refresh token. This refresh token allows you to get new access tokens.&lt;/p&gt;  &lt;p&gt;We are using the OAuth 2.0 protocol for authentication and authorization. To begin, obtain a basic token from the basic token API endpoint. Then, request an access token from the IoTConnect Authorization Server, extract a token from the response, and send the token to the IoTConnect API that you want to access.&lt;/p&gt;  &lt;p&gt;During the access token request, you need to pass your IoTConnect account username and password in body. While in Request Header, you need to submit basic token and solution key.&lt;/p&gt;
     * Responses:
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that access token is created successfully and returns generated access token along with refresh token
     *  - 401: Indicates that authentication is failed because of the wrong username/password or the user is not authorized to access given solution.
     *
     * @param solutionKey
     * @param loginRequest  (optional)
     * @return [Call]<[LoginResponse]>
     */
    @POST("api/v2/Auth/login")
    fun apiV2AuthLoginPost(
        @Header("solution-key") solutionKey: kotlin.String,
        @Body loginRequest: LoginRequest? = null,
    ): Call<LoginResponse>

    /**
     * Login from Mobile
     * &lt;p&gt;This Api endpoint will be used for mobile application login. Before your mobile device can access private data using IoTConnect API, you must obtain an access token that grants access to that API. A single access token can grant varying degrees of access to multiple IoTConnect APIs. Once you get an access token, send it to IoTConnect API in an HTTP authorization header. Access tokens are valid only for the set of operations and resources described in the scope of the token. Along with an access token, you will also receive a refresh token. This refresh token allows you to get new access tokens.&lt;/p&gt;  &lt;p&gt;We are using the OAuth 2.0 protocol for authentication and authorization. To begin, obtain a basic token from the basic token API endpoint. Then, request an access token from the IoTConnect Authorization Server, extract a token from the response, and send the token to the IoTConnect API that you want to access.&lt;/p&gt;  &lt;p&gt;During the access token request, you need to send username and password along with deviceType, osName, osVersion, uuid and deviceToken in the request body. While in Request Header, you need to submit a basic token and solution key.&lt;/p&gt;
     * Responses:
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that access token is created successfully and returns generated access token along with refresh token
     *  - 401: Indicates that authentication is failed because of the wrong username/password or the user is not authorized to access given solution.
     *
     * @param solutionKey
     * @param mobileLoginRequest  (optional)
     * @return [Call]<[MobileLoginResponse]>
     */
    @POST("api/v2/Auth/m-login")
    fun apiV2AuthMLoginPost(
        @Header("solution-key") solutionKey: kotlin.String,
        @Body mobileLoginRequest: MobileLoginRequest? = null,
    ): Call<MobileLoginResponse>

    /**
     * Refresh access token
     * &lt;p&gt;Access tokens have a limited lifespan. If you need access to the IoTConnect API beyond the lifespan of a single access token, get a refresh token. A refresh token allows you to obtain new access tokens.&lt;/p&gt;  &lt;p&gt;During the refresh token request, you need to send refresh_token, which you received in the login API endpoint response.&lt;/p&gt;
     * Responses:
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that refresh token is created successfully and returns generated access token along with new refresh token
     *  - 409: Indicates that supplied refresh token is not valid.
     *
     * @param refreshTokenRequest  (optional)
     * @return [Call]<[LoginResponse]>
     */
    @POST("api/v2/Auth/refresh-token")
    fun apiV2AuthRefreshTokenPost(@Body refreshTokenRequest: RefreshTokenRequest? = null): Call<LoginResponse>

    /**
     * Verify access token
     * &lt;p&gt;This API endpoint verifies the validity of your access token.&lt;/p&gt;
     * Responses:
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that access token is verified successfully
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @return [Call]<[ArrayBaseResponse]>
     */
    @GET("api/v2/Auth/verify-token")
    fun apiV2AuthVerifyTokenGet(): Call<ArrayBaseResponse>
}
