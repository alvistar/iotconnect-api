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
 * @param error * @param success */

data class Userdata(

    @field:JsonProperty("error")
    val error: kotlin.collections.List<Error>? = null,

    @field:JsonProperty("success")
    val success: kotlin.collections.List<SuccessDataResponse>? = null,

)
