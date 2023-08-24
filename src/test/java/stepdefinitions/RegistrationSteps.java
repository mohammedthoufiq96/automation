package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrationSteps {
	@Steps
	steps.MContentSteps content;
	steps.commentsSectionSteps comment;
	steps.videosSteps videos;
	steps.MbrowsePageSteps mbrowserpage;
	steps.videoCategoriesSteps videocategories;
	steps.videoAdsSteps videoAdsSteps;

	@When("Navigates to Registraion pop-up")
	public void navigates_to_registraion_pop_up() throws InterruptedException {
//        content.navigate();
		content.validateuserclickonsignin();
		content.signup();
	}

	@When("User enters valid registration details with an exisiting users username and clicks register")
	public void User_enters_valid_registration_details_with_an_exisiting_users_username_and_clicks_register()
			throws InterruptedException {
		content.Userentersvalidregistrationdetailswithanexisitingusersusername();
//    	content.clickRegisterbtn();

	}

	@When("Enter valid registration details and clicks register")
	public void enter_valid_registration_details_and_clicks_register() throws InterruptedException {
		content.enterRegisterUserData();
		content.clickRegisterbtn();
	}

	@Then("User should receive an email")
	public void user_should_receive_an_email() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.yolomailcheck();
//        throw new io.cucumber.java.PendingException();
	}

	@Then("Click on the click here link received")
	public void click_on_the_click_here_link_received() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Email should be verified")
	public void email_should_be_verified() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Login with the registerd details")
	public void login_with_the_registerd_details() throws InterruptedException {
//    	 content.navigate();
		content.registereduserloginaftermailverfication();

//        throw new io.cucumber.java.PendingException();
	}

	@Then("user should be login successfully")
	public void user_should_be_login_successfully() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.ClicktoSignin();
//        throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details except a missing @ in email and clicks register")
	public void user_enters_valid_registration_details_except_a_missing_in_email_and_clicks_register()
			throws InterruptedException {
		content.ClicktoSignin();
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the correct error message should be displayed")
	public void verify_the_correct_error_message_should_be_displayed() {
		content.validateUserNameError();
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a space in the start middle and end of email")
	public void user_enters_valid_registration_details_but_a_space_in_the_start_middle_and_end_of_email() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the correct error message is shown")
	public void verify_the_correct_error_message_is_shown() {
		content.validateUserNameError();
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a space in the middle of the email")
	public void user_enters_valid_registration_details_but_a_space_in_the_middle_of_the_email() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a space in the beginning and end of email")
	public void user_enters_valid_registration_details_but_a_space_in_the_beginning_and_end_of_email() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify a success message should be displayed and the confirmation email should be received.")
	public void verify_a_success_message_should_be_displayed_and_the_confirmation_email_should_be_received() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details with an exisiting users email and clicks register")
	public void user_enters_valid_registration_details_with_an_exisiting_users_email_and_clicks_register() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the correct validation message should be displayed")
	public void verify_the_correct_validation_message_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User navigates to the sign in pop-up")
	public void user_navigates_to_the_sign_in_pop_up() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User attempts to sign-in with the newly registered user")
	public void user_attempts_to_sign_in_with_the_newly_registered_user() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} error message should show")
	public void error_message_should_show(String string) {
		// Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
	}

//    @When("User enters valid registration details with an exisiting users username and clicks register")
//    public void user_enters_valid_registration_details_with_an_exisiting_users_username_and_clicks_register() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

	@Then("Verify {string} error message should show")
	public void verify_error_message_should_show(String string) {
		// Write code here that turns the phrase above into concrete actions
		content.verifysignuperrormessage(string);
	}

	@When("User enters valid registration details but a new username with a space in the middle and clicks register")
	public void user_enters_valid_registration_details_but_a_new_username_with_a_space_in_the_middle_and_clicks_register() throws InterruptedException {
		content.validatemultipleusername("space in the middle");
	}

	@When("User enters valid registration details but a new username with a space in the start middle and end and clicks register")
	public void user_enters_valid_registration_details_but_a_new_username_with_a_space_in_the_start_middle_and_end_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatemultipleusername("space in the start middle and end");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a new username with a space in the start and end and clicks register")
	public void user_enters_valid_registration_details_but_a_new_username_with_a_space_in_the_start_and_end_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatemultipleusername("space in the start and end");
//		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the success message should be displayed and user  should receive a verification email")
	public void verify_the_success_message_should_be_displayed_and_user_should_receive_a_verification_email() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validateregistersuccessandverifymail();
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a new username with a space at the end and clicks register")
	public void user_enters_valid_registration_details_but_a_new_username_with_a_space_at_the_end_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		content.validatemultipleusername("space at the end");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details and clicks register")
	public void user_enters_valid_registration_details_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatemultipleusername("valid registeration details");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the password field")
	public void user_clicks_on_the_password_field() {
		// Write code here that turns the phrase above into concrete actions
		content.userclickpassword();
	}

	@Then("Verify the password conditions information is displayed")
	public void verify_the_password_conditions_information_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		content.verifythepasswordcondition();
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a password including the restricted characters and clicks register")
	public void user_enters_valid_registration_details_but_a_password_including_the_restricted_characters_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("Restricted Characters");
//		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the correct error message is displayed")
	public void verify_the_correct_error_message_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		
		content.validatepassworderrormessage();
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a passwords less than eight characters and clicks register")
	public void user_enters_valid_registration_details_but_a_passwords_less_than_eight_characters_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("less than eight characters");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a passwords without any uppercase and clicks register")
	public void user_enters_valid_registration_details_but_a_passwords_without_any_uppercase_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("without any uppercase");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a passwords without any lowercase and clicks register")
	public void user_enters_valid_registration_details_but_a_passwords_without_any_lowercase_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("without any lowercase");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but a passwords without any numbers and clicks register")
	public void user_enters_valid_registration_details_but_a_passwords_without_any_numbers_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("without any numbers");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but the passwords have a space at the start and clicks register")
	public void user_enters_valid_registration_details_but_the_passwords_have_a_space_at_the_start_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("space at start");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but the passwords have a space at the end and clicks register")
	public void user_enters_valid_registration_details_but_the_passwords_have_a_space_at_the_end_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
		content.validatingmultiplepasswords("space at end");
	}

	@When("User enters valid registration details but the passwords have a space in the middle and clicks register")
	public void user_enters_valid_registration_details_but_the_passwords_have_a_space_in_the_middle_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("space in the middle");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details but the passwords have a space in the start middle and end and clicks register")
	public void user_enters_valid_registration_details_but_the_passwords_have_a_space_in_the_start_middle_and_end_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
		content.validatingmultiplepasswords("space in the start middle and end");
	}

	@When("User enters valid registration details but the passwords do not match and clicks register")
	public void user_enters_valid_registration_details_but_the_passwords_do_not_match_and_clicks_register() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.validatingmultiplepasswords("password doesnot match");
//		throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid registration details does not select t&c and clicks register")
	public void user_enters_valid_registration_details_does_not_select_t_c_and_clicks_register() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the  customer terms of service link")
	public void user_clicks_on_the_customer_terms_of_service_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the correct pdf opens up")
	public void verify_the_correct_pdf_opens_up() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the  privacy policy link")
	public void user_clicks_on_the_privacy_policy_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User click on the cookie policy link")
	public void user_click_on_the_cookie_policy_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the click here to sign in link displayed under the Register button")
	public void user_clicks_on_the_click_here_to_sign_in_link_displayed_under_the_register_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the sign in pop up is displayed")
	public void verify_the_sign_in_pop_up_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Given("Creates mailid")
	public void createmailid() throws InterruptedException, IOException {
		content.createmailid();
	}
	@When("click on signin on left side of application")
	public void clicksignin() throws InterruptedException {
		content.ClicktoSignin();
	}
	@Then("click on signup now on the bottom")
	public void clickonsignup() {
		content.clicksignuplink();
		
	}
	@Then("verify the fields")
	public void verifythefields() {
		content.verifysignupfields();
	}
	@Then("click close button")
	public void signuppopclose() {
			content.signuppopclose();
		}
	@When("User enters valid registration details but a email including with @ and clicks register")
	public void validateemailwithoutat() throws InterruptedException {
		content.validatemultipleemailregister("with @");
	}
	@When("User enters valid registration details but a email with space at start and ending clicks register")
	public void validatewithspaceatstart() throws InterruptedException {
		content.validatemultipleemailregister("with space at start");
	}
	@When("User enters valid registration details but a email with space at start middle and ending  and clicks register")
	public void validatewithspaceatend() throws InterruptedException {
		content.validatemultipleemailregister("with space at start middle and end");
	}
	@When("User enters valid registration details but a email with space at inbetween and clicks register")
	public void validatewithsapceatmiddle() throws InterruptedException {
		content.validatemultipleemailregister("with space at middle");
	}
//	@When("User enters valid registration details but a email including with @ and clicks register")
//	public void validatespacewithatall() throws InterruptedException {
//		content.validatemultipleemailregister("with space at start middle and end");
//	}
		
	
}
