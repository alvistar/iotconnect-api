/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package com.thealvistar.iotconnect.device.client.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * *
 * @param guid * @param companyGuid * @param templateGuid * @param attributeGuid * @param ruleType * @param parentAttributeGuid * @param name * @param conditionText * @param ignorePreference * @param entityGuid * @param applyTo * @param isActive * @param eventSubscriptionGuid * @param eventSubscription * @param tag * @param roles * @param users * @param devices * @param isEdgeSupport * @param isType2Support * @param isLowBandwidth * @param isIotEdgeEnable * @param snoozeTime * @param snoozeTimeUnit * @param ruleAudiences * @param reportingGroupGuid */

data class RuleDetail(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("templateGuid")
    val templateGuid: kotlin.String? = null,

    @field:JsonProperty("attributeGuid")
    val attributeGuid: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ruleType")
    val ruleType: kotlin.Int? = null,

    @field:JsonProperty("parentAttributeGuid")
    val parentAttributeGuid: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("conditionText")
    val conditionText: kotlin.String? = null,

    @field:JsonProperty("ignorePreference")
    val ignorePreference: kotlin.Boolean? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("applyTo")
    val applyTo: kotlin.Int? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("eventSubscriptionGuid")
    val eventSubscriptionGuid: kotlin.String? = null,

    @field:JsonProperty("eventSubscription")
    val eventSubscription: kotlin.Any? = null,

    @field:JsonProperty("tag")
    val tag: kotlin.String? = null,

    @field:JsonProperty("roles")
    val roles: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("users")
    val users: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("devices")
    val devices: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("isEdgeSupport")
    val isEdgeSupport: kotlin.Boolean? = null,

    @field:JsonProperty("isType2Support")
    val isType2Support: kotlin.Boolean? = null,

    @field:JsonProperty("isLowBandwidth")
    val isLowBandwidth: kotlin.Boolean? = null,

    @field:JsonProperty("isIotEdgeEnable")
    val isIotEdgeEnable: kotlin.Boolean? = null,

    @field:JsonProperty("snoozeTime")
    val snoozeTime: kotlin.Int? = null,

    @field:JsonProperty("snoozeTimeUnit")
    val snoozeTimeUnit: kotlin.Int? = null,

    @field:JsonProperty("ruleAudiences")
    val ruleAudiences: kotlin.collections.List<RuleAudienceModel>? = null,

    @field:JsonProperty("reportingGroupGuid")
    val reportingGroupGuid: kotlin.String? = null,

)
