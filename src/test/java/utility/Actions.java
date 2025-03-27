package utility;

import Elements.HomeElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utility.BrowserDriver.getDriver;

public class Actions{

    private HomeElements homeElements = new HomeElements();
    private WaitHelper waitHelper;

    public Actions() {
        // Inicializa o WaitHelper usando o driver atual
        WebDriver driver = getDriver();
        this.waitHelper = new WaitHelper(driver);
    }

    public void validarPagina(){
        waitHelper.waitForElementToBeClickable(homeElements.botaoFecharBanner).click();
       Assert.assertEquals("LigaMagic: Aqui você negocia e se informa sobre Magic: The Gathering", getDriver().getTitle());
    }

    public void clicarBotaoLoginHome(){
        waitHelper.waitForElementToBeClickable(homeElements.botaoLoginHome).click();
    }

    public void preencherDadosLogin(String email, String senha) {
        waitHelper.waitForElementToBeClickable(homeElements.campoEmail).sendKeys(email);
        waitHelper.waitForElementToBeClickable(homeElements.campoSenha).sendKeys(senha);
    }

    public void clicarBotaoLogar() {
        waitHelper.waitForElementToBeClickable(homeElements.botaoLogar).click();
    }

    public void validarLogado(String nick) {
        waitHelper.waitForUrlToBe("https://www.ligamagic.com.br/?view=");
      Assert.assertEquals(nick, waitHelper.waitForElementToBeVisible(homeElements.nick).getText());
    }
}
