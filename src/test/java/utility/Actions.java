package utility;

import Elements.HomeElements;
import org.junit.Assert;
import org.openqa.selenium.By;

import static utility.BrowserDriver.getDriver;


public class Actions{

    private HomeElements homeElements = new HomeElements();

    public void validarPagina(){
       Assert.assertEquals("LigaMagic: Aqui você negocia e se informa sobre Magic: The Gathering", getDriver().getTitle());
    }

    public void clicarBotaoLoginHome(){
        homeElements.botaoLoginHome.click();
    }
}
