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
 * @param firstname 
 * @param lastname 
 * @param email 
 * @param rolename 
 * @param properties 
 * @param userGuid 
 * @param invitationGuid 
 * @param isExistingUser 
 */


data class UserDataSuccessResponse (

    @field:JsonProperty("firstname")
    val firstname: kotlin.String? = null,

    @field:JsonProperty("lastname")
    val lastname: kotlin.String? = null,

    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    @field:JsonProperty("rolename")
    val rolename: kotlin.String? = null,

    @field:JsonProperty("properties")
    val properties: kotlin.Any? = null,

    @field:JsonProperty("userGuid")
    val userGuid: kotlin.String? = null,

    @field:JsonProperty("invitationGuid")
    val invitationGuid: kotlin.String? = null,

    @field:JsonProperty("isExistingUser")
    val isExistingUser: kotlin.Boolean? = null

)
