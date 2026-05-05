

# DadosContaUsuarioDestino

Dados da conta de destino do lancamento. Este atributo é obrigatório apenas para o meio de iniciação MANUAL. Quando o meio de iniciação for CHAVE, os atributos deste objeto, se forem informados, serão validados com o retorno obtido na iniciação DICT (POST /pagamentos)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ispb** | **String** | Código ISPB da IF |  [optional] |
|**cpfCnpj** | **String** | CPF / CNPJ |  [optional] |
|**nome** | **String** | Nome / Razao social |  [optional] |
|**conta** | **String** | Número da conta |  [optional] |
|**agencia** | **String** | Número da agencia |  [optional] |
|**tipo** | [**TipoEnum**](#TipoEnum) | Tipo da Conta |  [optional] |
|**boolFavorecido** | **Boolean** | Indica se o destinatário é favorecido ou não. Se o campo não for passado o padrão será &#x60;false&#x60; |  [optional] |



## Enum: TipoEnum

| Name | Value |
|---- | -----|
| CORRENTE | &quot;CORRENTE&quot; |
| POUPANCA | &quot;POUPANCA&quot; |
| SALARIO | &quot;SALARIO&quot; |
| CONTAPAGAMENTO | &quot;CONTAPAGAMENTO&quot; |



