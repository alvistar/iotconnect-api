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
 * @param desc 
 * @param osFeedType 
 * @param updatePolicy 
 * @param productId 
 */


data class SphereDeviceGroupModel (

    @field:JsonProperty("desc")
    val desc: kotlin.String? = null,

    @field:JsonProperty("osFeedType")
    val osFeedType: SphereDeviceGroupModel.OsFeedType? = null,

    @field:JsonProperty("updatePolicy")
    val updatePolicy: SphereDeviceGroupModel.UpdatePolicy? = null,

    @field:JsonProperty("productId")
    val productId: java.util.UUID? = null

) {

    /**
     * 
     *
     * Values: _0,_1
     */
    enum class OsFeedType(val value: kotlin.Int) {
        @JsonProperty(value = "0") _0(0),
        @JsonProperty(value = "1") _1(1);
    }
    /**
     * 
     *
     * Values: _0,_1,_2
     */
    enum class UpdatePolicy(val value: kotlin.Int) {
        @JsonProperty(value = "0") _0(0),
        @JsonProperty(value = "1") _1(1),
        @JsonProperty(value = "2") _2(2);
    }
}

