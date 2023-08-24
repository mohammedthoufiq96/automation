package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class editVideoSteps {
	
	@Steps
	steps.editVIdeo editvideo;
	
	@When("Login to the application by a user who has an uploaded videos")
	public void logintotheapplication() throws InterruptedException, IOException {
		editvideo.loginintoapp();
	}
	@Then("Navigate to the Mycontent")
	public void navigatetomycontent() throws InterruptedException {
		editvideo.navigatetomycontent();
	}
	@Then("Click on edit option of a video which you want to edit and Click next button")
	public void clickeditvideo() {
		editvideo.clickeditvideo();
		
	}
	@Then("Update the Visibility to Unlisted and complete edit process")
	public void updatethevisibility() {
		editvideo.updateVisibility();
	}
	@Then("Verify the unlisted video display on search results")
	public void verifythevideo() {
		editvideo.searchvideo();
	}
	@When("Login to the application and Navigate to the Mycontent section and Click on the Edit option of a video")
	@When("Login to the application and Navigate to the Mycontent and Click on the Edit option of a video")
	public void Logintoapp_and_clickeditvideo() throws InterruptedException, IOException {
		editvideo.loginintoapp();
		editvideo.navigatetomycontent();
		editvideo.clickeditvideo();
	}
	
	@Then("Empty the title and description field and click next")
	public void emptythetitleandclicknext() {
		editvideo.emptythetitlefield();
	}
	
	@Then("verify the validation message for titlepage")
	public void verifythevalidationmessagefortitlepage() {
		editvideo.verifythevalidationmessagefortitlepage();
	}
	
	@Then("Enter valid details and click next and click next on Audience and visibility")
	public void entervaliddetailsintitkepage() {
		editvideo.entervaliddetailsintitkepage();
	}
	
	@Then("Empty the fiels in category page and click submit button")
	public void emptyfieldsincategorypage() {
		editvideo.emptyfieldsincategorypage();
	}
	@Then("Verify the validation message for categorypage")
	public void verifyvalidationmessageincategory() {
		editvideo.verifyerrormessageincategory();
	}
	
	@Then("Enter the valid details in category and click submit")
	public void entervaliddetailsincategoryandclicksubmit() {
		editvideo.entervaliddetailsincategoryandclicksubmit();
	}
	
	@Then("Edit the details and click submit button")
	public void editthedetailsandclicksubmitbutton() {
		editvideo.editthedetailsandclicksubmitbutton();
	}
	
	@Then("validate the saved details")
	public void validatesaveddetails() {
		editvideo.validatesaveddetails();
	}
	@Then("Click on edit option of video and edit details and click cancel")
	public void clickeditvideooptionandeditdetailsandcancel() {
		editvideo.clickeditvideooptionandeditdetailsandcancel();
	}
	@Then("validate the details")
	public void validatethedetails() {
		editvideo.validatethedetails();
	}

}
