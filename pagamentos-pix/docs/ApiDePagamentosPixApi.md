# ApiDePagamentosPixApi

All URIs are relative to *https://api.sicoob.com.br/pix-pagamentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pagamentosConfirmacaoPost**](ApiDePagamentosPixApi.md#pagamentosConfirmacaoPost) | **POST** /pagamentos/confirmacao | Efetivar um pagamento iniciado pela API de pagamentos |
| [**pagamentosIdGet**](ApiDePagamentosPixApi.md#pagamentosIdGet) | **GET** /pagamentos/{id} | Consultar pagamento pix através do endToEndId. |
| [**pagamentosPost**](ApiDePagamentosPixApi.md#pagamentosPost) | **POST** /pagamentos | Iniciar pagamento por meio de chave DICT |
| [**pagamentosQrcodePost**](ApiDePagamentosPixApi.md#pagamentosQrcodePost) | **POST** /pagamentos/qrcode | Realizar pagamento por meio de código QRCode |
| [**pagamentosWebhookDelete**](ApiDePagamentosPixApi.md#pagamentosWebhookDelete) | **DELETE** /pagamentos/webhook | Cancelar o webhook Pix. |
| [**pagamentosWebhookGet**](ApiDePagamentosPixApi.md#pagamentosWebhookGet) | **GET** /pagamentos/webhook | Exibir informações acerca do Webhook Pix. |
| [**pagamentosWebhookPut**](ApiDePagamentosPixApi.md#pagamentosWebhookPut) | **PUT** /pagamentos/webhook | Configurar o Webhook Pix. |


<a id="pagamentosConfirmacaoPost"></a>
# **pagamentosConfirmacaoPost**
> RetornoPagamento pagamentosConfirmacaoPost(requisicaoLancamentoEfetivacao)

Efetivar um pagamento iniciado pela API de pagamentos

Efetivar um pagamento iniciado pela API de pagamentos

### Example
```java
// Import classes:
import br.com.sicoob.pagamentospix.ApiClient;
import br.com.sicoob.pagamentospix.ApiException;
import br.com.sicoob.pagamentospix.Configuration;
import br.com.sicoob.pagamentospix.auth.*;
import br.com.sicoob.pagamentospix.models.*;
import br.com.sicoob.pagamentospix.api.ApiDePagamentosPixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    ApiDePagamentosPixApi apiInstance = new ApiDePagamentosPixApi(defaultClient);
    RequisicaoLancamentoEfetivacao requisicaoLancamentoEfetivacao = new RequisicaoLancamentoEfetivacao(); // RequisicaoLancamentoEfetivacao | Objeto que contem um lancamento a ser efetivado
    try {
      RetornoPagamento result = apiInstance.pagamentosConfirmacaoPost(requisicaoLancamentoEfetivacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiDePagamentosPixApi#pagamentosConfirmacaoPost");
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
| **requisicaoLancamentoEfetivacao** | [**RequisicaoLancamentoEfetivacao**](RequisicaoLancamentoEfetivacao.md)| Objeto que contem um lancamento a ser efetivado | |

### Return type

[**RetornoPagamento**](RetornoPagamento.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pagamento foi criado com sucesso. |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pagamentosIdGet"></a>
# **pagamentosIdGet**
> RetornoPagamento pagamentosIdGet(id)

Consultar pagamento pix através do endToEndId.

Endpoint para consultar um pagamento Pix através de um e2eid.

### Example
```java
// Import classes:
import br.com.sicoob.pagamentospix.ApiClient;
import br.com.sicoob.pagamentospix.ApiException;
import br.com.sicoob.pagamentospix.Configuration;
import br.com.sicoob.pagamentospix.auth.*;
import br.com.sicoob.pagamentospix.models.*;
import br.com.sicoob.pagamentospix.api.ApiDePagamentosPixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    ApiDePagamentosPixApi apiInstance = new ApiDePagamentosPixApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      RetornoPagamento result = apiInstance.pagamentosIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiDePagamentosPixApi#pagamentosIdGet");
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
| **id** | **String**|  | |

### Return type

[**RetornoPagamento**](RetornoPagamento.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dados do Pix efetuado. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pagamentosPost"></a>
# **pagamentosPost**
> PagamentoIniciadoDict pagamentosPost(requisicaoLancamentoIniciacao)

Iniciar pagamento por meio de chave DICT

Iniciar pagamento por meio de chave DICT

### Example
```java
// Import classes:
import br.com.sicoob.pagamentospix.ApiClient;
import br.com.sicoob.pagamentospix.ApiException;
import br.com.sicoob.pagamentospix.Configuration;
import br.com.sicoob.pagamentospix.auth.*;
import br.com.sicoob.pagamentospix.models.*;
import br.com.sicoob.pagamentospix.api.ApiDePagamentosPixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    ApiDePagamentosPixApi apiInstance = new ApiDePagamentosPixApi(defaultClient);
    RequisicaoLancamentoIniciacao requisicaoLancamentoIniciacao = new RequisicaoLancamentoIniciacao(); // RequisicaoLancamentoIniciacao | Objeto que contem um lancamento a ser efetivado
    try {
      PagamentoIniciadoDict result = apiInstance.pagamentosPost(requisicaoLancamentoIniciacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiDePagamentosPixApi#pagamentosPost");
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
| **requisicaoLancamentoIniciacao** | [**RequisicaoLancamentoIniciacao**](RequisicaoLancamentoIniciacao.md)| Objeto que contem um lancamento a ser efetivado | |

### Return type

[**PagamentoIniciadoDict**](PagamentoIniciadoDict.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pagamento iniciciado com sucesso. |  -  |
| **400** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pagamentosQrcodePost"></a>
# **pagamentosQrcodePost**
> PagamentoIniciadoQRCodeResponse pagamentosQrcodePost(pagamentoIniciadoQRCodeBody)

Realizar pagamento por meio de código QRCode

Realiza o pagamento de Pix Copia e Cola (Imediato ou Vencimento) com execução direta. O processamento dispensa confirmação adicional ao validar automaticamente se:   1. O valor original coincide com o valor decodificado (sem juros/multa ou desconto).   2. A aplicação de juros/multa está autorizada.   3. O CNPJ do favorecido é idêntico ao registrado no payload. 

### Example
```java
// Import classes:
import br.com.sicoob.pagamentospix.ApiClient;
import br.com.sicoob.pagamentospix.ApiException;
import br.com.sicoob.pagamentospix.Configuration;
import br.com.sicoob.pagamentospix.auth.*;
import br.com.sicoob.pagamentospix.models.*;
import br.com.sicoob.pagamentospix.api.ApiDePagamentosPixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    ApiDePagamentosPixApi apiInstance = new ApiDePagamentosPixApi(defaultClient);
    PagamentoIniciadoQRCodeBody pagamentoIniciadoQRCodeBody = new PagamentoIniciadoQRCodeBody(); // PagamentoIniciadoQRCodeBody | Objeto que contém pagamento via QRCode
    try {
      PagamentoIniciadoQRCodeResponse result = apiInstance.pagamentosQrcodePost(pagamentoIniciadoQRCodeBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiDePagamentosPixApi#pagamentosQrcodePost");
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
| **pagamentoIniciadoQRCodeBody** | [**PagamentoIniciadoQRCodeBody**](PagamentoIniciadoQRCodeBody.md)| Objeto que contém pagamento via QRCode | |

### Return type

[**PagamentoIniciadoQRCodeResponse**](PagamentoIniciadoQRCodeResponse.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pagamento Iniciado com QRCode |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pagamentosWebhookDelete"></a>
# **pagamentosWebhookDelete**
> pagamentosWebhookDelete()

Cancelar o webhook Pix.

Endpoint para cancelamento do webhook. Não é a única forma pela qual um webhook pode ser removido.  O PSP recebedor está livre para remover unilateralmente um webhook que esteja associado a uma chave que não pertence mais a este usuário recebedor. 

### Example
```java
// Import classes:
import br.com.sicoob.pagamentospix.ApiClient;
import br.com.sicoob.pagamentospix.ApiException;
import br.com.sicoob.pagamentospix.Configuration;
import br.com.sicoob.pagamentospix.auth.*;
import br.com.sicoob.pagamentospix.models.*;
import br.com.sicoob.pagamentospix.api.ApiDePagamentosPixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    ApiDePagamentosPixApi apiInstance = new ApiDePagamentosPixApi(defaultClient);
    try {
      apiInstance.pagamentosWebhookDelete();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiDePagamentosPixApi#pagamentosWebhookDelete");
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

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Webhook para notificações Pix foi cancelado. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pagamentosWebhookGet"></a>
# **pagamentosWebhookGet**
> WebhookCompleto pagamentosWebhookGet()

Exibir informações acerca do Webhook Pix.

Endpoint para recuperação de informações sobre o Webhook Pix. 

### Example
```java
// Import classes:
import br.com.sicoob.pagamentospix.ApiClient;
import br.com.sicoob.pagamentospix.ApiException;
import br.com.sicoob.pagamentospix.Configuration;
import br.com.sicoob.pagamentospix.auth.*;
import br.com.sicoob.pagamentospix.models.*;
import br.com.sicoob.pagamentospix.api.ApiDePagamentosPixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    ApiDePagamentosPixApi apiInstance = new ApiDePagamentosPixApi(defaultClient);
    try {
      WebhookCompleto result = apiInstance.pagamentosWebhookGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiDePagamentosPixApi#pagamentosWebhookGet");
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

[**WebhookCompleto**](WebhookCompleto.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dados do webhook. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pagamentosWebhookPut"></a>
# **pagamentosWebhookPut**
> pagamentosWebhookPut(webhookSolicitado)

Configurar o Webhook Pix.

Endpoint para configuração do serviço de notificações acerca de Pix enviados. 

### Example
```java
// Import classes:
import br.com.sicoob.pagamentospix.ApiClient;
import br.com.sicoob.pagamentospix.ApiException;
import br.com.sicoob.pagamentospix.Configuration;
import br.com.sicoob.pagamentospix.auth.*;
import br.com.sicoob.pagamentospix.models.*;
import br.com.sicoob.pagamentospix.api.ApiDePagamentosPixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    ApiDePagamentosPixApi apiInstance = new ApiDePagamentosPixApi(defaultClient);
    WebhookSolicitado webhookSolicitado = new WebhookSolicitado(); // WebhookSolicitado | 
    try {
      apiInstance.pagamentosWebhookPut(webhookSolicitado);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiDePagamentosPixApi#pagamentosWebhookPut");
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
| **webhookSolicitado** | [**WebhookSolicitado**](WebhookSolicitado.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook para notificações acerca de Pix enviados. |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

