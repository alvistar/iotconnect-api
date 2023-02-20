# CommandApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2TemplateCommandBatchBatchGuidGet**](CommandApi.md#apiV2TemplateCommandBatchBatchGuidGet) | **GET** api/v2/template-command/batch/{batchGuid} | Get executed command list by batch
[**apiV2TemplateCommandCommandGuidDelete**](CommandApi.md#apiV2TemplateCommandCommandGuidDelete) | **DELETE** api/v2/template-command/{commandGuid} | Delete a command
[**apiV2TemplateCommandCommandGuidPut**](CommandApi.md#apiV2TemplateCommandCommandGuidPut) | **PUT** api/v2/template-command/{commandGuid} | Update template command
[**apiV2TemplateCommandCommandScheduleCommandScheduleGuidDelete**](CommandApi.md#apiV2TemplateCommandCommandScheduleCommandScheduleGuidDelete) | **DELETE** api/v2/template-command/CommandSchedule/{commandScheduleGuid} | Delete a scheduled command
[**apiV2TemplateCommandCommandScheduleCommandScheduleGuidGet**](CommandApi.md#apiV2TemplateCommandCommandScheduleCommandScheduleGuidGet) | **GET** api/v2/template-command/CommandSchedule/{CommandScheduleGuid} | Get scheduled command detail
[**apiV2TemplateCommandCommandScheduleCommandScheduleGuidPut**](CommandApi.md#apiV2TemplateCommandCommandScheduleCommandScheduleGuidPut) | **PUT** api/v2/template-command/CommandSchedule/{commandScheduleGuid} | Update a scheduled command
[**apiV2TemplateCommandCommandScheduleCommandScheduleGuidStatusPut**](CommandApi.md#apiV2TemplateCommandCommandScheduleCommandScheduleGuidStatusPut) | **PUT** api/v2/template-command/CommandSchedule/{commandScheduleGuid}/status | Update scheduled command Status
[**apiV2TemplateCommandCommandScheduleGet**](CommandApi.md#apiV2TemplateCommandCommandScheduleGet) | **GET** api/v2/template-command/CommandSchedule | Get scheduled command list
[**apiV2TemplateCommandDeviceDeviceGuidSendPost**](CommandApi.md#apiV2TemplateCommandDeviceDeviceGuidSendPost) | **POST** api/v2/template-command/device/{deviceGuid}/send | Execute a command on device
[**apiV2TemplateCommandDeviceGuidStatusPut**](CommandApi.md#apiV2TemplateCommandDeviceGuidStatusPut) | **PUT** api/v2/template-command/{deviceGuid}/status | Update command history status
[**apiV2TemplateCommandDeviceTemplateGuidGet**](CommandApi.md#apiV2TemplateCommandDeviceTemplateGuidGet) | **GET** api/v2/template-command/{deviceTemplateGuid} | Get device template command list
[**apiV2TemplateCommandDeviceTemplateGuidLookupGet**](CommandApi.md#apiV2TemplateCommandDeviceTemplateGuidLookupGet) | **GET** api/v2/template-command/{deviceTemplateGuid}/lookup | Get device template command lookup
[**apiV2TemplateCommandHistoryCommandHistoryGuidReSendPut**](CommandApi.md#apiV2TemplateCommandHistoryCommandHistoryGuidReSendPut) | **PUT** api/v2/template-command/history/{commandHistoryGuid}/re-send | Resend commands
[**apiV2TemplateCommandHistoryGet**](CommandApi.md#apiV2TemplateCommandHistoryGet) | **GET** api/v2/template-command/history | Get device command history
[**apiV2TemplateCommandPost**](CommandApi.md#apiV2TemplateCommandPost) | **POST** api/v2/template-command | Add new template command
[**apiV2TemplateCommandSendPost**](CommandApi.md#apiV2TemplateCommandSendPost) | **POST** api/v2/template-command/send | Execute a command on multiple devices



Get executed command list by batch

&lt;p&gt;This API endpoint provides you the list of executed commands in one batch. For that, you need to send &lt;i&gt;batchGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val batchGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Executed Batch Guid

val result : BatchCommandListResponse = webService.apiV2TemplateCommandBatchBatchGuidGet(batchGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchGuid** | **java.util.UUID**| Executed Batch Guid |

### Return type

[**BatchCommandListResponse**](BatchCommandListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete a command

&lt;p&gt;This API endpoint allows you to delete a command. For that, you need to send &lt;i&gt;commandGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template Command Guid

val result : CommandDeleteResponse = webService.apiV2TemplateCommandCommandGuidDelete(commandGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandGuid** | **java.util.UUID**| Template Command Guid |

### Return type

[**CommandDeleteResponse**](CommandDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update template command

&lt;p&gt;This API endpoint lets you update a command. For that, you need to send &lt;i&gt;commandGuid&lt;/i&gt; in request url and command update details in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template Command Guid
val commandUpdateRequest : CommandUpdateRequest =  // CommandUpdateRequest | Json object

val result : CommandUpdateResponse = webService.apiV2TemplateCommandCommandGuidPut(commandGuid, commandUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandGuid** | **java.util.UUID**| Template Command Guid |
 **commandUpdateRequest** | [**CommandUpdateRequest**](CommandUpdateRequest.md)| Json object | [optional]

### Return type

[**CommandUpdateResponse**](CommandUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Delete a scheduled command

&lt;p&gt;This API endpoint allows you to delete a scheduled command along with recurring job associated with that command. For that, you need to send &lt;i&gt;commandScheduleGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandScheduleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Scheduled Command Guid

val result : CommandScheduleDeleteResponse = webService.apiV2TemplateCommandCommandScheduleCommandScheduleGuidDelete(commandScheduleGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandScheduleGuid** | **java.util.UUID**| Scheduled Command Guid |

### Return type

[**CommandScheduleDeleteResponse**](CommandScheduleDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get scheduled command detail

&lt;p&gt;This API endpoint provide you scheduled command detail. For that, you need to send &lt;i&gt;CommandScheduleGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandScheduleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Scheduled Command Guid

val result : CommandScheduleDetailResponse = webService.apiV2TemplateCommandCommandScheduleCommandScheduleGuidGet(commandScheduleGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandScheduleGuid** | **java.util.UUID**| Scheduled Command Guid |

### Return type

[**CommandScheduleDetailResponse**](CommandScheduleDetailResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update a scheduled command

&lt;p&gt;This API endpoint allows you to delete a scheduled command along with recurring job associated with that command. For that, you need to send &lt;i&gt;commandScheduleGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandScheduleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Scheduled Command Guid
val commandScheduleUpdateRequest : CommandScheduleUpdateRequest =  // CommandScheduleUpdateRequest | request

val result : CommandScheduleUpdateResponse = webService.apiV2TemplateCommandCommandScheduleCommandScheduleGuidPut(commandScheduleGuid, commandScheduleUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandScheduleGuid** | **java.util.UUID**| Scheduled Command Guid |
 **commandScheduleUpdateRequest** | [**CommandScheduleUpdateRequest**](CommandScheduleUpdateRequest.md)| request | [optional]

### Return type

[**CommandScheduleUpdateResponse**](CommandScheduleUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update scheduled command Status

&lt;p&gt;This API endpoint allows you to change the status of your scheduled command along with recurring job associated with that command. For that, you need to send &lt;i&gt;commandScheduleGuid&lt;/i&gt; in request url and &lt;i&gt;isActive&lt;/i&gt; in the request body. In &lt;i&gt;isActive&lt;/i&gt;, send &lt;i&gt;true&lt;/i&gt; to activate your scheduled command and &lt;i&gt;false&lt;/i&gt; to deactivate your scheduled command.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandScheduleGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Scheduled Command Guid
val commandScheduleUpdateStatusRequest : CommandScheduleUpdateStatusRequest =  // CommandScheduleUpdateStatusRequest | Json object

val result : CommandScheduleUpdateStatusResponse = webService.apiV2TemplateCommandCommandScheduleCommandScheduleGuidStatusPut(commandScheduleGuid, commandScheduleUpdateStatusRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandScheduleGuid** | **java.util.UUID**| Scheduled Command Guid |
 **commandScheduleUpdateStatusRequest** | [**CommandScheduleUpdateStatusRequest**](CommandScheduleUpdateStatusRequest.md)| Json object | [optional]

### Return type

[**CommandScheduleUpdateStatusResponse**](CommandScheduleUpdateStatusResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get scheduled command list

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by guid,templatename,commandname,companyGuid,commandGuid,applyTo,entityGuid,isRecursive,unit,unitValue,unitTime,parameterValue,isActive,createddate,createdby,updateddate,updatedby For example: name asc
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.
val isEdge : kotlin.Boolean = true // kotlin.Boolean | IsEdge : Pass value as true to get only edge devices
val isGateway : kotlin.Boolean = true // kotlin.Boolean | IsGateway : Pass value as true to get only gateway devices
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only low badnwidth devices
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | IsIoTEdgeEnable : Pass value as true to get only Azure iot Edge devices

val result : CommandScheduleListResponse = webService.apiV2TemplateCommandCommandScheduleGet(pageNumber, pageSize, sortBy, searchText, isEdge, isGateway, isLowBandwidth, isIotEdgeEnable)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by guid,templatename,commandname,companyGuid,commandGuid,applyTo,entityGuid,isRecursive,unit,unitValue,unitTime,parameterValue,isActive,createddate,createdby,updateddate,updatedby For example: name asc | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **isEdge** | **kotlin.Boolean**| IsEdge : Pass value as true to get only edge devices | [optional]
 **isGateway** | **kotlin.Boolean**| IsGateway : Pass value as true to get only gateway devices | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only low badnwidth devices | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**| IsIoTEdgeEnable : Pass value as true to get only Azure iot Edge devices | [optional]

### Return type

[**CommandScheduleListResponse**](CommandScheduleListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Execute a command on device

&lt;p&gt;Run a command on any device using this API endpoint. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url along with &lt;i&gt;commandGuid&lt;/i&gt; and &lt;i&gt;parameterValue&lt;/i&gt; in the request body. This command will be executed on a real device. Using this, you will be able to send data to devices from your UI.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val commandSendToDeviceRequest : CommandSendToDeviceRequest =  // CommandSendToDeviceRequest | Json object

val result : CommandSendToDeviceResponse = webService.apiV2TemplateCommandDeviceDeviceGuidSendPost(deviceGuid, commandSendToDeviceRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **commandSendToDeviceRequest** | [**CommandSendToDeviceRequest**](CommandSendToDeviceRequest.md)| Json object | [optional]

### Return type

[**CommandSendToDeviceResponse**](CommandSendToDeviceResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Update command history status

&lt;p&gt;This API endpoint allows you to update the template command sent status for any device. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url along with &lt;i&gt;ackId&lt;/i&gt;, &lt;i&gt;status&lt;/i&gt; and &lt;i&gt;statusText&lt;/i&gt; in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid
val commandHistoryUpdateRequest : CommandHistoryUpdateRequest =  // CommandHistoryUpdateRequest | Json object

val result : CommandHistoryUpdateResponse = webService.apiV2TemplateCommandDeviceGuidStatusPut(deviceGuid, commandHistoryUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **java.util.UUID**| Device Guid |
 **commandHistoryUpdateRequest** | [**CommandHistoryUpdateRequest**](CommandHistoryUpdateRequest.md)| Json object | [optional]

### Return type

[**CommandHistoryUpdateResponse**](CommandHistoryUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get device template command list

&lt;p&gt;This API endpoint gives you the list of available commands in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.

val result : CommandListResponse = webService.apiV2TemplateCommandDeviceTemplateGuidGet(deviceTemplateGuid, pageNumber, pageSize, sortBy, searchText)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]

### Return type

[**CommandListResponse**](CommandListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device template command lookup

&lt;p&gt;This API endpoint provides you the lookup list of available commands in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val deviceTemplateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Template Guid
val tag : kotlin.String = tag_example // kotlin.String | Tag

val result : CommandLookupResponse = webService.apiV2TemplateCommandDeviceTemplateGuidLookupGet(deviceTemplateGuid, tag)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTemplateGuid** | **java.util.UUID**| Device Template Guid |
 **tag** | **kotlin.String**| Tag | [optional]

### Return type

[**CommandLookupResponse**](CommandLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Resend commands

&lt;p&gt;This API endpoint will re-execute all commands which are having failed status&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandHistoryGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Command History Guid

val result : CommandReSendResponse = webService.apiV2TemplateCommandHistoryCommandHistoryGuidReSendPut(commandHistoryGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandHistoryGuid** | **java.util.UUID**| Command History Guid |

### Return type

[**CommandReSendResponse**](CommandReSendResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device command history

&lt;p&gt;This API endpoint provides you the list of command execution histories for all devices. This also gives you the status of whether the command was successfully executed or not.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. You can fetch the history of a single device by sending &lt;i&gt;deviceGuid&lt;/i&gt; in filter parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val deviceGuid : kotlin.String = deviceGuid_example // kotlin.String | Device Guid
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: uniqueId asc, uniqueId desc, uniqueId
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.
val isEdge : kotlin.Boolean = true // kotlin.Boolean | IsEdge : Pass value as true to get only edge devices
val isGateway : kotlin.Boolean = true // kotlin.Boolean | IsGateway : Pass value as true to get only gateway devices
val isLowBandwidth : kotlin.Boolean = true // kotlin.Boolean | IsLowBandwidth : Pass value as true to get only low badnwidth devices
val isIotEdgeEnable : kotlin.Boolean = true // kotlin.Boolean | 

val result : CommandHistoryListResponse = webService.apiV2TemplateCommandHistoryGet(deviceGuid, pageNumber, pageSize, sortBy, searchText, isEdge, isGateway, isLowBandwidth, isIotEdgeEnable)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceGuid** | **kotlin.String**| Device Guid | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: uniqueId asc, uniqueId desc, uniqueId | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **isEdge** | **kotlin.Boolean**| IsEdge : Pass value as true to get only edge devices | [optional]
 **isGateway** | **kotlin.Boolean**| IsGateway : Pass value as true to get only gateway devices | [optional]
 **isLowBandwidth** | **kotlin.Boolean**| IsLowBandwidth : Pass value as true to get only low badnwidth devices | [optional]
 **isIotEdgeEnable** | **kotlin.Boolean**|  | [optional]

### Return type

[**CommandHistoryListResponse**](CommandHistoryListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new template command

&lt;p&gt;Commands are used to manage a device remotely. You can add multiple commands to your device template. You can use commands to run a command on the device remotely, instantly, from IoTConnect.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to create device template commands. These commands will be defined in your device template and will be a part of your device template. A template can have one or more commands.&lt;/p&gt;  &lt;p&gt;Here, name and command are mandatory for any template command.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandCreateRequest : CommandCreateRequest =  // CommandCreateRequest | Json object

val result : CommandCreateResponse = webService.apiV2TemplateCommandPost(commandCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandCreateRequest** | [**CommandCreateRequest**](CommandCreateRequest.md)| Json object | [optional]

### Return type

[**CommandCreateResponse**](CommandCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Execute a command on multiple devices

&lt;p&gt;Run a command on multiple devices using this API endpoint. For that, you need to send either &lt;i&gt;entityGuid&lt;/i&gt; or &lt;i&gt;deviceGuid&lt;/i&gt; list along with &lt;i&gt;commandGuid&lt;/i&gt; and &lt;i&gt;parameterValue&lt;/i&gt; in the request body.&lt;/p&gt;  &lt;p&gt;If you wish to send &lt;i&gt;entityGuid&lt;/i&gt;, send value “1” in the &lt;i&gt;applyTo&lt;/i&gt; parameter and entity guid in &lt;i&gt;entityGuid&lt;/i&gt; parameter. This will send commands to all the devices available in the given entity. You can also send these commands to child devices of a given entity. For that, you need to send value “true” in &lt;i&gt;isRecursive&lt;/i&gt; parameter.&lt;/p&gt;  &lt;p&gt;If you wish to send &lt;i&gt;deviceGuid&lt;/i&gt; list, send value “2” in the &lt;i&gt;applyTo&lt;/i&gt; parameter and list of device guids in devices parameter. This will send commands to selected devices only.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommandApi::class.java)
val commandSendRequest : CommandSendRequest =  // CommandSendRequest | Json object

val result : CommandSendResponse = webService.apiV2TemplateCommandSendPost(commandSendRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandSendRequest** | [**CommandSendRequest**](CommandSendRequest.md)| Json object | [optional]

### Return type

[**CommandSendResponse**](CommandSendResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

