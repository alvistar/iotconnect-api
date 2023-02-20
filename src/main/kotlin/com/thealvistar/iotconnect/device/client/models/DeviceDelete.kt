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
 * @param status 
 * @param entityGuid 
 * @param uniqueId 
 * @param parentDeviceGuid 
 * @param eventPlaceHolders 
 */


data class DeviceDelete (

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.Boolean? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("parentDeviceGuid")
    val parentDeviceGuid: kotlin.String? = null,

    @field:JsonProperty("eventPlaceHolders")
    val eventPlaceHolders: kotlin.String? = null

)

