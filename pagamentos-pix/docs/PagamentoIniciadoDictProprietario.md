

# PagamentoIniciadoDictProprietario


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identificador** | **String** | O identificador deve ser preenchido com o CPF ou o CNPJ a quem o proprietário se refere.     - &#x60;CPF&#x60; - Em caso de Pessoa Física preencher com o CPF     - &#x60;CNPJ&#x60; - Em caso de Pessoa Jurídica preencher com o CNPJ |  |
|**nome** | **String** | Nome da pessoa ou empresa a quem a proposta se refere. |  |
|**tipo** | [**TipoEnum**](#TipoEnum) | O tipo de proprietário pode ser de 2 tipos:   - &#x60;FISICO&#x60; - Pessoa física (CPF)   - &#x60;JURIDICO&#x60; - Pessoa Jurídica (CNPJ) |  [optional] |



## Enum: TipoEnum

| Name | Value |
|---- | -----|
| FISICO | &quot;FISICO&quot; |
| JURIDICO | &quot;JURIDICO&quot; |



