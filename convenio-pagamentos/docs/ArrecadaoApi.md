# ArrecadaoApi

All URIs are relative to *https://api.sicoob.com.br/convenios-pagamentos/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**arrecadacaoCodigoBarrasCodigoBarrasGet**](ArrecadaoApi.md#arrecadacaoCodigoBarrasCodigoBarrasGet) | **GET** /arrecadacao/codigo-barras/{codigoBarras} | Consulta informações do código de barras |
| [**arrecadacaoCodigoBarrasCodigoBarrasPagamentosGet**](ArrecadaoApi.md#arrecadacaoCodigoBarrasCodigoBarrasPagamentosGet) | **GET** /arrecadacao/codigo-barras/{codigoBarras}/pagamentos | Consulta informações sobre o pagamento associado ao código de barras e à data de movimentação. |
| [**arrecadacaoCodigoBarrasCodigoBarrasPagamentosPost**](ArrecadaoApi.md#arrecadacaoCodigoBarrasCodigoBarrasPagamentosPost) | **POST** /arrecadacao/codigo-barras/{codigoBarras}/pagamentos | Arrecadação de convênios por meio de código de barras |
| [**arrecadacaoConciliacoesGet**](ArrecadaoApi.md#arrecadacaoConciliacoesGet) | **GET** /arrecadacao/conciliacoes | Consulta de conciliação das arrecadações. |
| [**arrecadacaoConveniosHabilitadosGet**](ArrecadaoApi.md#arrecadacaoConveniosHabilitadosGet) | **GET** /arrecadacao/convenios-habilitados | Listagem de convênios habilitados. |
| [**arrecadacaoPagamentosNsuComprovanteGet**](ArrecadaoApi.md#arrecadacaoPagamentosNsuComprovanteGet) | **GET** /arrecadacao/pagamentos/{nsu}/comprovante | Consulta de segunda via de pagamento. |


<a id="arrecadacaoCodigoBarrasCodigoBarrasGet"></a>
# **arrecadacaoCodigoBarrasCodigoBarrasGet**
> ArrecadacaoCodigoBarrasCodigoBarrasGet200Response arrecadacaoCodigoBarrasCodigoBarrasGet(codigoBarras, dataPagamento, recebimentoViaCaixa)

Consulta informações do código de barras

Este serviço tem como objetivo a consulta de informações de um código de barras e data de pagamento.  **Recomendação:**   - Consultar o serviço &#39;/arrecadacao/convenios-habilitados&#39; para verificar quais convênios estão disponíveis através desta API.   **Exclusivo para o perfil \&quot;Parceiro Banco Sicoob\&quot;:**   - O atributo &#39;recebimentoViaCaixa&#39; somente poderá ser informado por este perfil.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.ArrecadaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ArrecadaoApi apiInstance = new ArrecadaoApi(defaultClient);
    String codigoBarras = "codigoBarras_example"; // String | Número do código de barras (sem dígito verificador).
    LocalDate dataPagamento = LocalDate.now(); // LocalDate | Data de pagamento. Formato RFC 3339, seção 5.6 (yyyy-mm-dd).
    Boolean recebimentoViaCaixa = true; // Boolean | Indica se o pagamento foi realizado via caixa.
    try {
      ArrecadacaoCodigoBarrasCodigoBarrasGet200Response result = apiInstance.arrecadacaoCodigoBarrasCodigoBarrasGet(codigoBarras, dataPagamento, recebimentoViaCaixa);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrecadaoApi#arrecadacaoCodigoBarrasCodigoBarrasGet");
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
| **codigoBarras** | **String**| Número do código de barras (sem dígito verificador). | |
| **dataPagamento** | **LocalDate**| Data de pagamento. Formato RFC 3339, seção 5.6 (yyyy-mm-dd). | |
| **recebimentoViaCaixa** | **Boolean**| Indica se o pagamento foi realizado via caixa. | [optional] |

### Return type

[**ArrecadacaoCodigoBarrasCodigoBarrasGet200Response**](ArrecadacaoCodigoBarrasCodigoBarrasGet200Response.md)

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

<a id="arrecadacaoCodigoBarrasCodigoBarrasPagamentosGet"></a>
# **arrecadacaoCodigoBarrasCodigoBarrasPagamentosGet**
> RetornoCodigoBarras arrecadacaoCodigoBarrasCodigoBarrasPagamentosGet(codigoBarras, instituicao, dataMovimento, transacao)

Consulta informações sobre o pagamento associado ao código de barras e à data de movimentação.

Este serviço tem como objetivo a consulta de informações de um código de barras.   Para parceiros do \&quot;**Parceiro Banco Sicoob**\&quot;, o atributo nsu (Número Sequencial Único), obrigatório para a transação de pagamento.    **Exclusivo para o perfil \&quot;Parceiro Banco Sicoob\&quot;:**   - O atributo &#39;recebimentoViaCaixa&#39; uso exclusivo por este perfil.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.ArrecadaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ArrecadaoApi apiInstance = new ArrecadaoApi(defaultClient);
    String codigoBarras = "codigoBarras_example"; // String | Número do código de barras (sem dígito verificador).
    BigDecimal instituicao = new BigDecimal(78); // BigDecimal | Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado.
    LocalDate dataMovimento = LocalDate.now(); // LocalDate | Data de movimento. Formato RFC 3339, seção 5.6.
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do parceiro.
    try {
      RetornoCodigoBarras result = apiInstance.arrecadacaoCodigoBarrasCodigoBarrasPagamentosGet(codigoBarras, instituicao, dataMovimento, transacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrecadaoApi#arrecadacaoCodigoBarrasCodigoBarrasPagamentosGet");
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
| **codigoBarras** | **String**| Número do código de barras (sem dígito verificador). | |
| **instituicao** | **BigDecimal**| Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado. | |
| **dataMovimento** | **LocalDate**| Data de movimento. Formato RFC 3339, seção 5.6. | |
| **transacao** | **BigDecimal**| Código identificador da transação do parceiro. | [optional] |

### Return type

[**RetornoCodigoBarras**](RetornoCodigoBarras.md)

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

<a id="arrecadacaoCodigoBarrasCodigoBarrasPagamentosPost"></a>
# **arrecadacaoCodigoBarrasCodigoBarrasPagamentosPost**
> ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPost200Response arrecadacaoCodigoBarrasCodigoBarrasPagamentosPost(codigoBarras, arrecadacao)

Arrecadação de convênios por meio de código de barras

Este serviço tem como objetivo a arrecadação de convênios por meio de código de barras.   **Recomendação:**   - Consultar o serviço &#39;/arrecadacao/convenios-habilitados&#39; para verificar quais convênios estão disponíveis através desta API.   **Exclusivo para o perfil \&quot;Parceiro Banco Sicoob\&quot;:**   - O atributo nsu (Número Sequencial Único), obrigatório para a execução deste serviço.   - Deverá consultar o serviço &#39;/arrecadacao/codigo-barras/{codigoBarras}&#39;   - O atributo &#39;recebimentoViaCaixa&#39; somente poderá ser informado por este perfil.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.ArrecadaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ArrecadaoApi apiInstance = new ArrecadaoApi(defaultClient);
    String codigoBarras = "codigoBarras_example"; // String | Número do código de barras (sem dígito verificador).
    ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPostRequest arrecadacao = new ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPostRequest(); // ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPostRequest | Metadados para arrecadação de convênios.
    try {
      ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPost200Response result = apiInstance.arrecadacaoCodigoBarrasCodigoBarrasPagamentosPost(codigoBarras, arrecadacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrecadaoApi#arrecadacaoCodigoBarrasCodigoBarrasPagamentosPost");
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
| **codigoBarras** | **String**| Número do código de barras (sem dígito verificador). | |
| **arrecadacao** | [**ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPostRequest**](ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPostRequest.md)| Metadados para arrecadação de convênios. | |

### Return type

[**ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPost200Response**](ArrecadacaoCodigoBarrasCodigoBarrasPagamentosPost200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pagamento realizado com sucesso. |  -  |
| **202** | A transação esta pendente de assinatura. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

<a id="arrecadacaoConciliacoesGet"></a>
# **arrecadacaoConciliacoesGet**
> Conciliacao arrecadacaoConciliacoesGet(dataMovimento, instituicao, unidade)

Consulta de conciliação das arrecadações.

Este serviço tem como objeto a consulta de informações sintéticas das arrecadações realizadas em uma data de movimento.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.ArrecadaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ArrecadaoApi apiInstance = new ArrecadaoApi(defaultClient);
    LocalDate dataMovimento = LocalDate.now(); // LocalDate | Data de movimento. Formato RFC 3339, seção 5.6.
    BigDecimal instituicao = new BigDecimal(78); // BigDecimal | Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado.
    Integer unidade = 56; // Integer | Número identificador da unidade.
    try {
      Conciliacao result = apiInstance.arrecadacaoConciliacoesGet(dataMovimento, instituicao, unidade);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrecadaoApi#arrecadacaoConciliacoesGet");
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
| **dataMovimento** | **LocalDate**| Data de movimento. Formato RFC 3339, seção 5.6. | |
| **instituicao** | **BigDecimal**| Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado. | |
| **unidade** | **Integer**| Número identificador da unidade. | [optional] |

### Return type

[**Conciliacao**](Conciliacao.md)

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

<a id="arrecadacaoConveniosHabilitadosGet"></a>
# **arrecadacaoConveniosHabilitadosGet**
> ConveniosHabilitados arrecadacaoConveniosHabilitadosGet(transacao, instituicao)

Listagem de convênios habilitados.

&#39;Este serviço tem como objetivo retornar uma listagem contendo os convênios habilitados para arrecadação nesta API&#39;.

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.ArrecadaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ArrecadaoApi apiInstance = new ArrecadaoApi(defaultClient);
    BigDecimal transacao = new BigDecimal(78); // BigDecimal | Código identificador da transação do cliente.
    BigDecimal instituicao = new BigDecimal(78); // BigDecimal | Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado.
    try {
      ConveniosHabilitados result = apiInstance.arrecadacaoConveniosHabilitadosGet(transacao, instituicao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrecadaoApi#arrecadacaoConveniosHabilitadosGet");
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
| **transacao** | **BigDecimal**| Código identificador da transação do cliente. | |
| **instituicao** | **BigDecimal**| Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado. | |

### Return type

[**ConveniosHabilitados**](ConveniosHabilitados.md)

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

<a id="arrecadacaoPagamentosNsuComprovanteGet"></a>
# **arrecadacaoPagamentosNsuComprovanteGet**
> ArrecadacaoPagamentosNsuComprovanteGet200Response arrecadacaoPagamentosNsuComprovanteGet(nsu, instituicao)

Consulta de segunda via de pagamento.

Este serviço tem como objeto o retorno das informações de uma arrecadação contendo a segunda via do comprovante.     **Exclusivo para o perfil \&quot;Parceiro Banco Sicoob\&quot;:**   - O atributo &#39;recebimentoViaCaixa&#39; uso exclusivo por este perfil.   

### Example
```java
// Import classes:
import br.com.sicoob.conveniopagamentos.ApiClient;
import br.com.sicoob.conveniopagamentos.ApiException;
import br.com.sicoob.conveniopagamentos.Configuration;
import br.com.sicoob.conveniopagamentos.auth.*;
import br.com.sicoob.conveniopagamentos.models.*;
import br.com.sicoob.conveniopagamentos.api.ArrecadaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/convenios-pagamentos/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ArrecadaoApi apiInstance = new ArrecadaoApi(defaultClient);
    BigDecimal nsu = new BigDecimal(78); // BigDecimal | Número sequencial único: código que identifica a transação de arrecadação realizada.
    BigDecimal instituicao = new BigDecimal(78); // BigDecimal | Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado.
    try {
      ArrecadacaoPagamentosNsuComprovanteGet200Response result = apiInstance.arrecadacaoPagamentosNsuComprovanteGet(nsu, instituicao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrecadaoApi#arrecadacaoPagamentosNsuComprovanteGet");
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
| **nsu** | **BigDecimal**| Número sequencial único: código que identifica a transação de arrecadação realizada. | |
| **instituicao** | **BigDecimal**| Número identificador da instituição: para os cooperados, este campo deve conter o número da cooperativa. Para os parceiros, solicitamos que verifiquem com a área gestora o valor a ser informado. | |

### Return type

[**ArrecadacaoPagamentosNsuComprovanteGet200Response**](ArrecadacaoPagamentosNsuComprovanteGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retorno da segunda via do comprovante de pagamento. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **500** | Erro interno. |  -  |

