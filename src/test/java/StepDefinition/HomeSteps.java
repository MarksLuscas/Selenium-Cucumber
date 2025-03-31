package StepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import utility.TestContext;

public class HomeSteps {

    private HomePage homePage;

    // Construtor que recebe o TestContext e o injeta na HomePage
    public HomeSteps(TestContext testContext) {
        this.homePage = new HomePage(testContext); // Passa o TestContext para HomePage
    }


    @Dado("que estou na tela inicial")
    public void que_estou_na_tela_inicial(){
        homePage.que_estou_na_tela_inicial("LigaMagic: Aqui você negocia e se informa sobre Magic: The Gathering");
    }

    @E("clico em Efetuar Login")
    public void clico_em_Efetuar_Login(){
        homePage.clico_em_Efetuar_Login();
    }

    @Quando("Preencher os dados de email e senha {string} {string}")
    public void preencher_os_dados_de_email_e_senha(String email, String senha){
        homePage.preencher_os_dados_de_email_e_senha(email, senha);
    }

    @Então("Verei meu nick na tela inicial {string}")
    public void verei_meu_nick_na_tela_inicial(String nick){
        homePage.verei_meu_nick_na_tela_inicial(nick);
    }

    @Quando("Preencher os dados de email e senha com valores errados {string} {string}")
    public void preencher_os_dados_de_email_e_senha_com_valores_errados(String email, String senha) {
        homePage.preencher_os_dados_de_email_e_senha(email, senha);
    }

    @E("Seleciono a opcao de Criar meu Cadastro")
    public void seleciono_a_opcao_de_criar_meu_cadastro() {
        homePage.escolhoAOpcaoCriarMeuCadastro();
    }
}
