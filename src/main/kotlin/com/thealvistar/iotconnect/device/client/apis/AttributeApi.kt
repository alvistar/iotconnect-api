package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.AttributeCreateRequest
import com.thealvistar.iotconnect.device.client.models.AttributeCreateResponse
import com.thealvistar.iotconnect.device.client.models.AttributeDeleteResponse
import com.thealvistar.iotconnect.device.client.models.AttributeListResponse
import com.thealvistar.iotconnect.device.client.models.AttributeLookupResponse
import com.thealvistar.iotconnect.device.client.models.AttributeUpdateRequest
import com.thealvistar.iotconnect.device.client.models.AttributeUpdateSequenceRequest
import com.thealvistar.iotconnect.device.client.models.AttributeUpdateSequenceResponse
import com.thealvistar.iotconnect.device.client.models.SuccessResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface AttributeApi {
    /**
     * Delete a template attribute
     * &lt;p&gt;This API endpoint allows you to delete a device template attribute. For that, you need to send &lt;i&gt;attributeGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the template attribute deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  An attribute doesn't exist, attribute/tag associated with thr device or a rule or command or power BI, at least one attribute required in device template   and invalid logged user or company.
     *
     * @param attributeGuid Template Attribute Guid
     * @return [Call]<[AttributeDeleteResponse]>
     */
    @DELETE("api/v2/template-attribute/{attributeGuid}")
    fun apiV2TemplateAttributeAttributeGuidDelete(@Path("attributeGuid") attributeGuid: java.util.UUID): Call<AttributeDeleteResponse>

    /**
     * Update template attribute
     * &lt;p&gt;This API endpoint allows you to update the details of a device template attribute. For that, you need to send &lt;i&gt;attributeGuid&lt;/i&gt; in request url and attribute update details in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the template attribute updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, attribute doesn't exist, attribute can not update if datatype guid for the object,   attribute name already exists, attribute is associated with the rule, attribute is associated with power BI,   tag is required if the device template has enabled gateway support and invalid logged user or company.
     *
     * @param attributeGuid Template Attribute Guid
     * @param attributeUpdateRequest Attribute update detail json object (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/template-attribute/{attributeGuid}")
    fun apiV2TemplateAttributeAttributeGuidPut(@Path("attributeGuid") attributeGuid: java.util.UUID, @Body attributeUpdateRequest: AttributeUpdateRequest? = null): Call<SuccessResponse>

    /**
     * Update template attribute sequence
     * &lt;p&gt;This API endpoint helps you to update a device template attribute sequence. For that, you need to send &lt;i&gt;attributeGuid&lt;/i&gt; in request url and sequence number in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the template attribute's sequence updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, attribute doesn't exist and invalid logged user or company.
     *
     * @param attributeGuid Template Attribute Guid
     * @param attributeUpdateSequenceRequest Attribute json object (optional)
     * @return [Call]<[AttributeUpdateSequenceResponse]>
     */
    @PUT("api/v2/template-attribute/{attributeGuid}/sequence")
    fun apiV2TemplateAttributeAttributeGuidSequencePut(@Path("attributeGuid") attributeGuid: java.util.UUID, @Body attributeUpdateSequenceRequest: AttributeUpdateSequenceRequest? = null): Call<AttributeUpdateSequenceResponse>

    /**
     * Get template attribute list
     * &lt;p&gt;This API endpoint gives you the list of available template attributes of your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the template attribute list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device temmplate doesn't exist and invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param searchtext To search for specific texts in the list. (optional)
     * @param sortBy Sort by name and order. Eg. sequence, sequence asc, sequence desc etc (optional)
     * @param tag Tag (optional)
     * @return [Call]<[AttributeListResponse]>
     */
    @GET("api/v2/template-attribute/{deviceTemplateGuid}")
    fun apiV2TemplateAttributeDeviceTemplateGuidGet(@Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID, @Query("pageSize") pageSize: kotlin.Int? = null, @Query("pageNumber") pageNumber: kotlin.Int? = null, @Query("searchtext") searchtext: kotlin.String? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("tag") tag: kotlin.String? = null): Call<AttributeListResponse>

    /**
     * Get device template attribute lookup
     * &lt;p&gt;This API endpoint provides you the lookup list of available template attributes in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the template attribute lookup received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device temmplate doesn't exist and invalid logged user or company.
     *
     * @param deviceTemplateGuid Device Template Guid
     * @return [Call]<[AttributeLookupResponse]>
     */
    @GET("api/v2/template-attribute/{deviceTemplateGuid}/lookup")
    fun apiV2TemplateAttributeDeviceTemplateGuidLookupGet(@Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID): Call<AttributeLookupResponse>

    /**
     * Add new template attribute
     * &lt;p&gt;This API endpoint allows you to create device template attributes. Attributes will be defined in your device template. One template can have one or more attributes. Your IoT devices will send the data for these template attributes.&lt;/p&gt;  &lt;p&gt;Here, &lt;i&gt;localName&lt;/i&gt; and &lt;i&gt;datatype&lt;/i&gt; are mandatory for any attribute, while a tag is mandatory for gateway supported templates only. The datatype of your attribute is predefined. If you select object datatype, you will be able to add child attributes for that attribute. Data validation allows you to set data numChar or specific data for attribute values.&lt;/p&gt;  &lt;p&gt;For Edge Enabled device, template must contain at least one attribute with datatype &#39;Number&#39; to send data to Hub.&lt;/p&gt;  &lt;p&gt;For Lowbandwidth Enabled device, template attribute must required startIndex and numChar.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the template attribute created successfully and returns created attribute guid.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, tag is required if the device template has enabled gateway support, attribute name already exists,   and invalid logged user or company.
     *
     * @param attributeCreateRequest Json object (optional)
     * @return [Call]<[AttributeCreateResponse]>
     */
    @POST("api/v2/template-attribute")
    fun apiV2TemplateAttributePost(@Body attributeCreateRequest: AttributeCreateRequest? = null): Call<AttributeCreateResponse>
}
