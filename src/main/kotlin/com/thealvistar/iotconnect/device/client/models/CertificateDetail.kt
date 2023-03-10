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
 * @param guid * @param name * @param type * @param primayThumbPrint * @param clientCert * @param certPassword * @param validTill * @param companyGuid * @param isActive * @param isDeleted * @param createdDate * @param createdBy * @param updatedDate * @param updatedBy * @param isVerified * @param etag * @param origin * @param isDeviceConnected * @param clientCertUrl * @param brokerGuid * @param isSphereCerti * @param iotHubInfoGuid */

data class CertificateDetail(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: kotlin.Int? = null,

    @field:JsonProperty("primayThumbPrint")
    val primayThumbPrint: kotlin.String? = null,

    @field:JsonProperty("clientCert")
    val clientCert: kotlin.String? = null,

    @field:JsonProperty("certPassword")
    val certPassword: kotlin.String? = null,

    @field:JsonProperty("validTill")
    val validTill: java.time.OffsetDateTime? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("createdBy")
    val createdBy: kotlin.String? = null,

    @field:JsonProperty("updatedDate")
    val updatedDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("updatedBy")
    val updatedBy: kotlin.String? = null,

    @field:JsonProperty("isVerified")
    val isVerified: kotlin.Boolean? = null,

    @field:JsonProperty("etag")
    val etag: kotlin.String? = null,

    @field:JsonProperty("origin")
    val origin: kotlin.String? = null,

    @field:JsonProperty("isDeviceConnected")
    val isDeviceConnected: kotlin.Boolean? = null,

    @field:JsonProperty("clientCertUrl")
    val clientCertUrl: kotlin.String? = null,

    @field:JsonProperty("brokerGuid")
    val brokerGuid: kotlin.String? = null,

    @field:JsonProperty("isSphereCerti")
    val isSphereCerti: kotlin.Boolean? = null,

    @field:JsonProperty("iotHubInfoGuid")
    val iotHubInfoGuid: java.util.UUID? = null,

)
