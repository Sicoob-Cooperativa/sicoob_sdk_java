

# CobPayloadValor

Todos os campos que indicam valores monetários obedecem ao pattern \\d{1,10}\\.\\d{2}. O separador decimal é o caractere ponto. Não é aplicável utilizar separador de milhar. Exemplos de valores aderentes ao padrão: “1.00”, “123.99”, “123456789.23

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**original** | **String** | Valor original da cobrança. |  |
|**modalidadeAlteracao** | **Integer** | Trata-se de um campo que determina se o valor final do documento pode ser alterado pelo pagador. Na ausência desse campo, assume-se que não se pode alterar o valor do documento de cobrança, ou seja, assume-se o valor 0. Se o campo estiver presente e com valor 1, então está determinado que o valor final da cobrança pode ter seu valor alterado pelo pagador. |  [optional] |
|**retirada** | [**InformaEsDeRetirada1**](InformaEsDeRetirada1.md) |  |  [optional] |



