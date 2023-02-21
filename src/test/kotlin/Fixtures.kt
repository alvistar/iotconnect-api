import org.intellij.lang.annotations.Language

const val basicTokenResponse = """
{
    "data": "YXZuZXRwb2M6bHpydGl1dGtlcWZtdHBqbGZ1ZHF0emx1cW1lcHdrc296aGV1bHF1dWtwZ2Zlb3htZnN1aWpnZW5raXlqb2J2dm9nYnhqZmVwcHVxY3VybXdhbWlvanh4YmJqeWF2c2ZqcWh2aQ==",
    "message": "Basic token has been generated successfully",
    "status": 200
}
"""

const val accessTokenResponse = """
    {
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzcwMDE4NDksImlzcyI6ImF2bmV0cG9jLmlvdGNvbm5lY3QuaW8iLCJhdWQiOiJhdm5ldHBvYy5pb3Rjb25uZWN0LmlvIiwidXNlciI6eyJpZCI6IjAzMkY2OTIxLUE3NEItNDU0RC04MEJCLTczNEZDMjJGODdDRiIsImNvbXBhbnlJZCI6IjQzRTI2Njk0LTU1REEtNDRDRS05NTZELUIwMjZCNzZEN0JCRSIsInJvbGVJZCI6IjhFODg2NTUyLTBDREYtNDk2OS1CNkE3LTBGRDMxMkE5MDg4RCIsInJvbGVOYW1lIjoiQWRtaW4iLCJjcElkIjoiNzc0MEQyODdBQTcwNDU3NTlCQjA5QTU2NTlCQTU3NkMiLCJlbnRpdHlHdWlkIjoiNTNFN0I1MjItN0Y4RS00Njk3LUExMEYtMTQ3OTlEMzRDODM4Iiwic29sdXRpb25HdWlkIjoiRUIzNjFGQTEtRkZFOC00QzQ5LTk3QUItRDVCOEI2ODBGOEE5Iiwic29sdXRpb25LZXkiOiJNMEZCTWtRMlFrTXRSVUZDUVMwME9FWTVMVUkzUlRBdE9FWTNORGhDUkRORE5rTXpMV0ZqWTJWemMwdEZXUzB4WVRJM2RXMDFaSFpuIiwicHMiOmZhbHNlLCJ1c2VySWQiOiJhbGVzc2FuZHJvLnZpZ2Fub0Bhdm5ldC5ldSJ9fQ.ZZ6ovai5i28xMVw8-wSj7zfLNnqE8HXjSZvsXMQVl-E",
    "expires_in": 86400,
    "refresh_token": "sxfkofuaaubfvuaunjecpihybfwpczcrsbtkyonvfatrkecgpo",
    "status": 200,
    "token_type": "bearer"
}
"""

const val accessTokenResponse2 = """
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzcwMDU5MjgsImlzcyI6ImF2bmV0cG9jLmlvdGNvbm5lY3QuaW8iLCJhdWQiOiJhdm5ldHBvYy5pb3Rjb25uZWN0LmlvIiwidXNlciI6eyJpZCI6IjAzMkY2OTIxLUE3NEItNDU0RC04MEJCLTczNEZDMjJGODdDRiIsImNvbXBhbnlJZCI6IjQzRTI2Njk0LTU1REEtNDRDRS05NTZELUIwMjZCNzZEN0JCRSIsInJvbGVJZCI6IjhFODg2NTUyLTBDREYtNDk2OS1CNkE3LTBGRDMxMkE5MDg4RCIsInJvbGVOYW1lIjoiQWRtaW4iLCJjcElkIjoiNzc0MEQyODdBQTcwNDU3NTlCQjA5QTU2NTlCQTU3NkMiLCJlbnRpdHlHdWlkIjoiNTNFN0I1MjItN0Y4RS00Njk3LUExMEYtMTQ3OTlEMzRDODM4Iiwic29sdXRpb25HdWlkIjoiRUIzNjFGQTEtRkZFOC00QzQ5LTk3QUItRDVCOEI2ODBGOEE5Iiwic29sdXRpb25LZXkiOiJNMEZCTWtRMlFrTXRSVUZDUVMwME9FWTVMVUkzUlRBdE9FWTNORGhDUkRORE5rTXpMV0ZqWTJWemMwdEZXUzB4WVRJM2RXMDFaSFpuIiwicHMiOmZhbHNlLCJ1c2VySWQiOiJhbGVzc2FuZHJvLnZpZ2Fub0Bhdm5ldC5ldSJ9fQ.PKKeefk57TZ8rl2N3bVfbBJ3hvOJrN3IE6HxVt9KIEk",
    "expires_in": 86400,
    "refresh_token": "sfrjxkngizrbukkokmzoacgrsynmmvejfpalipaexcmsqnevxl",
    "status": 200,
    "token_type": "bearer"
}
"""

@Language("JSON")
const val deviceResponse = """
{
    "count": 29,
    "data": [
        {
            "IsAcquired": true,
            "IsAllottedDevice": 0,
            "allottedDevicePermission": null,
            "authType": 3,
            "authenticationType": null,
            "childDeviceCount": 0,
            "count": 0,
            "deviceInfo": null,
            "deviceStatus": "Acquired",
            "deviceTemplateGuid": "56C23E41-116E-4C7B-BEE7-A0974DD64225",
            "deviceTemplateName": "ACG Self Signed Cert 1",
            "displayName": "ACG SSC VM1",
            "entityName": "Engineering Lab",
            "firmwareupgradeGuid": null,
            "guid": "47A92FDB-7220-4C3E-A56D-3C190BA9630D",
            "isActive": true,
            "isConnected": false,
            "isDpsDevice": false,
            "isSharedDevice": false,
            "isSolutionTemplate": false,
            "isType2Support": false,
            "lastCommunication": "2022-11-28T16:29:12.483Z",
            "lastConnection": "2022-11-28T16:10:00.223Z",
            "lastactivityDate": null,
            "messageVersion": null,
            "parentCompanyGuid": null,
            "recentAttrValue": null,
            "reportingTo": "Avnet - IOTCP00003",
            "solutionGuid": "F74434BC-1623-4524-85ED-83A54E00C5DC",
            "solutionName": null,
            "uniqueId": "acg-ssc-VM1"
        }]
        }
"""
