

# HistRicoDeTentativasDeCobranAInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataLiquidacao** | **LocalDate** | Data da liquidação da cobrança. Trata-se de uma data, no formato &#x60;YYYY-MM-DD&#x60;, segundo ISO 8601. |  |
|**tipo** | [**TipoEnum**](#TipoEnum) | Tipo da tentativa da cobrança. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status da tentativa da cobrança. |  |
|**endToEndId** | **String** | EndToEndIdentification que transita na PACS002, PACS004 e PACS008 |  |
|**rejeicao** | [**InformaEsSobreARejeiODaTentativaDaCobranA**](InformaEsSobreARejeiODaTentativaDaCobranA.md) |  |  [optional] |
|**atualizacao** | [**List&lt;HistRicoDeStatusInner&gt;**](HistRicoDeStatusInner.md) | Histórico das mudanças de status das cobranças recorrentes. |  [optional] |



## Enum: TipoEnum

| Name | Value |
|---- | -----|
| AGND | &quot;AGND&quot; |
| NTAG | &quot;NTAG&quot; |
| RIFL | &quot;RIFL&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SOLICITADA | &quot;SOLICITADA&quot; |
| AGENDADA | &quot;AGENDADA&quot; |
| PAGA | &quot;PAGA&quot; |
| CANCELADA | &quot;CANCELADA&quot; |
| REJEITADA | &quot;REJEITADA&quot; |
| EXPIRADA | &quot;EXPIRADA&quot; |



