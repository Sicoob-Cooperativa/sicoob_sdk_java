# ContasApi

All URIs are relative to *https://api.sicoob.com.br/poupanca/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listarContasPoupancaPorInstituicaoEContaCorrente**](ContasApi.md#listarContasPoupancaPorInstituicaoEContaCorrente) | **GET** /contas | Consulta de Contas de Poupança |


<a id="listarContasPoupancaPorInstituicaoEContaCorrente"></a>
# **listarContasPoupancaPorInstituicaoEContaCorrente**
> ListaContas listarContasPoupancaPorInstituicaoEContaCorrente(clientId)

Consulta de Contas de Poupança

Pesquisa as contas de poupança que pertencem a um CPF ou CNPJ.

### Example
```java
// Import classes:
import br.com.sicoob.poupanca.ApiClient;
import br.com.sicoob.poupanca.ApiException;
import br.com.sicoob.poupanca.Configuration;
import br.com.sicoob.poupanca.auth.*;
import br.com.sicoob.poupanca.models.*;
import br.com.sicoob.poupanca.api.ContasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/poupanca/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ContasApi apiInstance = new ContasApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    try {
      ListaContas result = apiInstance.listarContasPoupancaPorInstituicaoEContaCorrente(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContasApi#listarContasPoupancaPorInstituicaoEContaCorrente");
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

### Return type

[**ListaContas**](ListaContas.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retorna as contas de poupança do cliente. |  -  |
| **404** | O cliente informado não possui conta poupança. [Página de erros](/#!/erros) |  -  |
| **500** | Erro interno. [Página de erros](/#!/erros) |  -  |
| **503** | Serviço indisponível. [Página de erros](/#!/erros) |  -  |

