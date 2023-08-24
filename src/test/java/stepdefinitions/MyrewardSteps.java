package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyrewardSteps {
	

   @Steps
   steps.myRewardSteps rewards;
   
   @When("Login to application")
   public void logintoApllication() throws InterruptedException, IOException {
	   rewards.logintoApp();
   }
   
   @Then("Navigate to Myrewards page from the side menu")
   public void navigatetomyrewardspagefromsidemenu() {
	   rewards.navigatetomyrewardspagefromsidemenu();
   }
   
   @Then("Verify the details displayed in the My rewards page")
   public void verfiytheDetailsinmyrewardpage() {
	   rewards.verfiytheDetailsinmyrewardpage();
   }
   @Then("Click on the download links")
   public void clickonDownloadlinks() {
	   rewards.clickondownloadlinks();
   }

}
