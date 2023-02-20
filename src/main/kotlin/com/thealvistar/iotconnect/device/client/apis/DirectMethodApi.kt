package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.DirectMethodCreateRequest
import com.thealvistar.iotconnect.device.client.models.DirectMethodCreateResponse
import com.thealvistar.iotconnect.device.client.models.DirectMethodDeleteResponse
import com.thealvistar.iotconnect.device.client.models.DirectMethodListResponse
import com.thealvistar.iotconnect.device.client.models.DirectMethodLookupResponse
import com.thealvistar.iotconnect.device.client.models.DirectMethodUpdateRequest
import com.thealvistar.iotconnect.device.client.models.DirectMethodUpdateResponse
import retrofit2.Call
import retrofit2.http.*

interface DirectMethodApi {
    /**
     * Get device template direct methods list
     * &lt;p&gt;This API endpoint gives you the list of available direct methods in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the direct method list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device template doesn't exist and invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @return [Call]<[DirectMethodListResponse]>
     */
    @GET("api/v2/template-direct-method/{deviceTemplateGuid}")
    fun apiV2TemplateDirectMethodDeviceTemplateGuidGet(@Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID): Call<DirectMethodListResponse>

    /**
     * Get device template direct methods lookup
     * &lt;p&gt;This API endpoint gives you the lookup list of available direct methods in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the direct method lookup received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist and invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @return [Call]<[DirectMethodLookupResponse]>
     */
    @GET("api/v2/template-direct-method/{deviceTemplateGuid}/lookup")
    fun apiV2TemplateDirectMethodDeviceTemplateGuidLookupGet(@Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID): Call<DirectMethodLookupResponse>

    /**
     * Delete a direct method
     * &lt;p&gt;You can delete a direct method using this API endpoint. For that, you need to send &lt;i&gt;directMethodGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the direct method deleted successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The direct method doesn't exist and invalid logged user or company.
     *
     * @param directMethodGuid Direct Method Guid
     * @return [Call]<[DirectMethodDeleteResponse]>
     */
    @DELETE("api/v2/template-direct-method/{directMethodGuid}")
    fun apiV2TemplateDirectMethodDirectMethodGuidDelete(@Path("directMethodGuid") directMethodGuid: java.util.UUID): Call<DirectMethodDeleteResponse>

    /**
     * Update a direct method
     * &lt;p&gt;This API endpoint allows you to update a direct method. For that, you need to send &lt;i&gt;directMethodGuid&lt;/i&gt; in request url along with the direct method update details in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the direct method updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device template doesn't exist, direct method doesn't exist, invalid data type,               direct method name already exists and invalid logged user or company.
     *
     * @param directMethodGuid Direct Method Guid
     * @param directMethodUpdateRequest Json object (optional)
     * @return [Call]<[DirectMethodUpdateResponse]>
     */
    @PUT("api/v2/template-direct-method/{directMethodGuid}")
    fun apiV2TemplateDirectMethodDirectMethodGuidPut(
        @Path("directMethodGuid") directMethodGuid: java.util.UUID,
        @Body directMethodUpdateRequest: DirectMethodUpdateRequest? = null,
    ): Call<DirectMethodUpdateResponse>

    /**
     * Add new direct method
     * &lt;p&gt;This API endpoint allows you to Add new Direct Method for given  template.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the direct method created successfully and returns created direct method guid.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, invalid data type, direct method name already exists and invalid logged user or company.
     *
     * @param directMethodCreateRequest Json object (optional)
     * @return [Call]<[DirectMethodCreateResponse]>
     */
    @POST("api/v2/template-direct-method")
    fun apiV2TemplateDirectMethodPost(@Body directMethodCreateRequest: DirectMethodCreateRequest? = null): Call<DirectMethodCreateResponse>
}
