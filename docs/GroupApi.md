# GroupApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2GroupDevicePost**](GroupApi.md#apiV2GroupDevicePost) | **POST** api/v2/Group/device | Add devices in a group
[**apiV2GroupGet**](GroupApi.md#apiV2GroupGet) | **GET** api/v2/Group | Get group list
[**apiV2GroupGroupGuidDelete**](GroupApi.md#apiV2GroupGroupGuidDelete) | **DELETE** api/v2/Group/{groupGuid} | Delete a group
[**apiV2GroupGroupGuidDeviceDeviceGuidDelete**](GroupApi.md#apiV2GroupGroupGuidDeviceDeviceGuidDelete) | **DELETE** api/v2/Group/{groupGuid}/device/{deviceGuid} | Delete a device from a group
[**apiV2GroupGroupGuidDeviceGet**](GroupApi.md#apiV2GroupGroupGuidDeviceGet) | **GET** api/v2/Group/{groupGuid}/device | Get device list for a group
[**apiV2GroupGroupGuidGet**](GroupApi.md#apiV2GroupGroupGuidGet) | **GET** api/v2/Group/{groupGuid} | Get group detail
[**apiV2GroupGroupGuidPut**](GroupApi.md#apiV2GroupGroupGuidPut) | **PUT** api/v2/Group/{groupGuid} | Update group name / Sphere group details
[**apiV2GroupGroupGuidUserGet**](GroupApi.md#apiV2GroupGroupGuidUserGet) | **GET** api/v2/Group/{groupGuid}/user | Get user list for a group
[**apiV2GroupGroupGuidUserUserGuidDelete**](GroupApi.md#apiV2GroupGroupGuidUserUserGuidDelete) | **DELETE** api/v2/Group/{groupGuid}/user/{userGuid} | Delete a user from a group
[**apiV2GroupGroupGuidUserUserGuidPut**](GroupApi.md#apiV2GroupGroupGuidUserUserGuidPut) | **PUT** api/v2/Group/{groupGuid}/user/{userGuid} | Update user permission in a group
[**apiV2GroupLookupGet**](GroupApi.md#apiV2GroupLookupGet) | **GET** api/v2/Group/lookup | Get group lookup list
[**apiV2GroupPost**](GroupApi.md#apiV2GroupPost) | **POST** api/v2/Group | Add new group
[**apiV2GroupTypesGet**](GroupApi.md#apiV2GroupTypesGet) | **GET** api/v2/Group/types | Get group type list
[**apiV2GroupUserPost**](GroupApi.md#apiV2GroupUserPost) | **POST** api/v2/Group/user | Add users in a group



Add devices in a group

&lt;p&gt;This API endpoint allows you to add multiple devices in a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; with &lt;i&gt;deviceGuid&lt;/i&gt; list in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupDeviceCreateRequest : GroupDeviceCreateRequest =  // GroupDeviceCreateRequest | Json object

val result : GroupDeviceCreateResponse = webService.apiV2GroupDevicePost(groupDeviceCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupDeviceCreateRequest** | [**GroupDeviceCreateRequest**](GroupDeviceCreateRequest.md)| Json object | [optional]

### Return type

[**GroupDeviceCreateResponse**](GroupDeviceCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get group list

&lt;p&gt;This API endpoint provides you the list of available groups along with their active status as well as devices count and users count.&lt;/p&gt;  &lt;p&gt;You can also add filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.
val sortBy : kotlin.String = sortBy_example // kotlin.String | To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name
val isSphere : kotlin.Boolean = true // kotlin.Boolean | To filter sphere device group only

val result : GroupListResponse = webService.apiV2GroupGet(pageSize, pageNumber, searchText, sortBy, isSphere)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **sortBy** | **kotlin.String**| To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name | [optional]
 **isSphere** | **kotlin.Boolean**| To filter sphere device group only | [optional] [default to false]

### Return type

[**GroupListResponse**](GroupListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete a group

&lt;p&gt;This API endpoint allows you to delete a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group Guid

val result : GroupDeleteResponse = webService.apiV2GroupGroupGuidDelete(groupGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group Guid |

### Return type

[**GroupDeleteResponse**](GroupDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete a device from a group

&lt;p&gt;This API endpoint allows you to delete a device from the group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; along with &lt;i&gt;deviceGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group Guid
val deviceGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Device Guid

val result : GroupDeviceDeleteResponse = webService.apiV2GroupGroupGuidDeviceDeviceGuidDelete(groupGuid, deviceGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group Guid |
 **deviceGuid** | **java.util.UUID**| Device Guid |

### Return type

[**GroupDeviceDeleteResponse**](GroupDeviceDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get device list for a group

&lt;p&gt;This API endpoint gives you the list of available devices in a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group guid
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.
val sortBy : kotlin.String = sortBy_example // kotlin.String | To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: uniqueId asc, uniqueId desc, uniqueId

val result : GroupDeviceListResponse = webService.apiV2GroupGroupGuidDeviceGet(groupGuid, pageSize, pageNumber, searchText, sortBy)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group guid |
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **sortBy** | **kotlin.String**| To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: uniqueId asc, uniqueId desc, uniqueId | [optional]

### Return type

[**GroupDeviceListResponse**](GroupDeviceListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get group detail

&lt;p&gt;This API endpoint provides you all the available details of a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group Guid

val result : GroupGetResponse = webService.apiV2GroupGroupGuidGet(groupGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group Guid |

### Return type

[**GroupGetResponse**](GroupGetResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update group name / Sphere group details

&lt;p&gt;This API endpoint allows you to update the group name or sphere group details. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url and group name in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group Guid
val groupUpdateRequest : GroupUpdateRequest =  // GroupUpdateRequest | Json object

val result : GroupUpdateResponse = webService.apiV2GroupGroupGuidPut(groupGuid, groupUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group Guid |
 **groupUpdateRequest** | [**GroupUpdateRequest**](GroupUpdateRequest.md)| Json object | [optional]

### Return type

[**GroupUpdateResponse**](GroupUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get user list for a group

&lt;p&gt;This API endpoint will give you the list of available users in a group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group Guid
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val searchText : kotlin.String = searchText_example // kotlin.String | To search for specific texts in the list.
val sortBy : kotlin.String = sortBy_example // kotlin.String | To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name

val result : GroupUsersListResponse = webService.apiV2GroupGroupGuidUserGet(groupGuid, pageSize, pageNumber, searchText, sortBy)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group Guid |
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **searchText** | **kotlin.String**| To search for specific texts in the list. | [optional]
 **sortBy** | **kotlin.String**| To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name | [optional]

### Return type

[**GroupUsersListResponse**](GroupUsersListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete a user from a group

&lt;p&gt;This API endpoint allows you to delete a user from the group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; along with &lt;i&gt;userGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group Guid
val userGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | User Guid

val result : GroupUserDeleteResponse = webService.apiV2GroupGroupGuidUserUserGuidDelete(groupGuid, userGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group Guid |
 **userGuid** | **java.util.UUID**| User Guid |

### Return type

[**GroupUserDeleteResponse**](GroupUserDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update user permission in a group

&lt;p&gt;This API endpoint allows you to change user’s permissions in your group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; along with &lt;i&gt;userGuid&lt;/i&gt; in request url and permissions in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Group Guid
val userGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | User Guid
val groupUserUpdateRequest : GroupUserUpdateRequest =  // GroupUserUpdateRequest | Json Object

val result : GroupUserUpdateResponse = webService.apiV2GroupGroupGuidUserUserGuidPut(groupGuid, userGuid, groupUserUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupGuid** | **java.util.UUID**| Group Guid |
 **userGuid** | **java.util.UUID**| User Guid |
 **groupUserUpdateRequest** | [**GroupUserUpdateRequest**](GroupUserUpdateRequest.md)| Json Object | [optional]

### Return type

[**GroupUserUpdateResponse**](GroupUserUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get group lookup list

&lt;p&gt;This API endpoint provides you the lookup list of available group along with their active status.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val type : kotlin.String = type_example // kotlin.String | 

val result : GroupLookupResponse = webService.apiV2GroupLookupGet(type)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**|  | [optional]

### Return type

[**GroupLookupResponse**](GroupLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new group

&lt;p&gt;This API endpoint allows you to create a new group. Groups can be of devices or users. You can also add devices and users in the same group. For creating a group, you just need to mention a group name.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupCreateRequest : GroupCreateRequest =  // GroupCreateRequest | Json object

val result : GroupCreateResponse = webService.apiV2GroupPost(groupCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupCreateRequest** | [**GroupCreateRequest**](GroupCreateRequest.md)| Json object | [optional]

### Return type

[**GroupCreateResponse**](GroupCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get group type list

&lt;p&gt;This API endpoint provides you the list of available group types along with their active status.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)

val result : GroupTypeListResponse = webService.apiV2GroupTypesGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GroupTypeListResponse**](GroupTypeListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add users in a group

&lt;p&gt;This API endpoint allows you to add multiple users to your group. For that, you need to send &lt;i&gt;groupGuid&lt;/i&gt; with &lt;i&gt;userGuid&lt;/i&gt; list with their permissions in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupUserCreateRequest : GroupUserCreateRequest =  // GroupUserCreateRequest | Json Object

val result : GroupUserCreateResponse = webService.apiV2GroupUserPost(groupUserCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUserCreateRequest** | [**GroupUserCreateRequest**](GroupUserCreateRequest.md)| Json Object | [optional]

### Return type

[**GroupUserCreateResponse**](GroupUserCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

