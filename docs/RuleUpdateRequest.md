
# RuleUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isActive** | **kotlin.Boolean** | Active status, send false to Deactivate rule. | 
**templateGuid** | **kotlin.String** | Device Template Guid | 
**name** | **kotlin.String** | Rule Name | 
**severityLevelGuid** | **kotlin.String** | Severity Level Guid | 
**conditionText** | **kotlin.String** | Condition statement triggers Rule on telemetry data that meet specified criteria. Criteria are expressed in the form of predicates.  &lt;div&gt;Condition on attribute(localname) if device template is non gateway Eg. : &lt;/div&gt;&lt;div&gt;1) Temperature &gt; 50&lt;/div&gt;&lt;div&gt;2) Temperature &gt; 50 AND Humidity &lt; 20&lt;/div&gt;&lt;div&gt;3) Temperature &gt; 50 AND ( Humidity &lt; 20 OR WaterLevel &gt; 10 )&lt;/div&gt;&lt;div&gt;4) Status &#x3D; \&quot;on\&quot;&lt;/div&gt;&lt;div&gt;&lt;/div&gt;&lt;div&gt;Condition on attribute({tag}#{localname}) if device template has enabled gateway enabled Eg. : &lt;/div&gt;&lt;div&gt;1) Tag1#Temperature &gt; 50&lt;/div&gt;&lt;div&gt;2) Tag1#Temperature &gt; 50 AND Tag2#Humidity &lt; 20&lt;/div&gt;&lt;div&gt;3) Tag1#Temperature &gt; 50 AND ( Tag2#Humidity &lt; 20 OR Tag2#WaterLevel &gt; 10 )&lt;/div&gt;&lt;div&gt;4) Tag3#Status &#x3D; \&quot;on\&quot;&lt;/div&gt; | 
**ignorePreference** | **kotlin.Boolean** | If &lt;i&gt;true&lt;/i&gt; then Ignore preference will send the notification to all the target audience irrespective of their preference | 
**ruleAudiences** | [**kotlin.collections.List&lt;RuleAudienceUpdate&gt;**](RuleAudienceUpdate.md) | Interval audience details for device disconnect event. if &lt;i&gt;ruleType&lt;/i&gt; is 3 |  [optional]
**reportingGroupGuid** | **kotlin.String** | Device Reporting Group Guid |  [optional]
**entityGuid** | **kotlin.String** | Entity Guid. if &lt;i&gt;applyTo&lt;/i&gt; is 1 or 2 |  [optional]
**applyTo** | **kotlin.Int** | Send 1, 2 or 3. 1: for all device of entity, 2: for all device of entity including child entities, 3: for device guid list.  Note: &lt;i&gt;applyTo&lt;/i&gt; must be 3 for edge template. |  [optional]
**devices** | **kotlin.collections.List&lt;kotlin.String&gt;** | Device guid list. Required if &lt;i&gt;applyTo&lt;/i&gt; is 3 |  [optional]
**roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | Role guid list. Notification will be sent to all users associated with these rules. |  [optional]
**users** | **kotlin.collections.List&lt;kotlin.String&gt;** | User guid list. Notification will be sent to all users in the list. |  [optional]
**deliveryMethod** | **kotlin.collections.List&lt;kotlin.String&gt;** | Notification delivery method. Eg. DeviceCommand, Email, Push, SignalR, WebHook, UI Alert, MQTT,UiNotification |  [optional]
**commandGuid** | **kotlin.String** | Command Guid. Required If &lt;i&gt;deliveryMethod&lt;/i&gt; is DeviceCommand |  [optional]
**parameterValue** | **kotlin.String** | Command Value. Required if &lt;i&gt;deliveryMethod&lt;/i&gt; is DeviceCommand |  [optional]
**url** | **kotlin.String** | Webhook url. Required If &lt;i&gt;deliveryMethod&lt;/i&gt; is WebHook |  [optional]
**headers** | [**kotlin.collections.List&lt;WebHookBaseHeaderDetails&gt;**](WebHookBaseHeaderDetails.md) | Webhook headers. If &lt;i&gt;deliveryMethod&lt;/i&gt; is WebHook |  [optional]
**snoozeTime** | **kotlin.Int** | Snoonze time in unit to snooze rule once rule trigger if ruleType is 1 or 2 |  [optional]
**snoozeTimeUnit** | **kotlin.Int** | Snoonze time unit  1 : Minute,  2 : Hour,  3 : Day  Note : Default value is Minute if snoozeTime having value |  [optional]



