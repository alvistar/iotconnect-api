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
 * @param isActive Updated active status. true: Active, false: Inactive
 */


data class RoleStatusUpdateV2Request (

    /* Updated active status. true: Active, false: Inactive */
    @field:JsonProperty("isActive")
    val isActive: kotlin.String

)

