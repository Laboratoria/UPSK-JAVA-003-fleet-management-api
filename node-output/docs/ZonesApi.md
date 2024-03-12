# ZonesApi

All URIs are relative to *https://virtserver.swaggerhub.com/GAMOLINACARTES86/FleetManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZones**](ZonesApi.md#getZones) | **GET** /zones | 
[**quietZone**](ZonesApi.md#quietZone) | **GET** /zones/{zoneId}/quiet | 


<a name="getZones"></a>
# **getZones**
> List&lt;String&gt; getZones()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZonesApi;


ZonesApi apiInstance = new ZonesApi();
try {
    List<String> result = apiInstance.getZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#getZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quietZone"></a>
# **quietZone**
> quietZone(zoneId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZonesApi;


ZonesApi apiInstance = new ZonesApi();
String zoneId = "zoneId_example"; // String | 
try {
    apiInstance.quietZone(zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#quietZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **String**|  | [enum: basement, first-floor, second-floor]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

