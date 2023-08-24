package pages;

import base.BasePage;
import java.awt.AWTException;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://devmyco.net/videohome?v=632dce71dd6c0576d33296a0")
public class UserLogout extends BasePage {

  String Logout = "xpath=//div[contains(text(),'Logout')]";
  String Email = "css=input[placeholder='example@mail.com']";
  String doubleline =
      "css=body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) >"
          + " ul:nth-child(1) > li:nth-child(9) > a:nth-child(2) > span:nth-child(1) >"
          + " img:nth-child(1)";
  String myco = "css=div[class='ml-[70px] sm:ml-[110px] h-[41px] w-[100px]'] span a";
  String SigninMenuItem = "xpath=//div[normalize-space()='Sign in']";

  public void Clickonlogout() throws InterruptedException, AWTException {

    click(myco);

    Actions act1 = new Actions(getDriver());
    for (int i = 1; i <= 8; i++) {
      act1.sendKeys(Keys.TAB).build().perform();
      Thread.sleep(1000);
    }

    click(Logout);
  }

  public void logoutisnotdisplayed() throws InterruptedException {

    pageload();

    isNotDisplayed(Logout);
  }

  public void signiisdisplayed() throws InterruptedException {

    Thread.sleep(3000);

    isDisplayed(SigninMenuItem);
  }
}
