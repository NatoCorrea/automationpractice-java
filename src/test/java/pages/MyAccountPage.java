package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class MyAccountPage extends Actions {

    public MyAccountPage(WebDriver navegador) {
        driver = navegador;
    }
    private By title = By.className("page-heading");

    public String validaMyAccountPage(){
      return get_text(title);
    }
}

