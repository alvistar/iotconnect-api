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
 * @param guid * @param uniqueId * @param deviceTemplateGuid * @param authType * @param certificateThumbPrint * @param tag * @param parentDeviceGuid * @param cpId * @param isEdgeSupport * @param entityGuid * @param firmwareupgradeguid * @param displayName * @param isActive * @param isDeleted * @param note * @param isAcquired */

data class UnassociatedAttachBulk(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("deviceTemplateGuid")
    val deviceTemplateGuid: kotlin.String? = null,

    @field:JsonProperty("authType")
    val authType: kotlin.Int? = null,

    @field:JsonProperty("certificateThumbPrint")
    val certificateThumbPrint: kotlin.String? = null,

    @field:JsonProperty("tag")
    val tag: kotlin.String? = null,

    @field:JsonProperty("parentDeviceGuid")
    val parentDeviceGuid: kotlin.String? = null,

    @field:JsonProperty("cpId")
    val cpId: kotlin.String? = null,

    @field:JsonProperty("isEdgeSupport")
    val isEdgeSupport: kotlin.Boolean? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("firmwareupgradeguid")
    val firmwareupgradeguid: kotlin.String? = null,

    @field:JsonProperty("displayName")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("note")
    val note: kotlin.String? = null,

    @field:JsonProperty("isAcquired")
    val isAcquired: kotlin.Boolean? = null,

)
