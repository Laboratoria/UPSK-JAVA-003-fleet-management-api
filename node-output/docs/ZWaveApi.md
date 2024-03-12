# ZWaveApi

All URIs are relative to *https://virtserver.swaggerhub.com/GAMOLINACARTES86/FleetManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLightingSummary**](ZWaveApi.md#getLightingSummary) | **GET** /lightingSummary | 
[**getSwitchState**](ZWaveApi.md#getSwitchState) | **GET** /lighting/switches/{deviceId} | 
[**setDimmer**](ZWaveApi.md#setDimmer) | **POST** /lighting/dimmers/{deviceId}/{value} | 
[**setDimmerTimer**](ZWaveApi.md#setDimmerTimer) | **POST** /lighting/dimmers/{deviceId}/{value}/timer/{timeunit} | 
[**setSwitch**](ZWaveApi.md#setSwitch) | **POST** /lighting/switches/{deviceId}/{value} | 
[**setSwitchTimer**](ZWaveApi.md#setSwitchTimer) | **POST** /lighting/switches/{deviceId}/{value}/timer/{minutes} | 


<a name="getLightingSummary"></a>
# **getLightingSummary**
> LightingSummary getLightingSummary()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZWaveApi;


ZWaveApi apiInstance = new ZWaveApi();
try {
    LightingSummary result = apiInstance.getLightingSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZWaveApi#getLightingSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LightingSummary**](LightingSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSwitchState"></a>
# **getSwitchState**
> DeviceState getSwitchState(deviceId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZWaveApi;


ZWaveApi apiInstance = new ZWaveApi();
String deviceId = "deviceId_example"; // String | 
try {
    DeviceState result = apiInstance.getSwitchState(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZWaveApi#getSwitchState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  |

### Return type

[**DeviceState**](DeviceState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setDimmer"></a>
# **setDimmer**
> ModelApiResponse setDimmer(deviceId, value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZWaveApi;


ZWaveApi apiInstance = new ZWaveApi();
String deviceId = "deviceId_example"; // String | 
Integer value = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.setDimmer(deviceId, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZWaveApi#setDimmer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  |
 **value** | **Integer**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setDimmerTimer"></a>
# **setDimmerTimer**
> ModelApiResponse setDimmerTimer(deviceId, value, timeunit, units)



sets a dimmer to a specific value on a timer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZWaveApi;


ZWaveApi apiInstance = new ZWaveApi();
String deviceId = "deviceId_example"; // String | 
Integer value = 56; // Integer | 
Integer timeunit = 56; // Integer | 
String units = "milliseconds"; // String | 
try {
    ModelApiResponse result = apiInstance.setDimmerTimer(deviceId, value, timeunit, units);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZWaveApi#setDimmerTimer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  |
 **value** | **Integer**|  |
 **timeunit** | **Integer**|  |
 **units** | **String**|  | [optional] [default to milliseconds] [enum: seconds, minutes, milliseconds]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setSwitch"></a>
# **setSwitch**
> ModelApiResponse setSwitch(deviceId, value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZWaveApi;


ZWaveApi apiInstance = new ZWaveApi();
String deviceId = "deviceId_example"; // String | 
String value = "value_example"; // String | 
try {
    ModelApiResponse result = apiInstance.setSwitch(deviceId, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZWaveApi#setSwitch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  |
 **value** | **String**|  | [enum: true, false]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setSwitchTimer"></a>
# **setSwitchTimer**
> ModelApiResponse setSwitchTimer(deviceId, value, minutes)



sets a switch to a specific value on a timer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZWaveApi;


ZWaveApi apiInstance = new ZWaveApi();
String deviceId = "deviceId_example"; // String | 
String value = "value_example"; // String | 
Integer minutes = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.setSwitchTimer(deviceId, value, minutes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZWaveApi#setSwitchTimer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  |
 **value** | **String**|  | [enum: true, false]
 **minutes** | **Integer**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

