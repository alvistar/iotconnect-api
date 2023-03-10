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
 * @param guid * @param companyGuid * @param commandGuid * @param commandName * @param templateGuid * @param templateName * @param applyTo * @param entityGuid * @param isRecursive * @param selectedDevices * @param unit * @param unitValue * @param unitTime * @param parameterValue * @param isActive * @param tagList * @param selectedTag * @param commandList * @param deviceList * @param nextExecutionDate */

data class CommandScheduleDetail(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("commandGuid")
    val commandGuid: kotlin.String? = null,

    @field:JsonProperty("commandName")
    val commandName: kotlin.String? = null,

    @field:JsonProperty("templateGuid")
    val templateGuid: kotlin.String? = null,

    @field:JsonProperty("templateName")
    val templateName: kotlin.String? = null,

    @field:JsonProperty("applyTo")
    val applyTo: kotlin.Int? = null,

    @field:JsonProperty("EntityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("isRecursive")
    val isRecursive: kotlin.Boolean? = null,

    @field:JsonProperty("selectedDevices")
    val selectedDevices: kotlin.Any? = null,

    @field:JsonProperty("unit")
    val unit: kotlin.String? = null,

    @field:JsonProperty("unitValue")
    val unitValue: kotlin.Int? = null,

    @field:JsonProperty("unitTime")
    val unitTime: kotlin.String? = null,

    @field:JsonProperty("parameterValue")
    val parameterValue: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("tagList")
    val tagList: kotlin.Any? = null,

    @field:JsonProperty("selectedTag")
    val selectedTag: kotlin.String? = null,

    @field:JsonProperty("commandList")
    val commandList: kotlin.Any? = null,

    @field:JsonProperty("deviceList")
    val deviceList: kotlin.Any? = null,

    @field:JsonProperty("nextExecutionDate")
    val nextExecutionDate: kotlin.String? = null,

)
