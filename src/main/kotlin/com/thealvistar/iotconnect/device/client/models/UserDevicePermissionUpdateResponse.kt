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
 * @param `data` 
 * @param status 
 * @param message 
 * @param count 
 */


data class UserDevicePermissionUpdateResponse (

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<kotlin.Any>? = null,

    @field:JsonProperty("status")
    val status: UserDevicePermissionUpdateResponse.Status? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("count")
    val count: kotlin.Long? = null

) {

    /**
     * 
     *
     * Values: _100,_101,_102,_103,_200,_201,_202,_203,_204,_205,_206,_207,_208,_226,_300,_301,_302,_303,_304,_305,_306,_307,_308,_400,_401,_402,_403,_404,_405,_406,_407,_408,_409,_410,_411,_412,_413,_414,_415,_416,_417,_421,_422,_423,_424,_426,_428,_429,_431,_451,_500,_501,_502,_503,_504,_505,_506,_507,_508,_510,_511
     */
    enum class Status(val value: kotlin.Int) {
        @JsonProperty(value = "100") _100(100),
        @JsonProperty(value = "101") _101(101),
        @JsonProperty(value = "102") _102(102),
        @JsonProperty(value = "103") _103(103),
        @JsonProperty(value = "200") _200(200),
        @JsonProperty(value = "201") _201(201),
        @JsonProperty(value = "202") _202(202),
        @JsonProperty(value = "203") _203(203),
        @JsonProperty(value = "204") _204(204),
        @JsonProperty(value = "205") _205(205),
        @JsonProperty(value = "206") _206(206),
        @JsonProperty(value = "207") _207(207),
        @JsonProperty(value = "208") _208(208),
        @JsonProperty(value = "226") _226(226),
        @JsonProperty(value = "300") _300(300),
        @JsonProperty(value = "301") _301(301),
        @JsonProperty(value = "302") _302(302),
        @JsonProperty(value = "303") _303(303),
        @JsonProperty(value = "304") _304(304),
        @JsonProperty(value = "305") _305(305),
        @JsonProperty(value = "306") _306(306),
        @JsonProperty(value = "307") _307(307),
        @JsonProperty(value = "308") _308(308),
        @JsonProperty(value = "400") _400(400),
        @JsonProperty(value = "401") _401(401),
        @JsonProperty(value = "402") _402(402),
        @JsonProperty(value = "403") _403(403),
        @JsonProperty(value = "404") _404(404),
        @JsonProperty(value = "405") _405(405),
        @JsonProperty(value = "406") _406(406),
        @JsonProperty(value = "407") _407(407),
        @JsonProperty(value = "408") _408(408),
        @JsonProperty(value = "409") _409(409),
        @JsonProperty(value = "410") _410(410),
        @JsonProperty(value = "411") _411(411),
        @JsonProperty(value = "412") _412(412),
        @JsonProperty(value = "413") _413(413),
        @JsonProperty(value = "414") _414(414),
        @JsonProperty(value = "415") _415(415),
        @JsonProperty(value = "416") _416(416),
        @JsonProperty(value = "417") _417(417),
        @JsonProperty(value = "421") _421(421),
        @JsonProperty(value = "422") _422(422),
        @JsonProperty(value = "423") _423(423),
        @JsonProperty(value = "424") _424(424),
        @JsonProperty(value = "426") _426(426),
        @JsonProperty(value = "428") _428(428),
        @JsonProperty(value = "429") _429(429),
        @JsonProperty(value = "431") _431(431),
        @JsonProperty(value = "451") _451(451),
        @JsonProperty(value = "500") _500(500),
        @JsonProperty(value = "501") _501(501),
        @JsonProperty(value = "502") _502(502),
        @JsonProperty(value = "503") _503(503),
        @JsonProperty(value = "504") _504(504),
        @JsonProperty(value = "505") _505(505),
        @JsonProperty(value = "506") _506(506),
        @JsonProperty(value = "507") _507(507),
        @JsonProperty(value = "508") _508(508),
        @JsonProperty(value = "510") _510(510),
        @JsonProperty(value = "511") _511(511);
    }
}

