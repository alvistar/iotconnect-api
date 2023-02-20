# DeviceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2CompanyCompanyGuidDeviceGet**](DeviceApi.md#apiV2CompanyCompanyGuidDeviceGet) | **GET** api/v2/company/{companyGuid}/device | Get company wise device list
[**apiV2DeviceAuditLogGet**](DeviceApi.md#apiV2DeviceAuditLogGet) | **GET** api/v2/Device/audit-log | Get invalid device communications
[**apiV2DeviceConnectionStatusGet**](DeviceApi.md#apiV2DeviceConnectionStatusGet) | **GET** api/v2/Device/connection-status | Get device connection status
[**apiV2DeviceCountGet**](DeviceApi.md#apiV2DeviceCountGet) | **GET** api/v2/Device/count | Get device count
[**apiV2DeviceCountersGet**](DeviceApi.md#apiV2DeviceCountersGet) | **GET** api/v2/Device/counters | Get device count statistics
[**apiV2DeviceDeviceDashboardCountGet**](DeviceApi.md#apiV2DeviceDeviceDashboardCountGet) | **GET** api/v2/Device/DeviceDashboardCount | Get device dashboard count
[**apiV2DeviceDeviceGuidChildDeviceGet**](DeviceApi.md#apiV2DeviceDeviceGuidChildDeviceGet) | **GET** api/v2/Device/{deviceGuid}/child-device | Get list of child devices
[**apiV2DeviceDeviceGuidDelete**](DeviceApi.md#apiV2DeviceDeviceGuidDelete) | **DELETE** api/v2/Device/{deviceGuid} | Delete a device
[**apiV2DeviceDeviceGuidDirectMethodGet**](DeviceApi.md#apiV2DeviceDeviceGuidDirectMethodGet) | **GET** api/v2/Device/{deviceGuid}/direct-method | Get list of direct method on device
[**apiV2DeviceDeviceGuidDirectMethodPost**](DeviceApi.md#apiV2DeviceDeviceGuidDirectMethodPost) | **POST** api/v2/Device/{deviceGuid}/direct-method | Execute direct method on device
[**apiV2DeviceDeviceGuidGrantGet**](DeviceApi.md#apiV2DeviceDeviceGuidGrantGet) | **GET** api/v2/Device/{deviceGuid}/grant | Get device permissions list
[**apiV2DeviceDeviceGuidGrantPost**](DeviceApi.md#apiV2DeviceDeviceGuidGrantPost) | **POST** api/v2/Device/{deviceGuid}/grant | Grant device permission
[**apiV2DeviceDeviceGuidPropertiesPut**](DeviceApi.md#apiV2DeviceDeviceGuidPropertiesPut) | **PUT** api/v2/Device/{deviceGuid}/properties | Update device properties
[**apiV2DeviceDeviceGuidPropertyDeviceInfoGuidDelete**](DeviceApi.md#apiV2DeviceDeviceGuidPropertyDeviceInfoGuidDelete) | **DELETE** api/v2/Device/{deviceGuid}/property/{deviceInfoGuid} | Delete a device property
[**apiV2DeviceDeviceGuidPut**](DeviceApi.md#apiV2DeviceDeviceGuidPut) | **PUT** api/v2/Device/{deviceGuid} | Update a device
[**apiV2DeviceDeviceGuidStatusPut**](DeviceApi.md#apiV2DeviceDeviceGuidStatusPut) | **PUT** api/v2/Device/{deviceGuid}/status | Update device status
[**apiV2DeviceDeviceTransferEntityGuidPut**](DeviceApi.md#apiV2DeviceDeviceTransferEntityGuidPut) | **PUT** api/v2/Device/device-transfer/{entityGuid} | Update device entity in bulk with file or json
[**apiV2DeviceDiagnosticsPost**](DeviceApi.md#apiV2DeviceDiagnosticsPost) | **POST** api/v2/Device/diagnostics | Get device diagnostics detail
[**apiV2DeviceEntityEntityGuidChangePut**](DeviceApi.md#apiV2DeviceEntityEntityGuidChangePut) | **PUT** api/v2/Device/entity/{entityGuid}/change | Update device entity in bulk with file or json
[**apiV2DeviceGet**](DeviceApi.md#apiV2DeviceGet) | **GET** api/v2/Device | Get Device List
[**apiV2DeviceLookupGet**](DeviceApi.md#apiV2DeviceLookupGet) | **GET** api/v2/Device/lookup | Get device lookup
[**apiV2DevicePost**](DeviceApi.md#apiV2DevicePost) | **POST** api/v2/Device | Add new device
[**apiV2DevicePropertyGet**](DeviceApi.md#apiV2DevicePropertyGet) | **GET** api/v2/Device/property | Get device property list
[**apiV2DevicePropertyPropertyGuidCompanyCompanyGuidDelete**](DeviceApi.md#apiV2DevicePropertyPropertyGuidCompanyCompanyGuidDelete) | **DELETE** api/v2/Device/property/{propertyGuid}/company/{companyGuid} | Delete a device property
[**apiV2DeviceRecentActivityGet**](DeviceApi.md#apiV2DeviceRecentActivityGet) | **GET** api/v2/Device/recent-activity | Get recently acquired device list
[**apiV2DeviceStatisticGet**](DeviceApi.md#apiV2DeviceStatisticGet) | **GET** api/v2/Device/statistic | Get device count statistics
[**apiV2DeviceUnassociatedAttachBulkPut**](DeviceApi.md#apiV2DeviceUnassociatedAttachBulkPut) | **PUT** api/v2/Device/unassociated/attach/bulk | 
[**apiV2DeviceUnassociatedAttachPut**](DeviceApi.md#apiV2DeviceUnassociatedAttachPut) | **PUT** api/v2/Device/unassociated/attach | 
[**apiV2DeviceUnassociatedDeviceGuidDelete**](DeviceApi.md#apiV2DeviceUnassociatedDeviceGuidDelete) | **DELETE** api/v2/Device/unassociated/{deviceGuid} | Delete a unassociated device
[**apiV2DeviceUnassociatedGet**](DeviceApi.md#apiV2DeviceUnassociatedGet) | **GET** api/v2/Device/unassociated | Get Device List
[**apiV2DeviceUniqueIdAcquirePut**](DeviceApi.md#apiV2DeviceUniqueIdAcquirePut) | **PUT** api/v2/Device/{uniqueId}/acquire | Acquire device broker info from cloud
[**apiV2DeviceUniqueIdLifecycleGet**](DeviceApi.md#apiV2DeviceUniqueIdLifecycleGet) | **GET** api/v2/Device/{uniqueId}/lifecycle | Get device life cycle
[**apiV2DeviceUniqueIdReleasePut**](DeviceApi.md#apiV2DeviceUniqueIdReleasePut) | **PUT** api/v2/Device/{uniqueId}/release | Release device from cloud
[**apiV2DeviceUniqueIdTwinGet**](DeviceApi.md#apiV2DeviceUniqueIdTwinGet) | **GET** api/v2/Device/{uniqueId}/twin | Get device twin property list
[**apiV2DeviceUniqueIdTwinPut**](DeviceApi.md#apiV2DeviceUniqueIdTwinPut) | **PUT** api/v2/Device/{uniqueId}/twin | Update device twin property
[**apiV2DeviceUniqueIdTwinjsonGet**](DeviceApi.md#apiV2DeviceUniqueIdTwinjsonGet) | **GET** api/v2/Device/{uniqueId}/twinjson | Get device twin property json
[**apiV2DeviceUniqueIdUniqueIdGet**](DeviceApi.md#apiV2DeviceUniqueIdUniqueIdGet) | **GET** api/v2/Device/uniqueId/{uniqueId} | Get all the details of single device
[**apiV2DeviceUserDevicePermissionUserDevicePermissionGuidPut**](DeviceApi.md#apiV2DeviceUserDevicePermissionUserDevicePermissionGuidPut) | **PUT** api/v2/Device/user-device-permission/{userDevicePermissionGuid} | Update device permissions
[**apiV2DeviceUserDevicePermissionUserDevicePermissionGuidRevokeDelete**](DeviceApi.md#apiV2DeviceUserDevicePermissionUserDevicePermissionGuidRevokeDelete) | **DELETE** api/v2/Device/user-device-permission/{userDevicePermissionGuid}/revoke | Revoke device permissions
[**apiV2EntityEntityGuidDeviceGet**](DeviceApi.md#apiV2EntityEntityGuidDeviceGet) | **GET** api/v2/entity/{entityGuid}/device | Get device list by entityGuid
[**apiV2EntityEntityGuidDevicePut**](DeviceApi.md#apiV2EntityEntityGuidDevicePut) | **PUT** api/v2/entity/{entityGuid}/device | Update device entity in bulk
[**apiV2ImportBatchChildDevicePost**](DeviceApi.md#apiV2ImportBatchChildDevicePost) | **POST** api/v2/import-batch/child-device | Import child devices in batch
[**apiV2ImportBatchGet**](DeviceApi.md#apiV2ImportBatchGet) | **GET** api/v2/import-batch | Get device batch import list
[**apiV2ImportBatchImportBatchGuidGet**](DeviceApi.md#apiV2ImportBatchImportBatchGuidGet) | **GET** api/v2/import-batch/{importBatchGuid} | Get list of all devices from a batch import request
[**apiV2ImportBatchPost**](DeviceApi.md#apiV2ImportBatchPost) | **POST** api/v2/import-batch | Import devices in batch
[**apiV2TemplateTemplateGuidDeviceGet**](DeviceApi.md#apiV2TemplateTemplateGuidDeviceGet) | **GET** api/v2/template/{templateGuid}/device | Get device list by templateGuid



Get company wise device list

&lt;p&gt;Recognize how many devices are registered under one company, using this API endpoint. For that, send &lt;i&gt;companyGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val companyGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The company guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, Eg. uniqueId, uniqueId asc, displayName desc etc.
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.

val result : CompanyWiseDeviceListResponse = webService.apiV2CompanyCompanyGuidDeviceGet(companyGuid, pageNumber, pageSize, sortBy, searchText)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyGuid** | **java.util.UUID**| The company guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, Eg. uniqueId, uniqueId asc, displayName desc etc. | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]

### Return type

[**CompanyWiseDeviceListResponse**](CompanyWiseDeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get invalid device communications

&lt;p&gt;This API endpoint provides you the list of device communication errors of last 3 days.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val date : kotlin.String = date_example // kotlin.String | To fetch specific day data. <i>date</i> is mandatory parameter and should be in valid format of YYYY-MM-DD. Eg: 2020-12-18
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25

val result : InvalidDeviceCommunicationResponse = webService.apiV2DeviceAuditLogGet(date, pageNumber, pageSize)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **kotlin.String**| To fetch specific day data. &lt;i&gt;date&lt;/i&gt; is mandatory parameter and should be in valid format of YYYY-MM-DD. Eg: 2020-12-18 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]

### Return type

[**InvalidDeviceCommunicationResponse**](InvalidDeviceCommunicationResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device connection status

&lt;p&gt;This API endpoint lets you know that the given device is currently connected with the cloud or not. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; or &lt;i&gt;deviceUniqueId&lt;/i&gt; as a query string parameter in the request.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Device Unique Id

val result : ConnectionStatusResponse = webService.apiV2DeviceConnectionStatusGet(deviceGuid, uniqueId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid | [optional]
 **uniqueId** | **kotlin.String**| Device Unique Id | [optional]

### Return type

[**ConnectionStatusResponse**](ConnectionStatusResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device count

&lt;p&gt;Get device count using this API endpoint. You can filter this count by the company and active status. You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val companyguid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Company Guid
val status : kotlin.String = status_example // kotlin.String | Device Status, 'active' to get active device count, 'inactive' to get inactive device count and empty or null value returns all device count.

val result : CountResponse = webService.apiV2DeviceCountGet(companyguid, status)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyguid** | **java.util.UUID**| Company Guid | [optional]
 **status** | **kotlin.String**| Device Status, &#39;active&#39; to get active device count, &#39;inactive&#39; to get inactive device count and empty or null value returns all device count. | [optional] [default to &quot;&quot;]

### Return type

[**CountResponse**](CountResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device count statistics

&lt;p&gt;This API endpoint provides you the variety of statistics of device counts like active count, connected and disconnected count, acquired count, available count and total device count.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val companyguid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Company Guid

val result : CountersResponse = webService.apiV2DeviceCountersGet(companyguid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyguid** | **java.util.UUID**| Company Guid | [optional]

### Return type

[**CountersResponse**](CountersResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device dashboard count

&lt;p&gt;This API endpoint provides you device dashboard count.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val widgetType : kotlin.String = widgetType_example // kotlin.String | type must be certificate, edgegatewaydevice, gatewaydevice, edgedevice, device, withoutedgegatewaydevice, lowbandwidthdevice,unassociateddevice, azuresphere
val entityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Entity guid
val isRecursiveEntity : kotlin.Boolean = true // kotlin.Boolean | Pass 'true' to include child entities device count

val result : DeviceStatisticListResponse = webService.apiV2DeviceDeviceDashboardCountGet(widgetType, entityGuid, isRecursiveEntity)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **widgetType** | **kotlin.String**| type must be certificate, edgegatewaydevice, gatewaydevice, edgedevice, device, withoutedgegatewaydevice, lowbandwidthdevice,unassociateddevice, azuresphere | [optional]
 **entityGuid** | **java.util.UUID**| Entity guid | [optional]
 **isRecursiveEntity** | **kotlin.Boolean**| Pass &#39;true&#39; to include child entities device count | [optional] [default to false]

### Return type

[**DeviceStatisticListResponse**](DeviceStatisticListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get list of child devices

&lt;p&gt;This API endpoint provides you the list of available child devices in a gateway device. For that, you need to send gateway &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The Gateway device guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, Eg. uniqueId, uniqueId asc, displayName desc etc.

val result : ChildDeviceListResponse = webService.apiV2DeviceDeviceGuidChildDeviceGet(deviceGuid, pageNumber, pageSize, sortBy)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| The Gateway device guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, Eg. uniqueId, uniqueId asc, displayName desc etc. | [optional]

### Return type

[**ChildDeviceListResponse**](ChildDeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete a device

&lt;p&gt;To delete a device, use this API endpoint. To do that, you need to send a &lt;i&gt;deviceGuid&lt;/i&gt; in request url that you want to delete. This will also release your device from Azure IoT Hub, even if the device is acquired.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid

val result : DeviceDeleteResponse = webService.apiV2DeviceDeviceGuidDelete(deviceGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |

### Return type

[**DeviceDeleteResponse**](DeviceDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get list of direct method on device

&lt;p&gt;This API endpoint lets you get list of executed direct methods on device.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25

val result : DeviceDirectMethodListResponse = webService.apiV2DeviceDeviceGuidDirectMethodGet(deviceGuid, pageNumber, pageSize)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]

### Return type

[**DeviceDirectMethodListResponse**](DeviceDirectMethodListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Execute direct method on device

&lt;p&gt;This API endpoint lets you execute direct methods on device.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val deviceDirectMethodRequest : DeviceDirectMethodRequest =  // DeviceDirectMethodRequest | 

val result : DeviceDirectMethodResponse = webService.apiV2DeviceDeviceGuidDirectMethodPost(deviceGuid, deviceDirectMethodRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **deviceDirectMethodRequest** | [**DeviceDirectMethodRequest**](DeviceDirectMethodRequest.md)|  | [optional]

### Return type

[**DeviceDirectMethodResponse**](DeviceDirectMethodResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get device permissions list

&lt;p&gt;This API endpoint allows you to get the list of users with their device permissions. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you want the device permissions list.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort By, Eg. name, name asc, name desc etc.
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.

val result : UserDevicePermissionListResponse = webService.apiV2DeviceDeviceGuidGrantGet(deviceGuid, pageNumber, pageSize, sortBy, searchText)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort By, Eg. name, name asc, name desc etc. | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]

### Return type

[**UserDevicePermissionListResponse**](UserDevicePermissionListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Grant device permission

&lt;p&gt;This API endpoint allows you to grant device permissions to users who do not have the right to view or manage devices. For that, you need to send the user’s email id along with the permissions you want to grant to that user in the request body. And send &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you wish to grant the permissions.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val deviceGrantEmailsUpdateRequest : DeviceGrantEmailsUpdateRequest =  // DeviceGrantEmailsUpdateRequest | Json object

val result : DeviceGrantEmailsUpdateResponse = webService.apiV2DeviceDeviceGuidGrantPost(deviceGuid, deviceGrantEmailsUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **deviceGrantEmailsUpdateRequest** | [**DeviceGrantEmailsUpdateRequest**](DeviceGrantEmailsUpdateRequest.md)| Json object | [optional]

### Return type

[**DeviceGrantEmailsUpdateResponse**](DeviceGrantEmailsUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update device properties

&lt;p&gt;This API endpoint helps you to update device properties. For that, you need to send a list of properties with their values in the request body and send &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you want to update the properties.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device guid
val devicePropertyUpdateRequest : DevicePropertyUpdateRequest =  // DevicePropertyUpdateRequest | Json object

val result : DevicePropertyUpdateResponse = webService.apiV2DeviceDeviceGuidPropertiesPut(deviceGuid, devicePropertyUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device guid |
 **devicePropertyUpdateRequest** | [**DevicePropertyUpdateRequest**](DevicePropertyUpdateRequest.md)| Json object | [optional]

### Return type

[**DevicePropertyUpdateResponse**](DevicePropertyUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Delete a device property

&lt;p&gt;This API endpoint allows you to delete a device property. For that, you need to send a device property guid along with the &lt;i&gt;deviceGuid&lt;/i&gt; in request url of which you want to delete a property.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val deviceInfoGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Info Guid

val result : DeviceInfoDeleteResponse = webService.apiV2DeviceDeviceGuidPropertyDeviceInfoGuidDelete(deviceGuid, deviceInfoGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **deviceInfoGuid** | **java.util.UUID**| Device Info Guid |

### Return type

[**DeviceInfoDeleteResponse**](DeviceInfoDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update a device

&lt;p&gt;Device details need to be updated anytime. Use this API endpoint to update your device details. Nevertheless, you can only update the display name, properties, notes and entity of a device. To update device details, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The guid of the device.
val deviceUpdateRequest : DeviceUpdateRequest =  // DeviceUpdateRequest | Json object with device update details.

val result : SuccessResponse = webService.apiV2DeviceDeviceGuidPut(deviceGuid, deviceUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| The guid of the device. |
 **deviceUpdateRequest** | [**DeviceUpdateRequest**](DeviceUpdateRequest.md)| Json object with device update details. | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update device status

&lt;p&gt;This API endpoint allows you to change the status of your device. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url and &lt;i&gt;isActive&lt;/i&gt; in the request body. In &lt;i&gt;isActive&lt;/i&gt;, send &lt;i&gt;true&lt;/i&gt; to activate your device and &lt;i&gt;false&lt;/i&gt; to deactivate your device. When you deactivate your device, this will also release your device from Azure IoT Hub, even if the device is acquired.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val deviceUpdateStatusRequest : DeviceUpdateStatusRequest =  // DeviceUpdateStatusRequest | Json object

val result : SuccessResponse = webService.apiV2DeviceDeviceGuidStatusPut(deviceGuid, deviceUpdateStatusRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **deviceUpdateStatusRequest** | [**DeviceUpdateStatusRequest**](DeviceUpdateStatusRequest.md)| Json object | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update device entity in bulk with file or json

&lt;p&gt;This API endpoint also allows you to update an entity of multiple devices in a single call. For that, you need to send either the list of device guids OR csv file in the request body along with new &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val entityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Entity Guid
val deviceUniqueIds : kotlin.String = deviceUniqueIds_example // kotlin.String | Comma separated device unique Ids. Eg. uniqueId1,uniqueId2,uniqueId3 etc.   This field is required if deviceFile doesn't have value in request.  Note : Duplicate device uniqueId not allowed.
val deviceFile : java.io.File = BINARY_DATA_HERE // java.io.File | Upload devices(uniqueId) in bulk as per the csv sample provided. Please download sample files form your IoTConnect Account.  If deviceUniqueIds and this field are having value then this field consider as first priority for further process and will be ignored deviceUniqueIds field.  Note : Duplicate device uniqueId not allowed.

val result : DeviceEntityBulkUpdateResponse = webService.apiV2DeviceDeviceTransferEntityGuidPut(entityGuid, deviceUniqueIds, deviceFile)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityGuid** | **java.util.UUID**| Entity Guid |
 **deviceUniqueIds** | **kotlin.String**| Comma separated device unique Ids. Eg. uniqueId1,uniqueId2,uniqueId3 etc.   This field is required if deviceFile doesn&#39;t have value in request.  Note : Duplicate device uniqueId not allowed. | [optional]
 **deviceFile** | **java.io.File**| Upload devices(uniqueId) in bulk as per the csv sample provided. Please download sample files form your IoTConnect Account.  If deviceUniqueIds and this field are having value then this field consider as first priority for further process and will be ignored deviceUniqueIds field.  Note : Duplicate device uniqueId not allowed. | [optional]

### Return type

[**DeviceEntityBulkUpdateResponse**](DeviceEntityBulkUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json


Get device diagnostics detail

&lt;p&gt;This API endpoint will give you the diagnostics detail of any device. For that, you need to send device &lt;i&gt;uniqueId&lt;/i&gt;, &lt;i&gt;fromDate&lt;/i&gt; and &lt;i&gt;toDate&lt;/i&gt; in the request path.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceDiagnosticsV2Request : DeviceDiagnosticsV2Request =  // DeviceDiagnosticsV2Request | request object

val result : DeviceDiagnosticsResponse = webService.apiV2DeviceDiagnosticsPost(deviceDiagnosticsV2Request)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceDiagnosticsV2Request** | [**DeviceDiagnosticsV2Request**](DeviceDiagnosticsV2Request.md)| request object | [optional]

### Return type

[**DeviceDiagnosticsResponse**](DeviceDiagnosticsResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update device entity in bulk with file or json

&lt;p&gt;This API endpoint also allows you to update an entity of multiple devices in a single call. For that, you need to send either the list of device guids OR csv file in the request body along with new &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val entityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Entity Guid
val deviceUniqueIds : kotlin.String = deviceUniqueIds_example // kotlin.String | Comma separated device unique Ids. Eg. uniqueId1,uniqueId2,uniqueId3 etc.   This field is required if deviceFile doesn't have value in request.  Note : Duplicate device uniqueId not allowed.
val deviceFile : java.io.File = BINARY_DATA_HERE // java.io.File | Upload devices(uniqueId) in bulk as per the csv sample provided. Please download sample files form your IoTConnect Account.  If deviceUniqueIds and this field are having value then this field consider as first priority for further process and will be ignored deviceUniqueIds field.  Note : Duplicate device uniqueId not allowed.

val result : DeviceEntityBulkUpdateResponse = webService.apiV2DeviceEntityEntityGuidChangePut(entityGuid, deviceUniqueIds, deviceFile)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityGuid** | **java.util.UUID**| Entity Guid |
 **deviceUniqueIds** | **kotlin.String**| Comma separated device unique Ids. Eg. uniqueId1,uniqueId2,uniqueId3 etc.   This field is required if deviceFile doesn&#39;t have value in request.  Note : Duplicate device uniqueId not allowed. | [optional]
 **deviceFile** | **java.io.File**| Upload devices(uniqueId) in bulk as per the csv sample provided. Please download sample files form your IoTConnect Account.  If deviceUniqueIds and this field are having value then this field consider as first priority for further process and will be ignored deviceUniqueIds field.  Note : Duplicate device uniqueId not allowed. | [optional]

### Return type

[**DeviceEntityBulkUpdateResponse**](DeviceEntityBulkUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json


Get Device List

&lt;p&gt;This API endpoint gives you the list of available devices in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, Eg. uniqueId asc, uniqueId desc, displayName etc.
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | The unique id of device
val name : kotlin.String = name_example // kotlin.String | The display name of device
val templateName : kotlin.String = templateName_example // kotlin.String | The device template name
val entityName : kotlin.String = entityName_example // kotlin.String | The entity name
val status : kotlin.String = status_example // kotlin.String | The status of device, Eg. active or inactive
val `property` : kotlin.String = `property`_example // kotlin.String | The custom property name of device
val `value` : kotlin.String = `value`_example // kotlin.String | The custom property value of device
val acquired : kotlin.String = acquired_example // kotlin.String | The device acquire status, Eg. acquired, released or inprogress
val includeRecentValue : kotlin.Boolean = true // kotlin.Boolean | 
val customField : kotlin.Boolean = true // kotlin.Boolean | Include custom fields info, 'true' to include custom poperties of devices and 'false' to exclude
val isEdge : kotlin.Boolean = true // kotlin.Boolean | IsEdge : Pass value as true to get only edge devices
val isGateway : kotlin.Boolean = true // kotlin.Boolean | IsGateway : Pass value as true to get only gateway devices
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only low badnwidth devices
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only low badnwidth devices

val result : DeviceListResponse = webService.apiV2DeviceGet(pageNumber, pageSize, sortBy, uniqueId, name, templateName, entityName, status, `property`, `value`, acquired, includeRecentValue, customField, isEdge, isGateway, isLowBandwidth, isIotEdgeEnable)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, Eg. uniqueId asc, uniqueId desc, displayName etc. | [optional]
 **uniqueId** | **kotlin.String**| The unique id of device | [optional]
 **name** | **kotlin.String**| The display name of device | [optional]
 **templateName** | **kotlin.String**| The device template name | [optional]
 **entityName** | **kotlin.String**| The entity name | [optional]
 **status** | **kotlin.String**| The status of device, Eg. active or inactive | [optional]
 **&#x60;property&#x60;** | **kotlin.String**| The custom property name of device | [optional]
 **&#x60;value&#x60;** | **kotlin.String**| The custom property value of device | [optional]
 **acquired** | **kotlin.String**| The device acquire status, Eg. acquired, released or inprogress | [optional]
 **includeRecentValue** | **kotlin.Boolean**|  | [optional]
 **customField** | **kotlin.Boolean**| Include custom fields info, &#39;true&#39; to include custom poperties of devices and &#39;false&#39; to exclude | [optional] [default to false]
 **isEdge** | **kotlin.Boolean**| IsEdge : Pass value as true to get only edge devices | [optional]
 **isGateway** | **kotlin.Boolean**| IsGateway : Pass value as true to get only gateway devices | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only low badnwidth devices | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only low badnwidth devices | [optional]

### Return type

[**DeviceListResponse**](DeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device lookup

&lt;p&gt;This API endpoint provides you the lookup of all available devices in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | To get device lookup by device template, required to pass device template guid.
val tag : kotlin.String = tag_example // kotlin.String | To get device lookup by device tag.
val iotEdgeEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val getChildDevice : kotlin.Boolean = true // kotlin.Boolean | Required to pass 'true' for getting device lookup along with child devices and 'false' for getting device lookup without child devices.
val excludeEdge : kotlin.Boolean = true // kotlin.Boolean | Required to pass 'false' for getting non-edge device lookup and 'true' for getting edge device lookup.
val deviceEntityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Entity guid

val result : DeviceLookupResponse = webService.apiV2DeviceLookupGet(deviceTemplateGuid, tag, iotEdgeEnabled, getChildDevice, excludeEdge, deviceEntityGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| To get device lookup by device template, required to pass device template guid. | [optional]
 **tag** | **kotlin.String**| To get device lookup by device tag. | [optional]
 **iotEdgeEnabled** | **kotlin.Boolean**|  | [optional]
 **getChildDevice** | **kotlin.Boolean**| Required to pass &#39;true&#39; for getting device lookup along with child devices and &#39;false&#39; for getting device lookup without child devices. | [optional] [default to false]
 **excludeEdge** | **kotlin.Boolean**| Required to pass &#39;false&#39; for getting non-edge device lookup and &#39;true&#39; for getting edge device lookup. | [optional] [default to false]
 **deviceEntityGuid** | **java.util.UUID**| Entity guid | [optional]

### Return type

[**DeviceLookupResponse**](DeviceLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new device

&lt;p&gt;IoT device is a smart device that supports internet connectivity. Through connectivity, established using IoT communication protocols, these devices can interact with other devices. Not only that, it grants remote access to a user for managing the device as per their needs. These devices can be anything from consumer devices, wearables, home appliances, industrial monitoring systems to security systems.&lt;/p&gt;  &lt;p&gt;Add any quantity and a variety of devices using this API endpoint for easy integration with IoTConnect. The approach requires a device template, defining the features and type of your devices. Features include attributes, settings, properties, rules, commands and so on, by applying them on devices, users can monitor and manage.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceCreateRequest : DeviceCreateRequest =  // DeviceCreateRequest | Json object with device details.

val result : DeviceCreateResponse = webService.apiV2DevicePost(deviceCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceCreateRequest** | [**DeviceCreateRequest**](DeviceCreateRequest.md)| Json object with device details. | [optional]

### Return type

[**DeviceCreateResponse**](DeviceCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get device property list

&lt;p&gt;This API endpoint allows you to fetch all device properties list.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)

val result : PropertyListResponse = webService.apiV2DevicePropertyGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PropertyListResponse**](PropertyListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete a device property

&lt;p&gt;This API endpoint allows you to delete a device custom property. For that, you need to send &lt;i&gt;propertyGuid&lt;/i&gt; and &lt;i&gt;companyGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val companyGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Company Guid
val propertyGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Property Guid

val result : PropertyDeleteResponse = webService.apiV2DevicePropertyPropertyGuidCompanyCompanyGuidDelete(companyGuid, propertyGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyGuid** | **java.util.UUID**| Company Guid |
 **propertyGuid** | **java.util.UUID**| Property Guid |

### Return type

[**PropertyDeleteResponse**](PropertyDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get recently acquired device list

&lt;p&gt;Get a recently acquired device list using this API endpoint. You can also add the filters as given in the parameters. These filters allow you to get the list by devices acquired status, connected status, OTA update available status and device active status. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val isAcquired : kotlin.Boolean = true // kotlin.Boolean | Filter by acquired status
val isConnected : kotlin.Boolean = true // kotlin.Boolean | Filter by connected status
val isOtaupdate : kotlin.Boolean = true // kotlin.Boolean | Filter by otaupdate status
val count : kotlin.Int = 56 // kotlin.Int | Number of devices to be displayed
val isActive : kotlin.Boolean = true // kotlin.Boolean | Filter by active status

val result : RecentActivityResponse = webService.apiV2DeviceRecentActivityGet(isAcquired, isConnected, isOtaupdate, count, isActive)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isAcquired** | **kotlin.Boolean**| Filter by acquired status | [optional]
 **isConnected** | **kotlin.Boolean**| Filter by connected status | [optional]
 **isOtaupdate** | **kotlin.Boolean**| Filter by otaupdate status | [optional]
 **count** | **kotlin.Int**| Number of devices to be displayed | [optional]
 **isActive** | **kotlin.Boolean**| Filter by active status | [optional]

### Return type

[**RecentActivityResponse**](RecentActivityResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device count statistics

&lt;p&gt;This API endpoint provides you the variety of statistics of device counts like active count, connected and disconnected count, acquired count, available count and total device count.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val entity : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | entity Guid
val group : kotlin.String = group_example // kotlin.String | group
val recursive : kotlin.Boolean = true // kotlin.Boolean | recursive, 'true' to get device along with child entity device and 'false' to get for passing entity device, default value is true.

val result : DeviceStatisticListResponse = webService.apiV2DeviceStatisticGet(entity, group, recursive)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **java.util.UUID**| entity Guid | [optional]
 **group** | **kotlin.String**| group | [optional]
 **recursive** | **kotlin.Boolean**| recursive, &#39;true&#39; to get device along with child entity device and &#39;false&#39; to get for passing entity device, default value is true. | [optional] [default to true]

### Return type

[**DeviceStatisticListResponse**](DeviceStatisticListResponse.md)

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
val webService = apiClient.createWebservice(DeviceApi::class.java)
val unassociatedAttachBulkRequest : UnassociatedAttachBulkRequest =  // UnassociatedAttachBulkRequest | 

val result : UnassociatedAttachBulkResponse = webService.apiV2DeviceUnassociatedAttachBulkPut(unassociatedAttachBulkRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unassociatedAttachBulkRequest** | [**UnassociatedAttachBulkRequest**](UnassociatedAttachBulkRequest.md)|  | [optional]

### Return type

[**UnassociatedAttachBulkResponse**](UnassociatedAttachBulkResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json




### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val unassociatedAttachRequest : UnassociatedAttachRequest =  // UnassociatedAttachRequest | 

val result : UnassociatedAttachBulkResponse = webService.apiV2DeviceUnassociatedAttachPut(unassociatedAttachRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unassociatedAttachRequest** | [**UnassociatedAttachRequest**](UnassociatedAttachRequest.md)|  | [optional]

### Return type

[**UnassociatedAttachBulkResponse**](UnassociatedAttachBulkResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Delete a unassociated device

&lt;p&gt;To delete a device, use this API endpoint. To do that, you need to send a &lt;i&gt;deviceGuid&lt;/i&gt; in request url that you want to delete.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid

val result : DeviceDeleteResponse = webService.apiV2DeviceUnassociatedDeviceGuidDelete(deviceGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |

### Return type

[**DeviceDeleteResponse**](DeviceDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get Device List

&lt;p&gt;This API endpoint gives you the list of available devices in your company.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, Eg. uniqueId asc, uniqueId desc, displayName asc,displayName desc and createdDate asc,createdDate Desc etc.
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | The unique id of device
val entityName : kotlin.String = entityName_example // kotlin.String | The entity name
val name : kotlin.String = name_example // kotlin.String | The entity name
val `property` : kotlin.String = `property`_example // kotlin.String | The custom property name of device
val `value` : kotlin.String = `value`_example // kotlin.String | The custom property value of device
val customField : kotlin.Boolean = true // kotlin.Boolean | Include custom fields info, 'true' to include custom poperties of devices and 'false' to exclude
val hasAllottedDevice : kotlin.Boolean = true // kotlin.Boolean | 

val result : UnassociatedDeviceListResponse = webService.apiV2DeviceUnassociatedGet(pageNumber, pageSize, sortBy, uniqueId, entityName, name, `property`, `value`, customField, hasAllottedDevice)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, Eg. uniqueId asc, uniqueId desc, displayName asc,displayName desc and createdDate asc,createdDate Desc etc. | [optional]
 **uniqueId** | **kotlin.String**| The unique id of device | [optional]
 **entityName** | **kotlin.String**| The entity name | [optional]
 **name** | **kotlin.String**| The entity name | [optional]
 **&#x60;property&#x60;** | **kotlin.String**| The custom property name of device | [optional]
 **&#x60;value&#x60;** | **kotlin.String**| The custom property value of device | [optional]
 **customField** | **kotlin.Boolean**| Include custom fields info, &#39;true&#39; to include custom poperties of devices and &#39;false&#39; to exclude | [optional] [default to false]
 **hasAllottedDevice** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**UnassociatedDeviceListResponse**](UnassociatedDeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Acquire device broker info from cloud

&lt;p&gt;In simple words, &lt;i&gt;acquire a device&lt;/i&gt; means registering your device on Azure IoT Hub. When you add a device, it adds in IoTConnect only. However, to transmit data from one device to the other, you need to register a device with Azure IoT Hub.&lt;/p&gt;  &lt;p&gt;To acquire your device, use this API endpoint. To do that, send device &lt;i&gt;uniqueID&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | The unique id of device
val deviceAcquireRequest : DeviceAcquireRequest =  // DeviceAcquireRequest | Json object

val result : SuccessResponse = webService.apiV2DeviceUniqueIdAcquirePut(uniqueId, deviceAcquireRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| The unique id of device |
 **deviceAcquireRequest** | [**DeviceAcquireRequest**](DeviceAcquireRequest.md)| Json object | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get device life cycle

&lt;p&gt;This API endpoint allows you to get the life cycle of any device. Device life cycle will give you details of all the actions performed on devices, from when the device was created, updated, acquired, released, entity changed to deleted. It also gives you the information about who performed these actions and the time when it was performed. To get the device life cycle, you need to send a device’s unique id in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Device Unique Id
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val searchtext : kotlin.String = searchtext_example // kotlin.String | To search for specific texts in the list.
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort By, Eg. changeDate asc, changeDate desc, changeDate etc.

val result : DeviceLifeCycleResponse = webService.apiV2DeviceUniqueIdLifecycleGet(uniqueId, pageSize, pageNumber, searchtext, sortBy)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| Device Unique Id |
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **searchtext** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **sortBy** | **kotlin.String**| Sort By, Eg. changeDate asc, changeDate desc, changeDate etc. | [optional]

### Return type

[**DeviceLifeCycleResponse**](DeviceLifeCycleResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Release device from cloud

&lt;p&gt;This API endpoint is used to release or remove your IoT device from Azure IoT Hub. For that, you need to send device Unique ID in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | The unique id of device

val result : SuccessResponse = webService.apiV2DeviceUniqueIdReleasePut(uniqueId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| The unique id of device |

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device twin property list

&lt;p&gt;Get a twin property list of any device using this API. For that, you need to send device &lt;i&gt;uniqueId&lt;/i&gt; in request url of which you want to get the twin property list. &lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Device Unique Id
val recentlyReported : kotlin.Boolean = true // kotlin.Boolean | Send true to get 10 twin properties whose reported values updated recently.

val result : DeviceTwinListResponse = webService.apiV2DeviceUniqueIdTwinGet(uniqueId, recentlyReported)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| Device Unique Id |
 **recentlyReported** | **kotlin.Boolean**| Send true to get 10 twin properties whose reported values updated recently. | [optional]

### Return type

[**DeviceTwinListResponse**](DeviceTwinListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update device twin property

&lt;p&gt;This API endpoint allows you to update the twin property of a device. For that, you need to send &lt;i&gt;localName&lt;/i&gt;, &lt;i&gt;desiredValue&lt;/i&gt; and &lt;i&gt;templateSettingGuid&lt;/i&gt; in request body along with the device uniqueId in request url of which you look to update the twin property.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Device Unique Id
val deviceTwinRequest : DeviceTwinRequest =  // DeviceTwinRequest | Json object

val result : DeviceTwinResponse = webService.apiV2DeviceUniqueIdTwinPut(uniqueId, deviceTwinRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| Device Unique Id |
 **deviceTwinRequest** | [**DeviceTwinRequest**](DeviceTwinRequest.md)| Json object | [optional]

### Return type

[**DeviceTwinResponse**](DeviceTwinResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get device twin property json

&lt;p&gt;Get a twin property json of any device using this API. For that, you need to send device &lt;i&gt;uniqueId&lt;/i&gt; in request url of which you want to get the twin property json.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Device Unique Id

val result : DeviceTwinJsonResponse = webService.apiV2DeviceUniqueIdTwinjsonGet(uniqueId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| Device Unique Id |

### Return type

[**DeviceTwinJsonResponse**](DeviceTwinJsonResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get all the details of single device

&lt;p&gt;Getting all the details of a device, including firmware update, device availability and when it was last connected, etc., is critical for any user. To get all the details of a device, you need to send the device &lt;i&gt;uniqueId&lt;/i&gt; in request url. Moreover, if you wish to fetch child device details, send gateway device &lt;i&gt;uniqueId&lt;/i&gt; in &lt;i&gt;parentDeviceUniqueId&lt;/i&gt; parameter of a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Device Unique Id
val parentDeviceUniqueId : kotlin.String = parentDeviceUniqueId_example // kotlin.String | Gateway Device Unique Id

val result : DeviceInformationResponse = webService.apiV2DeviceUniqueIdUniqueIdGet(uniqueId, parentDeviceUniqueId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| Device Unique Id |
 **parentDeviceUniqueId** | **kotlin.String**| Gateway Device Unique Id | [optional]

### Return type

[**DeviceInformationResponse**](DeviceInformationResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update device permissions

&lt;p&gt;This API endpoint lets you update user’s device permissions. For that, you need to send &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; in request url along with permissions in the request body. &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; is a unique id for the combination of users and devices.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val userDevicePermissionGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | User device permission guid
val userDevicePermissionUpdateRequest : UserDevicePermissionUpdateRequest =  // UserDevicePermissionUpdateRequest | 

val result : UserDevicePermissionUpdateResponse = webService.apiV2DeviceUserDevicePermissionUserDevicePermissionGuidPut(userDevicePermissionGuid, userDevicePermissionUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userDevicePermissionGuid** | **java.util.UUID**| User device permission guid |
 **userDevicePermissionUpdateRequest** | [**UserDevicePermissionUpdateRequest**](UserDevicePermissionUpdateRequest.md)|  | [optional]

### Return type

[**UserDevicePermissionUpdateResponse**](UserDevicePermissionUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Revoke device permissions

&lt;p&gt;This API endpoint allows you to revoke all the device permissions for any user. For that, you need to send &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; in request url. &lt;i&gt;userDevicePermissionGuid&lt;/i&gt; is a unique id for the combination of users and devices.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val userDevicePermissionGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | User device permission guid

val result : UserDevicePermissionRevokeResponse = webService.apiV2DeviceUserDevicePermissionUserDevicePermissionGuidRevokeDelete(userDevicePermissionGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userDevicePermissionGuid** | **java.util.UUID**| User device permission guid |

### Return type

[**UserDevicePermissionRevokeResponse**](UserDevicePermissionRevokeResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device list by entityGuid

&lt;p&gt;Know how many devices are registered under one entity, using this API endpoint. To know that, send &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val entityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The entity guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, eg: uniqueId, deviceTemplateName, uniqueId asc, displayName desc etc.
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | The unique id of device
val name : kotlin.String = name_example // kotlin.String | The display name of device
val templateName : kotlin.String = templateName_example // kotlin.String | The device template name
val entityName : kotlin.String = entityName_example // kotlin.String | The entity name
val status : kotlin.String = status_example // kotlin.String | The status of device, Eg. active or inactive
val `property` : kotlin.String = `property`_example // kotlin.String | The custom property name of device
val `value` : kotlin.String = `value`_example // kotlin.String | The custom property value of device
val acquired : kotlin.String = acquired_example // kotlin.String | The device acquire status, Eg. acquired, released or inprogress
val isEdge : kotlin.Boolean = true // kotlin.Boolean | IsEdge : Pass value as true to get only edge devices
val isGateway : kotlin.Boolean = true // kotlin.Boolean | IsGateway : Pass value as true to get only gateway devices
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only low badnwidth devices
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | 

val result : DeviceListResponse = webService.apiV2EntityEntityGuidDeviceGet(entityGuid, pageNumber, pageSize, sortBy, uniqueId, name, templateName, entityName, status, `property`, `value`, acquired, isEdge, isGateway, isLowBandwidth, isIotEdgeEnable)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityGuid** | **java.util.UUID**| The entity guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, eg: uniqueId, deviceTemplateName, uniqueId asc, displayName desc etc. | [optional]
 **uniqueId** | **kotlin.String**| The unique id of device | [optional]
 **name** | **kotlin.String**| The display name of device | [optional]
 **templateName** | **kotlin.String**| The device template name | [optional]
 **entityName** | **kotlin.String**| The entity name | [optional]
 **status** | **kotlin.String**| The status of device, Eg. active or inactive | [optional]
 **&#x60;property&#x60;** | **kotlin.String**| The custom property name of device | [optional]
 **&#x60;value&#x60;** | **kotlin.String**| The custom property value of device | [optional]
 **acquired** | **kotlin.String**| The device acquire status, Eg. acquired, released or inprogress | [optional]
 **isEdge** | **kotlin.Boolean**| IsEdge : Pass value as true to get only edge devices | [optional]
 **isGateway** | **kotlin.Boolean**| IsGateway : Pass value as true to get only gateway devices | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only low badnwidth devices | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**|  | [optional]

### Return type

[**DeviceListResponse**](DeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update device entity in bulk

&lt;p&gt;This API endpoint helps you to update an entity of multiple devices in a single call. For that, send the list of deviceGuids in the request body along with new &lt;i&gt;entityGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val entityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Entity Guid
val deviceGuids : kotlin.collections.List<DeviceGuids> =  // kotlin.collections.List<DeviceGuids> | Device guid list

val result : DeviceEntityUpdateResponse = webService.apiV2EntityEntityGuidDevicePut(entityGuid, deviceGuids)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityGuid** | **java.util.UUID**| Entity Guid |
 **deviceGuids** | [**kotlin.collections.List&lt;DeviceGuids&gt;**](DeviceGuids.md)| Device guid list | [optional]

### Return type

[**DeviceEntityUpdateResponse**](DeviceEntityUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Import child devices in batch

&lt;p&gt;This API endpoint helps you to create child devices in bulk for a gateway device. For that, you need to upload a JSON file in the &lt;i&gt;file&lt;/i&gt; parameter, containing the list of child devices that you want to create. Along with the gateway device, send &lt;i&gt;uniqueId&lt;/i&gt; in &lt;i&gt;deviceUniqueId&lt;/i&gt; parameter for which you want to create these devices.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceUniqueId : kotlin.String = deviceUniqueId_example // kotlin.String | The device unique id of gateway device
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The json file as per the file sample provided.Please download sample files form your IoTConnect Account.              <p><b>Notes :</b> file should be valid file, file content should be valid JSON in file, uniqueId is required,               device property key is required if passing properties of the device,              device uniqueId should be valid, not allowed duplicate device uniqueId, device tag is required and device tag should be valid </p>

val result : DeviceBatchImportChildResponse = webService.apiV2ImportBatchChildDevicePost(deviceUniqueId, file)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceUniqueId** | **kotlin.String**| The device unique id of gateway device |
 **file** | **java.io.File**| The json file as per the file sample provided.Please download sample files form your IoTConnect Account.              &lt;p&gt;&lt;b&gt;Notes :&lt;/b&gt; file should be valid file, file content should be valid JSON in file, uniqueId is required,               device property key is required if passing properties of the device,              device uniqueId should be valid, not allowed duplicate device uniqueId, device tag is required and device tag should be valid &lt;/p&gt; |

### Return type

[**DeviceBatchImportChildResponse**](DeviceBatchImportChildResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json


Get device batch import list

&lt;p&gt;This API endpoint provides you the list of all imported device batches. This will give you the current status of all batch import along with the count of device insert success and failure.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val deviceGuid : kotlin.String = deviceGuid_example // kotlin.String | Device(gateway) guid to get child import list
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order. Eg. createdDate desc, createdDate asc, createdDate.

val result : DeviceImportListResponse = webService.apiV2ImportBatchGet(deviceGuid, pageNumber, pageSize, sortBy)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **kotlin.String**| Device(gateway) guid to get child import list | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order. Eg. createdDate desc, createdDate asc, createdDate. | [optional]

### Return type

[**DeviceImportListResponse**](DeviceImportListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get list of all devices from a batch import request

&lt;p&gt;This API endpoint delivers you the list of all devices which had been requested to create via batch import request. For that, you need to send a batch import guid in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val importBatchGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Import batch guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order. Eg. createdDate desc, createdDate asc, createdDate.
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.

val result : DeviceImportListByGuidResponse = webService.apiV2ImportBatchImportBatchGuidGet(importBatchGuid, pageNumber, pageSize, sortBy, searchText)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importBatchGuid** | **java.util.UUID**| Import batch guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order. Eg. createdDate desc, createdDate asc, createdDate. | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]

### Return type

[**DeviceImportListByGuidResponse**](DeviceImportListByGuidResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Import devices in batch

&lt;p&gt;This API endpoint helps to create devices in bulk for the given entity guid and template code. For that, upload a JSON file in the &lt;i&gt;file&lt;/i&gt; parameter, containing a template code and list of devices that you want to create under a given template code. Along with that, you also need to send entity guid in &lt;i&gt;entityGuid&lt;/i&gt; parameter under which you want to create devices. This also allows you to make gateway devices in bulk. To add child devices, you need to put them under your gateway device in a JSON file.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val entityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The entity guid
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The json file as per the file sample provided.Please download sample files form your IoTConnect Account.              <p><b>Notes :</b> File should be valid file, file content should be valid JSON, the device template code (dtCode) is required,              dtCode should be valid, the device uniqueId is required, not allowed duplicate uniqueId for parent devices,              uniqueId should be valid, not allowed duplicate child device uniqueId within parent device,              device tag should be valid, self or CA signed parent device uniqueId length should be less than or equal to 31 characters,              self or CA signed child device uniqueId length should be less than or equal to 64 characters,              TPM and Key device (parent/child) uniqueId length should be less than or equal to 128 characters,              device property key is required if passing properties of the device, not allowed duplicate property key, tag is required for gateway child device </p>
val templateType : kotlin.String = templateType_example // kotlin.String | templateType should be device, edgeDevice, gatewayDevice, edgeGatewayDevice, lowBandwidthDevice or iotEdgeEnableDevice
val certificateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The root certificate guid

val result : DeviceBatchImportResponse = webService.apiV2ImportBatchPost(entityGuid, file, templateType, certificateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityGuid** | **java.util.UUID**| The entity guid |
 **file** | **java.io.File**| The json file as per the file sample provided.Please download sample files form your IoTConnect Account.              &lt;p&gt;&lt;b&gt;Notes :&lt;/b&gt; File should be valid file, file content should be valid JSON, the device template code (dtCode) is required,              dtCode should be valid, the device uniqueId is required, not allowed duplicate uniqueId for parent devices,              uniqueId should be valid, not allowed duplicate child device uniqueId within parent device,              device tag should be valid, self or CA signed parent device uniqueId length should be less than or equal to 31 characters,              self or CA signed child device uniqueId length should be less than or equal to 64 characters,              TPM and Key device (parent/child) uniqueId length should be less than or equal to 128 characters,              device property key is required if passing properties of the device, not allowed duplicate property key, tag is required for gateway child device &lt;/p&gt; |
 **templateType** | **kotlin.String**| templateType should be device, edgeDevice, gatewayDevice, edgeGatewayDevice, lowBandwidthDevice or iotEdgeEnableDevice | [optional]
 **certificateGuid** | **java.util.UUID**| The root certificate guid | [optional]

### Return type

[**DeviceBatchImportResponse**](DeviceBatchImportResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json


Get device list by templateGuid

&lt;p&gt;This API endpoint helps you to find out how many devices are registered under one device template. To find that out, send device &lt;i&gt;templateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceApi::class.java)
val templateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The device template guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, Eg. uniqueId, deviceTemplateName, uniqueId asc, displayName desc etc.
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | The unique id of device
val name : kotlin.String = name_example // kotlin.String | The display name of device
val templateName : kotlin.String = templateName_example // kotlin.String | The device template name
val entityName : kotlin.String = entityName_example // kotlin.String | The entity name
val status : kotlin.String = status_example // kotlin.String | The status of device, Eg. active or inactive
val `property` : kotlin.String = `property`_example // kotlin.String | The custom property name of device
val `value` : kotlin.String = `value`_example // kotlin.String | The custom property value of device
val acquired : kotlin.String = acquired_example // kotlin.String | The device acquire status, Eg. acquired, released or inprogress
val isEdge : kotlin.Boolean = true // kotlin.Boolean | IsEdge : Pass value as true to get only edge devices
val isGateway : kotlin.Boolean = true // kotlin.Boolean | IsGateway : Pass value as true to get only gateway devices
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only low badnwidth devices
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | 

val result : DeviceListResponse = webService.apiV2TemplateTemplateGuidDeviceGet(templateGuid, pageNumber, pageSize, sortBy, uniqueId, name, templateName, entityName, status, `property`, `value`, acquired, isEdge, isGateway, isLowBandwidth, isIotEdgeEnable)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateGuid** | **java.util.UUID**| The device template guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, Eg. uniqueId, deviceTemplateName, uniqueId asc, displayName desc etc. | [optional]
 **uniqueId** | **kotlin.String**| The unique id of device | [optional]
 **name** | **kotlin.String**| The display name of device | [optional]
 **templateName** | **kotlin.String**| The device template name | [optional]
 **entityName** | **kotlin.String**| The entity name | [optional]
 **status** | **kotlin.String**| The status of device, Eg. active or inactive | [optional]
 **&#x60;property&#x60;** | **kotlin.String**| The custom property name of device | [optional]
 **&#x60;value&#x60;** | **kotlin.String**| The custom property value of device | [optional]
 **acquired** | **kotlin.String**| The device acquire status, Eg. acquired, released or inprogress | [optional]
 **isEdge** | **kotlin.Boolean**| IsEdge : Pass value as true to get only edge devices | [optional]
 **isGateway** | **kotlin.Boolean**| IsGateway : Pass value as true to get only gateway devices | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only low badnwidth devices | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**|  | [optional]

### Return type

[**DeviceListResponse**](DeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

