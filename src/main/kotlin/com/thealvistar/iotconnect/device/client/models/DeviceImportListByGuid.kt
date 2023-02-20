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
 * @param guid * @param jsonData * @param isValid * @param deviceGuid * @param deviceTemplateGuid * @param dtCode * @param firmwareGuid * @param deviceTemplateName * @param importLog * @param parentDeviceGuid * @param parentDeviceUniqueId * @param uniqueId */

data class DeviceImportListByGuid(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("jsonData")
    val jsonData: kotlin.Any? = null,

    @field:JsonProperty("isValid")
    val isValid: kotlin.Boolean? = null,

    @field:JsonProperty("deviceGuid")
    val deviceGuid: kotlin.String? = null,

    @field:JsonProperty("deviceTemplateGuid")
    val deviceTemplateGuid: kotlin.String? = null,

    @field:JsonProperty("dtCode")
    val dtCode: kotlin.String? = null,

    @field:JsonProperty("firmwareGuid")
    val firmwareGuid: kotlin.String? = null,

    @field:JsonProperty("deviceTemplateName")
    val deviceTemplateName: kotlin.String? = null,

    @field:JsonProperty("importLog")
    val importLog: kotlin.String? = null,

    @field:JsonProperty("parentDeviceGuid")
    val parentDeviceGuid: kotlin.String? = null,

    @field:JsonProperty("parentDeviceUniqueId")
    val parentDeviceUniqueId: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

)
