package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class MyPersonalPage extends Actions {
    public MyPersonalPage(WebDriver navegador){
        driver = navegador;
    }
    private By title = By.cssSelector("h1");

    public String validaPersonalPage(){
        return get_text(title);
    }
}
