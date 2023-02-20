
# AttributeBaseObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localName** | **kotlin.String** | Child attribute&#39;s name.   It should be alphanumeric and allows two consecutive &#39;_&#39; and must start with the alphabet.   Eg. Temperature, Humadity, oxygenIn1, Temperature_In, Temperature__Out, Oxygen_In__1  etc. | 
**dataTypeGuid** | **kotlin.String** | Child attribute&#39;s datatype guid, Object datatype is not allowed for child attributes. | 
**description** | **kotlin.String** | Child attribute&#39;s description |  [optional]
**dataValidation** | **kotlin.String** | Child attribute&#39;s data validation.   Type validation values and/or validation ranges separated by commas.&lt;div&gt; For example: &lt;/div&gt;&lt;div&gt;  1, 2, 10 to 20 &lt;/div&gt; -10 to -5, -15 &lt;div&gt; Red, Green, Blue&lt;/div&gt; |  [optional]
**sequence** | **kotlin.Int** | Child attribute&#39;s sequence |  [optional]
**unit** | **kotlin.String** | Child attribute&#39;s unit |  [optional]
**startIndex** | **kotlin.Int** | Start index is required if the associated device template has enabled low bandwidth support. |  [optional]
**numChar** | **kotlin.Int** | Range is required if the associated device template has enabled low bandwidth support. |  [optional]
**attributeColor** | **kotlin.String** | Color Code of attribute. |  [optional]



