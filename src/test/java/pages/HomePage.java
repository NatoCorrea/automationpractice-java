package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;


public class HomePage extends Actions {

    public HomePage(WebDriver navegador){
        driver = navegador;
    }

    private By btnLogar = By.className("login");
    private By btnCart = By.cssSelector(".shopping_cart > a");

    public String validaHomePage(){
        return get_url();
    }

    public void clicarBtnLogar(){
        click(btnLogar);
    }
}
