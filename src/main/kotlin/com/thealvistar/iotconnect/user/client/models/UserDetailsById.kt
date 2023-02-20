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

package com.thealvistar.iotconnect.user.client.models

import com.thealvistar.iotconnect.user.client.models.UserinfoValues

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param userGuid 
 * @param userId 
 * @param companyGuid 
 * @param firstName 
 * @param lastName 
 * @param timezoneGuid 
 * @param imageName 
 * @param isActive 
 * @param roleName 
 * @param roleGuid 
 * @param contactNo 
 * @param entityName 
 * @param userInfo 
 * @param createdBy 
 * @param updatedBy 
 * @param updatedByName 
 * @param createdDate 
 * @param updatedDate 
 * @param entityGuid 
 * @param parentEntityGuid 
 * @param companyLogo 
 * @param companyName 
 * @param companyCpid 
 * @param timezoneOffset 
 * @param imageUrl 
 * @param companyLogoUrl 
 * @param dmsVersion 
 * @param isCompanyAdmin 
 */


data class UserDetailsById (

    @field:JsonProperty("userGuid")
    val userGuid: kotlin.String? = null,

    @field:JsonProperty("userId")
    val userId: kotlin.String? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("firstName")
    val firstName: kotlin.String? = null,

    @field:JsonProperty("lastName")
    val lastName: kotlin.String? = null,

    @field:JsonProperty("timezoneGuid")
    val timezoneGuid: kotlin.String? = null,

    @field:JsonProperty("imageName")
    val imageName: kotlin.String? = null,

    @field:JsonProperty("isActive")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("roleName")
    val roleName: kotlin.String? = null,

    @field:JsonProperty("roleGuid")
    val roleGuid: kotlin.String? = null,

    @field:JsonProperty("contactNo")
    val contactNo: kotlin.String? = null,

    @field:JsonProperty("entityName")
    val entityName: kotlin.String? = null,

    @field:JsonProperty("userInfo")
    val userInfo: kotlin.collections.List<UserinfoValues>? = null,

    @field:JsonProperty("createdBy")
    val createdBy: kotlin.String? = null,

    @field:JsonProperty("updatedBy")
    val updatedBy: kotlin.String? = null,

    @field:JsonProperty("updatedByName")
    val updatedByName: kotlin.String? = null,

    @field:JsonProperty("createdDate")
    val createdDate: kotlin.String? = null,

    @field:JsonProperty("updatedDate")
    val updatedDate: kotlin.String? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("parentEntityGuid")
    val parentEntityGuid: kotlin.String? = null,

    @field:JsonProperty("companyLogo")
    val companyLogo: kotlin.String? = null,

    @field:JsonProperty("companyName")
    val companyName: kotlin.String? = null,

    @field:JsonProperty("companyCpid")
    val companyCpid: kotlin.String? = null,

    @field:JsonProperty("timezoneOffset")
    val timezoneOffset: kotlin.String? = null,

    @field:JsonProperty("imageUrl")
    val imageUrl: kotlin.String? = null,

    @field:JsonProperty("companyLogoUrl")
    val companyLogoUrl: kotlin.String? = null,

    @field:JsonProperty("dms-version")
    val dmsVersion: kotlin.String? = null,

    @field:JsonProperty("isCompanyAdmin")
    val isCompanyAdmin: kotlin.Boolean? = null

)

