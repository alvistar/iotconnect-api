package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.DeploymentCreateRequest
import com.thealvistar.iotconnect.device.client.models.DeploymentCreateResponse
import com.thealvistar.iotconnect.device.client.models.DeploymentListResponse
import retrofit2.Call
import retrofit2.http.*

interface DeploymentApi {
    /**
     * Get Deployment list
     * &lt;p&gt;This API endpoint provides you the get list of device update deployments.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the deployment list received successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @return [Call]<[DeploymentListResponse]>
     */
    @GET("api/v2/deployments")
    fun apiV2DeploymentsGet(): Call<DeploymentListResponse>

    /**
     * Create scheduled deployment for device update.
     * &lt;p&gt;This API endpoint provides you to create deployment for IotHub Device.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the Deployment created successfully.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *
     * @param deploymentCreateRequest  (optional)
     * @return [Call]<[DeploymentCreateResponse]>
     */
    @POST("api/v2/deployments")
    fun apiV2DeploymentsPost(@Body deploymentCreateRequest: DeploymentCreateRequest? = null): Call<DeploymentCreateResponse>
}
