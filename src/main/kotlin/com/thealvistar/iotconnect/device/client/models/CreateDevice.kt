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
 * @param newid * @param entityGuid * @param parentUniqueId * @param uniqueId */

data class CreateDevice(

    @field:JsonProperty("newid")
    val newid: kotlin.String? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("parentUniqueId")
    val parentUniqueId: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

)
