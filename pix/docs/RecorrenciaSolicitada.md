

# RecorrenciaSolicitada

Atributos de Configuração de Recorrência

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recebedor** | [**DadosDoRecebedorDaRecorrNcia**](DadosDoRecebedorDaRecorrNcia.md) |  |  [optional] |
|**vinculo** | [**DescriODoObjetoDaRecorrNcia1**](DescriODoObjetoDaRecorrNcia1.md) |  |  |
|**calendario** | [**InformaEsSobreCalendRioDaRecorrNcia1**](InformaEsSobreCalendRioDaRecorrNcia1.md) |  |  |
|**valor** | [**RecorrenciaSolicitadaValor**](RecorrenciaSolicitadaValor.md) |  |  [optional] |
|**loc** | **Long** | Identificador da location a ser informada na criação de uma recorrência . |  [optional] |
|**politicaRetentativa** | [**PoliticaRetentativaEnum**](#PoliticaRetentativaEnum) |  |  |



## Enum: PoliticaRetentativaEnum

| Name | Value |
|---- | -----|
| NAO_PERMITE | &quot;NAO_PERMITE&quot; |
| PERMITE_3_R_7_D | &quot;PERMITE_3R_7D&quot; |



