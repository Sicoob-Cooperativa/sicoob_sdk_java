

# PagamentoIniciadoQRCodeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endToEndId** | **String** | Identificador fim a fim do lancamento |  |
|**estado** | [**EstadoEnum**](#EstadoEnum) |  |  [optional] |
|**valor** | **String** | Valor final da transação com 2 casas decimais. |  |
|**detalheRejeicao** | **String** | O motivo da recusa |  [optional] |
|**descricao** | **String** | descricao do lancamento |  [optional] |
|**horario** | **Object** | A data e hora que o lançamento foi atualizado |  [optional] |
|**origem** | [**DadosContaUsuarioOrigem**](DadosContaUsuarioOrigem.md) |  |  |
|**destino** | [**DadosContaUsuarioDestino**](DadosContaUsuarioDestino.md) |  |  |
|**dataAgendamento** | **String** | Data do agendamento para pagamentos pretendido |  [optional] |
|**txId** | **String** | Identificador da requisicao de pagamentos (TxId) |  [optional] |
|**valorOriginal** | **String** | Valor original da transação com 2 casas decimais. |  [optional] |
|**abatimento** | **String** | Valor de abatimento com 2 casas decimais. |  [optional] |
|**desconto** | **String** | Valor de desconto com 2 casas decimais. |  [optional] |
|**multa** | **String** | Valor de multa com 2 casas decimais. |  [optional] |
|**juros** | **String** | Valor dos juros com 2 casas decimais. |  [optional] |
|**tipoQrcode** | [**TipoQrcodeEnum**](#TipoQrcodeEnum) | Tipo do qrcode que originou o lançamento |  [optional] |



## Enum: EstadoEnum

| Name | Value |
|---- | -----|
| N_O_REALIZADO | &quot;NÃO_REALIZADO&quot; |
| EM_PROCESSAMENTO | &quot;EM_PROCESSAMENTO&quot; |
| FINALIZADO | &quot;FINALIZADO&quot; |
| REJEITADO | &quot;REJEITADO&quot; |



## Enum: TipoQrcodeEnum

| Name | Value |
|---- | -----|
| ESTATICO | &quot;ESTATICO&quot; |
| DINAMICO | &quot;DINAMICO&quot; |



