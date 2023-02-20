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

package com.thealvistar.iotconnect.device.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param interval Interval duration value after rule matched.  Note : internal duration will consider based on intervalUnit
 * @param intervalUnit Interval unit for interval  1 : Minute,  2 : Hour,  3 : Day   Note : Default value is Minute
 * @param roleGuids Role guid list. Notification will be sent to all users of this role if <i>userGuids</i> not exists.
 * @param guid Audience guid to update rule audience detail.
 * @param userGuids User guid list which are associated with <i>roleGuids</i>. Notification will be sent to all users in the list.
 */


data class RuleAudienceUpdate (

    /* Interval duration value after rule matched.  Note : internal duration will consider based on intervalUnit */
    @field:JsonProperty("interval")
    val interval: kotlin.Int,

    /* Interval unit for interval  1 : Minute,  2 : Hour,  3 : Day   Note : Default value is Minute */
    @field:JsonProperty("intervalUnit")
    val intervalUnit: kotlin.Int,

    /* Role guid list. Notification will be sent to all users of this role if <i>userGuids</i> not exists. */
    @field:JsonProperty("roleGuids")
    val roleGuids: kotlin.collections.List<kotlin.String>,

    /* Audience guid to update rule audience detail. */
    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    /* User guid list which are associated with <i>roleGuids</i>. Notification will be sent to all users in the list. */
    @field:JsonProperty("userGuids")
    val userGuids: kotlin.collections.List<kotlin.String>? = null

)

