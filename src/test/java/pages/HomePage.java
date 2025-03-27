package pages;


import org.junit.Assert;
import utility.Actions;
import utility.BrowserDriver;

public class HomePage  {

    private Actions actions = new Actions();

    public void que_estou_na_tela_inicial(){
        actions.validarPagina();
    }

    public void clico_em_Efetuar_Login() {
        actions.clicarBotaoLoginHome();
    }

    public void preencher_os_dados_de_email_e_senha(String email, String senha) {
        actions.preencherDadosLogin(email, senha);
        actions.clicarBotaoLogar();
    }
}
