

# BoletoPagamento


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificadorConsulta** | **String** | Identificador da consulta do boleto, deverá ser enviado no serviço de pagamento/agendamento. |  |
|**valorBoleto** | **Double** | Valor nominal do Boleto. |  |
|**valorDescontoAbatimento** | **Double** | Valor de desconto/abatimento do pagamento do Boleto. |  |
|**valorMultaMora** | **Double** | Valor de mora/multa do pagamento do Boleto. |  |
|**descricaoObservacao** | **String** | Descrição da observação informada no pagamento. |  [optional] |
|**aceitaValorDivergente** | **Boolean** | Entre o agendamento e o pagamento, o boleto poderá sofrer alterações pelo benificiário. Autoriza o pagamento com o valor divergente do agendado? |  |
|**numeroCpfCnpjPortador** | **String** | Número do CPF/CNPJ do portador, responsável pelo pagamento. |  |
|**nomePortador** | **String** | Nome do portador, responsável pelo pagamento. |  |
|**amount** | **Double** | Valor de pagamento do Boleto. |  |
|**date** | **LocalDate** | Data do pagamento do boleto. Se não for informada o pagamento será para data atual. Formato: yyyy-MM-dd  |  |
|**debtorAccount** | [**DebtorAccount**](DebtorAccount.md) |  |  |



