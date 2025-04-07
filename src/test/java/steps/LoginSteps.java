package steps;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import pages.HomePage;
import pages.AuthenticationPage;
import pages.MyAccountPage;

import static steps.Hooks.driver;

public class LoginSteps {

    private static final Log log = LogFactory.getLog(LoginSteps.class);
    AuthenticationPage authPage = new AuthenticationPage(driver);
    HomePage homePage = new HomePage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    @Dado("que o usuario esteja na tela de autenticacao")
    public void que_o_usuario_esteja_na_tela_de_autenticacao() {
//        Assert.assertEquals(authPage.validaAuthenticationPage(), "Authentication");
        homePage.clicarBtnLogar();
        Assert.assertEquals(authPage.validaLoginPage(),
                "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }
    @Quando("preencher os campos com dados validos")
    public void preencher_os_campos_com_dados_validos() {
        authPage.preencherLogin("testando123@teste.com", "12345");
        authPage.clicarBtnLogin();
    }
    @Entao("o sistema ira direcionar para a tela de login")
    public void o_sistema_ira_direcionar_para_a_tela_de_login() {
        Assert.assertEquals(authPage.validaLoginPage(),
                "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }
    @Quando("preencher o campo email {string} e o campo senha {string}")
    public void preencher_o_campo_email_e_o_campo_senha(String email, String senha) {
        authPage.preencherLogin(email, senha);
        authPage.clicarBtnLogin();
    }

    @Entao("o sistema mostrara uma mensagem {string} de erro")
    public void o_sistema_mostrara_uma_mensagem_de_erro(String mensagem) {
        Assert.assertEquals(authPage.validaMessage(), mensagem);
    }
}
