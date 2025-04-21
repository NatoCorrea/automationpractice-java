package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class CreditSlipsPage extends Actions {
    public CreditSlipsPage(WebDriver navegador){
        driver = navegador;
    }

    private By title = By.cssSelector("h1");

    public String validaCreditSlipsPage(){
        return get_text(title);
    }
}
