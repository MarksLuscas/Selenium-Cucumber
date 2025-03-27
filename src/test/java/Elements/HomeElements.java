package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class HomeElements extends BrowserDriver {

    public static By botaoLoginHome = By.xpath("//button[.='Efetuar login']");
    public static By botaoFecharBanner = By.id("campanha-del-1");
}
