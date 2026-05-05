

# RetornoAlteracoesOptanteResultadoInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codigoRegistro** | [**CodigoRegistroEnum**](#CodigoRegistroEnum) | Código do registro da alteração de identificação do cliente pela empresa. |  [optional] |
|**codigoMovimento** | [**CodigoMovimentoEnum**](#CodigoMovimentoEnum) | Código movimento:  * &#x60;0&#x60; - Alteração da Identificação do Cliente na Empresa  * &#x60;1&#x60; - Exclusão de optante do Débito Automático, solicitação pela Empresa, conforme clausulas contratuais do convênio  |  [optional] |
|**convenio** | **String** | Identificador do convênio. |  [optional] |
|**identificadorClienteEmpresaAnterior** | **String** | Identificador do cliente na empresa - Anterior. |  [optional] |
|**identificadorClienteEmpresaAtual** | **String** | Identificador do cliente na empresa - Atual. |  [optional] |
|**agenciaDebito** | **Integer** | O conteúdo deverá ser idêntico ao anteriormente enviado pelo Banco. |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. Informar o número de conta corrente do parceiro no Sicoob. |  [optional] |
|**ocorrencia** | **String** | Mensagem |  [optional] |
|**dataVencimentoContrato** | **Integer** | Data de vencimento do contrato prazo de validade do contrato formato AAAAMMDD. Prazo de validade indeterminado – Formato 99999999 |  [optional] |
|**ocorrenciaEspecial1** | [**OcorrenciaEspecial**](OcorrenciaEspecial.md) |  |  [optional] |
|**ocorrenciaEspecial2** | [**OcorrenciaEspecial**](OcorrenciaEspecial.md) |  |  [optional] |
|**movimento** | [**Movimento**](Movimento.md) |  |  [optional] |
|**numeroConta** | **Integer** | Conta autorizada pelo cliente na Destinatária (conta salário/ conta corrente/ conta pagamento, conta poupança) |  [optional] |
|**sequencial** | **Integer** | Identificador sequencial do registro. |  [optional] |



## Enum: CodigoRegistroEnum

| Name | Value |
|---- | -----|
| D | &quot;D&quot; |



## Enum: CodigoMovimentoEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



