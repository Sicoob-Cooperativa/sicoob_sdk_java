

# BoletoConsulta


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numeroInstituicaoEmissora** | **BigDecimal** | Número da instituição financeira emissora do boleto. |  |
|**nomeInstituicaoEmissora** | **String** | Nome da instituição financeira emissora do boleto. |  |
|**tipoPessoaBeneficiario** | **String** | Tipo de pessoa beneficiário. F-Pessoa Física e J-Pessoa Jurídica. |  [optional] |
|**numeroCpfCnpjBeneficiario** | **String** | Número do CPF/CNPJ do beneficiário. |  [optional] |
|**nomeRazaoSocialBeneficiario** | **String** | Nome Razão Social do beneficiário. |  [optional] |
|**nomeFantasiaBeneficiario** | **String** | Nome Fantasia do beneficiário. |  [optional] |
|**tipoPessoaBeneficiarioFinal** | **String** | Tipo de pessoa do beneficiário final (antigo sacador avalista). 0-Isento / Não Informado, 1-CPF, 2-CNPJ, 3-PIS/PASEP, 9-Outros, F-Pessoa Física e  J-Pessoa Jurídica. |  [optional] |
|**numeroCpfCnpjBeneficiarioFinal** | **String** | Número do CPF/CNPJ do beneficiário final (antigo sacador avalista). |  [optional] |
|**nomeRazaoSocialBeneficiarioFinal** | **String** | Nome/Razão Social do beneficiário final (antigo sacador avalista). |  [optional] |
|**nomeFantasiaBeneficiarioFinal** | **String** | Nome Fantasia do beneficiário final (antigo sacador avalista). |  [optional] |
|**tipoPessoaPagador** | **String** | Tipo de pessoa do pagador. F-Pessoa Física e J-Pessoa Jurídica. |  [optional] |
|**numeroCpfCnpjPagador** | **String** | Número do CPF/CNPJ do pagador. |  [optional] |
|**nomeRazaoSocialPagador** | **String** | Razão Social do Pagador. |  [optional] |
|**nomeFantasiaPagador** | **String** | Nome Fantasia do pagador. |  [optional] |
|**codigoBarras** | **String** | Número de código de barras do boleto com 44 posições. |  |
|**numeroLinhaDigitavel** | **String** | Número da linha digitável do boleto com 47 posições. |  |
|**dataVencimentoBoleto** | **LocalDate** | Data de vencimento do Boleto. Formato: yyyy-MM-dd  |  |
|**dataLimitePagamentoBoleto** | **LocalDate** | Data limite para pagamento do Boleto. Formato: yyyy-MM-dd  |  [optional] |
|**valorBoleto** | **Double** | Valor nominal do Boleto. |  |
|**valorAbatimentoDesconto** | **Double** | Valor de abatimento e de desconto do boleto. |  |
|**valorMultaMora** | **Double** | Valor da multa e de juros/mora. |  |
|**valorPagamento** | **Double** | Valor do pagamento. |  |
|**dataPagamento** | **LocalDate** | Data do pagamento. Exemplo: 2022-07-30  |  |
|**permiteAlterarValor** | **Boolean** | Identificador que determina se o usuário permite efetivar o pagamento caso o valor do boleto seja alterado pelo beneficiário. |  |
|**consultaEmContingencia** | **Boolean** | Indica se a consulta está em modo de contingência, operando sem comunicação com a Núclea. |  |
|**codigoEspecieDocumento** | **BigDecimal** | Código espécie do documento ( 1  &#x3D;  CH Cheque 2  &#x3D;  DM Duplicata Mercantil 3  &#x3D;  DMI Duplicata Mercantil p/ Indicação 4  &#x3D;  DS Duplicata de Serviço 5  &#x3D;  DSI Duplicata de Serviço p/ Indicação 6  &#x3D;  DR Duplicata Rural 7  &#x3D;  LC Letra de Câmbio 8  &#x3D;  NCC Nota de Crédito Comercial 9  &#x3D;  NCE Nota de Crédito a Exportação 10  &#x3D;  NCI Nota de Crédito Industrial 11  &#x3D;  NCR Nota de Crédito Rural 12  &#x3D;  NP Nota Promissória 13  &#x3D;  NPR Nota Promissória Rural 14  &#x3D;  TM Triplicata Mercantil 15  &#x3D;  TS Triplicata de Serviço 16  &#x3D;  NS Nota de Seguro 17  &#x3D;  RC Recibo 18  &#x3D;  FAT Fatura 19  &#x3D;  ND Nota de Débito 20  &#x3D;  AP Apólice de Seguro 21  &#x3D;  ME Mensalidade Escolar 22  &#x3D;  PC Parcela de Consórcio 23  &#x3D;  NF Nota Fiscal 24  &#x3D;  DD Documento de Dívida 25  &#x3D;  Cédula de Produto RuralC015 26  &#x3D;  Warrant 27  &#x3D;  Dívida Ativa de Estado 28  &#x3D;  Dívida Ativa de Município 29  &#x3D;  Dívida Ativa da União 30  &#x3D;  Encargos condominiais 31  &#x3D;  CC Cartão de Crédito 32  &#x3D;  BDP –Boleto de Proposta 99  &#x3D;  Outros) |  [optional] |
|**codigoSituacaoBoletoPagamento** | **String** | Código da situação de pagamento do boleto. (01-Boleto já baixado, 02-Boleto bloqueado para pagamento, 03-Boleto encontrado e cliente beneficiário inapto na instituição emissora do título, 04-Boleto encontrado na base e cliente Beneficiário sem cadastro, 05-Boleto encontrado e cliente beneficiário em análise na instituição emissora do título, 06-Boleto excedeu o limite de pagamentos parciais, 07-Baixa operacional integral já registrada, 08-Baixa operacional já registrada para título que não permite pagamento parcial, 09-Boleto excedeu o valor de saldo para pagamento parcial para o tipo de modelo de cálculo 04, 10-Boleto encontrado e cliente beneficiário inapto em instituição diferente da emissora, 11-Boleto encontrado e cliente beneficiário em análise em instituição diferente da emissora e 12-Boleto encontrado e cliente beneficiário apto). |  [optional] |
|**nossoNumero** | **String** | Número identificador do boleto. |  [optional] |
|**numeroDocumento** | **String** | Número identificador do boleto no sistema do beneficiário. |  [optional] |
|**identificadorConsulta** | **String** | Identificador da consulta do boleto, deverá ser enviado no serviço de pagamento (/pagamentos/{codigoBarras}/pagar). |  [optional] |
|**descricaoInstrucaoDesconto1** | **String** | Instruções para desconto 1. |  [optional] |
|**descricaoInstrucaoDesconto2** | **String** | Instruções para desconto 2. |  [optional] |
|**descricaoInstrucaoDesconto3** | **String** | Instruções para desconto 3. |  [optional] |
|**descricaoInstrucaoValorMinMax** | **String** | Instruções para valores mínimo e máximo |  |
|**bloquearPagamento** | **Boolean** | Identificador de pagamento não permitido. Se verdadeiro não submeter o pagamento do boleto. |  |
|**mensagemBloqueioPagamento** | **String** | Mensagem referente ao motivo pelo qual deve-se bloquer o pagamento. |  [optional] |



