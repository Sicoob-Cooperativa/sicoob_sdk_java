# SaldoApi

All URIs are relative to *https://api.sicoob.com.br/conta-corrente/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**obterSaldo**](SaldoApi.md#obterSaldo) | **GET** /saldo | O recurso de Saldo retorna o valor disponivel atual, o limite de credito (cheque especial) e o saldo bloqueado de uma conta corrente. |


<a id="obterSaldo"></a>
# **obterSaldo**
> Saldo obterSaldo(clientId, numeroContaCorrente)

O recurso de Saldo retorna o valor disponivel atual, o limite de credito (cheque especial) e o saldo bloqueado de uma conta corrente.

Saldo bancario

### Example
```java
// Import classes:
import br.com.sicoob.contacorrente.ApiClient;
import br.com.sicoob.contacorrente.ApiException;
import br.com.sicoob.contacorrente.Configuration;
import br.com.sicoob.contacorrente.auth.*;
import br.com.sicoob.contacorrente.models.*;
import br.com.sicoob.contacorrente.api.SaldoApi;

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

    SaldoApi apiInstance = new SaldoApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    Long numeroContaCorrente = 56L; // Long | Numero da conta corrente (pessoa juridica).
    try {
      Saldo result = apiInstance.obterSaldo(clientId, numeroContaCorrente);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SaldoApi#obterSaldo");
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
| **numeroContaCorrente** | **Long**| Numero da conta corrente (pessoa juridica). | [optional] |

### Return type

[**Saldo**](Saldo.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso |  -  |
| **400** | Ocorreu um erro negocial |  -  |
| **500** | Erro interno de servidor |  -  |

