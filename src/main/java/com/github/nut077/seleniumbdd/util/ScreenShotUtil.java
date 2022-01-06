package com.github.nut077.seleniumbdd.util;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Lazy
@Component
@RequiredArgsConstructor
public class ScreenShotUtil {

  private final TakesScreenshot driver;

  @Value("${screenShot.path}")
  private Path screenshotPath;

  public void takeScreenShot() throws IOException {
    File sourceFile = driver.getScreenshotAs(OutputType.FILE);
    //FileCopyUtils.copy(sourceFile, new File(screenshotPath + "/img.png"));
    FileCopyUtils.copy(sourceFile, screenshotPath.resolve(sourceFile.getName()).toFile());
  }

  @SneakyThrows
  @PostConstruct
  private void init() {
    for (int i = 0; i < 10; i++) {
      Thread.sleep(1000);
      System.out.println("sleeping.. " + i);
    }

  }
}
