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

import com.thealvistar.iotconnect.device.client.models.DeviceGrantEmailsUpdate

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param success 
 * @param error 
 */


data class DeviceGrantEmailsUpdateResult (

    @field:JsonProperty("success")
    val success: kotlin.collections.List<DeviceGrantEmailsUpdate>? = null,

    @field:JsonProperty("error")
    val error: kotlin.collections.List<DeviceGrantEmailsUpdate>? = null

)

