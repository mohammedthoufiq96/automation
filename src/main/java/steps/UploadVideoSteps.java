package steps;

import java.io.IOException;

public class UploadVideoSteps {
	
	pages.HomePage home;
	pages.MycontentPage mcon;
	base.BasePage getdata;
	String username;
	String password;

	public void logintoapplication() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		home.open();
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin(username,password);
//		home.RegisteredUserLogin("thoufiqstage", "Test@12345");
		home.ClicktoSignin();
	}

	public void navigatetomcontentandclickuploadvideo() {
		// TODO Auto-generated method stub
		mcon.navigatetomcontentandclickuploadvideo();
		
	}

	public void clickbrwsefromdevice() {
		// TODO Auto-generated method stub
		mcon.clickbrwsefromdevice();
		
	}

	public void clickcancel() {
		// TODO Auto-generated method stub
		mcon.clickCancel();
		
	}

	public void clicknext() throws InterruptedException {
		mcon.clicknext();
		// TODO Auto-generated method stub
		
	}

	public void enterTitledescriptionthumbnail() {
		// TODO Auto-generated method stub
		mcon.enterTitledescriptionthumbnail();
		
	}

	public void selectsapublic() {
		mcon.selectaspublic();
		// TODO Auto-generated method stub
		
	}

	public void selectcategoryandlangugae() {
		// TODO Auto-generated method stub
		mcon.selectcategoryandlangugae();
		
	}

	public void clickonuploadvideoheader() {
		// TODO Auto-generated method stub
		mcon.clickonuploadvideoheader();
	}

}
