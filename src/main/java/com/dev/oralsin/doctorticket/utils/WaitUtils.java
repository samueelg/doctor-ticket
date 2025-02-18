/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.utils;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author samueelg
 */
public class WaitUtils {
    private WebDriverWait wait;

    public WaitUtils(WebDriver driver, int segundos) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
    }
    public WebElement esperarElementoClicavel(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
