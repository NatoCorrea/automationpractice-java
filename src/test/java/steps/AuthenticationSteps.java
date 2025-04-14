package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAdressPage;

import static steps.Hooks.driver;

public class AuthenticationSteps {

    AuthenticationPage authPage = new AuthenticationPage(driver);
    HomePage homePage = new HomePage(driver);


    @Dado("que o usuario esteja na tela de autenticacao")
    public void que_o_usuario_esteja_na_tela_de_autenticacao() {
        homePage.clicarBtnLogar();
        Assert.assertEquals(authPage.validaAuthenticationPage(), "AUTHENTICATION");
        Assert.assertEquals(authPage.validaLoginPage(),
                "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }

    @Quando("ele preenche o campo email e clica no botao de cadastrar")
    public void ele_preenche_o_campo_email_e_clica_no_botao_de_cadastrar() {
        authPage.preencherCampo("testando123@teste.com");
        authPage.clicarBtnCadastrar();
    }
    @Entao("o sistema retorna uma mensagem de erro")
    public void o_sistema_retorna_uma_mensagem_de_erro() {
        Assert.assertEquals(authPage.validaMessage(),
                "An account using this email address has already been registered. " +
                        "Please enter a valid password or request a new one.");
    }





}
