

# DebitosResultadoDebitosInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codigoRegistro** | [**CodigoRegistroEnum**](#CodigoRegistroEnum) | Código do registro da alteração de identificação do cliente pela empresa. |  [optional] |
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa |  [optional] |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. Informar o número de conta corrente do parceiro no Sicoob. |  [optional] |
|**convenio** | **String** | Identificador do convênio. |  [optional] |
|**movimento** | **Object** |  |  [optional] |
|**dataVencimento** | **LocalDate** | Data de Vencimento. Formato RFC 3339, seção 5.6. |  [optional] |
|**dataVencimentoOriginal** | **LocalDate** | Data de Vencimento Original. Formato RFC 3339, seção 5.6. |  [optional] |
|**usoDaEmpresa** | **String** | Informação de origem da Empresa. |  [optional] |
|**valorDebito** | **Float** | Valor a ser debitado na conta. |  [optional] |
|**numeroSequencialDebito** | **Integer** | Número sequencial do débito. |  [optional] |
|**numeroIdentificadorRegistro** | **Integer** | Número identificador do registro. (Este número deverá ser usado para o retorno do débito, tipo F) |  [optional] |
|**tipoIdentificacao** | [**TipoIdentificacaoEnum**](#TipoIdentificacaoEnum) | Tipo da identificação:  * &#x60;1&#x60; -  CPF.  * &#x60;2&#x60; -  CNPJ.  |  [optional] |
|**identificacao** | **String** | Identificação do CPF ou do CNPJ de acordo com o tipo da identificação informado. |  [optional] |
|**tipoOperacao** | **Object** |  |  [optional] |
|**opcaoChequeEspecial** | **Object** |  |  [optional] |
|**opcaoDebitoParcial** | **Object** |  |  [optional] |
|**dataPesquisa** | **LocalDate** | Data em que o registro foi recuperado pela primeira vez, quando esta informação não for retornada ou estiver vazio o mesmo está sendo retornado pela primeira vez. |  [optional] |
|**situacaoDebito** | [**SituacaoDebitoEnum**](#SituacaoDebitoEnum) | Situação do débito |  [optional] |



## Enum: CodigoRegistroEnum

| Name | Value |
|---- | -----|
| E | &quot;E&quot; |



## Enum: TipoIdentificacaoEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: SituacaoDebitoEnum

| Name | Value |
|---- | -----|
| EM_ABERTO | &quot;Em aberto&quot; |
| D_BITO_EFETUADO | &quot;Débito efetuado&quot; |
| D_BITO_N_O_EFETUADO_INSUFICI_NCIA_DE_FUNDOS | &quot;Débito não efetuado - Insuficiência de fundos&quot; |
| D_BITO_N_O_EFETUADO_CONTA_N_O_CADASTRADA | &quot;Débito não efetuado - Conta não cadastrada&quot; |
| D_BITO_N_O_EFETUADO_OUTRAS_RESTRI_ES | &quot;Débito não efetuado - Outras restrições&quot; |
| D_BITO_N_O_EFETUADO_VALOR_DO_D_BITO_EXCEDE_VALOR_LIMITE_APROVADO_ | &quot;Débito não efetuado – valor do débito excede valor limite aprovado.&quot; |
| D_BITO_N_O_EFETUADO_AG_NCIA_EM_REGIME_DE_ENCERRAMENTO | &quot;Débito não efetuado - Agência em regime de encerramento&quot; |
| D_BITO_N_O_EFETUADO_VALOR_INV_LIDO | &quot;Débito não efetuado - Valor inválido&quot; |
| D_BITO_N_O_EFETUADO_DATA_DE_LAN_AMENTO_INV_LIDA | &quot;Débito não efetuado - Data de lançamento inválida&quot; |
| D_BITO_N_O_EFETUADO_AG_NCIA_INV_LIDA | &quot;Débito não efetuado - Agência inválida&quot; |
| D_BITO_N_O_EFETUADO_CONTA_INV_LIDA | &quot;Débito não efetuado - conta inválida&quot; |
| D_BITO_N_O_EFETUADO_DATA_DO_D_BITO_ANTERIOR_DO_PROCESSAMENTO | &quot;Débito não efetuado - Data do débito anterior à do processamento&quot; |
| D_BITO_N_O_EFETUADO_AG_NCIA_CONTA_N_O_PERTENCE_AO_CPF_CNPJ_INFORMADO | &quot;Débito não efetuado – Agência/Conta não pertence ao CPF/CNPJ informado&quot; |
| D_BITO_N_O_EFETUADO_CONTA_CONJUNTA_N_O_SOLID_RIA | &quot;Débito não efetuado – conta conjunta não solidária&quot; |
| D_BITO_N_O_EFETUADO_SEM_CONTRATO_DE_D_BITO_AUTOM_TICO | &quot;Débito não efetuado - Sem contrato de débito automático&quot; |
| D_BITO_EFETUADO_EM_DATA_DIFERENTE_DA_DATA_INFORMADA_FERIADO_NA_PRA_A_DE_D_BITO | &quot;Débito efetuado em data diferente da data informada – feriado na praça de débito&quot; |
| MANUTEN_O_DO_CADASTRO | &quot;Manutenção do Cadastro&quot; |
| CANCELAMENTO_N_O_ENCONTRADO | &quot;Cancelamento - Não encontrado&quot; |
| CANCELAMENTO_N_O_EFETUADO_FORA_DO_TEMPO_H_BIL | &quot;Cancelamento - Não efetuado, fora do tempo hábil&quot; |
| CANCELAMENTO_CANCELADO_CONFORME_SOLICITA_O | &quot;Cancelamento - cancelado conforme solicitação&quot; |
| CANCELAMENTO_DE_D_BITO_PELO_CENTRALIZADOR | &quot;Cancelamento de débito pelo centralizador&quot; |
| CANCELAMENTO_DE_D_BITO_PELO_CLIENTE | &quot;Cancelamento de débito pelo cliente&quot; |
| CANCELAMENTO_DE_D_BITO_PELA_COOPERATIVA | &quot;Cancelamento de débito pela cooperativa&quot; |



