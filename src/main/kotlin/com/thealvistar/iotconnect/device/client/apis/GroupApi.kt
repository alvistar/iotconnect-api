package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.GroupCreateRequest
import com.thealvistar.iotconnect.device.client.models.GroupCreateResponse
import com.thealvistar.iotconnect.device.client.models.GroupDeleteResponse
import com.thealvistar.iotconnect.device.client.models.GroupDeviceCreateRequest
import com.thealvistar.iotconnect.device.client.models.GroupDeviceCreateResponse
import com.thealvistar.iotconnect.device.client.models.GroupDeviceDeleteResponse
import com.thealvistar.iotconnect.device.client.models.GroupDeviceListResponse
import com.thealvistar.iotconnect.device.client.models.GroupGetResponse
import com.thealvistar.iotconnect.device.client.models.GroupListResponse
import com.thealvistar.iotconnect.device.client.models.GroupLookupResponse
import com.thealvistar.iotconnect.device.client.models.GroupTypeListResponse
import com.thealvistar.iotconnect.device.client.models.GroupUpdateRequest
import com.thealvistar.iotconnect.device.client.models.GroupUpdateResponse
import com.thealvistar.iotconnect.device.client.models.GroupUserCreateRequest
import com.thealvistar.iotconnect.device.client.models.GroupUserCreateResponse
import com.thealvistar.iotconnect.device.client.models.GroupUserDeleteResponse
import com.thealvistar.iotconnect.device.client.models.GroupUserUpdateRequest
import com.thealvistar.iotconnect.device.client.models.GroupUserUpdateResponse
import com.thealvistar.iotconnect.device.client.models.GroupUsersListResponse
import retrofit2.Call
import retrofit2.http.*

interface GroupApi {
    /**
     * Add devices in a group
     * &lt;p&gt;This API endpoint allows you to add multiple devices in a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; with &lt;i&gt;deviceGuid&lt;/i&gt; list in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device added in group successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist, device doesn't exist, device already exists in group and invalid logged user or company.
     *
     * @param groupDeviceCreateRequest Json object (optional)
     * @return [Call]<[GroupDeviceCreateResponse]>
     */
    @POST("api/v2/Group/device")
    fun apiV2GroupDevicePost(@Body groupDeviceCreateRequest: GroupDeviceCreateRequest? = null): Call<GroupDeviceCreateResponse>

    /**
     * Get group list
     * &lt;p&gt;This API endpoint provides you the list of available groups along with their active status as well as devices count and users count.&lt;/p&gt;  &lt;p&gt;You can also add filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name (optional)
     * @param isSphere To filter sphere device group only (optional, default to false)
     * @return [Call]<[GroupListResponse]>
     */
    @GET("api/v2/Group")
    fun apiV2GroupGet(
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("searchText") searchText: kotlin.String? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("isSphere") isSphere: kotlin.Boolean? = false,
    ): Call<GroupListResponse>

    /**
     * Delete a group
     * &lt;p&gt;This API endpoint allows you to delete a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group deleted successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exists and invalid logged user or company.
     *
     * @param groupGuid Group Guid
     * @return [Call]<[GroupDeleteResponse]>
     */
    @DELETE("api/v2/Group/{groupGuid}")
    fun apiV2GroupGroupGuidDelete(@Path("groupGuid") groupGuid: java.util.UUID): Call<GroupDeleteResponse>

    /**
     * Delete a device from a group
     * &lt;p&gt;This API endpoint allows you to delete a device from the group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; along with &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device deleted from group successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist, device doesn't exist and invalid logged user or company.
     *
     * @param groupGuid Group Guid
     * @param deviceGuid Device Guid
     * @return [Call]<[GroupDeviceDeleteResponse]>
     */
    @DELETE("api/v2/Group/{groupGuid}/device/{deviceGuid}")
    fun apiV2GroupGroupGuidDeviceDeviceGuidDelete(
        @Path("groupGuid") groupGuid: java.util.UUID,
        @Path("deviceGuid") deviceGuid: java.util.UUID,
    ): Call<GroupDeviceDeleteResponse>

    /**
     * Get device list for a group
     * &lt;p&gt;This API endpoint gives you the list of available devices in a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group's device list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist and invalid logged user or company.
     *
     * @param groupGuid Group guid
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: uniqueId asc, uniqueId desc, uniqueId (optional)
     * @return [Call]<[GroupDeviceListResponse]>
     */
    @GET("api/v2/Group/{groupGuid}/device")
    fun apiV2GroupGroupGuidDeviceGet(
        @Path("groupGuid") groupGuid: java.util.UUID,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("searchText") searchText: kotlin.String? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
    ): Call<GroupDeviceListResponse>

    /**
     * Get group detail
     * &lt;p&gt;This API endpoint provides you all the available details of a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group information received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist and invalid logged user or company.
     *
     * @param groupGuid Group Guid
     * @return [Call]<[GroupGetResponse]>
     */
    @GET("api/v2/Group/{groupGuid}")
    fun apiV2GroupGroupGuidGet(@Path("groupGuid") groupGuid: java.util.UUID): Call<GroupGetResponse>

    /**
     * Update group name / Sphere group details
     * &lt;p&gt;This API endpoint allows you to update the group name or sphere group details. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url and group name in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exists, group name already exists and invalid logged user or company.
     *
     * @param groupGuid Group Guid
     * @param groupUpdateRequest Json object (optional)
     * @return [Call]<[GroupUpdateResponse]>
     */
    @PUT("api/v2/Group/{groupGuid}")
    fun apiV2GroupGroupGuidPut(
        @Path("groupGuid") groupGuid: java.util.UUID,
        @Body groupUpdateRequest: GroupUpdateRequest? = null,
    ): Call<GroupUpdateResponse>

    /**
     * Get user list for a group
     * &lt;p&gt;This API endpoint will give you the list of available users in a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group's user permission deleted successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist and invalid logged user or company.
     *
     * @param groupGuid Group Guid
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name (optional)
     * @return [Call]<[GroupUsersListResponse]>
     */
    @GET("api/v2/Group/{groupGuid}/user")
    fun apiV2GroupGroupGuidUserGet(
        @Path("groupGuid") groupGuid: java.util.UUID,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("searchText") searchText: kotlin.String? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
    ): Call<GroupUsersListResponse>

    /**
     * Delete a user from a group
     * &lt;p&gt;This API endpoint allows you to delete a user from the group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; along with &lt;i&gt;userGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group's user permission deleted successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist, user doesn't exist and invalid logged user or company.
     *
     * @param groupGuid Group Guid
     * @param userGuid User Guid
     * @return [Call]<[GroupUserDeleteResponse]>
     */
    @DELETE("api/v2/Group/{groupGuid}/user/{userGuid}")
    fun apiV2GroupGroupGuidUserUserGuidDelete(
        @Path("groupGuid") groupGuid: java.util.UUID,
        @Path("userGuid") userGuid: java.util.UUID,
    ): Call<GroupUserDeleteResponse>

    /**
     * Update user permission in a group
     * &lt;p&gt;This API endpoint allows you to change user’s permissions in your group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; along with &lt;i&gt;userGuid&lt;/i&gt; in request url and permissions in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group's user permission updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist, user doesn't exist, user already exists in group and invalid logged user or company.
     *
     * @param groupGuid Group Guid
     * @param userGuid User Guid
     * @param groupUserUpdateRequest Json Object (optional)
     * @return [Call]<[GroupUserUpdateResponse]>
     */
    @PUT("api/v2/Group/{groupGuid}/user/{userGuid}")
    fun apiV2GroupGroupGuidUserUserGuidPut(
        @Path("groupGuid") groupGuid: java.util.UUID,
        @Path("userGuid") userGuid: java.util.UUID,
        @Body groupUserUpdateRequest: GroupUserUpdateRequest? = null,
    ): Call<GroupUserUpdateResponse>

    /**
     * Get group lookup list
     * &lt;p&gt;This API endpoint provides you the lookup list of available group along with their active status.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param type  (optional)
     * @return [Call]<[GroupLookupResponse]>
     */
    @GET("api/v2/Group/lookup")
    fun apiV2GroupLookupGet(@Query("type") type: kotlin.String? = null): Call<GroupLookupResponse>

    /**
     * Add new group
     * &lt;p&gt;This API endpoint allows you to create a new group. Groups can be of devices or users. You can also add devices and users in the same group. For creating a group, you just need to mention a group name.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group created successfully and returns created group guid.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group name already exists and invalid logged user or company.
     *
     * @param groupCreateRequest Json object (optional)
     * @return [Call]<[GroupCreateResponse]>
     */
    @POST("api/v2/Group")
    fun apiV2GroupPost(@Body groupCreateRequest: GroupCreateRequest? = null): Call<GroupCreateResponse>

    /**
     * Get group type list
     * &lt;p&gt;This API endpoint provides you the list of available group types along with their active status.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group type list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @return [Call]<[GroupTypeListResponse]>
     */
    @GET("api/v2/Group/types")
    fun apiV2GroupTypesGet(): Call<GroupTypeListResponse>

    /**
     * Add users in a group
     * &lt;p&gt;This API endpoint allows you to add multiple users to your group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; with &lt;i&gt;userGuid&lt;/i&gt; list with their permissions in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that group's user permission added successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Group doesn't exist, user doesn't exist, user already exists in group and invalid logged user or company.
     *
     * @param groupUserCreateRequest Json Object (optional)
     * @return [Call]<[GroupUserCreateResponse]>
     */
    @POST("api/v2/Group/user")
    fun apiV2GroupUserPost(@Body groupUserCreateRequest: GroupUserCreateRequest? = null): Call<GroupUserCreateResponse>
}
