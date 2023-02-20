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
 * @param uniqueId 
 * @param deviceName 
 * @param entityName 
 * @param createdDate 
 * @param type2Support 
 * @param edgeSupport 
 * @param lowbandWidth 
 * @param iotEdgeEnable 
 */


data class RecentActivity (

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("deviceName")
    val deviceName: kotlin.String? = null,

    @field:JsonProperty("entityName")
    val entityName: kotlin.String? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("type2Support")
    val type2Support: kotlin.Boolean? = null,

    @field:JsonProperty("edgeSupport")
    val edgeSupport: kotlin.Boolean? = null,

    @field:JsonProperty("lowbandWidth")
    val lowbandWidth: kotlin.Boolean? = null,

    @field:JsonProperty("iotEdgeEnable")
    val iotEdgeEnable: kotlin.Boolean? = null

)

