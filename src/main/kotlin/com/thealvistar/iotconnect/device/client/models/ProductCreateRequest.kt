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
 * @param createDefaultGroups * @param name Name of the sphere product
 * @param description Sphere product description
 */

data class ProductCreateRequest(

    @field:JsonProperty("createDefaultGroups")
    val createDefaultGroups: kotlin.Boolean? = null,

    /* Name of the sphere product */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* Sphere product description */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
