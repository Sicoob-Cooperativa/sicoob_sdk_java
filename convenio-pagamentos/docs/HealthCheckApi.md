# HealthCheckApi

All URIs are relative to *https://api.sicoob.com.br/convenios-pagamentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthGet**](HealthCheckApi.md#healthGet) | **GET** /health | Health Check API |


<a id="healthGet"></a>
# **healthGet**
> healthGet()

Health Check API

Health Check API

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.HealthCheckApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    HealthCheckApi apiInstance = new HealthCheckApi(defaultClient);
    try {
      apiInstance.healthGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCheckApi#healthGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio ao exibir as informações de convênios. |  -  |
| **500** | Erro interno. |  -  |

