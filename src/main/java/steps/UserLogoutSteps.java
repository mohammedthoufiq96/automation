package steps;

import java.awt.AWTException;
import net.thucydides.core.annotations.Step;

public class UserLogoutSteps {

  pages.UserLogout logout;

  @Step("Logout option is not Displayed")
  public void logoutnotdisplayed() throws InterruptedException {

    logout.logoutisnotdisplayed();
  }

  @Step("Click On Logout link")
  public void clickonlogout() throws InterruptedException, AWTException {

    logout.Clickonlogout();
  }

  @Step("User is reverted back to not authenticated users view")
  public void notauthenticated() throws InterruptedException {

    logout.signiisdisplayed();
  }
}
