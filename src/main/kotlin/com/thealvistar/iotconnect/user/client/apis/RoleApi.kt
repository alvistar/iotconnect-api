package com.thealvistar.iotconnect.user.client.apis

import com.thealvistar.iotconnect.user.client.models.RoleCreateRequest
import com.thealvistar.iotconnect.user.client.models.RoleCreateResponse
import com.thealvistar.iotconnect.user.client.models.RoleDetailResponse
import com.thealvistar.iotconnect.user.client.models.RoleListResponse
import com.thealvistar.iotconnect.user.client.models.RoleListWithUserCountResponse
import com.thealvistar.iotconnect.user.client.models.RoleStatusUpdateV2Request
import com.thealvistar.iotconnect.user.client.models.RoleUpdateRequest
import com.thealvistar.iotconnect.user.client.models.SuccessResponse
import retrofit2.Call
import retrofit2.http.*

interface RoleApi {
    /**
     * Get role list
     * &lt;p&gt;This API endpoint gives you the lookup list of available roles in your company.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that role lookup list is loaded successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @return [Call]<[RoleListResponse]>
     */
    @GET("api/v2/Role/lookup")
    fun apiV2RoleLookupGet(): Call<RoleListResponse>

    /**
     * Add new role
     * &lt;p&gt;When you create a company, the admin role gets created automatically and the company admin user associates with this role.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to create new roles for your company users. A role defines the permissions for users.&lt;/p&gt;  &lt;p&gt;Here, &lt;i&gt;solutions&lt;/i&gt; require the list of solution guids.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that role is created successfully and returns created role guid.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param roleCreateRequest Json object (optional)
     * @return [Call]<[RoleCreateResponse]>
     */
    @POST("api/v2/Role")
    fun apiV2RolePost(@Body roleCreateRequest: RoleCreateRequest? = null): Call<RoleCreateResponse>

    /**
     * Delete a role
     * &lt;p&gt;This API endpoint allows you to delete a role. For that, you need to send &lt;i&gt;roleGuid&lt;/i&gt; in request url. This will not allow you to remove if the role is associated with any user.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that role is deleted successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param roleGuid Guid of Role which needs to be deleted
     * @return [Call]<[SuccessResponse]>
     */
    @DELETE("api/v2/Role/{roleGuid}")
    fun apiV2RoleRoleGuidDelete(@Path("roleGuid") roleGuid: java.util.UUID): Call<SuccessResponse>

    /**
     * Get single role details
     * &lt;p&gt;This API endpoint provides you a detailed description of a role. For that, you need to send &lt;i&gt;roleGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that role details are loaded successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param roleGuid Role Guid
     * @return [Call]<[RoleDetailResponse]>
     */
    @GET("api/v2/Role/{roleGuid}")
    fun apiV2RoleRoleGuidGet(@Path("roleGuid") roleGuid: java.util.UUID): Call<RoleDetailResponse>

    /**
     * Update a role
     * &lt;p&gt;This API endpoint is used to update a role. For that, you need to send &lt;i&gt;roleGuid&lt;/i&gt; in request url and updated role details in the request body.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that role is updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param roleGuid Guid of Role which needs to be updated
     * @param roleUpdateRequest Json object (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/Role/{roleGuid}")
    fun apiV2RoleRoleGuidPut(
        @Path("roleGuid") roleGuid: java.util.UUID,
        @Body roleUpdateRequest: RoleUpdateRequest? = null,
    ): Call<SuccessResponse>

    /**
     * Update role status
     * &lt;p&gt;This API endpoint allows you to update the active status of a role. For that, you need to send &lt;i&gt;roleGuid&lt;/i&gt; in request url. This will not allow you to change active status if the role is associated with any user.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that role active status is updated successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param roleGuid Guid of Role for which active status needs to be updated
     * @param roleStatusUpdateV2Request Active status. send active/inactive (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/Role/{roleGuid}/status")
    fun apiV2RoleRoleGuidStatusPut(
        @Path("roleGuid") roleGuid: java.util.UUID,
        @Body roleStatusUpdateV2Request: RoleStatusUpdateV2Request? = null,
    ): Call<SuccessResponse>

    /**
     * Get role list with user count
     * &lt;p&gt;Using this API endpoint, you can get the list of available roles in your company along with associated users count.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that role list is loaded successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param pageNumber To fetch specific page data. eg: 2 (optional)
     * @param pageSize To define number of records in single page. eg: 25 (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. eg: name asc (optional)
     * @param name Role Name (optional)
     * @param status status like active,inactive or both (optional)
     * @param usercount  (optional)
     * @return [Call]<[RoleListWithUserCountResponse]>
     */
    @GET("api/v2/Role/role-user")
    fun apiV2RoleRoleUserGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("Name") name: kotlin.String? = null,
        @Query("Status") status: kotlin.String? = null,
        @Query("Usercount") usercount: kotlin.String? = null,
    ): Call<RoleListWithUserCountResponse>
}
