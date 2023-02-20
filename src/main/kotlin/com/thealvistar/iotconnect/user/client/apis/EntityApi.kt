package com.thealvistar.iotconnect.user.client.apis

import com.thealvistar.iotconnect.user.client.models.EntityCreateResponse
import com.thealvistar.iotconnect.user.client.models.EntityCreateV2Request
import com.thealvistar.iotconnect.user.client.models.EntityDetailResponse
import com.thealvistar.iotconnect.user.client.models.EntityListResponse
import com.thealvistar.iotconnect.user.client.models.EntityLookupResponse
import com.thealvistar.iotconnect.user.client.models.EntityPropertiesUpdateRequest
import com.thealvistar.iotconnect.user.client.models.EntityUpdateRequest
import com.thealvistar.iotconnect.user.client.models.EntityUpdateResponse
import com.thealvistar.iotconnect.user.client.models.SuccessResponse
import retrofit2.Call
import retrofit2.http.*

interface EntityApi {
    /**
     * Delete an entity
     * &lt;p&gt;This API endpoint allows you to delete an entity. For that, you need to send &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that entity is deleted successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityGuid Guid of Entity which needs to be deleted
     * @return [Call]<[SuccessResponse]>
     */
    @DELETE("api/v2/Entity/{entityGuid}")
    fun apiV2EntityEntityGuidDelete(@Path("entityGuid") entityGuid: java.util.UUID): Call<SuccessResponse>

    /**
     * Get single entity detail
     * &lt;p&gt;This API endpoint gives you a detailed description of any entity of your company. For that, you need to send &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that entity details are loaded successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityGuid Entity Guid
     * @return [Call]<[EntityDetailResponse]>
     */
    @GET("api/v2/Entity/{entityGuid}")
    fun apiV2EntityEntityGuidGet(@Path("entityGuid") entityGuid: java.util.UUID): Call<EntityDetailResponse>

    /**
     * Update custom property value
     * &lt;p&gt;This API endpoint allows you to update custom property values. For that, you need to send &lt;i&gt;entityGuid&lt;/i&gt; in request url along with custom property guid and updated custom property value in the request body.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that custom property is updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityGuid Guid of Entity which needs to be updated
     * @param entityPropertiesUpdateRequest Json object (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/Entity/{entityGuid}/properties")
    fun apiV2EntityEntityGuidPropertiesPut(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Body entityPropertiesUpdateRequest: EntityPropertiesUpdateRequest? = null,
    ): Call<SuccessResponse>

    /**
     * Delete custom property value
     * &lt;p&gt;This API endpoint allows you to delete a custom property value for an entity. For that, you need to send &lt;i&gt;entityGuid&lt;/i&gt; and &lt;i&gt;customPropertyGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that custom property is deleted successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityGuid Guid of Entity which needs to be updated
     * @param propertyGuid Guid of property which needs to be deleted from entity
     * @return [Call]<[SuccessResponse]>
     */
    @DELETE("api/v2/Entity/{entityGuid}/property/{propertyGuid}")
    fun apiV2EntityEntityGuidPropertyPropertyGuidDelete(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Path("propertyGuid") propertyGuid: java.util.UUID,
    ): Call<SuccessResponse>

    /**
     * Update an entity
     * &lt;p&gt;To update entity name, location details, or a parent-child architecture relationship, use this API endpoint. You need to send &lt;i&gt;entityGuid&lt;/i&gt; in request url and updated entity details in the request body.&lt;/p&gt;  &lt;p&gt;Here, you even have an option to set an existing user as the owner of the entity. For that, you need to send a user guid in &lt;i&gt;ownerUserGuid&lt;/i&gt; parameter. To arrange a new user as an entity owner, you need to send user details in the &lt;i&gt;userInfo&lt;/i&gt; parameter.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that entity is updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityGuid Guid of Entity which needs to be updated
     * @param entityUpdateRequest Json object (optional)
     * @return [Call]<[EntityUpdateResponse]>
     */
    @PUT("api/v2/Entity/{entityGuid}")
    fun apiV2EntityEntityGuidPut(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Body entityUpdateRequest: EntityUpdateRequest? = null,
    ): Call<EntityUpdateResponse>

    /**
     * Get entity list
     * &lt;p&gt;Get a list of available entities of your company using this API endpoint.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that entity list is loaded successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @return [Call]<[EntityListResponse]>
     */
    @GET("api/v2/Entity")
    fun apiV2EntityGet(): Call<EntityListResponse>

    /**
     * Get entity lookup list
     * &lt;p&gt;This API endpoint allows you to get the lookup list of available entities in your company.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that entity lookup list is loaded successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @return [Call]<[EntityLookupResponse]>
     */
    @GET("api/v2/Entity/lookup")
    fun apiV2EntityLookupGet(): Call<EntityLookupResponse>

    /**
     * Add new entity
     * &lt;p&gt;An entity in IoTConnect is the company/location-based hierarchy where users can manage different entities/companies under which several devices and users can be managed. The entity facilitates a user to control multiple sub-companies under a parent company. When you create a company, an entity gets created automatically, which is considered as a parent entity of your company.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to add new entities for your company. Such new entities get their place under a parent entity. Here name, &lt;i&gt;parentEntityGuid, address, city, countryGuid, stateGuid&lt;/i&gt; are mandatory. If you opt to create an entity owner, &lt;i&gt;firstName, lastName, userId, roleGuid, timeZoneGuid&lt;/i&gt; are mandatory.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that entity is created successfully and returns created entity guid.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityCreateV2Request Json object (optional)
     * @return [Call]<[EntityCreateResponse]>
     */
    @POST("api/v2/Entity")
    fun apiV2EntityPost(@Body entityCreateV2Request: EntityCreateV2Request? = null): Call<EntityCreateResponse>
}
