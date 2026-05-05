# CobApi

All URIs are relative to *https://api.sicoob.com.br/pix/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cobGet**](CobApi.md#cobGet) | **GET** /cob | Consultar lista de cobranças imediatas. |
| [**cobPost**](CobApi.md#cobPost) | **POST** /cob | Criar cobrança imediata. |
| [**cobTxidGet**](CobApi.md#cobTxidGet) | **GET** /cob/{txid} | Consultar cobrança imediata. |
| [**cobTxidImagemGet**](CobApi.md#cobTxidImagemGet) | **GET** /cob/{txid}/imagem | Obtem a imagem qrcode de uma cobrança imediata. |
| [**cobTxidPatch**](CobApi.md#cobTxidPatch) | **PATCH** /cob/{txid} | Revisar cobrança imediata. |
| [**cobTxidPut**](CobApi.md#cobTxidPut) | **PUT** /cob/{txid} | Criar cobrança imediata. |


<a id="cobGet"></a>
# **cobGet**
> CobsConsultadas cobGet(inicio, fim, cpf, cnpj, locationPresente, status, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar lista de cobranças imediatas.

Endpoint para consultar cobranças imediatas através de parâmetros como início, fim, cpf, cnpj e status.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobApi apiInstance = new CobApi(defaultClient);
    OffsetDateTime inicio = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime fim = OffsetDateTime.now(); // OffsetDateTime | 
    String cpf = "cpf_example"; // String | 
    String cnpj = "cnpj_example"; // String | 
    Boolean locationPresente = true; // Boolean | 
    String status = "status_example"; // String | 
    Integer paginacaoPaginaAtual = 0; // Integer | 
    Integer paginacaoItensPorPagina = 100; // Integer | 
    try {
      CobsConsultadas result = apiInstance.cobGet(inicio, fim, cpf, cnpj, locationPresente, status, paginacaoPaginaAtual, paginacaoItensPorPagina);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobApi#cobGet");
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
| **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] |
| **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] |

### Return type

[**CobsConsultadas**](CobsConsultadas.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Lista de cobranças imediatas. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobPost"></a>
# **cobPost**
> CobGerada cobPost(cobSolicitada)

Criar cobrança imediata.

Endpoint para criar uma cobrança imediata, neste caso, o txid deve ser definido pelo PSP.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobApi apiInstance = new CobApi(defaultClient);
    CobSolicitada cobSolicitada = new CobSolicitada(); // CobSolicitada | Dados para geração da cobrança imediata.
    try {
      CobGerada result = apiInstance.cobPost(cobSolicitada);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobApi#cobPost");
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
| **cobSolicitada** | [**CobSolicitada**](CobSolicitada.md)| Dados para geração da cobrança imediata. | |

### Return type

[**CobGerada**](CobGerada.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Cobrança imediata criada |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobTxidGet"></a>
# **cobTxidGet**
> CobCompleta cobTxidGet(txid, revisao)

Consultar cobrança imediata.

Endpoint para consultar uma cobrança através de um determinado txid.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobApi apiInstance = new CobApi(defaultClient);
    String txid = "txid_example"; // String | 
    Integer revisao = 56; // Integer | 
    try {
      CobCompleta result = apiInstance.cobTxidGet(txid, revisao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobApi#cobTxidGet");
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

[**CobCompleta**](CobCompleta.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dados da cobrança imediata. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobTxidImagemGet"></a>
# **cobTxidImagemGet**
> File cobTxidImagemGet(txid, revisao, largura)

Obtem a imagem qrcode de uma cobrança imediata.

Endpoint para gerar a imagem qrcode de uma cobrança através de um determinado txid.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobApi apiInstance = new CobApi(defaultClient);
    String txid = "txid_example"; // String | 
    Integer revisao = 56; // Integer | 
    Integer largura = 360; // Integer | 
    try {
      File result = apiInstance.cobTxidImagemGet(txid, revisao, largura);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobApi#cobTxidImagemGet");
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

<a id="cobTxidPatch"></a>
# **cobTxidPatch**
> CobGerada cobTxidPatch(txid, cobRevisada)

Revisar cobrança imediata.

Endpoint para revisar uma cobrança imediata.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobApi apiInstance = new CobApi(defaultClient);
    String txid = "txid_example"; // String | 
    CobRevisada cobRevisada = new CobRevisada(); // CobRevisada | Dados para geração da cobrança.
    try {
      CobGerada result = apiInstance.cobTxidPatch(txid, cobRevisada);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobApi#cobTxidPatch");
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
| **cobRevisada** | [**CobRevisada**](CobRevisada.md)| Dados para geração da cobrança. | |

### Return type

[**CobGerada**](CobGerada.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cobrança imediata revisada. A revisão deve ser incrementada em 1. |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="cobTxidPut"></a>
# **cobTxidPut**
> CobGerada cobTxidPut(txid, cobSolicitada)

Criar cobrança imediata.

Endpoint para criar uma cobrança imediata.

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.CobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    CobApi apiInstance = new CobApi(defaultClient);
    String txid = "txid_example"; // String | 
    CobSolicitada cobSolicitada = new CobSolicitada(); // CobSolicitada | Dados para geração da cobrança imediata.
    try {
      CobGerada result = apiInstance.cobTxidPut(txid, cobSolicitada);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CobApi#cobTxidPut");
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
| **cobSolicitada** | [**CobSolicitada**](CobSolicitada.md)| Dados para geração da cobrança imediata. | |

### Return type

[**CobGerada**](CobGerada.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Cobrança imediata criada |  -  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

