# AplicaoApi

All URIs are relative to *https://api.sicoob.com.br/investimentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rendaFixaAportesPost**](AplicaoApi.md#rendaFixaAportesPost) | **POST** /renda-fixa/aportes | Realiza uma aplicação inteligente na cooperativa, conta da pessoa logada e modalidade informada. |


<a id="rendaFixaAportesPost"></a>
# **rendaFixaAportesPost**
> RendaFixaResgatesPost200Response rendaFixaAportesPost(clientId, aplicacaoInteligente)

Realiza uma aplicação inteligente na cooperativa, conta da pessoa logada e modalidade informada.

A partir da cooperativa, conta da pessoa logada e da modalidade e valor informados é realizado uma aplicação.

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.AplicaoApi;

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

    AplicaoApi apiInstance = new AplicaoApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    AplicacaoInteligente aplicacaoInteligente = new AplicacaoInteligente(); // AplicacaoInteligente | 
    try {
      RendaFixaResgatesPost200Response result = apiInstance.rendaFixaAportesPost(clientId, aplicacaoInteligente);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplicaoApi#rendaFixaAportesPost");
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
| **aplicacaoInteligente** | [**AplicacaoInteligente**](AplicacaoInteligente.md)|  | |

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
| **200** | Aplicação inteligente feita com sucesso |  -  |
| **400** | Mensagem negocial |  -  |
| **401** | Usuário não autenticado |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Erro interno do servidor |  -  |

