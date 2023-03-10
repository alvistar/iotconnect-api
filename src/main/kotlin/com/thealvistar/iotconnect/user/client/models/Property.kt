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
 * @param key Custom property key
 * @param `value` Custom property value
 */

data class Property(

    /* Custom property key */
    @field:JsonProperty("key")
    val key: kotlin.String? = null,

    /* Custom property value */
    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

)
