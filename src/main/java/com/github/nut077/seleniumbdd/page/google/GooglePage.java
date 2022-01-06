package com.github.nut077.seleniumbdd.page.google;

import com.github.nut077.seleniumbdd.page.Base;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class GooglePage extends Base {

  private final SearchComponent searchComponent;
  private final SearchResult searchResult;

  @Value("${application.url}")
  private String url;

  public void goTo() {
    driver.get(url);
  }

  @Override
  public boolean isAt() {
    return searchComponent.isAt();
  }
}
