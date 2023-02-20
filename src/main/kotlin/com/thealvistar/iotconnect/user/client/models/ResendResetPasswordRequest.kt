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
 * @param email User's login email Id. eg: abc@gmail.com
 */


data class ResendResetPasswordRequest (

    /* User's login email Id. eg: abc@gmail.com */
    @field:JsonProperty("email")
    val email: kotlin.String? = null

)

