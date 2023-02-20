# DataExportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DataExportGet**](DataExportApi.md#apiV2DataExportGet) | **GET** api/v2/data-export | Get data export request list
[**apiV2DataExportPost**](DataExportApi.md#apiV2DataExportPost) | **POST** api/v2/data-export | Export telemetry Data



Get data export request list

&lt;p&gt;This API endpoint will give you the data export requests list along with their status that whether they are successfully exported or not.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DataExportApi::class.java)
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val searchtext : kotlin.String = searchtext_example // kotlin.String | To search for specific texts in the list.
val sortBy : kotlin.String = sortBy_example // kotlin.String | To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: startDate asc, startDate desc, startDate
val exportType : kotlin.String = exportType_example // kotlin.String | Export Type : 1 for Template, 2 for Entity and 3 for Device
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device guid if <i>exportType</i> is 3

val result : CosmosExportHistoryListResponse = webService.apiV2DataExportGet(pageSize, pageNumber, searchtext, sortBy, exportType, deviceGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **searchtext** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **sortBy** | **kotlin.String**| To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: startDate asc, startDate desc, startDate | [optional]
 **exportType** | **kotlin.String**| Export Type : 1 for Template, 2 for Entity and 3 for Device | [optional]
 **deviceGuid** | **java.util.UUID**| Device guid if &lt;i&gt;exportType&lt;/i&gt; is 3 | [optional]

### Return type

[**CosmosExportHistoryListResponse**](CosmosExportHistoryListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Export telemetry Data

&lt;p&gt;This API endpoint allows you to export the device’s cosmos data history. The API endpoint implementation will export data in a file and send you a link to your email to download the exported file. For that, you need to specify the date range and export type. Export type can be Template, Entity, or Device.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DataExportApi::class.java)
val cosmosExportHistoryRequest : CosmosExportHistoryRequest =  // CosmosExportHistoryRequest | 

val result : CosmosExportHistoryResponse = webService.apiV2DataExportPost(cosmosExportHistoryRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cosmosExportHistoryRequest** | [**CosmosExportHistoryRequest**](CosmosExportHistoryRequest.md)|  | [optional]

### Return type

[**CosmosExportHistoryResponse**](CosmosExportHistoryResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

