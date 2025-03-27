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
}
