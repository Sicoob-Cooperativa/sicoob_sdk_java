

# ParametrosConsultaCobrancaRecorrente

Parâmetros utilizados para a realização de uma consulta de cobrança recorrente.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inicio** | **OffsetDateTime** | Data inicial utilizada na consulta. Respeita RFC 3339. |  |
|**fim** | **OffsetDateTime** | Data de fim utilizada na consulta. Respeita RFC 3339. |  |
|**cpf** | **String** |  |  [optional] |
|**cnpj** | **String** |  |  [optional] |
|**status** | **String** | Filtro pelo status das recorrências. |  [optional] |
|**recebedor** | [**Recebedor**](Recebedor.md) |  |  [optional] |
|**paginacao** | [**Paginacao**](Paginacao.md) |  |  |



