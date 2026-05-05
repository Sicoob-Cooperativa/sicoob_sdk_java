# SaldoApi

All URIs are relative to *https://api.sicoob.com.br/poupanca/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**obterSaldoContaPoupanca**](SaldoApi.md#obterSaldoContaPoupanca) | **GET** /contas/{contaPoupanca}/saldo | Consulta de Saldo |


<a id="obterSaldoContaPoupanca"></a>
# **obterSaldoContaPoupanca**
> Saldo obterSaldoContaPoupanca(contaPoupanca, clientId)

Consulta de Saldo

Consulta o saldo atual de uma conta poupança.

### Example
```java
// Import classes:
import br.com.sicoob.poupanca.ApiClient;
import br.com.sicoob.poupanca.ApiException;
import br.com.sicoob.poupanca.Configuration;
import br.com.sicoob.poupanca.auth.*;
import br.com.sicoob.poupanca.models.*;
import br.com.sicoob.poupanca.api.SaldoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/poupanca/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SaldoApi apiInstance = new SaldoApi(defaultClient);
    Long contaPoupanca = 56L; // Long | Número da conta poupança
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    try {
      Saldo result = apiInstance.obterSaldoContaPoupanca(contaPoupanca, clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SaldoApi#obterSaldoContaPoupanca");
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
| **contaPoupanca** | **Long**| Número da conta poupança | |
| **clientId** | **String**| ClientId utilizado na utilização do TOKEN | |

### Return type

[**Saldo**](Saldo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retorna o saldo atual da conta poupança informada. |  -  |
| **404** | Conta poupança não encontrada.  [Página de erros](/#!/erros) |  -  |
| **500** | Erro interno. [Página de erros](/#!/erros) |  -  |
| **503** | Serviço indisponível. [Página de erros](/#!/erros) |  -  |

