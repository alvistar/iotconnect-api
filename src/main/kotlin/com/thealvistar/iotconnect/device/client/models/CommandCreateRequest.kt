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
 * @param name Template command name
 * @param deviceTemplateGuid Device Template Guid
 * @param command Template command
 * @param requiredParam Pass true to set parameter as required
 * @param requiredAck Pass true to set acknowledgement as required
 * @param isOTACommand Pass true if command is OTA command
 * @param tag Tag, Required if device template has enabled gateway support.
 */

data class CommandCreateRequest(

    /* Template command name */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* Device Template Guid */
    @field:JsonProperty("deviceTemplateGuid")
    val deviceTemplateGuid: kotlin.String,

    /* Template command */
    @field:JsonProperty("command")
    val command: kotlin.String,

    /* Pass true to set parameter as required */
    @field:JsonProperty("requiredParam")
    val requiredParam: kotlin.Boolean,

    /* Pass true to set acknowledgement as required */
    @field:JsonProperty("requiredAck")
    val requiredAck: kotlin.Boolean,

    /* Pass true if command is OTA command */
    @field:JsonProperty("isOTACommand")
    val isOTACommand: kotlin.Boolean? = null,

    /* Tag, Required if device template has enabled gateway support. */
    @field:JsonProperty("tag")
    val tag: kotlin.String? = null,

)
