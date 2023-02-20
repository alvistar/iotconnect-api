
# AttributeUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localName** | **kotlin.String** | Template attribute name.   It should be alphanumeric and allows two consecutive &#39;_&#39; and must start with the alphabet.   Eg. Temperature, Humadity, oxygenIn1, Temperature_In, Temperature__Out, Oxygen_In__1  etc. | 
**deviceTemplateGuid** | **kotlin.String** | Associated Device Template Guid | 
**dataTypeGuid** | **kotlin.String** | Attribute&#39;s Datatype Guid | 
**attributes** | [**kotlin.collections.List&lt;AttributeUpdateObjects&gt;**](AttributeUpdateObjects.md) | Child&#39;s attribute list, This field is required if selected dataTypeGuid for the object. |  [optional]
**description** | **kotlin.String** | Template attribute&#39;s description |  [optional]
**dataValidation** | **kotlin.String** | Attribute&#39;s data validation,   This field will be ignored if selected dataTypeGuid for the object.   Type validation values and/or validation ranges separated by commas.&lt;div&gt; For example: &lt;/div&gt;&lt;div&gt;  1, 2, 10 to 20 &lt;/div&gt; -10 to -5, -15 &lt;div&gt; Red, Green, Blue&lt;/div&gt; |  [optional]
**unit** | **kotlin.String** | Attribute&#39;s unit |  [optional]
**tag** | **kotlin.String** | Attribute&#39;s tag,   The tag is required if the associated device template has enabled gateway support.   The Tag should be alphanumeric and allows two consecutive &#39;_&#39; and must start with the alphabet.   Eg. AC, Camera1 Camera_1, camera_Type__1 etc. |  [optional]
**aggregateType** | **kotlin.collections.List&lt;kotlin.String&gt;** | Attribute&#39;s aggregate type   Aggregate Types : Min, Max, Average, Sum, Latest Value. |  [optional]
**tumblingWindow** | **kotlin.String** | Attribute&#39;s tumbling window   Tumbling window should be 1 to 999 ending with h/m/s.&lt;div&gt; For example: &lt;/div&gt;&lt;div&gt;  5h (h &#x3D; hour) &lt;/div&gt;&lt;div&gt; 5m (m &#x3D; minute) &lt;/div&gt;&lt;div&gt; 5s (s &#x3D; second)&lt;/div&gt;   The tumbling window is required if the associated device template has enabled edge support. |  [optional]
**xmlAttributes** | [**kotlin.Any**](.md) |  |  [optional] [readonly]
**startIndex** | **kotlin.Int** | Start index is required if the associated device template has enabled low bandwidth support and data type is not an object. |  [optional]
**numChar** | **kotlin.Int** | Range is required if the associated device template has enabled low bandwidth support and data type is not an objet. |  [optional]
**attributeColor** | **kotlin.String** |  |  [optional]



