

# Devolucao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id gerado pelo cliente para representar unicamente uma devolução. |  |
|**rtrId** | **String** | ReturnIdentification que transita na PACS004. |  |
|**valor** | **String** | Valor a devolver. |  |
|**natureza** | **DevolucaoNatureza** |  |  [optional] |
|**descricao** | **String** | O campo &#x60;descricao&#x60;, opcional, determina um texto a ser apresentado ao pagador contendo informações sobre a devolução. Esse texto será preenchido, na pacs.004, pelo PSP do recebedor, no campo RemittanceInformation. O tamanho do campo na pacs.004 está limitado a 140 caracteres. |  [optional] |
|**horario** | [**DevolucaoHorario**](DevolucaoHorario.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status da devolução. |  |
|**motivo** | **String** | # Status da Devolução Campo opcional que pode ser utilizado pelo PSP recebedor para detalhar os motivos de a devolução ter atingido o status em questão. Pode ser utilizado, por exemplo, para detalhar o motivo de a devolução não ter sido realizada.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| EM_PROCESSAMENTO | &quot;EM_PROCESSAMENTO&quot; |
| DEVOLVIDO | &quot;DEVOLVIDO&quot; |
| NAO_REALIZADO | &quot;NAO_REALIZADO&quot; |



