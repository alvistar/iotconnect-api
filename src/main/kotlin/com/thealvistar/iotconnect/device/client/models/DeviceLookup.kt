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
 * @param guid * @param uniqueId * @param displayName * @param parentDeviceGuid * @param isAcquired * @param isActive * @param isEdgeSupport * @param isParentAcquired * @param deviceTemplateGuid * @param messageVersion */

data class DeviceLookup(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("displayName")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("parentDeviceGuid")
    val parentDeviceGuid: kotlin.String? = null,

    @field:JsonProperty("isAcquired")
    val isAcquired: kotlin.Int? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("isEdgeSupport")
    val isEdgeSupport: kotlin.Boolean? = null,

    @field:JsonProperty("isParentAcquired")
    val isParentAcquired: kotlin.Boolean? = null,

    @field:JsonProperty("deviceTemplateGuid")
    val deviceTemplateGuid: kotlin.String? = null,

    @field:JsonProperty("messageVersion")
    val messageVersion: kotlin.String? = null,

)
