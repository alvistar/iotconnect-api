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

package com.thealvistar.iotconnect.auth.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param username User's login email id
 * @param password User's login password
 * @param deviceType Type of the device used for login
 * @param osName Device os name
 * @param osVersion Device os version
 * @param deviceToken Device token
 * @param uuid 
 */


data class MobileLoginRequest (

    /* User's login email id */
    @field:JsonProperty("username")
    val username: kotlin.String,

    /* User's login password */
    @field:JsonProperty("password")
    val password: kotlin.String,

    /* Type of the device used for login */
    @field:JsonProperty("deviceType")
    val deviceType: kotlin.String,

    /* Device os name */
    @field:JsonProperty("osName")
    val osName: kotlin.String,

    /* Device os version */
    @field:JsonProperty("osVersion")
    val osVersion: kotlin.String,

    /* Device token */
    @field:JsonProperty("deviceToken")
    val deviceToken: kotlin.String,

    @field:JsonProperty("uuid")
    val uuid: kotlin.String

)

