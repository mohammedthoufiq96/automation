package steps;

import java.io.IOException;

public class Downloadvideo {
	pages.MycontentPage mycon;
	pages.HomePage home;
	base.BasePage getdata;
	String username;
	String password;

	public void logintoapp() throws InterruptedException, IOException {
		
		home.open();
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin(username, password);
		home.ClicktoSignin();
		// TODO Auto-generated method stub
		
	}

	public void navigatetomycontent() throws InterruptedException {
		mycon.navigatetomcontent();
		// TODO Auto-generated method stub
		
	}

	public void clickdownloadbtn() {
		mycon.clickdownloadbtn();
		// TODO Auto-generated method stub
		
	}
	
}
