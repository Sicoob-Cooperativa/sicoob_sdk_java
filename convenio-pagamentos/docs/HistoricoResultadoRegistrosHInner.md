

# HistoricoResultadoRegistrosHInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa. |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. |  [optional] |
|**identificadorClienteEmpresaAnterior** | **String** | Identificador do cliente na empresa - Anterior. |  [optional] |
|**movimento** | [**MovimentoEnum**](#MovimentoEnum) | Descrição do movimento. |  [optional] |
|**ocorrencia** | **String** | Mensagem explicativa da ocorrência. |  [optional] |
|**dataRecebeParceiro** | **LocalDate** | Data em que o parceiro enviou a informação do registro H. Formato RFC 3339, seção 5.6. |  [optional] |
|**autenticacao** | **String** | Informa o número de autenticação digital do registro B. |  [optional] |



## Enum: MovimentoEnum

| Name | Value |
|---- | -----|
| _0_ALTERA_O_IDENTIFICA_O_CLIENTE_EMPRESA | &quot;0 - ALTERAÇÃO IDENTIFICAÇÃO CLIENTE EMPRESA&quot; |
| _1_EXCLUS_O_DE_OPTANTE_DO_D_BITO_AUTOM_TICO | &quot;1 - EXCLUSÃO DE OPTANTE DO DÉBITO AUTOMÁTICO&quot; |



