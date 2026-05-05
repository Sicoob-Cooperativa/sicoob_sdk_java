

# Boleto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numeroCliente** | **Integer** | Número que identifica o contrato do beneficiário no Sisbr. |  |
|**codigoModalidade** | **Integer** | Número que identifica a modalidade do boleto. Informar - 1 - SIMPLES COM REGISTRO |  |
|**numeroContaCorrente** | **Integer** | Número da Conta Corrente onde será realizado o crédito da liquidação do boleto. |  |
|**codigoEspecieDocumento** | **String** | Espécie do Documento. Informar valores listados abaixo. &#x60;Tamanho máximo 3&#x60;   - CH - Cheque   - DM - Duplicata Mercantil   - DMI - Duplicata Mercantil Indicação   - DS - Duplicata de Serviço   - DSI - Duplicata Serviço Indicação   - DR - Duplicata Rural   - LC - Letra de Câmbio   - NCC - Nota de Crédito Comercial   - NCE - Nota de Crédito Exportação   - NCI - Nota de Crédito Industrial   - NCR - Nota de Crédito Rural   - NP - Nota Promissória   - NPR - Nota Promissória Rural   - TM - Triplicata Mercantil   - TS - Triplicata de Serviço   - NS - Nota de Seguro   - RC - Recibo   - FAT - Fatura   - ND - Nota de Débito   - AP - Apólice de Seguro   - ME - Mensalidade Escolar   - PC - Pagamento de Consórcio   - NF - Nota Fiscal   - DD - Documento de Dívida   - BDP - Boleto Proposta   - OU - Outros |  |
|**dataEmissao** | **LocalDate** | Data de emissão do boleto. Formato: yyyy-MM-dd |  |
|**nossoNumero** | **Integer** | Número que identifica o boleto de cobrança no Sisbr. Caso deseje, o beneficiário poderá informar o nossoNumero. |  [optional] |
|**seuNumero** | **String** | Número identificador do boleto no sistema do beneficiário. &#x60;Tamanho máximo 18&#x60; |  |
|**identificacaoBoletoEmpresa** | **String** | Campo destinado para uso da empresa do beneficiário para identificação do boleto. &#x60;Tamanho máximo 25&#x60; |  [optional] |
|**identificacaoEmissaoBoleto** | **Integer** | Código de identificação de emissão do boleto. Informar os valores listados abaixo. - 1 Banco Emite - 2 Cliente Emite |  |
|**identificacaoDistribuicaoBoleto** | **Integer** | Código de identificação de distribuição do boleto. Informar os valores listados abaixo. - 1 Banco Distribui - 2 Cliente Distribui |  |
|**valor** | **Double** | Valor nominal do boleto. |  |
|**dataVencimento** | **LocalDate** | Data de vencimento do boleto.   Formato: yyyy-MM-dd  |  |
|**dataLimitePagamento** | **LocalDate** | Data de limite para pagamento do boleto. Formato: yyyy-MM-dd  |  [optional] |
|**valorAbatimento** | **Double** | Valor do abatimento a ser aplicado no boleto. |  [optional] |
|**tipoDesconto** | **Long** | Informar o tipo de desconto atribuido ao boleto.                   - 0 Sem Desconto                   - 1 Valor Fixo Até a Data Informada                   - 2 Percentual até a data informada                   - 3 Valor por antecipação dia corrido                   - 4 Valor por antecipação dia útil                   - 5 Percentual por antecipação dia corrido                   - 6 Percentual por antecipação dia útil |  |
|**dataPrimeiroDesconto** | **LocalDate** | Data do primeiro desconto. Deve ser informado caso o tipo de desconto seja diferente de 0. Formato: yyyy-MM-dd  |  [optional] |
|**valorPrimeiroDesconto** | **Double** | Valor do primeiro desconto. Deve ser informado caso a data do primeiro desconto seja preenchida. |  [optional] |
|**dataSegundoDesconto** | **LocalDate** | Data do segundo desconto. Formato: yyyy-MM-dd  |  [optional] |
|**valorSegundoDesconto** | **Double** | Valor do segundo desconto. Deve ser informado caso a data do segundo desconto seja preenchida. |  [optional] |
|**dataTerceiroDesconto** | **LocalDate** | Data do terceiro desconto. Formato: yyyy-MM-dd  |  [optional] |
|**valorTerceiroDesconto** | **Double** | Valor do terceiro desconto.Deve ser preenchido caso a data do terceiro desconto seja preenchida. |  [optional] |
|**tipoMulta** | **Integer** | Tipo de multa a ser aplicado no boleto. Informar os valores listados abaixo.   - 0 Isento   - 1 Valor Fixo   - 2 Percentual |  |
|**dataMulta** | **LocalDate** | Deve ser maior que a data de vencimento do boleto e menor ou igual que data limite de pagamento. Formato: yyyy-MM-dd |  [optional] |
|**valorMulta** | **Double** | Valor da multa. Deve ser preenchido caso o campo dataMulta seja preenchido. |  [optional] |
|**tipoJurosMora** | **Integer** | Tipo de juros de mora. Informar os valores listados abaixo.   - 1 Valor por dia   - 2 Taxa Mensal   - 3 Isento |  |
|**dataJurosMora** | **LocalDate** | Deve ser maior que a data de vencimento do boleto e menor ou igual que data limite de pagamento. Formato: yyyy-MM-dd |  [optional] |
|**valorJurosMora** | **Double** | Valor do juros de mora. Deve ser preenchido caso o campo dataJurosMora seja preenchido. |  [optional] |
|**numeroParcela** | **Long** | Número da parcela do boleto.Valor máximo permitido &#39;99&#39;. |  |
|**aceite** | **Boolean** | Identificador do aceite do boleto. |  [optional] |
|**codigoNegativacao** | **Integer** | Código de negativação do boleto. Informar os valores abaixo.   - 2 Negativar Dias Úteis   - 3 Não Negativar |  [optional] |
|**numeroDiasNegativacao** | **Integer** | Número de dias para negativação do boleto. Deve ser preenchido caso o campo codigoNegativacao seja igual a &#39;2&#39;. &#x60;Tamanho máximo 99&#x60; |  [optional] |
|**codigoProtesto** | **Integer** | Código de protesto do boleto. Informar os valores abaixo.   - 1 Protestar Dias Corridos   - 2 Protestar Dias Úteis   - 3 Não Protestar |  [optional] |
|**numeroDiasProtesto** | **Integer** | Número de dias para protesto do boleto. Deve ser preenchido caso o campo codigoProtesto seja &#39;1&#39;. &#x60;Tamanho máximo 99&#x60; |  [optional] |
|**pagador** | [**BoletoPagador**](BoletoPagador.md) |  |  |
|**beneficiarioFinal** | [**BoletosPost200ResponseResultadoBeneficiarioFinal**](BoletosPost200ResponseResultadoBeneficiarioFinal.md) |  |  [optional] |
|**mensagensInstrucao** | **List&lt;String&gt;** |  |  [optional] |
|**gerarPdf** | **Boolean** | Identificador para o sistema devolver ou não o PDF do Boleto. O PDF será retornado na Base64. |  [optional] |
|**rateioCreditos** | [**List&lt;RateioCredito&gt;**](RateioCredito.md) |  |  [optional] |
|**codigoCadastrarPIX** | **Integer** | Indicar uma das opções - 0 Padrão - 1 Com Pix - 2 Sem Pix |  [optional] |
|**numeroContratoCobranca** | **Long** | Indicar o id do contrato Cobranca |  [optional] |



