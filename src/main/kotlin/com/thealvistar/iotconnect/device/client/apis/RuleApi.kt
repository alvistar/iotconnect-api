package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.RuleConditionResponse
import com.thealvistar.iotconnect.device.client.models.RuleCounterResponse
import com.thealvistar.iotconnect.device.client.models.RuleCreateRequest
import com.thealvistar.iotconnect.device.client.models.RuleCreateResponse
import com.thealvistar.iotconnect.device.client.models.RuleDeleteResponse
import com.thealvistar.iotconnect.device.client.models.RuleDetailResponse
import com.thealvistar.iotconnect.device.client.models.RuleHistoryResponse
import com.thealvistar.iotconnect.device.client.models.RuleListResponse
import com.thealvistar.iotconnect.device.client.models.RuleUpdateRequest
import com.thealvistar.iotconnect.device.client.models.RuleUpdateResponse
import com.thealvistar.iotconnect.device.client.models.RuleUpdateStatusRequest
import com.thealvistar.iotconnect.device.client.models.RuleUpdateStatusResponse
import com.thealvistar.iotconnect.device.client.models.RuleVerifyRequest
import com.thealvistar.iotconnect.device.client.models.RuleVerifyResponseBaseResponse
import retrofit2.Call
import retrofit2.http.*

interface RuleApi {
    /**
     * Get rule conditions.
     * &lt;p&gt;This API endpoint provides you rule conditions.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule conditions received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @return [Call]<[RuleConditionResponse]>
     */
    @GET("api/v2/Rule/conditions")
    fun apiV2RuleConditionsGet(): Call<RuleConditionResponse>

    /**
     * Get total rule count
     * &lt;p&gt;This API endpoint provides you the count of available rules.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule counters received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @return [Call]<[RuleCounterResponse]>
     */
    @GET("api/v2/Rule/counters")
    fun apiV2RuleCountersGet(): Call<RuleCounterResponse>

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
     * @param sortBy Sort by name ,status (optional)
     * @param isEdge IsEdge : Pass value as true to get only those rules which associated with edge template (optional)
     * @param isGateway IsGateway : Pass value as true to get only those rules which associated with gateway template (optional)
     * @param name  (optional)
     * @param status  (optional)
     * @param templateName  (optional)
     * @param entityName  (optional)
     * @param ruleType  (optional)
     * @param isLowBandwidth IsLowBandwidth : Pass value as true to get only those rules which associated with low bandwidth template (optional)
     * @param isIotEdgeEnable IsIoTEdgeEnable : Pass value as true to get only those rules which associated with Azure IotEdge template (optional)
     * @param isSphere IsSphere : Pass value as true to get only those rules are sphere template rules (optional)
     * @return [Call]<[RuleListResponse]>
     */
    @GET("api/v2/Rule")
    fun apiV2RuleGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("isEdge") isEdge: kotlin.Boolean? = null,
        @Query("isGateway") isGateway: kotlin.Boolean? = null,
        @Query("name") name: kotlin.String? = null,
        @Query("status") status: kotlin.String? = null,
        @Query("templateName") templateName: kotlin.String? = null,
        @Query("entityName") entityName: kotlin.String? = null,
        @Query("ruleType") ruleType: kotlin.String? = null,
        @Query("isLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
        @Query("isSphere") isSphere: kotlin.Boolean? = null,
    ): Call<RuleListResponse>

    /**
     * Add new rule
     * &lt;p&gt;Rules enable you to monitor your devices in near real-time and automatically invoke actions, such as send emails, show UI notifications, etc. whenever the rule is matched. In a rule, you can define the condition for which you wish to monitor your device and configure the corresponding actions. Rule triggers when the selected device telemetry crosses a specified threshold mentioned in the condition.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to create rules. Here &lt;i&gt;name&lt;/i&gt;, &lt;i&gt;templateGuid&lt;/i&gt;, &lt;i&gt;severityLevelGuid&lt;/i&gt;, &lt;i&gt;ruleType&lt;/i&gt; and &lt;i&gt;applyTo&lt;/i&gt; are mandatory for any template rule. &lt;i&gt;conditionText&lt;/i&gt; needs a condition on attribute values. If the condition is true, it is considered as the rule matched.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule created successfully and returns created rule guid.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, rule name already exist, invalid applyTo for edge template, ruleType must be 1 for edge template,  entity doesn't exist, role doesn't exist, user doesn't exist, device doesn't exist, severity level doesn't exist and invalid logged user or company.
     *
     * @param ruleCreateRequest Json object (optional)
     * @return [Call]<[RuleCreateResponse]>
     */
    @POST("api/v2/Rule")
    fun apiV2RulePost(@Body ruleCreateRequest: RuleCreateRequest? = null): Call<RuleCreateResponse>

    /**
     * Delete rule
     * &lt;p&gt;This API endpoint allows you to delete a rule. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule deleted successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Rule doesn't exist and invalid logged user or company.
     *
     * @param ruleGuid Rule Guid
     * @return [Call]<[RuleDeleteResponse]>
     */
    @DELETE("api/v2/Rule/{ruleGuid}")
    fun apiV2RuleRuleGuidDelete(@Path("ruleGuid") ruleGuid: java.util.UUID): Call<RuleDeleteResponse>

    /**
     * Get details of a single rule
     * &lt;p&gt;This API endpoint gives you all the available details of a single rule. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule information received successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Rule doesn't exist and invalid logged user or company.
     *
     * @param ruleGuid Rule Guid
     * @return [Call]<[RuleDetailResponse]>
     */
    @GET("api/v2/Rule/{ruleGuid}")
    fun apiV2RuleRuleGuidGet(@Path("ruleGuid") ruleGuid: java.util.UUID): Call<RuleDetailResponse>

    /**
     * Get Rule History.
     * &lt;p&gt;This API endpoint provides you the history of rule.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule history received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company.
     *
     * @param ruleGuid
     * @return [Call]<[RuleHistoryResponse]>
     */
    @GET("api/v2/Rule/{ruleGuid}/history")
    fun apiV2RuleRuleGuidHistoryGet(@Path("ruleGuid") ruleGuid: java.util.UUID): Call<RuleHistoryResponse>

    /**
     * Update template rule
     * &lt;p&gt;Once rules are created, anytime, you may need to change the severity level of a rule, threshold values, or where the rule should apply. You can make such changes in template rule using this API endpoint. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url and rule update details in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, rule doesn't exist ,rule name already exist, invalid applyTo for edge template, ruleType must be 1 for edge template,  entity doesn't exist, role doesn't exist, user doesn't exist, device doesn't exist, severity level doesn't exist and invalid logged user or company.
     *
     * @param ruleGuid Rule Guid
     * @param ruleUpdateRequest Json object (optional)
     * @return [Call]<[RuleUpdateResponse]>
     */
    @PUT("api/v2/Rule/{ruleGuid}")
    fun apiV2RuleRuleGuidPut(
        @Path("ruleGuid") ruleGuid: java.util.UUID,
        @Body ruleUpdateRequest: RuleUpdateRequest? = null,
    ): Call<RuleUpdateResponse>

    /**
     * Update rule status
     * &lt;p&gt;This API endpoint allows you to update your rule status. For that, you need to send &lt;i&gt;ruleGuid&lt;/i&gt; in request url and updated status in the request body. Send &lt;i&gt;true&lt;/i&gt; to activate and &lt;i&gt;false&lt;/i&gt; to deactivate a rule.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule status updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Rule doesn't exist, rule status already updated and invalid logged user or company.
     *
     * @param ruleGuid Rule guid
     * @param ruleUpdateStatusRequest Json object (optional)
     * @return [Call]<[RuleUpdateStatusResponse]>
     */
    @PUT("api/v2/Rule/{ruleGuid}/status")
    fun apiV2RuleRuleGuidStatusPut(
        @Path("ruleGuid") ruleGuid: java.util.UUID,
        @Body ruleUpdateStatusRequest: RuleUpdateStatusRequest? = null,
    ): Call<RuleUpdateStatusResponse>

    /**
     * Verify rule condition
     * &lt;p&gt;Once the rule is created or updated, using this API endpoint, you can check whether the rule condition on attributes is valid or not. If not, you will not be able to create or update a rule.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that rule verified successfully and return rule expression is valid or not.
     *  - 403: Indicates that the user is not authorized to access this section.
     *
     * @param ruleVerifyRequest Json object (optional)
     * @return [Call]<[RuleVerifyResponseBaseResponse]>
     */
    @POST("api/v2/Rule/verify")
    fun apiV2RuleVerifyPost(@Body ruleVerifyRequest: RuleVerifyRequest? = null): Call<RuleVerifyResponseBaseResponse>
}
