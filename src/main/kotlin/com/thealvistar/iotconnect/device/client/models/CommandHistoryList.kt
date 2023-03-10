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
 * @param commandHistoryGuid * @param uniqueId * @param parentDeviceUniqueId * @param status * @param cmdText * @param statusDate * @param createdByName * @param isResend * @param resendHistory * @param statusText */

data class CommandHistoryList(

    @field:JsonProperty("commandHistoryGuid")
    val commandHistoryGuid: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("parentDeviceUniqueId")
    val parentDeviceUniqueId: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("cmdText")
    val cmdText: kotlin.String? = null,

    @field:JsonProperty("statusDate")
    val statusDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("createdByName")
    val createdByName: kotlin.String? = null,

    @field:JsonProperty("isResend")
    val isResend: kotlin.Boolean? = null,

    @field:JsonProperty("resendHistory")
    val resendHistory: ResendHistoryModel? = null,

    @field:JsonProperty("statusText")
    val statusText: kotlin.String? = null,

)
