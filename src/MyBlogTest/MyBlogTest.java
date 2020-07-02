package src.MyBlogTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import src.MyBlogPage.MyBlogPage;


public class MyBlogTest extends BaseIT {

  MyBlogPage myBlogPage = new MyBlogPage(driver);

  @Before
  public void open() {
    getDriver().get("https://fatimaspeaks.com/");
  }







}