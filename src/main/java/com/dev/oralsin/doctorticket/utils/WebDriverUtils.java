package com.dev.oralsin.doctorticket.utils;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author samueelg
 */
public class WebDriverUtils {
    private final WebDriver driver;
    
    public WebDriverUtils(WebDriver driver){
        this.driver = driver;
    }
    
        public WebDriver getDriver() {
        return driver;
    }
}
