package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.TemplateCreateQuickResponse
import com.thealvistar.iotconnect.device.client.models.TemplateCreateRequest
import com.thealvistar.iotconnect.device.client.models.TemplateCreateResponse
import com.thealvistar.iotconnect.device.client.models.TemplateDataTypeResponse
import com.thealvistar.iotconnect.device.client.models.TemplateDeleteResponse
import com.thealvistar.iotconnect.device.client.models.TemplateDetailLookupResponse
import com.thealvistar.iotconnect.device.client.models.TemplateDetailResponse
import com.thealvistar.iotconnect.device.client.models.TemplateDeviceNotificationResponse
import com.thealvistar.iotconnect.device.client.models.TemplateExportResponse
import com.thealvistar.iotconnect.device.client.models.TemplateListResponse
import com.thealvistar.iotconnect.device.client.models.TemplateLookupResponse
import com.thealvistar.iotconnect.device.client.models.TemplatePropertyRequest
import com.thealvistar.iotconnect.device.client.models.TemplateTagListResponse
import com.thealvistar.iotconnect.device.client.models.TemplateTwinResponse
import com.thealvistar.iotconnect.device.client.models.TemplateUpdateRequest
import com.thealvistar.iotconnect.device.client.models.TemplateUpdateResponse
import com.thealvistar.iotconnect.device.client.models.TrustedPartnerLookupResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface TemplateApi {
    /**
     * Get Auth Type
     * &lt;p&gt;This API endpoint returns auth type.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the auth type list loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.
     *
     * @return [Call]<[TrustedPartnerLookupResponse]>
     */
    @GET("api/v2/device-template/auth-type")
    fun apiV2DeviceTemplateAuthTypeGet(): Call<TrustedPartnerLookupResponse>

    /**
     * Get datatype list
     * &lt;p&gt;This API endpoint will give you the list of valid datatypes for attributes.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template data type received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @return [Call]<[TemplateDataTypeResponse]>
     */
    @GET("api/v2/device-template/datatype")
    fun apiV2DeviceTemplateDatatypeGet(): Call<TemplateDataTypeResponse>

    /**
     * Get datatype list
     * &lt;p&gt;This API endpoint will give you the list of valid datatypes for attributes.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template data type received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param templateGuid
     * @return [Call]<[TemplateDataTypeResponse]>
     */
    @GET("api/v2/device-template/datatype/{templateGuid}")
    fun apiV2DeviceTemplateDatatypeTemplateGuidGet(@Path("templateGuid") templateGuid: java.util.UUID): Call<TemplateDataTypeResponse>

    /**
     * Get device notification list
     * &lt;p&gt;This API endpoint will give you the device notification list. Whenever a rule matches for the device, the notifications will be generated.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device notification list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param uniqueId Device UniqueId (optional)
     * @param entityGuid Entity Guid (optional)
     * @param startDate Start Date, format should be yyyy-MM-dd (optional)
     * @param endDate End Date, format should be yyyy-MM-dd (optional)
     * @param parentDeviceUniqueId Gateway Device UniqueId (optional)
     * @return [Call]<[TemplateDeviceNotificationResponse]>
     */
    @GET("api/v2/device-template/device/notification")
    fun apiV2DeviceTemplateDeviceNotificationGet(
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("uniqueId") uniqueId: kotlin.String? = null,
        @Query("entityGuid") entityGuid: java.util.UUID? = null,
        @Query("startDate") startDate: kotlin.String? = null,
        @Query("endDate") endDate: kotlin.String? = null,
        @Query("parentDeviceUniqueId") parentDeviceUniqueId: kotlin.String? = null,
    ): Call<TemplateDeviceNotificationResponse>

    /**
     * Get all the details of single device template
     * &lt;p&gt;By using this API endpoint, get all the details for given device template guid along with attribute, command and setting details.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template details received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template not found, invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @param attrTree  (optional)
     * @return [Call]<[TemplateDetailResponse]>
     */
    @GET("api/v2/device-template/{deviceTemplateGuid}")
    fun apiV2DeviceTemplateDeviceTemplateGuidGet(
        @Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID,
        @Query("attrTree") attrTree: kotlin.Boolean? = null,
    ): Call<TemplateDetailResponse>

    /**
     * Get JSON view of the device template
     * &lt;p&gt;This API endpoint will give you the JSON view lookup of attribute, command and setting details for given device template guid.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template lookup received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @return [Call]<[TemplateDetailLookupResponse]>
     */
    @GET("api/v2/device-template/{deviceTemplateGuid}/lookup")
    fun apiV2DeviceTemplateDeviceTemplateGuidLookupGet(@Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID): Call<TemplateDetailLookupResponse>

    /**
     * Get all the tags of a device template
     * &lt;p&gt;Get the list of all available tags in template for given device template guid using this API endpoint.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template's tag lookup received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param deviceTemplate Device Template Guid/Code
     * @param isSolutionTemplate Pass true if code for solution template (optional, default to false)
     * @return [Call]<[TemplateTagListResponse]>
     */
    @GET("api/v2/device-template/{deviceTemplate}/tag-lookup")
    fun apiV2DeviceTemplateDeviceTemplateTagLookupGet(
        @Path("deviceTemplate") deviceTemplate: kotlin.String,
        @Query("isSolutionTemplate") isSolutionTemplate: kotlin.Boolean? = false,
    ): Call<TemplateTagListResponse>

    /**
     * Get device template list
     * &lt;p&gt;Get the list of available device templates of your company using this API endpoint.&lt;/p&gt;  &lt;p&gt;Though filters are optional, you can add them as given in the parameters. To apply the filters, you need to pass these filters in query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param sortBy Sort by name and order, Eg: name asc (optional)
     * @param authType Authentication Type - 1: Key, 2: CA Signed Certificate, 3: Self Signed Certificate, 4: TPM, 5: Symmetric Key (optional)
     * @param edgeSupport Pass value as true to get only edge templates (optional)
     * @param gatewaySupport Pass value as true to get only gateway templates (optional)
     * @param deviceCount Filter for device count (optional)
     * @param ruleCount Filter for rule count (optional)
     * @param attributeCount Filter for attribute count (optional)
     * @param twinPropertyCount Filter for twin property count (optional)
     * @param commandCount Filter for Command count (optional)
     * @param deviceTemplateName Search with device template name (optional)
     * @param isLowBandwidth Pass value as true to get only low bandwidth templates (optional)
     * @param isIotEdgeEnable Pass value as true to get only iotedgeenable templates (optional)
     * @param directMethodCount Filter for direct method count (optional)
     * @param isSphere Pass value as true to get only sphere templates (optional)
     * @param messageVersion Filter for Message Type (optional)
     * @return [Call]<[TemplateListResponse]>
     */
    @GET("api/v2/device-template")
    fun apiV2DeviceTemplateGet(
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("AuthType") authType: kotlin.String? = null,
        @Query("EdgeSupport") edgeSupport: kotlin.String? = null,
        @Query("GatewaySupport") gatewaySupport: kotlin.String? = null,
        @Query("DeviceCount") deviceCount: kotlin.String? = null,
        @Query("RuleCount") ruleCount: kotlin.String? = null,
        @Query("AttributeCount") attributeCount: kotlin.String? = null,
        @Query("TwinPropertyCount") twinPropertyCount: kotlin.String? = null,
        @Query("CommandCount") commandCount: kotlin.String? = null,
        @Query("DeviceTemplateName") deviceTemplateName: kotlin.String? = null,
        @Query("IsLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
        @Query("DirectMethodCount") directMethodCount: kotlin.String? = null,
        @Query("IsSphere") isSphere: kotlin.Boolean? = null,
        @Query("MessageVersion") messageVersion: kotlin.String? = null,
    ): Call<TemplateListResponse>

    /**
     * Get device template list lookup
     * &lt;p&gt;This API endpoint will also give you the list of available device templates in your company. However, it provides an option to filter the list based on attributes availability. If you pass &lt;i&gt;true&lt;/i&gt; in &lt;i&gt;hasAttribute&lt;/i&gt; parameter, it will give you the list of device templates with at least one attribute.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template lookup received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param hasAttribute For templates with at least one attribute, Pass true (optional)
     * @param excludePushUrl For templates without pushUrl, Pass true (optional)
     * @param hasFirmware For templates which are associated with firmware, Pass true (optional, default to true)
     * @param firmwareGuid For firmware&#39;s template detail, Pass firmware guid (optional)
     * @param isEdge IsEdge : Pass value as true to get only edge templates (optional)
     * @param isGateway IsGateway : Pass value as true to get only gateway templates (optional)
     * @param isLowBandwidth IsLowBandwidth : Pass value as true to get only low bandwidth templates (optional)
     * @param isIotEdgeEnable  (optional)
     * @param isSphere  (optional)
     * @return [Call]<[TemplateLookupResponse]>
     */
    @GET("api/v2/device-template/lookup")
    fun apiV2DeviceTemplateLookupGet(
        @Query("hasAttribute") hasAttribute: kotlin.Boolean? = null,
        @Query("excludePushUrl") excludePushUrl: kotlin.Boolean? = null,
        @Query("hasFirmware") hasFirmware: kotlin.Boolean? = true,
        @Query("firmwareGuid") firmwareGuid: java.util.UUID? = null,
        @Query("isEdge") isEdge: kotlin.Boolean? = null,
        @Query("isGateway") isGateway: kotlin.Boolean? = null,
        @Query("isLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
        @Query("isSphere") isSphere: kotlin.Boolean? = null,
    ): Call<TemplateLookupResponse>

    /**
     * Get Trusted Partner
     * &lt;p&gt;This API endpoint returns trusted partner.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the trusted partner list loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.
     *
     * @return [Call]<[TrustedPartnerLookupResponse]>
     */
    @GET("api/v2/device-template/lookup/trusted-partners")
    fun apiV2DeviceTemplateLookupTrustedPartnersGet(): Call<TrustedPartnerLookupResponse>

    /**
     * Get Templates which have twins.
     * &lt;p&gt;This API endpoint returns template list which have twins.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template list loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template not found, invalid logged user or company.
     *
     * @return [Call]<[TemplateTwinResponse]>
     */
    @GET("api/v2/device-template/lookup/twin")
    fun apiV2DeviceTemplateLookupTwinGet(): Call<TemplateTwinResponse>

    /**
     * Add new Device Template
     * &lt;p&gt;To manage devices and their associated properties, one needs a pre-defined structure. A device template provides that structure by allowing you to create attributes, settings, properties, rules, commands and much more – all to help you to monitor and manage your device management system efficiently.&lt;/p&gt;  &lt;p&gt;By using the API endpoint of the device template, you can also create gateway supported device templates. To do that, enter &lt;i&gt;tag&lt;/i&gt; parameter value in the request body. You can manage gateways in the same way as any other device of your device management system. you can also create lowbandwidth supported device templates. To do that, enter &lt;i&gt;datalength&lt;/i&gt; parameter value in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template is created successfully and returns created device template guid.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template name already exists, device template code already exists, firmware not exists, firmware not released   and invalid logged user or company.
     *
     * @param templateCreateRequest Json object used as input (optional)
     * @return [Call]<[TemplateCreateResponse]>
     */
    @POST("api/v2/device-template")
    fun apiV2DeviceTemplatePost(@Body templateCreateRequest: TemplateCreateRequest? = null): Call<TemplateCreateResponse>

    /**
     * Add quick Device Template
     * &lt;p&gt;To create a device template with attributes, use this API endpoint. By using provided JSON format in request format, you can add a device template quickly.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template is created successfully and returns created device template guid.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template name already exists, device template code already exists, data type not found  and invalid logged user or company.
     *
     * @param file  (optional)
     * @param templateJSON  (optional)
     * @return [Call]<[TemplateCreateQuickResponse]>
     */
    @Multipart
    @POST("api/v2/device-template/quick")
    fun apiV2DeviceTemplateQuickPost(
        @Part file: MultipartBody.Part? = null,
        @Part("TemplateJSON") templateJSON: kotlin.String? = null,
    ): Call<TemplateCreateQuickResponse>

    /**
     * Get all the details of single device template using template code
     * &lt;p&gt;By using this API endpoint, get all the details for given device template code along with attribute, command and setting details.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template details received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template not found, invalid logged user or company.
     *
     * @param templateCode Device Template Code
     * @return [Call]<[TemplateDetailResponse]>
     */
    @GET("api/v2/device-template/template-code/{templateCode}")
    fun apiV2DeviceTemplateTemplateCodeTemplateCodeGet(@Path("templateCode") templateCode: kotlin.String): Call<TemplateDetailResponse>

    /**
     * Delete device template
     * &lt;p&gt;To delete a device template, use this API endpoint. To do that, you need to pass a device template guid that you want to delete.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template is deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template not found, device template can not delete due to device template associated with device or rule or firmware   and invalid logged user or company.
     *
     * @param templateGuid Device Template Guid
     * @return [Call]<[TemplateDeleteResponse]>
     */
    @DELETE("api/v2/device-template/{templateGuid}")
    fun apiV2DeviceTemplateTemplateGuidDelete(@Path("templateGuid") templateGuid: java.util.UUID): Call<TemplateDeleteResponse>

    /**
     * Export Template
     * &lt;p&gt;This API endpoint will export the template details along with template attributes in JSON format for given device template guid. This can be used for adding quick device template API endpoint.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template data exported successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template not found, invalid logged user or company.
     *
     * @param templateGuid Device Template Guid
     * @return [Call]<[TemplateExportResponse]>
     */
    @GET("api/v2/device-template/{templateGuid}/export")
    fun apiV2DeviceTemplateTemplateGuidExportGet(@Path("templateGuid") templateGuid: java.util.UUID): Call<TemplateExportResponse>

    /**
     * Add/Update device template property.
     * &lt;p&gt;To add/update a device template property, use this API endpoint. You can only update description, data frequency and file support device template.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template is updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template name already exists, device template not found, data type not found  and invalid logged user or company.
     *
     * @param templateGuid Device Template Guid
     * @param templatePropertyRequest Template update detail in json object (optional)
     * @return [Call]<[TemplateUpdateResponse]>
     */
    @PUT("api/v2/device-template/{templateGuid}/property")
    fun apiV2DeviceTemplateTemplateGuidPropertyPut(
        @Path("templateGuid") templateGuid: java.util.UUID,
        @Body templatePropertyRequest: TemplatePropertyRequest? = null,
    ): Call<TemplateUpdateResponse>

    /**
     * Update device template
     * &lt;p&gt;To update a device template, use this API endpoint. You can only update name, description and firmware hardware version of the device template.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device template is updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template name already exists, device template not found, data type not found  and invalid logged user or company.
     *
     * @param templateGuid Device Template Guid
     * @param templateUpdateRequest Template update detail in json object (optional)
     * @return [Call]<[TemplateUpdateResponse]>
     */
    @PUT("api/v2/device-template/{templateGuid}")
    fun apiV2DeviceTemplateTemplateGuidPut(
        @Path("templateGuid") templateGuid: java.util.UUID,
        @Body templateUpdateRequest: TemplateUpdateRequest? = null,
    ): Call<TemplateUpdateResponse>
}
