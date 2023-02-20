package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.ChildDeviceListResponse
import com.thealvistar.iotconnect.device.client.models.CompanyWiseDeviceListResponse
import com.thealvistar.iotconnect.device.client.models.ConnectionStatusResponse
import com.thealvistar.iotconnect.device.client.models.CountResponse
import com.thealvistar.iotconnect.device.client.models.CountersResponse
import com.thealvistar.iotconnect.device.client.models.DeviceAcquireRequest
import com.thealvistar.iotconnect.device.client.models.DeviceBatchImportChildResponse
import com.thealvistar.iotconnect.device.client.models.DeviceBatchImportResponse
import com.thealvistar.iotconnect.device.client.models.DeviceCreateRequest
import com.thealvistar.iotconnect.device.client.models.DeviceCreateResponse
import com.thealvistar.iotconnect.device.client.models.DeviceDeleteResponse
import com.thealvistar.iotconnect.device.client.models.DeviceDiagnosticsResponse
import com.thealvistar.iotconnect.device.client.models.DeviceDiagnosticsV2Request
import com.thealvistar.iotconnect.device.client.models.DeviceDirectMethodListResponse
import com.thealvistar.iotconnect.device.client.models.DeviceDirectMethodRequest
import com.thealvistar.iotconnect.device.client.models.DeviceDirectMethodResponse
import com.thealvistar.iotconnect.device.client.models.DeviceEntityBulkUpdateResponse
import com.thealvistar.iotconnect.device.client.models.DeviceEntityUpdateResponse
import com.thealvistar.iotconnect.device.client.models.DeviceGrantEmailsUpdateRequest
import com.thealvistar.iotconnect.device.client.models.DeviceGrantEmailsUpdateResponse
import com.thealvistar.iotconnect.device.client.models.DeviceGuids
import com.thealvistar.iotconnect.device.client.models.DeviceImportListByGuidResponse
import com.thealvistar.iotconnect.device.client.models.DeviceImportListResponse
import com.thealvistar.iotconnect.device.client.models.DeviceInfoDeleteResponse
import com.thealvistar.iotconnect.device.client.models.DeviceInformationResponse
import com.thealvistar.iotconnect.device.client.models.DeviceLifeCycleResponse
import com.thealvistar.iotconnect.device.client.models.DeviceListResponse
import com.thealvistar.iotconnect.device.client.models.DeviceLookupResponse
import com.thealvistar.iotconnect.device.client.models.DevicePropertyUpdateRequest
import com.thealvistar.iotconnect.device.client.models.DevicePropertyUpdateResponse
import com.thealvistar.iotconnect.device.client.models.DeviceStatisticListResponse
import com.thealvistar.iotconnect.device.client.models.DeviceTwinJsonResponse
import com.thealvistar.iotconnect.device.client.models.DeviceTwinListResponse
import com.thealvistar.iotconnect.device.client.models.DeviceTwinRequest
import com.thealvistar.iotconnect.device.client.models.DeviceTwinResponse
import com.thealvistar.iotconnect.device.client.models.DeviceUpdateRequest
import com.thealvistar.iotconnect.device.client.models.DeviceUpdateStatusRequest
import com.thealvistar.iotconnect.device.client.models.InvalidDeviceCommunicationResponse
import com.thealvistar.iotconnect.device.client.models.PropertyDeleteResponse
import com.thealvistar.iotconnect.device.client.models.PropertyListResponse
import com.thealvistar.iotconnect.device.client.models.RecentActivityResponse
import com.thealvistar.iotconnect.device.client.models.SuccessResponse
import com.thealvistar.iotconnect.device.client.models.UnassociatedAttachBulkRequest
import com.thealvistar.iotconnect.device.client.models.UnassociatedAttachBulkResponse
import com.thealvistar.iotconnect.device.client.models.UnassociatedAttachRequest
import com.thealvistar.iotconnect.device.client.models.UnassociatedDeviceListResponse
import com.thealvistar.iotconnect.device.client.models.UserDevicePermissionListResponse
import com.thealvistar.iotconnect.device.client.models.UserDevicePermissionRevokeResponse
import com.thealvistar.iotconnect.device.client.models.UserDevicePermissionUpdateRequest
import com.thealvistar.iotconnect.device.client.models.UserDevicePermissionUpdateResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface DeviceApi {
    /**
     * Get company wise device list
     * &lt;p&gt;Recognize how many devices are registered under one company, using this API endpoint. For that, send &lt;i&gt;companyGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The Company doesn't exist and invalid logged user or company.
     *
     * @param companyGuid The company guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order, Eg. uniqueId, uniqueId asc, displayName desc etc. (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @return [Call]<[CompanyWiseDeviceListResponse]>
     */
    @GET("api/v2/company/{companyGuid}/device")
    fun apiV2CompanyCompanyGuidDeviceGet(
        @Path("companyGuid") companyGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
    ): Call<CompanyWiseDeviceListResponse>

    /**
     * Get invalid device communications
     * &lt;p&gt;This API endpoint provides you the list of device communication errors of last 3 days.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that invalid device communications list loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param date To fetch specific day data. &lt;i&gt;date&lt;/i&gt; is mandatory parameter and should be in valid format of YYYY-MM-DD. Eg: 2020-12-18 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @return [Call]<[InvalidDeviceCommunicationResponse]>
     */
    @GET("api/v2/Device/audit-log")
    fun apiV2DeviceAuditLogGet(
        @Query("date") date: kotlin.String? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
    ): Call<InvalidDeviceCommunicationResponse>

    /**
     * Get device connection status
     * &lt;p&gt;This API endpoint lets you know that the given device is currently connected with the cloud or not. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; or &lt;i&gt;deviceUniqueId&lt;/i&gt; as a query string parameter in the request.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device connection information received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist and invalid logged user or company.
     *
     * @param deviceGuid Device Guid (optional)
     * @param uniqueId Device Unique Id (optional)
     * @return [Call]<[ConnectionStatusResponse]>
     */
    @GET("api/v2/Device/connection-status")
    fun apiV2DeviceConnectionStatusGet(
        @Query("deviceGuid") deviceGuid: java.util.UUID? = null,
        @Query("uniqueId") uniqueId: kotlin.String? = null,
    ): Call<ConnectionStatusResponse>

    /**
     * Get device count
     * &lt;p&gt;Get device count using this API endpoint. You can filter this count by the company and active status. You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device count received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device status should be active/inactive, not any device found and invalid logged user or company.
     *
     * @param companyguid Company Guid (optional)
     * @param status Device Status, &#39;active&#39; to get active device count, &#39;inactive&#39; to get inactive device count and empty or null value returns all device count. (optional, default to "")
     * @return [Call]<[CountResponse]>
     */
    @GET("api/v2/Device/count")
    fun apiV2DeviceCountGet(
        @Query("companyguid") companyguid: java.util.UUID? = null,
        @Query("status") status: kotlin.String? = "",
    ): Call<CountResponse>

    /**
     * Get device count statistics
     * &lt;p&gt;This API endpoint provides you the variety of statistics of device counts like active count, connected and disconnected count, acquired count, available count and total device count.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device counters received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device status should be active/inactive, no any device found and invalid logged user or company.
     *
     * @param companyguid Company Guid (optional)
     * @return [Call]<[CountersResponse]>
     */
    @GET("api/v2/Device/counters")
    fun apiV2DeviceCountersGet(@Query("companyguid") companyguid: java.util.UUID? = null): Call<CountersResponse>

    /**
     * Get device dashboard count
     * &lt;p&gt;This API endpoint provides you device dashboard count.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device dashboard count received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param widgetType type must be certificate, edgegatewaydevice, gatewaydevice, edgedevice, device, withoutedgegatewaydevice, lowbandwidthdevice,unassociateddevice, azuresphere (optional)
     * @param entityGuid Entity guid (optional)
     * @param isRecursiveEntity Pass &#39;true&#39; to include child entities device count (optional, default to false)
     * @return [Call]<[DeviceStatisticListResponse]>
     */
    @GET("api/v2/Device/DeviceDashboardCount")
    fun apiV2DeviceDeviceDashboardCountGet(
        @Query("widgetType") widgetType: kotlin.String? = null,
        @Query("entityGuid") entityGuid: java.util.UUID? = null,
        @Query("isRecursiveEntity") isRecursiveEntity: kotlin.Boolean? = false,
    ): Call<DeviceStatisticListResponse>

    /**
     * Get list of child devices
     * &lt;p&gt;This API endpoint provides you the list of available child devices in a gateway device. For that, you need to send gateway &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the child device list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Gateway device doesn't exist and invalid logged user or company.
     *
     * @param deviceGuid The Gateway device guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order, Eg. uniqueId, uniqueId asc, displayName desc etc. (optional)
     * @return [Call]<[ChildDeviceListResponse]>
     */
    @GET("api/v2/Device/{deviceGuid}/child-device")
    fun apiV2DeviceDeviceGuidChildDeviceGet(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
    ): Call<ChildDeviceListResponse>

    /**
     * Delete a device
     * &lt;p&gt;To delete a device, use this API endpoint. To do that, you need to send a &lt;i&gt;deviceGuid&lt;/i&gt; in request url that you want to delete. This will also release your device from Azure IoT Hub, even if the device is acquired.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  the device doesn't exist, the device is shared device, an error occurred during delete a device from iothub  and invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @return [Call]<[DeviceDeleteResponse]>
     */
    @DELETE("api/v2/Device/{deviceGuid}")
    fun apiV2DeviceDeviceGuidDelete(@Path("deviceGuid") deviceGuid: java.util.UUID): Call<DeviceDeleteResponse>

    /**
     * Get list of direct method on device
     * &lt;p&gt;This API endpoint lets you get list of executed direct methods on device.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the direct method list of device received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @return [Call]<[DeviceDirectMethodListResponse]>
     */
    @GET("api/v2/Device/{deviceGuid}/direct-method")
    fun apiV2DeviceDeviceGuidDirectMethodGet(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
    ): Call<DeviceDirectMethodListResponse>

    /**
     * Execute direct method on device
     * &lt;p&gt;This API endpoint lets you execute direct methods on device.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the direct method executed successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist, direct method execution failed and invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @param deviceDirectMethodRequest  (optional)
     * @return [Call]<[DeviceDirectMethodResponse]>
     */
    @POST("api/v2/Device/{deviceGuid}/direct-method")
    fun apiV2DeviceDeviceGuidDirectMethodPost(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body deviceDirectMethodRequest: DeviceDirectMethodRequest? = null,
    ): Call<DeviceDirectMethodResponse>

    /**
     * Get device permissions list
     * &lt;p&gt;This API endpoint allows you to get the list of users with their device permissions. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you want the device permissions list.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device permission list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort By, Eg. name, name asc, name desc etc. (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @return [Call]<[UserDevicePermissionListResponse]>
     */
    @GET("api/v2/Device/{deviceGuid}/grant")
    fun apiV2DeviceDeviceGuidGrantGet(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
    ): Call<UserDevicePermissionListResponse>

    /**
     * Grant device permission
     * &lt;p&gt;This API endpoint allows you to grant device permissions to users who do not have the right to view or manage devices. For that, you need to send the user’s email id along with the permissions you want to grant to that user in the request body. And send &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you wish to grant the permissions.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device permission added successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist, user doesn't exist and invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @param deviceGrantEmailsUpdateRequest Json object (optional)
     * @return [Call]<[DeviceGrantEmailsUpdateResponse]>
     */
    @POST("api/v2/Device/{deviceGuid}/grant")
    fun apiV2DeviceDeviceGuidGrantPost(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body deviceGrantEmailsUpdateRequest: DeviceGrantEmailsUpdateRequest? = null,
    ): Call<DeviceGrantEmailsUpdateResponse>

    /**
     * Update device properties
     * &lt;p&gt;This API endpoint helps you to update device properties. For that, you need to send a list of properties with their values in the request body and send &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you want to update the properties.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device twin property list updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist, property doesn't exist and invalid logged user or company.
     *
     * @param deviceGuid Device guid
     * @param devicePropertyUpdateRequest Json object (optional)
     * @return [Call]<[DevicePropertyUpdateResponse]>
     */
    @PUT("api/v2/Device/{deviceGuid}/properties")
    fun apiV2DeviceDeviceGuidPropertiesPut(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body devicePropertyUpdateRequest: DevicePropertyUpdateRequest? = null,
    ): Call<DevicePropertyUpdateResponse>

    /**
     * Delete a device property
     * &lt;p&gt;This API endpoint allows you to delete a device property. For that, you need to send a device property guid along with the &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you want to delete a property.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device property deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist, property doesn't exist, the device is shared device and invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @param deviceInfoGuid Device Info Guid
     * @return [Call]<[DeviceInfoDeleteResponse]>
     */
    @DELETE("api/v2/Device/{deviceGuid}/property/{deviceInfoGuid}")
    fun apiV2DeviceDeviceGuidPropertyDeviceInfoGuidDelete(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Path("deviceInfoGuid") deviceInfoGuid: java.util.UUID,
    ): Call<DeviceInfoDeleteResponse>

    /**
     * Update a device
     * &lt;p&gt;Device details need to be updated anytime. Use this API endpoint to update your device details. Nevertheless, you can only update the display name, properties, notes and entity of a device. To update device details, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device is updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device doesn't exist, the device is shared device, the entity doesn't exist, the child device entity can not update  and invalid logged user or company.
     *
     * @param deviceGuid The guid of the device.
     * @param deviceUpdateRequest Json object with device update details. (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/Device/{deviceGuid}")
    fun apiV2DeviceDeviceGuidPut(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body deviceUpdateRequest: DeviceUpdateRequest? = null,
    ): Call<SuccessResponse>

    /**
     * Update device status
     * &lt;p&gt;This API endpoint allows you to change the status of your device. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url and &lt;i&gt;isActive&lt;/i&gt; in the request body. In &lt;i&gt;isActive&lt;/i&gt;, send &lt;i&gt;true&lt;/i&gt; to activate your device and &lt;i&gt;false&lt;/i&gt; to deactivate your device. When you deactivate your device, this will also release your device from Azure IoT Hub, even if the device is acquired.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device activated or inactivated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below conflicts on the server,  the device doesn't exist, the device is already active or inactive, the device is shared device,   message or device quota are exceeded to activate device only and invalid logged user or company.
     *
     * @param deviceGuid Device Guid
     * @param deviceUpdateStatusRequest Json object (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/Device/{deviceGuid}/status")
    fun apiV2DeviceDeviceGuidStatusPut(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body deviceUpdateStatusRequest: DeviceUpdateStatusRequest? = null,
    ): Call<SuccessResponse>

    /**
     * Update device entity in bulk with file or json
     * &lt;p&gt;This API endpoint also allows you to update an entity of multiple devices in a single call. For that, you need to send either the list of device guids OR csv file in the request body along with new &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the devices entity updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              An Entity doesn't exist and invalid logged user or company.
     *
     * @param entityGuid Entity Guid
     * @param deviceUniqueIds Comma separated device unique Ids. Eg. uniqueId1,uniqueId2,uniqueId3 etc.   This field is required if deviceFile doesn&#39;t have value in request.  Note : Duplicate device uniqueId not allowed. (optional)
     * @param deviceFile Upload devices(uniqueId) in bulk as per the csv sample provided. Please download sample files form your IoTConnect Account.  If deviceUniqueIds and this field are having value then this field consider as first priority for further process and will be ignored deviceUniqueIds field.  Note : Duplicate device uniqueId not allowed. (optional)
     * @return [Call]<[DeviceEntityBulkUpdateResponse]>
     */
    @Multipart
    @PUT("api/v2/Device/device-transfer/{entityGuid}")
    fun apiV2DeviceDeviceTransferEntityGuidPut(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Part("deviceUniqueIds") deviceUniqueIds: kotlin.String? = null,
        @Part deviceFile: MultipartBody.Part? = null,
    ): Call<DeviceEntityBulkUpdateResponse>

    /**
     * Get device diagnostics detail
     * &lt;p&gt;This API endpoint will give you the diagnostics detail of any device. For that, you need to send device &lt;i&gt;uniqueId&lt;/i&gt;, &lt;i&gt;fromDate&lt;/i&gt; and &lt;i&gt;toDate&lt;/i&gt; in the request path.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device diagnostics list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param deviceDiagnosticsV2Request request object (optional)
     * @return [Call]<[DeviceDiagnosticsResponse]>
     */
    @POST("api/v2/Device/diagnostics")
    fun apiV2DeviceDiagnosticsPost(@Body deviceDiagnosticsV2Request: DeviceDiagnosticsV2Request? = null): Call<DeviceDiagnosticsResponse>

    /**
     * Update device entity in bulk with file or json
     * &lt;p&gt;This API endpoint also allows you to update an entity of multiple devices in a single call. For that, you need to send either the list of device guids OR csv file in the request body along with new &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the devices entity updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              An Entity doesn't exist and invalid logged user or company.
     *
     * @param entityGuid Entity Guid
     * @param deviceUniqueIds Comma separated device unique Ids. Eg. uniqueId1,uniqueId2,uniqueId3 etc.   This field is required if deviceFile doesn&#39;t have value in request.  Note : Duplicate device uniqueId not allowed. (optional)
     * @param deviceFile Upload devices(uniqueId) in bulk as per the csv sample provided. Please download sample files form your IoTConnect Account.  If deviceUniqueIds and this field are having value then this field consider as first priority for further process and will be ignored deviceUniqueIds field.  Note : Duplicate device uniqueId not allowed. (optional)
     * @return [Call]<[DeviceEntityBulkUpdateResponse]>
     */
    @Multipart
    @PUT("api/v2/Device/entity/{entityGuid}/change")
    fun apiV2DeviceEntityEntityGuidChangePut(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Part("deviceUniqueIds") deviceUniqueIds: kotlin.String? = null,
        @Part deviceFile: MultipartBody.Part? = null,
    ): Call<DeviceEntityBulkUpdateResponse>

    /**
     * Get Device List
     * &lt;p&gt;This API endpoint gives you the list of available devices in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order, Eg. uniqueId asc, uniqueId desc, displayName etc. (optional)
     * @param uniqueId The unique id of device (optional)
     * @param name The display name of device (optional)
     * @param templateName The device template name (optional)
     * @param entityName The entity name (optional)
     * @param status The status of device, Eg. active or inactive (optional)
     * @param `property` The custom property name of device (optional)
     * @param `value` The custom property value of device (optional)
     * @param acquired The device acquire status, Eg. acquired, released or inprogress (optional)
     * @param includeRecentValue  (optional)
     * @param customField Include custom fields info, &#39;true&#39; to include custom poperties of devices and &#39;false&#39; to exclude (optional, default to false)
     * @param isEdge IsEdge : Pass value as true to get only edge devices (optional)
     * @param isGateway IsGateway : Pass value as true to get only gateway devices (optional)
     * @param isLowBandwidth IsLowBandwidth : Pass value as true to get only low badnwidth devices (optional)
     * @param isIotEdgeEnable IsLowBandwidth : Pass value as true to get only low badnwidth devices (optional)
     * @return [Call]<[DeviceListResponse]>
     */
    @GET("api/v2/Device")
    fun apiV2DeviceGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("UniqueId") uniqueId: kotlin.String? = null,
        @Query("Name") name: kotlin.String? = null,
        @Query("TemplateName") templateName: kotlin.String? = null,
        @Query("EntityName") entityName: kotlin.String? = null,
        @Query("Status") status: kotlin.String? = null,
        @Query("Property") `property`: kotlin.String? = null,
        @Query("Value") `value`: kotlin.String? = null,
        @Query("Acquired") acquired: kotlin.String? = null,
        @Query("IncludeRecentValue") includeRecentValue: kotlin.Boolean? = null,
        @Query("customField") customField: kotlin.Boolean? = false,
        @Query("isEdge") isEdge: kotlin.Boolean? = null,
        @Query("isGateway") isGateway: kotlin.Boolean? = null,
        @Query("isLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
    ): Call<DeviceListResponse>

    /**
     * Get device lookup
     * &lt;p&gt;This API endpoint provides you the lookup of all available devices in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device lookup received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param deviceTemplateGuid To get device lookup by device template, required to pass device template guid. (optional)
     * @param tag To get device lookup by device tag. (optional)
     * @param iotEdgeEnabled  (optional)
     * @param getChildDevice Required to pass &#39;true&#39; for getting device lookup along with child devices and &#39;false&#39; for getting device lookup without child devices. (optional, default to false)
     * @param excludeEdge Required to pass &#39;false&#39; for getting non-edge device lookup and &#39;true&#39; for getting edge device lookup. (optional, default to false)
     * @param deviceEntityGuid Entity guid (optional)
     * @return [Call]<[DeviceLookupResponse]>
     */
    @GET("api/v2/Device/lookup")
    fun apiV2DeviceLookupGet(
        @Query("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID? = null,
        @Query("tag") tag: kotlin.String? = null,
        @Query("iotEdgeEnabled") iotEdgeEnabled: kotlin.Boolean? = null,
        @Query("getChildDevice") getChildDevice: kotlin.Boolean? = false,
        @Query("excludeEdge") excludeEdge: kotlin.Boolean? = false,
        @Query("deviceEntityGuid") deviceEntityGuid: java.util.UUID? = null,
    ): Call<DeviceLookupResponse>

    /**
     * Add new device
     * &lt;p&gt;IoT device is a smart device that supports internet connectivity. Through connectivity, established using IoT communication protocols, these devices can interact with other devices. Not only that, it grants remote access to a user for managing the device as per their needs. These devices can be anything from consumer devices, wearables, home appliances, industrial monitoring systems to security systems.&lt;/p&gt;  &lt;p&gt;Add any quantity and a variety of devices using this API endpoint for easy integration with IoTConnect. The approach requires a device template, defining the features and type of your devices. Features include attributes, settings, properties, rules, commands and so on, by applying them on devices, users can monitor and manage.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device is created successfully and returns created device guid.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, entity doesn't exist, the device is already exists, invalid tag,   no attributes found in device template, parent device doesn't exist, parent and child device tags are same   and invalid logged user or company.
     *
     * @param deviceCreateRequest Json object with device details. (optional)
     * @return [Call]<[DeviceCreateResponse]>
     */
    @POST("api/v2/Device")
    fun apiV2DevicePost(@Body deviceCreateRequest: DeviceCreateRequest? = null): Call<DeviceCreateResponse>

    /**
     * Get device property list
     * &lt;p&gt;This API endpoint allows you to fetch all device properties list.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device property list is loaded successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @return [Call]<[PropertyListResponse]>
     */
    @GET("api/v2/Device/property")
    fun apiV2DevicePropertyGet(): Call<PropertyListResponse>

    /**
     * Delete a device property
     * &lt;p&gt;This API endpoint allows you to delete a device custom property. For that, you need to send &lt;i&gt;propertyGuid&lt;/i&gt; and &lt;i&gt;companyGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device customField deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param companyGuid Company Guid
     * @param propertyGuid Property Guid
     * @return [Call]<[PropertyDeleteResponse]>
     */
    @DELETE("api/v2/Device/property/{propertyGuid}/company/{companyGuid}")
    fun apiV2DevicePropertyPropertyGuidCompanyCompanyGuidDelete(
        @Path("companyGuid") companyGuid: java.util.UUID,
        @Path("propertyGuid") propertyGuid: java.util.UUID,
    ): Call<PropertyDeleteResponse>

    /**
     * Get recently acquired device list
     * &lt;p&gt;Get a recently acquired device list using this API endpoint. You can also add the filters as given in the parameters. These filters allow you to get the list by devices acquired status, connected status, OTA update available status and device active status. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that recent activity list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param isAcquired Filter by acquired status (optional)
     * @param isConnected Filter by connected status (optional)
     * @param isOtaupdate Filter by otaupdate status (optional)
     * @param count Number of devices to be displayed (optional)
     * @param isActive Filter by active status (optional)
     * @return [Call]<[RecentActivityResponse]>
     */
    @GET("api/v2/Device/recent-activity")
    fun apiV2DeviceRecentActivityGet(
        @Query("isAcquired") isAcquired: kotlin.Boolean? = null,
        @Query("isConnected") isConnected: kotlin.Boolean? = null,
        @Query("isOtaupdate") isOtaupdate: kotlin.Boolean? = null,
        @Query("count") count: kotlin.Int? = null,
        @Query("isActive") isActive: kotlin.Boolean? = null,
    ): Call<RecentActivityResponse>

    /**
     * Get device count statistics
     * &lt;p&gt;This API endpoint provides you the variety of statistics of device counts like active count, connected and disconnected count, acquired count, available count and total device count.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device statistic list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist, direct method execution failed and invalid logged user or company.
     *
     * @param entity entity Guid (optional)
     * @param group group (optional)
     * @param recursive recursive, &#39;true&#39; to get device along with child entity device and &#39;false&#39; to get for passing entity device, default value is true. (optional, default to true)
     * @return [Call]<[DeviceStatisticListResponse]>
     */
    @GET("api/v2/Device/statistic")
    fun apiV2DeviceStatisticGet(
        @Query("entity") entity: java.util.UUID? = null,
        @Query("group") group: kotlin.String? = null,
        @Query("recursive") recursive: kotlin.Boolean? = true,
    ): Call<DeviceStatisticListResponse>

    /**
     *
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @param unassociatedAttachBulkRequest  (optional)
     * @return [Call]<[UnassociatedAttachBulkResponse]>
     */
    @PUT("api/v2/Device/unassociated/attach/bulk")
    fun apiV2DeviceUnassociatedAttachBulkPut(@Body unassociatedAttachBulkRequest: UnassociatedAttachBulkRequest? = null): Call<UnassociatedAttachBulkResponse>

    /**
     *
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @param unassociatedAttachRequest  (optional)
     * @return [Call]<[UnassociatedAttachBulkResponse]>
     */
    @PUT("api/v2/Device/unassociated/attach")
    fun apiV2DeviceUnassociatedAttachPut(@Body unassociatedAttachRequest: UnassociatedAttachRequest? = null): Call<UnassociatedAttachBulkResponse>

    /**
     * Delete a unassociated device
     * &lt;p&gt;To delete a device, use this API endpoint. To do that, you need to send a &lt;i&gt;deviceGuid&lt;/i&gt; in request url that you want to delete.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device deleted successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.
     *
     * @param deviceGuid Device Guid
     * @return [Call]<[DeviceDeleteResponse]>
     */
    @DELETE("api/v2/Device/unassociated/{deviceGuid}")
    fun apiV2DeviceUnassociatedDeviceGuidDelete(@Path("deviceGuid") deviceGuid: java.util.UUID): Call<DeviceDeleteResponse>

    /**
     * Get Device List
     * &lt;p&gt;This API endpoint gives you the list of available devices in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order, Eg. uniqueId asc, uniqueId desc, displayName asc,displayName desc and createdDate asc,createdDate Desc etc. (optional)
     * @param uniqueId The unique id of device (optional)
     * @param entityName The entity name (optional)
     * @param name The entity name (optional)
     * @param `property` The custom property name of device (optional)
     * @param `value` The custom property value of device (optional)
     * @param customField Include custom fields info, &#39;true&#39; to include custom poperties of devices and &#39;false&#39; to exclude (optional, default to false)
     * @param hasAllottedDevice  (optional, default to false)
     * @return [Call]<[UnassociatedDeviceListResponse]>
     */
    @GET("api/v2/Device/unassociated")
    fun apiV2DeviceUnassociatedGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("UniqueId") uniqueId: kotlin.String? = null,
        @Query("EntityName") entityName: kotlin.String? = null,
        @Query("Name") name: kotlin.String? = null,
        @Query("Property") `property`: kotlin.String? = null,
        @Query("Value") `value`: kotlin.String? = null,
        @Query("customField") customField: kotlin.Boolean? = false,
        @Query("hasAllottedDevice") hasAllottedDevice: kotlin.Boolean? = false,
    ): Call<UnassociatedDeviceListResponse>

    /**
     * Acquire device broker info from cloud
     * &lt;p&gt;In simple words, &lt;i&gt;acquire a device&lt;/i&gt; means registering your device on Azure IoT Hub. When you add a device, it adds in IoTConnect only. However, to transmit data from one device to the other, you need to register a device with Azure IoT Hub.&lt;/p&gt;  &lt;p&gt;To acquire your device, use this API endpoint. To do that, send device &lt;i&gt;uniqueID&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device acquired successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  the device doesn't exist, the device template auth type is TPM, the device is not active, the device is already acquired, the device acquires process already started,    the child device cannot be acquired, message or device quota are exceeded, an error occurred during acquire the device on iothub and invalid logged user or company.
     *
     * @param uniqueId The unique id of device
     * @param deviceAcquireRequest Json object (optional)
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/Device/{uniqueId}/acquire")
    fun apiV2DeviceUniqueIdAcquirePut(
        @Path("uniqueId") uniqueId: kotlin.String,
        @Body deviceAcquireRequest: DeviceAcquireRequest? = null,
    ): Call<SuccessResponse>

    /**
     * Get device life cycle
     * &lt;p&gt;This API endpoint allows you to get the life cycle of any device. Device life cycle will give you details of all the actions performed on devices, from when the device was created, updated, acquired, released, entity changed to deleted. It also gives you the information about who performed these actions and the time when it was performed. To get the device life cycle, you need to send a device’s unique id in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that device life cycle list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              invalid logged user or company.
     *
     * @param uniqueId Device Unique Id
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param searchtext To search for specific texts in the list. (optional)
     * @param sortBy Sort By, Eg. changeDate asc, changeDate desc, changeDate etc. (optional)
     * @return [Call]<[DeviceLifeCycleResponse]>
     */
    @GET("api/v2/Device/{uniqueId}/lifecycle")
    fun apiV2DeviceUniqueIdLifecycleGet(
        @Path("uniqueId") uniqueId: kotlin.String,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("searchtext") searchtext: kotlin.String? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
    ): Call<DeviceLifeCycleResponse>

    /**
     * Release device from cloud
     * &lt;p&gt;This API endpoint is used to release or remove your IoT device from Azure IoT Hub. For that, you need to send device Unique ID in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device released successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device doesn't exist, the device is not active, the device is already released, the device is shared device,   an error occurred during release the device on iothub and invalid logged user or company.
     *
     * @param uniqueId The unique id of device
     * @return [Call]<[SuccessResponse]>
     */
    @PUT("api/v2/Device/{uniqueId}/release")
    fun apiV2DeviceUniqueIdReleasePut(@Path("uniqueId") uniqueId: kotlin.String): Call<SuccessResponse>

    /**
     * Get device twin property list
     * &lt;p&gt;Get a twin property list of any device using this API. For that, you need to send device &lt;i&gt;uniqueId&lt;/i&gt; in request url of which you want to get the twin property list. &lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device twin property list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist and invalid logged user or company.
     *
     * @param uniqueId Device Unique Id
     * @param recentlyReported Send true to get 10 twin properties whose reported values updated recently. (optional)
     * @return [Call]<[DeviceTwinListResponse]>
     */
    @GET("api/v2/Device/{uniqueId}/twin")
    fun apiV2DeviceUniqueIdTwinGet(
        @Path("uniqueId") uniqueId: kotlin.String,
        @Query("recentlyReported") recentlyReported: kotlin.Boolean? = null,
    ): Call<DeviceTwinListResponse>

    /**
     * Update device twin property
     * &lt;p&gt;This API endpoint allows you to update the twin property of a device. For that, you need to send &lt;i&gt;localName&lt;/i&gt;, &lt;i&gt;desiredValue&lt;/i&gt; and &lt;i&gt;templateSettingGuid&lt;/i&gt; in request body along with the device uniqueId in request url of which you look to update the twin property.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device twin property updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist, the device is not acquired, the device is shared device, the device template setting doesn't exist,               the device twin property value doesn't match with device template setting datatype,               the device twin property value doesn't satisfy with data validation of device template setting,                an error occurred while updating the device twin property on IOTHub, invalid local name and invalid logged user or company.
     *
     * @param uniqueId Device Unique Id
     * @param deviceTwinRequest Json object (optional)
     * @return [Call]<[DeviceTwinResponse]>
     */
    @PUT("api/v2/Device/{uniqueId}/twin")
    fun apiV2DeviceUniqueIdTwinPut(
        @Path("uniqueId") uniqueId: kotlin.String,
        @Body deviceTwinRequest: DeviceTwinRequest? = null,
    ): Call<DeviceTwinResponse>

    /**
     * Get device twin property json
     * &lt;p&gt;Get a twin property json of any device using this API. For that, you need to send device &lt;i&gt;uniqueId&lt;/i&gt; in request url of which you want to get the twin property json.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device twin JSON object received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              The device doesn't exist and invalid logged user or company.
     *
     * @param uniqueId Device Unique Id
     * @return [Call]<[DeviceTwinJsonResponse]>
     */
    @GET("api/v2/Device/{uniqueId}/twinjson")
    fun apiV2DeviceUniqueIdTwinjsonGet(@Path("uniqueId") uniqueId: kotlin.String): Call<DeviceTwinJsonResponse>

    /**
     * Get all the details of single device
     * &lt;p&gt;Getting all the details of a device, including firmware update, device availability and when it was last connected, etc., is critical for any user. To get all the details of a device, you need to send the device &lt;i&gt;uniqueId&lt;/i&gt; in request url. Moreover, if you wish to fetch child device details, send gateway device &lt;i&gt;uniqueId&lt;/i&gt; in &lt;i&gt;parentDeviceUniqueId&lt;/i&gt; parameter of a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device information received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  the device doesn't exist and invalid logged user or company.
     *
     * @param uniqueId Device Unique Id
     * @param parentDeviceUniqueId Gateway Device Unique Id (optional)
     * @return [Call]<[DeviceInformationResponse]>
     */
    @GET("api/v2/Device/uniqueId/{uniqueId}")
    fun apiV2DeviceUniqueIdUniqueIdGet(
        @Path("uniqueId") uniqueId: kotlin.String,
        @Query("parentDeviceUniqueId") parentDeviceUniqueId: kotlin.String? = null,
    ): Call<DeviceInformationResponse>

    /**
     * Update device permissions
     * &lt;p&gt;This API endpoint lets you update user’s device permissions. For that, you need to send &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; in request url along with permissions in the request body. &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; is a unique id for the combination of users and devices.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user's device permission updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              User's device permission doesn't exist and invalid logged user or company.
     *
     * @param userDevicePermissionGuid User device permission guid
     * @param userDevicePermissionUpdateRequest  (optional)
     * @return [Call]<[UserDevicePermissionUpdateResponse]>
     */
    @PUT("api/v2/Device/user-device-permission/{userDevicePermissionGuid}")
    fun apiV2DeviceUserDevicePermissionUserDevicePermissionGuidPut(
        @Path("userDevicePermissionGuid") userDevicePermissionGuid: java.util.UUID,
        @Body userDevicePermissionUpdateRequest: UserDevicePermissionUpdateRequest? = null,
    ): Call<UserDevicePermissionUpdateResponse>

    /**
     * Revoke device permissions
     * &lt;p&gt;This API endpoint allows you to revoke all the device permissions for any user. For that, you need to send &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; in request url. &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; is a unique id for the combination of users and devices.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that user's device permission revoked successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              User's device permission doesn't exist and invalid logged user or company.
     *
     * @param userDevicePermissionGuid User device permission guid
     * @return [Call]<[UserDevicePermissionRevokeResponse]>
     */
    @DELETE("api/v2/Device/user-device-permission/{userDevicePermissionGuid}/revoke")
    fun apiV2DeviceUserDevicePermissionUserDevicePermissionGuidRevokeDelete(@Path("userDevicePermissionGuid") userDevicePermissionGuid: java.util.UUID): Call<UserDevicePermissionRevokeResponse>

    /**
     * Get device list by entityGuid
     * &lt;p&gt;Know how many devices are registered under one entity, using this API endpoint. To know that, send &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param entityGuid The entity guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order, eg: uniqueId, deviceTemplateName, uniqueId asc, displayName desc etc. (optional)
     * @param uniqueId The unique id of device (optional)
     * @param name The display name of device (optional)
     * @param templateName The device template name (optional)
     * @param entityName The entity name (optional)
     * @param status The status of device, Eg. active or inactive (optional)
     * @param `property` The custom property name of device (optional)
     * @param `value` The custom property value of device (optional)
     * @param acquired The device acquire status, Eg. acquired, released or inprogress (optional)
     * @param isEdge IsEdge : Pass value as true to get only edge devices (optional)
     * @param isGateway IsGateway : Pass value as true to get only gateway devices (optional)
     * @param isLowBandwidth IsLowBandwidth : Pass value as true to get only low badnwidth devices (optional)
     * @param isIotEdgeEnable  (optional)
     * @return [Call]<[DeviceListResponse]>
     */
    @GET("api/v2/entity/{entityGuid}/device")
    fun apiV2EntityEntityGuidDeviceGet(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("UniqueId") uniqueId: kotlin.String? = null,
        @Query("Name") name: kotlin.String? = null,
        @Query("TemplateName") templateName: kotlin.String? = null,
        @Query("EntityName") entityName: kotlin.String? = null,
        @Query("Status") status: kotlin.String? = null,
        @Query("Property") `property`: kotlin.String? = null,
        @Query("Value") `value`: kotlin.String? = null,
        @Query("Acquired") acquired: kotlin.String? = null,
        @Query("isEdge") isEdge: kotlin.Boolean? = null,
        @Query("isGateway") isGateway: kotlin.Boolean? = null,
        @Query("isLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
    ): Call<DeviceListResponse>

    /**
     * Update device entity in bulk
     * &lt;p&gt;This API endpoint helps you to update an entity of multiple devices in a single call. For that, send the list of deviceGuids in the request body along with new &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the devices entity updated successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.              An Entity doesn't exist and invalid logged user or company.
     *
     * @param entityGuid Entity Guid
     * @param deviceGuids Device guid list (optional)
     * @return [Call]<[DeviceEntityUpdateResponse]>
     */
    @PUT("api/v2/entity/{entityGuid}/device")
    fun apiV2EntityEntityGuidDevicePut(
        @Path("entityGuid") entityGuid: java.util.UUID,
        @Body deviceGuids: kotlin.collections.List<DeviceGuids>? = null,
    ): Call<DeviceEntityUpdateResponse>

    /**
     * Import child devices in batch
     * &lt;p&gt;This API endpoint helps you to create child devices in bulk for a gateway device. For that, you need to upload a JSON file in the &lt;i&gt;file&lt;/i&gt; parameter, containing the list of child devices that you want to create. Along with the gateway device, send &lt;i&gt;uniqueId&lt;/i&gt; in &lt;i&gt;deviceUniqueId&lt;/i&gt; parameter for which you want to create these devices.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the child device batch import completed successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The gateway device doesn't exist, the device uniqueId already exists and invalid logged user or company.
     *
     * @param deviceUniqueId The device unique id of gateway device
     * @param file The json file as per the file sample provided.Please download sample files form your IoTConnect Account.              &lt;p&gt;&lt;b&gt;Notes :&lt;/b&gt; file should be valid file, file content should be valid JSON in file, uniqueId is required,               device property key is required if passing properties of the device,              device uniqueId should be valid, not allowed duplicate device uniqueId, device tag is required and device tag should be valid &lt;/p&gt;
     * @return [Call]<[DeviceBatchImportChildResponse]>
     */
    @Multipart
    @POST("api/v2/import-batch/child-device")
    fun apiV2ImportBatchChildDevicePost(
        @Part("deviceUniqueId") deviceUniqueId: kotlin.String,
        @Part file: MultipartBody.Part,
    ): Call<DeviceBatchImportChildResponse>

    /**
     * Get device batch import list
     * &lt;p&gt;This API endpoint provides you the list of all imported device batches. This will give you the current status of all batch import along with the count of device insert success and failure.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device batch import list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param deviceGuid Device(gateway) guid to get child import list (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order. Eg. createdDate desc, createdDate asc, createdDate. (optional)
     * @return [Call]<[DeviceImportListResponse]>
     */
    @GET("api/v2/import-batch")
    fun apiV2ImportBatchGet(
        @Query("deviceGuid") deviceGuid: kotlin.String? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
    ): Call<DeviceImportListResponse>

    /**
     * Get list of all devices from a batch import request
     * &lt;p&gt;This API endpoint delivers you the list of all devices which had been requested to create via batch import request. For that, you need to send a batch import guid in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device batch import list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Invalid import batch doesn't exist, invalid logged user or company.
     *
     * @param importBatchGuid Import batch guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order. Eg. createdDate desc, createdDate asc, createdDate. (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @return [Call]<[DeviceImportListByGuidResponse]>
     */
    @GET("api/v2/import-batch/{importBatchGuid}")
    fun apiV2ImportBatchImportBatchGuidGet(
        @Path("importBatchGuid") importBatchGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
    ): Call<DeviceImportListByGuidResponse>

    /**
     * Import devices in batch
     * &lt;p&gt;This API endpoint helps to create devices in bulk for the given entity guid and template code. For that, upload a JSON file in the &lt;i&gt;file&lt;/i&gt; parameter, containing a template code and list of devices that you want to create under a given template code. Along with that, you also need to send entity guid in &lt;i&gt;entityGuid&lt;/i&gt; parameter under which you want to create devices. This also allows you to make gateway devices in bulk. To add child devices, you need to put them under your gateway device in a JSON file.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device batch import process has started successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device template doesn't exist and invalid logged user or company.
     *
     * @param entityGuid The entity guid
     * @param file The json file as per the file sample provided.Please download sample files form your IoTConnect Account.              &lt;p&gt;&lt;b&gt;Notes :&lt;/b&gt; File should be valid file, file content should be valid JSON, the device template code (dtCode) is required,              dtCode should be valid, the device uniqueId is required, not allowed duplicate uniqueId for parent devices,              uniqueId should be valid, not allowed duplicate child device uniqueId within parent device,              device tag should be valid, self or CA signed parent device uniqueId length should be less than or equal to 31 characters,              self or CA signed child device uniqueId length should be less than or equal to 64 characters,              TPM and Key device (parent/child) uniqueId length should be less than or equal to 128 characters,              device property key is required if passing properties of the device, not allowed duplicate property key, tag is required for gateway child device &lt;/p&gt;
     * @param templateType templateType should be device, edgeDevice, gatewayDevice, edgeGatewayDevice, lowBandwidthDevice or iotEdgeEnableDevice (optional)
     * @param certificateGuid The root certificate guid (optional)
     * @return [Call]<[DeviceBatchImportResponse]>
     */
    @Multipart
    @POST("api/v2/import-batch")
    fun apiV2ImportBatchPost(
        @Part("entityGuid") entityGuid: java.util.UUID,
        @Part file: MultipartBody.Part,
        @Part("TemplateType") templateType: kotlin.String? = null,
        @Part("CertificateGuid") certificateGuid: java.util.UUID? = null,
    ): Call<DeviceBatchImportResponse>

    /**
     * Get device list by templateGuid
     * &lt;p&gt;This API endpoint helps you to find out how many devices are registered under one device template. To find that out, send device &lt;i&gt;templateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param templateGuid The device template guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order, Eg. uniqueId, deviceTemplateName, uniqueId asc, displayName desc etc. (optional)
     * @param uniqueId The unique id of device (optional)
     * @param name The display name of device (optional)
     * @param templateName The device template name (optional)
     * @param entityName The entity name (optional)
     * @param status The status of device, Eg. active or inactive (optional)
     * @param `property` The custom property name of device (optional)
     * @param `value` The custom property value of device (optional)
     * @param acquired The device acquire status, Eg. acquired, released or inprogress (optional)
     * @param isEdge IsEdge : Pass value as true to get only edge devices (optional)
     * @param isGateway IsGateway : Pass value as true to get only gateway devices (optional)
     * @param isLowBandwidth IsLowBandwidth : Pass value as true to get only low badnwidth devices (optional)
     * @param isIotEdgeEnable  (optional)
     * @return [Call]<[DeviceListResponse]>
     */
    @GET("api/v2/template/{templateGuid}/device")
    fun apiV2TemplateTemplateGuidDeviceGet(
        @Path("templateGuid") templateGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("UniqueId") uniqueId: kotlin.String? = null,
        @Query("Name") name: kotlin.String? = null,
        @Query("TemplateName") templateName: kotlin.String? = null,
        @Query("EntityName") entityName: kotlin.String? = null,
        @Query("Status") status: kotlin.String? = null,
        @Query("Property") `property`: kotlin.String? = null,
        @Query("Value") `value`: kotlin.String? = null,
        @Query("Acquired") acquired: kotlin.String? = null,
        @Query("isEdge") isEdge: kotlin.Boolean? = null,
        @Query("isGateway") isGateway: kotlin.Boolean? = null,
        @Query("isLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
    ): Call<DeviceListResponse>
}
