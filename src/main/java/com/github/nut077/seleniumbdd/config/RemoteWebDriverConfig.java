package com.github.nut077.seleniumbdd.config;

import com.github.nut077.seleniumbdd.annotation.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import java.net.URL;

@LazyConfiguration
@Profile("remote")
public class RemoteWebDriverConfig {

  @Value("${selenium.grid.url}")
  private URL url;

  @Bean
  @ConditionalOnProperty(name = "browser", havingValue = "firefox")
  public WebDriver remoteFirefoxDriver() {
    return new RemoteWebDriver(this.url, DesiredCapabilities.firefox());
  }

  @Bean
  @Scope("prototype")
  @ConditionalOnMissingBean
  public WebDriver remoteChromeDriver() {
    return new RemoteWebDriver(this.url, DesiredCapabilities.chrome());
  }
}
