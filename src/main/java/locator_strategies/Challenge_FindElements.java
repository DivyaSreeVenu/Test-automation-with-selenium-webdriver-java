package locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;

public class Challenge_FindElements extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");
    WebElement imageButton = driver.findElement(By.id("imageButton"));
    WebElement input = driver.findElement(By.cssSelector("input[value='Click']"));
    WebElement nameTxtbox = driver.findElement(By.name("id-name2"));

    driver.quit();
  }
}