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

package com.thealvistar.iotconnect.common.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param `param` 
 * @param message 
 */


data class ErrorModel (

    @field:JsonProperty("param")
    val `param`: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null

)

