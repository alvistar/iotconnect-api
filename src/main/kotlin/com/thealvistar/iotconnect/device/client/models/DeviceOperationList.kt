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
 * @param guid * @param startDate * @param endDate * @param isActive * @param isDeleted * @param createddate * @param createdby */

data class DeviceOperationList(

    @field:JsonProperty("guid")
    val guid: java.util.UUID? = null,

    @field:JsonProperty("startDate")
    val startDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("endDate")
    val endDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("createddate")
    val createddate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("createdby")
    val createdby: java.util.UUID? = null,

)
