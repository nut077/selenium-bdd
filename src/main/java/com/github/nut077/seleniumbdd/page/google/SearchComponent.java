package com.github.nut077.seleniumbdd.page.google;

import com.github.nut077.seleniumbdd.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchComponent extends Base {

  @FindBy(name = "q")
  private WebElement searchBox;

  @FindBy(name = "btnK")
  private List<WebElement> searchBtn;

  public void search(final String keyword) {
    searchBox.sendKeys(keyword);
    searchBtn.stream()
        .filter(e -> e.isDisplayed() && e.isEnabled())
        .findFirst()
        .ifPresent(WebElement::click);
  }

  @Override
  public boolean isAt() {
    return wait.until(e -> searchBox.isDisplayed());
  }
}
