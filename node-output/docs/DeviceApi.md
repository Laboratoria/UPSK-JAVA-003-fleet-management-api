# DeviceApi

All URIs are relative to *https://virtserver.swaggerhub.com/GAMOLINACARTES86/FleetManagementAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDevices**](DeviceApi.md#getDevices) | **GET** /devices | 
[**register**](DeviceApi.md#register) | **POST** /devices | 


<a name="getDevices"></a>
# **getDevices**
> List&lt;String&gt; getDevices(skip, limit)



returns all registered devices

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
Integer skip = 56; // Integer | number of records to skip
Integer limit = 56; // Integer | max number of records to return
try {
    List<String> result = apiInstance.getDevices(skip, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#getDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| number of records to skip | [optional]
 **limit** | **Integer**| max number of records to return | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="register"></a>
# **register**
> register(device)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
DeviceRegistrationInfo device = new DeviceRegistrationInfo(); // DeviceRegistrationInfo | 
try {
    apiInstance.register(device);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | [**DeviceRegistrationInfo**](DeviceRegistrationInfo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

