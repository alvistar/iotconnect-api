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
 * @param userguid * @param eventPlaceHolders */

data class UserDelete(

    @field:JsonProperty("userguid")
    val userguid: kotlin.String? = null,

    @field:JsonProperty("eventPlaceHolders")
    val eventPlaceHolders: kotlin.String? = null,

)
