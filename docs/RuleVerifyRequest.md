
# RuleVerifyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceTemplateGuid** | **kotlin.String** | Device template guid | 
**expression** | **kotlin.String** | Condition statement triggers Rule on telemetry data that meet specified criteria. Criteria are expressed in the form of predicates.  &lt;div&gt;Condition on attribute(localname) if device template is non gateway Eg. : &lt;/div&gt;&lt;div&gt;1) Temperature &gt; 50&lt;/div&gt;&lt;div&gt;2) Temperature &gt; 50 AND Humidity &lt; 20&lt;/div&gt;&lt;div&gt;3) Temperature &gt; 50 AND ( Humidity &lt; 20 OR WaterLevel &gt; 10 )&lt;/div&gt;&lt;div&gt;4) Status &#x3D; \&quot;on\&quot;&lt;/div&gt;&lt;div&gt;&lt;/div&gt;&lt;div&gt;Condition on attribute({tag}#{localname}) if device template has enabled gateway enabled Eg. : &lt;/div&gt;&lt;div&gt;1) Tag1#Temperature &gt; 50&lt;/div&gt;&lt;div&gt;2) Tag1#Temperature &gt; 50 AND Tag2#Humidity &lt; 20&lt;/div&gt;&lt;div&gt;3) Tag1#Temperature &gt; 50 AND ( Tag2#Humidity &lt; 20 OR Tag2#WaterLevel &gt; 10 )&lt;/div&gt;&lt;div&gt;4) Tag3#Status &#x3D; \&quot;on\&quot;&lt;/div&gt; | 



