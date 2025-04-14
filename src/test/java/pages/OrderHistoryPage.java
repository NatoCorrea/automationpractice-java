package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class OrderHistoryPage extends Actions {
    public OrderHistoryPage(WebDriver navegador){
        driver = navegador;
    }

    private By title = By.cssSelector("h1");

    public String validaOrderHistoryPage(){
        return get_text(title);
    }
}
