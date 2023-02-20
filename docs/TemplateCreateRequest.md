
# TemplateCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **kotlin.String** | Unique device template code. Template code must be alphanumeric and must start with the alphabet . | 
**isEdgeSupport** | **kotlin.Boolean** | For devices with edge support | 
**authType** | **kotlin.Int** | Authentication Type - 1: Key, 2: CA Signed Certificate, 3: Self Signed Certificate, 4: TPM, 5: Symmetric Key,6: DDKG,7: BootstrapCertificate, 8: PKISignature | 
**name** | **kotlin.String** | Device template name | 
**tag** | **kotlin.String** | For Gateway supported Devices.   It should be alphanumeric with allowed two consecutive &#39;_&#39; and must be started with the alphabet.   Eg. Temperature, Humadity, oxygenIn1, Temperature_In, Temperature__Out, Oxygen_In__1  etc. |  [optional]
**dataLength** | **kotlin.Int** | For devices with low bandwidth support |  [optional]
**isIotEdgeEnable** | **kotlin.Boolean** | True to devices is Azure IoTEdge. |  [optional]
**messageVersion** | **kotlin.String** |  |  [optional]
**isSphere** | **kotlin.Boolean** |  |  [optional]
**trustedPartnerGuid** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**firmwareguid** | **kotlin.String** | Firmware hardware version guid |  [optional]



