package steps;

import java.io.IOException;

public class SetCampaignsteps {
	
	pages.HomePage home;
	pages.MycontentPage myco;
	base.BasePage getdata;
	String username;
	String password;
	public void logintoApp() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		home.open();
		username=getdata.readdata("usernameold");
		password=getdata.readdata("passwordold");
		home.RegisteredUserLogin(username,password);
		home.ClicktoSignin();
		
		
	}
	public void logintoApphaslowreward() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		home.open();
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin(username,password);
		home.ClicktoSignin();
		
		
	}

	public void navigatetomycontent() throws InterruptedException {
		myco.navigatetomcontent();
		
		// TODO Auto-generated method stub
		
	}

	public void clickonsetcampaign() {
		myco.clickonsetcampaign();
		// TODO Auto-generated method stub
		
	}

	public void clickoncancel() {
		// TODO Auto-generated method stub
		myco.clickoncancel();
		
	}

	public void Clickonsetcampaignandenternumberofusers() {
		// TODO Auto-generated method stub
		myco.clickonsetcampaign();
		myco.entervaliddetails();
		
	}

	public void clickonnextandfinish() {
		// TODO Auto-generated method stub
		myco.clicknextandfinish();
		
	}

	public void verifytherewardswhebcampaignisactiveted() {
		// TODO Auto-generated method stub
		myco.verifytherewardswhebcampaignisactiveted();
		
	}

	public void enterinvaliddetails() {
		// TODO Auto-generated method stub
		myco.enterinvaliddetails();
		
	}

}
