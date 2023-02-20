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

package com.thealvistar.iotconnect.user.client.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * *
 * @param guid * @param userId * @param companyGuid * @param firstName * @param lastName * @param timezoneGuid * @param imageName * @param isActive * @param isDeleted * @param createdBy * @param updatedBy * @param createdDate * @param updatedDate * @param isPasswordCreated */

data class UserAvailabilityUsingEmail(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("userId")
    val userId: kotlin.String? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("firstName")
    val firstName: kotlin.String? = null,

    @field:JsonProperty("lastName")
    val lastName: kotlin.String? = null,

    @field:JsonProperty("timezoneGuid")
    val timezoneGuid: kotlin.String? = null,

    @field:JsonProperty("imageName")
    val imageName: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("createdBy")
    val createdBy: kotlin.String? = null,

    @field:JsonProperty("updatedBy")
    val updatedBy: kotlin.String? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("updatedDate")
    val updatedDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("isPasswordCreated")
    val isPasswordCreated: kotlin.Int? = null,

)
