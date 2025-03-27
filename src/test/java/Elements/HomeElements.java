package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class HomeElements extends BrowserDriver {

    public static By botaoLoginHome = By.xpath("//button[.='Efetuar login']");
    public static By botaoFecharBanner = By.id("campanha-del-1");
    public static By campoEmail = By.xpath("//input[@placeholder='Login ou E-Mail']");
    public static By campoSenha = By.xpath("//input[@placeholder='Senha']");
    public static By botaoLogar = By.linkText("Logar");
    public static By nick = By.xpath("//a[@class='btn btn-sign']");
}
