

# RetornoPagamento


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endToEndId** | **String** | Identificador fim a fim do lancamento |  |
|**estado** | [**EstadoEnum**](#EstadoEnum) |  |  [optional] |
|**valor** | **BigDecimal** | valor do lancamento |  |
|**detalheRejeicao** | **String** | O motivo da recusa |  [optional] |
|**descricao** | **String** | descricao do lancamento |  [optional] |
|**horario** | **Object** | A data e hora que o lançamento foi atualizado |  [optional] |
|**origem** | [**DadosContaUsuarioOrigem**](DadosContaUsuarioOrigem.md) |  |  |
|**destino** | [**DadosContaUsuarioDestino**](DadosContaUsuarioDestino.md) |  |  |
|**dataAgendamento** | **String** | Data do agendamento para pagamentos pretendido |  [optional] |



## Enum: EstadoEnum

| Name | Value |
|---- | -----|
| N_O_REALIZADO | &quot;NÃO_REALIZADO&quot; |
| EM_PROCESSAMENTO | &quot;EM_PROCESSAMENTO&quot; |
| FINALIZADO | &quot;FINALIZADO&quot; |
| REJEITADO | &quot;REJEITADO&quot; |



