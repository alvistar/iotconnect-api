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
 * @param message * @param status * @param `data` */

data class SuccessResponse(

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.Int? = null,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<kotlin.Any>? = null,

)
