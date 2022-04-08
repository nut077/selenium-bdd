package com.github.nut077.seleniumbdd.googletest;

import com.github.nut077.seleniumbdd.SpringBaseTestNGTest;
import com.github.nut077.seleniumbdd.page.google.GooglePage;
import com.github.nut077.seleniumbdd.util.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTest2 extends SpringBaseTestNGTest {

  @Autowired
  private GooglePage googlePage;

  @Lazy
  @Autowired
  private ScreenShotUtil screenShotUtil;

  @Test
  public void googleTest() throws IOException {
    googlePage.goTo();
    Assert.assertTrue(googlePage.isAt());

    //Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

    googlePage.getSearchComponent().search("github/nut077");
    Assert.assertTrue(googlePage.getSearchResult().isAt());
    Assert.assertTrue(googlePage.getSearchResult().getCount() > 1);
    //screenShotUtil.takeScreenShot();
  }
}
