package StepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class HomeSteps {

   private HomePage homePage = new HomePage();

    @Dado("que estou na tela inicial")
    public void que_estou_na_tela_inicial(){
        homePage.que_estou_na_tela_inicial();
    }

    @E("clico em Efetuar Login")
    public void clico_em_Efetuar_Login(){
        homePage.clico_em_Efetuar_Login();

    }

    @Quando("Preencher os dados de email e senha {string} {string}")
    public void preencher_os_dados_de_email_e_senha(String email, String senha){
        homePage.preencher_os_dados_de_email_e_senha(email, senha);

    }
//
//    @Então("Me verei logado na tela inicial novamente")
//    public void me_verei_logado_na_tela_inicial_novamente(){
//
//    }
}
