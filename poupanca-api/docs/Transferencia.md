

# Transferencia


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **String** | Data em que deve ser realizada a operação (yyyy-MM-dd) |  |
|**amount** | **BigDecimal** | Valor da operação |  |
|**debtorAccount** | [**TransferenciaDebtorAccount**](TransferenciaDebtorAccount.md) |  |  |
|**creditorAccount** | [**TransferenciaDebtorAccount**](TransferenciaDebtorAccount.md) |  |  |
|**idUsuario** | **String** | Usuário que realizou a operação |  |
|**idProduto** | **BigDecimal** | Identificador do Produto que efetuou a operação |  |
|**codCanal** | **Integer** | O identificador do canal cadastrado no CTR |  |
|**valor** | **BigDecimal** | Valor da operação |  |
|**dataLancamento** | **String** | Data em que deve ser realizada a operação |  |
|**numeroCooperativaMovimento** | **Integer** | Numero da cooperativa responsavel pela operacao |  |
|**numeroCooperativaDebito** | **Integer** | Numero da cooperativa da conta de débito |  |
|**numeroContaDebito** | **BigDecimal** | Número da conta onde será feito o débito |  |
|**numeroCooperativaCredito** | **Integer** | Numero da cooperativa da conta de crédito |  |
|**numeroContaCredito** | **BigDecimal** | Número da conta onde será feito o crédito |  |
|**nomeArquivoCNAB** | **String** | Nome do arquivo CNAB a ser repassado para o sistema de conta corrente |  [optional] |
|**autenticacao** | **String** | Código de autenticação registrado pelo canal |  [optional] |
|**observacaoLancamento** | **String** | Observação do lançamento |  [optional] |
|**descricaoObservacaoComplementar** | **String** | Observação complementar PLD |  [optional] |
|**numeroCpfCnpjRemetente** | **String** | Numero do CPF/CNPJ do remetente |  [optional] |
|**numeroCpfCnpjFavorecido** | **String** | Numero do CPF/CNPJ do favorecido |  [optional] |
|**descAutenticacaoDigital** | **String** | Hash identificador de transações |  [optional] |



