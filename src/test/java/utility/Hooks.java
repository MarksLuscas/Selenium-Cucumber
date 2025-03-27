package utility;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

import static utility.BrowserDriver.getDriver;

public class Hooks {

    private TestContext testContext;

    public Hooks(TestContext testContext){
        this.testContext = testContext;
    }

    // Hook executado antes de cada cenário
    @Before
    public void setup() {
        testContext.getDriver().get("https://www.ligamagic.com.br/?view=");
    }

    // Hook executado após cada cenário
    @After
    public void tearDown() {
        BrowserDriver.quitDriver(); // Encerra o WebDriver
    }

    public TestContext getTestContext() {
        return testContext;
    }


}