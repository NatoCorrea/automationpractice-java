package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AuthenticationPage;

import static steps.Hooks.driver;

public class AuthenticationSteps {

    AuthenticationPage authPage = new AuthenticationPage(driver);


    @Quando("ele preenche o campo email e clica no botao de cadastrar")
    public void ele_preenche_o_campo_email_e_clica_no_botao_de_cadastrar() {
        authPage.preencherCampo("testando123@teste.com");
        authPage.clicarBtnCadastrar();
    }
    @Entao("o sistema retorna uma mensagem de erro")
    public void o_sistema_retorna_uma_mensagem_de_erro() {
        authPage.validaMessage();
    }





}
