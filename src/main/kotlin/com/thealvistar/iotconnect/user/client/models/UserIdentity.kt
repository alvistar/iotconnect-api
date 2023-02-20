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

import com.thealvistar.iotconnect.user.client.models.AuthenticationFeatures

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param companyLogo 
 * @param firstName 
 * @param lastName 
 * @param timezoneGuid 
 * @param version 
 * @param uiVersion 
 * @param parentEntityGuid 
 * @param pageSize 
 * @param userGuid 
 * @param roleGuid 
 * @param companyGuid 
 * @param companyLogoUrl 
 * @param permissions 
 * @param companyName 
 * @param roleName 
 * @param cpId 
 * @param entityGuid 
 * @param solutionGuid 
 * @param isCompanyAdmin 
 * @param authFeatures 
 * @param configSettings 
 * @param userId 
 * @param isDefaultDashboard 
 * @param isServiceAccountEnabled 
 * @param companyType 
 * @param reviewStatus 
 * @param oldView 
 * @param languageGuid 
 * @param cd 
 */


data class UserIdentity (

    @field:JsonProperty("companyLogo")
    val companyLogo: kotlin.String? = null,

    @field:JsonProperty("firstName")
    val firstName: kotlin.String? = null,

    @field:JsonProperty("lastName")
    val lastName: kotlin.String? = null,

    @field:JsonProperty("timezoneGuid")
    val timezoneGuid: kotlin.String? = null,

    @field:JsonProperty("version")
    val version: kotlin.String? = null,

    @field:JsonProperty("uiVersion")
    val uiVersion: kotlin.String? = null,

    @field:JsonProperty("parentEntityGuid")
    val parentEntityGuid: java.util.UUID? = null,

    @field:JsonProperty("pageSize")
    val pageSize: kotlin.Int? = null,

    @field:JsonProperty("userGuid")
    val userGuid: kotlin.String? = null,

    @field:JsonProperty("roleGuid")
    val roleGuid: kotlin.String? = null,

    @field:JsonProperty("companyGuid")
    val companyGuid: kotlin.String? = null,

    @field:JsonProperty("companyLogoUrl")
    val companyLogoUrl: kotlin.String? = null,

    @field:JsonProperty("permissions")
    val permissions: kotlin.Any? = null,

    @field:JsonProperty("companyName")
    val companyName: kotlin.String? = null,

    @field:JsonProperty("roleName")
    val roleName: kotlin.String? = null,

    @field:JsonProperty("cpId")
    val cpId: kotlin.String? = null,

    @field:JsonProperty("entityGuid")
    val entityGuid: kotlin.String? = null,

    @field:JsonProperty("solutionGuid")
    val solutionGuid: kotlin.String? = null,

    @field:JsonProperty("isCompanyAdmin")
    val isCompanyAdmin: kotlin.Boolean? = null,

    @field:JsonProperty("authFeatures")
    val authFeatures: AuthenticationFeatures? = null,

    @field:JsonProperty("configSettings")
    val configSettings: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @field:JsonProperty("userId")
    val userId: kotlin.String? = null,

    @field:JsonProperty("isDefaultDashboard")
    val isDefaultDashboard: kotlin.Boolean? = null,

    @field:JsonProperty("isServiceAccountEnabled")
    val isServiceAccountEnabled: kotlin.Boolean? = null,

    @field:JsonProperty("companyType")
    val companyType: kotlin.Int? = null,

    @field:JsonProperty("reviewStatus")
    val reviewStatus: kotlin.String? = null,

    @field:JsonProperty("oldView")
    val oldView: kotlin.Boolean? = null,

    @field:JsonProperty("languageGuid")
    val languageGuid: kotlin.String? = null,

    @field:JsonProperty("cd")
    val cd: kotlin.String? = null

)
