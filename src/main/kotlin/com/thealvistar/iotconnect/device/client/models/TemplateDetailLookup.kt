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
 * @param attributes * @param settings * @param commands */

data class TemplateDetailLookup(

    @field:JsonProperty("attributes")
    val attributes: kotlin.Any? = null,

    @field:JsonProperty("settings")
    val settings: kotlin.Any? = null,

    @field:JsonProperty("commands")
    val commands: kotlin.Any? = null,

)
