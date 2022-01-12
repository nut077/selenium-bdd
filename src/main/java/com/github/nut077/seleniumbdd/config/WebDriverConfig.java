package com.github.nut077.seleniumbdd.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!remote")
@Configuration
public class WebDriverConfig {

  @Bean
  //@Primary
  @ConditionalOnProperty(name = "browser", havingValue = "firefox")
  public WebDriver firefoxDriver() {
    WebDriverManager.firefoxdriver().setup();
    return new FirefoxDriver();
  }

  @Bean
  //@ConditionalOnProperty(name = "browser", havingValue = "chrome")
  @ConditionalOnMissingBean // If not found bean it used this and must write code last line
  public WebDriver chromeDriver() {
    WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
  }
}
