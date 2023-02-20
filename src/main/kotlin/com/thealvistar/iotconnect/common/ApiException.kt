package com.thealvistar.iotconnect.common

import com.thealvistar.iotconnect.common.models.ErrorsResponse

class ApiException(val errorsResponse: ErrorsResponse) : Exception(errorsResponse.message) {
    override fun toString(): String {
        return "ApiException(errorsResponse=$errorsResponse)"
    }
}
