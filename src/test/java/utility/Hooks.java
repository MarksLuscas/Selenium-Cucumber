package utility;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utility.BrowserDriver;

public class Hooks {

    // Hook executado antes de cada cenário
    @Before
    public void setup() {
        BrowserDriver.getDriver().get("https://www.ligamagic.com.br/?view="); // Inicializa e acessa a URL base
    }

    // Hook executado após cada cenário
    @After
    public void tearDown() {
        BrowserDriver.quitDriver(); // Encerra o WebDriver
    }
}