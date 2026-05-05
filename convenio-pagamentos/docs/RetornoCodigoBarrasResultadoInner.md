

# RetornoCodigoBarrasResultadoInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valorPago** | **Double** | Valor pago para arrecadação. |  [optional] |
|**nsu** | **BigDecimal** | Código que identifica a transação de forma única. |  [optional] |
|**dataPagamento** | **LocalDate** | Data de pagamento do boleto. Formato RFC 3339, seção 5.6. |  [optional] |
|**valorDocumento** | **Double** | Valor do documento para arrecadação. |  [optional] |
|**valorDesconto** | **Double** | Valor do desconto para arrecadação. |  [optional] |
|**valorJuros** | **Double** | Valor do juros para arrecadação. |  [optional] |
|**valorMulta** | **Double** | Valor da multa para arrecadação. |  [optional] |
|**identificadorFgts** | **String** | Informa o identificador do convênico FGTS. |  [optional] |
|**anoExercicio** | **BigDecimal** | Informa o ano exercício do pagamento. |  [optional] |
|**recebimentoViaCaixa** | **Boolean** | Indica se o pagamento foi realizado via caixa. |  [optional] |
|**autenticacao** | **String** | Informa o número de autenticação digital da arrecadação. |  [optional] |
|**situacao** | **Integer** | Situação da arrecadação |  [optional] |
|**convenio** | **String** | Identificador do convênio |  [optional] |
|**siglaConvenio** | **String** | Sigla do convênio |  [optional] |
|**transacao** | **BigDecimal** | Número da transação utilizada no pagamento do código de barras. |  [optional] |



