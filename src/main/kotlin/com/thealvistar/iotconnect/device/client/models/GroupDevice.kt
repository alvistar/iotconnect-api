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
 * @param uniqueId * @param displayName * @param templateName * @param entityName * @param deviceGuid * @param reportingGroupGuid */

data class GroupDevice(

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("displayName")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("templateName")
    val templateName: kotlin.String? = null,

    @field:JsonProperty("entityName")
    val entityName: kotlin.String? = null,

    @field:JsonProperty("deviceGuid")
    val deviceGuid: kotlin.String? = null,

    @field:JsonProperty("reportingGroupGuid")
    val reportingGroupGuid: kotlin.String? = null,

)
