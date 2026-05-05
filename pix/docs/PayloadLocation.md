

# PayloadLocation

Identificador da localização do payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | Identificador da location a ser informada na criação da cobrança . |  [readonly] |
|**location** | **URI** | Localização do Payload a ser informada na criação da cobrança. |  [readonly] |
|**tipoCob** | [**TipoCobEnum**](#TipoCobEnum) |  |  |
|**criacao** | **OffsetDateTime** | Data e hora em que a location foi criada. Respeita RFC 3339. |  [readonly] |
|**brcode** | **String** | QRcode no formato EMV, especificado pelo padrão adotado pelo BACEN denominado de &#x60;BR Code&#x60;. |  |



## Enum: TipoCobEnum

| Name | Value |
|---- | -----|
| COB | &quot;cob&quot; |
| COBV | &quot;cobv&quot; |



