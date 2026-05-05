

# ParametrosConsultaRecorrencia

Parâmetros utilizados para a realização de uma consulta de recorrências.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inicio** | **OffsetDateTime** | Data inicial utilizada na consulta. Respeita RFC 3339. |  [optional] |
|**fim** | **OffsetDateTime** | Data de fim utilizada na consulta. Respeita RFC 3339. |  [optional] |
|**cpf** | **String** |  |  [optional] |
|**cnpj** | **String** |  |  [optional] |
|**locationPresente** | **Boolean** | Filtro pela existência de location vinculada. |  [optional] |
|**status** | **String** | Filtro pelo status das recorrências. |  [optional] |
|**recebedor** | [**Recebedor**](Recebedor.md) |  |  [optional] |
|**paginacao** | [**Paginacao**](Paginacao.md) |  |  |



