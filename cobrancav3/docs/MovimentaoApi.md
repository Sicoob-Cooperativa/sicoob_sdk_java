# MovimentaoApi

All URIs are relative to *https://api.sicoob.com.br/cobranca-bancaria/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boletosMovimentacoesDownloadGet**](MovimentaoApi.md#boletosMovimentacoesDownloadGet) | **GET** /boletos/movimentacoes/download | Download do(s) arquivo(s) de movimentação. |
| [**boletosMovimentacoesGet**](MovimentaoApi.md#boletosMovimentacoesGet) | **GET** /boletos/movimentacoes | Consultar a situação da solicitação da movimentação |
| [**boletosMovimentacoesPost**](MovimentaoApi.md#boletosMovimentacoesPost) | **POST** /boletos/movimentacoes | Solicitar a movimentação da carteira de cobrança registrada para beneficiário informado |


<a id="boletosMovimentacoesDownloadGet"></a>
# **boletosMovimentacoesDownloadGet**
> BoletosMovimentacoesDownloadGet200Response boletosMovimentacoesDownloadGet(numeroCliente, codigoSolicitacao, idArquivo)

Download do(s) arquivo(s) de movimentação.

Serviço para obter um arquivo de movimentação.

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.MovimentaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MovimentaoApi apiInstance = new MovimentaoApi(defaultClient);
    Integer numeroCliente = 56; // Integer | Número que identifica o contrato do beneficiário no Sisbr.
    Integer codigoSolicitacao = 56; // Integer | Código da solicitação que deseja consultar a quantidade de arquivos que serão gerados
    Integer idArquivo = 56; // Integer | ID do arquivo para download
    try {
      BoletosMovimentacoesDownloadGet200Response result = apiInstance.boletosMovimentacoesDownloadGet(numeroCliente, codigoSolicitacao, idArquivo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MovimentaoApi#boletosMovimentacoesDownloadGet");
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
| **numeroCliente** | **Integer**| Número que identifica o contrato do beneficiário no Sisbr. | |
| **codigoSolicitacao** | **Integer**| Código da solicitação que deseja consultar a quantidade de arquivos que serão gerados | |
| **idArquivo** | **Integer**| ID do arquivo para download | |

### Return type

[**BoletosMovimentacoesDownloadGet200Response**](BoletosMovimentacoesDownloadGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Erro de negócio |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="boletosMovimentacoesGet"></a>
# **boletosMovimentacoesGet**
> BoletosMovimentacoesGet200Response boletosMovimentacoesGet(numeroCliente, codigoSolicitacao)

Consultar a situação da solicitação da movimentação

Serviço para consultar a situação da solicitação da movimentação.

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.MovimentaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MovimentaoApi apiInstance = new MovimentaoApi(defaultClient);
    Integer numeroCliente = 56; // Integer | Número que identifica o contrato do beneficiário no Sisbr.
    Integer codigoSolicitacao = 56; // Integer | Código da solicitação que deseja consultar a quantidade de arquivos que serão gerados
    try {
      BoletosMovimentacoesGet200Response result = apiInstance.boletosMovimentacoesGet(numeroCliente, codigoSolicitacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MovimentaoApi#boletosMovimentacoesGet");
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
| **numeroCliente** | **Integer**| Número que identifica o contrato do beneficiário no Sisbr. | |
| **codigoSolicitacao** | **Integer**| Código da solicitação que deseja consultar a quantidade de arquivos que serão gerados | |

### Return type

[**BoletosMovimentacoesGet200Response**](BoletosMovimentacoesGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **204** | A requisição foi processada com êxito e não está retornando conteúdo. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

<a id="boletosMovimentacoesPost"></a>
# **boletosMovimentacoesPost**
> BoletosMovimentacoesPost200Response boletosMovimentacoesPost(solicitacao)

Solicitar a movimentação da carteira de cobrança registrada para beneficiário informado

Serviço para solicitar a movimentação da carteira de cobrança registrada para beneficiário informado. Os movimentos disponíveis para solicitaçao são 1. Entrada 2. Prorrogação 3. A Vencer 4. Vencido 5. Liquidação 6. Baixa 7. Vinculado Operações Crédito * As consultas estão limitadas em um período máximo de 2 dias.

### Example
```java
// Import classes:
import br.com.sicoob.cobrancav3.ApiClient;
import br.com.sicoob.cobrancav3.ApiException;
import br.com.sicoob.cobrancav3.Configuration;
import br.com.sicoob.cobrancav3.auth.*;
import br.com.sicoob.cobrancav3.models.*;
import br.com.sicoob.cobrancav3.api.MovimentaoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/cobranca-bancaria/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MovimentaoApi apiInstance = new MovimentaoApi(defaultClient);
    BoletosMovimentacoesPostRequest solicitacao = new BoletosMovimentacoesPostRequest(); // BoletosMovimentacoesPostRequest | Informações da solicitação de movimentação de cobrança.
    try {
      BoletosMovimentacoesPost200Response result = apiInstance.boletosMovimentacoesPost(solicitacao);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MovimentaoApi#boletosMovimentacoesPost");
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
| **solicitacao** | [**BoletosMovimentacoesPostRequest**](BoletosMovimentacoesPostRequest.md)| Informações da solicitação de movimentação de cobrança. | |

### Return type

[**BoletosMovimentacoesPost200Response**](BoletosMovimentacoesPost200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno |  -  |

