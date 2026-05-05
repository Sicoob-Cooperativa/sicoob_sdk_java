

# ConsentimentoPagamentoIniciacaoRetorno


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** |  |  [optional] |
|**cnpjIniciador** | **String** |  |  [optional] |
|**cnpjInitiator** | **String** |  |  [optional] |
|**consentId** | **String** |  |  [optional] |
|**creationDateTime** | **OffsetDateTime** |  |  [optional] |
|**creditor** | [**DestinoPagamentoIniciacao**](DestinoPagamentoIniciacao.md) |  |  [optional] |
|**debtorAccount** | [**DadosConta**](DadosConta.md) |  |  [optional] |
|**expirationDateTime** | **OffsetDateTime** |  |  [optional] |
|**loggedUser** | [**Documento**](Documento.md) |  |  [optional] |
|**businessEntity** | [**Documento**](Documento.md) |  |  [optional] |
|**payment** | [**Pagamento**](Pagamento.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**statusUpdateDateTime** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AUTHORISED | &quot;AUTHORISED&quot; |
| AWAITING_AUTHORISATION | &quot;AWAITING_AUTHORISATION&quot; |
| CONSUMED | &quot;CONSUMED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| REVOKED | &quot;REVOKED&quot; |



