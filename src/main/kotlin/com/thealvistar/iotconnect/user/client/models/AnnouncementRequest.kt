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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param announcementGuid Announcement Guid
 */


data class AnnouncementRequest (

    /* Announcement Guid */
    @field:JsonProperty("announcementGuid")
    val announcementGuid: kotlin.collections.List<kotlin.String>? = null

)
