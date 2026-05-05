

# Transacao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tipo** | [**TipoEnum**](#TipoEnum) | Tipo da transação que pode ser CREDITO ou DEBITO |  |
|**valor** | **Double** | Valor da transação |  |
|**data** | **OffsetDateTime** | Data em que ocorreu a transação |  |
|**descricao** | **String** | Detalhe sobre a transação |  |
|**descricaoAutenticacaoDigital** | **String** | Autenticação utilizada no lançamento |  [optional] |
|**observacaoLancamento** | **String** | Descrição do lançamento gerado |  [optional] |
|**descricaoNomeOrigemDestino** | **String** | Descrição da origem ou destino do recurso |  [optional] |



## Enum: TipoEnum

| Name | Value |
|---- | -----|
| DEBITO | &quot;DEBITO&quot; |
| CREDITO | &quot;CREDITO&quot; |



