

# BoletosGet200ResponseResultado


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numeroCliente** | **Integer** | Número que identifica o contrato do beneficiário. |  |
|**codigoModalidade** | **Integer** | Número que identifica a modalidade do boleto. - 1 - SIMPLES COM REGISTRO - 3 - CAUCIONADA - 4 - VINCULADA - 5 - CARNÊ DE PAGAMENTOS  - 8 - COBRANÇA CONTA CAPITAL |  |
|**numeroContaCorrente** | **Integer** | Número da Conta Corrente para crédito do boleto. |  [optional] |
|**codigoEspecieDocumento** | **String** | Espécie do documento   - CH - Cheque   - DM - Duplicata Mercantil   - DMI - Duplicata Mercantil Indicação   - DS - Duplicata de Serviço   - DSI - Duplicata Serviço Indicação   - DR - Duplicata Rural   - LC - Letra de Câmbio   - NCC - Nota de Crédito Comercial   - NCE - Nota de Crédito Exportação   - NCI - Nota de Crédito Industrial   - NCR - Nota de Crédito Rural   - NP - Nota Promissória   - NPR - Nota Promissória Rural   - TM - Triplicata Mercantil   - TS - Triplicata de Serviço   - NS - Nota de Seguro   - RC - Recibo   - FAT - Fatura   - ND - Nota de Débito   - AP - Apólice de Seguro   - ME - Mensalidade Escolar   - PC - Pagamento de Consórcio   - NF - Nota Fiscal   - DD - Documento de Dívida   - CC - Cartão de Crédito   - BDP - Boleto Proposta   - OU - Outros |  |
|**dataEmissao** | **LocalDate** | Data de emissão do boleto Formato: yyyy-MM-dd  |  |
|**nossoNumero** | **Integer** | Número que identifica o boleto. |  |
|**seuNumero** | **String** | Informar o número que identifica o boleto no sistema do beneficiário. &#x60;Tamanho máximo 18&#x60; |  |
|**identificacaoBoletoEmpresa** | **String** | Destinado para uso da Empresa Cedente para identificação do Boleto |  |
|**codigoBarras** | **String** | Número de código de barras do boleto com 44 posições. |  |
|**linhaDigitavel** | **String** | Número da linha digitável do boleto com 47 posições. |  |
|**identificacaoEmissaoBoleto** | **Integer** | Identificação de Emissão do Boleto   - 1 Banco Emite   - 2 Cliente Emite |  [optional] |
|**identificacaoDistribuicaoBoleto** | **Integer** | Identificação de Distribuição do Boleto   - 1 Banco Distribui   - 2 Cliente Distribui |  [optional] |
|**valor** | **Double** | Valor nominal do boleto. |  |
|**dataVencimento** | **LocalDate** | Data de vencimento do boleto. Formato: yyyy-MM-dd  |  |
|**dataLimitePagamento** | **LocalDate** | Data de limite para pagamento do boleto. Formato: yyyy-MM-dd  |  [optional] |
|**valorAbatimento** | **Double** | Valor do abatimento. |  |
|**tipoDesconto** | **Long** | Informar o tipo de desconto atribuido ao boleto.     - 0 Sem Desconto     - 1 Valor Fixo Até a Data Informada     - 2 Percentual até a data informada     - 3 Valor por antecipação dia corrido     - 4 Valor por antecipação dia útil     - 5 Percentual por antecipação dia corrido     - 6 Percentual por antecipação dia útil |  |
|**dataPrimeiroDesconto** | **LocalDate** | Data do primeiro desconto. Formato: yyyy-MM-dd  |  [optional] |
|**valorPrimeiroDesconto** | **Double** | Valor do primeiro desconto |  [optional] |
|**dataSegundoDesconto** | **LocalDate** | Data do segundo desconto Formato: yyyy-MM-dd  |  [optional] |
|**valorSegundoDesconto** | **Double** | Valor do segundo desconto |  [optional] |
|**dataTerceiroDesconto** | **LocalDate** | Data do terceiro desconto Formato: yyyy-MM-dd  |  [optional] |
|**valorTerceiroDesconto** | **Double** | Valor do terceiro desconto |  [optional] |
|**tipoMulta** | **Integer** | Tipo de Multa   - 0 Isento   - 1 Valor Fixo   - 2 Percentual |  |
|**dataMulta** | **LocalDate** | Deve ser maior que a data de vencimento do boleto e menor ou igual que data limite de pagamento. Formato: yyyy-MM-dd |  [optional] |
|**valorMulta** | **Double** | Valor da multa. |  |
|**tipoJurosMora** | **Integer** | Tipo de Juros de Mora - 1 Valor por dia - 2 Taxa Mensal - 3 Isento |  |
|**dataJurosMora** | **LocalDate** | Deve ser maior que a data de vencimento do boleto e menor ou igual que data limite de pagamento. Formato: yyyy-MM-dd |  [optional] |
|**valorJurosMora** | **Double** | Valor do Juros de Mora. |  |
|**numeroParcela** | **Long** | Número da parcela. |  |
|**aceite** | **Boolean** | Identificador do aceite do boleto. |  |
|**numeroDiasNegativacao** | **Integer** | Número de Dias para Negativação do Boleto |  [optional] |
|**numeroDiasProtesto** | **Integer** | Número de Dias para Protesto do Boleto |  [optional] |
|**quantidadeDiasFloat** | **Integer** | Quantidade de Dias de Float. |  |
|**pagador** | [**BoletosGet200ResponseResultadoPagador**](BoletosGet200ResponseResultadoPagador.md) |  |  |
|**beneficiarioFinal** | [**BoletosGet200ResponseResultadoBeneficiarioFinal**](BoletosGet200ResponseResultadoBeneficiarioFinal.md) |  |  [optional] |
|**mensagensInstrucao** | **List&lt;String&gt;** |  |  [optional] |
|**listaHistorico** | [**List&lt;BoletosGet200ResponseResultadoListaHistoricoInner&gt;**](BoletosGet200ResponseResultadoListaHistoricoInner.md) |  |  [optional] |
|**situacaoBoleto** | **String** | Descreve a Situação atual do Boleto   - Em Aberto   - Baixado   - Liquidado |  |
|**rateioCreditos** | [**List&lt;RateioCredito&gt;**](RateioCredito.md) |  |  [optional] |
|**qrCode** | **String** | QRCode para pagamento com PIX |  [optional] |
|**numeroContratoCobranca** | **Long** | Indicar o id do contatroCobranca |  [optional] |



