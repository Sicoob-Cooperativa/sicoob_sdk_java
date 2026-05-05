# MovimentaesDdaApi

All URIs are relative to *https://api.sicoob.com.br/pagamentos/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boletosGet**](MovimentaesDdaApi.md#boletosGet) | **GET** /boletos | Consultar Boletos DDA |


<a id="boletosGet"></a>
# **boletosGet**
> List&lt;BoletoDDA&gt; boletosGet(clientId, numeroConta, dataInicial, dataFinal, situacao, tipoData)

Consultar Boletos DDA

Serviço para consultar boletos DDA de uma conta corrente.

### Example
```java
// Import classes:
import br.com.sicoob.pagamentosv3.ApiClient;
import br.com.sicoob.pagamentosv3.ApiException;
import br.com.sicoob.pagamentosv3.Configuration;
import br.com.sicoob.pagamentosv3.auth.*;
import br.com.sicoob.pagamentosv3.models.*;
import br.com.sicoob.pagamentosv3.api.MovimentaesDdaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/pagamentos/v3");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MovimentaesDdaApi apiInstance = new MovimentaesDdaApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    Long numeroConta = 56L; // Long | Número da Conta Habilitada para Pagamentos via API.
    LocalDate dataInicial = LocalDate.now(); // LocalDate | Data inicial do filtro por data. Formato: yyyy-MM-dd Exemplo: 2022-07-30 
    LocalDate dataFinal = LocalDate.now(); // LocalDate | Data final do filtro por data. Formato: yyyy-MM-dd Exemplo: 2022-07-30 
    Long situacao = 56L; // Long | Código da Situação do Boleto. - 1 - Em aberto - 2 - Agendado - 3 - Liquidado - 4 - Baixado
    Integer tipoData = 56; // Integer | Opções 1, 2 ou 3 para escolher a data que será filtrada.  - 1 - Data de vencimento - 2 - Data de emissão - 3 - Data de inclusão
    try {
      List<BoletoDDA> result = apiInstance.boletosGet(clientId, numeroConta, dataInicial, dataFinal, situacao, tipoData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MovimentaesDdaApi#boletosGet");
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
| **clientId** | **String**| ClientId utilizado para gerar o token. | |
| **numeroConta** | **Long**| Número da Conta Habilitada para Pagamentos via API. | |
| **dataInicial** | **LocalDate**| Data inicial do filtro por data. Formato: yyyy-MM-dd Exemplo: 2022-07-30  | |
| **dataFinal** | **LocalDate**| Data final do filtro por data. Formato: yyyy-MM-dd Exemplo: 2022-07-30  | |
| **situacao** | **Long**| Código da Situação do Boleto. - 1 - Em aberto - 2 - Agendado - 3 - Liquidado - 4 - Baixado | |
| **tipoData** | **Integer**| Opções 1, 2 ou 3 para escolher a data que será filtrada.  - 1 - Data de vencimento - 2 - Data de emissão - 3 - Data de inclusão | |

### Return type

[**List&lt;BoletoDDA&gt;**](BoletoDDA.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **204** | Requisição processada com sucesso e não há conteúdo a ser retornado. |  -  |
| **400** | Possíveis erros de negócio. |  -  |
| **406** | Possíveis erros de inconsistência nos dados passados. |  -  |
| **500** | Erro interno. |  -  |

