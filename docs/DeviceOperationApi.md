# DeviceOperationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataGet**](DeviceOperationApi.md#apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataGet) | **GET** api/v2/company/{companyGuid}/device-operation/{deviceGuid}/archive-data | Device operation history list for archive device telemetry data
[**apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataPost**](DeviceOperationApi.md#apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataPost) | **POST** api/v2/company/{companyGuid}/device-operation/{deviceGuid}/archive-data | Archive device telemetry data



Device operation history list for archive device telemetry data

&lt;p&gt;This API endpoint gives you the list of archive device telemetry data history.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceOperationApi::class.java)
val companyGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Company guid of device
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device guid

val result : DeviceOperationListResponse = webService.apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataGet(companyGuid, deviceGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyGuid** | **java.util.UUID**| Company guid of device |
 **deviceGuid** | **java.util.UUID**| Device guid |

### Return type

[**DeviceOperationListResponse**](DeviceOperationListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Archive device telemetry data

&lt;p&gt;This API endpoint allows you to archive device telemetry data.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceOperationApi::class.java)
val companyGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Company guid of device
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device guid
val deviceDataArchiveRequest : DeviceDataArchiveRequest =  // DeviceDataArchiveRequest | Json object

val result : DeviceDataArchiveResponse = webService.apiV2CompanyCompanyGuidDeviceOperationDeviceGuidArchiveDataPost(companyGuid, deviceGuid, deviceDataArchiveRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyGuid** | **java.util.UUID**| Company guid of device |
 **deviceGuid** | **java.util.UUID**| Device guid |
 **deviceDataArchiveRequest** | [**DeviceDataArchiveRequest**](DeviceDataArchiveRequest.md)| Json object | [optional]

### Return type

[**DeviceDataArchiveResponse**](DeviceDataArchiveResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

