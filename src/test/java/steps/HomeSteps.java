package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

import static steps.Hooks.driver;

public class HomeSteps {

    HomePage homePage = new HomePage(driver);

    @Dado("que o usuario esteja na home page")
    public void que_o_usuario_esteja_na_home_page() {

    }

    @Quando("clicar no botao de login")
    public void clicar_no_botao_de_login() {

    }
}