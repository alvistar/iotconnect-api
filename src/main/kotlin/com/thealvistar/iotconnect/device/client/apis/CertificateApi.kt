package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.CertificateCreateResponse
import com.thealvistar.iotconnect.device.client.models.CertificateDeleteResponse
import com.thealvistar.iotconnect.device.client.models.CertificateDetailResponse
import com.thealvistar.iotconnect.device.client.models.CertificateListResponse
import com.thealvistar.iotconnect.device.client.models.CertificateLookupResponse
import com.thealvistar.iotconnect.device.client.models.CertificateUpdateResponse
import com.thealvistar.iotconnect.device.client.models.CertificateVerifyResponse
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface CertificateApi {
    /**
     * Delete a certificate
     * &lt;p&gt;This API endpoint allows you to delete a device certificate. For that, you need to send &lt;i&gt;certificateGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that certificate deleted successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Certificate doesn't exist, an error occurred while deleting certificate on azure and invalid logged user or company.
     *
     * @param certificateGuid Certificate Guid
     * @return [Call]<[CertificateDeleteResponse]>
     */
    @DELETE("api/v2/Certificate/{certificateGuid}")
    fun apiV2CertificateCertificateGuidDelete(@Path("certificateGuid") certificateGuid: java.util.UUID): Call<CertificateDeleteResponse>

    /**
     * Get single certificate detail
     * &lt;p&gt;This API endpoint provides you the detailed description of single device certificate. For that, you need to send &lt;i&gt;certificateGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that certificate information received successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Certificate doesn't exist and invalid logged user or company.
     *
     * @param certificateGuid Certificate Guid
     * @return [Call]<[CertificateDetailResponse]>
     */
    @GET("api/v2/Certificate/{certificateGuid}")
    fun apiV2CertificateCertificateGuidGet(@Path("certificateGuid") certificateGuid: java.util.UUID): Call<CertificateDetailResponse>

    /**
     * Update certificate detail
     * &lt;p&gt;If you need to update the certificate name or certificate file, use this API endpoint. For that, you need to send &lt;i&gt;certificateGuid&lt;/i&gt; in request url and certificate update details in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that certificate updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Certificate name already exist, invalid certificate, certificate upload not allowed, the verified certificate can not update,  an error occurred while uploading certificate on azure and invalid logged user or company.
     *
     * @param certificateGuid Certificate Guid
     * @param certificateName Certificate Name
     * @param certificateFile Certificate file. Only .pem and .cer files are allowed.
     * @param isSphereCerti  (optional)
     * @param certificateType  (optional)
     * @param invokingUser  (optional)
     * @param version  (optional)
     * @param culture  (optional)
     * @param tokenCompanyGuid  (optional)
     * @param cpId  (optional)
     * @param token  (optional)
     * @return [Call]<[CertificateUpdateResponse]>
     */
    @Multipart
    @PUT("api/v2/Certificate/{certificateGuid}")
    fun apiV2CertificateCertificateGuidPut(
        @Path("certificateGuid") certificateGuid: java.util.UUID,
        @Part("CertificateName") certificateName: kotlin.String,
        @Part certificateFile: MultipartBody.Part,
        @Part("IsSphereCerti") isSphereCerti: kotlin.Boolean? = null,
        @Part("CertificateType") certificateType: kotlin.Int? = null,
        @Part("InvokingUser") invokingUser: java.util.UUID? = null,
        @Part("Version") version: kotlin.String? = null,
        @Part("Culture") culture: kotlin.String? = null,
        @Part("TokenCompanyGuid") tokenCompanyGuid: java.util.UUID? = null,
        @Part("CpId") cpId: kotlin.String? = null,
        @Part("Token") token: kotlin.String? = null,
    ): Call<CertificateUpdateResponse>

    /**
     * Verify certificate
     * &lt;p&gt;After adding a device certificate, one prefers to verify it. This API endpoint allows you to verify the certificate. For that, you need to upload a verification certificate which will validate your device certificate.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that certificate verified successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Certificate name already exist, invalid certificate, certificate upload not allowed, the verified certificate can not update,  an error occurred while verifying certificate on azure and invalid logged user or company.
     *
     * @param certificateGuid Certificate Guid
     * @param etag Certificate Etag
     * @param certificateFile Verification certificate file.              Only .per and .cer file allowed.
     * @return [Call]<[CertificateVerifyResponse]>
     */
    @Multipart
    @PUT("api/v2/Certificate/{certificateGuid}/verify")
    fun apiV2CertificateCertificateGuidVerifyPut(
        @Path("certificateGuid") certificateGuid: java.util.UUID,
        @Part("Etag") etag: kotlin.String,
        @Part certificateFile: MultipartBody.Part,
    ): Call<CertificateVerifyResponse>

    /**
     * Get device certificates list
     * &lt;p&gt;Get an entire list of device certificates using this API endpoint. You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Success
     *
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by name and order. Eg. name, name asc, name desc etc (optional)
     * @param name Search with certifiate name (optional)
     * @param status Search with certifiate status, Eg: Expired, Verified and Pending (optional)
     * @return [Call]<[CertificateListResponse]>
     */
    @GET("api/v2/Certificate")
    fun apiV2CertificateGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("name") name: kotlin.String? = null,
        @Query("status") status: kotlin.String? = null,
    ): Call<CertificateListResponse>

    /**
     * Get certificates lookup
     * &lt;p&gt;This API endpoint provides you the lookup list of available device certificates for the given certificate auth type.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that certificate information received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param authType To get certificate lookup by auth type
     * @return [Call]<[CertificateLookupResponse]>
     */
    @GET("api/v2/certificate/lookup/{authType}")
    fun apiV2CertificateLookupAuthTypeGet(@Path("authType") authType: kotlin.Int): Call<CertificateLookupResponse>

    /**
     * Add new certificate
     * &lt;p&gt;Certificate verifies identity when a device enters in an IoT ecosystem, encrypts in-transit communications and protects networks from exploits. Overall, certificates safeguard systems and transmit information privately. Using this API endpoint, you can add new certificates to Azure IoT Hub.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that certificate uploaded successfully and returns created certificate guid.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Certificate name already exist, invalid certificate, certificate upload not allowed, an error occurred while uploading certificate on azure  and invalid logged user or company.
     *
     * @param certificateName Certificate Name
     * @param certificateFile Certificate file. Only .pem and .cer files are allowed.
     * @param isSphereCerti  (optional)
     * @param certificateType  (optional)
     * @param invokingUser  (optional)
     * @param version  (optional)
     * @param culture  (optional)
     * @param tokenCompanyGuid  (optional)
     * @param cpId  (optional)
     * @param token  (optional)
     * @return [Call]<[CertificateCreateResponse]>
     */
    @Multipart
    @POST("api/v2/Certificate")
    fun apiV2CertificatePost(
        @Part("CertificateName") certificateName: kotlin.String,
        @Part certificateFile: MultipartBody.Part,
        @Part("IsSphereCerti") isSphereCerti: kotlin.Boolean? = null,
        @Part("CertificateType") certificateType: kotlin.Int? = null,
        @Part("InvokingUser") invokingUser: java.util.UUID? = null,
        @Part("Version") version: kotlin.String? = null,
        @Part("Culture") culture: kotlin.String? = null,
        @Part("TokenCompanyGuid") tokenCompanyGuid: java.util.UUID? = null,
        @Part("CpId") cpId: kotlin.String? = null,
        @Part("Token") token: kotlin.String? = null,
    ): Call<CertificateCreateResponse>

    /**
     * Get self signed certificate for your device
     * &lt;p&gt;This API endpoint provides you certificate for communication with you self signed device. For that, you need to send &lt;i&gt;deviceId (Eg.[CpId]-[uniqudId])&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that certificate files received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  An error occurred while generating self signed certificate and invalid logged user or company.
     *
     * @param deviceId deviceId (Eg.[CpId]-[uniqudId])
     * @return [Call]<[ResponseBody]>
     */
    @GET("api/v2/device/{deviceId}/self-signed-certificate")
    fun apiV2DeviceDeviceIdSelfSignedCertificateGet(@Path("deviceId") deviceId: kotlin.String): Call<ResponseBody>
}
