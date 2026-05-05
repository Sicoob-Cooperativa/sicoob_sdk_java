

# ParametrosConsultaPayloadLocation

Parâmetros utilizados para a realização de uma consulta de locations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inicio** | **OffsetDateTime** | Data inicial utilizada na consulta. Respeita RFC 3339. |  |
|**fim** | **OffsetDateTime** | Data de fim utilizada na consulta. Respeita RFC 3339. |  |
|**txIdPresente** | **Boolean** | Filtro pela existência de txid. |  [optional] |
|**tipoCob** | [**TipoCobEnum**](#TipoCobEnum) |  |  [optional] |
|**paginacao** | [**Paginacao**](Paginacao.md) |  |  |



## Enum: TipoCobEnum

| Name | Value |
|---- | -----|
| COB | &quot;cob&quot; |
| COBV | &quot;cobv&quot; |



