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

import com.thealvistar.iotconnect.device.client.models.SphereDeviceGroupListModel

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param guid 
 * @param name 
 * @param typeName 
 * @param isActive 
 * @param devices 
 * @param users 
 * @param sphereGroup 
 */


data class GroupList (

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("typeName")
    val typeName: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("devices")
    val devices: kotlin.Int? = null,

    @field:JsonProperty("users")
    val users: kotlin.Int? = null,

    @field:JsonProperty("sphereGroup")
    val sphereGroup: SphereDeviceGroupListModel? = null

)

