
# CommandSendRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commandGuid** | **kotlin.String** | Template command Guid | 
**parameterValue** | **kotlin.String** | Command Value |  [optional]
**applyTo** | **kotlin.Int** | Send 1 or 2. 1: for entity, 2: for device guid list |  [optional]
**devices** | **kotlin.collections.List&lt;kotlin.String&gt;** | Device guid list.               Required if applyTo is 2 |  [optional]
**entityGuid** | **kotlin.String** | Entity Guid.               Required if applyTo is 1 |  [optional]
**isRecursive** | **kotlin.Boolean** | Send true to include child entity devices.  Required if applyTo is 1 |  [optional]
**isScheduledCommand** | **kotlin.Boolean** | Allows to schedule a command. &lt;i&gt;true&lt;/i&gt;: To schedule a command, &lt;i&gt;false&lt;/i&gt;: Doesn&#39;t schedule and send command instantly. |  [optional]
**scheduleUnit** | **kotlin.String** | &lt;i&gt;scheduleUnit&lt;/i&gt; is mandatory when &lt;i&gt;isScheduledCommand&lt;/i&gt; is true. Valid unit values are given below.              &lt;i&gt;hour&lt;/i&gt; : To send a command after every N hours.              &lt;i&gt;minute&lt;/i&gt; : To send a command after every N minutes.              &lt;i&gt;time&lt;/i&gt; : To send a command at specific time of the day. |  [optional]
**scheduleUnitValue** | **kotlin.String** | &lt;i&gt;scheduleUnitValue&lt;/i&gt; is mandatory when &lt;i&gt;isScheduledCommand&lt;/i&gt; is true. This requires value as per the selected &lt;i&gt;scheduleUnit&lt;/i&gt;.              When scheduleUnit is &lt;i&gt;hour&lt;/i&gt;, set hours between 1 to 24. eg: 5(after every 5 hours command will be sent)              When scheduleUnit is &lt;i&gt;minute&lt;/i&gt;, set minutes between 5 to 60. eg: 30(after every 30 minutes command will be sent)              When scheduleUnit is &lt;i&gt;time&lt;/i&gt;, set time in HH:mm format. eg: 13:30(every day at 01:30 PM command will be sent) |  [optional]



