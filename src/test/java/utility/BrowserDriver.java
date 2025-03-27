package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver {


    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (PropriedadesBrowser.BROWSER) {
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup(); // Configuração automática do driver
                    driver = new FirefoxDriver();
                    break;
                case CHROME:
                    WebDriverManager.chromedriver().setup(); // Configuração automática do driver
                    driver = new ChromeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Navegador não suportado: " + PropriedadesBrowser.BROWSER);
            }
            driver.manage().window().maximize(); // Janela maximizada
        }
        return driver;
    }

    // Método para encerrar o WebDriver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit(); // Fecha o navegador
            driver = null; // Garante que a instância seja liberada
        }
    }
}