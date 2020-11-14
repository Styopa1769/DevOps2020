# EmployeeApi

All URIs are relative to *https://autodealer.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEmployee**](EmployeeApi.md#addEmployee) | **POST** /employee | Add a new employee to the dealer
[**deleteEmployee**](EmployeeApi.md#deleteEmployee) | **DELETE** /employee/{employeeId} | Deletes a employee
[**getEmployeeById**](EmployeeApi.md#getEmployeeById) | **GET** /employee/{employeeId} | Find employee by ID
[**updateEmployee**](EmployeeApi.md#updateEmployee) | **PUT** /employee | Update an existing auto


<a name="addEmployee"></a>
# **addEmployee**
> addEmployee(body)

Add a new employee to the dealer



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: autodealer_auth
OAuth autodealer_auth = (OAuth) defaultClient.getAuthentication("autodealer_auth");
autodealer_auth.setAccessToken("YOUR ACCESS TOKEN");

EmployeeApi apiInstance = new EmployeeApi();
Employee body = new Employee(); // Employee | Employee object that needs to be added to the autodealer
try {
    apiInstance.addEmployee(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#addEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Employee**](Employee.md)| Employee object that needs to be added to the autodealer |

### Return type

null (empty response body)

### Authorization

[autodealer_auth](../README.md#autodealer_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="deleteEmployee"></a>
# **deleteEmployee**
> deleteEmployee(employeeId, apiKey)

Deletes a employee



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: autodealer_auth
OAuth autodealer_auth = (OAuth) defaultClient.getAuthentication("autodealer_auth");
autodealer_auth.setAccessToken("YOUR ACCESS TOKEN");

EmployeeApi apiInstance = new EmployeeApi();
Long employeeId = 789L; // Long | Employee id to delete
String apiKey = "apiKey_example"; // String | 
try {
    apiInstance.deleteEmployee(employeeId, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#deleteEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeId** | **Long**| Employee id to delete |
 **apiKey** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[autodealer_auth](../README.md#autodealer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getEmployeeById"></a>
# **getEmployeeById**
> Employee getEmployeeById(employeeId)

Find employee by ID

Returns a single employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmployeeApi apiInstance = new EmployeeApi();
Long employeeId = 789L; // Long | ID of employee to return
try {
    Employee result = apiInstance.getEmployeeById(employeeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#getEmployeeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeId** | **Long**| ID of employee to return |

### Return type

[**Employee**](Employee.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateEmployee"></a>
# **updateEmployee**
> updateEmployee(body)

Update an existing auto



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: autodealer_auth
OAuth autodealer_auth = (OAuth) defaultClient.getAuthentication("autodealer_auth");
autodealer_auth.setAccessToken("YOUR ACCESS TOKEN");

EmployeeApi apiInstance = new EmployeeApi();
Employee body = new Employee(); // Employee | Employee object that needs to be updated
try {
    apiInstance.updateEmployee(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#updateEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Employee**](Employee.md)| Employee object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[autodealer_auth](../README.md#autodealer_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

