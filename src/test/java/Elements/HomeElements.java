package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class HomeElements extends BrowserDriver {

    public static WebElement botaoLoginHome = getDriver().findElement(By.xpath("//button[.='Efetuar login']"));
}
