package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class LoginPage extends Actions {

    public LoginPage(WebDriver navegador){
        driver = navegador;
    }

    public String validaLoginPage(){
        return get_url();
    }


}
