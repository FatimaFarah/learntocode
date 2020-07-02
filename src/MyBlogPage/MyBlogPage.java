package src.MyBlogPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyBlogPage extends BasePage {


  public MyBlogPage(WebDriver driver) {
    super(driver);
  }

 private WebElement getPageTitle(){
    return getDriver().findElement(By.cssSelector(".home"));
  }

  public void checkIfPageTitleIsDisplayed() {
    getPageTitle().isDisplayed();
  }

  private WebElement getSubheading() {
    return getDriver().findElement(By.cssSelector(".site-description"));
  }

  public void checkIfPageSubheadingIsDisplayed() {
   getSubheading().isDisplayed();
  }

  private WebElement getFeminismSubheading() {
    return getDriver().findElement(By.cssSelector("#menu-item-660"));
  }

  public void clickFeminismTab() {
    getFeminismSubheading().click();
  }


}

