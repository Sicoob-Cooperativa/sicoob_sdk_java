

# OcorrenciaOptante


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorClienteEmpresaAnterior** | **String** | Identificador do cliente na empresa - Anterior. |  |
|**identificadorClienteEmpresaAtual** | **String** | Identificador do cliente na empresa - Atual. |  |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. Informar o número de conta corrente do parceiro no Sicoob. |  |
|**ocorrencia** | **String** | Mensagem explicativa da ocorrência. |  |
|**codigoMovimento** | [**CodigoMovimentoEnum**](#CodigoMovimentoEnum) | Código movimento:  * &#x60;0&#x60; - Alteração da Identificação do Cliente na Empresa.  * &#x60;1&#x60; -  Exclusão de optante do Débito Automático, solicitado pela Empresa, conforme clausulas contratuais do convênio  |  |
|**convenio** | **String** | Identificador do convênio. |  |
|**codigoOcorrenciaEspecial1** | **String** | Código da ocorrência especial 1, em conformidade com o padrão FEBRABAN - Registro H. |  [optional] |
|**codigoOcorrenciaEspecial2** | **String** | Código da ocorrência especial 2, em conformidade com o padrão FEBRABAN - Registro H. |  [optional] |
|**codigoOcorrenciaEspecial3** | **String** | Código da ocorrência especial 3, em conformidade com o padrão FEBRABAN - Registro H. |  [optional] |
|**codigoOcorrenciaEspecial4** | **String** | Código da ocorrência especial 4, em conformidade com o padrão FEBRABAN - Registro H. |  [optional] |
|**sequencial** | **Integer** | Identificador sequencial do registro. |  |



## Enum: CodigoMovimentoEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



