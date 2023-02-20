# AttributeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2TemplateAttributeAttributeGuidDelete**](AttributeApi.md#apiV2TemplateAttributeAttributeGuidDelete) | **DELETE** api/v2/template-attribute/{attributeGuid} | Delete a template attribute
[**apiV2TemplateAttributeAttributeGuidPut**](AttributeApi.md#apiV2TemplateAttributeAttributeGuidPut) | **PUT** api/v2/template-attribute/{attributeGuid} | Update template attribute
[**apiV2TemplateAttributeAttributeGuidSequencePut**](AttributeApi.md#apiV2TemplateAttributeAttributeGuidSequencePut) | **PUT** api/v2/template-attribute/{attributeGuid}/sequence | Update template attribute sequence
[**apiV2TemplateAttributeDeviceTemplateGuidGet**](AttributeApi.md#apiV2TemplateAttributeDeviceTemplateGuidGet) | **GET** api/v2/template-attribute/{deviceTemplateGuid} | Get template attribute list
[**apiV2TemplateAttributeDeviceTemplateGuidLookupGet**](AttributeApi.md#apiV2TemplateAttributeDeviceTemplateGuidLookupGet) | **GET** api/v2/template-attribute/{deviceTemplateGuid}/lookup | Get device template attribute lookup
[**apiV2TemplateAttributePost**](AttributeApi.md#apiV2TemplateAttributePost) | **POST** api/v2/template-attribute | Add new template attribute



Delete a template attribute

&lt;p&gt;This API endpoint allows you to delete a device template attribute. For that, you need to send &lt;i&gt;attributeGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AttributeApi::class.java)
val attributeGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template Attribute Guid

val result : AttributeDeleteResponse = webService.apiV2TemplateAttributeAttributeGuidDelete(attributeGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeGuid** | **java.util.UUID**| Template Attribute Guid |

### Return type

[**AttributeDeleteResponse**](AttributeDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update template attribute

&lt;p&gt;This API endpoint allows you to update the details of a device template attribute. For that, you need to send &lt;i&gt;attributeGuid&lt;/i&gt; in request url and attribute update details in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AttributeApi::class.java)
val attributeGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template Attribute Guid
val attributeUpdateRequest : AttributeUpdateRequest =  // AttributeUpdateRequest | Attribute update detail json object

val result : SuccessResponse = webService.apiV2TemplateAttributeAttributeGuidPut(attributeGuid, attributeUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeGuid** | **java.util.UUID**| Template Attribute Guid |
 **attributeUpdateRequest** | [**AttributeUpdateRequest**](AttributeUpdateRequest.md)| Attribute update detail json object | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update template attribute sequence

&lt;p&gt;This API endpoint helps you to update a device template attribute sequence. For that, you need to send &lt;i&gt;attributeGuid&lt;/i&gt; in request url and sequence number in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AttributeApi::class.java)
val attributeGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template Attribute Guid
val attributeUpdateSequenceRequest : AttributeUpdateSequenceRequest =  // AttributeUpdateSequenceRequest | Attribute json object

val result : AttributeUpdateSequenceResponse = webService.apiV2TemplateAttributeAttributeGuidSequencePut(attributeGuid, attributeUpdateSequenceRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeGuid** | **java.util.UUID**| Template Attribute Guid |
 **attributeUpdateSequenceRequest** | [**AttributeUpdateSequenceRequest**](AttributeUpdateSequenceRequest.md)| Attribute json object | [optional]

### Return type

[**AttributeUpdateSequenceResponse**](AttributeUpdateSequenceResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get template attribute list

&lt;p&gt;This API endpoint gives you the list of available template attributes of your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AttributeApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val searchtext : kotlin.String = searchtext_example // kotlin.String | To search for specific texts in the list.
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order. Eg. sequence, sequence asc, sequence desc etc
val tag : kotlin.String = tag_example // kotlin.String | Tag

val result : AttributeListResponse = webService.apiV2TemplateAttributeDeviceTemplateGuidGet(deviceTemplateGuid, pageSize, pageNumber, searchtext, sortBy, tag)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **searchtext** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order. Eg. sequence, sequence asc, sequence desc etc | [optional]
 **tag** | **kotlin.String**| Tag | [optional]

### Return type

[**AttributeListResponse**](AttributeListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device template attribute lookup

&lt;p&gt;This API endpoint provides you the lookup list of available template attributes in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AttributeApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid

val result : AttributeLookupResponse = webService.apiV2TemplateAttributeDeviceTemplateGuidLookupGet(deviceTemplateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |

### Return type

[**AttributeLookupResponse**](AttributeLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new template attribute

&lt;p&gt;This API endpoint allows you to create device template attributes. Attributes will be defined in your device template. One template can have one or more attributes. Your IoT devices will send the data for these template attributes.&lt;/p&gt;  &lt;p&gt;Here, &lt;i&gt;localName&lt;/i&gt; and &lt;i&gt;datatype&lt;/i&gt; are mandatory for any attribute, while a tag is mandatory for gateway supported templates only. The datatype of your attribute is predefined. If you select object datatype, you will be able to add child attributes for that attribute. Data validation allows you to set data numChar or specific data for attribute values.&lt;/p&gt;  &lt;p&gt;For Edge Enabled device, template must contain at least one attribute with datatype &#39;Number&#39; to send data to Hub.&lt;/p&gt;  &lt;p&gt;For Lowbandwidth Enabled device, template attribute must required startIndex and numChar.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AttributeApi::class.java)
val attributeCreateRequest : AttributeCreateRequest =  // AttributeCreateRequest | Json object

val result : AttributeCreateResponse = webService.apiV2TemplateAttributePost(attributeCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeCreateRequest** | [**AttributeCreateRequest**](AttributeCreateRequest.md)| Json object | [optional]

### Return type

[**AttributeCreateResponse**](AttributeCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

