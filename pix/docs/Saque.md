

# Saque

Informações relacionadas ao saque

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valor** | **String** | Valor do saque efetuado |  |
|**modalidadeAlteracao** | **Integer** | Modalidade de alteração de valor do saque. Quando não preenchido o valor assumido é o 0 (zero). |  [optional] |
|**modalidadeAgente** | [**ModalidadeAgenteEnum**](#ModalidadeAgenteEnum) | ##### Modalidade do Agente &lt;table&gt;&lt;tr&gt;&lt;th&gt;SIGLA&lt;/th&gt;&lt;th&gt;Descrição&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;AGTEC&lt;/td&gt;&lt;td&gt;Agente Estabelecimento Comercial&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;AGTOT&lt;/td&gt;&lt;td&gt;Agente Outra Espécie de Pessoa Jurídica ou Correspondente no País&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;AGPSS&lt;/td&gt;&lt;td&gt;Agente Facilitador de Serviço de Saque (&lt;b&gt;ATENÇÃO&lt;/b&gt;: no mapeamento para o campo &#39;modalidadeAgente&#39;, da pacs.008, esse valor deve ser substituído por &lt;b&gt;AGFSS&lt;/b&gt;)&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;  |  |
|**prestadorDoServicoDeSaque** | **String** | ISPB do Facilitador de Serviço de Saque |  |



## Enum: ModalidadeAgenteEnum

| Name | Value |
|---- | -----|
| AGTEC | &quot;AGTEC&quot; |
| AGTOT | &quot;AGTOT&quot; |
| AGPSS | &quot;AGPSS&quot; |



