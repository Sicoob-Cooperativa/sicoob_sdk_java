

# BoletoAlteracaoDesconto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tipoDesconto** | **Long** | Informar o tipo de desconto atribuido ao boleto.   - 0 Sem Desconto   - 1 Valor Fixo Até a Data Informada   - 2 Percentual até a data informada   - 3 Valor por antecipação dia corrido   - 4 Valor por antecipação dia útil   - 5 Percentual por antecipação dia corrido   - 6 Percentual por antecipação dia útil |  |
|**dataPrimeiroDesconto** | **LocalDate** | Data do primeiro desconto. |  [optional] |
|**valorPrimeiroDesconto** | **Double** | Valor do primeiro desconto. |  [optional] |
|**dataSegundoDesconto** | **LocalDate** | Data do segundo desconto. |  [optional] |
|**valorSegundoDesconto** | **Double** | Valor do segundo desconto. |  [optional] |
|**dataTerceiroDesconto** | **LocalDate** | Data do terceiro desconto. |  [optional] |
|**valorTerceiroDesconto** | **Double** | Valor do terceiro desconto. |  [optional] |



