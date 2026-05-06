# Sicoob SDK Java

SDK Oficial em Java para integração com as APIs Financeiras e Não Financeiras do [Sicoob](https://developers.sicoob.com.br/).

Este SDK foi gerado a partir das especificações Swagger (OpenAPI) da Sicoob e foi projetado de forma **modular**, unificando as chamadas em um Client que gerencia a autenticação e certificados mTLS.

## Estrutura do Pacote

```text
sicoob_sdk_java/
├── auth/                         - API de Geração de Tokens
├── pix/                          - API Pix (Recebimentos, Cobranças imediatas)
├── pagamentos-pix/               - API Pagamentos Pix
├── cobrancav3/                   - API Cobrança Bancária V3 (Boletos)
├── pagamentosv3/                 - API Cobrança Bancária Pagamentos
├── conta-corrente/               - API Conta Corrente (Extrato, Saldo)
├── convenio-pagamentos/          - API Arrecadação e Convênios
├── investimentos/                - API Investimentos Renda Fixa
├── poupanca-api/                 - API de Poupança (Extrato, Saldo)
├── openfinance-consentimento/    - API Open Finance Consentimentos
├── spb-transferencias/           - API Transferências SPB (TEDs)
└── SicoobClient.java             - Orquestrador principal unificado
```

## Requisitos de Autenticação e mTLS (Certificados)

O cliente HTTP subjacente ao SDK Java (usando `OkHttp3`) tem suporte nativo aos certificados corporativos em formato `.pfx` ou `.p12` no Java através do `KeyStore` com padrão `PKCS12`.

Portanto, **não é obrigatória a conversão do seu certificado `.pfx`** para PEM no Java.

## Exemplo de Uso

Instancie a classe `SicoobClient` passando o Client ID, o caminho do seu certificado digital `.pfx` e a respectiva senha.

O token gerado será automaticamente distribuído pelo cabeçalho `Authorization: Bearer <token>` para todas as APIs de negócio do Sicoob.

```java
import br.com.sicoob.SicoobClient;
import br.com.sicoob.contacorrente.model.Saldo;

public class Main {
    public static void main(String[] args) {
        try {
            // Instanciando passando um .pfx e sua respectiva senha
            // O último parâmetro (isSandbox) define se vai rodar em Prod ou Sandbox (false = Produção)
            SicoobClient sicoob = new SicoobClient(
                "SEU_CLIENT_ID",
                "cert.pfx",
                "SENHA_DO_PFX",
                false
            );

            // --- EM AMBIENTE DE PRODUÇÃO ---
            // Autentica (gera o Token e injeta nos clientes de Pix, Cobranca, etc)
            // É obrigatório informar os escopos desejados na primeira chamada
            String token = sicoob.authenticate("cco_transferencias cco_consulta openid");
            System.out.println("Token gerado: " + token);

            // --- EM AMBIENTE DE SANDBOX ---
            // Em Sandbox, não chame o authenticate(). Obtenha o token fixo no Portal Developers e injete:
            // sicoob.setSandboxToken("1301865f-c6bc-38f3-9f49-666dbcfc59c3");

            // Exemplo: Consultar Conta Corrente
            Saldo responseSaldo = sicoob.contaCorrenteSaldoApi.obterSaldo("SEU_CLIENT_ID", 12345L);
            System.out.println("Saldo: " + responseSaldo.getSaldo());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 🔄 Renovação Automática de Token

O SDK possui inteligência embutida (`Authenticator` do OkHttp) para lidar com a expiração do token OAuth2. 
Ao receber um erro `401 Unauthorized` de qualquer API de negócio, o Client intercepta a falha, utiliza os escopos informados na primeira autenticação para gerar um novo token de acesso, e refaz a requisição original de forma 100% transparente. Você não precisa se preocupar com caches ou temporizadores na sua aplicação!

## Instalação (Maven/Gradle)

O SDK está disponível no Maven Central. Para utilizá-lo, basta adicionar a dependência do módulo `sicoob-sdk-core` no seu arquivo `pom.xml` (Maven) ou `build.gradle` (Gradle). O módulo `core` já importa automaticamente todas as APIs de negócio.

### Maven (`pom.xml`)
```xml
<dependency>
    <groupId>io.github.sicoob-cooperativa</groupId>
    <artifactId>sicoob-sdk-core</artifactId>
    <version>2.0.0</version>
</dependency>
```

### Gradle (`build.gradle`)
```groovy
implementation 'io.github.sicoob-cooperativa:sicoob-sdk-core:2.0.0'
```


## Escopos (Scopes) por API

Ao chamar o método de autenticação, dependendo da API que você for utilizar, é estritamente necessário fornecer os escopos (scopes) apropriados separados por espaço. Abaixo a tabela de referência das APIs e seus escopos:

| API de Negócio | Escopos Comuns Necessários |
|---|---|
| **Cobrança Bancária V3** | `cobranca_boletos_consultar` `cobranca_boletos_incluir` `cobranca_boletos_pagador` `cobranca_boletos_segunda_via` `cobranca_boletos_baixa` `cobranca_boletos_rateio_credito` |
| **Cobrança Bancária Pagamentos** | `pagamentos_boletos_pagar` `pagamentos_boletos_agendar` `pagamentos_boletos_consultar` |
| **Conta Corrente** | `cco_extrato` `cco_saldo` `cco_transferencias` |
| **Convênio Pagamentos** | `conveniopagamentos_arrecadacao` `conveniopagamentos_debitos_automaticos` |
| **Investimentos** | `investimentos_renda_fixa` |
| **Open Finance** | `openid` (Necessita de diretrizes específicas do fluxo OIDC) |
| **Pagamentos PIX** | `pixpagamentos_escrita` `pixpagamentos_consulta` `pixpagamentos_webhook` |
| **PIX (Recebimentos)** | `cob.read` `cob.write` `cobv.read` `cobv.write` `lotecobv.read` `lotecobv.write` `pix.read` `pix.write` `webhook.read` `webhook.write` `payloadlocation.read` `payloadlocation.write` |
| **Poupança** | `poupanca_saldo` `poupanca_extrato` `poupanca_aplicacao` `poupanca_resgate` |
| **SPB Transferências** | `spb_transferencias_ted` |

*Nota: Alguns escopos exigem liberação específica nas chaves da sua aplicação no Portal de Desenvolvedores do Sicoob.*

## Documentação Específica

Para detalhes exatos sobre métodos, parâmetros de requisição e construtores de DTO de cada API, verifique o `README.md` individual que foi gerado dentro da pasta de cada submódulo:

- [API Autenticação](auth/README.md)
- [API Pix (Recebimentos e Cobranças)](pix/README.md)
- [API Pagamentos Pix](pagamentos-pix/README.md)
- [API Cobrança Bancária V3 (Boletos)](cobrancav3/README.md)
- [API Pagamentos de Cobrança (DDA)](pagamentosv3/README.md)
- [API Conta Corrente](conta-corrente/README.md)
- [API Convênio / Pagamentos](convenio-pagamentos/README.md)
- [API Investimentos](investimentos/README.md)
- [API Poupança](poupanca-api/README.md)
- [API Transferências SPB (TEDs)](spb-transferencias/README.md)
- [API OpenFinance Consentimentos](openfinance-consentimento/README.md)
