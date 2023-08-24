package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DownloadvideoSteps {

		@Steps
		steps.Downloadvideo downloadvideo;
		
	@When("Login to application with valid user details")
	public void logintotheapplication() throws InterruptedException, IOException {
		downloadvideo.logintoapp();
		
	}
	
	@Then("Navigate to mycontent section on sidemenu")
	public void navigatetomycontent() throws InterruptedException {
		downloadvideo.navigatetomycontent();
		
	}
	@Then("Click on the download video button")
	public void clickondownloadvideobutton() { 
		downloadvideo.clickdownloadbtn();
		
	}
}
