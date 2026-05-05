

# ConsentimentoPagamentoIniciacao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**consentId** | **String** |  |  [optional] |
|**creationDateTime** | **OffsetDateTime** |  |  [optional] |
|**expirationDateTime** | **OffsetDateTime** |  |  [optional] |
|**statusUpdateDateTime** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**statusPayment** | [**StatusPaymentEnum**](#StatusPaymentEnum) |  |  [optional] |
|**loggedUser** | [**Documento**](Documento.md) |  |  [optional] |
|**businessEntity** | [**Documento**](Documento.md) |  |  [optional] |
|**creditor** | [**DestinoPagamentoIniciacao**](DestinoPagamentoIniciacao.md) |  |  [optional] |
|**payment** | [**Pagamento**](Pagamento.md) |  |  [optional] |
|**debtorAccount** | [**DadosConta**](DadosConta.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AUTHORISED | &quot;AUTHORISED&quot; |
| AWAITING_AUTHORISATION | &quot;AWAITING_AUTHORISATION&quot; |
| CONSUMED | &quot;CONSUMED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| REVOKED | &quot;REVOKED&quot; |



## Enum: StatusPaymentEnum

| Name | Value |
|---- | -----|
| RCVD | &quot;RCVD&quot; |
| PATC | &quot;PATC&quot; |
| CANC | &quot;CANC&quot; |
| ACCP | &quot;ACCP&quot; |
| ACPD | &quot;ACPD&quot; |
| RJCT | &quot;RJCT&quot; |
| ACSC | &quot;ACSC&quot; |
| PDNG | &quot;PDNG&quot; |
| SCHD | &quot;SCHD&quot; |



