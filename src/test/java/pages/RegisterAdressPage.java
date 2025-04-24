package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class RegisterAdressPage extends Actions {
    public RegisterAdressPage(WebDriver navegador){
        driver = navegador;
    }

    private By title = By.cssSelector("h1");


    public String validaRegisterAdressPage(){
        return get_text(title);
    }


}
