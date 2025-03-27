package utility;

import org.openqa.selenium.WebDriver;

public class TestContext {

    private WebDriver driver;
    private String data;

    public TestContext(){
        this.driver = BrowserDriver.getDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

}
