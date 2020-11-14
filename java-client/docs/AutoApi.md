# AutoApi

All URIs are relative to *https://autodealer.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAuto**](AutoApi.md#addAuto) | **POST** /auto | Add a new auto to the dealer
[**deleteAuto**](AutoApi.md#deleteAuto) | **DELETE** /auto/{autoId} | Deletes a auto
[**getAutoById**](AutoApi.md#getAutoById) | **GET** /auto/{autoId} | Find auto by ID
[**updateAuto**](AutoApi.md#updateAuto) | **PUT** /auto | Update an existing auto


<a name="addAuto"></a>
# **addAuto**
> addAuto(body)

Add a new auto to the dealer



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: autodealer_auth
OAuth autodealer_auth = (OAuth) defaultClient.getAuthentication("autodealer_auth");
autodealer_auth.setAccessToken("YOUR ACCESS TOKEN");

AutoApi apiInstance = new AutoApi();
Auto body = new Auto(); // Auto | Auto object that needs to be added to the autodealer
try {
    apiInstance.addAuto(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#addAuto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auto**](Auto.md)| Auto object that needs to be added to the autodealer |

### Return type

null (empty response body)

### Authorization

[autodealer_auth](../README.md#autodealer_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="deleteAuto"></a>
# **deleteAuto**
> deleteAuto(autoId, apiKey)

Deletes a auto



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: autodealer_auth
OAuth autodealer_auth = (OAuth) defaultClient.getAuthentication("autodealer_auth");
autodealer_auth.setAccessToken("YOUR ACCESS TOKEN");

AutoApi apiInstance = new AutoApi();
Long autoId = 789L; // Long | Auto id to delete
String apiKey = "apiKey_example"; // String | 
try {
    apiInstance.deleteAuto(autoId, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#deleteAuto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoId** | **Long**| Auto id to delete |
 **apiKey** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[autodealer_auth](../README.md#autodealer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAutoById"></a>
# **getAutoById**
> Auto getAutoById(autoId)

Find auto by ID

Returns a single auto

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
Long autoId = 789L; // Long | ID of auto to return
try {
    Auto result = apiInstance.getAutoById(autoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#getAutoById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoId** | **Long**| ID of auto to return |

### Return type

[**Auto**](Auto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAuto"></a>
# **updateAuto**
> updateAuto(body)

Update an existing auto



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: autodealer_auth
OAuth autodealer_auth = (OAuth) defaultClient.getAuthentication("autodealer_auth");
autodealer_auth.setAccessToken("YOUR ACCESS TOKEN");

AutoApi apiInstance = new AutoApi();
Auto body = new Auto(); // Auto | Auto object that needs to be updated
try {
    apiInstance.updateAuto(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#updateAuto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auto**](Auto.md)| Auto object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[autodealer_auth](../README.md#autodealer_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

