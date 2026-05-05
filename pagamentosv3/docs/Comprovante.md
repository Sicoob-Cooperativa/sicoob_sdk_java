

# Comprovante


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numeroAgencia** | **String** | Número da agência onde o pagamento foi realizado. |  [optional] |
|**nomeAgencia** | **String** | Nome da agência onde o pagamento foi realizado. |  |
|**numeroConta** | **Long** | Número da Conta onde será realizado o débito para o pagamento. |  [optional] |
|**nomeProprietarioContaCorrente** | **String** | Nome do propietário da conta onde o pagamento foi ou será debitado. |  [optional] |
|**numeroLinhaDigitavel** | **String** | Número da linha digitável do boleto formatado com 47 posições e 54 caracteres. |  |
|**numeroInstituicaoEmissora** | **BigDecimal** | Número da instituição financeira emissora do boleto. |  |
|**nomeInstituicaoEmissora** | **String** | Nome da instituição financeira emissora do boleto. |  |
|**numeroCpfCnpjBeneficiario** | **String** | Número do CPF/CNPJ do beneficiário do boleto. |  [optional] |
|**nomeRazaoSocialBeneficiario** | **String** | Nome Razão Social do beneficiário do boleto. |  [optional] |
|**nomeFantasiaBeneficiario** | **String** | Nome Fantasia do beneficiário do boleto. |  [optional] |
|**numeroCpfCnpjBeneficiarioFinal** | **String** | Número do CPF/CNPJ do beneficiário final (antigo sacador avalista) do boleto. |  [optional] |
|**nomeRazaoSocialBeneficiarioFinal** | **String** | Nome Razão Social do beneficiário final (antigo sacador avalista) do boleto. |  [optional] |
|**nomeFantasiaBeneficiarioFinal** | **String** | Nome Fantasia do beneficiário final (antigo sacador avalista) do boleto. |  [optional] |
|**numeroCpfCnpjPagador** | **String** | Número do CPF/CNPJ do pagador do boleto. |  [optional] |
|**nomeRazaoSocialPagador** | **String** | Razão Social do Pagador do boleto |  [optional] |
|**nomeFantasiaPagador** | **String** | Nome Fantasia do pagador do boleto. |  [optional] |
|**dataVencimento** | **LocalDate** | Data de vencimento do boleto. Formato: yyyy-MM-dd  |  |
|**valorBoleto** | **Double** | Valor nominal do boleto. |  |
|**valorAbatimentoDesconto** | **Double** | Valor de abatimento e de desconto do boleto |  |
|**valorMultaMora** | **Double** | Valor da multa e de juros/mora do boleto. |  |
|**valorPagamento** | **Double** | Valor do pagamento do boleto. |  |
|**dataPagamento** | **LocalDate** | Data da efetivação do pagamento. Formato: yyyy-MM-dd  |  |
|**situacaoPagamento** | **String** | Situação do pagamento do boleto.  - Rejeitado - Agendado - Efetivado - Cancelado  |  |
|**descricaoDetalheSituacao** | **String** | Descrição detalhada da situação do pagamento. |  |
|**dataHoraCadastro** | **OffsetDateTime** | Data e hora de cadastro do agendamento/pagamento. Formato: yyyy-MM-ddTHH:mm:ss.SSSZ (Conforme especificação RFC-3339 com uso de timezone UTC)  |  |
|**aceitaValorDivergente** | **Boolean** | Entre o agendamento e o pagamento, o boleto poderá sofrer alterações pelo benificiário. Autoriza o pagamento com o valor divergente do agendado? |  |
|**nossoNumero** | **String** | Número identificador do boleto. |  [optional] |
|**numeroDocumento** | **String** | Número identificador do boleto no sistema do beneficiário. |  [optional] |
|**descricaoObservacao** | **String** | Descrição da observação informada no pagamento. |  [optional] |
|**descricaoOuvidoria** | **String** | Descrição das informações da ouvidoria do Sicoob. |  |
|**descricaoTituloComprovante** | **String** | Descreve o boleto que deve ser utilizado no comprovante.  - AGENDAMENTO DE BOLETO - PAGAMENTO DE BOLETO - PAGAMENTO REJEITADO - PAGAMENTO CANCELADO - AGENDAMENTO DE BOLETO VLB - PAGAMENTO DE BOLETO VLB - PAGAMENTO VLB REJEITADO - PAGAMENTO VLB CANCELADO  |  |
|**idPagamento** | **Long** | Número de identificação do agendamento no SISBR. |  |
|**numeroAutenticacaoPagamento** | **String** | Identificador único de autenticação do pagamento no SISBR. |  [optional] |



