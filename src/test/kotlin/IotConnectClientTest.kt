import com.github.tomakehurst.wiremock.client.WireMock.absent
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.unauthorized
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED
import com.marcinziolo.kotlin.wiremock.contains
import com.marcinziolo.kotlin.wiremock.equalTo
import com.marcinziolo.kotlin.wiremock.mockGet
import com.marcinziolo.kotlin.wiremock.mockPost
import com.marcinziolo.kotlin.wiremock.returnsJson
import com.marcinziolo.kotlin.wiremock.verifyCalls
import com.thealvistar.iotconnect.BaseUrls
import com.thealvistar.iotconnect.IotConnectClient
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class IotConnectClientTest {
    lateinit var client: IotConnectClient

    @BeforeEach
    fun setup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val port = wmRuntimeInfo.httpPort

        client = IotConnectClient(
            username = "username",
            password = "password",
            solutionId = "solutionId",
            baseUrls = BaseUrls(
                authClient = "http://localhost:$port",
                deviceClient = "http://localhost:$port",
                userClient = "http://localhost:$port",
            ),
        )
    }

    @Test
    fun authentication(wmRuntimeInfo: WireMockRuntimeInfo) {
        mockGet {
            url equalTo "/api/v2/Auth/basic-token"
        } returnsJson {
            body = basicTokenResponse
        }

        mockPost {
            url equalTo "/api/v2/Auth/login"
        } returnsJson {
            body = accessTokenResponse
        }

        val port = wmRuntimeInfo.httpPort

        client.getAccessToken()

        verifyCalls {
            urlPath equalTo "/api/v2/Auth/login"
            body contains "username" equalTo "username"
            body contains "password" equalTo "password"
            headers contains "solution-key" equalTo "solutionId"
            headers contains "Authorization" equalTo "YXZuZXRwb2M6bHpydGl1dGtlcWZtdHBqbGZ1ZHF0emx1cW1lcHdrc296aGV1bHF1dWtwZ2Zlb3htZnN1aWpnZW5raXlqb2J2dm9nYnhqZmVwcHVxY3VybXdhbWlvanh4YmJqeWF2c2ZqcWh2aQ=="
            exactly = 1
        }
    }

    @Test
    fun `Get token automatically`() {
        stubFor(
            get(urlPathEqualTo("/api/v2/Device"))
                .withHeader("Authorization", absent())
                .willReturn(unauthorized()),
        )

        mockGet {
            urlPath equalTo "/api/v2/Device"
        } returnsJson {
            body = deviceResponse
        }

        mockGet {
            url equalTo "/api/v2/Auth/basic-token"
        } returnsJson {
            body = basicTokenResponse
        }

        mockPost {
            url equalTo "/api/v2/Auth/login"
        } returnsJson {
            body = accessTokenResponse
        }

        client.deviceService.apiV2DeviceGet().execute()
    }

    @Test
    fun `Refresh token`() {
        stubFor(
            get(urlPathEqualTo("/api/v2/Device"))
                .willReturn(unauthorized()),
        )

        stubFor(
            get(urlPathEqualTo("/api/v2/Device"))
                .inScenario("refreshToken")
                .whenScenarioStateIs(STARTED)
                .withHeader(
                    "Authorization",
                    equalTo("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzcwMDE4NDksImlzcyI6ImF2bmV0cG9jLmlvdGNvbm5lY3QuaW8iLCJhdWQiOiJhdm5ldHBvYy5pb3Rjb25uZWN0LmlvIiwidXNlciI6eyJpZCI6IjAzMkY2OTIxLUE3NEItNDU0RC04MEJCLTczNEZDMjJGODdDRiIsImNvbXBhbnlJZCI6IjQzRTI2Njk0LTU1REEtNDRDRS05NTZELUIwMjZCNzZEN0JCRSIsInJvbGVJZCI6IjhFODg2NTUyLTBDREYtNDk2OS1CNkE3LTBGRDMxMkE5MDg4RCIsInJvbGVOYW1lIjoiQWRtaW4iLCJjcElkIjoiNzc0MEQyODdBQTcwNDU3NTlCQjA5QTU2NTlCQTU3NkMiLCJlbnRpdHlHdWlkIjoiNTNFN0I1MjItN0Y4RS00Njk3LUExMEYtMTQ3OTlEMzRDODM4Iiwic29sdXRpb25HdWlkIjoiRUIzNjFGQTEtRkZFOC00QzQ5LTk3QUItRDVCOEI2ODBGOEE5Iiwic29sdXRpb25LZXkiOiJNMEZCTWtRMlFrTXRSVUZDUVMwME9FWTVMVUkzUlRBdE9FWTNORGhDUkRORE5rTXpMV0ZqWTJWemMwdEZXUzB4WVRJM2RXMDFaSFpuIiwicHMiOmZhbHNlLCJ1c2VySWQiOiJhbGVzc2FuZHJvLnZpZ2Fub0Bhdm5ldC5ldSJ9fQ.ZZ6ovai5i28xMVw8-wSj7zfLNnqE8HXjSZvsXMQVl-E"),
                )
                .willReturn(okJson(deviceResponse))
                .willSetStateTo("tokenExpired"),
        )

        stubFor(
            get(urlPathEqualTo("/api/v2/Device"))
                .inScenario("refreshToken")
                .whenScenarioStateIs("tokenExpired")
                .withHeader(
                    "Authorization",
                    equalTo("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzcwMDU5MjgsImlzcyI6ImF2bmV0cG9jLmlvdGNvbm5lY3QuaW8iLCJhdWQiOiJhdm5ldHBvYy5pb3Rjb25uZWN0LmlvIiwidXNlciI6eyJpZCI6IjAzMkY2OTIxLUE3NEItNDU0RC04MEJCLTczNEZDMjJGODdDRiIsImNvbXBhbnlJZCI6IjQzRTI2Njk0LTU1REEtNDRDRS05NTZELUIwMjZCNzZEN0JCRSIsInJvbGVJZCI6IjhFODg2NTUyLTBDREYtNDk2OS1CNkE3LTBGRDMxMkE5MDg4RCIsInJvbGVOYW1lIjoiQWRtaW4iLCJjcElkIjoiNzc0MEQyODdBQTcwNDU3NTlCQjA5QTU2NTlCQTU3NkMiLCJlbnRpdHlHdWlkIjoiNTNFN0I1MjItN0Y4RS00Njk3LUExMEYtMTQ3OTlEMzRDODM4Iiwic29sdXRpb25HdWlkIjoiRUIzNjFGQTEtRkZFOC00QzQ5LTk3QUItRDVCOEI2ODBGOEE5Iiwic29sdXRpb25LZXkiOiJNMEZCTWtRMlFrTXRSVUZDUVMwME9FWTVMVUkzUlRBdE9FWTNORGhDUkRORE5rTXpMV0ZqWTJWemMwdEZXUzB4WVRJM2RXMDFaSFpuIiwicHMiOmZhbHNlLCJ1c2VySWQiOiJhbGVzc2FuZHJvLnZpZ2Fub0Bhdm5ldC5ldSJ9fQ.PKKeefk57TZ8rl2N3bVfbBJ3hvOJrN3IE6HxVt9KIEk"),
                )
                .willReturn(okJson(deviceResponse))
                .willSetStateTo("tokenExpired"),
        )

        mockGet {
            url equalTo "/api/v2/Auth/basic-token"
        } returnsJson {
            body = basicTokenResponse
        }

        stubFor(
            post("/api/v2/Auth/login")
                .inScenario("refreshToken")
                .whenScenarioStateIs(STARTED)
                .willReturn(okJson(accessTokenResponse)),
        )

        stubFor(
            post("/api/v2/Auth/login")
                .inScenario("refreshToken")
                .whenScenarioStateIs("tokenExpired")
                .willReturn(okJson(accessTokenResponse2)),
        )

        client.deviceService.apiV2DeviceGet().execute()
        client.deviceService.apiV2DeviceGet().execute()

        verify(4, getRequestedFor(urlPathEqualTo("/api/v2/Device")))
        verify(
            getRequestedFor(urlPathEqualTo("/api/v2/Device")).withHeader(
                "Authorization",
                equalTo("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzcwMDU5MjgsImlzcyI6ImF2bmV0cG9jLmlvdGNvbm5lY3QuaW8iLCJhdWQiOiJhdm5ldHBvYy5pb3Rjb25uZWN0LmlvIiwidXNlciI6eyJpZCI6IjAzMkY2OTIxLUE3NEItNDU0RC04MEJCLTczNEZDMjJGODdDRiIsImNvbXBhbnlJZCI6IjQzRTI2Njk0LTU1REEtNDRDRS05NTZELUIwMjZCNzZEN0JCRSIsInJvbGVJZCI6IjhFODg2NTUyLTBDREYtNDk2OS1CNkE3LTBGRDMxMkE5MDg4RCIsInJvbGVOYW1lIjoiQWRtaW4iLCJjcElkIjoiNzc0MEQyODdBQTcwNDU3NTlCQjA5QTU2NTlCQTU3NkMiLCJlbnRpdHlHdWlkIjoiNTNFN0I1MjItN0Y4RS00Njk3LUExMEYtMTQ3OTlEMzRDODM4Iiwic29sdXRpb25HdWlkIjoiRUIzNjFGQTEtRkZFOC00QzQ5LTk3QUItRDVCOEI2ODBGOEE5Iiwic29sdXRpb25LZXkiOiJNMEZCTWtRMlFrTXRSVUZDUVMwME9FWTVMVUkzUlRBdE9FWTNORGhDUkRORE5rTXpMV0ZqWTJWemMwdEZXUzB4WVRJM2RXMDFaSFpuIiwicHMiOmZhbHNlLCJ1c2VySWQiOiJhbGVzc2FuZHJvLnZpZ2Fub0Bhdm5ldC5ldSJ9fQ.PKKeefk57TZ8rl2N3bVfbBJ3hvOJrN3IE6HxVt9KIEk"),
            ),
        )
    }
}
