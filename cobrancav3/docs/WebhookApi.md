# WebhookApi

All URIs are relative to *https://api.sicoob.com.br/cobranca-bancaria/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**webhooksGet**](WebhookApi.md#webhooksGet) | **GET** /webhooks | Consultar os webhooks cadastrados. |
| [**webhooksIdWebhookDelete**](WebhookApi.md#webhooksIdWebhookDelete) | **DELETE** /webhooks/{idWebhook} | Excluir um webhook. |
| [**webhooksIdWebhookPatch**](WebhookApi.md#webhooksIdWebhookPatch) | **PATCH** /webhooks/{idWebhook} | Atualizar um webhook cadastrado. |
| [**webhooksIdWebhookReativarPatch**](WebhookApi.md#webhooksIdWebhookReativarPatch) | **PATCH** /webhooks/{idWebhook}/reativar | Reativar um webhook inativo. |
| [**webhooksIdWebhookSolicitacoesGet**](WebhookApi.md#webhooksIdWebhookSolicitacoesGet) | **GET** /webhooks/{idWebhook}/solicitacoes | Consultar solicitações de um webhook. |
| [**webhooksPost**](WebhookApi.md#webhooksPost) | **POST** /webhooks | Cadastrar um webhook para receber notificações de acordo com o tipo de movimento. |


<a id="webhooksGet"></a>
# **webhooksGet**
> WebhooksGet200Response webhooksGet(idWebhook, codigoTipoMovimento)

Consultar os webhooks cadastrados.

Serviço para consultar os detalhes dos webhooks cadastrados.

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Long idWebhook = 56L; // Long | Identificador único do webhook.
    Integer codigoTipoMovimento = 56; // Integer | Código do tipo de movimento do webhook.   7 - Pagamento (Baixa operacional) 
    try {
      WebhooksGet200Response result = apiInstance.webhooksGet(idWebhook, codigoTipoMovimento);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhooksGet");
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
| **idWebhook** | **Long**| Identificador único do webhook. | [optional] |
| **codigoTipoMovimento** | **Integer**| Código do tipo de movimento do webhook.   7 - Pagamento (Baixa operacional)  | [optional] |

### Return type

[**WebhooksGet200Response**](WebhooksGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **204** | A consulta foi realizada com sucesso e não retornou registros. |  -  |
| **400** | Erro de negócio |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="webhooksIdWebhookDelete"></a>
# **webhooksIdWebhookDelete**
> webhooksIdWebhookDelete(idWebhook)

Excluir um webhook.

Serviço responsável por remover permanentemente um webhook registrado, encerrando o envio de notificações para a URL vinculada.\&quot; 

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Long idWebhook = 56L; // Long | Identificador único do webhook.
    try {
      apiInstance.webhooksIdWebhookDelete(idWebhook);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhooksIdWebhookDelete");
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
| **idWebhook** | **Long**| Identificador único do webhook. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Webhook excluído com sucesso. |  -  |
| **400** | Erro de negócio |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="webhooksIdWebhookPatch"></a>
# **webhooksIdWebhookPatch**
> webhooksIdWebhookPatch(idWebhook, webhook)

Atualizar um webhook cadastrado.

Serviço de atualização de webhook. Ao modificar a URL, a situação do webhook será automaticamente alterada para &#39;1 - Aguardando validação&#39; e permanecerá assim até que a nova URL seja validada com sucesso. 

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Long idWebhook = 56L; // Long | Identificador único do webhook.
    WebhookAlteracao webhook = new WebhookAlteracao(); // WebhookAlteracao | Informações do webhook para atualização.
    try {
      apiInstance.webhooksIdWebhookPatch(idWebhook, webhook);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhooksIdWebhookPatch");
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
| **idWebhook** | **Long**| Identificador único do webhook. | |
| **webhook** | [**WebhookAlteracao**](WebhookAlteracao.md)| Informações do webhook para atualização. | |

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
| **204** | Webhook atualizado com sucesso. |  -  |
| **400** | Erro de negócio |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="webhooksIdWebhookReativarPatch"></a>
# **webhooksIdWebhookReativarPatch**
> webhooksIdWebhookReativarPatch(idWebhook)

Reativar um webhook inativo.

Serviço de reativação de webhook desativado, restabelecendo o recebimento de notificações. A situação do webhook será atualizada para &#39;1 - Aguardando validação&#39; e permanecerá assim até que a URL seja validada com sucesso. 

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Long idWebhook = 56L; // Long | Identificador único do webhook.
    try {
      apiInstance.webhooksIdWebhookReativarPatch(idWebhook);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhooksIdWebhookReativarPatch");
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
| **idWebhook** | **Long**| Identificador único do webhook. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Webhook reativado com sucesso. |  -  |
| **400** | Erro de negócio |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="webhooksIdWebhookSolicitacoesGet"></a>
# **webhooksIdWebhookSolicitacoesGet**
> WebhooksIdWebhookSolicitacoesGet200Response webhooksIdWebhookSolicitacoesGet(idWebhook, dataSolicitacao, pagina, codigoSolicitacaoSituacao, codigoBarras, nossoNumero)

Consultar solicitações de um webhook.

Consulta as solicitações de notificação para um webhook com base na data de solicitação informada.  Retorna o histórico das tentativas de notificação, incluindo o status e a resposta da requisição. 

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Long idWebhook = 56L; // Long | Identificador único do webhook.
    LocalDate dataSolicitacao = LocalDate.now(); // LocalDate | Data da solicitação. Formato: yyyy-MM-dd
    Integer pagina = 56; // Integer | Número da página a ser consultada.
    Integer codigoSolicitacaoSituacao = 56; // Integer | Código da situação da solicitação do webhook.   - 2 - Aguardando envio   - 3 - Enviado com sucesso   - 6 - Erro no envio 
    String codigoBarras = "codigoBarras_example"; // String | Código de barras do boleto presente na notificação webhook
    Long nossoNumero = 56L; // Long | Nosso número do boleto presente na notificação webhook
    try {
      WebhooksIdWebhookSolicitacoesGet200Response result = apiInstance.webhooksIdWebhookSolicitacoesGet(idWebhook, dataSolicitacao, pagina, codigoSolicitacaoSituacao, codigoBarras, nossoNumero);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhooksIdWebhookSolicitacoesGet");
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
| **idWebhook** | **Long**| Identificador único do webhook. | |
| **dataSolicitacao** | **LocalDate**| Data da solicitação. Formato: yyyy-MM-dd | |
| **pagina** | **Integer**| Número da página a ser consultada. | [optional] |
| **codigoSolicitacaoSituacao** | **Integer**| Código da situação da solicitação do webhook.   - 2 - Aguardando envio   - 3 - Enviado com sucesso   - 6 - Erro no envio  | [optional] |
| **codigoBarras** | **String**| Código de barras do boleto presente na notificação webhook | [optional] |
| **nossoNumero** | **Long**| Nosso número do boleto presente na notificação webhook | [optional] |

### Return type

[**WebhooksIdWebhookSolicitacoesGet200Response**](WebhooksIdWebhookSolicitacoesGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Erro de negócio |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="webhooksPost"></a>
# **webhooksPost**
> WebhooksPost201Response webhooksPost(webhook)

Cadastrar um webhook para receber notificações de acordo com o tipo de movimento.

Este serviço permite cadastrar uma URL que será notificada sempre que ocorrer um evento associado a um tipo de movimento. O webhook pode ser configurado para o período de movimentação atual (D0). 

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    WebhookCadastro webhook = new WebhookCadastro(); // WebhookCadastro | Informações do webhook para o cadastro.
    try {
      WebhooksPost201Response result = apiInstance.webhooksPost(webhook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhooksPost");
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
| **webhook** | [**WebhookCadastro**](WebhookCadastro.md)| Informações do webhook para o cadastro. | |

### Return type

[**WebhooksPost201Response**](WebhooksPost201Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Webhook cadastrado com sucesso. |  -  |
| **400** | Erro de negócio |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

