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
 * @param guid * @param uniqueId * @param displayName * @param aduGroup * @param isActive * @param deviceTemplateName * @param entityName * @param deviceStatus */

data class DeviceUpdatesDeviceList(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("displayName")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("aduGroup")
    val aduGroup: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("deviceTemplateName")
    val deviceTemplateName: kotlin.String? = null,

    @field:JsonProperty("entityName")
    val entityName: kotlin.String? = null,

    @field:JsonProperty("deviceStatus")
    val deviceStatus: kotlin.String? = null,

)
