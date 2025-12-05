package locator_strategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;

public class FindingAnElement extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");
    WebElement emailtb = driver.findElement(By.id("email"));
    emailtb.sendKeys("test@1");
    List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type='radio']"));
    System.out.println("Number of radio buttons:" + radiobuttons.size());

    driver.quit();
  }
}
