package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.*;

import static steps.Hooks.driver;

public class AccountSteps {

    MyAccountPage myAccountPage = new MyAccountPage(driver);
    HomePage homePage = new HomePage(driver);
    AuthenticationPage authPage = new AuthenticationPage(driver);
    MyAdressPage adressPage = new MyAdressPage(driver);
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);

    @Entao("o sistema direcionara para tela my account")
    public void o_sistema_direcionara_para_tele_my_account() {
        Assert.assertEquals(myAccountPage.validaMyAccountPage(),
                "MY ACCOUNT");
    }

    @Dado("que o usuario esteja logado e na My Account Page")
    public void que_o_usuario_esteja_logado_na_my_account_page() {
        homePage.clicarBtnLogar();
        authPage.preencherLogin("testando123@teste.com", "12345");
        authPage.clicarBtnLogin();
        Assert.assertEquals(myAccountPage.validaMyAccountPage(),
                "MY ACCOUNT");
    }

    @Quando("clicar no botao  Add my first addres")
    public void clicar_no_botao_add_my_first_addres() {
        myAccountPage.clickBtnFirstAdress();
    }

    @Entao("o sistema redirecionara para pagina de enderecos")
    public void o_sistema_redirecionara_para_pagina_de_enderecos() {
        Assert.assertEquals(adressPage.validaAdressPage(),"YOUR ADDRESSES");
    }

    @Quando("clicar no botao Order history and details")
    public void clicar_no_botao_order_history_and_details() {
        myAccountPage.clickBtnOrderHistory();
    }
    @Entao("o sistema redirecionara para pagina de historico de pedidos")
    public void o_sistema_redirecionara_para_pagina_de_historico_de_pedidos() {
        Assert.assertEquals(orderHistoryPage.validaOrderHistoryPage(), "ORDER HISTORY");
    }


}


