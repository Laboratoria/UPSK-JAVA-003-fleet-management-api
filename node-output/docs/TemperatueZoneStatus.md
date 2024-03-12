
# TemperatueZoneStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the unique identifier for the zone | 
**name** | **String** | the name of the zone |  [optional]
**value** | **Double** | the temperature in the zone | 
**units** | [**UnitsEnum**](#UnitsEnum) | the temperature units |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | the timestamp when the temperature was measured | 


<a name="UnitsEnum"></a>
## Enum: UnitsEnum
Name | Value
---- | -----
CELSIUS | &quot;celsius&quot;
FAHRENHEIT | &quot;fahrenheit&quot;



