

# ExtratoSpuOpenBankingRestDTO

Extrato e saldo de todas as transacoes ocorridas em uma conta corrente no devido mes, ano e dia agrupado de acordo com o tipo.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**saldoAtual** | **String** | Valor de saldo atual disponivel em conta. |  [optional] |
|**saldoBloqueado** | **String** | Valor bloqueado em conta. |  [optional] |
|**saldoLimite** | **String** | Valor do limite disponivel para utilização. |  [optional] |
|**saldoAnterior** | **String** | Valor do saldo anterior será apresentado conforme a informação do campo Mês e Ano. |  [optional] |
|**saldoBloqueioJudicial** | **String** | Valor do saldo bloqueado judicialmente conforme a informação do campo Mês e Ano. |  [optional] |
|**saldoBloqueioJudicialAnterior** | **String** | Valor do saldo bloqueado judicialmente anterior conforme a informação do campo Mês e Ano. |  [optional] |
|**transacoes** | [**List&lt;LancamentoSpuOpenBankingRestDTO&gt;**](LancamentoSpuOpenBankingRestDTO.md) | Lista de transações realizadas referente ao período informado. |  [optional] |



