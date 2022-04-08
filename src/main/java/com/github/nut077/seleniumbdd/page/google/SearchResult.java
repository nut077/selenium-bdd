package com.github.nut077.seleniumbdd.page.google;

import com.github.nut077.seleniumbdd.annotation.Page;
import com.github.nut077.seleniumbdd.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
public class SearchResult extends Base {

  @FindBy(css = "div.yuRUbf")
  private List<WebElement> results;

  public int getCount() {
    return results.size();
  }

  @Override
  public boolean isAt() {
    return wait.until(e -> !results.isEmpty());
  }
}
