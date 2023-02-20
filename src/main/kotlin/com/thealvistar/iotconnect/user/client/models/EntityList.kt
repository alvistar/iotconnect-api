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

package com.thealvistar.iotconnect.user.client.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * *
 * @param guid * @param name * @param parentEntityGuid * @param parentName * @param description * @param childEntityLabel * @param createdDate * @param updatedDate * @param activeUserCount * @param inActiveUserCount * @param deviceCount */

data class EntityList(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("parentEntityGuid")
    val parentEntityGuid: kotlin.String? = null,

    @field:JsonProperty("parentName")
    val parentName: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("childEntityLabel")
    val childEntityLabel: kotlin.String? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("updatedDate")
    val updatedDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("activeUserCount")
    val activeUserCount: kotlin.Int? = null,

    @field:JsonProperty("inActiveUserCount")
    val inActiveUserCount: kotlin.Int? = null,

    @field:JsonProperty("deviceCount")
    val deviceCount: kotlin.Int? = null,

)
