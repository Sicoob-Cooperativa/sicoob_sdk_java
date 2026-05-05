# PixApi

All URIs are relative to *https://api.sicoob.com.br/pix/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pixE2eidDevolucaoIdGet**](PixApi.md#pixE2eidDevolucaoIdGet) | **GET** /pix/{e2eid}/devolucao/{id} | Consultar devolução. |
| [**pixE2eidDevolucaoIdPut**](PixApi.md#pixE2eidDevolucaoIdPut) | **PUT** /pix/{e2eid}/devolucao/{id} | Solicitar devolução. |
| [**pixE2eidGet**](PixApi.md#pixE2eidGet) | **GET** /pix/{e2eid} | Consultar Pix. |
| [**pixGet**](PixApi.md#pixGet) | **GET** /pix | Consultar Pix recebidos. |


<a id="pixE2eidDevolucaoIdGet"></a>
# **pixE2eidDevolucaoIdGet**
> Devolucao pixE2eidDevolucaoIdGet(e2eid, id)

Consultar devolução.

Endpoint para consultar uma devolução através de um End To End ID do Pix e do ID da devolução

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PixApi apiInstance = new PixApi(defaultClient);
    String e2eid = "e2eid_example"; // String | 
    String id = "id_example"; // String | 
    try {
      Devolucao result = apiInstance.pixE2eidDevolucaoIdGet(e2eid, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PixApi#pixE2eidDevolucaoIdGet");
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
| **e2eid** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**Devolucao**](Devolucao.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dados da devolução. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pixE2eidDevolucaoIdPut"></a>
# **pixE2eidDevolucaoIdPut**
> Devolucao pixE2eidDevolucaoIdPut(e2eid, id, devolucaoSolicitada)

Solicitar devolução.

Endpoint para solicitar uma devolução através de um e2eid do Pix e do ID da devolução. O motivo que será atribuído à PACS.004 será \&quot;MD06\&quot; ou \&quot;SL02\&quot; de acordo com a aba RTReason da PACS.004 que consta no Catálogo de Mensagens do Pix a depender da &#x60;natureza&#x60; da devolução (Vide a descrição deste campo). 

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PixApi apiInstance = new PixApi(defaultClient);
    String e2eid = "e2eid_example"; // String | 
    String id = "id_example"; // String | 
    DevolucaoSolicitada devolucaoSolicitada = new DevolucaoSolicitada(); // DevolucaoSolicitada | Dados para pedido de devolução.
    try {
      Devolucao result = apiInstance.pixE2eidDevolucaoIdPut(e2eid, id, devolucaoSolicitada);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PixApi#pixE2eidDevolucaoIdPut");
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
| **e2eid** | **String**|  | |
| **id** | **String**|  | |
| **devolucaoSolicitada** | [**DevolucaoSolicitada**](DevolucaoSolicitada.md)| Dados para pedido de devolução. | |

### Return type

[**Devolucao**](Devolucao.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Dados da devolução. |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="pixE2eidGet"></a>
# **pixE2eidGet**
> Pix pixE2eidGet(e2eid)

Consultar Pix.

Endpoint para consultar um Pix através de um e2eid.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PixApi apiInstance = new PixApi(defaultClient);
    String e2eid = "e2eid_example"; // String | 
    try {
      Pix result = apiInstance.pixE2eidGet(e2eid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PixApi#pixE2eidGet");
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
| **e2eid** | **String**|  | |

### Return type

[**Pix**](Pix.md)

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

<a id="pixGet"></a>
# **pixGet**
> PixConsultados pixGet(inicio, fim, txid, txIdPresente, devolucaoPresente, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar Pix recebidos.

Endpoint para consultar Pix recebidos

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PixApi apiInstance = new PixApi(defaultClient);
    OffsetDateTime inicio = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime fim = OffsetDateTime.now(); // OffsetDateTime | 
    String txid = "txid_example"; // String | 
    Boolean txIdPresente = true; // Boolean | 
    Boolean devolucaoPresente = true; // Boolean | 
    String cpf = "cpf_example"; // String | 
    String cnpj = "cnpj_example"; // String | 
    Integer paginacaoPaginaAtual = 0; // Integer | 
    Integer paginacaoItensPorPagina = 100; // Integer | 
    try {
      PixConsultados result = apiInstance.pixGet(inicio, fim, txid, txIdPresente, devolucaoPresente, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PixApi#pixGet");
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
| **inicio** | **OffsetDateTime**|  | |
| **fim** | **OffsetDateTime**|  | |
| **txid** | [**String**](.md)|  | [optional] |
| **txIdPresente** | **Boolean**|  | [optional] |
| **devolucaoPresente** | **Boolean**|  | [optional] |
| **cpf** | **String**|  | [optional] |
| **cnpj** | **String**|  | [optional] |
| **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] |
| **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] |

### Return type

[**PixConsultados**](PixConsultados.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | lista dos Pix recebidos de acordo com o critério de busca. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

