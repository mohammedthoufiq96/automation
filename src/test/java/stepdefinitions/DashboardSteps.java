package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class DashboardSteps {

	@Steps
	steps.MContentSteps content;
	steps.commentsSectionSteps comment;
	steps.videosSteps videos;

	steps.MbrowsePageSteps mbrowserpage;
	steps.videoCategoriesSteps videocategories;
	steps.videoAdsSteps videoAdsSteps;

	@Given("User access the application and login")
	public void user_access_the_application_and_login() throws IOException {

		content.navigate();

		content.guestuserlogin();
	}

	@When("User navigate to the Dashboard page")
	public void user_navigate_to_the_dashboard_page() throws InterruptedException {
		content.clickonDashboard();
	}

	@Then("Click on Myrewards and validate user navigation")
	public void click_on_myrewards_and_validate_user_navigation() throws InterruptedException {
		content.verifyMyRewards();

	}

	@Then("Click on Uploadvideo and validate user navigation")
	public void click_on_uploadvideo_and_validate_user_navigation() throws InterruptedException {
		content.uploadVideo();
	}

	@Then("Click on Viewprofile and validate user navigation")
	public void click_on_viewprofile_and_validate_user_navigation() throws InterruptedException {
//	content.viewprofile();
	}

	@Then("Click on ManageUpload and validate user navigation")
	public void click_on_manage_upload_and_validate_user_navigation() throws InterruptedException {

		content.manageUploads();
	}
}

