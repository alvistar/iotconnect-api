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
 * @param guid * @param localName * @param description * @param dataTypeGuid * @param dataTypeName * @param createdDate * @param createdby * @param updatedDate * @param dataValidation * @param unit * @param tag * @param sequence * @param parentTemplateAttributeGuid * @param isTemplateAttributeUsed * @param isTagUsed * @param aggregateType * @param aggregateTypeCount * @param tumblingWindow * @param startIndex * @param numChar * @param attributes * @param isPowerBIAttributeUsed * @param attributeColor * @param conditionBitValue */

data class AttributeList(

    @field:JsonProperty("guid")
    val guid: kotlin.String? = null,

    @field:JsonProperty("localName")
    val localName: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("dataTypeGuid")
    val dataTypeGuid: kotlin.String? = null,

    @field:JsonProperty("dataTypeName")
    val dataTypeName: kotlin.String? = null,

    @field:JsonProperty("createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("createdby")
    val createdby: kotlin.String? = null,

    @field:JsonProperty("updatedDate")
    val updatedDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("dataValidation")
    val dataValidation: kotlin.String? = null,

    @field:JsonProperty("unit")
    val unit: kotlin.String? = null,

    @field:JsonProperty("tag")
    val tag: kotlin.String? = null,

    @field:JsonProperty("sequence")
    val sequence: kotlin.Int? = null,

    @field:JsonProperty("parentTemplateAttributeGuid")
    val parentTemplateAttributeGuid: kotlin.String? = null,

    @field:JsonProperty("isTemplateAttributeUsed")
    val isTemplateAttributeUsed: kotlin.Boolean? = null,

    @field:JsonProperty("isTagUsed")
    val isTagUsed: kotlin.Boolean? = null,

    @field:JsonProperty("aggregateType")
    val aggregateType: kotlin.Any? = null,

    @field:JsonProperty("aggregateTypeCount")
    val aggregateTypeCount: kotlin.Int? = null,

    @field:JsonProperty("tumblingWindow")
    val tumblingWindow: kotlin.String? = null,

    @field:JsonProperty("startIndex")
    val startIndex: kotlin.Int? = null,

    @field:JsonProperty("numChar")
    val numChar: kotlin.Int? = null,

    @field:JsonProperty("attributes")
    val attributes: kotlin.collections.List<ChildAttribute>? = null,

    @field:JsonProperty("isPowerBIAttributeUsed")
    val isPowerBIAttributeUsed: kotlin.Boolean? = null,

    @field:JsonProperty("attributeColor")
    val attributeColor: kotlin.String? = null,

    @field:JsonProperty("conditionBitValue")
    val conditionBitValue: kotlin.Int? = null,

)
