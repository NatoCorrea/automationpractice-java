package steps;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import runner.BrowserFactory;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void antesDoTeste(){
        driver = BrowserFactory.getBrowser();
    }
    @After
    public void depoisDoTeste(){
        driver.quit();
        driver = null;
    }
}
