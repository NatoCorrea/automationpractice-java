package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class MyAdressPage extends Actions {
    public MyAdressPage(WebDriver navegador){
        driver = navegador;
    }

    private By title = By.cssSelector("h1");


    public String validaAdressPage(){
        return get_text(title);
    }


}
