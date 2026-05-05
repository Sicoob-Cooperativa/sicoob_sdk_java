

# Troco1

Informações relacionadas ao troco

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valor** | **String** | Valor do troco efetuado |  |
|**modalidadeAlteracao** | **Integer** | Modalidade de alteração de valor do troco. Quando não preenchido o valor assumido é o 0 (zero). |  [optional] |
|**modalidadeAgente** | [**ModalidadeAgenteEnum**](#ModalidadeAgenteEnum) | ##### Modalidade do Agente &lt;table&gt;&lt;tr&gt;&lt;th&gt;SIGLA&lt;/th&gt;&lt;th&gt;Descrição&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;AGTEC&lt;/td&gt;&lt;td&gt;Agente Estabelecimento Comercial&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;AGTOT&lt;/td&gt;&lt;td&gt;Agente Outra Espécie de Pessoa Jurídica ou Correspondente no País&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;  |  |
|**prestadorDoServicoDeSaque** | **String** | ISPB do Facilitador de Serviço de Saque |  |



## Enum: ModalidadeAgenteEnum

| Name | Value |
|---- | -----|
| AGTEC | &quot;AGTEC&quot; |
| AGTOT | &quot;AGTOT&quot; |



