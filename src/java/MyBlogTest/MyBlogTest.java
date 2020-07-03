package MyBlogTest;

import org.junit.Before;
import org.junit.Test;
import MyBlogPage.MyBlogPage;


public class MyBlogTest extends BaseIT {

  private MyBlogPage myBlogPage;


  // TODO: 02/07/2020  figure out why tests are being ignored
  // TODO: 02/07/2020 finish writing tests for finding subheading and clicking menu tab

  @Before
  public void openURL() {
    getDriver().get("https://fatimaspeaks.com/");
  }

  @Test
  public void checkIfPageTitleIsDisplayed() {
    myBlogPage.checkIfPageTitleIsDisplayed();
  }

  @Test
  public void checkIfPageSubtitleIsDisplayed(){
    myBlogPage.checkIfPageSubheadingIsDisplayed();
  }

  @Test
  public void clickFeminismMenuTab() {
    myBlogPage.clickFeminismTab();
  }


}