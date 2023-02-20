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
 * @param name Role Name
 * @param solutions Solution guid list
 * @param description Role Description
 */


data class RoleUpdateRequest (

    /* Role Name */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* Solution guid list */
    @field:JsonProperty("solutions")
    val solutions: kotlin.collections.List<kotlin.String>,

    /* Role Description */
    @field:JsonProperty("description")
    val description: kotlin.String? = null

)

