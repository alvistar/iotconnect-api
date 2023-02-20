
# RuleAudience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval** | **kotlin.Int** | Interval duration value after rule matched.  Note : internal duration will consider based on intervalUnit | 
**intervalUnit** | **kotlin.Int** | Interval unit for interval  1 : Minute,  2 : Hour,  3 : Day   Note : Default value is Minute | 
**roleGuids** | **kotlin.collections.List&lt;kotlin.String&gt;** | Role guid list. Notification will be sent to all users of this role if &lt;i&gt;userGuids&lt;/i&gt; not exists. | 
**userGuids** | **kotlin.collections.List&lt;kotlin.String&gt;** | User guid list which are associated with &lt;i&gt;roleGuids&lt;/i&gt;. Notification will be sent to all users in the list. |  [optional]



