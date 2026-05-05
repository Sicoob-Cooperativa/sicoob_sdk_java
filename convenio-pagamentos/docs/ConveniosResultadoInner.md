

# ConveniosResultadoInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siglaConvenio** | **String** | Sigla do convênio |  [optional] |
|**codigoConvenio** | **String** | Código identificador do convênio. |  [optional] |
|**nomeConvenio** | **String** | Nome do convênio. |  [optional] |
|**permiteCaracterEspecial** | **Boolean** | Sinaliza se o identificador do optante permite caracter especial. |  [optional] |
|**codigoRegraIdentificadorOptante** | **Integer** | Código da regra de identificação do Optante |  [optional] |
|**codigoFebraban** | **String** | Código FEBRABAN do Convênio |  [optional] |
|**descricaoRegraIdentificadorOptante** | **String** | Descrição da regra do preenchimento do identificador optante. |  [optional] |
|**codigoModuloDV** | **Integer** | Código do módulo utilizado para cálculo de dígito verificador. |  [optional] |
|**descricaoModuloDV** | **String** | Descrição do módulo utilizado para cálculo de dígito verificador. |  [optional] |
|**cadastramentoOptante** | [**CadastramentoOptanteEnum**](#CadastramentoOptanteEnum) | Indica quem pode cadastrar o optante. |  [optional] |
|**codigoSegmento** | **Integer** | Código do segmento do convênio. |  [optional] |
|**descricaoSegmento** | **String** | Descrição do segmento do convênio. |  [optional] |



## Enum: CadastramentoOptanteEnum

| Name | Value |
|---- | -----|
| EMPRESA | &quot;EMPRESA&quot; |
| MISTO | &quot;MISTO&quot; |
| BANCO_PARCEIRO | &quot;BANCO/PARCEIRO&quot; |



