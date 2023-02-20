package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.CosmosExportHistoryListResponse
import com.thealvistar.iotconnect.device.client.models.CosmosExportHistoryRequest
import com.thealvistar.iotconnect.device.client.models.CosmosExportHistoryResponse
import retrofit2.Call
import retrofit2.http.*

interface DataExportApi {
    /**
     * Get data export request list
     * &lt;p&gt;This API endpoint will give you the data export requests list along with their status that whether they are successfully exported or not.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param searchtext To search for specific texts in the list. (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: startDate asc, startDate desc, startDate (optional)
     * @param exportType Export Type : 1 for Template, 2 for Entity and 3 for Device (optional)
     * @param deviceGuid Device guid if &lt;i&gt;exportType&lt;/i&gt; is 3 (optional)
     * @return [Call]<[CosmosExportHistoryListResponse]>
     */
    @GET("api/v2/data-export")
    fun apiV2DataExportGet(
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("searchtext") searchtext: kotlin.String? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("exportType") exportType: kotlin.String? = null,
        @Query("deviceGuid") deviceGuid: java.util.UUID? = null,
    ): Call<CosmosExportHistoryListResponse>

    /**
     * Export telemetry Data
     * &lt;p&gt;This API endpoint allows you to export the device’s cosmos data history. The API endpoint implementation will export data in a file and send you a link to your email to download the exported file. For that, you need to specify the date range and export type. Export type can be Template, Entity, or Device.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the data export process started successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  device or entity or template doesn't exist and invalid logged user or company.
     *
     * @param cosmosExportHistoryRequest  (optional)
     * @return [Call]<[CosmosExportHistoryResponse]>
     */
    @POST("api/v2/data-export")
    fun apiV2DataExportPost(@Body cosmosExportHistoryRequest: CosmosExportHistoryRequest? = null): Call<CosmosExportHistoryResponse>
}
