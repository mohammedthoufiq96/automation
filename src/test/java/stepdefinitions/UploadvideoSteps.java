package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UploadvideoSteps {

	
	@Steps
	steps.UploadVideoSteps uploadvideo;
	
	@When("Login into the application")
	public void logintoapplication() throws InterruptedException, IOException {
		uploadvideo.logintoapplication();
	}
	
	@Then("Navigate to MyContent section and click on upload video")
	public void navigatetomcontentandclickuploadvideo() {
		uploadvideo.navigatetomcontentandclickuploadvideo();
	}
	@Then("Click browse from device button and select file to upload")
	public void clickbrwsefromdevice() {
		uploadvideo.clickbrwsefromdevice();
	}
	@Then("Click cancel button")
	public void clickCancel() {
		uploadvideo.clickcancel();
	}
	@Then("click next button")
	public void clicknext() throws InterruptedException {
		uploadvideo.clicknext();
	}
	@Then("Enter Title,description,thumbnail and click next")
	public void enterTitledescriptionthumbnail() {
		uploadvideo.enterTitledescriptionthumbnail();
	}
	@Then("Select all field values with visibility as Public")
	public void selectaspublic() {
		uploadvideo.selectsapublic();
	}
	@Then("Select all field values in the Category and language")
	public void selectcategoryandlangugae() {
		uploadvideo.selectcategoryandlangugae();
	}
	@Then("click on upload video on header of the application")
	public void clickonuploadvideoheader() {
		uploadvideo.clickonuploadvideoheader();
	}
}
