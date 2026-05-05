

# PagamentoIniciadoQRCodeBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**qrcode** | **String** | Código QRCode |  |
|**codMun** | **String** | Código baseado na Tabela de Códigos de Municípios do __[IBGE](https://www.ibge.gov.br/explica/codigos-dos-municipios.php)__ que apresenta a lista dos municípios brasileiros associados a um código composto de 7 dígitos, sendo os dois primeiros referentes ao código da Unidade da Federação.  |  [optional] |
|**repeticao** | **Boolean** | Flag para indicar pagamento repetido |  |
|**dataVencimento** | **String** | Data de vencimento do QRCode |  [optional] |
|**dataAgendamento** | **String** | Data de pagamento pretendida |  [optional] |
|**valor** | **String** | Valor original do pagamento. Atua como validador para QR Codes de valor fixo. Para QR Codes sem valor pré-definido, define o montante a ser processado no pagamento. Será utilizado apenas para validar com a decodificação do QR Code, caso seja um estático e sem valor, ele será usado para pagar esse tipo de QR Code.  |  |
|**pagarComJurosMulta** | **Boolean** | Define a indicência de encargos moratórios. Se marcado como \&quot;true\&quot;, o pagamento será atualizado com os valores de multa e juros acumulados até a data da transação. |  |
|**origem** | [**DadosDoPagador**](DadosDoPagador.md) |  |  |
|**destino** | [**DadosDoDestinatRio**](DadosDoDestinatRio.md) |  |  |



