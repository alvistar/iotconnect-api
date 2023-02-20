
# CosmosExportHistoryRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **kotlin.String** | Start date format should be YYYY-MM-DD | 
**exportType** | [**inline**](#ExportType) | Export Type : 1 for Template, 2 for Entity and 3 for Device | 
**guids** | **kotlin.collections.List&lt;kotlin.String&gt;** | Guid list for selected export type. For example, if exportType is template then send template guid list. | 
**endDate** | **kotlin.String** |  |  [optional]


<a name="ExportType"></a>
## Enum: exportType
Name | Value
---- | -----
exportType | 1, 2, 3



