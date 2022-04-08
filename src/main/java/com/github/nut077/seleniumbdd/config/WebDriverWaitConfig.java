package com.github.nut077.seleniumbdd.config;

import com.github.nut077.seleniumbdd.annotation.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class WebDriverWaitConfig {

  @Value("${default.timeout:30}")
  private int timeout;

  @Bean
  public WebDriverWait webDriverWait(WebDriver driver) {
    return new WebDriverWait(driver, timeout);
  }
}
