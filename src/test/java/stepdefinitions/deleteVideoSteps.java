package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class deleteVideoSteps {
	@Steps
	steps.deletevideoSteps deletevideo;
	
	@When("Log into application")
	public void logintoapplication() throws InterruptedException, IOException {
		deletevideo.logintoapplication();
		
	}
	
	@Then("Navigate to MyContent")
	public void navigatetomcontentandclickuploadvideo() throws InterruptedException {
		deletevideo.navigatetomcontent();
	}
	@Then("Click on delete option of video")
	public void clickondelete() {
		deletevideo.clickondelete();
	}
}
