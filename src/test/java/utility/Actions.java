package utility;

import Elements.HomeElements;
import Elements.SenhaErradaElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {

    private HomeElements homeElements = new HomeElements();
    private SenhaErradaElements senhaErradaElements = new SenhaErradaElements();
    private WaitHelper waitHelper;
    private TestContext context;
    private WebDriver driver;

    public Actions(TestContext context) {
        this.context = context;
        this.driver = context.getDriver();
        this.waitHelper = new WaitHelper(driver);
    }

    public void validarPaginaSenhaErrada(String titulo) {
        Assert.assertEquals(titulo, context.getDriver().getTitle());
    }

    public void validarPaginaInicial(String titulo) {
        WebElement botaoFechar = waitHelper.waitForElementToBeClickable(homeElements.botaoFecharBanner);
        if (botaoFechar.isDisplayed()) {
            botaoFechar.click();
        }
        Assert.assertEquals(titulo, context.getDriver().getTitle());
    }

    public void clicarBotaoLoginHome() {
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
        WebElement nickElement = waitHelper.waitForElementToBeVisible(homeElements.nick);
        Assert.assertEquals(nick, nickElement.getText());
        Assert.assertTrue(nickElement.isDisplayed());
    }

    public void validaMensagemDadosErrados() {
        Assert.assertTrue(waitHelper.waitForElementToBeVisible(senhaErradaElements.mensagemDadosErrados).isDisplayed());
    }
}