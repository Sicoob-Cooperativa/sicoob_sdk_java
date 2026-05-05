# IniciadorDeTransaesDePagamentoApi

All URIs are relative to *https://api.sicoob.com.br/payments/v2/itp*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buscarConsentimentoExternoIniciadoraUsingGET**](IniciadorDeTransaesDePagamentoApi.md#buscarConsentimentoExternoIniciadoraUsingGET) | **GET** /consents/{consent-id} | Buscar consentimento de pagamento. |
| [**criarConsentimentoUsingPOST1**](IniciadorDeTransaesDePagamentoApi.md#criarConsentimentoUsingPOST1) | **POST** /consents | Criar consentimento para a iniciação de pagamento. |
| [**listarUsingGET3**](IniciadorDeTransaesDePagamentoApi.md#listarUsingGET3) | **GET** /consents | Listar consentimento de pagamento. |
| [**retornoAutorizacaoUsingPOST1**](IniciadorDeTransaesDePagamentoApi.md#retornoAutorizacaoUsingPOST1) | **PUT** /consents/callback | Atualizar consentimento de pagamento callback |


<a id="buscarConsentimentoExternoIniciadoraUsingGET"></a>
# **buscarConsentimentoExternoIniciadoraUsingGET**
> ConsentimentoPagamentoIniciacao buscarConsentimentoExternoIniciadoraUsingGET(cpf, consentId, clientId, cnpj)

Buscar consentimento de pagamento.

Operação para buscar o consentimento de pagamento.

### Example
```java
// Import classes:
import br.com.sicoob.openfinance.ApiClient;
import br.com.sicoob.openfinance.ApiException;
import br.com.sicoob.openfinance.Configuration;
import br.com.sicoob.openfinance.auth.*;
import br.com.sicoob.openfinance.models.*;
import br.com.sicoob.openfinance.api.IniciadorDeTransaesDePagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/payments/v2/itp");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    IniciadorDeTransaesDePagamentoApi apiInstance = new IniciadorDeTransaesDePagamentoApi(defaultClient);
    String cpf = "cpf_example"; // String | cpf
    String consentId = "consentId_example"; // String | Identificador do consentimento
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    String cnpj = "cnpj_example"; // String | cnpj
    try {
      ConsentimentoPagamentoIniciacao result = apiInstance.buscarConsentimentoExternoIniciadoraUsingGET(cpf, consentId, clientId, cnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IniciadorDeTransaesDePagamentoApi#buscarConsentimentoExternoIniciadoraUsingGET");
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
| **cpf** | **String**| cpf | |
| **consentId** | **String**| Identificador do consentimento | |
| **clientId** | **String**| ClientId utilizado na utilização do TOKEN | |
| **cnpj** | **String**| cnpj | [optional] |

### Return type

[**ConsentimentoPagamentoIniciacao**](ConsentimentoPagamentoIniciacao.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Informações recuperadas com sucesso |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Dados não encontrados |  -  |

<a id="criarConsentimentoUsingPOST1"></a>
# **criarConsentimentoUsingPOST1**
> RetornoConsentimentoPagamentoIniciadoraIniciacao criarConsentimentoUsingPOST1(clientId, solicitacao)

Criar consentimento para a iniciação de pagamento.

Método de criação do consentimento para a iniciação de pagamento.

### Example
```java
// Import classes:
import br.com.sicoob.openfinance.ApiClient;
import br.com.sicoob.openfinance.ApiException;
import br.com.sicoob.openfinance.Configuration;
import br.com.sicoob.openfinance.auth.*;
import br.com.sicoob.openfinance.models.*;
import br.com.sicoob.openfinance.api.IniciadorDeTransaesDePagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/payments/v2/itp");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    IniciadorDeTransaesDePagamentoApi apiInstance = new IniciadorDeTransaesDePagamentoApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    ConsentimentoSolicitacaoIniciacao solicitacao = new ConsentimentoSolicitacaoIniciacao(); // ConsentimentoSolicitacaoIniciacao | solicitacao
    try {
      RetornoConsentimentoPagamentoIniciadoraIniciacao result = apiInstance.criarConsentimentoUsingPOST1(clientId, solicitacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IniciadorDeTransaesDePagamentoApi#criarConsentimentoUsingPOST1");
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
| **clientId** | **String**| ClientId utilizado na utilização do TOKEN | |
| **solicitacao** | [**ConsentimentoSolicitacaoIniciacao**](ConsentimentoSolicitacaoIniciacao.md)| solicitacao | |

### Return type

[**RetornoConsentimentoPagamentoIniciadoraIniciacao**](RetornoConsentimentoPagamentoIniciadoraIniciacao.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Consentimento solicitado com sucesso |  -  |
| **400** | Dados inválidos |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="listarUsingGET3"></a>
# **listarUsingGET3**
> PageConsentimentoPagamentoIniciacao listarUsingGET3(cpf, status, clientId, cnpj, accountNumbe, page, pageSize)

Listar consentimento de pagamento.

Operação para listar os consentimentos de pagamento.

### Example
```java
// Import classes:
import br.com.sicoob.openfinance.ApiClient;
import br.com.sicoob.openfinance.ApiException;
import br.com.sicoob.openfinance.Configuration;
import br.com.sicoob.openfinance.auth.*;
import br.com.sicoob.openfinance.models.*;
import br.com.sicoob.openfinance.api.IniciadorDeTransaesDePagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/payments/v2/itp");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    IniciadorDeTransaesDePagamentoApi apiInstance = new IniciadorDeTransaesDePagamentoApi(defaultClient);
    String cpf = "cpf_example"; // String | cpf
    String status = "AGENDADO"; // String | Situacao do Pagamento
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    String cnpj = "cnpj_example"; // String | cnpj
    String accountNumbe = "accountNumbe_example"; // String | Numero de conta
    Integer page = 0; // Integer | pagina
    Integer pageSize = 10; // Integer | tamanho da pagina
    try {
      PageConsentimentoPagamentoIniciacao result = apiInstance.listarUsingGET3(cpf, status, clientId, cnpj, accountNumbe, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IniciadorDeTransaesDePagamentoApi#listarUsingGET3");
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
| **cpf** | **String**| cpf | |
| **status** | **String**| Situacao do Pagamento | [enum: AGENDADO, AGUARDANDO_APROVACAO, CANCELADO, CONCLUIDO, EM_PROCESSAMENTO, EM_PROCESSAMENTO_INICIADORA, NAO_CONCLUIDO, SOLICITADO, TODOS] |
| **clientId** | **String**| ClientId utilizado na utilização do TOKEN | |
| **cnpj** | **String**| cnpj | [optional] |
| **accountNumbe** | **String**| Numero de conta | [optional] |
| **page** | **Integer**| pagina | [optional] [default to 0] |
| **pageSize** | **Integer**| tamanho da pagina | [optional] [default to 10] |

### Return type

[**PageConsentimentoPagamentoIniciacao**](PageConsentimentoPagamentoIniciacao.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gerado com sucesso |  -  |
| **400** | Dados inválidos |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Dados não encontrados |  -  |

<a id="retornoAutorizacaoUsingPOST1"></a>
# **retornoAutorizacaoUsingPOST1**
> ConsentimentoPagamentoIniciacaoRetorno retornoAutorizacaoUsingPOST1(clientId, callbackDataRequest)

Atualizar consentimento de pagamento callback

Callback para consulta do status do consentimento de pagamento.

### Example
```java
// Import classes:
import br.com.sicoob.openfinance.ApiClient;
import br.com.sicoob.openfinance.ApiException;
import br.com.sicoob.openfinance.Configuration;
import br.com.sicoob.openfinance.auth.*;
import br.com.sicoob.openfinance.models.*;
import br.com.sicoob.openfinance.api.IniciadorDeTransaesDePagamentoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/payments/v2/itp");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    IniciadorDeTransaesDePagamentoApi apiInstance = new IniciadorDeTransaesDePagamentoApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado na utilização do TOKEN
    CallbackDataRequest callbackDataRequest = new CallbackDataRequest(); // CallbackDataRequest | CallbackDataRequest
    try {
      ConsentimentoPagamentoIniciacaoRetorno result = apiInstance.retornoAutorizacaoUsingPOST1(clientId, callbackDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IniciadorDeTransaesDePagamentoApi#retornoAutorizacaoUsingPOST1");
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
| **clientId** | **String**| ClientId utilizado na utilização do TOKEN | |
| **callbackDataRequest** | [**CallbackDataRequest**](CallbackDataRequest.md)| CallbackDataRequest | |

### Return type

[**ConsentimentoPagamentoIniciacaoRetorno**](ConsentimentoPagamentoIniciacaoRetorno.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status atual do consentimento de pagamento |  -  |
| **400** | Dados inválidos |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

