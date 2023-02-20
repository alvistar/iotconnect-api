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

import com.thealvistar.iotconnect.device.client.models.AttributeBaseObject

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param localName Template attribute name.   It should be alphanumeric and allows two consecutive '_' and must start with the alphabet.   Eg. Temperature, Humadity, oxygenIn1, Temperature_In, Temperature__Out, Oxygen_In__1  etc.
 * @param deviceTemplateGuid Associated Device Template Guid
 * @param dataTypeGuid Attribute's Datatype Guid
 * @param description Template attribute's description
 * @param dataValidation Attribute's data validation,   This field will be ignored if selected dataTypeGuid for the object.   Type validation values and/or validation ranges separated by commas.<div> For example: </div><div>  1, 2, 10 to 20 </div> -10 to -5, -15 <div> Red, Green, Blue</div>
 * @param unit Attribute's unit
 * @param tag Attribute's tag,   The tag is required if the associated device template has enabled gateway support.   The Tag should be alphanumeric and allows two consecutive '_' and must start with the alphabet.   Eg. AC, Camera1 Camera_1, camera_Type__1 etc.
 * @param aggregateType Attribute's aggregate type   Aggregate Types : Min, Max, Average, Sum, Latest Value.
 * @param tumblingWindow Attribute's tumbling window   Tumbling window should be 1 to 999 ending with h/m/s.<div> For example: </div><div>  5h (h = hour) </div><div> 5m (m = minute) </div><div> 5s (s = second)</div>   The tumbling window is required if the associated device template has enabled edge support.
 * @param attributes Child attributes list, This field is required if selected dataTypeGuid for the object.
 * @param xmlAttributes 
 * @param startIndex Start index is required if the associated device template has enabled low bandwidth support and data type is not an object.
 * @param numChar Range is required if the associated device template has enabled low bandwidth support and data type is not an objet.
 * @param attributeColor 
 */


data class AttributeCreateRequest (

    /* Template attribute name.   It should be alphanumeric and allows two consecutive '_' and must start with the alphabet.   Eg. Temperature, Humadity, oxygenIn1, Temperature_In, Temperature__Out, Oxygen_In__1  etc. */
    @field:JsonProperty("localName")
    val localName: kotlin.String,

    /* Associated Device Template Guid */
    @field:JsonProperty("deviceTemplateGuid")
    val deviceTemplateGuid: kotlin.String,

    /* Attribute's Datatype Guid */
    @field:JsonProperty("dataTypeGuid")
    val dataTypeGuid: kotlin.String,

    /* Template attribute's description */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* Attribute's data validation,   This field will be ignored if selected dataTypeGuid for the object.   Type validation values and/or validation ranges separated by commas.<div> For example: </div><div>  1, 2, 10 to 20 </div> -10 to -5, -15 <div> Red, Green, Blue</div> */
    @field:JsonProperty("dataValidation")
    val dataValidation: kotlin.String? = null,

    /* Attribute's unit */
    @field:JsonProperty("unit")
    val unit: kotlin.String? = null,

    /* Attribute's tag,   The tag is required if the associated device template has enabled gateway support.   The Tag should be alphanumeric and allows two consecutive '_' and must start with the alphabet.   Eg. AC, Camera1 Camera_1, camera_Type__1 etc. */
    @field:JsonProperty("tag")
    val tag: kotlin.String? = null,

    /* Attribute's aggregate type   Aggregate Types : Min, Max, Average, Sum, Latest Value. */
    @field:JsonProperty("aggregateType")
    val aggregateType: kotlin.collections.List<kotlin.String>? = null,

    /* Attribute's tumbling window   Tumbling window should be 1 to 999 ending with h/m/s.<div> For example: </div><div>  5h (h = hour) </div><div> 5m (m = minute) </div><div> 5s (s = second)</div>   The tumbling window is required if the associated device template has enabled edge support. */
    @field:JsonProperty("tumblingWindow")
    val tumblingWindow: kotlin.String? = null,

    /* Child attributes list, This field is required if selected dataTypeGuid for the object. */
    @field:JsonProperty("attributes")
    val attributes: kotlin.collections.List<AttributeBaseObject>? = null,

    @field:JsonProperty("xmlAttributes")
    val xmlAttributes: kotlin.Any? = null,

    /* Start index is required if the associated device template has enabled low bandwidth support and data type is not an object. */
    @field:JsonProperty("startIndex")
    val startIndex: kotlin.Int? = null,

    /* Range is required if the associated device template has enabled low bandwidth support and data type is not an objet. */
    @field:JsonProperty("numChar")
    val numChar: kotlin.Int? = null,

    @field:JsonProperty("attributeColor")
    val attributeColor: kotlin.String? = null

)
