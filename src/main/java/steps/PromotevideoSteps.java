package steps;

import java.io.IOException;

public class PromotevideoSteps {
	
	pages.HomePage home;
	pages.MycontentPage mycon;
	base.BasePage getdata;
	String username;
	String password;
	public void navigatetomycontent() throws InterruptedException {
		// TODO Auto-generated method stub
		mycon.navigatetomcontent();
		
		
	}
	public void login_to_application() throws InterruptedException, IOException {
		home.open();
		username=getdata.readdata("usernameold");
		password=getdata.readdata("passwordold");
		home.RegisteredUserLogin(username, password);
		home.ClicktoSignin();
		// TODO Auto-generated method stub
		
	}
	public void clickonpromote() throws InterruptedException {
		
		mycon.clickonpromote();
		
		
		// TODO Auto-generated method stub
		
	}
	public void selectthelevel() {
		
		mycon.selectthelevel();
		// TODO Auto-generated method stub
		
	}
	public void login_to_applicationwithlowbalance() throws InterruptedException, IOException {
		home.open();
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin(username,password);
		home.ClicktoSignin();
		// TODO Auto-generated method stub
		
	}
	public void validatelowbalance() {
		mycon.validatelowbalance();
	}
	public void clickonpromotemowbalance() {
		mycon.lowbalancepromte();
	}
	

}
