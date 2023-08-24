package steps;

import java.io.IOException;

public class myRewardSteps {
	
	pages.Myreward myreward;
	pages.HomePage home;
	base.BasePage getdata;
	String username;
	String password;
	public void logintoApp() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.open();
		home.RegisteredUserLogin(username, password);
		home.ClicktoSignin();
		
	}
	public void navigatetomyrewardspagefromsidemenu() {
		// TODO Auto-generated method stub
		myreward.navigatetomyrewardspagefromsidemenu();
		
	}
	public void verfiytheDetailsinmyrewardpage() {
		// TODO Auto-generated method stub
		myreward.verfiytheDetailsinmyrewardpage();
		
	}
	public void clickondownloadlinks() {
		// TODO Auto-generated method stub.
		myreward.clickondownloadlinks();
		
	}

}
