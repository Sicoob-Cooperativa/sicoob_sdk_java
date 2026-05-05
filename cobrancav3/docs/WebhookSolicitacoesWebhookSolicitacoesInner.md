

# WebhookSolicitacoesWebhookSolicitacoesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codigoWebhookSituacao** | **Integer** | Código da situação do webhook - 1 - Aguardando validação - 2 - Validado com sucesso - 3 - Inativo  |  |
|**descricaoWebhookSituacao** | **String** | Descrição da situação do webhook |  |
|**codigoSolicitacaoSituacao** | **Integer** | Código da situação da solicitação do webhook.   - 2 - Aguardando envio   - 3 - Enviado com sucesso   - 6 - Erro no envio  |  |
|**descricaoSolicitacaoSituacao** | **String** | Descrição da situação da solicitação |  |
|**codigoTipoMovimento** | **Integer** | Código do tipo de movimento do webhook.   7 - Pagamento (Baixa operacional)  |  |
|**descricaoTipoMovimento** | **String** | Descrição do tipo de movimento |  |
|**codigoPeriodoMovimento** | **Integer** | Código do período de movimento - 1 - Movimento atual (D0)  |  |
|**descricaoPeriodoMovimento** | **String** | Descrição do período de movimento |  |
|**descricaoErroProcessamento** | **String** | Descrição do erro de processamento da solicitação |  [optional] |
|**dataHoraCadastro** | **OffsetDateTime** | Data e hora de cadastro Formato: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
|**validacaoWebhook** | **Boolean** | Indica se a solicitação é uma validação da url webhook |  |
|**nossoNumero** | **Long** | Número que identifica o boleto de cobrança no Sisbr. |  [optional] |
|**codigoBarras** | **String** | Número de código de barras do boleto com 44 posições. |  [optional] |
|**webhookNotificacoes** | [**List&lt;WebhookSolicitacoesWebhookSolicitacoesInnerWebhookNotificacoesInner&gt;**](WebhookSolicitacoesWebhookSolicitacoesInnerWebhookNotificacoesInner.md) |  |  [optional] |



