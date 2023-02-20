# DeploymentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DeploymentsGet**](DeploymentApi.md#apiV2DeploymentsGet) | **GET** api/v2/deployments | Get Deployment list
[**apiV2DeploymentsPost**](DeploymentApi.md#apiV2DeploymentsPost) | **POST** api/v2/deployments | Create scheduled deployment for device update.



Get Deployment list

&lt;p&gt;This API endpoint provides you the get list of device update deployments.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeploymentApi::class.java)

val result : DeploymentListResponse = webService.apiV2DeploymentsGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeploymentListResponse**](DeploymentListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Create scheduled deployment for device update.

&lt;p&gt;This API endpoint provides you to create deployment for IotHub Device.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeploymentApi::class.java)
val deploymentCreateRequest : DeploymentCreateRequest =  // DeploymentCreateRequest | 

val result : DeploymentCreateResponse = webService.apiV2DeploymentsPost(deploymentCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentCreateRequest** | [**DeploymentCreateRequest**](DeploymentCreateRequest.md)|  | [optional]

### Return type

[**DeploymentCreateResponse**](DeploymentCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

