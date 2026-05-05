

# InformaEsSobreCalendRioDaRecorrNcia

Informações sobre calendário da recorrência

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataInicial** | **LocalDate** | Trata-se de uma data, no formato &#x60;YYYY-MM-DD&#x60;, segundo ISO 8601. Data estimada de primeiro pagamento. |  |
|**dataFinal** | **LocalDate** | Campo opcional que deve ser preenchido para autorizações com vigência pré-definida, devendo ser compatível com os valores informados em tipoFrequencia e a dataInicialRecorrencia. Não deve ser preenchido para autorizações por tempo indeterminado. Trata-se de uma data, no formato &#x60;YYYY-MM-DD&#x60;, segundo ISO 8601. |  [optional] |
|**periodicidade** | [**PeriodicidadeEnum**](#PeriodicidadeEnum) |  |  |



## Enum: PeriodicidadeEnum

| Name | Value |
|---- | -----|
| SEMANAL | &quot;SEMANAL&quot; |
| MENSAL | &quot;MENSAL&quot; |
| TRIMESTRAL | &quot;TRIMESTRAL&quot; |
| SEMESTRAL | &quot;SEMESTRAL&quot; |
| ANUAL | &quot;ANUAL&quot; |



