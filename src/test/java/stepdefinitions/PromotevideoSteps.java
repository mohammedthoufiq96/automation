package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PromotevideoSteps {
	
	@Steps
	steps.PromotevideoSteps promote;
	
	@When("Login to application with valid crendentials")
	public void login_to_application() throws InterruptedException, IOException {
		promote.login_to_application();
		
		
	}
	@When("Login to application with low balance")
	public void login_to_applicationwithlowbalance() throws InterruptedException, IOException {
		promote.login_to_applicationwithlowbalance();
		
		
	}
	@Then("Navigate to mycontent section")
	public void navigatetomycontent() throws InterruptedException {
		promote.navigatetomycontent();
		
	}
	@Then("Click on promote video option")
	public void clickonpromote() throws InterruptedException{
		promote.clickonpromote();
		
	}
	@Then("Click on promote video option for low balance")
	public void clickonpromotemowbalance() throws InterruptedException{
		promote.clickonpromotemowbalance();
		
	}
	@Then("Select the level of promotion and click Submit button")
	public void selectthelevel() {
		promote.selectthelevel();
		
	}
	@Then("validate the low balance message")
	public void validatelowbalance() {
		promote.validatelowbalance();
		
	}

}
