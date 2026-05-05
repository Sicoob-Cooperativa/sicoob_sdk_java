# CobVApi

All URIs are relative to *https://api.sicoob.com.br/pix/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cobvGet**](CobVApi.md#cobvGet) | **GET** /cobv | Consultar lista de cobranças com vencimento. |
| [**cobvTxidGet**](CobVApi.md#cobvTxidGet) | **GET** /cobv/{txid} | Consultar cobrança com vencimento. |
| [**cobvTxidImagemGet**](CobVApi.md#cobvTxidImagemGet) | **GET** /cobv/{txid}/imagem | Obtem a imagem qrcode de uma cobrança com vencimento. |
| [**cobvTxidPatch**](CobVApi.md#cobvTxidPatch) | **PATCH** /cobv/{txid} | Revisar cobrança com vencimento. |
| [**cobvTxidPut**](CobVApi.md#cobvTxidPut) | **PUT** /cobv/{txid} | Criar cobrança com vencimento. |


<a id="cobvGet"></a>
# **cobvGet**
> CobsVConsultadas cobvGet(inicio, fim, cpf, cnpj, locationPresente, status, loteCobVId, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar lista de cobranças com vencimento.

Endpoint para consultar cobranças com vencimento através de parâmetros como início, fim, cpf, cnpj e status.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobVApi apiInstance = new CobVApi(defaultClient);
    OffsetDateTime inicio = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime fim = OffsetDateTime.now(); // OffsetDateTime | 
    String cpf = "cpf_example"; // String | 
    String cnpj = "cnpj_example"; // String | 
    Boolean locationPresente = true; // Boolean | 
    String status = "status_example"; // String | 
    Integer loteCobVId = 56; // Integer | 
    Integer paginacaoPaginaAtual = 0; // Integer | 
    Integer paginacaoItensPorPagina = 100; // Integer | 
    try {
      CobsVConsultadas result = apiInstance.cobvGet(inicio, fim, cpf, cnpj, locationPresente, status, loteCobVId, paginacaoPaginaAtual, paginacaoItensPorPagina);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobVApi#cobvGet");
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
| **cpf** | **String**|  | [optional] |
| **cnpj** | **String**|  | [optional] |
| **locationPresente** | **Boolean**|  | [optional] |
| **status** | **String**|  | [optional] |
| **loteCobVId** | **Integer**|  | [optional] |
| **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] |
| **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] |

### Return type

[**CobsVConsultadas**](CobsVConsultadas.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Lista de cobranças com vencimento. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobvTxidGet"></a>
# **cobvTxidGet**
> CobVCompleta cobvTxidGet(txid, revisao)

Consultar cobrança com vencimento.

Endpoint para consultar uma cobrança com vencimento através de um determinado txid.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobVApi apiInstance = new CobVApi(defaultClient);
    String txid = "txid_example"; // String | 
    Integer revisao = 56; // Integer | 
    try {
      CobVCompleta result = apiInstance.cobvTxidGet(txid, revisao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobVApi#cobvTxidGet");
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
| **txid** | **String**|  | |
| **revisao** | **Integer**|  | [optional] |

### Return type

[**CobVCompleta**](CobVCompleta.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dados da cobrança com vencimento. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobvTxidImagemGet"></a>
# **cobvTxidImagemGet**
> File cobvTxidImagemGet(txid, revisao, largura)

Obtem a imagem qrcode de uma cobrança com vencimento.

Endpoint para gerar a imagem qrcode de uma cobrança através de um determinado txid.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobVApi apiInstance = new CobVApi(defaultClient);
    String txid = "txid_example"; // String | 
    Integer revisao = 56; // Integer | 
    Integer largura = 360; // Integer | 
    try {
      File result = apiInstance.cobvTxidImagemGet(txid, revisao, largura);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobVApi#cobvTxidImagemGet");
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
| **txid** | **String**|  | |
| **revisao** | **Integer**|  | [optional] |
| **largura** | **Integer**|  | [optional] [default to 360] |

### Return type

[**File**](File.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Imagem qrcode que representa a cobrança |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobvTxidPatch"></a>
# **cobvTxidPatch**
> CobVGerada cobvTxidPatch(txid, cobVRevisada)

Revisar cobrança com vencimento.

Endpoint para revisar uma cobrança com vencimento.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobVApi apiInstance = new CobVApi(defaultClient);
    String txid = "txid_example"; // String | 
    CobVRevisada cobVRevisada = new CobVRevisada(); // CobVRevisada | Dados para geração da cobrança.
    try {
      CobVGerada result = apiInstance.cobvTxidPatch(txid, cobVRevisada);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobVApi#cobvTxidPatch");
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
| **txid** | **String**|  | |
| **cobVRevisada** | [**CobVRevisada**](CobVRevisada.md)| Dados para geração da cobrança. | |

### Return type

[**CobVGerada**](CobVGerada.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cobrança com vencimento revisada. A revisão deve ser incrementada em 1. |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobvTxidPut"></a>
# **cobvTxidPut**
> CobVGerada cobvTxidPut(txid, cobVSolicitada)

Criar cobrança com vencimento.

Endpoint para criar uma cobrança com vencimento.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobVApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobVApi apiInstance = new CobVApi(defaultClient);
    String txid = "txid_example"; // String | 
    CobVSolicitada cobVSolicitada = new CobVSolicitada(); // CobVSolicitada | Dados para geração da cobrança com vencimento.
    try {
      CobVGerada result = apiInstance.cobvTxidPut(txid, cobVSolicitada);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobVApi#cobvTxidPut");
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
| **txid** | **String**|  | |
| **cobVSolicitada** | [**CobVSolicitada**](CobVSolicitada.md)| Dados para geração da cobrança com vencimento. | |

### Return type

[**CobVGerada**](CobVGerada.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Cobrança com vencimento criada |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

