package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

import static steps.Hooks.driver;

public class HomeSteps {

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Dado("que o usuario esteja na home page")
    public void que_o_usuario_esteja_na_home_page() {
        Assert.assertEquals(homePage.validaHomePage(), "http://www.automationpractice.pl/index.php");
    }
    @Quando("clicar no botao de login")
    public void clicar_no_botao_de_login() {
        homePage.clicarBtnLogar();
    }
    @Entao("o sistema ira direcionar para a tela de login")
    public void o_sistema_ira_direcionar_para_a_tela_de_login() {
        Assert.assertEquals(loginPage.validaLoginPage(),
                "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }

}