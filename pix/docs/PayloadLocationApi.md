# PayloadLocationApi

All URIs are relative to *https://api.sicoob.com.br/pix/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**locGet**](PayloadLocationApi.md#locGet) | **GET** /loc | Consultar locations cadastradas. |
| [**locIdGet**](PayloadLocationApi.md#locIdGet) | **GET** /loc/{id} | Recuperar location do payload. |
| [**locIdImagemGet**](PayloadLocationApi.md#locIdImagemGet) | **GET** /loc/{id}/imagem | Recuperar a imagem da location do payload. |
| [**locIdTxidDelete**](PayloadLocationApi.md#locIdTxidDelete) | **DELETE** /loc/{id}/txid | Desvincular uma cobrança de uma location. |
| [**locPost**](PayloadLocationApi.md#locPost) | **POST** /loc | Criar location do payload. |


<a id="locGet"></a>
# **locGet**
> PayloadLocationConsultadas locGet(inicio, fim, txIdPresente, tipoCob, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar locations cadastradas.

Endpoint para consultar locations cadastradas

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PayloadLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PayloadLocationApi apiInstance = new PayloadLocationApi(defaultClient);
    OffsetDateTime inicio = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime fim = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean txIdPresente = true; // Boolean | 
    String tipoCob = "cob"; // String | 
    Integer paginacaoPaginaAtual = 0; // Integer | 
    Integer paginacaoItensPorPagina = 100; // Integer | 
    try {
      PayloadLocationConsultadas result = apiInstance.locGet(inicio, fim, txIdPresente, tipoCob, paginacaoPaginaAtual, paginacaoItensPorPagina);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayloadLocationApi#locGet");
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
| **txIdPresente** | **Boolean**|  | [optional] |
| **tipoCob** | **String**|  | [optional] [enum: cob, cobv] |
| **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] |
| **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] |

### Return type

[**PayloadLocationConsultadas**](PayloadLocationConsultadas.md)

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

<a id="locIdGet"></a>
# **locIdGet**
> PayloadLocationCompleta locIdGet(id)

Recuperar location do payload.

Recupera a location do payload

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PayloadLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PayloadLocationApi apiInstance = new PayloadLocationApi(defaultClient);
    BigDecimal id = new BigDecimal(78); // BigDecimal | 
    try {
      PayloadLocationCompleta result = apiInstance.locIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayloadLocationApi#locIdGet");
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
| **id** | **BigDecimal**|  | |

### Return type

[**PayloadLocationCompleta**](PayloadLocationCompleta.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dados da location do Payload. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="locIdImagemGet"></a>
# **locIdImagemGet**
> File locIdImagemGet(id, largura)

Recuperar a imagem da location do payload.

Recupera a imagem da location do payload

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PayloadLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PayloadLocationApi apiInstance = new PayloadLocationApi(defaultClient);
    BigDecimal id = new BigDecimal(78); // BigDecimal | 
    Integer largura = 360; // Integer | 
    try {
      File result = apiInstance.locIdImagemGet(id, largura);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayloadLocationApi#locIdImagemGet");
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
| **id** | **BigDecimal**|  | |
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

<a id="locIdTxidDelete"></a>
# **locIdTxidDelete**
> PayloadLocation locIdTxidDelete(id)

Desvincular uma cobrança de uma location.

Endpoint utilizado para desvincular uma cobrança de uma location.  Se executado com sucesso, a entidade &#x60;loc&#x60; não apresentará mais um txid, se apresentava anteriormente à chamada. Adicionalmente, a entidade &#x60;cob&#x60; ou &#x60;cobv&#x60; associada ao txid desvinculado também passará a não mais apresentar um _location_. Esta operação não altera o &#x60;status&#x60; da &#x60;cob&#x60; ou &#x60;cobv&#x60; em questão. 

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PayloadLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PayloadLocationApi apiInstance = new PayloadLocationApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      PayloadLocation result = apiInstance.locIdTxidDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayloadLocationApi#locIdTxidDelete");
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

[**PayloadLocation**](PayloadLocation.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | cobrança representada pelo txid informado desvinculada com sucesso. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **404** | Recurso solicitado não foi encontrado. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

<a id="locPost"></a>
# **locPost**
> PayloadLocation locPost(payloadLocationSolicitada)

Criar location do payload.

Criar location do payload

### Example
```java
// Import classes:
import br.com.sicoob.pix.ApiClient;
import br.com.sicoob.pix.ApiException;
import br.com.sicoob.pix.Configuration;
import br.com.sicoob.pix.auth.*;
import br.com.sicoob.pix.models.*;
import br.com.sicoob.pix.api.PayloadLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pix/api/v2");
    
    // Configure OAuth2 access token for authorization: oauth-mtls-sso
    OAuth oauth-mtls-sso = (OAuth) defaultClient.getAuthentication("oauth-mtls-sso");
    oauth-mtls-sso.setAccessToken("YOUR ACCESS TOKEN");

    PayloadLocationApi apiInstance = new PayloadLocationApi(defaultClient);
    PayloadLocationSolicitada payloadLocationSolicitada = new PayloadLocationSolicitada(); // PayloadLocationSolicitada | Dados para geração da location.
    try {
      PayloadLocation result = apiInstance.locPost(payloadLocationSolicitada);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayloadLocationApi#locPost");
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
| **payloadLocationSolicitada** | [**PayloadLocationSolicitada**](PayloadLocationSolicitada.md)| Dados para geração da location. | |

### Return type

[**PayloadLocation**](PayloadLocation.md)

### Authorization

[oauth-mtls-sso](../README.md#oauth-mtls-sso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Dados da location do Payload. |  * location -  <br>  |
| **400** | Requisição com formato inválido. |  -  |
| **403** | Requisição de participante autenticado que viola alguma regra de autorização. |  -  |
| **503** | Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento. |  -  |

