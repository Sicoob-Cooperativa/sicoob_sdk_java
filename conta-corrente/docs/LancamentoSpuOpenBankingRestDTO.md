

# LancamentoSpuOpenBankingRestDTO

Transacoes ocorridas em uma conta corrente no devido mes, ano e dia agrupado de acordo com o tipo.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | Identificador único de transação. |  [optional] |
|**tipo** | **String** | Informação do tipo de transação (Crédito ou Débito). |  [optional] |
|**valor** | **String** | Valor referente a transação realizada. |  [optional] |
|**data** | **String** | Data e hora que foi realizado a transação. |  [optional] |
|**dataLote** | **String** | Data de lançamento da transação. |  [optional] |
|**descricao** | **String** | Descrição da forma de transação utilizada. |  [optional] |
|**numeroDocumento** | **String** | Número identificador da transação. |  [optional] |
|**cpfCnpj** | **String** | Identificador (CPF ou CNPJ) da pessoa ou estabelecimento da transação. |  [optional] |
|**descInfComplementar** | **String** | Descrição complementar será apresentada conforme lançamento da transação. Para transação PIX a informação será apresentada conforme descrição informada pelo cooperado. |  [optional] |



