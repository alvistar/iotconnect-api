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

package com.thealvistar.iotconnect.user.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param guid Property Guid
 * @param `value` Property Value
 */


data class Propertys (

    /* Property Guid */
    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    /* Property Value */
    @field:JsonProperty("value")
    val `value`: kotlin.String? = null

)
