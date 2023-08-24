
package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class SigninSteps {

	@Steps
	steps.MContentSteps content;
	steps.commentsSectionSteps comment;
	steps.videosSteps videos;

	steps.MbrowsePageSteps mbrowserpage;
	steps.videoCategoriesSteps videocategories;
	steps.videoAdsSteps videoAdsSteps;
	
	
	@When("Access the application and click on signin from header")
	@When("Access the application and click on signin on sidemenu")
	@When("user clicks on sigin link displayed at the header right corner")
	public void user_clicks_on_sigin_link_displayed_at_the_header_right_corner1() throws InterruptedException {
//	content.navigate();
		content.validateuserclickonsignin();
	}
	
	@Then("verify signup pop displayed")
	@Then("verify the details of the signin pop-up")
	public void verify_the_details_of_the_signin_pop_up1() throws InterruptedException {
		content.validatesigninpopupdetails();
//	 throw new io.cucumber.java.PendingException();

	}

	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() throws InterruptedException, IOException {
		content.enteringemailandpassword();
//    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the eye-logo when clicked the password field shows\\/hides the password")
	public void verify_the_eye_logo_when_clicked_the_password_field_shows_hides_the_password() {
		// Write code here that turns the phrase above into concrete actions
		content.verifypasswordeye();
		content.verifypasswordeye();
//    throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() throws InterruptedException {
		content.ClicktoSignin();
		// Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the homepage is shown with full content")
	public void verify_the_homepage_is_shown_with_full_content() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.AfterLoginSideBarVisible();
		content.Recommendedcategory();
		content.validatemostwatchedcategory();
		content.validatenewreleasescategory();
		content.validatetoptrendingcategory();
		content.HeaderVisible();
		content.footervisible();
//    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on sigin link displayed at the header right corner")
	public void user_clicks_on_sigin_link_displayed_at_the_header_right_corner() throws InterruptedException {
		content.validateuserclickonsignin();
	}

	@Then("Verify the details of the signin pop-up")
	public void verify_the_details_of_the_signin_pop_up() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatesigninpopupdetails();
//    throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid password and username with space end")
	public void user_enters_valid_password_and_username_with_space_end() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify user is logged in successfully")
	public void verify_user_is_logged_in_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User clicks sign-out button displayed at the header right corner")
	public void user_clicks_sign_out_button_displayed_at_the_header_right_corner() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User enters valid password and valid username with a space  middle")
	public void user_enters_valid_password_and_valid_username_with_a_space_middle() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify valid error message should be displayed")
	public void verify_valid_error_message_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid password  and username with space in the middle and end")
	public void user_enters_valid_password_and_username_with_space_in_the_middle_and_end() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters a valid username and password with a space in the beginning")
	public void user_enters_a_valid_username_and_password_with_a_space_in_the_beginning() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters a valid username and password with space at the end")
	public void user_enters_a_valid_username_and_password_with_space_at_the_end() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters a valid username and password with space in the start middle and end")
	public void user_enters_a_valid_username_and_password_with_space_in_the_start_middle_and_end() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters a valid username and an invalid password")
	public void user_enters_a_valid_username_and_an_invalid_password() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the reset password link")
	public void user_clicks_on_the_reset_password_link() {
		content.clickresetpassword();
	}

	@Then("User should be navigated to the forgot password flow")
	public void user_should_be_navigated_to_the_forgot_password_flow() {
		content.forgotpasswordflow();
	}

	@When("User clicks on the sign up link")
	public void user_clicks_on_the_sign_up_link() {
		content.clicksignuplink();
	}

	@Then("The user should be navigated to the registration flow")
	public void the_user_should_be_navigated_to_the_registration_flow() {
		content.verifysignuppopup();
	}
	@When("Access the application")
	public void accesstheapplication() {
		content.accesstheapplication();
	}
	@Then("click on sign in")
	public void clickonsignin() throws InterruptedException {
		content.clickonsignin();
	}
	@Then("click on google login and verify logged in or not")
	public void clickongooglelogin() throws InterruptedException {
		content.clickongooglelogin();
	}
	@Then("^Enter login details with \"([^\"]*)\" and validate \\\"([^\\\"]*)\\\"$")
	@Then("Enter login details with {string} and validate the {string}")
	public void enterLogindetailsandvalidate(String string,String string2) throws InterruptedException, IOException {
		content.enterLogindetailsandvalidate(string,string2);
	}
	@Then("^Enter \"([^\"]*)\" and validate \\\"([^\\\"]*)\\\"$")
	@Then("Enter {string} and validate the {string}")
	public void enterinvalidemailandvalidate(String string,String string2) throws InterruptedException, IOException {
		content.enterinvalidemailandvalidate(string,string2);
	}
	
	@Then("Access the video and click on signin to add comment and verify signup popup displayed")
	public void clickcommentsignin() throws InterruptedException {
		content.clickcommentsignin();
		content.validatesigninpopupdetails();
	}
	@Then("Login and verify the add comment")
	public void loginandverifytheaddcomment() throws InterruptedException, IOException {
		content.loginandverifytheaddcomment();
	}
	@Then("click on any video and click share and verify signuppopup displayed or not")
	public void clickonanyvideoandverifysignuppop() throws IOException {
		content.clickonanyvideoandverifysignuppop();
	}
	@When("Access the application and click on signin button on header of application")
	public void accessandclickonsigninforverify() throws IOException {
		content.accessandclickonsigninforverify();
	}

}

