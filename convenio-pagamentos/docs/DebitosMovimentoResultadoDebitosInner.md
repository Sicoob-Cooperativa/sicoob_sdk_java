

# DebitosMovimentoResultadoDebitosInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorConvenio** | **String** | Identificador do convênio. |  [optional] |
|**siglaConvenio** | **String** | Sigla do convênio. |  [optional] |
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. Informar o número de conta corrente do parceiro no Sicoob. |  [optional] |
|**movimento** | **String** | Descrição do movimento. |  [optional] |
|**dataVencimento** | **LocalDate** | Data de Vencimento. Formato RFC 3339, seção 5.6. |  [optional] |
|**dataVencimentoOriginal** | **LocalDate** | Data de Vencimento Original. Formato RFC 3339, seção 5.6. |  [optional] |
|**valorDebito** | **Float** | Valor a ser debitado na conta. |  [optional] |
|**numeroSequencialDebito** | **Integer** | Número sequencial do débito. |  [optional] |
|**numeroIdentificadorRegistro** | **Integer** | Número identificador do registro. (Este número deverá ser usado para o retorno do débito, tipo E) |  [optional] |
|**codigoRetorno** | [**CodigoRetornoEnum**](#CodigoRetornoEnum) | Código do retorno. |  [optional] |
|**descricaoRetorno** | **String** | Descrição do retorno. |  [optional] |
|**autenticacao** | **String** | Autenticação do débito. |  [optional] |



## Enum: CodigoRetornoEnum

| Name | Value |
|---- | -----|
| _00 | &quot;00&quot; |
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _10 | &quot;10&quot; |
| _12 | &quot;12&quot; |
| _13 | &quot;13&quot; |
| _14 | &quot;14&quot; |
| _15 | &quot;15&quot; |
| _18 | &quot;18&quot; |
| _30 | &quot;30&quot; |
| _31 | &quot;31&quot; |
| _96 | &quot;96&quot; |
| _97 | &quot;97&quot; |
| _98 | &quot;98&quot; |
| _99 | &quot;99&quot; |
| DP | &quot;DP&quot; |
| FP | &quot;FP&quot; |
| CF | &quot;CF&quot; |
| NC | &quot;NC&quot; |
| CH | &quot;CH&quot; |
| PV | &quot;PV&quot; |
| DT | &quot;DT&quot; |
| OP | &quot;OP&quot; |
| CE | &quot;CE&quot; |
| CD | &quot;CD&quot; |
| PB | &quot;PB&quot; |



