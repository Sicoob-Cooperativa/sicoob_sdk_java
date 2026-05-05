

# HistoricoResultadoRegistrosBInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa. |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. |  [optional] |
|**movimento** | [**MovimentoEnum**](#MovimentoEnum) | Descrição do movimento. |  [optional] |
|**dataRecebeParceiro** | **LocalDate** | Data de recebimento do registro B enviado pelo parceiro. Formato RFC 3339, seção 5.6. |  [optional] |
|**autenticacao** | **String** | Informa o número de autenticação digital do registro B. |  [optional] |



## Enum: MovimentoEnum

| Name | Value |
|---- | -----|
| _1_EXCLUS_O | &quot;1 - EXCLUSÃO&quot; |
| _2_INCLUS_O | &quot;2 - INCLUSÃO&quot; |



