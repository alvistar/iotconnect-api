
# DeviceCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uniqueId** | **kotlin.String** | The uniqueId of device.  &lt;b&gt;Notes:&lt;/b&gt; Device uniqueId length is conditional based on device template auth type and device type   1. Self or CA signed parent device uniqueId length should be less than or equal to 31 characters.   2. Self or CA signed child device uniqueId length should be less than or equal to 31 characters.   3. For TPM or key, all device uniqueId length should be less than or equal to 128 characters. | 
**deviceTemplateGuid** | **kotlin.String** | The deviceTemplateGuid of device. | 
**displayName** | **kotlin.String** | The display name of device. | 
**entityGuid** | **kotlin.String** | The entityGuid of device. | 
**firmwareUpgradeGuid** | **kotlin.String** | The firmwareUpgradeGuid of device. |  [optional]
**tag** | **kotlin.String** | The tag of the device which must be exists in device template. This field is required if the request for child device create and gateway support enabled in device template. |  [optional]
**parentDeviceGuid** | **kotlin.String** | The gateway device guid. This field is required if the request for child device create and gateway support enabled in device template. |  [optional]
**primaryThumbprint** | **kotlin.String** | The primaryThumbprint of self signed device. This field is required if device template authentication type is self signed certificate. |  [optional]
**secondaryThumbprint** | **kotlin.String** | The secondaryThumbprint of self signed device. |  [optional]
**endorsementKey** | **kotlin.String** | The endorsementKey of TPM device. This field is required if device template authentication type is TPM. |  [optional]
**properties** | [**kotlin.collections.List&lt;PropertyValue&gt;**](PropertyValue.md) | The custom properties of device. |  [optional]
**xmlProperties** | [**kotlin.Any**](.md) |  |  [optional] [readonly]
**deviceCertificateGuid** | **kotlin.String** | The certificateGuid of devicetemplate. |  [optional]
**deviceCertificate** | **kotlin.ByteArray** | Byte array of device certificate file(Only .pfx file allowed). |  [optional]
**deviceCertificatePassword** | **kotlin.String** | Password of device certificate |  [optional]
**primaryKey** | **kotlin.String** | The primaryKey of symmetric key device. This field is required if device template authentication type is symmetric key. |  [optional]
**secondaryKey** | **kotlin.String** | The secondaryKey of symmetric key device. This field is required if device template authentication type is symmetric key. |  [optional]
**certificateText** | **kotlin.String** |  |  [optional]
**note** | **kotlin.String** | The note of the device. |  [optional]



