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
    CreditSlipsPage creditSlipsPage = new CreditSlipsPage(driver);
    RegisterAdressPage registerAdressPage = new RegisterAdressPage(driver);
    MyPersonalPage myPersonalPage = new MyPersonalPage(driver);

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

    @Quando("clicar no botao My addres")
    public void clicar_no_botao_my_addres() {
        myAccountPage.clickBtnMyAdress();

    }
    @Quando("clicar no botao Order history and details")
    public void clicar_no_botao_order_history_and_details() {
        myAccountPage.clickBtnOrderHistory();
    }

    @Quando("clicar no botao My credit slips")
    public void clicar_no_botao_my_credit_slips() {
        myAccountPage.clickBtnMyCreditSlips();
    }
    @Quando("clicar no botao My personal information")
    public void clicar_no_botao_my_personal_information() {
        myAccountPage.clickBtnPersonalInformation();
    }

    @Entao("o sistema redirecionara para pagina de cadastro de enderecos")
    public void o_sistema_redirecionara_para_pagina_de_cadastro_de_enderecos() {
        Assert.assertEquals(registerAdressPage.validaRegisterAdressPage(), "YOUR ADDRESSES");
    }

    @Entao("o sistema redirecionara para pagina de enderecos")
    public void o_sistema_redirecionara_para_pagina_de_enderecos() {
        Assert.assertEquals(adressPage.validaAdressPage(),"MY ADDRESSES");
    }

    @Entao("o sistema redirecionara para pagina de historico de pedidos")
    public void o_sistema_redirecionara_para_pagina_de_historico_de_pedidos() {
        Assert.assertEquals(orderHistoryPage.validaOrderHistoryPage(), "ORDER HISTORY");
    }

    @Entao("o sistema redirecionara para a pagina de creditos")
    public void o_sistema_redirecionara_para_a_pagina_de_creditos() {
        Assert.assertEquals(creditSlipsPage.validaCreditSlipsPage(), "CREDIT SLIPS");
    }

    @Entao("o sistema redirecionara para a pagina de informacoes pessoais")
    public void o_sistema_redirecionara_para_a_pagina_de_informacoes_pessoais() {
        Assert.assertEquals(myPersonalPage.validaPersonalPage(), "YOUR PERSONAL INFORMATION");
    }


}


