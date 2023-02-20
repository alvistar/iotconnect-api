# AzureSphereApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2SphereDevicesDevicesSyncDeviceDetailPost**](AzureSphereApi.md#apiV2SphereDevicesDevicesSyncDeviceDetailPost) | **POST** api/v2/sphere-devices/devices/syncDeviceDetail | Sync devicegroup and product from Azure sphere tenant
[**apiV2SphereDevicesProductsGet**](AzureSphereApi.md#apiV2SphereDevicesProductsGet) | **GET** api/v2/sphere-devices/products | Get Sphere Product List
[**apiV2SphereDevicesProductsGuidDelete**](AzureSphereApi.md#apiV2SphereDevicesProductsGuidDelete) | **DELETE** api/v2/sphere-devices/products/{guid} | Delete sphere product
[**apiV2SphereDevicesProductsGuidGet**](AzureSphereApi.md#apiV2SphereDevicesProductsGuidGet) | **GET** api/v2/sphere-devices/products/{guid} | Get Sphere Product Detail
[**apiV2SphereDevicesProductsGuidPatch**](AzureSphereApi.md#apiV2SphereDevicesProductsGuidPatch) | **PATCH** api/v2/sphere-devices/products/{guid} | Update sphere product
[**apiV2SphereDevicesProductsPost**](AzureSphereApi.md#apiV2SphereDevicesProductsPost) | **POST** api/v2/sphere-devices/products | Create sphere product
[**apiV2SphereDevicesTenantsTenantIdPermissionGet**](AzureSphereApi.md#apiV2SphereDevicesTenantsTenantIdPermissionGet) | **GET** api/v2/sphere-devices/tenants/{tenantId}/permission | Check iotconnect tenant has permission to access azure sphere tenant or not.



Sync devicegroup and product from Azure sphere tenant

&lt;p&gt;This API endpoint sync devicegroup and product from Azure sphere tenant.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AzureSphereApi::class.java)
val syncSphereGroupAndProductRequest : SyncSphereGroupAndProductRequest =  // SyncSphereGroupAndProductRequest | Json object with device group id.

val result : SyncSphereGroupAndProductResponse = webService.apiV2SphereDevicesDevicesSyncDeviceDetailPost(syncSphereGroupAndProductRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncSphereGroupAndProductRequest** | [**SyncSphereGroupAndProductRequest**](SyncSphereGroupAndProductRequest.md)| Json object with device group id. | [optional]

### Return type

[**SyncSphereGroupAndProductResponse**](SyncSphereGroupAndProductResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Get Sphere Product List

&lt;p&gt;This API endpoint gives you the list of sphere products.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AzureSphereApi::class.java)
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 

val result : ProductListResponse = webService.apiV2SphereDevicesProductsGet(pageSize, pageNumber, sortBy, name, description)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **kotlin.Int**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **sortBy** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Delete sphere product

&lt;p&gt;This API endpoint delete sphere product.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AzureSphereApi::class.java)
val guid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | productGuid to delete sphere product.

val result : ProductDeleteResponse = webService.apiV2SphereDevicesProductsGuidDelete(guid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **java.util.UUID**| productGuid to delete sphere product. |

### Return type

[**ProductDeleteResponse**](ProductDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get Sphere Product Detail

&lt;p&gt;This API endpoint gives you detail of sphere product.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AzureSphereApi::class.java)
val guid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : ProductListResponse = webService.apiV2SphereDevicesProductsGuidGet(guid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **java.util.UUID**|  |

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update sphere product

&lt;p&gt;This API endpoint update sphere product.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AzureSphereApi::class.java)
val guid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | guid to update sphere product.
val productUpdateRequest : ProductUpdateRequest =  // ProductUpdateRequest | Json object with sphere product details.

val result : ProductUpdateResponse = webService.apiV2SphereDevicesProductsGuidPatch(guid, productUpdateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **java.util.UUID**| guid to update sphere product. |
 **productUpdateRequest** | [**ProductUpdateRequest**](ProductUpdateRequest.md)| Json object with sphere product details. | [optional]

### Return type

[**ProductUpdateResponse**](ProductUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Create sphere product

&lt;p&gt;This API endpoint creates new sphere product.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AzureSphereApi::class.java)
val productCreateRequest : ProductCreateRequest =  // ProductCreateRequest | Json object with sphere product details.

val result : ProductCreateResponse = webService.apiV2SphereDevicesProductsPost(productCreateRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCreateRequest** | [**ProductCreateRequest**](ProductCreateRequest.md)| Json object with sphere product details. | [optional]

### Return type

[**ProductCreateResponse**](ProductCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


Check iotconnect tenant has permission to access azure sphere tenant or not.

&lt;p&gt;This API endpoint Check iotconnect tenant has permission to access azure sphere tenant or not.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AzureSphereApi::class.java)
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 

val result : TenantPermissionResponse = webService.apiV2SphereDevicesTenantsTenantIdPermissionGet(tenantId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **java.util.UUID**|  |

### Return type

[**TenantPermissionResponse**](TenantPermissionResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

