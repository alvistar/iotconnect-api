# TemplateApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DeviceTemplateAuthTypeGet**](TemplateApi.md#apiV2DeviceTemplateAuthTypeGet) | **GET** api/v2/device-template/auth-type | Get Auth Type
[**apiV2DeviceTemplateDatatypeGet**](TemplateApi.md#apiV2DeviceTemplateDatatypeGet) | **GET** api/v2/device-template/datatype | Get datatype list
[**apiV2DeviceTemplateDatatypeTemplateGuidGet**](TemplateApi.md#apiV2DeviceTemplateDatatypeTemplateGuidGet) | **GET** api/v2/device-template/datatype/{templateGuid} | Get datatype list
[**apiV2DeviceTemplateDeviceNotificationGet**](TemplateApi.md#apiV2DeviceTemplateDeviceNotificationGet) | **GET** api/v2/device-template/device/notification | Get device notification list
[**apiV2DeviceTemplateDeviceTemplateGuidGet**](TemplateApi.md#apiV2DeviceTemplateDeviceTemplateGuidGet) | **GET** api/v2/device-template/{deviceTemplateGuid} | Get all the details of single device template
[**apiV2DeviceTemplateDeviceTemplateGuidLookupGet**](TemplateApi.md#apiV2DeviceTemplateDeviceTemplateGuidLookupGet) | **GET** api/v2/device-template/{deviceTemplateGuid}/lookup | Get JSON view of the device template
[**apiV2DeviceTemplateDeviceTemplateTagLookupGet**](TemplateApi.md#apiV2DeviceTemplateDeviceTemplateTagLookupGet) | **GET** api/v2/device-template/{deviceTemplate}/tag-lookup | Get all the tags of a device template
[**apiV2DeviceTemplateGet**](TemplateApi.md#apiV2DeviceTemplateGet) | **GET** api/v2/device-template | Get device template list
[**apiV2DeviceTemplateLookupGet**](TemplateApi.md#apiV2DeviceTemplateLookupGet) | **GET** api/v2/device-template/lookup | Get device template list lookup
[**apiV2DeviceTemplateLookupTrustedPartnersGet**](TemplateApi.md#apiV2DeviceTemplateLookupTrustedPartnersGet) | **GET** api/v2/device-template/lookup/trusted-partners | Get Trusted Partner
[**apiV2DeviceTemplateLookupTwinGet**](TemplateApi.md#apiV2DeviceTemplateLookupTwinGet) | **GET** api/v2/device-template/lookup/twin | Get Templates which have twins.
[**apiV2DeviceTemplatePost**](TemplateApi.md#apiV2DeviceTemplatePost) | **POST** api/v2/device-template | Add new Device Template
[**apiV2DeviceTemplateQuickPost**](TemplateApi.md#apiV2DeviceTemplateQuickPost) | **POST** api/v2/device-template/quick | Add quick Device Template
[**apiV2DeviceTemplateTemplateCodeTemplateCodeGet**](TemplateApi.md#apiV2DeviceTemplateTemplateCodeTemplateCodeGet) | **GET** api/v2/device-template/template-code/{templateCode} | Get all the details of single device template using template code
[**apiV2DeviceTemplateTemplateGuidDelete**](TemplateApi.md#apiV2DeviceTemplateTemplateGuidDelete) | **DELETE** api/v2/device-template/{templateGuid} | Delete device template
[**apiV2DeviceTemplateTemplateGuidExportGet**](TemplateApi.md#apiV2DeviceTemplateTemplateGuidExportGet) | **GET** api/v2/device-template/{templateGuid}/export | Export Template
[**apiV2DeviceTemplateTemplateGuidPropertyPut**](TemplateApi.md#apiV2DeviceTemplateTemplateGuidPropertyPut) | **PUT** api/v2/device-template/{templateGuid}/property | Add/Update device template property.
[**apiV2DeviceTemplateTemplateGuidPut**](TemplateApi.md#apiV2DeviceTemplateTemplateGuidPut) | **PUT** api/v2/device-template/{templateGuid} | Update device template



Get Auth Type

&lt;p&gt;This API endpoint returns auth type.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)

val result : TrustedPartnerLookupResponse = webService.apiV2DeviceTemplateAuthTypeGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TrustedPartnerLookupResponse**](TrustedPartnerLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get datatype list

&lt;p&gt;This API endpoint will give you the list of valid datatypes for attributes.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)

val result : TemplateDataTypeResponse = webService.apiV2DeviceTemplateDatatypeGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TemplateDataTypeResponse**](TemplateDataTypeResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get datatype list

&lt;p&gt;This API endpoint will give you the list of valid datatypes for attributes.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val templateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : TemplateDataTypeResponse = webService.apiV2DeviceTemplateDatatypeTemplateGuidGet(templateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateGuid** | **java.util.UUID**|  |

### Return type

[**TemplateDataTypeResponse**](TemplateDataTypeResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device notification list

&lt;p&gt;This API endpoint will give you the device notification list. Whenever a rule matches for the device, the notifications will be generated.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Device UniqueId
val entityGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Entity Guid
val startDate : kotlin.String = startDate_example // kotlin.String | Start Date, format should be yyyy-MM-dd
val endDate : kotlin.String = endDate_example // kotlin.String | End Date, format should be yyyy-MM-dd
val parentDeviceUniqueId : kotlin.String = parentDeviceUniqueId_example // kotlin.String | Gateway Device UniqueId

val result : TemplateDeviceNotificationResponse = webService.apiV2DeviceTemplateDeviceNotificationGet(pageSize, pageNumber, uniqueId, entityGuid, startDate, endDate, parentDeviceUniqueId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **uniqueId** | **kotlin.String**| Device UniqueId | [optional]
 **entityGuid** | **java.util.UUID**| Entity Guid | [optional]
 **startDate** | **kotlin.String**| Start Date, format should be yyyy-MM-dd | [optional]
 **endDate** | **kotlin.String**| End Date, format should be yyyy-MM-dd | [optional]
 **parentDeviceUniqueId** | **kotlin.String**| Gateway Device UniqueId | [optional]

### Return type

[**TemplateDeviceNotificationResponse**](TemplateDeviceNotificationResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get all the details of single device template

&lt;p&gt;By using this API endpoint, get all the details for given device template guid along with attribute, command and setting details.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val attrTree : kotlin.Boolean = true // kotlin.Boolean | 

val result : TemplateDetailResponse = webService.apiV2DeviceTemplateDeviceTemplateGuidGet(deviceTemplateGuid, attrTree)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |
 **attrTree** | **kotlin.Boolean**|  | [optional]

### Return type

[**TemplateDetailResponse**](TemplateDetailResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get JSON view of the device template

&lt;p&gt;This API endpoint will give you the JSON view lookup of attribute, command and setting details for given device template guid.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid

val result : TemplateDetailLookupResponse = webService.apiV2DeviceTemplateDeviceTemplateGuidLookupGet(deviceTemplateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |

### Return type

[**TemplateDetailLookupResponse**](TemplateDetailLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get all the tags of a device template

&lt;p&gt;Get the list of all available tags in template for given device template guid using this API endpoint.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val deviceTemplate : kotlin.String = deviceTemplate_example // kotlin.String | Device Template Guid/Code
val isSolutionTemplate : kotlin.Boolean = true // kotlin.Boolean | Pass true if code for solution template

val result : TemplateTagListResponse = webService.apiV2DeviceTemplateDeviceTemplateTagLookupGet(deviceTemplate, isSolutionTemplate)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplate** | **kotlin.String**| Device Template Guid/Code |
 **isSolutionTemplate** | **kotlin.Boolean**| Pass true if code for solution template | [optional] [default to false]

### Return type

[**TemplateTagListResponse**](TemplateTagListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device template list

&lt;p&gt;Get the list of available device templates of your company using this API endpoint.&lt;/p&gt;  &lt;p&gt;Though filters are optional, you can add them as given in the parameters. To apply the filters, you need to pass these filters in query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order, Eg: name asc
val authType : kotlin.String = authType_example // kotlin.String | Authentication Type - 1: Key, 2: CA Signed Certificate, 3: Self Signed Certificate, 4: TPM, 5: Symmetric Key
val edgeSupport : kotlin.String = edgeSupport_example // kotlin.String | Pass value as true to get only edge templates
val gatewaySupport : kotlin.String = gatewaySupport_example // kotlin.String | Pass value as true to get only gateway templates
val deviceCount : kotlin.String = deviceCount_example // kotlin.String | Filter for device count
val ruleCount : kotlin.String = ruleCount_example // kotlin.String | Filter for rule count
val attributeCount : kotlin.String = attributeCount_example // kotlin.String | Filter for attribute count
val twinPropertyCount : kotlin.String = twinPropertyCount_example // kotlin.String | Filter for twin property count
val commandCount : kotlin.String = commandCount_example // kotlin.String | Filter for Command count
val deviceTemplateName : kotlin.String = deviceTemplateName_example // kotlin.String | Search with device template name
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | Pass value as true to get only low bandwidth templates
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | Pass value as true to get only iotedgeenable templates
val directMethodCount : kotlin.String = directMethodCount_example // kotlin.String | Filter for direct method count
val isSphere : kotlin.Boolean = true // kotlin.Boolean | Pass value as true to get only sphere templates
val messageVersion : kotlin.String = messageVersion_example // kotlin.String | Filter for Message Type

val result : TemplateListResponse = webService.apiV2DeviceTemplateGet(pageSize, pageNumber, sortBy, authType, edgeSupport, gatewaySupport, deviceCount, ruleCount, attributeCount, twinPropertyCount, commandCount, deviceTemplateName, isLowBandwidth, isIotEdgeEnable, directMethodCount, isSphere, messageVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order, Eg: name asc | [optional]
 **authType** | **kotlin.String**| Authentication Type - 1: Key, 2: CA Signed Certificate, 3: Self Signed Certificate, 4: TPM, 5: Symmetric Key | [optional]
 **edgeSupport** | **kotlin.String**| Pass value as true to get only edge templates | [optional]
 **gatewaySupport** | **kotlin.String**| Pass value as true to get only gateway templates | [optional]
 **deviceCount** | **kotlin.String**| Filter for device count | [optional]
 **ruleCount** | **kotlin.String**| Filter for rule count | [optional]
 **attributeCount** | **kotlin.String**| Filter for attribute count | [optional]
 **twinPropertyCount** | **kotlin.String**| Filter for twin property count | [optional]
 **commandCount** | **kotlin.String**| Filter for Command count | [optional]
 **deviceTemplateName** | **kotlin.String**| Search with device template name | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| Pass value as true to get only low bandwidth templates | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**| Pass value as true to get only iotedgeenable templates | [optional]
 **directMethodCount** | **kotlin.String**| Filter for direct method count | [optional]
 **isSphere** | **kotlin.Boolean**| Pass value as true to get only sphere templates | [optional]
 **messageVersion** | **kotlin.String**| Filter for Message Type | [optional]

### Return type

[**TemplateListResponse**](TemplateListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device template list lookup

&lt;p&gt;This API endpoint will also give you the list of available device templates in your company. However, it provides an option to filter the list based on attributes availability. If you pass &lt;i&gt;true&lt;/i&gt; in &lt;i&gt;hasAttribute&lt;/i&gt; parameter, it will give you the list of device templates with at least one attribute.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val hasAttribute : kotlin.Boolean = true // kotlin.Boolean | For templates with at least one attribute, Pass true
val excludePushUrl : kotlin.Boolean = true // kotlin.Boolean | For templates without pushUrl, Pass true
val hasFirmware : kotlin.Boolean = true // kotlin.Boolean | For templates which are associated with firmware, Pass true
val firmwareGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | For firmware's template detail, Pass firmware guid
val isEdge : kotlin.Boolean = true // kotlin.Boolean | IsEdge : Pass value as true to get only edge templates
val isGateway : kotlin.Boolean = true // kotlin.Boolean | IsGateway : Pass value as true to get only gateway templates
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only low bandwidth templates
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | 
val isSphere : kotlin.Boolean = true // kotlin.Boolean | 

val result : TemplateLookupResponse = webService.apiV2DeviceTemplateLookupGet(hasAttribute, excludePushUrl, hasFirmware, firmwareGuid, isEdge, isGateway, isLowBandwidth, isIotEdgeEnable, isSphere)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hasAttribute** | **kotlin.Boolean**| For templates with at least one attribute, Pass true | [optional]
 **excludePushUrl** | **kotlin.Boolean**| For templates without pushUrl, Pass true | [optional]
 **hasFirmware** | **kotlin.Boolean**| For templates which are associated with firmware, Pass true | [optional] [default to true]
 **firmwareGuid** | **java.util.UUID**| For firmware&#39;s template detail, Pass firmware guid | [optional]
 **isEdge** | **kotlin.Boolean**| IsEdge : Pass value as true to get only edge templates | [optional]
 **isGateway** | **kotlin.Boolean**| IsGateway : Pass value as true to get only gateway templates | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only low bandwidth templates | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**|  | [optional]
 **isSphere** | **kotlin.Boolean**|  | [optional]

### Return type

[**TemplateLookupResponse**](TemplateLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get Trusted Partner

&lt;p&gt;This API endpoint returns trusted partner.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)

val result : TrustedPartnerLookupResponse = webService.apiV2DeviceTemplateLookupTrustedPartnersGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TrustedPartnerLookupResponse**](TrustedPartnerLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get Templates which have twins.

&lt;p&gt;This API endpoint returns template list which have twins.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)

val result : TemplateTwinResponse = webService.apiV2DeviceTemplateLookupTwinGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TemplateTwinResponse**](TemplateTwinResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new Device Template

&lt;p&gt;To manage devices and their associated properties, one needs a pre-defined structure. A device template provides that structure by allowing you to create attributes, settings, properties, rules, commands and much more – all to help you to monitor and manage your device management system efficiently.&lt;/p&gt;  &lt;p&gt;By using the API endpoint of the device template, you can also create gateway supported device templates. To do that, enter &lt;i&gt;tag&lt;/i&gt; parameter value in the request body. You can manage gateways in the same way as any other device of your device management system. you can also create lowbandwidth supported device templates. To do that, enter &lt;i&gt;datalength&lt;/i&gt; parameter value in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val templateCreateRequest : TemplateCreateRequest =  // TemplateCreateRequest | Json object used as input

val result : TemplateCreateResponse = webService.apiV2DeviceTemplatePost(templateCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateCreateRequest** | [**TemplateCreateRequest**](TemplateCreateRequest.md)| Json object used as input | [optional]

### Return type

[**TemplateCreateResponse**](TemplateCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Add quick Device Template

&lt;p&gt;To create a device template with attributes, use this API endpoint. By using provided JSON format in request format, you can add a device template quickly.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val templateJSON : kotlin.String = templateJSON_example // kotlin.String | 

val result : TemplateCreateQuickResponse = webService.apiV2DeviceTemplateQuickPost(file, templateJSON)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**|  | [optional]
 **templateJSON** | **kotlin.String**|  | [optional]

### Return type

[**TemplateCreateQuickResponse**](TemplateCreateQuickResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json


Get all the details of single device template using template code

&lt;p&gt;By using this API endpoint, get all the details for given device template code along with attribute, command and setting details.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val templateCode : kotlin.String = templateCode_example // kotlin.String | Device Template Code

val result : TemplateDetailResponse = webService.apiV2DeviceTemplateTemplateCodeTemplateCodeGet(templateCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateCode** | **kotlin.String**| Device Template Code |

### Return type

[**TemplateDetailResponse**](TemplateDetailResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete device template

&lt;p&gt;To delete a device template, use this API endpoint. To do that, you need to pass a device template guid that you want to delete.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val templateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid

val result : TemplateDeleteResponse = webService.apiV2DeviceTemplateTemplateGuidDelete(templateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateGuid** | **java.util.UUID**| Device Template Guid |

### Return type

[**TemplateDeleteResponse**](TemplateDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Export Template

&lt;p&gt;This API endpoint will export the template details along with template attributes in JSON format for given device template guid. This can be used for adding quick device template API endpoint.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val templateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid

val result : TemplateExportResponse = webService.apiV2DeviceTemplateTemplateGuidExportGet(templateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateGuid** | **java.util.UUID**| Device Template Guid |

### Return type

[**TemplateExportResponse**](TemplateExportResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add/Update device template property.

&lt;p&gt;To add/update a device template property, use this API endpoint. You can only update description, data frequency and file support device template.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val templateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val templatePropertyRequest : TemplatePropertyRequest =  // TemplatePropertyRequest | Template update detail in json object

val result : TemplateUpdateResponse = webService.apiV2DeviceTemplateTemplateGuidPropertyPut(templateGuid, templatePropertyRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateGuid** | **java.util.UUID**| Device Template Guid |
 **templatePropertyRequest** | [**TemplatePropertyRequest**](TemplatePropertyRequest.md)| Template update detail in json object | [optional]

### Return type

[**TemplateUpdateResponse**](TemplateUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update device template

&lt;p&gt;To update a device template, use this API endpoint. You can only update name, description and firmware hardware version of the device template.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TemplateApi::class.java)
val templateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val templateUpdateRequest : TemplateUpdateRequest =  // TemplateUpdateRequest | Template update detail in json object

val result : TemplateUpdateResponse = webService.apiV2DeviceTemplateTemplateGuidPut(templateGuid, templateUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateGuid** | **java.util.UUID**| Device Template Guid |
 **templateUpdateRequest** | [**TemplateUpdateRequest**](TemplateUpdateRequest.md)| Template update detail in json object | [optional]

### Return type

[**TemplateUpdateResponse**](TemplateUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

