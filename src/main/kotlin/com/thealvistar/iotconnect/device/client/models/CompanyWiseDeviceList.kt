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
 * @param guid 
 * @param uniqueId 
 * @param displayName 
 * @param isConnected 
 * @param isAcquired 
 * @param lastactivityDate 
 * @param isActive 
 * @param deviceStatus 
 * @param authType 
 * @param firmwareupgradeGuid 
 * @param deviceTemplateGuid 
 * @param deviceInfo 
 * @param deviceTemplateName 
 * @param reportingTo 
 * @param entityGuid 
 * @param entityName 
 * @param childDeviceCount 
 * @param isType2Support 
 * @param createdByName 
 * @param createdDate 
 * @param cpid 
 * @param companyGuid 
 * @param lastConnection 
 * @param lastCommunication 
 */


data class CompanyWiseDeviceList (

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("displayName")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("isConnected")
    val isConnected: kotlin.Boolean? = null,

    @field:JsonProperty("isAcquired")
    val isAcquired: kotlin.Boolean? = null,

    @field:JsonProperty("lastactivityDate")
    val lastactivityDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("deviceStatus")
    val deviceStatus: kotlin.String? = null,

    @field:JsonProperty("authType")
    val authType: kotlin.Int? = null,

    @field:JsonProperty("firmwareupgradeGuid")
    val firmwareupgradeGuid: kotlin.String? = null,

    @field:JsonProperty("deviceTemplateGuid")
    val deviceTemplateGuid: kotlin.String? = null,

    @field:JsonProperty("deviceInfo")
    val deviceInfo: kotlin.Any? = null,

    @field:JsonProperty("deviceTemplateName")
    val deviceTemplateName: kotlin.String? = null,

    @field:JsonProperty("reportingTo")
    val reportingTo: kotlin.String? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("entityName")
    val entityName: kotlin.String? = null,

    @field:JsonProperty("childDeviceCount")
    val childDeviceCount: kotlin.Int? = null,

    @field:JsonProperty("isType2Support")
    val isType2Support: kotlin.Boolean? = null,

    @field:JsonProperty("createdByName")
    val createdByName: kotlin.String? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("cpid")
    val cpid: kotlin.String? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("lastConnection")
    val lastConnection: java.time.OffsetDateTime? = null,

    @field:JsonProperty("lastCommunication")
    val lastCommunication: java.time.OffsetDateTime? = null

)

