package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class LoginPage extends Actions {

    public LoginPage(WebDriver navegador){
        driver = navegador;
    }
    private By fieldEmail = By.id("email");
    private By fieldPasswd = By.id("passwd");
    private By btnLogin = By.id("SubmitLogin");

    public String validaLoginPage(){
        return get_url();
    }

    public void preencherLogin(String email, String passwd){
        set(fieldEmail, email);
        set(fieldPasswd, passwd);
    }

    public void clicarBtnLogin(){
        click(btnLogin);
    }

}
