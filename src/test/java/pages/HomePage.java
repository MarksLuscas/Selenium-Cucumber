package pages;

import utility.Actions;
import utility.TestContext;


public class HomePage  {

    private Actions actions;

    public HomePage(TestContext testContext) {
        this.actions = new Actions(testContext); // Passa o TestContext para Actions
    }

    public void que_estou_na_tela_inicial(String titulo){
        actions.validarPaginaInicial(titulo);
    }

    public void clico_em_Efetuar_Login() {
        actions.clicarBotaoLoginHome();
    }

    public void preencher_os_dados_de_email_e_senha(String email, String senha) {
        actions.preencherDadosLogin(email, senha);
        actions.clicarBotaoLogar();
    }

    public void verei_meu_nick_na_tela_inicial(String nick) {
        actions.validarLogado(nick);
    }

    public void escolhoAOpcaoCriarMeuCadastro() {
        actions.clicarBotaoCriarMeuCadastro();
    }
}
