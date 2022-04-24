package com.github.nut077.seleniumbdd.config;

import com.github.javafaker.Faker;
import com.github.nut077.seleniumbdd.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

  @Bean
  public Faker getFaker() {
    return new Faker();
  }
}
