

# BoletosSegundaViaGet200ResponseResultado


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numeroCliente** | **Integer** | Número que identifica o contrato do beneficiário. |  |
|**codigoModalidade** | **Integer** | Número que identifica a modalidade do boleto. - 1 - SIMPLES COM REGISTRO - 3 - CAUCIONADA - 4 - VINCULADA - 5 - CARNÊ DE PAGAMENTOS  - 8 - COBRANÇA CONTA CAPITAL |  |
|**codigoEspecieDocumento** | **String** | Espécie do documento   - CH - Cheque   - DM - Duplicata Mercantil   - DMI - Duplicata Mercantil Indicação   - DS - Duplicata de Serviço   - DSI - Duplicata Serviço Indicação   - DR - Duplicata Rural   - LC - Letra de Câmbio   - NCC - Nota de Crédito Comercial   - NCE - Nota de Crédito Exportação   - NCI - Nota de Crédito Industrial   - NCR - Nota de Crédito Rural   - NP - Nota Promissória   - NPR - Nota Promissória Rural   - TM - Triplicata Mercantil   - TS - Triplicata de Serviço   - NS - Nota de Seguro   - RC - Recibo   - FAT - Fatura   - ND - Nota de Débito   - AP - Apólice de Seguro   - ME - Mensalidade Escolar   - PC - Pagamento de Consórcio   - NF - Nota Fiscal   - DD - Documento de Dívida   - CC - Cartão de Crédito   - BDP - Boleto Proposta   - OU - Outros |  |
|**dataEmissao** | **LocalDate** | Data de emissão do boleto. Formato: yyyy-MM-dd  |  |
|**nossoNumero** | **Integer** | Número que identifica o boleto no Sisbr. |  |
|**seuNumero** | **String** | Informar o número que identifica o boleto no sistema do beneficiário. |  |
|**codigoBarras** | **String** | Número de código de barras do boleto com 44 posições. |  |
|**linhaDigitavel** | **String** | Número da linha digitável do boleto com 47 posições. |  |
|**valor** | **Double** | Valor nominal do boleto. |  |
|**dataVencimento** | **LocalDate** | Data de vencimento do boleto. Formato: yyyy-MM-dd  |  |
|**valorAbatimento** | **Double** | Valor do abatimento. |  |
|**numeroParcela** | **Long** | Número da parcela do boleto. |  |
|**aceite** | **Boolean** | Identificador do aceite do boleto. |  |
|**tipoMulta** | **Integer** | Tipo de Multa.   - 0 Isento   - 1 Valor Fixo   - 2 Percentual |  |
|**valorMulta** | **Double** | Valor da multa. |  [optional] |
|**tipoJurosMora** | **Integer** | Tipo de Juros de Mora - 1 Valor por dia - 2 Taxa Mensal - 3 Isento |  |
|**valorJurosMora** | **Double** | Valor do Juros de Mora. |  [optional] |
|**pagador** | [**BoletosGet200ResponseResultadoPagador**](BoletosGet200ResponseResultadoPagador.md) |  |  |
|**beneficiarioFinal** | [**BoletosGet200ResponseResultadoBeneficiarioFinal**](BoletosGet200ResponseResultadoBeneficiarioFinal.md) |  |  [optional] |
|**mensagensInstrucao** | **List&lt;String&gt;** |  |  [optional] |
|**pdfBoleto** | **String** | String na Base64 do PDF do Boleto. |  [optional] |
|**qrCode** | **String** | QRCode para pagamento com PIX |  [optional] |
|**numeroContratoCobranca** | **Long** | Indicar o id do contatroCobranca |  [optional] |
|**tipoDesconto** | **Long** | Informar o tipo de desconto a ser aplicado no boleto. - 0 Sem Desconto - 1 Valor Fixo Até a Data Informada - 2 Percentual até a data informada - 3 Valor por antecipação dia corrido - 4 Valor por antecipação dia útil - 5 Percentual por antecipação dia corrido - 6 Percentual por antecipação dia útil |  |



