

# RequisicaoLancamentoEfetivacao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endToEndId** | **String** | EndToEndIdentification que transita na PACS002, PACS004 e PACS008 |  [optional] |
|**valor** | **String** | valor do lancamento |  |
|**descricao** | **String** | descricao do lancamento |  [optional] |
|**repeticao** | **Boolean** | Flag para indicar pagamento repetido |  [optional] |
|**meioIniciacao** | [**MeioIniciacaoEnum**](#MeioIniciacaoEnum) | Meio de iniciação Pix - &#x60;CHAVE&#x60; - &#x60;MANUAL&#x60; - &#x60;QRCODE&#x60; |  |
|**dataAgendamento** | **String** | Data do agendamento para pagamentos pretendido |  [optional] |
|**origem** | [**DadosContaUsuarioOrigem**](DadosContaUsuarioOrigem.md) |  |  [optional] |
|**destino** | [**DadosContaUsuarioDestino**](DadosContaUsuarioDestino.md) |  |  [optional] |



## Enum: MeioIniciacaoEnum

| Name | Value |
|---- | -----|
| CHAVE | &quot;CHAVE&quot; |
| MANUAL | &quot;MANUAL&quot; |
| QRCODE | &quot;QRCODE&quot; |



