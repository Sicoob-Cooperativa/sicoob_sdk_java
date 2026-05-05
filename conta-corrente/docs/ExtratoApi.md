# ExtratoApi

All URIs are relative to *https://api.sicoob.com.br/conta-corrente/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**obterExtratoCompleto**](ExtratoApi.md#obterExtratoCompleto) | **GET** /extrato/{mes}/{ano} | Recupera o extrato de todas as transacoes ocorridas em uma conta corrente no devido mes, ano e dia agrupado de acordo com o tipo. |


<a id="obterExtratoCompleto"></a>
# **obterExtratoCompleto**
> ExtratoSpuOpenBankingRestDTO obterExtratoCompleto(clientId, mes, ano, numeroContaCorrente, diaInicial, diaFinal, agruparCNAB)

Recupera o extrato de todas as transacoes ocorridas em uma conta corrente no devido mes, ano e dia agrupado de acordo com o tipo.

Extrato bancario

### Example
```java
// Import classes:
import br.com.sicoob.contacorrente.ApiClient;
import br.com.sicoob.contacorrente.ApiException;
import br.com.sicoob.contacorrente.Configuration;
import br.com.sicoob.contacorrente.auth.*;
import br.com.sicoob.contacorrente.models.*;
import br.com.sicoob.contacorrente.api.ExtratoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/conta-corrente/v4");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: client_id
    ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
    client_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //client_id.setApiKeyPrefix("Token");

    ExtratoApi apiInstance = new ExtratoApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    Integer mes = 56; // Integer | Mes de referencia para o extrato.
    Integer ano = 56; // Integer | Ano de referencia para o extrato.
    Long numeroContaCorrente = 56L; // Long | Numero da conta corrente.
    Integer diaInicial = 56; // Integer | Dia inicial para o extrato.
    Integer diaFinal = 56; // Integer | Dia final para o extrato.
    Boolean agruparCNAB = true; // Boolean | Agrupar movimento proveniente do CNAB
    try {
      ExtratoSpuOpenBankingRestDTO result = apiInstance.obterExtratoCompleto(clientId, mes, ano, numeroContaCorrente, diaInicial, diaFinal, agruparCNAB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtratoApi#obterExtratoCompleto");
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
| **mes** | **Integer**| Mes de referencia para o extrato. | |
| **ano** | **Integer**| Ano de referencia para o extrato. | |
| **numeroContaCorrente** | **Long**| Numero da conta corrente. | |
| **diaInicial** | **Integer**| Dia inicial para o extrato. | [optional] |
| **diaFinal** | **Integer**| Dia final para o extrato. | [optional] |
| **agruparCNAB** | **Boolean**| Agrupar movimento proveniente do CNAB | [optional] |

### Return type

[**ExtratoSpuOpenBankingRestDTO**](ExtratoSpuOpenBankingRestDTO.md)

### Authorization

[oauth](../README.md#oauth), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consulta realizada com sucesso |  -  |
| **400** | Ocorreu um erro negocial |  -  |
| **500** | Erro interno de servidor |  -  |

