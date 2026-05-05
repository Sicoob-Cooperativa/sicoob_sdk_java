

# HistoricoResultadoRegistrosDInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa. |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. |  [optional] |
|**identificadorClienteEmpresaAnterior** | **String** | Identificador do cliente na empresa - Anterior. |  [optional] |
|**movimento** | [**MovimentoEnum**](#MovimentoEnum) | Descrição do movimento. |  [optional] |
|**ocorrencia** | **String** | Mensagem explicativa da ocorrência. |  [optional] |
|**dataParceiro** | **LocalDate** | Data em que o parceiro recuperou a informação do registro D. Formato RFC 3339, seção 5.6. |  [optional] |
|**dataRecepcaoEmpresa** | **LocalDate** | Data em que a informação do registro D foi disponibilizada. Formato RFC 3339, seção 5.6. |  [optional] |



## Enum: MovimentoEnum

| Name | Value |
|---- | -----|
| _0_ALTERA_O_IDENTIFICA_O_CLIENTE_EMPRESA | &quot;0 - ALTERAÇÃO IDENTIFICAÇÃO CLIENTE EMPRESA&quot; |
| _1_EXCLUS_O_DE_OPTANTE_DO_D_BITO_AUTOM_TICO | &quot;1 - EXCLUSÃO DE OPTANTE DO DÉBITO AUTOMÁTICO&quot; |



