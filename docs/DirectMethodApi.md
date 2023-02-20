# DirectMethodApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2TemplateDirectMethodDeviceTemplateGuidGet**](DirectMethodApi.md#apiV2TemplateDirectMethodDeviceTemplateGuidGet) | **GET** api/v2/template-direct-method/{deviceTemplateGuid} | Get device template direct methods list
[**apiV2TemplateDirectMethodDeviceTemplateGuidLookupGet**](DirectMethodApi.md#apiV2TemplateDirectMethodDeviceTemplateGuidLookupGet) | **GET** api/v2/template-direct-method/{deviceTemplateGuid}/lookup | Get device template direct methods lookup
[**apiV2TemplateDirectMethodDirectMethodGuidDelete**](DirectMethodApi.md#apiV2TemplateDirectMethodDirectMethodGuidDelete) | **DELETE** api/v2/template-direct-method/{directMethodGuid} | Delete a direct method
[**apiV2TemplateDirectMethodDirectMethodGuidPut**](DirectMethodApi.md#apiV2TemplateDirectMethodDirectMethodGuidPut) | **PUT** api/v2/template-direct-method/{directMethodGuid} | Update a direct method
[**apiV2TemplateDirectMethodPost**](DirectMethodApi.md#apiV2TemplateDirectMethodPost) | **POST** api/v2/template-direct-method | Add new direct method



Get device template direct methods list

&lt;p&gt;This API endpoint gives you the list of available direct methods in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DirectMethodApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid

val result : DirectMethodListResponse = webService.apiV2TemplateDirectMethodDeviceTemplateGuidGet(deviceTemplateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |

### Return type

[**DirectMethodListResponse**](DirectMethodListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device template direct methods lookup

&lt;p&gt;This API endpoint gives you the lookup list of available direct methods in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DirectMethodApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid

val result : DirectMethodLookupResponse = webService.apiV2TemplateDirectMethodDeviceTemplateGuidLookupGet(deviceTemplateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |

### Return type

[**DirectMethodLookupResponse**](DirectMethodLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete a direct method

&lt;p&gt;You can delete a direct method using this API endpoint. For that, you need to send &lt;i&gt;directMethodGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DirectMethodApi::class.java)
val directMethodGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Direct Method Guid

val result : DirectMethodDeleteResponse = webService.apiV2TemplateDirectMethodDirectMethodGuidDelete(directMethodGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directMethodGuid** | **java.util.UUID**| Direct Method Guid |

### Return type

[**DirectMethodDeleteResponse**](DirectMethodDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update a direct method

&lt;p&gt;This API endpoint allows you to update a direct method. For that, you need to send &lt;i&gt;directMethodGuid&lt;/i&gt; in request url along with the direct method update details in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DirectMethodApi::class.java)
val directMethodGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Direct Method Guid
val directMethodUpdateRequest : DirectMethodUpdateRequest =  // DirectMethodUpdateRequest | Json object

val result : DirectMethodUpdateResponse = webService.apiV2TemplateDirectMethodDirectMethodGuidPut(directMethodGuid, directMethodUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directMethodGuid** | **java.util.UUID**| Direct Method Guid |
 **directMethodUpdateRequest** | [**DirectMethodUpdateRequest**](DirectMethodUpdateRequest.md)| Json object | [optional]

### Return type

[**DirectMethodUpdateResponse**](DirectMethodUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Add new direct method

&lt;p&gt;This API endpoint allows you to Add new Direct Method for given  template.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DirectMethodApi::class.java)
val directMethodCreateRequest : DirectMethodCreateRequest =  // DirectMethodCreateRequest | Json object

val result : DirectMethodCreateResponse = webService.apiV2TemplateDirectMethodPost(directMethodCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directMethodCreateRequest** | [**DirectMethodCreateRequest**](DirectMethodCreateRequest.md)| Json object | [optional]

### Return type

[**DirectMethodCreateResponse**](DirectMethodCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

