package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class MyAccountPage extends Actions {

    public MyAccountPage(WebDriver navegador) {
        driver = navegador;
    }
    private By title = By.cssSelector("h1");
    private By btnFirstAdress = By.cssSelector("a[title='Add my first address']");
    private By btnOrderHistory = By.className("icon-list-ol");
    private By btnMyCreditSlips = By.className("icon-file-o");
    private By btnMyAdress = By.cssSelector("a[title='Addresses']");
    private By btnPersonalInformation = By.cssSelector("icon-user");

    public String validaMyAccountPage(){
      return get_text(title);
    }

    public void clickBtnFirstAdress(){
        click(btnFirstAdress);
    }

    public void clickBtnOrderHistory(){

        click(btnOrderHistory);
    }

    public void clickBtnMyCreditSlips(){
        click(btnMyCreditSlips);
    }

    public void clickBtnMyAdress(){
        click(btnMyAdress);
    }
    public void clickBtnPersonalInformation(){

        click(btnPersonalInformation);
    }



}

