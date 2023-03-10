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
 * @param guid * @param methodName * @param responseTimeoutSecond * @param createdDate * @param createBy */

data class DirectMethodList(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("methodName")
    val methodName: kotlin.String? = null,

    @field:JsonProperty("responseTimeoutSecond")
    val responseTimeoutSecond: kotlin.Int? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("createBy")
    val createBy: kotlin.String? = null,

)
