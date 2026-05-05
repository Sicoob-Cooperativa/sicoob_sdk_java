

# ListaDeDescontosInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **LocalDate** | Descontos por pagamento antecipado, com data fixa. Matriz com até três elementos, sendo que cada elemento é composto por um par \&quot;data e valorPerc\&quot;, para estabelecer descontos percentuais ou absolutos, até aquela data de pagamento. Trata-se de uma data, no formato &#x60;YYYY-MM-DD&#x60;, segundo ISO 8601. A data de desconto obrigatoriamente deverá ser menor que a data de vencimento da cobrança. |  |
|**valorPerc** | **String** | Desconto em valor absoluto ou percentual por dia, útil ou corrido, conforme valor.desconto.modalidade |  |



