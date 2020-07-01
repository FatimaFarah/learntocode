package src.MyBlogPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.BasePage;


public class MyBlog extends BasePage {

  public MyBlog(WebDriver driver) {
    super(driver);
  }

  String URL = "https://fatimaspeaks.com/";


  private boolean checkIfPageTitleIsDisplayed() {
   return getDriver().findElement(By.cssSelector(".home")).isDisplayed();
  }

  private boolean checkIfPageSubheadingIsDisplayed() {
    return getDriver().findElement(By.cssSelector(".site-description")).isDisplayed();
  }




}
