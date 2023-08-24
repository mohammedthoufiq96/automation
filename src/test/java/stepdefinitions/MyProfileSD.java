package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyProfileSD {

  @Steps steps.MyProfileSteps mp;

	
	
	@Given("User access the application and navigates to MyProfile")
	public void user_access_the_application_and_navigates_to_my_profile() throws InterruptedException, IOException {
		mp.navigate();
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////
//
//	
	@Then("verify the features of MyProfile are correct")
	public void verify_the_features_of_my_profile_are_correct() {
//		mp.clickEditProfile();
		mp.validateFeatures();
	}

  @When("user clicks on the edit profile link")
  public void user_clicks_on_the_edit_profile_link() {
    mp.clickEditProfile();
  }

//  @Then("verify the edit profile pop-up is displayed")
//  public void verify_the_edit_profile_pop_up_is_displayed() {
//    mp.editProfilePopUp();
//  }

  @Then("the correct fields should be available to edit")
  public void the_correct_fields_should_be_available_to_edit() {
    mp.verfiyFields();
  }

	
	@When("user edits location and submits changes")
	public void user_edits_location_and_submits_changes() throws InterruptedException {
		mp.editLocation();
	}

//  @Then("changes should be successfully updated")
//  public void changes_should_be_successfully_updated() {
//    mp.validateProfileUpdate();
//  }
  //
  //
  /////////////////////////////////////////////////////////////////////////////////////////////
  //
  //
  @When("user clicks on the change password button")
  public void user_clicks_on_the_change_password_button() {
    mp.clickChangePassword1();
  }

//  @Then("verify the correct pop-up is displayed")
//  public void verify_the_correct_pop_up_is_displayed() {
//    mp.validatePasswordPopUp();
//  }

  @When("user enters valid matching passwords")
  public void user_enters_valid_matching_passwords() throws IOException {
    mp.misMatchingPasswords();
  }

//  @When("clicks submit")
//  public void clicks_submit() {
//    mp.clickSubmit();
//  }

//  @When("user attempts to log in with the old password")
//  public void user_attempts_to_log_in_with_the_old_password() {
//    mp.logInWithOldPassword();
//  }

//  @Then("the login should fail with the correct error message")
//  public void the_login_should_fail_with_the_correct_error_message() {
//    mp.verifyOldPasswordError();
//  }

  @When("user attempts to log in with the new password")
  public void user_attempts_to_log_in_with_the_new_password() {
    mp.logInWithNewPassword();
  }
//  @When("user attempts to log in with the new password")
//  public void user_attempts_to_log_in_with_the_new_password() {
//    mp.logInWithNewPassword();
//  }

  /////////////////////////////////////////////////////////////////////////////////////////////////

  //
  @When("user clicks on the change password button1")
  public void user_clicks_on_the_change_password_button1() {
    mp.clickChangePassword1();
  }

/////////////////////////////////////////////////////////////////////////////////////////////////
	
//
//	@When("user clicks on the change password button1")
//	public void user_clicks_on_the_change_password_button1() {
//		mp.clickChangePassword1();
//	}
	
	
	@When("user enters valid old password matching new passwords below eight char")
	public void user_enters_valid_old_password_matching_new_passwords_below_eight_char () throws IOException {
		mp.belowEight();
	}

	@Then("correct below eight error message should display")
	public void correct_error_message_should_display() throws IOException {
		mp.ValidateBelowEightError();
	}

	@When("user enters valid old password matching new passwords w\\/o uppercase")
	public void user_enters_valid_old_password_matching_new_passwords_w_o_uppercase() throws IOException {
		mp.withoutUpperCase();
	}
	
//	@Then("correct w\\/o uppercase error message should display")
//	public void correct_w_o_uppercase_error_message_should_display() throws IOException {
//		mp.validateUpperCaseError();
//	}

  @Then("correct w\\/o uppercase error message should display")
  public void correct_w_o_uppercase_error_message_should_display() throws IOException {
    mp.validateUpperCaseError();
  }

	@When("user enters valid old password matching new passwords w\\/o lowercase")
	public void user_enters_valid_old_password_matching_new_passwords_w_o_lowercase() throws IOException {
		mp.withoutLowerCase();
	}
	
	
	@Then("correct w\\/o lowercase error message should display")
	public void correct_w_o_lowercase_error_message_should_display() throws IOException {
		mp.validateLowerCaseError();
	}

	
	@When("user enters valid old password matching new passwords w\\/o any digits")
	public void user_enters_valid_old_password_matching_new_passwords_w_o_any_digits() throws IOException {
	    mp.withoutDigits();
	}
	

	@Then("correct w\\/o digits error message should display")
	public void correct_w_o_digits_error_message_should_display() throws IOException {
		 mp.validateWithoutDigits();
	}

	@When("user enters valid old password matching new passwords with restricted char")
	public void user_enters_valid_old_password_matching_new_passwords_with_restricted_char() throws IOException {
	    mp.withRestrictedChar();
	}
	
//	@Then("correct w\\/o restricted char error message should display")
//	public void correct_w_o_restricted_char_error_message_should_display() throws IOException {
//	    mp.validateRestrictedCharError();
//	}
	
	
	@When("user enters valid old password and mis-matching new passwords")
	public void user_enters_valid_old_password_and_mis_matching_new_passwords() throws IOException {
		mp.misMatchingPasswords();
	}
//	
//	@Then("correct mismatch error message should display")
//	public void correct_mismatch_error_message_should_display() throws IOException {
//		mp.validateMisMatchError();
//	}
//	

	@When("user enters invalid old password and valid new passwords")
	public void user_enters_invalid_old_password_and_valid_new_passwords() {
		mp.invalidOldPassword();
	}
	
//	@Then("correct invalid old password error message should display")
//	public void correct_invalid_old_password_error_message_should_display() throws IOException {
//	    mp.validateInvalidOldPasswordError();
//	}

  @Then("correct w\\/o restricted char error message should display")
  public void correct_w_o_restricted_char_error_message_should_display() throws IOException {
    mp.validateRestrictedCharError();
  }

//	@When("user enters valid old password matching new passwords with a space")
//	public void user_enters_valid_old_password_matching_new_passwords_with_a_space() throws IOException {
//	    mp.newPasswordWithSpace();
//	}
	
	@Then("correct no space erorr error message should display")
	public void correct_no_space_erorr_error_message_should_display() throws IOException {
	    mp.validateNewPasswordWithSpaceError();
	}

  @Then("correct mismatch error message should display")
  public void correct_mismatch_error_message_should_display() throws IOException {
    mp.validateMisMatchError();
  }

	@Then("correct no space error message should display")
	public void correct_no_space_error_message_should_display() throws IOException {
	    mp.validateOldPasswordWithSpaceError();
	}
//
///////////////////////////////////////////////////////////////////////////////////////////////
//	
//
	@When("user clicks on the deactivate\\/delete your account link")
	public void user_clicks_on_the_deactivate_delete_your_account_link() {
	   mp.clickDeactivatelink();
	}

  @Then("correct invalid old password error message should display")
  public void correct_invalid_old_password_error_message_should_display() throws IOException {
    mp.validateInvalidOldPasswordError();
  }

  @When("user enters valid old password matching new passwords with a space")
  public void user_enters_valid_old_password_matching_new_passwords_with_a_space() throws IOException {
    mp.newPasswordWithSpace();
  }

	@Then("click on the deactivate\\/delete your account link")
	@When("user clicks on the deactivate\\/delete your account link again")
	public void user_clicks_on_the_deactivate_delete_your_account_link_again() throws InterruptedException {
	    mp.clickDeactivateLinkAgain();
	}

	@Then("user should be logged out and the home page should be displayed")
	@Then("the user should be logged out and the home page should be displayed")
	public void the_user_should_be_logged_out_and_the_home_page_should_be_displayed() {
	   mp.verifyUserIsLoggedout();
	}
	@When("user tried to login with the deactivated account within x days")
	@When("user tried to login with the deactivated account")
	public void user_tried_to_login_with_the_deactivated_account() throws InterruptedException, IOException {
	    mp.attemptToLogIn();
	}

	@Then("login should success and user should able to click myprofile")
	public void login_should_fail_correct_error_message_should_display() throws IOException, InterruptedException {
	    mp.verifyloginafterDeactivation();
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////

  @Then("pop-up should close and user should be redirected to MyProfile")
  public void pop_up_should_close_and_user_should_be_redirected_to_my_profile() {
    mp.verifyPopUpCloses();
  }

//  @When("user clicks on the deactivate\\/delete your account link again")
//  public void user_clicks_on_the_deactivate_delete_your_account_link_again()
//      throws InterruptedException {
//    mp.clickDeactivateLinkAgain();
//  }

	@Then("user crops the picture and clicks on Submit")
	public void user_crops_the_picture_and_clicks_on_submit() throws InterruptedException {
		mp.cropPhotoAndSubmit();
	}

	@Then("verify the image is updated on all pages")
	public void verify_the_image_is_updated_on_all_pages() {
	   mp.verifyUpdatedImage();
	}
	@Given("Login and user clicks on the edit profile link")
	public void loginandclickeditprofile() throws IOException, InterruptedException {
		mp.loginandclickeditprofile();
	}
	@Then("click on change password")
	public void clickonchangepassword() {
		mp.clickonchangepassword();
	}
	@Then("Enter validdetails and change password")
	public void entervaliddetailstochangepassword() {
		mp.entervaliddetailstochangepassword();
	}
	@Then("verify success message of password change")
	public void verifysuccessmessage() {
		mp.verifysuccessmessage();
	}
	@Then("validate login with old and new password")
	public void loginwitholdandnewpassword() throws InterruptedException, IOException {
		mp.loginwitholdandnewpassword();
	}
}

