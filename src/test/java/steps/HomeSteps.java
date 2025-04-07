package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;
import pages.AuthenticationPage;

import static steps.Hooks.driver;

public class HomeSteps {

    HomePage homePage = new HomePage(driver);

    @Dado("que o usuario esteja na home page")
    public void que_o_usuario_esteja_na_home_page() {
        Assert.assertEquals(homePage.validaHomePage(), "http://www.automationpractice.pl/index.php");
    }
    @Quando("clicar no botao de login")
    public void clicar_no_botao_de_login() {
        homePage.clicarBtnLogar();
    }


}