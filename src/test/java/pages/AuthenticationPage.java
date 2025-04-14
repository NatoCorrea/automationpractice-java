package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class AuthenticationPage extends Actions {

    public AuthenticationPage(WebDriver navegador){
        driver = navegador;
    }
    private By fieldEmail = By.id("email");
    private By fieldPasswd = By.id("passwd");
    private By btnLogin = By.id("SubmitLogin");
    private By msgError = By.cssSelector("ol > li");
    private By title = By.className("page-heading");
    private By fieldNewEmail = By.id("email_create");
    private By btnCadastrar = By.id("SubmitCreate");

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
    public String validaMessage(){
        return get_text(msgError);
    }

    public String validaAuthenticationPage(){
        return get_text(title);
    }

    public void preencherCampo(String text){
        set(fieldNewEmail, text);
    }
    public void clicarBtnCadastrar(){
        click(btnCadastrar);
    }

}
