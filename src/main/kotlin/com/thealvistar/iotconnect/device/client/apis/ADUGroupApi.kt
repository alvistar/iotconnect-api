package com.thealvistar.iotconnect.device.client.apis

import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.fasterxml.jackson.annotation.JsonProperty

import com.thealvistar.iotconnect.device.client.models.ADUGroupCreateRequest
import com.thealvistar.iotconnect.device.client.models.ADUGroupCreateResponse
import com.thealvistar.iotconnect.device.client.models.ADUGroupsListResponse
import com.thealvistar.iotconnect.device.client.models.ErrorsResponse

interface ADUGroupApi {
    /**
     * Get ADU Group list
     * &lt;p&gt;This API endpoint provides you the get list of ADU Groups.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the ADU Group list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @return [Call]<[ADUGroupsListResponse]>
     */
    @GET("api/v2/adu-groups")
    fun apiV2AduGroupsGet(): Call<ADUGroupsListResponse>

    /**
     * Create ADU Group.
     * &lt;p&gt;This API endpoint provides you to create ADU Group.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the ADU Group created successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @param adUGroupCreateRequest  (optional)
     * @return [Call]<[ADUGroupCreateResponse]>
     */
    @POST("api/v2/adu-groups")
    fun apiV2AduGroupsPost(@Body adUGroupCreateRequest: ADUGroupCreateRequest? = null): Call<ADUGroupCreateResponse>

}
