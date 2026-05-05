# ResgateApi

All URIs are relative to *https://api.sicoob.com.br/investimentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rendaFixaResgatesPost**](ResgateApi.md#rendaFixaResgatesPost) | **POST** /renda-fixa/resgates | Realiza um resgate inteligente na cooperativa e conta da pessoa logada. |


<a id="rendaFixaResgatesPost"></a>
# **rendaFixaResgatesPost**
> RendaFixaResgatesPost200Response rendaFixaResgatesPost(clientId, resgateInteligenteCapRem)

Realiza um resgate inteligente na cooperativa e conta da pessoa logada.

A partir da cooperativa, conta da pessoa logada e valor passado é realizado um resgaste inteligente.

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.ResgateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/investimentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    ResgateApi apiInstance = new ResgateApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    ResgateInteligenteCapRem resgateInteligenteCapRem = new ResgateInteligenteCapRem(); // ResgateInteligenteCapRem | 
    try {
      RendaFixaResgatesPost200Response result = apiInstance.rendaFixaResgatesPost(clientId, resgateInteligenteCapRem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResgateApi#rendaFixaResgatesPost");
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
| **clientId** | **String**|  | |
| **resgateInteligenteCapRem** | [**ResgateInteligenteCapRem**](ResgateInteligenteCapRem.md)|  | |

### Return type

[**RendaFixaResgatesPost200Response**](RendaFixaResgatesPost200Response.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Resgate realizado |  -  |
| **400** | Mensagem negocial |  -  |
| **401** | Usuário não autenticado |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Erro interno do servidor |  -  |

