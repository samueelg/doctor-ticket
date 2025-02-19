package com.dev.oralsin.doctorticket.controllers;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author samueelg
 */

@Component
public abstract class BaseSeleniumController {
    
    private final WebDriver driver;  
    private final WebDriverWait wait;
    
        @Autowired
        public BaseSeleniumController(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
        
         protected WebElement waitForElementToBeClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
         
            protected void clickElement(By by) {
        WebElement element = waitForElementToBeClickable(by);
        if (element != null) {
            element.click();
        } else {
            throw new RuntimeException("Elemento não encontrado: " + by);
        }
    }
    
    public void initGoogle(){
        Set<String> guiasAbertas = driver.getWindowHandles();
        String movideskAba = null;
        
        // Percorre todas as abas para verificar se o Movidesk já está aberto
        for (String aba : guiasAbertas) {
            driver.switchTo().window(aba);
            if (driver.getCurrentUrl().contains("https://oralsinf.movidesk.com/Ticket/Edit/125339")) { 
                movideskAba = aba;
                break; // Para de procurar quando encontrar
            }
        }
        // Se encontrou uma aba do Movidesk, alterna para ela
        try{
        if (movideskAba != null) {
            driver.switchTo().window(movideskAba);
        } else {
            // Se não encontrou, abre uma nova aba e acessa o site
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://oralsinf.movidesk.com/Ticket/Edit/125339");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Não foi possível abrir o navegador, tente novamente.");
        }
    }
    public void createTicket(){
        new Actions(driver).keyDown(Keys.ALT).sendKeys("t").keyUp(Keys.ALT).perform();
    }
    
    public void selectService(){
        clickElement(By.xpath("//*[@id=\"ticket-sidebar\"]/div[2]/div[7]/div/a"));
    }
    
    public void selectCategory(){
        clickElement(By.xpath("select2-chosen-17"));
        clickElement(By.xpath("//li[contains(@class, 'select2-result') and .//div[contains(normalize-space(), 'Solicitação de serviço')]]"));
    }
    
    public void selectUrgency(){
        clickElement(By.xpath("select2-chosen-21"));
            
        clickElement(By.xpath("//li[contains(@class, 'select2-result')]//div[contains(text(), 'Baixa')]"));
    }  
    
    public void selectSector(){     
        clickElement(By.xpath("select2-chosen-31"));
            
        clickElement(By.xpath("//li[contains(@class, 'select2-result')]//div[contains(normalize-space(), 'Recepção')]"));
    } 
}
