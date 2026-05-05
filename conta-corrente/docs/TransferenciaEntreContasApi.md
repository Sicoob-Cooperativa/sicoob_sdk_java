# TransferenciaEntreContasApi

All URIs are relative to *https://api.sicoob.com.br/conta-corrente/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transferirUsingPOST**](TransferenciaEntreContasApi.md#transferirUsingPOST) | **POST** /transferencias | Método que transfere os valores entre contas. |


<a id="transferirUsingPOST"></a>
# **transferirUsingPOST**
> transferirUsingPOST(clientId, idToken, xIdempotencyKey, transferenciaEntreContaDTO)

Método que transfere os valores entre contas.

### Example
```java
// Import classes:
import br.com.sicoob.contacorrente.ApiClient;
import br.com.sicoob.contacorrente.ApiException;
import br.com.sicoob.contacorrente.Configuration;
import br.com.sicoob.contacorrente.auth.*;
import br.com.sicoob.contacorrente.models.*;
import br.com.sicoob.contacorrente.api.TransferenciaEntreContasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/conta-corrente/v4");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    TransferenciaEntreContasApi apiInstance = new TransferenciaEntreContasApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    String idToken = "idToken_example"; // String | Objeto destinado a autenticação do OpenBanking
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | Objeto destinado para a validação do LimitControl. Não pode ser duplicado.
    TransferenciaEntreContaDTO transferenciaEntreContaDTO = new TransferenciaEntreContaDTO(); // TransferenciaEntreContaDTO | Objeto destinado a Transferencia de valores
    try {
      apiInstance.transferirUsingPOST(clientId, idToken, xIdempotencyKey, transferenciaEntreContaDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferenciaEntreContasApi#transferirUsingPOST");
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
| **idToken** | **String**| Objeto destinado a autenticação do OpenBanking | |
| **xIdempotencyKey** | **String**| Objeto destinado para a validação do LimitControl. Não pode ser duplicado. | |
| **transferenciaEntreContaDTO** | [**TransferenciaEntreContaDTO**](TransferenciaEntreContaDTO.md)| Objeto destinado a Transferencia de valores | |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

