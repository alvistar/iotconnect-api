package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.DeviceBulkTagAssignRequest
import com.thealvistar.iotconnect.device.client.models.DeviceBulkTagAssignResponse
import com.thealvistar.iotconnect.device.client.models.DeviceUpdatesDeviceListResponse
import com.thealvistar.iotconnect.device.client.models.DeviceUpdatesDeviceLookupResponse
import com.thealvistar.iotconnect.device.client.models.DeviceUpdatesListReponse
import com.thealvistar.iotconnect.device.client.models.ImportHistoryResponse
import com.thealvistar.iotconnect.device.client.models.ImportUpdateResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface DeviceUpdateApi {
    /**
     * Get devices which has tag assigned.
     * &lt;p&gt;This API endpoint provides you the list of all devices in your company.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @param pageNumber  (optional)
     * @param pageSize  (optional)
     * @param searchText  (optional)
     * @param sortBy  (optional)
     * @return [Call]<[DeviceUpdatesDeviceListResponse]>
     */
    @GET("api/v2/device-updates/devices")
    fun apiV2DeviceUpdatesDevicesGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("searchText") searchText: kotlin.String? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
    ): Call<DeviceUpdatesDeviceListResponse>

    /**
     * Get device lookup
     * &lt;p&gt;This API endpoint provides you the lookup of all available devices in your company.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device lookup received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @return [Call]<[DeviceUpdatesDeviceLookupResponse]>
     */
    @GET("api/v2/device-updates/devices/lookup")
    fun apiV2DeviceUpdatesDevicesLookupGet(): Call<DeviceUpdatesDeviceLookupResponse>

    /**
     * Get device updates list
     * &lt;p&gt;This API endpoint provides you the list of device updates.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device updates list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @return [Call]<[DeviceUpdatesListReponse]>
     */
    @GET("api/v2/device-updates")
    fun apiV2DeviceUpdatesGet(): Call<DeviceUpdatesListReponse>

    /**
     * Gets import history
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @return [Call]<[ImportHistoryResponse]>
     */
    @GET("api/v2/device-updates/import-history")
    fun apiV2DeviceUpdatesImportHistoryGet(): Call<ImportHistoryResponse>

    /**
     *
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @param manifest  (optional)
     * @param firmwares  (optional)
     * @return [Call]<[ImportUpdateResponse]>
     */
    @Multipart
    @POST("api/v2/device-updates/import-update")
    fun apiV2DeviceUpdatesImportUpdatePost(
        @Part manifest: MultipartBody.Part? = null,
        @Part firmwares: MultipartBody.Part? = null,
    ): Call<ImportUpdateResponse>

    /**
     *
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @param deviceBulkTagAssignRequest  (optional)
     * @return [Call]<[DeviceBulkTagAssignResponse]>
     */
    @POST("api/v2/device-updates/tags")
    fun apiV2DeviceUpdatesTagsPost(@Body deviceBulkTagAssignRequest: DeviceBulkTagAssignRequest? = null): Call<DeviceBulkTagAssignResponse>
}
