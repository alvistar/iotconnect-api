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

package com.thealvistar.iotconnect.auth.client.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * *
 * @param status * @param message * @param error */

data class ConflictErrorModel(

    @field:JsonProperty("status")
    val status: kotlin.Int? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("error")
    val error: kotlin.collections.List<ErrorModel>? = null,

)
