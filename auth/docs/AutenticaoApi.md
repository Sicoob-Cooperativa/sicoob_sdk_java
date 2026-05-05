# AutenticaoApi

All URIs are relative to *https://auth.sicoob.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authRealmsCooperadoProtocolOpenidConnectTokenPost**](AutenticaoApi.md#authRealmsCooperadoProtocolOpenidConnectTokenPost) | **POST** /auth/realms/cooperado/protocol/openid-connect/token | Gerar token de acesso |


<a id="authRealmsCooperadoProtocolOpenidConnectTokenPost"></a>
# **authRealmsCooperadoProtocolOpenidConnectTokenPost**
> AuthRealmsCooperadoProtocolOpenidConnectTokenPost200Response authRealmsCooperadoProtocolOpenidConnectTokenPost(grantType, clientId, scope)

Gerar token de acesso

Endpoint para geração de token de acesso via Client Credentials com mTLS.

### Example
```java
// Import classes:
import br.com.sicoob.auth.ApiClient;
import br.com.sicoob.auth.ApiException;
import br.com.sicoob.auth.Configuration;
import br.com.sicoob.auth.models.*;
import br.com.sicoob.auth.api.AutenticaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://auth.sicoob.com.br");

    AutenticaoApi apiInstance = new AutenticaoApi(defaultClient);
    String grantType = "client_credentials"; // String | 
    String clientId = "clientId_example"; // String | 
    String scope = "cco_transferencias cco_consulta openid"; // String | 
    try {
      AuthRealmsCooperadoProtocolOpenidConnectTokenPost200Response result = apiInstance.authRealmsCooperadoProtocolOpenidConnectTokenPost(grantType, clientId, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutenticaoApi#authRealmsCooperadoProtocolOpenidConnectTokenPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**|  | [default to client_credentials] |
| **clientId** | **String**|  | |
| **scope** | **String**|  | [default to cco_transferencias cco_consulta openid] |

### Return type

[**AuthRealmsCooperadoProtocolOpenidConnectTokenPost200Response**](AuthRealmsCooperadoProtocolOpenidConnectTokenPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token gerado com sucesso |  -  |

