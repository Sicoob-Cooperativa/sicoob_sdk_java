# DbitosAutomticosApi

All URIs are relative to *https://api.sicoob.com.br/convenios-pagamentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**debitoAutomaticoDebitosAutenticacaoGet**](DbitosAutomticosApi.md#debitoAutomaticoDebitosAutenticacaoGet) | **GET** /debito-automatico/debitos/{autenticacao} | Consulta o retorno de um débito automático. |
| [**debitoAutomaticoDebitosConciliacoesGet**](DbitosAutomticosApi.md#debitoAutomaticoDebitosConciliacoesGet) | **GET** /debito-automatico/debitos/conciliacoes | Consulta de conciliação das arrecadações. |
| [**debitoAutomaticoDebitosGet**](DbitosAutomticosApi.md#debitoAutomaticoDebitosGet) | **GET** /debito-automatico/debitos | Consulta de débitos em conta gerados pela Empresa para o Banco. |
| [**debitoAutomaticoDebitosMovimentacoesGet**](DbitosAutomticosApi.md#debitoAutomaticoDebitosMovimentacoesGet) | **GET** /debito-automatico/debitos/movimentacoes | Consulta a movimentação dos débitos. |
| [**debitoAutomaticoDebitosMovimentacoesPost**](DbitosAutomticosApi.md#debitoAutomaticoDebitosMovimentacoesPost) | **POST** /debito-automatico/debitos/movimentacoes | Retorno de débitos automáticos em lote. |
| [**debitoAutomaticoDebitosPost**](DbitosAutomticosApi.md#debitoAutomaticoDebitosPost) | **POST** /debito-automatico/debitos | Cadastramento do retorno do débito automático. |
| [**debitoAutomaticoOptantesAlteracoesGet**](DbitosAutomticosApi.md#debitoAutomaticoOptantesAlteracoesGet) | **GET** /debito-automatico/optantes/alteracoes | Alterações da identificação do cliente realizado pela Empresa para o Banco, conforme padrão Febraban |
| [**debitoAutomaticoOptantesConveniosGet**](DbitosAutomticosApi.md#debitoAutomaticoOptantesConveniosGet) | **GET** /debito-automatico/optantes/convenios | Lista de convênios |
| [**debitoAutomaticoOptantesHistoricoGet**](DbitosAutomticosApi.md#debitoAutomaticoOptantesHistoricoGet) | **GET** /debito-automatico/optantes/historico | Consulta de histórico de optantes. |
| [**debitoAutomaticoOptantesOcorrenciasPost**](DbitosAutomticosApi.md#debitoAutomaticoOptantesOcorrenciasPost) | **POST** /debito-automatico/optantes/ocorrencias | Cadastramento de ocorrências de alteração do cadastro do cliente. |
| [**debitoAutomaticoOptantesPost**](DbitosAutomticosApi.md#debitoAutomaticoOptantesPost) | **POST** /debito-automatico/optantes | Cadastramento de optantes para débito automático. |
| [**debitoAutomaticoOptantesRecusasGet**](DbitosAutomticosApi.md#debitoAutomaticoOptantesRecusasGet) | **GET** /debito-automatico/optantes/recusas | Recusas dos cadastros de optantes por parte da empresa |
| [**debitoAutomaticoOptantesValidacoesPost**](DbitosAutomticosApi.md#debitoAutomaticoOptantesValidacoesPost) | **POST** /debito-automatico/optantes/validacoes | Faz a validação de optantes para inclusão em débito automático. |


<a id="debitoAutomaticoDebitosAutenticacaoGet"></a>
# **debitoAutomaticoDebitosAutenticacaoGet**
> RetornoDebitoAutomatico debitoAutomaticoDebitosAutenticacaoGet(autenticacao, transacao)

Consulta o retorno de um débito automático.

Consulta os dados de retorno de um débito automático usando a chave de autenticação.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    String autenticacao = "autenticacao_example"; // String | Chave de autenticacao.
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    try {
      RetornoDebitoAutomatico result = apiInstance.debitoAutomaticoDebitosAutenticacaoGet(autenticacao, transacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoDebitosAutenticacaoGet");
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
| **autenticacao** | **String**| Chave de autenticacao. | |
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |

### Return type

[**RetornoDebitoAutomatico**](RetornoDebitoAutomatico.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio ao exibir as informações de convênios. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoDebitosConciliacoesGet"></a>
# **debitoAutomaticoDebitosConciliacoesGet**
> ConciliacaoDebitoAutomatico debitoAutomaticoDebitosConciliacoesGet(transacao, data)

Consulta de conciliação das arrecadações.

Retorna as informações de conciliação das arrecadações por data de movimento.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    BigDecimal data = new BigDecimal(78); // BigDecimal | Data do movimento. Formato RFC 3339, seção 5.6.
    try {
      ConciliacaoDebitoAutomatico result = apiInstance.debitoAutomaticoDebitosConciliacoesGet(transacao, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoDebitosConciliacoesGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |
| **data** | **BigDecimal**| Data do movimento. Formato RFC 3339, seção 5.6. | |

### Return type

[**ConciliacaoDebitoAutomatico**](ConciliacaoDebitoAutomatico.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoDebitosGet"></a>
# **debitoAutomaticoDebitosGet**
> Debitos debitoAutomaticoDebitosGet(transacao, pagina, data)

Consulta de débitos em conta gerados pela Empresa para o Banco.

Consulta os débitos em conta gerados pela Empresa para o Banco, conforme padrão Febraban Registro E

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    BigDecimal pagina = new BigDecimal(78); // BigDecimal | Número da página. Quando não utilizar o query parameter data é obrigatório que seja sempre repassado o valor 1 neste query parameter. Quando utilizar o query parameter data a página deverá estar contidada dentro do retorno do objeto paginação atributo 'totalPaginas'.
    LocalDate data = LocalDate.now(); // LocalDate | Data de movimento. Utilizar padrão: yyyy-MM-dd.
    try {
      Debitos result = apiInstance.debitoAutomaticoDebitosGet(transacao, pagina, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoDebitosGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |
| **pagina** | **BigDecimal**| Número da página. Quando não utilizar o query parameter data é obrigatório que seja sempre repassado o valor 1 neste query parameter. Quando utilizar o query parameter data a página deverá estar contidada dentro do retorno do objeto paginação atributo &#39;totalPaginas&#39;. | |
| **data** | **LocalDate**| Data de movimento. Utilizar padrão: yyyy-MM-dd. | [optional] |

### Return type

[**Debitos**](Debitos.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio ao exibir as informações de convênios. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoDebitosMovimentacoesGet"></a>
# **debitoAutomaticoDebitosMovimentacoesGet**
> DebitosMovimento debitoAutomaticoDebitosMovimentacoesGet(transacao, pagina, data)

Consulta a movimentação dos débitos.

Consulta as informações de movimentação dos débitos automáticos por data de movimento.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    BigDecimal pagina = new BigDecimal(78); // BigDecimal | Número da página. Quando não utilizar o query parameter data é obrigatório que seja sempre repassado o valor 1 neste query parameter. Quando utilizar o query parameter data a página deverá estar contidada dentro do retorno do objeto paginação atributo 'totalPaginas'.
    LocalDate data = LocalDate.now(); // LocalDate | Data de movimento. Utilizar padrão: yyyy-MM-dd.
    try {
      DebitosMovimento result = apiInstance.debitoAutomaticoDebitosMovimentacoesGet(transacao, pagina, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoDebitosMovimentacoesGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |
| **pagina** | **BigDecimal**| Número da página. Quando não utilizar o query parameter data é obrigatório que seja sempre repassado o valor 1 neste query parameter. Quando utilizar o query parameter data a página deverá estar contidada dentro do retorno do objeto paginação atributo &#39;totalPaginas&#39;. | |
| **data** | **LocalDate**| Data de movimento. Utilizar padrão: yyyy-MM-dd. | |

### Return type

[**DebitosMovimento**](DebitosMovimento.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio ao exibir as informações de convênios. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoDebitosMovimentacoesPost"></a>
# **debitoAutomaticoDebitosMovimentacoesPost**
> RetornoDebitoAutomaticoLote debitoAutomaticoDebitosMovimentacoesPost(respostaDebitosLote)

Retorno de débitos automáticos em lote.

Serviço para o envio de registros tipo F (padrão FEBRABAN) de débitos automáticos em lote. Com um limite de 100 registros por requisição.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    DebitosMovimentacaoLote respostaDebitosLote = new DebitosMovimentacaoLote(); // DebitosMovimentacaoLote | Cadastro do retorno de débitos automáticos.
    try {
      RetornoDebitoAutomaticoLote result = apiInstance.debitoAutomaticoDebitosMovimentacoesPost(respostaDebitosLote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoDebitosMovimentacoesPost");
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
| **respostaDebitosLote** | [**DebitosMovimentacaoLote**](DebitosMovimentacaoLote.md)| Cadastro do retorno de débitos automáticos. | |

### Return type

[**RetornoDebitoAutomaticoLote**](RetornoDebitoAutomaticoLote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Solicitação recebida com sucesso. Verifique o status de cada registro no retorno. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoDebitosPost"></a>
# **debitoAutomaticoDebitosPost**
> DebitoAutomaticoDebitosPost201Response debitoAutomaticoDebitosPost(debito)

Cadastramento do retorno do débito automático.

Cadastramento de retorno do débito automático enviado pela empresa (tipo E), padrão FEBRABAN registro F.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    DebitoAutomaticoDebitosPostRequest debito = new DebitoAutomaticoDebitosPostRequest(); // DebitoAutomaticoDebitosPostRequest | Requisição para o cadastramento do retorno do débito automático.
    try {
      DebitoAutomaticoDebitosPost201Response result = apiInstance.debitoAutomaticoDebitosPost(debito);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoDebitosPost");
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
| **debito** | [**DebitoAutomaticoDebitosPostRequest**](DebitoAutomaticoDebitosPostRequest.md)| Requisição para o cadastramento do retorno do débito automático. | |

### Return type

[**DebitoAutomaticoDebitosPost201Response**](DebitoAutomaticoDebitosPost201Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Retorno de débito cadastrado com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoOptantesAlteracoesGet"></a>
# **debitoAutomaticoOptantesAlteracoesGet**
> RetornoAlteracoesOptante debitoAutomaticoOptantesAlteracoesGet(transacao, data)

Alterações da identificação do cliente realizado pela Empresa para o Banco, conforme padrão Febraban

Consulta as alterações da identificação do cliente realizado pela Empresa para o Banco, conforme padrão Febraban Registro D

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    LocalDate data = LocalDate.now(); // LocalDate | Data de movimento. Utilizar padrão: yyyy-MM-dd.
    try {
      RetornoAlteracoesOptante result = apiInstance.debitoAutomaticoOptantesAlteracoesGet(transacao, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoOptantesAlteracoesGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |
| **data** | **LocalDate**| Data de movimento. Utilizar padrão: yyyy-MM-dd. | [optional] |

### Return type

[**RetornoAlteracoesOptante**](RetornoAlteracoesOptante.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio ao exibir as informações de convênios. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoOptantesConveniosGet"></a>
# **debitoAutomaticoOptantesConveniosGet**
> Convenios debitoAutomaticoOptantesConveniosGet(transacao, todosConvenios)

Lista de convênios

Lista os convênios que estão aptos a trabalhar com débito automático.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    Boolean todosConvenios = false; // Boolean | Parâmetro que indica a listagem completa dos convenios ou apenas os convênios que permitem o cadastro de optante  * `true` - LISTA TODOS OS CONVÊNIOS QUE ESTÃO DISPONÍVEIS NA API  * `false` - APENAS OS CONVÊNIOS QUE PERMITEM O CADASTRO DE OPTANTE 
    try {
      Convenios result = apiInstance.debitoAutomaticoOptantesConveniosGet(transacao, todosConvenios);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoOptantesConveniosGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |
| **todosConvenios** | **Boolean**| Parâmetro que indica a listagem completa dos convenios ou apenas os convênios que permitem o cadastro de optante  * &#x60;true&#x60; - LISTA TODOS OS CONVÊNIOS QUE ESTÃO DISPONÍVEIS NA API  * &#x60;false&#x60; - APENAS OS CONVÊNIOS QUE PERMITEM O CADASTRO DE OPTANTE  | [optional] [default to false] |

### Return type

[**Convenios**](Convenios.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoOptantesHistoricoGet"></a>
# **debitoAutomaticoOptantesHistoricoGet**
> Historico debitoAutomaticoOptantesHistoricoGet(transacao, identificadorClienteEmpresa, convenio, identificadorClienteBanco, ano)

Consulta de histórico de optantes.

Retorna as informações de registros B, C, E e F (código de registros segundo o leiaute FEBRABAN) de optantes. As informações serão retornadas por ano.  Exemplo: Ano igual 2021 retornará os registros de Janeiro a Dezembro de 2021.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    String identificadorClienteEmpresa = "identificadorClienteEmpresa_example"; // String | Identificador do cliente na empresa.
    String convenio = "convenio_example"; // String | Código do convênio.
    String identificadorClienteBanco = "identificadorClienteBanco_example"; // String | Identificador do cliente no banco.
    BigDecimal ano = new BigDecimal(78); // BigDecimal | Ano de pesquisa, usar o padrão AAAA.
    try {
      Historico result = apiInstance.debitoAutomaticoOptantesHistoricoGet(transacao, identificadorClienteEmpresa, convenio, identificadorClienteBanco, ano);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoOptantesHistoricoGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |
| **identificadorClienteEmpresa** | **String**| Identificador do cliente na empresa. | |
| **convenio** | **String**| Código do convênio. | |
| **identificadorClienteBanco** | **String**| Identificador do cliente no banco. | [optional] |
| **ano** | **BigDecimal**| Ano de pesquisa, usar o padrão AAAA. | [optional] |

### Return type

[**Historico**](Historico.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoOptantesOcorrenciasPost"></a>
# **debitoAutomaticoOptantesOcorrenciasPost**
> DebitoAutomaticoOptantesPost201Response debitoAutomaticoOptantesOcorrenciasPost(optante)

Cadastramento de ocorrências de alteração do cadastro do cliente.

Cadastramento de ocorrências de alteração do cadastro do cliente para débito automático, padrão FEBRABAN registro H.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    DebitoAutomaticoOptantesOcorrenciasPostRequest optante = new DebitoAutomaticoOptantesOcorrenciasPostRequest(); // DebitoAutomaticoOptantesOcorrenciasPostRequest | Requisição de cadastramento de ocorrências.
    try {
      DebitoAutomaticoOptantesPost201Response result = apiInstance.debitoAutomaticoOptantesOcorrenciasPost(optante);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoOptantesOcorrenciasPost");
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
| **optante** | [**DebitoAutomaticoOptantesOcorrenciasPostRequest**](DebitoAutomaticoOptantesOcorrenciasPostRequest.md)| Requisição de cadastramento de ocorrências. | |

### Return type

[**DebitoAutomaticoOptantesPost201Response**](DebitoAutomaticoOptantesPost201Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Cadastro realizado com sucesso. |  -  |
| **400** | Possíveis erros de negócio ao exibir as informações de convênios. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoOptantesPost"></a>
# **debitoAutomaticoOptantesPost**
> DebitoAutomaticoOptantesPost201Response debitoAutomaticoOptantesPost(optante)

Cadastramento de optantes para débito automático.

Realiza o cadastramento de optantes para débitos automático, padrão FEBRABAN registro B.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    DebitoAutomaticoOptantesPostRequest optante = new DebitoAutomaticoOptantesPostRequest(); // DebitoAutomaticoOptantesPostRequest | Requisição de cadastramento de optantes.
    try {
      DebitoAutomaticoOptantesPost201Response result = apiInstance.debitoAutomaticoOptantesPost(optante);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoOptantesPost");
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
| **optante** | [**DebitoAutomaticoOptantesPostRequest**](DebitoAutomaticoOptantesPostRequest.md)| Requisição de cadastramento de optantes. | |

### Return type

[**DebitoAutomaticoOptantesPost201Response**](DebitoAutomaticoOptantesPost201Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Cadastro realizado com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoOptantesRecusasGet"></a>
# **debitoAutomaticoOptantesRecusasGet**
> OcorrenciasCadastroOptante debitoAutomaticoOptantesRecusasGet(transacao, data)

Recusas dos cadastros de optantes por parte da empresa

Consulta as recusas dos cadastros de optantes, registro enviado da Empresa para o Banco, conforme padrão Febraban Registro C

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    LocalDate data = LocalDate.now(); // LocalDate | Data de movimento. Utilizar padrão: yyyy-MM-dd.
    try {
      OcorrenciasCadastroOptante result = apiInstance.debitoAutomaticoOptantesRecusasGet(transacao, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoOptantesRecusasGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | |
| **data** | **LocalDate**| Data de movimento. Utilizar padrão: yyyy-MM-dd. | [optional] |

### Return type

[**OcorrenciasCadastroOptante**](OcorrenciasCadastroOptante.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="debitoAutomaticoOptantesValidacoesPost"></a>
# **debitoAutomaticoOptantesValidacoesPost**
> DebitoAutomaticoOptantesValidacoesPost201Response debitoAutomaticoOptantesValidacoesPost(optante)

Faz a validação de optantes para inclusão em débito automático.

Realiza o validação das informações de optantes para débitos automático, padrão FEBRABAN registro B.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.DbitosAutomticosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DbitosAutomticosApi apiInstance = new DbitosAutomticosApi(defaultClient);
    DebitoAutomaticoOptantesPostRequest optante = new DebitoAutomaticoOptantesPostRequest(); // DebitoAutomaticoOptantesPostRequest | Requisição de validação de de optantes.
    try {
      DebitoAutomaticoOptantesValidacoesPost201Response result = apiInstance.debitoAutomaticoOptantesValidacoesPost(optante);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbitosAutomticosApi#debitoAutomaticoOptantesValidacoesPost");
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
| **optante** | [**DebitoAutomaticoOptantesPostRequest**](DebitoAutomaticoOptantesPostRequest.md)| Requisição de validação de de optantes. | |

### Return type

[**DebitoAutomaticoOptantesValidacoesPost201Response**](DebitoAutomaticoOptantesValidacoesPost201Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Validação efetuada com sucesso. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

