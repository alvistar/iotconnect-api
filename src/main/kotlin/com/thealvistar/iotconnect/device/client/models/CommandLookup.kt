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
 * @param command 
 * @param requiredParam 
 */


data class CommandLookup (

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("command")
    val command: kotlin.String? = null,

    @field:JsonProperty("requiredParam")
    val requiredParam: kotlin.Boolean? = null

)
