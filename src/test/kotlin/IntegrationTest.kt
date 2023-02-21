import com.thealvistar.iotconnect.IotConnectClient
import com.thealvistar.iotconnect.device.client.deleteDevice
import com.thealvistar.iotconnect.device.client.models.DeviceCreateRequest
import io.github.cdimascio.dotenv.dotenv
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntegrationTest {
    private lateinit var client: IotConnectClient

    @Test
    fun authentication() {
        val token = client.getAccessToken()
        token shouldNotBe null
    }

    @Test
    fun `get entity list`() {
        val entityList = client.entityService.apiV2EntityLookupGet().execute().body()!!
        entityList.count shouldNotBe 0
    }

    @Test
    fun `create and delete device`() {
        val response = client.deviceService.apiV2DevicePost(
            deviceCreateRequest = DeviceCreateRequest(
                uniqueId = "test-device-alvistar-999",
                displayName = "test-device-alvistar-999",
                deviceTemplateGuid = "56C23E41-116E-4C7B-BEE7-A0974DD64225",
                entityGuid = "ED4335C3-1BC6-4A25-889A-1DAF49D45A5A",
                primaryThumbprint = "14d275dec3f00e2fe858e0b3aef26b9b2ea3d9c41cab4c5d75dd272c39b4a921",
                secondaryThumbprint = "14d275dec3f00e2fe858e0b3aef26b9b2ea3d9c41cab4c5d75dd272c39b4a921",
            ),
        ).execute().body()!!

        client.deviceService.deleteDevice("test-device-alvistar-999")
    }

    @BeforeAll
    fun setUp() {
        val dotenv = dotenv()

        client = IotConnectClient(
            username = dotenv["USERNAME"],
            password = dotenv["PASSWORD"],
            solutionId = dotenv["SOLUTION_ID"],
        )

        try {
            client.deviceService.deleteDevice("test-device-alvistar-999")
        } catch (_: Exception) {
        }
    }
}
