

# RateioCredito


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numeroBanco** | **Integer** | Número do Banco de Destino |  |
|**numeroAgencia** | **Integer** | Número da Agência de Destino |  |
|**numeroContaCorrente** | **String** | Número da Conta Corrente Destino. |  |
|**contaPrincipal** | **Boolean** | Identificador de conta principal. |  |
|**codigoTipoValorRateio** | **Integer** | Tipo de valor do Rateio.   - 1 Percentual   - 2 Valor |  |
|**valorRateio** | **String** | Valor do rateio. |  |
|**codigoTipoCalculoRateio** | **Integer** | Tipo de cálculo do Rateio.   - 1 Valor Cobrado |  [optional] |
|**numeroCpfCnpjTitular** | **String** | CPF ou CNPJ do titular da conta. &#x60;Tamanho máximo 14&#x60; |  [optional] |
|**nomeTitular** | **String** | Nome completo do titular da conta. &#x60;Tamanho máximo 50&#x60; |  |
|**codigoFinalidadeTed** | **String** | Código da Finalidade TED.   - 1 Pagamento de Impostos, Tributos e Taxas   - 2 Pagamento à Concessionárias de Serviço Público   - 3 Pagamentos de Dividendos   - 4 Pagamento de Salários   - 5 Pagamento de Fornecedores   - 6 Pagamento de Honorários   - 7 Pagamento de Aluguéis e Taxas de Condomínio   - 8 Pagamento de Duplicatas e Títulos   - 9 Pagamento de Mensalidade Escolar   - 10 Crédito em Conta    ...   - 99999 Outros   - Para mais informações acesse https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados |  [optional] |
|**codigoTipoContaDestinoTed** | **String** | Tipo de conta Finalidade TED. &#x60;Tamanho máximo 2&#x60;   - CC Conta Corrente   - CD Conta de Depósito   - CG Conta garantida |  [optional] |
|**quantidadeDiasFloat** | **Integer** | Quantidade de dias float (não informar junto com dataFloatCredito). &#x60;Tamanho máximo 10&#x60; |  [optional] |
|**dataFloatCredito** | **LocalDate** | Data do float (não informar junto com quantidadeDiasFloat) Formato: yyyy-MM-dd |  [optional] |



