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
 * @param commandGuid Template command Guid
 * @param parameterValue Command Value
 * @param applyTo Send 1 or 2. 1: for entity, 2: for device guid list
 * @param devices Device guid list.               Required if applyTo is 2
 * @param entityGuid Entity Guid.               Required if applyTo is 1
 * @param isRecursive Send true to include child entity devices.  Required if applyTo is 1
 * @param isScheduledCommand Allows to schedule a command. <i>true</i>: To schedule a command, <i>false</i>: Doesn't schedule and send command instantly.
 * @param scheduleUnit <i>scheduleUnit</i> is mandatory when <i>isScheduledCommand</i> is true. Valid unit values are given below.              <i>hour</i> : To send a command after every N hours.              <i>minute</i> : To send a command after every N minutes.              <i>time</i> : To send a command at specific time of the day.
 * @param scheduleUnitValue <i>scheduleUnitValue</i> is mandatory when <i>isScheduledCommand</i> is true. This requires value as per the selected <i>scheduleUnit</i>.              When scheduleUnit is <i>hour</i>, set hours between 1 to 24. eg: 5(after every 5 hours command will be sent)              When scheduleUnit is <i>minute</i>, set minutes between 5 to 60. eg: 30(after every 30 minutes command will be sent)              When scheduleUnit is <i>time</i>, set time in HH:mm format. eg: 13:30(every day at 01:30 PM command will be sent)
 */


data class CommandSendRequest (

    /* Template command Guid */
    @field:JsonProperty("commandGuid")
    val commandGuid: kotlin.String,

    /* Command Value */
    @field:JsonProperty("parameterValue")
    val parameterValue: kotlin.String? = null,

    /* Send 1 or 2. 1: for entity, 2: for device guid list */
    @field:JsonProperty("applyTo")
    val applyTo: kotlin.Int? = null,

    /* Device guid list.               Required if applyTo is 2 */
    @field:JsonProperty("devices")
    val devices: kotlin.collections.List<kotlin.String>? = null,

    /* Entity Guid.               Required if applyTo is 1 */
    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    /* Send true to include child entity devices.  Required if applyTo is 1 */
    @field:JsonProperty("isRecursive")
    val isRecursive: kotlin.Boolean? = null,

    /* Allows to schedule a command. <i>true</i>: To schedule a command, <i>false</i>: Doesn't schedule and send command instantly. */
    @field:JsonProperty("isScheduledCommand")
    val isScheduledCommand: kotlin.Boolean? = null,

    /* <i>scheduleUnit</i> is mandatory when <i>isScheduledCommand</i> is true. Valid unit values are given below.              <i>hour</i> : To send a command after every N hours.              <i>minute</i> : To send a command after every N minutes.              <i>time</i> : To send a command at specific time of the day. */
    @field:JsonProperty("scheduleUnit")
    val scheduleUnit: kotlin.String? = null,

    /* <i>scheduleUnitValue</i> is mandatory when <i>isScheduledCommand</i> is true. This requires value as per the selected <i>scheduleUnit</i>.              When scheduleUnit is <i>hour</i>, set hours between 1 to 24. eg: 5(after every 5 hours command will be sent)              When scheduleUnit is <i>minute</i>, set minutes between 5 to 60. eg: 30(after every 30 minutes command will be sent)              When scheduleUnit is <i>time</i>, set time in HH:mm format. eg: 13:30(every day at 01:30 PM command will be sent) */
    @field:JsonProperty("scheduleUnitValue")
    val scheduleUnitValue: kotlin.String? = null

)

