package steps;

import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pages.MyAccountPage;

import static steps.Hooks.driver;

public class AccountSteps {

    MyAccountPage myAccountPage = new MyAccountPage(driver);


    @Entao("o sistema direcionara para tele my account")
    public void o_sistema_direcionara_para_tele_my_account() {
        Assert.assertEquals(myAccountPage.validaMyAccountPage(),
                "MY ACCOUNT");
    }

}


