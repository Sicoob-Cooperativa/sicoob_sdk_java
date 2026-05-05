# InvestimentosApi

All URIs are relative to *https://api.sicoob.com.br/investimentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rendaFixaCarteirasGet**](InvestimentosApi.md#rendaFixaCarteirasGet) | **GET** /renda-fixa/carteiras | Busca os investimentos do cliente sumarizados por carteira |
| [**rendaFixaCarteirasIdCarteiraModalidadesGet**](InvestimentosApi.md#rendaFixaCarteirasIdCarteiraModalidadesGet) | **GET** /renda-fixa/carteiras/{idCarteira}/modalidades | Busca os investimentos do cliente pela carteira |
| [**rendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet**](InvestimentosApi.md#rendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet) | **GET** /renda-fixa/carteiras/{idCarteira}/modalidades/{idModalidade}/aplicacoes | Busca os dados da aplicação pela carteira e modalidade passadas |
| [**rendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet**](InvestimentosApi.md#rendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet) | **GET** /renda-fixa/extrato/{numeroContaCorrente}/{idAplicacao}/{idModalidade} | Busca o extrato da aplicação pela modalidade, data, conta e aplicação passadas |
| [**rendaFixaSaldosGet**](InvestimentosApi.md#rendaFixaSaldosGet) | **GET** /renda-fixa/saldos | Busca os investimentos do cliente |


<a id="rendaFixaCarteirasGet"></a>
# **rendaFixaCarteirasGet**
> RendaFixaCarteirasGet200Response rendaFixaCarteirasGet(clientId, numeroCooperativa, numeroContaCorrente)

Busca os investimentos do cliente sumarizados por carteira

Retorna sumarizado todos os investimentos LCA, RDC e DAP do cliente separado por carteira

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.InvestimentosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/investimentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    InvestimentosApi apiInstance = new InvestimentosApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    Integer numeroCooperativa = 56; // Integer | Número da Cooperativa.
    Integer numeroContaCorrente = 56; // Integer | Número da Conta Corrente.
    try {
      RendaFixaCarteirasGet200Response result = apiInstance.rendaFixaCarteirasGet(clientId, numeroCooperativa, numeroContaCorrente);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestimentosApi#rendaFixaCarteirasGet");
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
| **clientId** | **String**|  | |
| **numeroCooperativa** | **Integer**| Número da Cooperativa. | |
| **numeroContaCorrente** | **Integer**| Número da Conta Corrente. | |

### Return type

[**RendaFixaCarteirasGet200Response**](RendaFixaCarteirasGet200Response.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carteiras encontradas |  -  |
| **400** | Carteiras não encontradas |  -  |
| **500** | Carteiras não encontradas |  -  |

<a id="rendaFixaCarteirasIdCarteiraModalidadesGet"></a>
# **rendaFixaCarteirasIdCarteiraModalidadesGet**
> RendaFixaCarteirasIdCarteiraModalidadesGet200Response rendaFixaCarteirasIdCarteiraModalidadesGet(clientId, numeroCooperativa, numeroContaCorrente, idCarteira)

Busca os investimentos do cliente pela carteira

Retorna todos os investimentos de uma determinada carteira do cliente

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.InvestimentosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/investimentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    InvestimentosApi apiInstance = new InvestimentosApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    Integer numeroCooperativa = 56; // Integer | Número da Cooperativa.
    Integer numeroContaCorrente = 56; // Integer | Número da Conta Corrente.
    Integer idCarteira = 56; // Integer | ID da carteira
    try {
      RendaFixaCarteirasIdCarteiraModalidadesGet200Response result = apiInstance.rendaFixaCarteirasIdCarteiraModalidadesGet(clientId, numeroCooperativa, numeroContaCorrente, idCarteira);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestimentosApi#rendaFixaCarteirasIdCarteiraModalidadesGet");
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
| **clientId** | **String**|  | |
| **numeroCooperativa** | **Integer**| Número da Cooperativa. | |
| **numeroContaCorrente** | **Integer**| Número da Conta Corrente. | |
| **idCarteira** | **Integer**| ID da carteira | |

### Return type

[**RendaFixaCarteirasIdCarteiraModalidadesGet200Response**](RendaFixaCarteirasIdCarteiraModalidadesGet200Response.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Investimentos da carteira encontrados |  -  |
| **400** | Investimentos da Carteiras não encontradas |  -  |
| **500** | Investimentos da Carteiras não encontradas |  -  |

<a id="rendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet"></a>
# **rendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet**
> RendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet200Response rendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet(clientId, numeroCooperativa, numeroContaCorrente, idCarteira, idModalidade)

Busca os dados da aplicação pela carteira e modalidade passadas

Retorna todas as aplicações de uma determinada carteira e modalidade do cliente

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.InvestimentosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/investimentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    InvestimentosApi apiInstance = new InvestimentosApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    Integer numeroCooperativa = 56; // Integer | Número da Cooperativa.
    Integer numeroContaCorrente = 56; // Integer | Número da Conta Corrente.
    Integer idCarteira = 56; // Integer | ID da carteira
    Integer idModalidade = 56; // Integer | ID da modalidade
    try {
      RendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet200Response result = apiInstance.rendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet(clientId, numeroCooperativa, numeroContaCorrente, idCarteira, idModalidade);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestimentosApi#rendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet");
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
| **clientId** | **String**|  | |
| **numeroCooperativa** | **Integer**| Número da Cooperativa. | |
| **numeroContaCorrente** | **Integer**| Número da Conta Corrente. | |
| **idCarteira** | **Integer**| ID da carteira | |
| **idModalidade** | **Integer**| ID da modalidade | |

### Return type

[**RendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet200Response**](RendaFixaCarteirasIdCarteiraModalidadesIdModalidadeAplicacoesGet200Response.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aplicações da modalidade encontradas |  -  |
| **400** | Aplicações da modalidade não encontradas |  -  |
| **500** | Aplicações da modalidade não encontradas |  -  |

<a id="rendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet"></a>
# **rendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet**
> RendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet200Response rendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet(clientId, numeroCooperativa, numeroContaCorrente, idModalidade, idAplicacao, dataLote)

Busca o extrato da aplicação pela modalidade, data, conta e aplicação passadas

Retorna o extrato da aplicação

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.InvestimentosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/investimentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    InvestimentosApi apiInstance = new InvestimentosApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    Integer numeroCooperativa = 56; // Integer | Número da Cooperativa.
    Integer numeroContaCorrente = 56; // Integer | Número da Conta Corrente.
    Integer idModalidade = 56; // Integer | ID da modalidade
    Integer idAplicacao = 56; // Integer | ID da aplicação
    String dataLote = "dataLote_example"; // String | Data do lote
    try {
      RendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet200Response result = apiInstance.rendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet(clientId, numeroCooperativa, numeroContaCorrente, idModalidade, idAplicacao, dataLote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestimentosApi#rendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet");
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
| **clientId** | **String**|  | |
| **numeroCooperativa** | **Integer**| Número da Cooperativa. | |
| **numeroContaCorrente** | **Integer**| Número da Conta Corrente. | |
| **idModalidade** | **Integer**| ID da modalidade | |
| **idAplicacao** | **Integer**| ID da aplicação | |
| **dataLote** | **String**| Data do lote | |

### Return type

[**RendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet200Response**](RendaFixaExtratoNumeroContaCorrenteIdAplicacaoIdModalidadeGet200Response.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Extrato da aplicação encontrada |  -  |
| **204** | Aplicações da modalidade não encontradas |  -  |
| **400** | Erro negocial |  -  |
| **500** | Erro interno do servidor |  -  |

<a id="rendaFixaSaldosGet"></a>
# **rendaFixaSaldosGet**
> RendaFixaSaldosGet200Response rendaFixaSaldosGet(clientId, numeroCooperativa, numeroContaCorrente)

Busca os investimentos do cliente

Retorna sumarizado todos os investimentos LCA, RDC e DAP do cliente juntos.

### Example
```java
// Import classes:
import br.com.sicoob.investimentos.ApiClient;
import br.com.sicoob.investimentos.ApiException;
import br.com.sicoob.investimentos.Configuration;
import br.com.sicoob.investimentos.auth.*;
import br.com.sicoob.investimentos.models.*;
import br.com.sicoob.investimentos.api.InvestimentosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/investimentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    InvestimentosApi apiInstance = new InvestimentosApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    Integer numeroCooperativa = 56; // Integer | Número da Cooperativa.
    Integer numeroContaCorrente = 56; // Integer | Número da Conta Corrente.
    try {
      RendaFixaSaldosGet200Response result = apiInstance.rendaFixaSaldosGet(clientId, numeroCooperativa, numeroContaCorrente);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestimentosApi#rendaFixaSaldosGet");
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
| **clientId** | **String**|  | |
| **numeroCooperativa** | **Integer**| Número da Cooperativa. | |
| **numeroContaCorrente** | **Integer**| Número da Conta Corrente. | |

### Return type

[**RendaFixaSaldosGet200Response**](RendaFixaSaldosGet200Response.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aplicações encontradas |  -  |
| **400** | Aplicações não encontradas |  -  |
| **500** | Aplicações não encontradas |  -  |

