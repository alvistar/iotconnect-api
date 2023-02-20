package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.DeviceDataArchiveRequest
import com.thealvistar.iotconnect.device.client.models.DeviceDataArchiveResponse
import com.thealvistar.iotconnect.device.client.models.DeviceOperationListResponse
import retrofit2.Call
import retrofit2.http.*

interface DeviceOperationApi {
    /**
     * Device operation history list for archive device telemetry data
     * &lt;p&gt;This API endpoint gives you the list of archive device telemetry data history.&lt;/p&gt;
     * Responses:
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device telemetry archive history list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Invalid logged user or company.
     *
     * @param companyGuid Company guid of device
     * @param deviceGuid Device guid
     * @return [Call]<[DeviceOperationListResponse]>
     */
    @GET("api/v2/company/{companyGuid}/device-operation/{deviceGuid}/archive-data")
    fun apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataGet(
        @Path("companyGuid") companyGuid: java.util.UUID,
        @Path("deviceGuid") deviceGuid: java.util.UUID,
    ): Call<DeviceOperationListResponse>

    /**
     * Archive device telemetry data
     * &lt;p&gt;This API endpoint allows you to archive device telemetry data.&lt;/p&gt;
     * Responses:
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device telemetry archive process started successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Company's cosmos is custom, support ticket not found, support ticket already closed, devie not found, device archive process already running for this company  and invalid logged user or company.
     *
     * @param companyGuid Company guid of device
     * @param deviceGuid Device guid
     * @param deviceDataArchiveRequest Json object (optional)
     * @return [Call]<[DeviceDataArchiveResponse]>
     */
    @POST("api/v2/company/{companyGuid}/device-operation/{deviceGuid}/archive-data")
    fun apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataPost(
        @Path("companyGuid") companyGuid: java.util.UUID,
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body deviceDataArchiveRequest: DeviceDataArchiveRequest? = null,
    ): Call<DeviceDataArchiveResponse>
}
