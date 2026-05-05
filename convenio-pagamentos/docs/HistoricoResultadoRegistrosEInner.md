

# HistoricoResultadoRegistrosEInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa. |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. |  [optional] |
|**identificadorRegistro** | **Integer** | Identificador do registro de débito. |  [optional] |
|**movimento** | [**MovimentoEnum**](#MovimentoEnum) | Descrição do movimento. |  [optional] |
|**dataParceiro** | **LocalDate** | Data em que o parceiro recuperou a informação do registro E. Formato RFC 3339, seção 5.6. |  [optional] |
|**dataRecepcaoEmpresa** | **LocalDate** | Data em que a informação do registro E foi disponibilizada. Formato RFC 3339, seção 5.6. |  [optional] |
|**dataVencimento** | **LocalDate** | Data vencimento do débito. Formato RFC 3339, seção 5.6. |  [optional] |
|**situacao** | **String** | Situação do débito |  [optional] |



## Enum: MovimentoEnum

| Name | Value |
|---- | -----|
| _0_D_BITO_NORMAL | &quot;0 - Débito Normal&quot; |
| _1_CANCELAMENTO | &quot;1 - Cancelamento&quot; |



