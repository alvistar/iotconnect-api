# DeviceUpdateApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DeviceUpdatesDevicesGet**](DeviceUpdateApi.md#apiV2DeviceUpdatesDevicesGet) | **GET** api/v2/device-updates/devices | Get devices which has tag assigned.
[**apiV2DeviceUpdatesDevicesLookupGet**](DeviceUpdateApi.md#apiV2DeviceUpdatesDevicesLookupGet) | **GET** api/v2/device-updates/devices/lookup | Get device lookup
[**apiV2DeviceUpdatesGet**](DeviceUpdateApi.md#apiV2DeviceUpdatesGet) | **GET** api/v2/device-updates | Get device updates list
[**apiV2DeviceUpdatesImportHistoryGet**](DeviceUpdateApi.md#apiV2DeviceUpdatesImportHistoryGet) | **GET** api/v2/device-updates/import-history | Gets import history
[**apiV2DeviceUpdatesImportUpdatePost**](DeviceUpdateApi.md#apiV2DeviceUpdatesImportUpdatePost) | **POST** api/v2/device-updates/import-update | 
[**apiV2DeviceUpdatesTagsPost**](DeviceUpdateApi.md#apiV2DeviceUpdatesTagsPost) | **POST** api/v2/device-updates/tags | 



Get devices which has tag assigned.

&lt;p&gt;This API endpoint provides you the list of all devices in your company.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceUpdateApi::class.java)
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val searchText : kotlin.String = searchText_example // kotlin.String | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | 

val result : DeviceUpdatesDeviceListResponse = webService.apiV2DeviceUpdatesDevicesGet(pageNumber, pageSize, searchText, sortBy)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **searchText** | **kotlin.String**|  | [optional]
 **sortBy** | **kotlin.String**|  | [optional]

### Return type

[**DeviceUpdatesDeviceListResponse**](DeviceUpdatesDeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device lookup

&lt;p&gt;This API endpoint provides you the lookup of all available devices in your company.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceUpdateApi::class.java)

val result : DeviceUpdatesDeviceLookupResponse = webService.apiV2DeviceUpdatesDevicesLookupGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeviceUpdatesDeviceLookupResponse**](DeviceUpdatesDeviceLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device updates list

&lt;p&gt;This API endpoint provides you the list of device updates.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceUpdateApi::class.java)

val result : DeviceUpdatesListReponse = webService.apiV2DeviceUpdatesGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeviceUpdatesListReponse**](DeviceUpdatesListReponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Gets import history

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceUpdateApi::class.java)

val result : ImportHistoryResponse = webService.apiV2DeviceUpdatesImportHistoryGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ImportHistoryResponse**](ImportHistoryResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceUpdateApi::class.java)
val manifest : java.io.File = BINARY_DATA_HERE // java.io.File | 
val firmwares : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 

val result : ImportUpdateResponse = webService.apiV2DeviceUpdatesImportUpdatePost(manifest, firmwares)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manifest** | **java.io.File**|  | [optional]
 **firmwares** | **kotlin.collections.List&lt;java.io.File&gt;**|  | [optional]

### Return type

[**ImportUpdateResponse**](ImportUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceUpdateApi::class.java)
val deviceBulkTagAssignRequest : DeviceBulkTagAssignRequest =  // DeviceBulkTagAssignRequest | 

val result : DeviceBulkTagAssignResponse = webService.apiV2DeviceUpdatesTagsPost(deviceBulkTagAssignRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceBulkTagAssignRequest** | [**DeviceBulkTagAssignRequest**](DeviceBulkTagAssignRequest.md)|  | [optional]

### Return type

[**DeviceBulkTagAssignResponse**](DeviceBulkTagAssignResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

