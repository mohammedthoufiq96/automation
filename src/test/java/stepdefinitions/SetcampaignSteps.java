package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SetcampaignSteps {
	
	@Steps
	steps.SetCampaignsteps campaign;
	
	
	@When("Login to the application by a user who has an enough rewards and video uploaded.")
	public void logintoapp() throws InterruptedException, IOException {
		campaign.logintoApp();
		
	}
	@Then("Naviagate to Mycontent from the side menu.")
	public void navigatetomycontent() throws InterruptedException {
		campaign.navigatetomycontent();
	}
	@Then("Click on Set campaign option of a video")
	public void clickonsetcampaign() {
		campaign.clickonsetcampaign();
	}
	@Then("Click cancel or close button")
	public void clickoncancel() {
		campaign.clickoncancel();
	}
	@Then("Click on the Set Campaign option and Enter number of user and Enter rewards and Select the duration")
	public void Clickonsetcampaignandenternumberofusers() {
		campaign.Clickonsetcampaignandenternumberofusers();
	}
	@Then("Click on the next button and finish button")
	public void clickonnextandfinish() {
		campaign.clickonnextandfinish();
	}
	@Then("Verify the rewards updated when campaign is activated.")
	public void verifytherewardswhebcampaignisactiveted() {
		campaign.verifytherewardswhebcampaignisactiveted();
	}
	
	@When("Login to the application by a user")
	public void logintoappandnavigatetomycontent() throws InterruptedException, IOException {
		campaign.logintoApphaslowreward();
		campaign.navigatetomycontent();
	}
	@Then("Click on Set campaign option of a video in mycontent")
	public void clickonsetcampaignoptionofavideoinmycontent() {
		campaign.clickonsetcampaign();
	}
	@Then("Click on the Set Campaign option and Enter number of user and Enter rewards and Select the duration as invalid details")
	public void enterinvaliddetails() {
		campaign.enterinvaliddetails();
	}
}
