package StepDefinition;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.SenhaErradaPage;
import utility.TestContext;

public class SenhaErradaSteps {

    private SenhaErradaPage senhaErradaPage;

    public SenhaErradaSteps(TestContext testContext) {
        this.senhaErradaPage = new SenhaErradaPage(testContext);
    }

    @Então("Serei redirecionado para outra tela")
    public void serei_redirecionado_para_outra_tela() {
        senhaErradaPage.validarPagina("Autenticação");
    }


    @E("Tera uma mensagem de Login ou Senha errados")
    public void tera_uma_mensagem_de_login_e_ou_senha_errados() {
        senhaErradaPage.validarMensagemDadosErrados();
    }
}
