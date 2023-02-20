package com.thealvistar.iotconnect.user.client.apis

import com.thealvistar.iotconnect.user.client.models.AnnouncementDetailResponse
import com.thealvistar.iotconnect.user.client.models.AnnouncementRequest
import com.thealvistar.iotconnect.user.client.models.AnnouncementResponse
import com.thealvistar.iotconnect.user.client.models.ChangePasswordRequest
import com.thealvistar.iotconnect.user.client.models.ForgotPasswordRequest
import com.thealvistar.iotconnect.user.client.models.PreferenceUpdateRequest
import com.thealvistar.iotconnect.user.client.models.ResendResetPasswordRequest
import com.thealvistar.iotconnect.user.client.models.ResetPasswordRequest
import com.thealvistar.iotconnect.user.client.models.SuccessResponse
import com.thealvistar.iotconnect.user.client.models.UserAvailabilityUsingEmailResponse
import com.thealvistar.iotconnect.user.client.models.UserBulkUploadResponse
import com.thealvistar.iotconnect.user.client.models.UserChangePasswordResponse
import com.thealvistar.iotconnect.user.client.models.UserCountValueResponse
import com.thealvistar.iotconnect.user.client.models.UserCreateResponse
import com.thealvistar.iotconnect.user.client.models.UserCreateV2Request
import com.thealvistar.iotconnect.user.client.models.UserDeleteResponse
import com.thealvistar.iotconnect.user.client.models.UserForgetPasswordResponse
import com.thealvistar.iotconnect.user.client.models.UserGetListResponse
import com.thealvistar.iotconnect.user.client.models.UserIdentityResponse
import com.thealvistar.iotconnect.user.client.models.UserListByEntityResponse
import com.thealvistar.iotconnect.user.client.models.UserLookupResponse
import com.thealvistar.iotconnect.user.client.models.UserPreferenceListResponse
import com.thealvistar.iotconnect.user.client.models.UserPreferenceUpdateResponse
import com.thealvistar.iotconnect.user.client.models.UserPropertiesUpdateRequest
import com.thealvistar.iotconnect.user.client.models.UserPropertyDeleteResponse
import com.thealvistar.iotconnect.user.client.models.UserPropertyUpdateResponse
import com.thealvistar.iotconnect.user.client.models.UserResetPasswordResponse
import com.thealvistar.iotconnect.user.client.models.UserResponse
import com.thealvistar.iotconnect.user.client.models.UserSearchRequest
import com.thealvistar.iotconnect.user.client.models.UserSearchResponse
import com.thealvistar.iotconnect.user.client.models.UserStatusChangeV2Request
import com.thealvistar.iotconnect.user.client.models.UserUpdateRequest
import com.thealvistar.iotconnect.user.client.models.UserUpdateResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface UserApi {
    /**
     * Get user list by entity
     * &lt;p&gt;This API endpoint gives you the list of users under a given entity in your company. For that, you need to send &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user list is loaded successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityGuid Entity Guid
     * @param roleGuid Role Guid (optional)
     * @param pageNumber To fetch specific page data. eg: 2 (optional)
     * @param pageSize To define number of records in single page. eg: 25 (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. eg: firstName asc, lastName desc, roleName, entityName, userid, updatedDate, isActive asc (optional)
     * @param isActiveUser  (optional)
     * @param firstName User&#39;s First Name (optional)
     * @param lastName User&#39;s Last Name (optional)
     * @param email User&#39;s Email Id (optional)
     * @param contactNo User&#39;s Contact Number (optional)
     * @param role User&#39;s Role (optional)
     * @param entity User&#39;s Entity (optional)
     * @param status User&#39;s Active Status (optional)
     * @return [Call]<[UserListByEntityResponse]>
     */
    @GET("api/v2/entity/{entityGuid}/user")
    fun apiV2EntityEntityGuidUserGet(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Query("roleGuid") roleGuid: java.util.UUID? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("isActiveUser") isActiveUser: kotlin.Boolean? = null,
        @Query("FirstName") firstName: kotlin.String? = null,
        @Query("LastName") lastName: kotlin.String? = null,
        @Query("Email") email: kotlin.String? = null,
        @Query("ContactNo") contactNo: kotlin.String? = null,
        @Query("Role") role: kotlin.String? = null,
        @Query("Entity") entity: kotlin.String? = null,
        @Query("Status") status: kotlin.String? = null,
    ): Call<UserListByEntityResponse>

    /**
     * Import users in batch
     * &lt;p&gt;This API endpoint allows you to create users in bulk for a given entity guid. For that, you need to upload a CSV file in &lt;i&gt;userFile&lt;/i&gt; parameter, containing a list of users that you want to create under the given entity.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user batch is imported successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param entityGuid Entity Guid. All users will be created under this entity.
     * @param userFile Json file as per the file sample provided. Please download sample files form your IoTConnect Account.Upload a file containing a list of users to import.
     * @param sendInvitationEmail To receive invitation email from IDS (optional)
     * @return [Call]<[UserBulkUploadResponse]>
     */
    @Multipart
    @POST("api/v2/entity/{entityGuid}/user-import")
    fun apiV2EntityEntityGuidUserImportPost(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Part userFile: MultipartBody.Part,
        @Part("SendInvitationEmail") sendInvitationEmail: kotlin.Boolean? = null,
    ): Call<UserBulkUploadResponse>

    /**
     * Get user list by role
     * &lt;p&gt;This API endpoint provides you the list of users associated with a given role in your company. For that, you need to send &lt;i&gt;roleGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user list is loaded successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param roleGuid Role Guid
     * @param pageNumber To fetch specific page data. eg: 2 (optional)
     * @param pageSize To define number of records in single page. eg: 25 (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. eg: firstName asc, lastName desc, roleName, entityName, userid, isActive, updatedDate asc (optional)
     * @param firstName User&#39;s First Name (optional)
     * @param lastName User&#39;s Last Name (optional)
     * @param email User&#39;s Email Id (optional)
     * @param contactNo User&#39;s Contact Number (optional)
     * @param role User&#39;s Role (optional)
     * @param entity User&#39;s Entity (optional)
     * @param status User&#39;s Active Status (optional)
     * @return [Call]<[UserListByEntityResponse]>
     */
    @GET("api/v2/role/{roleGuid}/user")
    fun apiV2RoleRoleGuidUserGet(
        @Path("roleGuid") roleGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("FirstName") firstName: kotlin.String? = null,
        @Query("LastName") lastName: kotlin.String? = null,
        @Query("Email") email: kotlin.String? = null,
        @Query("ContactNo") contactNo: kotlin.String? = null,
        @Query("Role") role: kotlin.String? = null,
        @Query("Entity") entity: kotlin.String? = null,
        @Query("Status") status: kotlin.String? = null,
    ): Call<UserListByEntityResponse>

    /**
     * Get user&#39;s announcement list
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @return [Call]<[AnnouncementDetailResponse]>
     */
    @GET("api/v2/User/announcement")
    fun apiV2UserAnnouncementGet(): Call<AnnouncementDetailResponse>

    /**
     *
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @param announcementRequest  (optional)
     * @return [Call]<[AnnouncementResponse]>
     */
    @POST("api/v2/User/announcement")
    fun apiV2UserAnnouncementPost(@Body announcementRequest: AnnouncementRequest? = null): Call<AnnouncementResponse>

    /**
     * Change password
     * &lt;p&gt;This API endpoint allows you to change the user’s login password. For that, you need to send the user’s login email id, old password and new password in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the user password is changed successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Old password doesn't match, Company doesn't exist, User is not valid etc.
     *
     * @param changePasswordRequest Json object (optional)
     * @return [Call]<[UserChangePasswordResponse]>
     */
    @POST("api/v2/User/change-password")
    fun apiV2UserChangePasswordPost(@Body changePasswordRequest: ChangePasswordRequest? = null): Call<UserChangePasswordResponse>

    /**
     * Get user count
     * &lt;p&gt;This API endpoint gives you the count of available users in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string. &lt;i&gt;companyGuid&lt;/i&gt; parameter is used to get the list of users for a given company guid. The status parameter is used to get the list of users based on their active status.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user count is received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param companyGuid Company Guid (optional)
     * @param status To get user count based on user active status. &lt;i&gt;active&lt;/i&gt; : To get active user count, &lt;i&gt;inactive&lt;/i&gt; : To get inactive user count. (optional)
     * @return [Call]<[UserCountValueResponse]>
     */
    @GET("api/v2/User/count")
    fun apiV2UserCountGet(
        @Query("companyGuid") companyGuid: java.util.UUID? = null,
        @Query("status") status: kotlin.String? = null,
    ): Call<UserCountValueResponse>

    /**
     * Get user availability
     * &lt;p&gt;This API endpoint provides you the user’s availability details. For that, you need to send a user login email id in request url. If a user is available, it will give the user details.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user is available and returns user detail.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist etc.
     *
     * @param email User&#39;s Login Email Id
     * @return [Call]<[UserAvailabilityUsingEmailResponse]>
     */
    @GET("api/v2/User/{email}/availability")
    fun apiV2UserEmailAvailabilityGet(@Path("email") email: kotlin.String): Call<UserAvailabilityUsingEmailResponse>

    /**
     * Forgot password
     * &lt;p&gt;When you forget your password, you need to reset. For that, you need an invitation link that takes you to reset password page to change the password.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to send an invitation link to reset your password. For that, you need to send your login email id. It sends you an invitation link on your login email id. By using that url, you will be able to reset your password.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that email has been sent successfully to reset the password.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist etc.
     *
     * @param forgotPasswordRequest Json object (optional)
     * @return [Call]<[UserForgetPasswordResponse]>
     */
    @POST("api/v2/User/forgot-password")
    fun apiV2UserForgotPasswordPost(@Body forgotPasswordRequest: ForgotPasswordRequest? = null): Call<UserForgetPasswordResponse>

    /**
     * Get user list
     * &lt;p&gt;This API endpoint provides you the list of users in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user list is loaded successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param pageNumber To fetch specific page data. eg: 2 (optional)
     * @param pageSize To define number of records in single page. eg: 25 (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. eg: firstName asc, lastName desc, roleName, entityName, userid, updatedDate, isActive (optional)
     * @param firstName  (optional)
     * @param lastName  (optional)
     * @param email  (optional)
     * @param contactNo  (optional)
     * @param role  (optional)
     * @param entity  (optional)
     * @param status  (optional)
     * @return [Call]<[UserGetListResponse]>
     */
    @GET("api/v2/User")
    fun apiV2UserGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("FirstName") firstName: kotlin.String? = null,
        @Query("LastName") lastName: kotlin.String? = null,
        @Query("Email") email: kotlin.String? = null,
        @Query("ContactNo") contactNo: kotlin.String? = null,
        @Query("Role") role: kotlin.String? = null,
        @Query("Entity") entity: kotlin.String? = null,
        @Query("Status") status: kotlin.String? = null,
    ): Call<UserGetListResponse>

    /**
     * logged in user detail
     * &lt;p&gt;This API endpoint provides you the currently logged in user’s details.&lt;/p&gt;  &lt;p&gt;Here, along with user details, you can also access the user’s permission details. The information can help you to know that users can access which modules with what permissions, such as a view or operate. For that, you need to send true in query string parameter &lt;i&gt;permissions&lt;/i&gt;.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user details are loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param permissions &lt;i&gt;true&lt;/i&gt; : to include logged-in user&#39;s permissions detail, &lt;i&gt;false&lt;/i&gt; : to exclude permissions detail. By default permissions detail will be excluded. (optional)
     * @param includeConfigSettings Send true to get configuration settings (optional)
     * @return [Call]<[UserIdentityResponse]>
     */
    @GET("api/v2/User/identity")
    fun apiV2UserIdentityGet(
        @Query("permissions") permissions: kotlin.Boolean? = null,
        @Query("includeConfigSettings") includeConfigSettings: kotlin.Boolean? = null,
    ): Call<UserIdentityResponse>

    /**
     * Get user lookup list
     * &lt;p&gt;This API endpoint gives you the lookup list of users in your company.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user lookup list is loaded successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param isEntityUser To fetch the users available in logged in user&#39;s entity (includes child entity users as well).  &lt;i&gt;true&lt;/i&gt;: to fetch only entity users, &lt;i&gt;false&lt;/i&gt;: to fetch all users. By default it will give all users. (optional)
     * @return [Call]<[UserLookupResponse]>
     */
    @GET("api/v2/User/lookup")
    fun apiV2UserLookupGet(@Query("isEntityUser") isEntityUser: kotlin.Boolean? = null): Call<UserLookupResponse>

    /**
     * Add new user
     * &lt;p&gt;This API endpoint allows you to add new users to your company.&lt;/p&gt;  &lt;p&gt;Here, the &lt;i&gt;properties&lt;/i&gt; parameter is optional. &lt;i&gt;entityGuid&lt;/i&gt; defines that the user belongs to which entity. You can get the list of available entities for your company from Entity API. &lt;i&gt;roleGuid&lt;/i&gt; sets the permissions for a user. You can get the list of roles from Role API.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user is created successfully and returns created user guid.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Duplicate user email id, Entity doesn't exist, Role doesn't exist, Role is not active, User quota has been exceeded, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param userCreateV2Request Json object (optional)
     * @return [Call]<[UserCreateResponse]>
     */
    @POST("api/v2/User")
    fun apiV2UserPost(@Body userCreateV2Request: UserCreateV2Request? = null): Call<UserCreateResponse>

    /**
     * Get user preference details
     * &lt;p&gt;This API endpoint gives you the user preference details for currently logged in users. User preferences show you that whether a user has opted for notifications. And if opted, what type of notifications. It also provides you page size preference and time zone detail.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user preference list is loaded successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @return [Call]<[UserPreferenceListResponse]>
     */
    @GET("api/v2/User/preference")
    fun apiV2UserPreferenceGet(): Call<UserPreferenceListResponse>

    /**
     * Update user preference details
     * &lt;p&gt;When you create a user, default preferences set automatically for that user. Nevertheless, you can update those preferences anytime later.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to update currently logged in user’s preferences details.&lt;/p&gt;  &lt;p&gt;Here, you have an option to opt for notifications like email, sms, push. In case of email notifications, you have a choice whether you want to receive notifications on the primary email address (user’s login id) or secondary email address. If you opt for a secondary email, you need to enter that email address in &lt;i&gt;alternateEmailID&lt;/i&gt; parameter. To change the user’s time zone, you need to send &lt;i&gt;timeZoneGuid&lt;/i&gt; in the parameter. You can also get the list of available time zones from Master API.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user preference is updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, User is not active, Logged in user is not valid etc.
     *
     * @param preferenceUpdateRequest Json object (optional)
     * @return [Call]<[UserPreferenceUpdateResponse]>
     */
    @PUT("api/v2/User/preference")
    fun apiV2UserPreferencePut(@Body preferenceUpdateRequest: PreferenceUpdateRequest? = null): Call<UserPreferenceUpdateResponse>

    /**
     * Reset password
     * &lt;p&gt;This API endpoint allows you to reset your password. For that, you need to send your login email id, invitation guid and your new password. An invitation will be generated at the time of creating a new user and when a user asks to reset the password using the forgot password API. You need that newly generated invitation’s guid in &lt;i&gt;invitationGuid&lt;/i&gt; parameter in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user has reset the password successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist etc.
     *
     * @param resetPasswordRequest Json object (optional)
     * @return [Call]<[UserResetPasswordResponse]>
     */
    @POST("api/v2/User/reset-password")
    fun apiV2UserResetPasswordPost(@Body resetPasswordRequest: ResetPasswordRequest? = null): Call<UserResetPasswordResponse>

    /**
     * Resend reset password link
     * &lt;p&gt;This API endpoint allows you to resend the invitation link to the user’s email id to reset the password. For that, you need to send the user’s login email id in &lt;i&gt;email&lt;/i&gt; parameter in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the user password is reset successfully and an email has been sent to user's email id.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist, User is not active, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param resendResetPasswordRequest Json object (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @POST("api/v2/User/reset-password/resend")
    fun apiV2UserResetPasswordResendPost(@Body resendResetPasswordRequest: ResendResetPasswordRequest? = null): Call<SuccessResponse>

    /**
     * Get user list by role or user id
     * &lt;p&gt;This API endpoint gives you the list of available users in your company based on a given role guid or list of users guid. You can only send either &lt;i&gt;roleGuid&lt;/i&gt; or a list of users guid.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string. The &lt;i&gt;status&lt;/i&gt; parameter is used to get the list of users based on their active status. The &lt;i&gt;property&lt;/i&gt; parameter is used to get the list of users with properties available.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user list is loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Company doesn't exist, Logged in user is not valid etc.
     *
     * @param `property` To include or exclude user properties from list, if any. &lt;i&gt;true&lt;/i&gt; : To include properties, &lt;i&gt;false&lt;/i&gt; : To exclude properties (optional)
     * @param status To get the list of users based on their active status. &lt;i&gt;true&lt;/i&gt; : For active users list, &lt;i&gt;false&lt;/i&gt; : For inactive users list (optional)
     * @param pageNumber To fetch specific page data. eg: 2 (optional)
     * @param pageSize To define number of records in single page. eg: 25 (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. eg: firstName asc (optional)
     * @param userSearchRequest Enter either Role Guids or User Guids (optional)
     * @return [Call]<[UserSearchResponse]>
     */
    @POST("api/v2/User/search")
    fun apiV2UserSearchPost(
        @Query("property") `property`: kotlin.Boolean? = null,
        @Query("status") status: kotlin.Boolean? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("searchText") searchText: kotlin.String? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Body userSearchRequest: UserSearchRequest? = null,
    ): Call<UserSearchResponse>

    /**
     * Delete user
     * &lt;p&gt;This API endpoint allows you to delete a user. For that, you need to send &lt;i&gt;userGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user is deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param userGuid User Guid
     * @param body Json object (optional)
     * @return [Call]<[UserDeleteResponse]>
     */
    @DELETE("api/v2/User/{userGuid}")
    fun apiV2UserUserGuidDelete(
        @Path("userGuid") userGuid: java.util.UUID,
        @Body body: kotlin.Any? = null,
    ): Call<UserDeleteResponse>

    /**
     * Get single user details
     * &lt;p&gt;This API endpoint allows you to get a detailed description of a user. For that, you need to send &lt;i&gt;userGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user details are loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param userGuid User Guid
     * @param userInfoFlag To include or exclude user info detail from response.  &lt;i&gt;true&lt;/i&gt;: to include, &lt;i&gt;false&lt;/i&gt;: to exclude. By default details are included. (optional)
     * @return [Call]<[UserResponse]>
     */
    @GET("api/v2/User/{userGuid}")
    fun apiV2UserUserGuidGet(
        @Path("userGuid") userGuid: java.util.UUID,
        @Query("userInfoFlag") userInfoFlag: kotlin.Boolean? = null,
    ): Call<UserResponse>

    /**
     * Update custom property value
     * &lt;p&gt;This API endpoint allows you to update the custom property value of a user. For that, you need to send &lt;i&gt;userGuid&lt;/i&gt; in request url along with &lt;i&gt;customPropertyGuid&lt;/i&gt; and value in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that custom property is updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Property doesn't exist, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param userGuid User Guid
     * @param userPropertiesUpdateRequest Json object (optional)
     * @return [Call]<[UserPropertyUpdateResponse]>
     */
    @PUT("api/v2/User/{userGuid}/properties")
    fun apiV2UserUserGuidPropertiesPut(
        @Path("userGuid") userGuid: java.util.UUID,
        @Body userPropertiesUpdateRequest: UserPropertiesUpdateRequest? = null,
    ): Call<UserPropertyUpdateResponse>

    /**
     * Delete custom property value
     * &lt;p&gt;This API endpoint allows you to delete a custom property value of a user. For that, you need to send &lt;i&gt;userGuid&lt;/i&gt; and &lt;i&gt;customPropertyGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that custom property is deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  Property doesn't exist, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param userGuid User Guid
     * @param propertyGuid Custom Property Guid
     * @return [Call]<[UserPropertyDeleteResponse]>
     */
    @DELETE("api/v2/User/{userGuid}/property/{propertyGuid}")
    fun apiV2UserUserGuidPropertyPropertyGuidDelete(
        @Path("userGuid") userGuid: java.util.UUID,
        @Path("propertyGuid") propertyGuid: java.util.UUID,
    ): Call<UserPropertyDeleteResponse>

    /**
     * Update user details
     * &lt;p&gt;This API endpoint allows you to update user details like first name, last name, contact number, a role assigned, entity, or device allocation. For that, you need to send &lt;i&gt;userGuid&lt;/i&gt; in request url and updated user details in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user is updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist, Entity doesn't exist, Role doesn't exist, Role is not active, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param userGuid User Guid
     * @param userUpdateRequest Json object (optional)
     * @return [Call]<[UserUpdateResponse]>
     */
    @PUT("api/v2/User/{userGuid}")
    fun apiV2UserUserGuidPut(
        @Path("userGuid") userGuid: java.util.UUID,
        @Body userUpdateRequest: UserUpdateRequest? = null,
    ): Call<UserUpdateResponse>

    /**
     * Update user status
     * &lt;p&gt;This API endpoint allows you to update the active status of a user. For that, you need to send &lt;i&gt;userGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user active status is updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server  User doesn't exist, Status is already updated, Company doesn't exist, Logged in user is not valid etc.
     *
     * @param userGuid User Guid
     * @param userStatusChangeV2Request Json object (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/User/{userGuid}/status")
    fun apiV2UserUserGuidStatusPut(
        @Path("userGuid") userGuid: java.util.UUID,
        @Body userStatusChangeV2Request: UserStatusChangeV2Request? = null,
    ): Call<SuccessResponse>
}
