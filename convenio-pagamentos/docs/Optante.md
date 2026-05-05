

# Optante


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**convenio** | **String** | Identificador do convênio. |  |
|**identificadorClienteEmpresa** | **String** | Identificador do cliente na empresa. |  |
|**identificadorClienteBanco** | **String** | Identificador do cliente, pelo Banco, para efetuar o débito. Informar o número de conta corrente do parceiro no Sicoob. |  |
|**dataOpcao** | **Integer** | &#39;Data da opção/exclusão. Utilizar padrão: yyyyMMdd.&#39; |  |
|**codigoMovimento** | [**CodigoMovimentoEnum**](#CodigoMovimentoEnum) | Código movimento:  * &#x60;1&#x60; - Exclusão de optante pelo débito automático.  * &#x60;2&#x60; - Inclusão de optante pelo débito automático.  |  |



## Enum: CodigoMovimentoEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



