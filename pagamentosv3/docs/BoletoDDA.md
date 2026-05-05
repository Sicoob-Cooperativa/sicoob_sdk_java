

# BoletoDDA


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**descricaoTipoPagador** | **String** | Tipo de pagador. |  [optional] |
|**tipoPessoaBeneficiario** | **String** | Tipo de pessoa (Física/Jurídica) do beneficiário. |  [optional] |
|**numeroCpfCnpjBeneficiario** | **String** | CPF ou CNPJ do beneficiário. |  [optional] |
|**nomeRazaoSocialBeneficiario** | **String** | Razão social do beneficiário. |  [optional] |
|**tipoPessoaPagador** | **String** | Tipo de pessoa (Física/Jurídica) do pagador. |  [optional] |
|**numeroCpfCnpjPagador** | **String** | CPF ou CNPJ do pagador. |  [optional] |
|**nomeRazaoSocialPagador** | **String** | Razão social do pagador. |  [optional] |
|**nomeFantasiaPagador** | **String** | Nome fantasia do pagador. |  [optional] |
|**descricaoLogradouroPagador** | **String** | Logradouro do pagador. |  [optional] |
|**descricaoCidadePagador** | **String** | Cidade do pagador. |  [optional] |
|**siglaUfPagador** | **String** | UF do pagador. |  [optional] |
|**numeroCepPagador** | **String** | CEP do pagador. |  [optional] |
|**tipoPessoaAvalista** | **String** | Tipo de pessoa (Física/Jurídica) do avalista. |  [optional] |
|**numeroCpfCnpjAvalista** | **String** | CPF ou CNPJ do avalista. |  [optional] |
|**nomeAvalista** | **String** | Nome do avalista. |  [optional] |
|**valorBoleto** | **BigDecimal** | Valor do boleto. |  [optional] |
|**dataVencimentoBoleto** | **LocalDate** | Data de vencimento do boleto. Formato: yyyy-MM-dd. |  [optional] |
|**codigoTipoSituacaoBoleto** | **Integer** | Código da situação do boleto |  [optional] |
|**descricaoSituacaoBoleto** | **String** | Situação do boleto. |  [optional] |
|**numeroIdentificadorBoletoCip** | **Integer** | Número identificador do boleto CIP. |  [optional] |
|**numeroCodigoBarras** | **String** | Código de barras. |  [optional] |
|**numeroCpfCnpjPagadorEletronico** | **String** | CPF ou CNPJ do pagador eletrônico. |  [optional] |
|**aceite** | **Boolean** | Aceite. |  [optional] |
|**numeroNossoNumero** | **String** | Nosso número. |  [optional] |
|**numeroDocumento** | **String** | Número do documento. |  [optional] |
|**dataPagamento** | **LocalDate** | Data do pagamento. Formato: yyyy-MM-dd. |  [optional] |
|**valorPagamento** | **BigDecimal** | Valor do pagamento |  [optional] |
|**codigoEspecieDocumento** | **Integer** | Código da espécie de documento. |  [optional] |
|**dataEmissao** | **LocalDate** | Data da emissão. Formato: yyyy-MM-dd. |  [optional] |
|**dataLimitePagamento** | **String** | Data do limite do pagamento. Formato: yyyy-MM-dd. |  [optional] |
|**codigoTipoJuros** | **BigDecimal** | Código do Tipo de juros. - 1 - Valor (dias corridos) - 2 - Percentual ao dia (dias corridos) - 3 - Percentual ao mês (dias corridos) - 4 - Percentual ao ano (dias corridos) - 5 - Isento - 6 - Valor (dia útil) - 7 - Percentual ao dia (dias úteis) - 8 - Percentual ao mês (dias úteis) - 9 - Percentual ao ano (dias úteis)  |  [optional] |
|**dataJuros** | **LocalDate** | Data do juros. Formato: yyyy-MM-dd. |  [optional] |
|**valorPercentualJuros** | **BigDecimal** | Percentual dos juros. |  [optional] |
|**codigoTipoMulta** | **Integer** | Código do tipo de multa. - 1 - Valor Fixo - 2 - Percentual - 3 - Isenta  |  [optional] |
|**dataMulta** | **LocalDate** | Data da multa. Formato: yyyy-MM-dd. |  [optional] |
|**valorPercentualMulta** | **BigDecimal** | Percentual da multa. |  [optional] |
|**valorAbatimento** | **BigDecimal** | Valor do abatimento. |  [optional] |
|**codigoTipoDesconto1** | **String** | Código do tipo do primeiro desconto. |  [optional] |
|**dataDesconto1** | **LocalDate** | Data do primeiro desconto. Formato yyyy-MM-dd |  [optional] |
|**valorPercentualDesconto1** | **BigDecimal** | Valor do primeiro desconto. |  [optional] |
|**codigoTipoDesconto2** | **String** | Código do tipo do segundo desconto. |  [optional] |
|**dataDesconto2** | **String** | Data do segundo desconto. |  [optional] |
|**valorPercentualDesconto2** | **BigDecimal** | Percentual do segundo desconto. |  [optional] |
|**codigoTipoDesconto3** | **String** | Código do tipo do terceiro desconto. |  [optional] |
|**dataDesconto3** | **String** | Data do terceiro desconto. |  [optional] |
|**valorPercentualDesconto3** | **BigDecimal** | Percentual do terceiro desconto. |  [optional] |
|**numeroDiasProtesto** | **Integer** | Número de dias de protesto. |  [optional] |
|**quantidadePagamentoParcial** | **Integer** | Quantidade de pagamentos parciais. |  [optional] |
|**codigoAutorizacaoValorDivergente** | **Integer** |  |  [optional] |
|**codigoIndicadorValorMaximo** | **String** | Código indicador do valor máximo. |  [optional] |
|**valorPercentualMaximo** | **BigDecimal** | Percentual máximo. |  [optional] |
|**codigoIndicadorValorMinimo** | **String** | Código do indicador do valor mínimo. |  [optional] |
|**valorPercentualMinimo** | **BigDecimal** | Percentual mínimo. |  [optional] |



