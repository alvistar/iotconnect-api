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
    "UnusedImport"
)

package com.thealvistar.iotconnect.device.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param guid 
 * @param name 
 * @param target 
 * @param conditionBitValue 
 * @param description 
 */


data class TemplateDataType (

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("target")
    val target: kotlin.Int? = null,

    @field:JsonProperty("conditionBitValue")
    val conditionBitValue: kotlin.Int? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null

)

