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
 * @param name 
 * @param type 
 * @param primayThumbPrint 
 * @param clientCert 
 * @param validTill 
 * @param isVerified 
 * @param etag 
 * @param companyGuid 
 * @param isActive 
 * @param rowNum 
 * @param origin 
 * @param clientCertUrl 
 * @param status 
 * @param isSphereCerti 
 * @param createdByUser 
 * @param createdDate 
 * @param referenceId 
 */


data class CertificateList (

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

    @field:JsonProperty("validTill")
    val validTill: java.time.OffsetDateTime? = null,

    @field:JsonProperty("isVerified")
    val isVerified: kotlin.Boolean? = null,

    @field:JsonProperty("etag")
    val etag: kotlin.String? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("row_num")
    val rowNum: kotlin.Int? = null,

    @field:JsonProperty("origin")
    val origin: kotlin.String? = null,

    @field:JsonProperty("clientCertUrl")
    val clientCertUrl: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("isSphereCerti")
    val isSphereCerti: kotlin.Boolean? = null,

    @field:JsonProperty("createdByUser")
    val createdByUser: kotlin.String? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("referenceId")
    val referenceId: kotlin.String? = null

)
