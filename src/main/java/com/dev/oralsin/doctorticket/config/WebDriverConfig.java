package com.dev.oralsin.doctorticket.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author samuel-not
 */
@Configuration
public class WebDriverConfig {

    public WebDriver webDriver(){
         ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        return new ChromeDriver(options);
    }
}
