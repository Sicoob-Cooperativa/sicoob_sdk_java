# ResgatePoupancaApi

All URIs are relative to *https://api.sicoob.com.br/poupanca/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resgates**](ResgatePoupancaApi.md#resgates) | **POST** /resgates | Resgatar de uma conta poupança vinculada |


<a id="resgates"></a>
# **resgates**
> RetornoTransferencia resgates(clientId, aplicacao)

Resgatar de uma conta poupança vinculada

Realiza um resgate de uma conta poupança para uma conta corrente vinculadas com os parametros informados.

### Example
```java
// Import classes:
import br.com.sicoob.poupanca.ApiClient;
import br.com.sicoob.poupanca.ApiException;
import br.com.sicoob.poupanca.Configuration;
import br.com.sicoob.poupanca.auth.*;
import br.com.sicoob.poupanca.models.*;
import br.com.sicoob.poupanca.api.ResgatePoupancaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/poupanca/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ResgatePoupancaApi apiInstance = new ResgatePoupancaApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    Transferencia aplicacao = new Transferencia(); // Transferencia | Parametros a serem preenchidos com os dados do resgate
    try {
      RetornoTransferencia result = apiInstance.resgates(clientId, aplicacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResgatePoupancaApi#resgates");
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
| **clientId** | **String**| ClientId utilizado na utilização do TOKEN | |
| **aplicacao** | [**Transferencia**](Transferencia.md)| Parametros a serem preenchidos com os dados do resgate | |

### Return type

[**RetornoTransferencia**](RetornoTransferencia.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Resgate realizado com sucesso |  -  |
| **400** | Ocorreu um erro na operação |  -  |
| **500** | Erro interno. |  -  |

