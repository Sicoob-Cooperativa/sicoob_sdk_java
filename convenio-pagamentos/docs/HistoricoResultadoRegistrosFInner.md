

# HistoricoResultadoRegistrosFInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa. |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. |  [optional] |
|**identificadorRegistroE** | **Integer** | Identificador do registro de débito (Registro E). |  [optional] |
|**movimento** | [**MovimentoEnum**](#MovimentoEnum) | Descrição do movimento. |  [optional] |
|**data** | **LocalDate** | Data do registro F. Formato RFC 3339, seção 5.6. |  [optional] |
|**envioParceiro** | **Boolean** | Identifica se o registro foi enviado pelo parceiro. |  [optional] |
|**dataVencimento** | **LocalDate** | Data vencimento do débito. Formato RFC 3339, seção 5.6. |  [optional] |
|**situacao** | **String** | Situação do débito |  [optional] |
|**autenticacao** | **String** | Informa o número de autenticação digital do registro B. |  [optional] |



## Enum: MovimentoEnum

| Name | Value |
|---- | -----|
| _0_D_BITO_NORMAL | &quot;0 - Débito Normal&quot; |
| _1_CANCELAMENTO | &quot;1 - Cancelamento&quot; |



