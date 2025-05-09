package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Hooks;

public class Actions extends Hooks {

    protected WebDriverWait wait;

    public void wait_elements_visible(By element, int time){
        try {
            System.out.println("Aguardando o elemento " + element + " ficar visível");
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            System.out.println("Encontrou o elemento " + element);
        } catch (Exception erro){
            System.out.println("Não encontrou o elemento " + element);
            System.out.println(erro);
        }
    }
    public void click(By element){
        try {
            wait_elements_visible(element, 10);
            driver.findElement(element).click();
            System.out.println("Clicou no elemento " + element);
        } catch (Exception erro){
            System.out.println("Não clicou no elemento " + element);
            System.out.println(erro);
        }
    }

    public void click_index(By element, int index){
        try {
            wait_elements_visible(element, 10);
            driver.findElements(element).get(index).click();
            System.out.println("Clicou no elemento " + element + "de index " + index);
        } catch (Exception erro){
            System.out.println("Não clicou no elemento " + element + "de index " + index);
            System.out.println(erro);
        }
    }
    public void set(By element, String text){
        try{
            wait_elements_visible(element, 10);
            driver.findElement(element).sendKeys(text);
            System.out.println("Setou a informação no elemento " + element);
        } catch (Exception erro){
            System.out.println("Não setou a informação no elemento " + element);
            System.out.println(erro);
        }
    }
    public Select select(By element){
        try {
            wait_elements_visible(element, 10);
            Select select = new Select(driver.findElement(element));
            System.out.println("Selecionou o elemento " + element);
            return select;
        } catch (Exception erro) {
            System.out.println("Não selecionou o elemento " + element);
            System.out.println(erro);
        }
        return null;
    }
    public String get_text(By element){
        String text = null;
        try{
            wait_elements_visible(element, 10);
            text = driver.findElement(element).getText();
            System.out.println("Validou o " + text);
        } catch (Exception erro) {
            System.out.println("Não visualizou o " + text);
        }
        return text;
    }
    public String get_text_index(By element, int index){
        String text = null;
        try{
            wait_elements_visible(element, 10);
            text = driver.findElements(element).get(index).getText();
            System.out.println("Validou o " + text + "com index " + index);
        } catch (Exception erro) {
            System.out.println("Não visualizou o " + text + "com index " + index);
        }
        return text;
    }
    public void clear(By element){
        try{
            wait_elements_visible(element, 10);
            driver.findElement(element).clear();
            System.out.println("Limpou a informação do elemento " + element);
        } catch (Exception erro) {
            System.out.println("Não limpou a informação no elemento " + element);
            System.out.println(erro);
        }
    }
    public String get_url(){
        String url = null;
        try{
            url = driver.getCurrentUrl();
            System.out.println("Validou a " + url);
        }catch (Exception erro){
            System.out.println("Não validou a " + url);
        }
        return url;
    }
}
