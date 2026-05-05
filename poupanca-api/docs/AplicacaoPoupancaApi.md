# AplicacaoPoupancaApi

All URIs are relative to *https://api.sicoob.com.br/poupanca/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aplicacao**](AplicacaoPoupancaApi.md#aplicacao) | **POST** /aplicacoes | Aplicação de uma conta vinculada |


<a id="aplicacao"></a>
# **aplicacao**
> RetornoTransferencia aplicacao(clientId, aplicacao)

Aplicação de uma conta vinculada

Realiza uma aplicacao de uma conta corrente vinculada para uma conta conta poupança com os parametros informados.

### Example
```java
// Import classes:
import br.com.sicoob.poupanca.ApiClient;
import br.com.sicoob.poupanca.ApiException;
import br.com.sicoob.poupanca.Configuration;
import br.com.sicoob.poupanca.auth.*;
import br.com.sicoob.poupanca.models.*;
import br.com.sicoob.poupanca.api.AplicacaoPoupancaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/poupanca/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AplicacaoPoupancaApi apiInstance = new AplicacaoPoupancaApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    Transferencia aplicacao = new Transferencia(); // Transferencia | Parametros a serem preenchidos com os dados da aplicacao
    try {
      RetornoTransferencia result = apiInstance.aplicacao(clientId, aplicacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplicacaoPoupancaApi#aplicacao");
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
| **aplicacao** | [**Transferencia**](Transferencia.md)| Parametros a serem preenchidos com os dados da aplicacao | |

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
| **201** | Aplicacao realizado com sucesso |  -  |
| **400** | Ocorreu um erro na operação |  -  |
| **500** | Erro interno. |  -  |

