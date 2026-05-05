# PagadorApi

All URIs are relative to *https://api.sicoob.com.br/cobranca-bancaria/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pagadoresPut**](PagadorApi.md#pagadoresPut) | **PUT** /pagadores | Alterar informações do cadastro do pagador. |


<a id="pagadoresPut"></a>
# **pagadoresPut**
> pagadoresPut(pagador)

Alterar informações do cadastro do pagador.

Serviço para alterar informações do cadastro do pagador.

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.PagadorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PagadorApi apiInstance = new PagadorApi(defaultClient);
    Pagador pagador = new Pagador(); // Pagador | Informações do pagador.
    try {
      apiInstance.pagadoresPut(pagador);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagadorApi#pagadoresPut");
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
| **pagador** | [**Pagador**](Pagador.md)| Informações do pagador. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Solicitação recebida com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

