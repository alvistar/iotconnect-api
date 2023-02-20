package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.ProductCreateRequest
import com.thealvistar.iotconnect.device.client.models.ProductCreateResponse
import com.thealvistar.iotconnect.device.client.models.ProductDeleteResponse
import com.thealvistar.iotconnect.device.client.models.ProductListResponse
import com.thealvistar.iotconnect.device.client.models.ProductUpdateRequest
import com.thealvistar.iotconnect.device.client.models.ProductUpdateResponse
import com.thealvistar.iotconnect.device.client.models.SyncSphereGroupAndProductRequest
import com.thealvistar.iotconnect.device.client.models.SyncSphereGroupAndProductResponse
import com.thealvistar.iotconnect.device.client.models.TenantPermissionResponse
import retrofit2.Call
import retrofit2.http.*

interface AzureSphereApi {
    /**
     * Sync devicegroup and product from Azure sphere tenant
     * &lt;p&gt;This API endpoint sync devicegroup and product from Azure sphere tenant.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device synced successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param syncSphereGroupAndProductRequest Json object with device group id. (optional)
     * @return [Call]<[SyncSphereGroupAndProductResponse]>
     */
    @POST("api/v2/sphere-devices/devices/syncDeviceDetail")
    fun apiV2SphereDevicesDevicesSyncDeviceDetailPost(@Body syncSphereGroupAndProductRequest: SyncSphereGroupAndProductRequest? = null): Call<SyncSphereGroupAndProductResponse>

    /**
     * Get Sphere Product List
     * &lt;p&gt;This API endpoint gives you the list of sphere products.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the product list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param pageSize  (optional)
     * @param pageNumber  (optional)
     * @param sortBy  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @return [Call]<[ProductListResponse]>
     */
    @GET("api/v2/sphere-devices/products")
    fun apiV2SphereDevicesProductsGet(
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("Name") name: kotlin.String? = null,
        @Query("Description") description: kotlin.String? = null,
    ): Call<ProductListResponse>

    /**
     * Delete sphere product
     * &lt;p&gt;This API endpoint delete sphere product.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the product deleted successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param guid productGuid to delete sphere product.
     * @return [Call]<[ProductDeleteResponse]>
     */
    @DELETE("api/v2/sphere-devices/products/{guid}")
    fun apiV2SphereDevicesProductsGuidDelete(@Path("guid") guid: java.util.UUID): Call<ProductDeleteResponse>

    /**
     * Get Sphere Product Detail
     * &lt;p&gt;This API endpoint gives you detail of sphere product.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the product detail loaded successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param guid
     * @return [Call]<[ProductListResponse]>
     */
    @GET("api/v2/sphere-devices/products/{guid}")
    fun apiV2SphereDevicesProductsGuidGet(@Path("guid") guid: java.util.UUID): Call<ProductListResponse>

    /**
     * Update sphere product
     * &lt;p&gt;This API endpoint update sphere product.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the product updated successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param guid guid to update sphere product.
     * @param productUpdateRequest Json object with sphere product details. (optional)
     * @return [Call]<[ProductUpdateResponse]>
     */
    @PATCH("api/v2/sphere-devices/products/{guid}")
    fun apiV2SphereDevicesProductsGuidPatch(
        @Path("guid") guid: java.util.UUID,
        @Body productUpdateRequest: ProductUpdateRequest? = null,
    ): Call<ProductUpdateResponse>

    /**
     * Create sphere product
     * &lt;p&gt;This API endpoint creates new sphere product.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the product created successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param productCreateRequest Json object with sphere product details. (optional)
     * @return [Call]<[ProductCreateResponse]>
     */
    @POST("api/v2/sphere-devices/products")
    fun apiV2SphereDevicesProductsPost(@Body productCreateRequest: ProductCreateRequest? = null): Call<ProductCreateResponse>

    /**
     * Check iotconnect tenant has permission to access azure sphere tenant or not.
     * &lt;p&gt;This API endpoint Check iotconnect tenant has permission to access azure sphere tenant or not.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the iotconnect tenant has permission or not to access azure sphere tenant.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param tenantId
     * @return [Call]<[TenantPermissionResponse]>
     */
    @GET("api/v2/sphere-devices/tenants/{tenantId}/permission")
    fun apiV2SphereDevicesTenantsTenantIdPermissionGet(@Path("tenantId") tenantId: java.util.UUID): Call<TenantPermissionResponse>
}
