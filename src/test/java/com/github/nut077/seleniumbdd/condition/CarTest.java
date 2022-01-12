package com.github.nut077.seleniumbdd.condition;

import com.github.nut077.seleniumbdd.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CarTest extends SpringBaseTestNGTest {

  @Autowired
  private Car car;

  @Test
  void test() {
    car.run();
  }
}
