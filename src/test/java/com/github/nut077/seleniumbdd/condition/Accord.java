package com.github.nut077.seleniumbdd.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} >= 80")
public class Accord implements Car {

  @Override
  public void run() {
    System.out.println("This is Accord. Speed is 80");
  }
}
