

# HistoricoResultadoRegistrosCInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa. |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. |  [optional] |
|**movimento** | [**MovimentoEnum**](#MovimentoEnum) | Descrição do movimento. |  [optional] |
|**ocorrencia** | **String** | Mensagem explicativa da ocorrência. |  [optional] |
|**dataParceiro** | **LocalDate** | Data em que o parceiro recuperou a informação do registro C. Formato RFC 3339, seção 5.6. |  [optional] |
|**dataRecepcaoEmpresa** | **LocalDate** | Data em que a informação do registro C foi disponibilizada. Formato RFC 3339, seção 5.6. |  [optional] |



## Enum: MovimentoEnum

| Name | Value |
|---- | -----|
| _1_EXCLUS_O | &quot;1 - EXCLUSÃO&quot; |
| _2_INCLUS_O | &quot;2 - INCLUSÃO&quot; |



