# DealerApi

All URIs are relative to *https://autodealer.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAutos**](DealerApi.md#getAutos) | **GET** /dealer/autos | Returns all autos
[**getEmployees**](DealerApi.md#getEmployees) | **GET** /dealer/employees | Returns all employees


<a name="getAutos"></a>
# **getAutos**
> Map&lt;String, Integer&gt; getAutos()

Returns all autos

Returns a collection of autos

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DealerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DealerApi apiInstance = new DealerApi();
try {
    Map<String, Integer> result = apiInstance.getAutos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getAutos");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEmployees"></a>
# **getEmployees**
> Map&lt;String, Integer&gt; getEmployees()

Returns all employees

Returns a collection of employees

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DealerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DealerApi apiInstance = new DealerApi();
try {
    Map<String, Integer> result = apiInstance.getEmployees();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getEmployees");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

