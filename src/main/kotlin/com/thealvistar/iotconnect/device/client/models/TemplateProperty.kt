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
 * @param description * @param dataFrequency * @param fileSupport */

data class TemplateProperty(

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("dataFrequency")
    val dataFrequency: kotlin.Int? = null,

    @field:JsonProperty("fileSupport")
    val fileSupport: kotlin.Boolean? = false,

)
