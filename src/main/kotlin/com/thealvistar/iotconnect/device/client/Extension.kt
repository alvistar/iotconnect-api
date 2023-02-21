package com.thealvistar.iotconnect.device.client

import com.thealvistar.iotconnect.device.client.apis.DeviceApi
import com.thealvistar.iotconnect.device.client.models.DeviceList
import java.util.UUID

fun DeviceApi.getDevice(uniqueDeviceId: String): DeviceList {
    val response = apiV2DeviceGet(uniqueId = uniqueDeviceId)
        .execute().body() ?: throw RuntimeException("Device not found")

    return response.data!![0]
}

fun DeviceApi.deleteDevice(uniqueDeviceId: String) {
    val guid = getDevice(uniqueDeviceId).guid
    apiV2DeviceDeviceGuidDelete(UUID.fromString(guid)).execute()
}
