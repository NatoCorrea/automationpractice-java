package steps;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.LoginPage;

import static steps.Hooks.driver;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(driver);

    @Dado("que o usuario esteja na tela de login")
    public void que_o_usuario_esteja_na_tela_de_login() {

    }
    @Quando("preencher os campos com dados validos")
    public void preencher_os_campos_com_dados_validos() {

    }
    @Entao("o sistema direcionara para tele my account")
    public void o_sistema_direcionara_para_tele_my_account() {

    }
    @Entao("o sistema ira direcionar para a tela de login")
    public void o_sistema_ira_direcionar_para_a_tela_de_login() {
        loginPage.validaLoginPage();
    }
}
