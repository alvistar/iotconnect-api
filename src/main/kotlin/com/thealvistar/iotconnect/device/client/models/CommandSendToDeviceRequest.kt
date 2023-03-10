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
 * @param commandGuid Command Guid
 * @param parameterValue Command Value
 */

data class CommandSendToDeviceRequest(

    /* Command Guid */
    @field:JsonProperty("commandGuid")
    val commandGuid: kotlin.String,

    /* Command Value */
    @field:JsonProperty("parameterValue")
    val parameterValue: kotlin.String? = null,

)
