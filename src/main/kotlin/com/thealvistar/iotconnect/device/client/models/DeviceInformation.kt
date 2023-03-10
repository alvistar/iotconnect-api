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
 * @param guid * @param uniqueId * @param displayName * @param isConnected * @param lastActivityDate * @param isActive * @param firmwareUpgradeGuid * @param deviceTemplateGuid * @param entityGuid * @param certificateGuid * @param certificateName * @param certificateType * @param deviceTemplateAuthType * @param entityName * @param deviceTemplateName * @param note * @param image * @param cpId * @param isAcquired * @param firmwareAvail * @param parentDeviceGuid * @param tag * @param parentDeviceUniqueId * @param isParentAcquired * @param isSimulatorOn * @param isType2Support * @param isEdgeSupport * @param isAllottedDevice * @param allottedDevicePermission * @param imageUrl * @param properties * @param deviceStatus * @param isLowBandwidth * @param isIotEdgeEnable * @param isSolutionTemplate * @param fileSupport * @param msgCode * @param messageVersion * @param hasTwin * @param hasDirectMethod * @param parentCompanyGuid * @param companyGuid * @param lastConnection * @param isDpsDevice */

data class DeviceInformation(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("uniqueId")
    val uniqueId: kotlin.String? = null,

    @field:JsonProperty("displayName")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("isConnected")
    val isConnected: kotlin.Boolean? = null,

    @field:JsonProperty("lastActivityDate")
    val lastActivityDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("firmwareUpgradeGuid")
    val firmwareUpgradeGuid: kotlin.String? = null,

    @field:JsonProperty("deviceTemplateGuid")
    val deviceTemplateGuid: kotlin.String? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("certificateGuid")
    val certificateGuid: kotlin.String? = null,

    @field:JsonProperty("certificateName")
    val certificateName: kotlin.String? = null,

    @field:JsonProperty("certificateType")
    val certificateType: kotlin.Int? = null,

    @field:JsonProperty("deviceTemplateAuthType")
    val deviceTemplateAuthType: kotlin.Int? = null,

    @field:JsonProperty("entityName")
    val entityName: kotlin.String? = null,

    @field:JsonProperty("deviceTemplateName")
    val deviceTemplateName: kotlin.String? = null,

    @field:JsonProperty("note")
    val note: kotlin.String? = null,

    @field:JsonProperty("image")
    val image: kotlin.String? = null,

    @field:JsonProperty("cpId")
    val cpId: kotlin.String? = null,

    @field:JsonProperty("isAcquired")
    val isAcquired: kotlin.Int? = null,

    @field:JsonProperty("firmwareAvail")
    val firmwareAvail: kotlin.Int? = null,

    @field:JsonProperty("parentDeviceGuid")
    val parentDeviceGuid: kotlin.String? = null,

    @field:JsonProperty("tag")
    val tag: kotlin.String? = null,

    @field:JsonProperty("parentDeviceUniqueId")
    val parentDeviceUniqueId: kotlin.String? = null,

    @field:JsonProperty("isParentAcquired")
    val isParentAcquired: kotlin.Int? = null,

    @field:JsonProperty("isSimulatorOn")
    val isSimulatorOn: kotlin.Int? = null,

    @field:JsonProperty("isType2Support")
    val isType2Support: kotlin.Boolean? = null,

    @field:JsonProperty("isEdgeSupport")
    val isEdgeSupport: kotlin.Boolean? = null,

    @field:JsonProperty("isAllottedDevice")
    val isAllottedDevice: kotlin.Int? = null,

    @field:JsonProperty("allottedDevicePermission")
    val allottedDevicePermission: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null,

    @field:JsonProperty("imageUrl")
    val imageUrl: kotlin.String? = null,

    @field:JsonProperty("properties")
    val properties: kotlin.collections.List<DeviceProperty>? = null,

    @field:JsonProperty("deviceStatus")
    val deviceStatus: kotlin.String? = null,

    @field:JsonProperty("isLowBandwidth")
    val isLowBandwidth: kotlin.Boolean? = null,

    @field:JsonProperty("isIotEdgeEnable")
    val isIotEdgeEnable: kotlin.Boolean? = null,

    @field:JsonProperty("isSolutionTemplate")
    val isSolutionTemplate: kotlin.Boolean? = null,

    @field:JsonProperty("fileSupport")
    val fileSupport: kotlin.Boolean? = null,

    @field:JsonProperty("msgCode")
    val msgCode: kotlin.String? = null,

    @field:JsonProperty("messageVersion")
    val messageVersion: kotlin.String? = null,

    @field:JsonProperty("hasTwin")
    val hasTwin: kotlin.Boolean? = null,

    @field:JsonProperty("hasDirectMethod")
    val hasDirectMethod: kotlin.Boolean? = null,

    @field:JsonProperty("parentCompanyGuid")
    val parentCompanyGuid: java.util.UUID? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("lastConnection")
    val lastConnection: java.time.OffsetDateTime? = null,

    @field:JsonProperty("isDpsDevice")
    val isDpsDevice: kotlin.Boolean? = null,

)
