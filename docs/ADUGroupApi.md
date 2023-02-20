# ADUGroupApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2AduGroupsGet**](ADUGroupApi.md#apiV2AduGroupsGet) | **GET** api/v2/adu-groups | Get ADU Group list
[**apiV2AduGroupsPost**](ADUGroupApi.md#apiV2AduGroupsPost) | **POST** api/v2/adu-groups | Create ADU Group.



Get ADU Group list

&lt;p&gt;This API endpoint provides you the get list of ADU Groups.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ADUGroupApi::class.java)

val result : ADUGroupsListResponse = webService.apiV2AduGroupsGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ADUGroupsListResponse**](ADUGroupsListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create ADU Group.

&lt;p&gt;This API endpoint provides you to create ADU Group.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ADUGroupApi::class.java)
val adUGroupCreateRequest : ADUGroupCreateRequest =  // ADUGroupCreateRequest | 

val result : ADUGroupCreateResponse = webService.apiV2AduGroupsPost(adUGroupCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adUGroupCreateRequest** | [**ADUGroupCreateRequest**](ADUGroupCreateRequest.md)|  | [optional]

### Return type

[**ADUGroupCreateResponse**](ADUGroupCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

