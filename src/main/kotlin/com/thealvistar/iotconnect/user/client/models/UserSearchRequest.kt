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

import com.thealvistar.iotconnect.user.client.models.Roleguid
import com.thealvistar.iotconnect.user.client.models.Userguid

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param userguids User Guid List
 * @param roleguids Role Guid List
 */


data class UserSearchRequest (

    /* User Guid List */
    @field:JsonProperty("userguids")
    val userguids: kotlin.collections.List<Userguid>? = null,

    /* Role Guid List */
    @field:JsonProperty("roleguids")
    val roleguids: kotlin.collections.List<Roleguid>? = null

)
