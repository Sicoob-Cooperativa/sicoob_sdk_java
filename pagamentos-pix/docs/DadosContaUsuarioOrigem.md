

# DadosContaUsuarioOrigem

Dados da conta de origem do lancamento. Este atributo é opcional, e aso os dados da conta de origem não sejam informados, será considerado os dados cadastrados no certificado de autenticação

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ispb** | **String** | Código ISPB da IF |  [optional] |
|**cpfCnpj** | **String** | CPF / CNPJ |  [optional] |
|**nome** | **String** | Nome / Razao social |  [optional] |
|**conta** | **String** | Número da conta |  [optional] |
|**agencia** | **String** | Número da agencia |  [optional] |
|**tipo** | [**TipoEnum**](#TipoEnum) | Tipo da Conta |  [optional] |
|**chaveDict** | **String** | Chave cadastrada no DICT do Bacen |  [optional] |



## Enum: TipoEnum

| Name | Value |
|---- | -----|
| CORRENTE | &quot;CORRENTE&quot; |
| POUPANCA | &quot;POUPANCA&quot; |
| SALARIO | &quot;SALARIO&quot; |
| CONTAPAGAMENTO | &quot;CONTAPAGAMENTO&quot; |



