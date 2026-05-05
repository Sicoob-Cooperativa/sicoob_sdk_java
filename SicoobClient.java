package br.com.sicoob;

import br.com.sicoob.auth.ApiClient;
import br.com.sicoob.auth.api.AutenticaoApi;
import br.com.sicoob.auth.model.AuthRealmsCooperadoProtocolOpenidConnectTokenPost200Response;

import java.io.FileInputStream;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Authenticator;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class SicoobClient {

    private String clientId;
    private String pfxPath;
    private String pfxPassword;
    private String accessToken;
    private String currentScopes;
    private boolean isSandbox;

    public AutenticaoApi authApi;
    public br.com.sicoob.pix.api.PixApi pixApi;
    public br.com.sicoob.pix.api.CobApi pixCobApi;
    public br.com.sicoob.pagamentosv3.api.PagamentoApi pagamentosV3Api;
    public br.com.sicoob.cobrancav3.api.BoletosApi cobrancaV3BoletosApi;
    public br.com.sicoob.contacorrente.api.ExtratoApi contaCorrenteExtratoApi;
    public br.com.sicoob.contacorrente.api.SaldoApi contaCorrenteSaldoApi;
    public br.com.sicoob.conveniopagamentos.api.ArrecadaoApi arrecadacaoApi;
    public br.com.sicoob.investimentos.api.InvestimentosApi investimentosApi;
    public br.com.sicoob.openfinance.api.IniciadorDeTransaesDePagamentoApi openFinanceConsentsApi;
    public br.com.sicoob.pagamentospix.api.APIDePagamentosPIXApi pagamentosPixApi;
    public br.com.sicoob.poupanca.api.SaldoApi poupancaSaldoApi;
    public br.com.sicoob.spbtransferencias.api.TedsApi spbTedsApi;

    // Configurações
    public br.com.sicoob.pix.ApiClient pixClient;
    public br.com.sicoob.pagamentosv3.ApiClient pagamentosV3Client;
    public br.com.sicoob.cobrancav3.ApiClient cobrancaV3Client;
    public br.com.sicoob.contacorrente.ApiClient contaCorrenteClient;
    public br.com.sicoob.conveniopagamentos.ApiClient convenioClient;
    public br.com.sicoob.investimentos.ApiClient investimentosClient;
    public br.com.sicoob.openfinance.ApiClient openFinanceClient;
    public br.com.sicoob.pagamentospix.ApiClient pagamentosPixClient;
    public br.com.sicoob.poupanca.ApiClient poupancaClient;
    public br.com.sicoob.spbtransferencias.ApiClient spbClient;

    public SicoobClient(String clientId, String pfxPath, String pfxPassword) throws Exception {
        this(clientId, pfxPath, pfxPassword, false);
    }

    public SicoobClient(String clientId, String pfxPath, String pfxPassword, boolean isSandbox) throws Exception {
        this.clientId = clientId;
        this.pfxPath = pfxPath;
        this.pfxPassword = pfxPassword;
        this.isSandbox = isSandbox;

        OkHttpClient okHttpClient = buildOkHttpClient(pfxPath, pfxPassword);

        String baseUrl = this.isSandbox ? "https://sandbox.sicoob.com.br/sicoob/sandbox" : "https://api.sicoob.com.br";
        String authUrl = this.isSandbox ? "https://sandbox.sicoob.com.br/sicoob/sandbox" : "https://auth.sicoob.com.br";

        // 1. Auth API
        ApiClient authClient = new ApiClient();
        authClient.setBasePath(authUrl);
        authClient.setHttpClient(okHttpClient);
        this.authApi = new AutenticaoApi(authClient);

        // 2. Pix API
        this.pixClient = new br.com.sicoob.pix.ApiClient();
        this.pixClient.setBasePath(baseUrl + "/pix/api/v2");
        this.pixClient.setHttpClient(okHttpClient);
        this.pixApi = new br.com.sicoob.pix.api.PixApi(this.pixClient);
        this.pixCobApi = new br.com.sicoob.pix.api.CobApi(this.pixClient);

        // 3. Pagamentos V3
        this.pagamentosV3Client = new br.com.sicoob.pagamentosv3.ApiClient();
        this.pagamentosV3Client.setBasePath(baseUrl + "/pagamentos/v3");
        this.pagamentosV3Client.setHttpClient(okHttpClient);
        this.pagamentosV3Api = new br.com.sicoob.pagamentosv3.api.PagamentoApi(this.pagamentosV3Client);

        // 4. Cobrança V3
        this.cobrancaV3Client = new br.com.sicoob.cobrancav3.ApiClient();
        this.cobrancaV3Client.setBasePath(baseUrl + "/cobranca-bancaria/v3");
        this.cobrancaV3Client.setHttpClient(okHttpClient);
        this.cobrancaV3BoletosApi = new br.com.sicoob.cobrancav3.api.BoletosApi(this.cobrancaV3Client);

        // 5. Conta Corrente
        this.contaCorrenteClient = new br.com.sicoob.contacorrente.ApiClient();
        this.contaCorrenteClient.setBasePath(baseUrl + "/conta-corrente/v4");
        this.contaCorrenteClient.setHttpClient(okHttpClient);
        this.contaCorrenteExtratoApi = new br.com.sicoob.contacorrente.api.ExtratoApi(this.contaCorrenteClient);
        this.contaCorrenteSaldoApi = new br.com.sicoob.contacorrente.api.SaldoApi(this.contaCorrenteClient);

        // 6. Convênio Pagamentos
        this.convenioClient = new br.com.sicoob.conveniopagamentos.ApiClient();
        this.convenioClient.setBasePath(baseUrl + "/convenios-pagamentos/v2");
        this.convenioClient.setHttpClient(okHttpClient);
        this.arrecadacaoApi = new br.com.sicoob.conveniopagamentos.api.ArrecadaoApi(this.convenioClient);

        // 7. Investimentos
        this.investimentosClient = new br.com.sicoob.investimentos.ApiClient();
        this.investimentosClient.setBasePath(baseUrl + "/investimentos/v2");
        this.investimentosClient.setHttpClient(okHttpClient);
        this.investimentosApi = new br.com.sicoob.investimentos.api.InvestimentosApi(this.investimentosClient);

        // 8. Open Finance
        this.openFinanceClient = new br.com.sicoob.openfinance.ApiClient();
        this.openFinanceClient.setBasePath(baseUrl + "/payments/v2/itp");
        this.openFinanceClient.setHttpClient(okHttpClient);
        this.openFinanceConsentsApi = new br.com.sicoob.openfinance.api.IniciadorDeTransaesDePagamentoApi(this.openFinanceClient);

        // 9. Pagamentos PIX
        this.pagamentosPixClient = new br.com.sicoob.pagamentospix.ApiClient();
        this.pagamentosPixClient.setBasePath(baseUrl + "/pix-pagamentos/v2");
        this.pagamentosPixClient.setHttpClient(okHttpClient);
        this.pagamentosPixApi = new br.com.sicoob.pagamentospix.api.APIDePagamentosPIXApi(this.pagamentosPixClient);

        // 10. Poupança
        this.poupancaClient = new br.com.sicoob.poupanca.ApiClient();
        this.poupancaClient.setBasePath(baseUrl + "/poupanca/v3");
        this.poupancaClient.setHttpClient(okHttpClient);
        this.poupancaSaldoApi = new br.com.sicoob.poupanca.api.SaldoApi(this.poupancaClient);

        // 11. SPB Transferências
        this.spbClient = new br.com.sicoob.spbtransferencias.ApiClient();
        this.spbClient.setBasePath(baseUrl + "/spb/v2");
        this.spbClient.setHttpClient(okHttpClient);
        this.spbTedsApi = new br.com.sicoob.spbtransferencias.api.TedsApi(this.spbClient);
    }

    private OkHttpClient buildOkHttpClient(String pfxPath, String password) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        try (FileInputStream fis = new FileInputStream(pfxPath)) {
            keyStore.load(fis, password.toCharArray());
        }

        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, password.toCharArray());

        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), null);

        return new OkHttpClient.Builder()
                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustManagerFactory.getTrustManagers()[0])
                .authenticator(new Authenticator() {
                    @Override
                    public Request authenticate(Route route, Response response) {
                        // Se a requisição já foi retentada, não tenta novamente para evitar loop infinito
                        if (response.priorResponse() != null) {
                            return null;
                        }

                        // Evita loop caso a própria API de autenticação retorne 401
                        if (response.request().url().encodedPath().contains("/token")) {
                            return null;
                        }

                        // No Sandbox, o token é fixo, não tentamos renová-lo
                        if (SicoobClient.this.isSandbox) {
                            return null;
                        }

                        try {
                            // Tenta renovar o token
                            String newToken = SicoobClient.this.authenticate();
                            
                            // Clona a requisição falha e atualiza o header de Authorization com o novo token
                            return response.request().newBuilder()
                                    .header("Authorization", "Bearer " + newToken)
                                    .build();
                        } catch (Exception e) {
                            // Se a renovação falhar, desiste e repassa o erro original (401)
                            return null;
                        }
                    }
                })
                .build();
    }


    public void setSandboxToken(String token) {
        this.accessToken = token;

        // Injeta token no bearer
        this.pixClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.pagamentosV3Client.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.cobrancaV3Client.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.contaCorrenteClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.convenioClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.investimentosClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.openFinanceClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.pagamentosPixClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.poupancaClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.spbClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
    }

    public String authenticate(String scopes) throws Exception {
        if (this.isSandbox) {
            throw new Exception("Em ambiente Sandbox, não chame o authenticate(), ao invés disso, utilize o método setSandboxToken('token-aqui') passando o token fixo gerado pelo Portal Sicoob Developers.");
        }

        if (scopes != null && !scopes.trim().isEmpty()) {
            this.currentScopes = scopes;
        }

        if (this.currentScopes == null || this.currentScopes.trim().isEmpty()) {
            throw new Exception("Scopes must be provided on the first authentication.");
        }

        AuthRealmsCooperadoProtocolOpenidConnectTokenPost200Response response = this.authApi.authRealmsCooperadoProtocolOpenidConnectTokenPost("client_credentials", this.clientId, this.currentScopes);
        this.accessToken = response.getAccessToken();

        // Injeta token no bearer
        this.pixClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.pagamentosV3Client.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.cobrancaV3Client.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.contaCorrenteClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.convenioClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.investimentosClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.openFinanceClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.pagamentosPixClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.poupancaClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);
        this.spbClient.addDefaultHeader("Authorization", "Bearer " + this.accessToken);

        return this.accessToken;
    }
}
