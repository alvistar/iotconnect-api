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
 * @param properties */

data class UserPropertiesUpdateRequest(

    @field:JsonProperty("properties")
    val properties: kotlin.collections.List<Propertys>? = null,

)
