package steps;

import java.io.IOException;

public class deletevideoSteps {
	pages.MycontentPage myco;
	pages.HomePage home;
	base.BasePage getdata;
	String username;
	String password;
	

	public void logintoapplication() throws InterruptedException, IOException {
		home.open();
		username=getdata.readdata("usernameold");
		password=getdata.readdata("passwordold");
		home.RegisteredUserLogin(username, password);
		home.ClicktoSignin();
		// TODO Auto-generated method stub
		
	}

	public void navigatetomcontent() throws InterruptedException {
		myco.navigatetomcontent();
		// TODO Auto-generated method stub
		
	}

	public void clickondelete() {
		// TODO Auto-generated method stub
		myco.clickondelete();
		
	}

}
