package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.DeviceLookupByTemplateResponse
import com.thealvistar.iotconnect.device.client.models.SettingCreateRequest
import com.thealvistar.iotconnect.device.client.models.SettingCreateResponse
import com.thealvistar.iotconnect.device.client.models.SettingDeleteResponse
import com.thealvistar.iotconnect.device.client.models.SettingListResponse
import com.thealvistar.iotconnect.device.client.models.SettingLookupResponse
import com.thealvistar.iotconnect.device.client.models.TemplateSettingUpdateReadOnlyRequest
import com.thealvistar.iotconnect.device.client.models.TemplateSettingUpdateReadOnlyResponse
import retrofit2.Call
import retrofit2.http.*

interface SettingApi {
    /**
     * Get device twin properties list
     * &lt;p&gt;This API endpoint provides you the list of available twin properties of a device. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the twin property lookup received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device doesn't exist and invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order, Eg. name, name asc, name desc etc. (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @return [Call]<[SettingListResponse]>
     */
    @GET("api/v2/device/{deviceGuid}/template-setting")
    fun apiV2DeviceDeviceGuidTemplateSettingGet(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
    ): Call<SettingListResponse>

    /**
     * Get top 10 devices by template/solutiontemplate.
     * &lt;p&gt;This API endpoint gives you the top 10 list of available device twin. for that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the top 10 devicetwin property list loaded successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist and invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @return [Call]<[DeviceLookupByTemplateResponse]>
     */
    @GET("api/v2/template-setting/{deviceTemplateGuid}/devices/lookup")
    fun apiV2TemplateSettingDeviceTemplateGuidDevicesLookupGet(@Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID): Call<DeviceLookupByTemplateResponse>

    /**
     * Get device template twin properties list
     * &lt;p&gt;This API endpoint gives you the list of available twin properties in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the twin property list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist and invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order. Eg. name, name asc, name desc etc. (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @return [Call]<[SettingListResponse]>
     */
    @GET("api/v2/template-setting/{deviceTemplateGuid}")
    fun apiV2TemplateSettingDeviceTemplateGuidGet(
        @Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
    ): Call<SettingListResponse>

    /**
     * Get device template twin properties lookup
     * &lt;p&gt;This API endpoint gives you the lookup list of available twin properties in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the twin property lookup received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist and invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @param hasDataValidation If true. returns that setting which have data validation. (optional)
     * @param isReadOnly Get twins readonly setting data. (optional)
     * @return [Call]<[SettingLookupResponse]>
     */
    @GET("api/v2/template-setting/{deviceTemplateGuid}/lookup")
    fun apiV2TemplateSettingDeviceTemplateGuidLookupGet(
        @Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID,
        @Query("hasDataValidation") hasDataValidation: kotlin.Boolean? = null,
        @Query("isReadOnly") isReadOnly: kotlin.Boolean? = null,
    ): Call<SettingLookupResponse>

    /**
     * Add new twin property
     * &lt;p&gt;Device twins are used to synchronize state information between a device and an IoT hub. Device twin is a JSON document, associated with a specific device, and stored by IoT Hub in the cloud where you can query them. Device twin contains desired properties, reported properties, and tags. The desired property is set by a back-end application and read by a device. The reported property is set by a device and read by a back-end application. The tag is set by a back-end application and is never sent to a device. Tags are used to organize devices.&lt;/p&gt;  &lt;p&gt;You can add new twin properties using this API. These properties will be defined in your device template and will be part of your device template. A single template can have one or more twin properties.&lt;/p&gt;  &lt;p&gt;Here name, &lt;i&gt;localName&lt;/i&gt;, &lt;i&gt;defaultValue&lt;/i&gt; and &lt;i&gt;datatype&lt;/i&gt; are mandatory for any twin property. Data validation allows you to set data range or specific data for twin property values.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the twin property created successfully and returns created twin property guid.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, invalid data type, twin property key already exists and invalid logged user or company.
     *
     * @param settingCreateRequest Json object (optional)
     * @return [Call]<[SettingCreateResponse]>
     */
    @POST("api/v2/template-setting")
    fun apiV2TemplateSettingPost(@Body settingCreateRequest: SettingCreateRequest? = null): Call<SettingCreateResponse>

    /**
     * Update a readOnly property
     * &lt;p&gt;This API endpoint allows you to update a twin property. For that, you need to send &lt;i&gt;settingGuid&lt;/i&gt; in request url along with the twin property update details in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the twin property updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, twin property doesn't exist, invalid data type,   twin property key already exists and invalid logged user or company.
     *
     * @param settingGuid Twin Property Guid
     * @param templateSettingUpdateReadOnlyRequest Json object (optional)
     * @return [Call]<[TemplateSettingUpdateReadOnlyResponse]>
     */
    @PUT("api/v2/template-setting/readOnly/{settingGuid}")
    fun apiV2TemplateSettingReadOnlySettingGuidPut(
        @Path("settingGuid") settingGuid: java.util.UUID,
        @Body templateSettingUpdateReadOnlyRequest: TemplateSettingUpdateReadOnlyRequest? = null,
    ): Call<TemplateSettingUpdateReadOnlyResponse>

    /**
     * Delete a twin property
     * &lt;p&gt;You can delete a twin property using this API endpoint. For that, you need to send &lt;i&gt;settingGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the twin property updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The twin property doesn't exist and invalid logged user or company.
     *
     * @param settingGuid Twin Property Guid
     * @return [Call]<[SettingDeleteResponse]>
     */
    @DELETE("api/v2/template-setting/{settingGuid}")
    fun apiV2TemplateSettingSettingGuidDelete(@Path("settingGuid") settingGuid: java.util.UUID): Call<SettingDeleteResponse>
}
