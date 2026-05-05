# TedsApi

All URIs are relative to *https://api.sicoob.com.br/spb/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transferenciasAgendamentosIdAgendamentoDelete**](TedsApi.md#transferenciasAgendamentosIdAgendamentoDelete) | **DELETE** /transferencias/agendamentos/{idAgendamento} | Cancela uma TED com o status de agendada. |
| [**transferenciasCodigoGet**](TedsApi.md#transferenciasCodigoGet) | **GET** /transferencias/{codigo} | Consulta TED pelo atributo numeroControleIf. |
| [**transferenciasPost**](TedsApi.md#transferenciasPost) | **POST** /transferencias | Envio de TED entre clientes. |


<a id="transferenciasAgendamentosIdAgendamentoDelete"></a>
# **transferenciasAgendamentosIdAgendamentoDelete**
> TransferenciasAgendamentosIdAgendamentoDelete200Response transferenciasAgendamentosIdAgendamentoDelete(clientId, xIdempotencyKey, idToken, idAgendamento)

Cancela uma TED com o status de agendada.

### Example
```java
// Import classes:
import br.com.sicoob.spbtransferencias.ApiClient;
import br.com.sicoob.spbtransferencias.ApiException;
import br.com.sicoob.spbtransferencias.Configuration;
import br.com.sicoob.spbtransferencias.auth.*;
import br.com.sicoob.spbtransferencias.models.*;
import br.com.sicoob.spbtransferencias.api.TedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/spb/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TedsApi apiInstance = new TedsApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    String xIdempotencyKey = "657e23a0-d14c-481e-a11c-3c718ff5b3c0"; // String | Codigo de controle idpotencia UUIDV4, deve ser unico para cada requisição.
    String idToken = "xxxx-xxxx-xxxx"; // String | Token JWT(id_token) gerado na autenticação.
    Integer idAgendamento = 56; // Integer | O codigo corresponde ao idAgendamento.
    try {
      TransferenciasAgendamentosIdAgendamentoDelete200Response result = apiInstance.transferenciasAgendamentosIdAgendamentoDelete(clientId, xIdempotencyKey, idToken, idAgendamento);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TedsApi#transferenciasAgendamentosIdAgendamentoDelete");
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
| **xIdempotencyKey** | **String**| Codigo de controle idpotencia UUIDV4, deve ser unico para cada requisição. | [default to 657e23a0-d14c-481e-a11c-3c718ff5b3c0] |
| **idToken** | **String**| Token JWT(id_token) gerado na autenticação. | [default to xxxx-xxxx-xxxx] |
| **idAgendamento** | **Integer**| O codigo corresponde ao idAgendamento. | |

### Return type

[**TransferenciasAgendamentosIdAgendamentoDelete200Response**](TransferenciasAgendamentosIdAgendamentoDelete200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | TED encontrada. |  -  |
| **404** | TED não encontrada. |  -  |
| **500** | Ocorreu um erro no servidor. |  -  |

<a id="transferenciasCodigoGet"></a>
# **transferenciasCodigoGet**
> TransferenciasCodigoGet200Response transferenciasCodigoGet(clientId, idToken, codigo)

Consulta TED pelo atributo numeroControleIf.

Retorna as informações de uma TED.

### Example
```java
// Import classes:
import br.com.sicoob.spbtransferencias.ApiClient;
import br.com.sicoob.spbtransferencias.ApiException;
import br.com.sicoob.spbtransferencias.Configuration;
import br.com.sicoob.spbtransferencias.auth.*;
import br.com.sicoob.spbtransferencias.models.*;
import br.com.sicoob.spbtransferencias.api.TedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/spb/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TedsApi apiInstance = new TedsApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    String idToken = "xxxx-xxxx-xxxx"; // String | Token JWT(id_token) gerado na autenticação.
    String codigo = "codigo_example"; // String | O codigo corresponde ao numeroControleIf.
    try {
      TransferenciasCodigoGet200Response result = apiInstance.transferenciasCodigoGet(clientId, idToken, codigo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TedsApi#transferenciasCodigoGet");
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
| **idToken** | **String**| Token JWT(id_token) gerado na autenticação. | [default to xxxx-xxxx-xxxx] |
| **codigo** | **String**| O codigo corresponde ao numeroControleIf. | |

### Return type

[**TransferenciasCodigoGet200Response**](TransferenciasCodigoGet200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | TED encontrada. |  -  |
| **404** | TED não encontrada. |  -  |
| **500** | Ocorreu um erro no servidor. |  -  |

<a id="transferenciasPost"></a>
# **transferenciasPost**
> PaymentTransactionRetorno transferenciasPost(clientId, xIdempotencyKey, idToken, transferencia)

Envio de TED entre clientes.

Envio de TED entre clientes.

### Example
```java
// Import classes:
import br.com.sicoob.spbtransferencias.ApiClient;
import br.com.sicoob.spbtransferencias.ApiException;
import br.com.sicoob.spbtransferencias.Configuration;
import br.com.sicoob.spbtransferencias.auth.*;
import br.com.sicoob.spbtransferencias.models.*;
import br.com.sicoob.spbtransferencias.api.TedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sicoob.com.br/spb/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TedsApi apiInstance = new TedsApi(defaultClient);
    String clientId = "clientId_example"; // String | ClientId utilizado para gerar o token.
    String xIdempotencyKey = "657e23a0-d14c-481e-a11c-3c718ff5b3c0"; // String | Codigo de controle idpotencia no padrão UUIDV4, deve ser unico para cada requisição.
    String idToken = "xxxx-xxxx-xxxx"; // String | Token JWT(id_token) gerado na autenticação.
    PaymentTransaction transferencia = new PaymentTransaction(); // PaymentTransaction | Objeto contendo dados para realização do agendamento de pagamento de convênio.
    try {
      PaymentTransactionRetorno result = apiInstance.transferenciasPost(clientId, xIdempotencyKey, idToken, transferencia);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TedsApi#transferenciasPost");
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
| **xIdempotencyKey** | **String**| Codigo de controle idpotencia no padrão UUIDV4, deve ser unico para cada requisição. | [default to 657e23a0-d14c-481e-a11c-3c718ff5b3c0] |
| **idToken** | **String**| Token JWT(id_token) gerado na autenticação. | [default to xxxx-xxxx-xxxx] |
| **transferencia** | [**PaymentTransaction**](PaymentTransaction.md)| Objeto contendo dados para realização do agendamento de pagamento de convênio. | |

### Return type

[**PaymentTransactionRetorno**](PaymentTransactionRetorno.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | TED enviada. |  -  |
| **404** | Não foi possivel o envio da TED. |  -  |
| **500** | Ocorreu um erro no servidor. |  -  |

