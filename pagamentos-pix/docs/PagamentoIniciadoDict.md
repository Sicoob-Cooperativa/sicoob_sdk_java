

# PagamentoIniciadoDict


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endToEndId** | **String** | EndToEndIdentification que transita na PACS002, PACS004 e PACS008 |  [optional] |
|**chave** | **String** | Chave de endereçamento para a conta transacional. (Identificador da conta transacional) |  [optional] |
|**tipo** | [**TipoEnum**](#TipoEnum) | Tipo da chave:   - &#x60;CPF&#x60; - Identificador de pessoa física   - &#x60;CNPJ&#x60; - Identificado de pessoa jurídica   - &#x60;EMAIL&#x60; - Email   - &#x60;TELEFONE&#x60; - Número de telefone no padrão internacional (&#39;+&#39; +  Código do País + DDD + Telefone) | *Exemplo: +5561999999999*   - &#x60;EVP&#x60; - Token gerado pelo BACEN no formato UUID v4 |  [optional] |
|**proprietario** | [**PagamentoIniciadoDictProprietario**](PagamentoIniciadoDictProprietario.md) |  |  [optional] |



## Enum: TipoEnum

| Name | Value |
|---- | -----|
| CPF | &quot;CPF&quot; |
| CNPJ | &quot;CNPJ&quot; |
| EMAIL | &quot;EMAIL&quot; |
| TELEFONE | &quot;TELEFONE&quot; |
| EVP | &quot;EVP&quot; |



