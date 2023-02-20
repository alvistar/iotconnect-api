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
 * @param localname 
 * @param isTemplateAttributeUsed 
 * @param parentTemplateAttributeGuid 
 */


data class AttributeLookup (

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("localname")
    val localname: kotlin.String? = null,

    @field:JsonProperty("isTemplateAttributeUsed")
    val isTemplateAttributeUsed: kotlin.Boolean? = null,

    @field:JsonProperty("parentTemplateAttributeGuid")
    val parentTemplateAttributeGuid: kotlin.String? = null

)

