# WebhookApi

All URIs are relative to *https://api.sicoob.com.br/pix/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**webhookChaveDelete**](WebhookApi.md#webhookChaveDelete) | **DELETE** /webhook/{chave} | Cancelar o webhook Pix. |
| [**webhookChaveGet**](WebhookApi.md#webhookChaveGet) | **GET** /webhook/{chave} | Exibir informações acerca do Webhook Pix. |
| [**webhookChavePut**](WebhookApi.md#webhookChavePut) | **PUT** /webhook/{chave} | Configurar o Webhook Pix. |
| [**webhookGet**](WebhookApi.md#webhookGet) | **GET** /webhook | Consultar webhooks cadastrados. |


<a id="webhookChaveDelete"></a>
# **webhookChaveDelete**
> webhookChaveDelete(chave)

Cancelar o webhook Pix.

Endpoint para cancelamento do webhook. Não é a única forma pela qual um webhook pode ser removido.  O PSP recebedor está livre para remover unilateralmente um webhook que esteja associado a uma chave que não pertence mais a este usuário recebedor. 

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String chave = "chave_example"; // String | 
    try {
      apiInstance.webhookChaveDelete(chave);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookChaveDelete");
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
| **chave** | **String**|  | |

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

<a id="webhookChaveGet"></a>
# **webhookChaveGet**
> WebhookCompleto webhookChaveGet(chave)

Exibir informações acerca do Webhook Pix.

Endpoint para recuperação de informações sobre o Webhook Pix. 

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String chave = "chave_example"; // String | 
    try {
      WebhookCompleto result = apiInstance.webhookChaveGet(chave);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookChaveGet");
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
| **chave** | **String**|  | |

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

<a id="webhookChavePut"></a>
# **webhookChavePut**
> webhookChavePut(chave, webhookSolicitado)

Configurar o Webhook Pix.

Endpoint para configuração do serviço de notificações acerca de Pix recebidos. Somente Pix associados a um txid serão notificados. 

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String chave = "chave_example"; // String | 
    WebhookSolicitado webhookSolicitado = new WebhookSolicitado(); // WebhookSolicitado | 
    try {
      apiInstance.webhookChavePut(chave, webhookSolicitado);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookChavePut");
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
| **chave** | **String**|  | |
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
| **200** | Webhook para notificações acerca de Pix recebidos associados a um txid. |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="webhookGet"></a>
# **webhookGet**
> WebhooksConsultados webhookGet(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar webhooks cadastrados.

Endpoint para consultar Webhooks cadastrados

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    OffsetDateTime inicio = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime fim = OffsetDateTime.now(); // OffsetDateTime | 
    Integer paginacaoPaginaAtual = 0; // Integer | 
    Integer paginacaoItensPorPagina = 100; // Integer | 
    try {
      WebhooksConsultados result = apiInstance.webhookGet(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookGet");
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
| **inicio** | **OffsetDateTime**|  | [optional] |
| **fim** | **OffsetDateTime**|  | [optional] |
| **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] |
| **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] |

### Return type

[**WebhooksConsultados**](WebhooksConsultados.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | lista dos locations cadastrados de acordo com o critério de busca. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

