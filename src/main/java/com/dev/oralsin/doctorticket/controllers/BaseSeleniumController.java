/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.controllers;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author samueelg
 */
public abstract class BaseSeleniumController {
    
    public void initGoogle(WebDriver driver){
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
            driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
            driver.get("https://oralsinf.movidesk.com/Ticket/Edit/125339");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Não foi possível abrir o navegador, tente novamente.");
        }
    }
    public void createTicket(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ALT).sendKeys("t").keyUp(Keys.ALT).perform();
    }
    
    public void selectService(WebDriverWait wait){
        WebElement seletorServico = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ticket-sidebar\"]/div[2]/div[7]/div/a")));
        seletorServico.click();
    }
    
    public void selectCategory(WebDriverWait wait){
        WebElement seletorCategoria = wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-chosen-17")));
        seletorCategoria.click();
            
        WebElement opcao = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@class, 'select2-result') and .//div[contains(normalize-space(), 'Solicitação de serviço')]]")));
        opcao.click();    
    }
    
    public void selectUrgency(WebDriverWait wait){
        WebElement seletorUrgencia = wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-chosen-21")));
        seletorUrgencia.click();
            
        WebElement opcService = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@class, 'select2-result')]//div[contains(text(), 'Baixa')]")));
        opcService.click();
    }  
    
    public void selectSector(WebDriverWait wait){     
        WebElement seletorSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-chosen-31")));
        seletorSetor.click();
            
        WebElement opcService = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@class, 'select2-result')]//div[contains(normalize-space(), 'Recepção')]")));
        opcService.click();
    } 
}
