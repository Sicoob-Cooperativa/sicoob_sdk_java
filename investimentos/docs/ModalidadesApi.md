# ModalidadesApi

All URIs are relative to *https://api.sicoob.com.br/investimentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rendaFixaModalidadesGet**](ModalidadesApi.md#rendaFixaModalidadesGet) | **GET** /renda-fixa/modalidades | Realiza uma busca de modalidades ativas para a instituição e conta-corrente da pessoa logada considerando canal SISBR. |


<a id="rendaFixaModalidadesGet"></a>
# **rendaFixaModalidadesGet**
> RendaFixaModalidadesGet200Response rendaFixaModalidadesGet(clientId)

Realiza uma busca de modalidades ativas para a instituição e conta-corrente da pessoa logada considerando canal SISBR.

Realiza uma busca de modalidades ativas para a instituição e conta-corrente da pessoa logada considerando canal SISBR.

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.ModalidadesApi;

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

    ModalidadesApi apiInstance = new ModalidadesApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    try {
      RendaFixaModalidadesGet200Response result = apiInstance.rendaFixaModalidadesGet(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModalidadesApi#rendaFixaModalidadesGet");
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

### Return type

[**RendaFixaModalidadesGet200Response**](RendaFixaModalidadesGet200Response.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modalidades encontradas. |  -  |
| **204** | Modalidades inteligentes não puderam ser recuperadas. |  -  |
| **400** | Mensagem negocial |  -  |
| **401** | Usuário não autenticado |  -  |
| **500** | Erro interno do servidor |  -  |

