

# SolicRecCompleta

Dados criados ou alterados da solicitação da recorrência

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idSolicRec** | **String** | # Identificador da Solicitação da Recorrência  Regra de formação: - SCxxxxxxxxyyyyMMddkkkkkkkkkkk (29 caracteres; “case sensitive”, isso é, diferencia letras maiúsculas e minúsculas), sendo:   - SC - fixo (2 caracteres);   - xxxxxxxx – ISPB do agente que envia a mensagem pain.009 de solicitação de confirmação da recorrência;   - yyyyMMdd – data (8 caracteres) de criação da mensagem pain.009 de solicitação de confirmação da recorrência;   - kkkkkkkkkkk – sequencial criado pelo agente que gerou a mensagem de solicitação de confirmação da recorrência (11 caracteres alfanuméricos [a-z|A-Z|0-9]). Deve ser único dentro de cada “yyyyMMdd”.  |  |
|**idRec** | **String** | # Identificador da Recorrência  Regra de formação: - RAxxxxxxxxyyyyMMddkkkkkkkkkkk (29 caracteres; \&quot;case sensitive\&quot;, isso é, diferencia letras maiúsculas e minúsculas), sendo:   - \&quot;R\&quot;:  fixo (1 caractere). \&quot;R\&quot; para a recorrência criada dentro do Pix;   - \&quot;A\&quot;: identificação da possibilidade de novas tentativas, sendo possíveis os valores \&quot;R\&quot; ou \&quot;N\&quot; (1 caractere). \&quot;R\&quot; caso a recorrência permita novas tentativas de pagamento pós vencimento, ou \&quot;N\&quot; caso não permita novas tentativas.   - \&quot;xxxxxxxx\&quot;:  identificação do agente que presta serviço para o usuário recebedor que gerou o &lt;Id&gt;, podendo ser: o ISPB do participante direto, o ISPB do participante indireto ou os 8 primeiros dígitos do CNPJ do prestador de serviço de iniciação (8 caracteres numéricos [0-9]);   - \&quot;yyyyMMdd\&quot;:  data (8 caracteres) de criação da recorrência;   - \&quot;kkkkkkkkkkk\&quot;: sequencial criado pelo agente que gerou o &lt;Id&gt; (11 caracteres alfanuméricos [a-z|A-Z|0-9]). Deve ser único dentro de cada \&quot;yyyyMMdd\&quot;.  Dessa forma, o ID da recorrência deve ser formado de acordo com um dos tipos a seguir: - \&quot;RRxxxxxxxxyyyyMMddkkkkkkkkkkk\&quot;; para recorrência criada dentro do Pix e que permite novas tentativas de pagamento pós vencimento; ou - \&quot;RNxxxxxxxxyyyyMMddkkkkkkkkkkk\&quot;; para recorrência criada dentro do Pix e que não permite novas tentativas de pagamento pós vencimento.” |  |
|**calendario** | [**InformaEsDeCalendRioDaSolicitaODaRecorrNcia**](InformaEsDeCalendRioDaSolicitaODaRecorrNcia.md) |  |  |
|**destinatario** | [**DadosBancarios**](DadosBancarios.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**atualizacao** | [**List&lt;HistRicoDeStatusDaSolicitaODeRecorrNciaInner&gt;**](HistRicoDeStatusDaSolicitaODeRecorrNciaInner.md) |  |  |
|**recPayload** | [**RecorrenciaPayload**](RecorrenciaPayload.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CRIADA | &quot;CRIADA&quot; |
| ENVIADA | &quot;ENVIADA&quot; |
| RECEBIDA | &quot;RECEBIDA&quot; |
| REJEITADA | &quot;REJEITADA&quot; |
| ACEITA | &quot;ACEITA&quot; |
| EXPIRADA | &quot;EXPIRADA&quot; |
| CANCELADA | &quot;CANCELADA&quot; |



