# SettingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DeviceDeviceGuidTemplateSettingGet**](SettingApi.md#apiV2DeviceDeviceGuidTemplateSettingGet) | **GET** api/v2/device/{deviceGuid}/template-setting | Get device twin properties list
[**apiV2TemplateSettingDeviceTemplateGuidDevicesLookupGet**](SettingApi.md#apiV2TemplateSettingDeviceTemplateGuidDevicesLookupGet) | **GET** api/v2/template-setting/{deviceTemplateGuid}/devices/lookup | Get top 10 devices by template/solutiontemplate.
[**apiV2TemplateSettingDeviceTemplateGuidGet**](SettingApi.md#apiV2TemplateSettingDeviceTemplateGuidGet) | **GET** api/v2/template-setting/{deviceTemplateGuid} | Get device template twin properties list
[**apiV2TemplateSettingDeviceTemplateGuidLookupGet**](SettingApi.md#apiV2TemplateSettingDeviceTemplateGuidLookupGet) | **GET** api/v2/template-setting/{deviceTemplateGuid}/lookup | Get device template twin properties lookup
[**apiV2TemplateSettingPost**](SettingApi.md#apiV2TemplateSettingPost) | **POST** api/v2/template-setting | Add new twin property
[**apiV2TemplateSettingReadOnlySettingGuidPut**](SettingApi.md#apiV2TemplateSettingReadOnlySettingGuidPut) | **PUT** api/v2/template-setting/readOnly/{settingGuid} | Update a readOnly property
[**apiV2TemplateSettingSettingGuidDelete**](SettingApi.md#apiV2TemplateSettingSettingGuidDelete) | **DELETE** api/v2/template-setting/{settingGuid} | Delete a twin property



Get device twin properties list

&lt;p&gt;This API endpoint provides you the list of available twin properties of a device. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, Eg. name, name asc, name desc etc.
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.

val result : SettingListResponse = webService.apiV2DeviceDeviceGuidTemplateSettingGet(deviceGuid, pageNumber, pageSize, sortBy, searchText)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, Eg. name, name asc, name desc etc. | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]

### Return type

[**SettingListResponse**](SettingListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get top 10 devices by template/solutiontemplate.

&lt;p&gt;This API endpoint gives you the top 10 list of available device twin. for that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid

val result : DeviceLookupByTemplateResponse = webService.apiV2TemplateSettingDeviceTemplateGuidDevicesLookupGet(deviceTemplateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |

### Return type

[**DeviceLookupByTemplateResponse**](DeviceLookupByTemplateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device template twin properties list

&lt;p&gt;This API endpoint gives you the list of available twin properties in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order. Eg. name, name asc, name desc etc.
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.

val result : SettingListResponse = webService.apiV2TemplateSettingDeviceTemplateGuidGet(deviceTemplateGuid, pageNumber, pageSize, sortBy, searchText)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order. Eg. name, name asc, name desc etc. | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]

### Return type

[**SettingListResponse**](SettingListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device template twin properties lookup

&lt;p&gt;This API endpoint gives you the lookup list of available twin properties in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val hasDataValidation : kotlin.Boolean = true // kotlin.Boolean | If true. returns that setting which have data validation.
val isReadOnly : kotlin.Boolean = true // kotlin.Boolean | Get twins readonly setting data.

val result : SettingLookupResponse = webService.apiV2TemplateSettingDeviceTemplateGuidLookupGet(deviceTemplateGuid, hasDataValidation, isReadOnly)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |
 **hasDataValidation** | **kotlin.Boolean**| If true. returns that setting which have data validation. | [optional]
 **isReadOnly** | **kotlin.Boolean**| Get twins readonly setting data. | [optional]

### Return type

[**SettingLookupResponse**](SettingLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new twin property

&lt;p&gt;Device twins are used to synchronize state information between a device and an IoT hub. Device twin is a JSON document, associated with a specific device, and stored by IoT Hub in the cloud where you can query them. Device twin contains desired properties, reported properties, and tags. The desired property is set by a back-end application and read by a device. The reported property is set by a device and read by a back-end application. The tag is set by a back-end application and is never sent to a device. Tags are used to organize devices.&lt;/p&gt;  &lt;p&gt;You can add new twin properties using this API. These properties will be defined in your device template and will be part of your device template. A single template can have one or more twin properties.&lt;/p&gt;  &lt;p&gt;Here name, &lt;i&gt;localName&lt;/i&gt;, &lt;i&gt;defaultValue&lt;/i&gt; and &lt;i&gt;datatype&lt;/i&gt; are mandatory for any twin property. Data validation allows you to set data range or specific data for twin property values.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingApi::class.java)
val settingCreateRequest : SettingCreateRequest =  // SettingCreateRequest | Json object

val result : SettingCreateResponse = webService.apiV2TemplateSettingPost(settingCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingCreateRequest** | [**SettingCreateRequest**](SettingCreateRequest.md)| Json object | [optional]

### Return type

[**SettingCreateResponse**](SettingCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update a readOnly property

&lt;p&gt;This API endpoint allows you to update a twin property. For that, you need to send &lt;i&gt;settingGuid&lt;/i&gt; in request url along with the twin property update details in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingApi::class.java)
val settingGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Twin Property Guid
val templateSettingUpdateReadOnlyRequest : TemplateSettingUpdateReadOnlyRequest =  // TemplateSettingUpdateReadOnlyRequest | Json object

val result : TemplateSettingUpdateReadOnlyResponse = webService.apiV2TemplateSettingReadOnlySettingGuidPut(settingGuid, templateSettingUpdateReadOnlyRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingGuid** | **java.util.UUID**| Twin Property Guid |
 **templateSettingUpdateReadOnlyRequest** | [**TemplateSettingUpdateReadOnlyRequest**](TemplateSettingUpdateReadOnlyRequest.md)| Json object | [optional]

### Return type

[**TemplateSettingUpdateReadOnlyResponse**](TemplateSettingUpdateReadOnlyResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Delete a twin property

&lt;p&gt;You can delete a twin property using this API endpoint. For that, you need to send &lt;i&gt;settingGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingApi::class.java)
val settingGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Twin Property Guid

val result : SettingDeleteResponse = webService.apiV2TemplateSettingSettingGuidDelete(settingGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingGuid** | **java.util.UUID**| Twin Property Guid |

### Return type

[**SettingDeleteResponse**](SettingDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

