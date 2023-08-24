package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GuestUserSteps {

	@Steps
	steps.MContentSteps content;
	steps.commentsSectionSteps comment;
	steps.videosSteps videos;

	steps.MbrowsePageSteps mbrowserpage;
	steps.videoCategoriesSteps videocategories;
	steps.videoAdsSteps videoAdsSteps;

	@Given("User access the application")
	public void user_access_the_application() {
		content.navigate();
	}

	@When("User access the application and expand side menu")
	public void user_access_the_application_and_expand_side_menu() throws InterruptedException {
		content.ClickToMenubar();
	}

	@Then("validate the side menu options enabled to the guest user")
	public void validate_the_side_menu_options_enabled_to_the_guest_user() {
		content.BeforeLoginSideBarVisible();

	}

	@Then("validate the Header section")
	public void validate_the_header_section() throws InterruptedException {
		content.HeaderVisible();
	}

	@Then("validate the home page sections enabled to the guest user")
	public void validate_the_home_page_sections_enabled_to_the_guest_user() {
		content.validateHomepageOptions();
	}

	@Then("validate the footer section")
	public void validate_the_footer_section() {
		content.footersection();
		content.footervisible();

	}

	@When("Guest user access the application and Click on a video")
	public void guest_user_access_the_application_and_click_on_a_video() throws InterruptedException {
		content.clickonvideo();
	}

	@Then("validate the video player user option")
	public void validate_the_video_player_user_option() {
		content.validatevideoplayeroption();
	}

	@Then("Click on user option and validated the sigin pop-up display")
	public void click_on_user_option() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		content.clickonuseroption();
//		throw new io.cucumber.java.PendingException();
	}

//	@Then("validated the sigin pop-up display")
//	public void validated_the_sigin_pop_up_display() throws InterruptedException, IOException {
//		content.registereduserlogin();
////    throw new io.cucumber.java.PendingException();
//	}

	@Then("Validate the video details displayed")
	public void validate_the_video_details_displayed() throws InterruptedException {
		content.videodetailsdisplayed();
//		throw new io.cucumber.java.PendingException();
	}

	@When("User access the application and Click on sigin")
	public void user_access_the_application_and_click_on_sigin() throws InterruptedException, IOException {
		content.registereduserlogin();

	}

	@When("login to the application")
	public void login_to_the_application() throws InterruptedException {
		content.ClicktoSignin();

	}

	@Then("validate the side menu options enabled to the login user")
	public void validate_the_side_menu_options_enabled_to_the_login_user() {
		content.AfterLoginSideBarVisible();

	}

	@Then("validate the home page sections enabled to the login user")
	public void validate_the_home_page_sections_enabled_to_the_login_user() {
		content.validateHomepageOptions();

	}

	@When("Guest user click on the banner")
	public void guest_user_click_on_the_banner() {
		content.HeroBanner();
//    throw new io.cucumber.java.PendingException();
	}

	@Then("Login to the applicaiton")
	public void login_to_the_applicaiton() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
	
		content.myplaysignin();
//    throw new io.cucumber.java.PendingException();
	}

	@Then("Refresh the page")
	public void refresh_the_page() {
		// Write code here that turns the phrase above into concrete actions
		content.refresh_the_page();
//		throw new io.cucumber.java.PendingException();
	}

@Then("The user should be login, the Signin pop-up should not be displayed")
public void the_user_should_be_login_the_signin_pop_up_should_not_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
	content.the_user_should_be_login_the_signin_pop_up_should_not_be_displayed();
//    throw new io.cucumber.java.PendingException();
}
//
@When("Navigate to the Myplay Section")
public void navigate_to_the_myplay_section() {
	content.navigate_to_the_myplay_section();
}
//
@When("Click on Myplay video")
public void click_on_myplay_video() {
    // Write code here that turns the phrase above into concrete actions
	content.clickonmyplay();
//    throw new io.cucumber.java.PendingException();
}

@Then("validated the sigin pop-up display")
public void validatethesignuppopup() throws InterruptedException {
	content.validatethesignuppopup();
}
//
@Then("close the Signin Pop-up")
public void close_the_signin_pop_up() {
    // Write code here that turns the phrase above into concrete actions
	content.signuppopclose();
//    throw new io.cucumber.java.PendingException();
}
//
@Then("Click on Myplay video from Suggestion videos")
public void click_on_myplay_video_from_suggestion_videos() {
    // Write code here that turns the phrase above into concrete actions
	content.click_on_myplay_video_from_suggestion_videos();
//    throw new io.cucumber.java.PendingException();
}
//
@Then("Myplay video should start playing")
public void myplay_video_should_start_playing() {
    // Write code here that turns the phrase above into concrete actions
	content.myplay_video_should_start_playing();
//    throw new io.cucumber.java.PendingException();
}
@Then("close the Signin")
public void close_the_signin() {
    // Write code here that turns the phrase above into concrete actions
	content.signinpclose();
//    throw new io.cucumber.java.PendingException();
}

}

