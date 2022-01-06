package com.github.nut077.seleniumbdd.page.google;

import com.github.nut077.seleniumbdd.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
