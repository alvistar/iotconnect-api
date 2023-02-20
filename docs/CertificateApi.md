# CertificateApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2CertificateCertificateGuidDelete**](CertificateApi.md#apiV2CertificateCertificateGuidDelete) | **DELETE** api/v2/Certificate/{certificateGuid} | Delete a certificate
[**apiV2CertificateCertificateGuidGet**](CertificateApi.md#apiV2CertificateCertificateGuidGet) | **GET** api/v2/Certificate/{certificateGuid} | Get single certificate detail
[**apiV2CertificateCertificateGuidPut**](CertificateApi.md#apiV2CertificateCertificateGuidPut) | **PUT** api/v2/Certificate/{certificateGuid} | Update certificate detail
[**apiV2CertificateCertificateGuidVerifyPut**](CertificateApi.md#apiV2CertificateCertificateGuidVerifyPut) | **PUT** api/v2/Certificate/{certificateGuid}/verify | Verify certificate
[**apiV2CertificateGet**](CertificateApi.md#apiV2CertificateGet) | **GET** api/v2/Certificate | Get device certificates list
[**apiV2CertificateLookupAuthTypeGet**](CertificateApi.md#apiV2CertificateLookupAuthTypeGet) | **GET** api/v2/certificate/lookup/{authType} | Get certificates lookup
[**apiV2CertificatePost**](CertificateApi.md#apiV2CertificatePost) | **POST** api/v2/Certificate | Add new certificate
[**apiV2DeviceDeviceIdSelfSignedCertificateGet**](CertificateApi.md#apiV2DeviceDeviceIdSelfSignedCertificateGet) | **GET** api/v2/device/{deviceId}/self-signed-certificate | Get self signed certificate for your device



Delete a certificate

&lt;p&gt;This API endpoint allows you to delete a device certificate. For that, you need to send &lt;i&gt;certificateGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CertificateApi::class.java)
val certificateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Certificate Guid

val result : CertificateDeleteResponse = webService.apiV2CertificateCertificateGuidDelete(certificateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateGuid** | **java.util.UUID**| Certificate Guid |

### Return type

[**CertificateDeleteResponse**](CertificateDeleteResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get single certificate detail

&lt;p&gt;This API endpoint provides you the detailed description of single device certificate. For that, you need to send &lt;i&gt;certificateGuid&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CertificateApi::class.java)
val certificateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Certificate Guid

val result : CertificateDetailResponse = webService.apiV2CertificateCertificateGuidGet(certificateGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateGuid** | **java.util.UUID**| Certificate Guid |

### Return type

[**CertificateDetailResponse**](CertificateDetailResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Update certificate detail

&lt;p&gt;If you need to update the certificate name or certificate file, use this API endpoint. For that, you need to send &lt;i&gt;certificateGuid&lt;/i&gt; in request url and certificate update details in the request body.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CertificateApi::class.java)
val certificateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Certificate Guid
val certificateName : kotlin.String = certificateName_example // kotlin.String | Certificate Name
val certificateFile : java.io.File = BINARY_DATA_HERE // java.io.File | Certificate file. Only .pem and .cer files are allowed.
val isSphereCerti : kotlin.Boolean = true // kotlin.Boolean | 
val certificateType : kotlin.Int = 56 // kotlin.Int | 
val invokingUser : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val version : kotlin.String = version_example // kotlin.String | 
val culture : kotlin.String = culture_example // kotlin.String | 
val tokenCompanyGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val cpId : kotlin.String = cpId_example // kotlin.String | 
val token : kotlin.String = token_example // kotlin.String | 

val result : CertificateUpdateResponse = webService.apiV2CertificateCertificateGuidPut(certificateGuid, certificateName, certificateFile, isSphereCerti, certificateType, invokingUser, version, culture, tokenCompanyGuid, cpId, token)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateGuid** | **java.util.UUID**| Certificate Guid |
 **certificateName** | **kotlin.String**| Certificate Name |
 **certificateFile** | **java.io.File**| Certificate file. Only .pem and .cer files are allowed. |
 **isSphereCerti** | **kotlin.Boolean**|  | [optional]
 **certificateType** | **kotlin.Int**|  | [optional]
 **invokingUser** | **java.util.UUID**|  | [optional]
 **version** | **kotlin.String**|  | [optional]
 **culture** | **kotlin.String**|  | [optional]
 **tokenCompanyGuid** | **java.util.UUID**|  | [optional]
 **cpId** | **kotlin.String**|  | [optional]
 **token** | **kotlin.String**|  | [optional]

### Return type

[**CertificateUpdateResponse**](CertificateUpdateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json


Verify certificate

&lt;p&gt;After adding a device certificate, one prefers to verify it. This API endpoint allows you to verify the certificate. For that, you need to upload a verification certificate which will validate your device certificate.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CertificateApi::class.java)
val certificateGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Certificate Guid
val etag : kotlin.String = etag_example // kotlin.String | Certificate Etag
val certificateFile : java.io.File = BINARY_DATA_HERE // java.io.File | Verification certificate file.              Only .per and .cer file allowed.

val result : CertificateVerifyResponse = webService.apiV2CertificateCertificateGuidVerifyPut(certificateGuid, etag, certificateFile)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateGuid** | **java.util.UUID**| Certificate Guid |
 **etag** | **kotlin.String**| Certificate Etag |
 **certificateFile** | **java.io.File**| Verification certificate file.              Only .per and .cer file allowed. |

### Return type

[**CertificateVerifyResponse**](CertificateVerifyResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
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
val webService = apiClient.createWebservice(CertificateApi::class.java)
val pageNumber : kotlin.Int = 56 // kotlin.Int | To fetch specific page data. Eg: 2
val pageSize : kotlin.Int = 56 // kotlin.Int | To define number of records in single page. Eg: 25
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort by name and order. Eg. name, name asc, name desc etc
val name : kotlin.String = name_example // kotlin.String | Search with certifiate name
val status : kotlin.String = status_example // kotlin.String | Search with certifiate status, Eg: Expired, Verified and Pending

val result : CertificateListResponse = webService.apiV2CertificateGet(pageNumber, pageSize, sortBy, name, status)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| To fetch specific page data. Eg: 2 | [optional]
 **pageSize** | **kotlin.Int**| To define number of records in single page. Eg: 25 | [optional]
 **sortBy** | **kotlin.String**| Sort by name and order. Eg. name, name asc, name desc etc | [optional]
 **name** | **kotlin.String**| Search with certifiate name | [optional]
 **status** | **kotlin.String**| Search with certifiate status, Eg: Expired, Verified and Pending | [optional]

### Return type

[**CertificateListResponse**](CertificateListResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Get certificates lookup

&lt;p&gt;This API endpoint provides you the lookup list of available device certificates for the given certificate auth type.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CertificateApi::class.java)
val authType : kotlin.Int = 56 // kotlin.Int | To get certificate lookup by auth type

val result : CertificateLookupResponse = webService.apiV2CertificateLookupAuthTypeGet(authType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authType** | **kotlin.Int**| To get certificate lookup by auth type |

### Return type

[**CertificateLookupResponse**](CertificateLookupResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


Add new certificate

&lt;p&gt;Certificate verifies identity when a device enters in an IoT ecosystem, encrypts in-transit communications and protects networks from exploits. Overall, certificates safeguard systems and transmit information privately. Using this API endpoint, you can add new certificates to Azure IoT Hub.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CertificateApi::class.java)
val certificateName : kotlin.String = certificateName_example // kotlin.String | Certificate Name
val certificateFile : java.io.File = BINARY_DATA_HERE // java.io.File | Certificate file. Only .pem and .cer files are allowed.
val isSphereCerti : kotlin.Boolean = true // kotlin.Boolean | 
val certificateType : kotlin.Int = 56 // kotlin.Int | 
val invokingUser : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val version : kotlin.String = version_example // kotlin.String | 
val culture : kotlin.String = culture_example // kotlin.String | 
val tokenCompanyGuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val cpId : kotlin.String = cpId_example // kotlin.String | 
val token : kotlin.String = token_example // kotlin.String | 

val result : CertificateCreateResponse = webService.apiV2CertificatePost(certificateName, certificateFile, isSphereCerti, certificateType, invokingUser, version, culture, tokenCompanyGuid, cpId, token)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateName** | **kotlin.String**| Certificate Name |
 **certificateFile** | **java.io.File**| Certificate file. Only .pem and .cer files are allowed. |
 **isSphereCerti** | **kotlin.Boolean**|  | [optional]
 **certificateType** | **kotlin.Int**|  | [optional]
 **invokingUser** | **java.util.UUID**|  | [optional]
 **version** | **kotlin.String**|  | [optional]
 **culture** | **kotlin.String**|  | [optional]
 **tokenCompanyGuid** | **java.util.UUID**|  | [optional]
 **cpId** | **kotlin.String**|  | [optional]
 **token** | **kotlin.String**|  | [optional]

### Return type

[**CertificateCreateResponse**](CertificateCreateResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json


Get self signed certificate for your device

&lt;p&gt;This API endpoint provides you certificate for communication with you self signed device. For that, you need to send &lt;i&gt;deviceId (Eg.[CpId]-[uniqudId])&lt;/i&gt; in request url.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.thealvistar.iotconnect.device.client.*
//import com.thealvistar.iotconnect.common.auth.infrastructure.*
//import com.thealvistar.iotconnect.device.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CertificateApi::class.java)
val deviceId : kotlin.String = deviceId_example // kotlin.String | deviceId (Eg.[CpId]-[uniqudId])

val result : java.io.File = webService.apiV2DeviceDeviceIdSelfSignedCertificateGet(deviceId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **kotlin.String**| deviceId (Eg.[CpId]-[uniqudId]) |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

