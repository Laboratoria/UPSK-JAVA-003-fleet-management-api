# EnvironmentApi

All URIs are relative to *https://virtserver.swaggerhub.com/GAMOLINACARTES86/FleetManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getForecast**](EnvironmentApi.md#getForecast) | **GET** /temperature/forecast/{days} | 
[**getHeaterState**](EnvironmentApi.md#getHeaterState) | **GET** /temperature/{zoneId}/heater | 
[**getZoneTemperature**](EnvironmentApi.md#getZoneTemperature) | **GET** /temperature/{zoneId} | 
[**setHeaterState**](EnvironmentApi.md#setHeaterState) | **POST** /temperature/{zoneId}/heater/{state} | 
[**temperatureSummary**](EnvironmentApi.md#temperatureSummary) | **GET** /temperature | 


<a name="getForecast"></a>
# **getForecast**
> ForecastResponse getForecast(days)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
Integer days = 56; // Integer | 
try {
    ForecastResponse result = apiInstance.getForecast(days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#getForecast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **Integer**|  |

### Return type

[**ForecastResponse**](ForecastResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHeaterState"></a>
# **getHeaterState**
> HeaterState getHeaterState(zoneId)



gets the state of the heater

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
String zoneId = "zoneId_example"; // String | 
try {
    HeaterState result = apiInstance.getHeaterState(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#getHeaterState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**|  |

### Return type

[**HeaterState**](HeaterState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getZoneTemperature"></a>
# **getZoneTemperature**
> TemperatueZoneStatus getZoneTemperature(zoneId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
String zoneId = "zoneId_example"; // String | 
try {
    TemperatueZoneStatus result = apiInstance.getZoneTemperature(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#getZoneTemperature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**|  |

### Return type

[**TemperatueZoneStatus**](TemperatueZoneStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setHeaterState"></a>
# **setHeaterState**
> ModelApiResponse setHeaterState(zoneId, state)



turns the heater on or off

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
String zoneId = "zoneId_example"; // String | 
String state = "state_example"; // String | 
try {
    ModelApiResponse result = apiInstance.setHeaterState(zoneId, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#setHeaterState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**|  |
 **state** | **String**|  | [enum: false, true]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="temperatureSummary"></a>
# **temperatureSummary**
> TemperatureSummary temperatureSummary()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
try {
    TemperatureSummary result = apiInstance.temperatureSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#temperatureSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TemperatureSummary**](TemperatureSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

