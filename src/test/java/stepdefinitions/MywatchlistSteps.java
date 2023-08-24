package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MywatchlistSteps {
	@Steps
	steps.MyWatchListSteps watch;
	
	@When("Access the app without login and play video")
	@When("Access the application without login and play the video on home page")
	public void accesstheapplicationandplaythevideo() {
		watch.accesstheapplicationandplaythevideo();
	}
	@Then("click on the save button and verify the signin pop")
	@Then("click on the save button and verify the signin pop up displayed or not")
	public void clicksavebutton() {
		watch.clicksaveButton();
	}
	@Then("Login to app and play the video")
	@Then("Login to application and play the video")
	public void logintoappandplayvideo() throws IOException {
		watch.logintoappandplayvideo();
	}
	@Then("click on the save button and Verify saved or not")
	@Then("click on the save button and Verify save changed to saved")
	public void clicksaveButtonafterlogin() {
		watch.clicksaveButtonafterlogin();
	}
	@Then("Navigate to Mywatchlist from the side menu of app")
	@Then("Navigate to Mywatchlist from side menu and Verify the details of video")
	public void navigatetomywatchlistveridyvideo() {
		watch.navigatetomywatchlistveridyvideo();
	}
	@When("Login to application for mywatchlist count verify")
	@When("Login to the application by a user who has videos in Mycontent and Mywatchlist")
	public void logintoapp() throws InterruptedException, IOException {
		watch.logintoapp();
	}
	@Then("Navigate to the Mycontent from the side menu")
	public void navigatetomucontent() throws InterruptedException {
		watch.navigatetomucontent();
	}
	@Then("Click on any thumbnail or title of a video listed on the Manage video section as public")
	public void clickonthumnailaspublic() throws InterruptedException {
		watch.clickonthumnailaspublic();
	}
	@Then("Click on any thumbnail or title of a video listed on the Manage video section as unlisted")
	public void clickonthumbnailofunlistedvideo() {
		watch.clickonthumbnailofunlistedvideo();
	}
	@Then("Navigate to mywatchlist for count verify")
	@Then("Navigate to Mywatchlist from the side menu")
	public void navigatetomywatchlist() {
		watch.navigatetomywatchlist();
	}
	@Then("Click on any thumbnail or title of a video listed on the Mywatchlist")
	public void clickonthumbnailonthewatchlist() {
		watch.clickonthumbnailonthewatchlist();
	}
	@When("Login by user1 and save a video say video abc")
	public void loginbyuser1() throws InterruptedException {
		watch.loginbyuser1();
	}
	@Then("In another browser login with user 2 and access abc video")
	public void loginbyuser2() throws InterruptedException {
		watch.loginbyuser2();
	}
	@Then("Remove the video from watchlist")
	public void removevideo() {
		watch.removevideo();
	}
	@Then("Access the removed video and check save")
	public void accessremovedvideo() {
		watch.accessremovedvideo();
	}
	@Then("Access Multiple videos and click save button")
	public void accessmultiplevideoandsavebutton() {
		watch.accessmultiplevideoandsavebutton();
	}
	@Then("verify the count and list on mywatchlist page")
	public void verifythecount() {
		watch.verifythecount();
	}

}
