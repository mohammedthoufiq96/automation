package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Resetpasswordsteps {

	@Steps
	steps.ResetpasswordSteps resetpass;
	steps.MContentSteps content;
	int invalidtype;
	
	
	@When("User Access the application and click on sign")
	public void user_access_the_application_and_click_on_sigin() throws InterruptedException {
//		resetpass.navigate();
		resetpass.validateuserclickonsignin();
	}
	
	@Then("Click on reset password link")
	public void click_on_reset_ppassword_link() {
		resetpass.click_reset_password_link();
	}
	
	@Then("Validate the text field to enter the email id")
	public void validate_email_id_field() {
		resetpass.validate_email_id_field();
		}
	
	@Then("^Enter  \"([^\"]*)\" and click reset Password and validate the invalid email error message \\\"([^\\\"]*)\\\"$")
	public void enterEmailandclickresetpassword(String string,String string2) {
		System.out.println(string);
		resetpass.enterEmailandclickresetpassword(string,string2);
//		resetpass.enterEmailandclickresetpassword(string);
		
	}
//	@Then("^Enter  \"([^\"]*)\" and click reset Password and validate the invalid email error message \\\"([^\\\"]*)\\\"$")
//	@Then("Enter  {string} and click reset Password and validate the invalid email error message {string}")
//	public void enter_and_click_reset_password(String string,String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println(string2);
////		resetpass.enterEmailandclickresetpassword(string,string);
////	    throw new io.cucumber.java.PendingException();
//	}
	
//	
//	@Then("validate the invalid email error message")
//	public void validatetheinvalidErrorMessage() {
//		resetpass.validatetheinvalidErrorMessage();
//		
//	}
	
	@Then("without entering email address and  validate the reset password button is disabled")
	public void withoutEnteringemailaddressandclickresetpassowrd() {
		resetpass.withoutEnteringemailaddressandclickresetpassowrd();
	}
	
	
	
	
	@Then("click on the close")
	public void Click_on_the_close() {
		resetpass.click_on_the_close();
	}
}
