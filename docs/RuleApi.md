# RuleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2RuleConditionsGet**](RuleApi.md#apiV2RuleConditionsGet) | **GET** api/v2/Rule/conditions | Get rule conditions.
[**apiV2RuleCountersGet**](RuleApi.md#apiV2RuleCountersGet) | **GET** api/v2/Rule/counters | Get total rule count
[**apiV2RuleGet**](RuleApi.md#apiV2RuleGet) | **GET** api/v2/Rule | Get device certificates list
[**apiV2RulePost**](RuleApi.md#apiV2RulePost) | **POST** api/v2/Rule | Add new rule
[**apiV2RuleRuleGuidDelete**](RuleApi.md#apiV2RuleRuleGuidDelete) | **DELETE** api/v2/Rule/{ruleGuid} | Delete rule
[**apiV2RuleRuleGuidGet**](RuleApi.md#apiV2RuleRuleGuidGet) | **GET** api/v2/Rule/{ruleGuid} | Get details of a single rule
[**apiV2RuleRuleGuidHistoryGet**](RuleApi.md#apiV2RuleRuleGuidHistoryGet) | **GET** api/v2/Rule/{ruleGuid}/history | Get Rule History.
[**apiV2RuleRuleGuidPut**](RuleApi.md#apiV2RuleRuleGuidPut) | **PUT** api/v2/Rule/{ruleGuid} | Update template rule
[**apiV2RuleRuleGuidStatusPut**](RuleApi.md#apiV2RuleRuleGuidStatusPut) | **PUT** api/v2/Rule/{ruleGuid}/status | Update rule status
[**apiV2RuleVerifyPost**](RuleApi.md#apiV2RuleVerifyPost) | **POST** api/v2/Rule/verify | Verify rule condition



Get rule conditions.

&lt;p&gt;This API endpoint provides you rule conditions.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)

val result : RuleConditionResponse = webService.apiV2RuleConditionsGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RuleConditionResponse**](RuleConditionResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get total rule count

&lt;p&gt;This API endpoint provides you the count of available rules.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)

val result : RuleCounterResponse = webService.apiV2RuleCountersGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RuleCounterResponse**](RuleCounterResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device certificates list

&lt;p&gt;Get an entire list of device certificates using this API endpoint. You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name ,status
val isEdge : kotlin.Boolean = true // kotlin.Boolean | IsEdge : Pass value as true to get only those rules which associated with edge template
val isGateway : kotlin.Boolean = true // kotlin.Boolean | IsGateway : Pass value as true to get only those rules which associated with gateway template
val name : kotlin.String = name_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val templateName : kotlin.String = templateName_example // kotlin.String | 
val entityName : kotlin.String = entityName_example // kotlin.String | 
val ruleType : kotlin.String = ruleType_example // kotlin.String | 
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only those rules which associated with low bandwidth template
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | IsIoTEdgeEnable : Pass value as true to get only those rules which associated with Azure IotEdge template
val isSphere : kotlin.Boolean = true // kotlin.Boolean | IsSphere : Pass value as true to get only those rules are sphere template rules

val result : RuleListResponse = webService.apiV2RuleGet(pageNumber, pageSize, sortBy, isEdge, isGateway, name, status, templateName, entityName, ruleType, isLowBandwidth, isIotEdgeEnable, isSphere)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name ,status | [optional]
 **isEdge** | **kotlin.Boolean**| IsEdge : Pass value as true to get only those rules which associated with edge template | [optional]
 **isGateway** | **kotlin.Boolean**| IsGateway : Pass value as true to get only those rules which associated with gateway template | [optional]
 **name** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional]
 **templateName** | **kotlin.String**|  | [optional]
 **entityName** | **kotlin.String**|  | [optional]
 **ruleType** | **kotlin.String**|  | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only those rules which associated with low bandwidth template | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**| IsIoTEdgeEnable : Pass value as true to get only those rules which associated with Azure IotEdge template | [optional]
 **isSphere** | **kotlin.Boolean**| IsSphere : Pass value as true to get only those rules are sphere template rules | [optional]

### Return type

[**RuleListResponse**](RuleListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new rule

&lt;p&gt;Rules enable you to monitor your devices in near real-time and automatically invoke actions, such as send emails, show UI notifications, etc. whenever the rule is matched. In a rule, you can define the condition for which you wish to monitor your device and configure the corresponding actions. Rule triggers when the selected device telemetry crosses a specified threshold mentioned in the condition.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to create rules. Here &lt;i&gt;name&lt;/i&gt;, &lt;i&gt;templateGuid&lt;/i&gt;, &lt;i&gt;severityLevelGuid&lt;/i&gt;, &lt;i&gt;ruleType&lt;/i&gt; and &lt;i&gt;applyTo&lt;/i&gt; are mandatory for any template rule. &lt;i&gt;conditionText&lt;/i&gt; needs a condition on attribute values. If the condition is true, it is considered as the rule matched.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val ruleCreateRequest : RuleCreateRequest =  // RuleCreateRequest | Json object

val result : RuleCreateResponse = webService.apiV2RulePost(ruleCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleCreateRequest** | [**RuleCreateRequest**](RuleCreateRequest.md)| Json object | [optional]

### Return type

[**RuleCreateResponse**](RuleCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Delete rule

&lt;p&gt;This API endpoint allows you to delete a rule. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val ruleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Rule Guid

val result : RuleDeleteResponse = webService.apiV2RuleRuleGuidDelete(ruleGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleGuid** | **java.util.UUID**| Rule Guid |

### Return type

[**RuleDeleteResponse**](RuleDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get details of a single rule

&lt;p&gt;This API endpoint gives you all the available details of a single rule. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val ruleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Rule Guid

val result : RuleDetailResponse = webService.apiV2RuleRuleGuidGet(ruleGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleGuid** | **java.util.UUID**| Rule Guid |

### Return type

[**RuleDetailResponse**](RuleDetailResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get Rule History.

&lt;p&gt;This API endpoint provides you the history of rule.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val ruleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : RuleHistoryResponse = webService.apiV2RuleRuleGuidHistoryGet(ruleGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleGuid** | **java.util.UUID**|  |

### Return type

[**RuleHistoryResponse**](RuleHistoryResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update template rule

&lt;p&gt;Once rules are created, anytime, you may need to change the severity level of a rule, threshold values, or where the rule should apply. You can make such changes in template rule using this API endpoint. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url and rule update details in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val ruleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Rule Guid
val ruleUpdateRequest : RuleUpdateRequest =  // RuleUpdateRequest | Json object

val result : RuleUpdateResponse = webService.apiV2RuleRuleGuidPut(ruleGuid, ruleUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleGuid** | **java.util.UUID**| Rule Guid |
 **ruleUpdateRequest** | [**RuleUpdateRequest**](RuleUpdateRequest.md)| Json object | [optional]

### Return type

[**RuleUpdateResponse**](RuleUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update rule status

&lt;p&gt;This API endpoint allows you to update your rule status. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url and updated status in the request body. Send &lt;i&gt;true&lt;/i&gt; to activate and &lt;i&gt;false&lt;/i&gt; to deactivate a rule.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val ruleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Rule guid
val ruleUpdateStatusRequest : RuleUpdateStatusRequest =  // RuleUpdateStatusRequest | Json object

val result : RuleUpdateStatusResponse = webService.apiV2RuleRuleGuidStatusPut(ruleGuid, ruleUpdateStatusRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleGuid** | **java.util.UUID**| Rule guid |
 **ruleUpdateStatusRequest** | [**RuleUpdateStatusRequest**](RuleUpdateStatusRequest.md)| Json object | [optional]

### Return type

[**RuleUpdateStatusResponse**](RuleUpdateStatusResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Verify rule condition

&lt;p&gt;Once the rule is created or updated, using this API endpoint, you can check whether the rule condition on attributes is valid or not. If not, you will not be able to create or update a rule.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RuleApi::class.java)
val ruleVerifyRequest : RuleVerifyRequest =  // RuleVerifyRequest | Json object

val result : RuleVerifyResponseBaseResponse = webService.apiV2RuleVerifyPost(ruleVerifyRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleVerifyRequest** | [**RuleVerifyRequest**](RuleVerifyRequest.md)| Json object | [optional]

### Return type

[**RuleVerifyResponseBaseResponse**](RuleVerifyResponseBaseResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

