# PagamentoApi

All URIs are relative to *https://api.sicoob.com.br/pagamentos/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boletosCodigoBarrasGet**](PagamentoApi.md#boletosCodigoBarrasGet) | **GET** /boletos/{codigoBarras} | Consultar Boleto |
| [**boletosPagamentosAgendamentosIdPagamentoDelete**](PagamentoApi.md#boletosPagamentosAgendamentosIdPagamentoDelete) | **DELETE** /boletos/pagamentos/agendamentos/{idPagamento} | Cancelar um agendamento de pagamento |
| [**boletosPagamentosCodigoBarrasPost**](PagamentoApi.md#boletosPagamentosCodigoBarrasPost) | **POST** /boletos/pagamentos/{codigoBarras} | Pagar Boleto |
| [**boletosPagamentosIdPagamentoComprovantesGet**](PagamentoApi.md#boletosPagamentosIdPagamentoComprovantesGet) | **GET** /boletos/pagamentos/{idPagamento}/comprovantes | Consultar comprovante de pagamento |
| [**boletosPagamentosIdempotencyIdempotencyComprovantesGet**](PagamentoApi.md#boletosPagamentosIdempotencyIdempotencyComprovantesGet) | **GET** /boletos/pagamentos/{idempotency}/idempotency/comprovantes | Consultar comprovante de pagamento através do Idempotency. |


<a id="boletosCodigoBarrasGet"></a>
# **boletosCodigoBarrasGet**
> BoletosCodigoBarrasGet200Response boletosCodigoBarrasGet(clientId, codigoBarras, numeroConta, dataPagamento)

Consultar Boleto

Serviço para consultar boleto.

### Example
```java
// Import classes:
import br.com.sicoob.pagamentosv3.ApiClient;
import br.com.sicoob.pagamentosv3.ApiException;
import br.com.sicoob.pagamentosv3.Configuration;
import br.com.sicoob.pagamentosv3.auth.*;
import br.com.sicoob.pagamentosv3.models.*;
import br.com.sicoob.pagamentosv3.api.PagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pagamentos/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PagamentoApi apiInstance = new PagamentoApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    String codigoBarras = "codigoBarras_example"; // String | Número de código de barras com 44 posições ou linha digitável com 47 posições do boleto
    Long numeroConta = 56L; // Long | Número da Conta Habilitada para Pagamentos via API.
    LocalDate dataPagamento = LocalDate.now(); // LocalDate | Data do pagamento do boleto. Se não for informada o pagamento será para data atual Formato: yyyy-MM-dd Exemplo: 2022-07-30 
    try {
      BoletosCodigoBarrasGet200Response result = apiInstance.boletosCodigoBarrasGet(clientId, codigoBarras, numeroConta, dataPagamento);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagamentoApi#boletosCodigoBarrasGet");
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
| **clientId** | **String**| ClientId utilizado para gerar o token. | |
| **codigoBarras** | **String**| Número de código de barras com 44 posições ou linha digitável com 47 posições do boleto | |
| **numeroConta** | **Long**| Número da Conta Habilitada para Pagamentos via API. | |
| **dataPagamento** | **LocalDate**| Data do pagamento do boleto. Se não for informada o pagamento será para data atual Formato: yyyy-MM-dd Exemplo: 2022-07-30  | [optional] |

### Return type

[**BoletosCodigoBarrasGet200Response**](BoletosCodigoBarrasGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **204** | Requisição processada com sucesso e não há conteúdo a ser retornado. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno. |  -  |

<a id="boletosPagamentosAgendamentosIdPagamentoDelete"></a>
# **boletosPagamentosAgendamentosIdPagamentoDelete**
> boletosPagamentosAgendamentosIdPagamentoDelete(clientId, idPagamento, cancelamento)

Cancelar um agendamento de pagamento

Serviço para cancelar um agendamento de pagamento.

### Example
```java
// Import classes:
import br.com.sicoob.pagamentosv3.ApiClient;
import br.com.sicoob.pagamentosv3.ApiException;
import br.com.sicoob.pagamentosv3.Configuration;
import br.com.sicoob.pagamentosv3.auth.*;
import br.com.sicoob.pagamentosv3.models.*;
import br.com.sicoob.pagamentosv3.api.PagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pagamentos/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PagamentoApi apiInstance = new PagamentoApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    Long idPagamento = 56L; // Long | Número de identificação do agendamento no SISBR.
    Cancelamento cancelamento = new Cancelamento(); // Cancelamento | Dados da Conta Habilitada para Pagamentos via API.
    try {
      apiInstance.boletosPagamentosAgendamentosIdPagamentoDelete(clientId, idPagamento, cancelamento);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagamentoApi#boletosPagamentosAgendamentosIdPagamentoDelete");
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
| **clientId** | **String**| ClientId utilizado para gerar o token. | |
| **idPagamento** | **Long**| Número de identificação do agendamento no SISBR. | |
| **cancelamento** | [**Cancelamento**](Cancelamento.md)| Dados da Conta Habilitada para Pagamentos via API. | |

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
| **204** | Requisição processada com sucesso e não há conteúdo a ser retornado. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="boletosPagamentosCodigoBarrasPost"></a>
# **boletosPagamentosCodigoBarrasPost**
> BoletosPagamentosCodigoBarrasPost200Response boletosPagamentosCodigoBarrasPost(clientId, xIdempotencyKey, codigoBarras, boletoPagamento)

Pagar Boleto

Serviço para efetuar o pagamento ou agendamento de boleto.

### Example
```java
// Import classes:
import br.com.sicoob.pagamentosv3.ApiClient;
import br.com.sicoob.pagamentosv3.ApiException;
import br.com.sicoob.pagamentosv3.Configuration;
import br.com.sicoob.pagamentosv3.auth.*;
import br.com.sicoob.pagamentosv3.models.*;
import br.com.sicoob.pagamentosv3.api.PagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pagamentos/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PagamentoApi apiInstance = new PagamentoApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | Este parâmetro é usado para garantir a idempotência das requisições, ajudando a evitar operações duplicadas.  Para cada requisição que deseja ser tratada de forma idempotente, envie um valor exclusivo.  Esse valor deve ser uma string única que segue um padrão específico: começa com um número de cooperativa (com até 4 dígitos), seguido do número da conta corrente (com até 14 dígitos), e termina com um UUID (Universally Unique Identifier).  Ex:4342-8901234-550e8400-e29b-41d4-a716-446655440000.  [Especificação do UUID](https://datatracker.ietf.org/doc/html/rfc4122) 
    String codigoBarras = "codigoBarras_example"; // String | Número de código de barras do boleto com 44 posições
    BoletoPagamento boletoPagamento = new BoletoPagamento(); // BoletoPagamento | Dados do boleto a ser pago ou agendado
    try {
      BoletosPagamentosCodigoBarrasPost200Response result = apiInstance.boletosPagamentosCodigoBarrasPost(clientId, xIdempotencyKey, codigoBarras, boletoPagamento);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagamentoApi#boletosPagamentosCodigoBarrasPost");
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
| **clientId** | **String**| ClientId utilizado para gerar o token. | |
| **xIdempotencyKey** | **String**| Este parâmetro é usado para garantir a idempotência das requisições, ajudando a evitar operações duplicadas.  Para cada requisição que deseja ser tratada de forma idempotente, envie um valor exclusivo.  Esse valor deve ser uma string única que segue um padrão específico: começa com um número de cooperativa (com até 4 dígitos), seguido do número da conta corrente (com até 14 dígitos), e termina com um UUID (Universally Unique Identifier).  Ex:4342-8901234-550e8400-e29b-41d4-a716-446655440000.  [Especificação do UUID](https://datatracker.ietf.org/doc/html/rfc4122)  | |
| **codigoBarras** | **String**| Número de código de barras do boleto com 44 posições | |
| **boletoPagamento** | [**BoletoPagamento**](BoletoPagamento.md)| Dados do boleto a ser pago ou agendado | |

### Return type

[**BoletosPagamentosCodigoBarrasPost200Response**](BoletosPagamentosCodigoBarrasPost200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **202** | Pendência de assinatura processada com sucesso e não há conteúdo a ser retornado. |  -  |
| **204** | Requisição processada com sucesso e não há conteúdo a ser retornado. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="boletosPagamentosIdPagamentoComprovantesGet"></a>
# **boletosPagamentosIdPagamentoComprovantesGet**
> BoletosPagamentosIdPagamentoComprovantesGet200Response boletosPagamentosIdPagamentoComprovantesGet(clientId, idPagamento, numeroConta)

Consultar comprovante de pagamento

Serviço para consultar um comprovante de um pagamento efetuado.

### Example
```java
// Import classes:
import br.com.sicoob.pagamentosv3.ApiClient;
import br.com.sicoob.pagamentosv3.ApiException;
import br.com.sicoob.pagamentosv3.Configuration;
import br.com.sicoob.pagamentosv3.auth.*;
import br.com.sicoob.pagamentosv3.models.*;
import br.com.sicoob.pagamentosv3.api.PagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pagamentos/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PagamentoApi apiInstance = new PagamentoApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    Long idPagamento = 56L; // Long | Número de identificação do agendamento no SISBR.
    Long numeroConta = 56L; // Long | Número da Conta Habilitada para Pagamentos via API.
    try {
      BoletosPagamentosIdPagamentoComprovantesGet200Response result = apiInstance.boletosPagamentosIdPagamentoComprovantesGet(clientId, idPagamento, numeroConta);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagamentoApi#boletosPagamentosIdPagamentoComprovantesGet");
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
| **clientId** | **String**| ClientId utilizado para gerar o token. | |
| **idPagamento** | **Long**| Número de identificação do agendamento no SISBR. | |
| **numeroConta** | **Long**| Número da Conta Habilitada para Pagamentos via API. | |

### Return type

[**BoletosPagamentosIdPagamentoComprovantesGet200Response**](BoletosPagamentosIdPagamentoComprovantesGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **204** | Requisição processada com sucesso e não há conteúdo a ser retornado. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="boletosPagamentosIdempotencyIdempotencyComprovantesGet"></a>
# **boletosPagamentosIdempotencyIdempotencyComprovantesGet**
> BoletosPagamentosCodigoBarrasPost200Response boletosPagamentosIdempotencyIdempotencyComprovantesGet(clientId, idempotency)

Consultar comprovante de pagamento através do Idempotency.

Serviço para consultar um comprovante de um pagamento efetuado através do Idempotency.

### Example
```java
// Import classes:
import br.com.sicoob.pagamentosv3.ApiClient;
import br.com.sicoob.pagamentosv3.ApiException;
import br.com.sicoob.pagamentosv3.Configuration;
import br.com.sicoob.pagamentosv3.auth.*;
import br.com.sicoob.pagamentosv3.models.*;
import br.com.sicoob.pagamentosv3.api.PagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pagamentos/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PagamentoApi apiInstance = new PagamentoApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    String idempotency = "idempotency_example"; // String | Este parâmetro é usado para garantir a idempotência das requisições, ajudando a evitar operações duplicadas.
    try {
      BoletosPagamentosCodigoBarrasPost200Response result = apiInstance.boletosPagamentosIdempotencyIdempotencyComprovantesGet(clientId, idempotency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagamentoApi#boletosPagamentosIdempotencyIdempotencyComprovantesGet");
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
| **clientId** | **String**| ClientId utilizado para gerar o token. | |
| **idempotency** | **String**| Este parâmetro é usado para garantir a idempotência das requisições, ajudando a evitar operações duplicadas. | |

### Return type

[**BoletosPagamentosCodigoBarrasPost200Response**](BoletosPagamentosCodigoBarrasPost200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **204** | Requisição processada com sucesso e não há conteúdo a ser retornado. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

