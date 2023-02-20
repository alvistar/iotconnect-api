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
 * @param userGuid 
 * @param invitationGuid 
 * @param isExistingUser 
 * @param isWelcomeEmail 
 */


data class EntityUpdate (

    @field:JsonProperty("userGuid")
    val userGuid: kotlin.String? = null,

    @field:JsonProperty("invitationGuid")
    val invitationGuid: kotlin.String? = null,

    @field:JsonProperty("isExistingUser")
    val isExistingUser: kotlin.Boolean? = null,

    @field:JsonProperty("isWelcomeEmail")
    val isWelcomeEmail: kotlin.Boolean? = null

)

