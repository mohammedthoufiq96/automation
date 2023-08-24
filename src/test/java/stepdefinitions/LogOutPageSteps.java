package stepdefinitions;

import io.cucumber.java.en.Then;
import java.awt.AWTException;
import net.thucydides.core.annotations.Steps;

public class LogOutPageSteps {

  @Steps steps.UserLogoutSteps userlogout;

  @Then("user clicks on the logout link to revert back to not authenticated users view.")
  public void user_clicks_on_the_logout_link_to_revert_back_to_not_authenticated_users_view()
      throws InterruptedException, AWTException {

    userlogout.clickonlogout();

    userlogout.notauthenticated();
  }

  @Then("user validates that logout option is not available on the home page.")
  public void user_validates_that_logout_option_is_not_available_on_the_home_page()
      throws InterruptedException {

    userlogout.logoutnotdisplayed();
  }
}
