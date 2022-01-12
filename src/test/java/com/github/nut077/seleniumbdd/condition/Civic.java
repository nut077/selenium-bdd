package com.github.nut077.seleniumbdd.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} < 80")
public class Civic implements Car {

  @Override
  public void run() {
    System.out.println("This is Civic. Speed is 60");
  }
}
