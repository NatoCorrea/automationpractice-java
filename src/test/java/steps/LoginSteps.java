package steps;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import static steps.Hooks.driver;

public class LoginSteps {

    private static final Log log = LogFactory.getLog(LoginSteps.class);
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    @Dado("que o usuario esteja na tela de login")
    public void que_o_usuario_esteja_na_tela_de_login() {
        homePage.clicarBtnLogar();
        Assert.assertEquals(loginPage.validaLoginPage(),
                "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }
    @Quando("preencher os campos com dados validos")
    public void preencher_os_campos_com_dados_validos() {
        loginPage.preencherLogin("testando123@teste.com", "12345");
        loginPage.clicarBtnLogin();
    }

    @Entao("o sistema direcionara para tele my account")
    public void o_sistema_direcionara_para_tele_my_account() {
        Assert.assertEquals(myAccountPage.validaMyAccountPage(),
                "MY ACCOUNT");
    }
}
