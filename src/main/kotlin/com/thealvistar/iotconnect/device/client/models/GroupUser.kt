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
 * @param name 
 * @param email 
 * @param permission 
 * @param userGuid 
 * @param reportingGroupGuid 
 */


data class GroupUser (

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    @field:JsonProperty("permission")
    val permission: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null,

    @field:JsonProperty("userGuid")
    val userGuid: kotlin.String? = null,

    @field:JsonProperty("reportingGroupGuid")
    val reportingGroupGuid: kotlin.String? = null

)
