

# Pix


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | EndToEndIdentification que transita na PACS002, PACS004 e PACS008 |  |
|**estado** | [**EstadoEnum**](#EstadoEnum) | Estado do lançamento. |  |
|**valor** | **String** | Valor do Pix. |  |
|**detalheRejeicao** | **String** | Detalhe do motivo da rejeição do Pix. Somente quando for estado &#x60;FINALIZADO_REJEICAO&#x60; |  [optional] |



## Enum: EstadoEnum

| Name | Value |
|---- | -----|
| FINALIZADO_REJEICAO | &quot;FINALIZADO_REJEICAO&quot; |
| FINALIZADO_SUCESSO | &quot;FINALIZADO_SUCESSO&quot; |



