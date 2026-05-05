

# PaymentTransactionCreditorAccount

Objeto com os dados da Conta do Creditor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ispb** | **String** | Numero do ISPB. |  |
|**issuer** | **BigDecimal** | Numero da agência. |  |
|**number** | **String** | Numero da conta. |  |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Identifica o tito da conta como CACC(Conta-Corrente), SLRY(Conta-Salario), SVGS(Conta-Poupanca) e TRAN(Conta-Pagamento) |  |
|**personType** | [**PersonTypeEnum**](#PersonTypeEnum) | Identifica o tipo da pessoa Fisica(NATURAL_PERSON) ou Juridica(LEGAL_PERSON). |  |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CACC | &quot;CACC&quot; |
| SLRY | &quot;SLRY&quot; |
| SVGS | &quot;SVGS&quot; |
| TRAN | &quot;TRAN&quot; |



## Enum: PersonTypeEnum

| Name | Value |
|---- | -----|
| NATURAL_PERSON | &quot;NATURAL_PERSON&quot; |
| LEGAL_PERSON | &quot;LEGAL_PERSON&quot; |



