

# Webhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idWebhook** | **Long** | Identificador único do webhook |  |
|**url** | **String** | URL do webhook. A URL deve ser https. |  |
|**email** | **String** | E-mail associado ao webhook |  [optional] |
|**codigoTipoMovimento** | **Integer** | Código do tipo de movimento do webhook.         7 - Pagamento (Baixa operacional)  |  |
|**descricaoTipoMovimento** | **String** | Descrição do tipo de movimento |  |
|**codigoPeriodoMovimento** | **Integer** | Código do período de movimento - 1 - Movimento atual (D0)  |  |
|**descricaoPeriodoMovimento** | **String** | Descrição do período de movimento |  |
|**codigoSituacao** | **Integer** | Código da situação do webhook - 1 - Aguardando validação - 2 - Validado com sucesso - 3 - Inativo  |  |
|**descricaoSituacao** | **String** | Descrição da situação |  |
|**dataHoraCadastro** | **OffsetDateTime** | Data e hora de cadastro Formato: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
|**dataHoraUltimaAlteracao** | **OffsetDateTime** | Data e hora da última alteração Formato: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
|**dataHoraInativacao** | **OffsetDateTime** | Data e hora de inativação Formato: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
|**descricaoMotivoInativacao** | **String** | Descrição do motivo de inativação |  [optional] |



