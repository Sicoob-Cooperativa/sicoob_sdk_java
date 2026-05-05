

# RecorrenciaGerada

Atributos de Configuração de Recorrência

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vinculo** | [**DescriODoObjetoDaRecorrNcia**](DescriODoObjetoDaRecorrNcia.md) |  |  |
|**calendario** | [**InformaEsSobreCalendRioDaRecorrNcia**](InformaEsSobreCalendRioDaRecorrNcia.md) |  |  |
|**valor** | [**RecorrenciaBaseValor**](RecorrenciaBaseValor.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**politicaRetentativa** | [**PoliticaRetentativaEnum**](#PoliticaRetentativaEnum) |  |  |
|**atualizacao** | [**List&lt;HistRicoDeStatusInner2&gt;**](HistRicoDeStatusInner2.md) | Histórico das mudanças de status da recorrência. |  |
|**encerramento** | [**DetalhamentoDoEncerramentoDaRecorrNcia**](DetalhamentoDoEncerramentoDaRecorrNcia.md) |  |  [optional] |
|**ativacao** | [**DadosRelacionadosConfirmaODaAtivaODaRecorrNcia**](DadosRelacionadosConfirmaODaAtivaODaRecorrNcia.md) |  |  [optional] |
|**idRec** | **String** | # Identificador da Recorrência  Regra de formação: - RAxxxxxxxxyyyyMMddkkkkkkkkkkk (29 caracteres; \&quot;case sensitive\&quot;, isso é, diferencia letras maiúsculas e minúsculas), sendo:   - \&quot;R\&quot;:  fixo (1 caractere). \&quot;R\&quot; para a recorrência criada dentro do Pix;   - \&quot;A\&quot;: identificação da possibilidade de novas tentativas, sendo possíveis os valores \&quot;R\&quot; ou \&quot;N\&quot; (1 caractere). \&quot;R\&quot; caso a recorrência permita novas tentativas de pagamento pós vencimento, ou \&quot;N\&quot; caso não permita novas tentativas.   - \&quot;xxxxxxxx\&quot;:  identificação do agente que presta serviço para o usuário recebedor que gerou o &lt;Id&gt;, podendo ser: o ISPB do participante direto, o ISPB do participante indireto ou os 8 primeiros dígitos do CNPJ do prestador de serviço de iniciação (8 caracteres numéricos [0-9]);   - \&quot;yyyyMMdd\&quot;:  data (8 caracteres) de criação da recorrência;   - \&quot;kkkkkkkkkkk\&quot;: sequencial criado pelo agente que gerou o &lt;Id&gt; (11 caracteres alfanuméricos [a-z|A-Z|0-9]). Deve ser único dentro de cada \&quot;yyyyMMdd\&quot;.  Dessa forma, o ID da recorrência deve ser formado de acordo com um dos tipos a seguir: - \&quot;RRxxxxxxxxyyyyMMddkkkkkkkkkkk\&quot;; para recorrência criada dentro do Pix e que permite novas tentativas de pagamento pós vencimento; ou - \&quot;RNxxxxxxxxyyyyMMddkkkkkkkkkkk\&quot;; para recorrência criada dentro do Pix e que não permite novas tentativas de pagamento pós vencimento.” |  [optional] |
|**recebedor** | [**RecorrenciaGeradaAllOfRecebedor**](RecorrenciaGeradaAllOfRecebedor.md) |  |  [optional] |
|**pagador** | [**RecorrenciaGeradaAllOfPagador**](RecorrenciaGeradaAllOfPagador.md) |  |  [optional] |
|**autorizacao** | [**AutorizacaoRecorrenciaGerada**](AutorizacaoRecorrenciaGerada.md) |  |  [optional] |
|**loc** | [**LocationDoPayloadCompleta**](LocationDoPayloadCompleta.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CRIADA | &quot;CRIADA&quot; |
| APROVADA | &quot;APROVADA&quot; |
| REJEITADA | &quot;REJEITADA&quot; |
| EXPIRADA | &quot;EXPIRADA&quot; |
| CANCELADA | &quot;CANCELADA&quot; |



## Enum: PoliticaRetentativaEnum

| Name | Value |
|---- | -----|
| NAO_PERMITE | &quot;NAO_PERMITE&quot; |
| PERMITE_3_R_7_D | &quot;PERMITE_3R_7D&quot; |



