package steps;

import java.io.IOException;

public class editVIdeo {

	pages.MycontentPage mycon;
	pages.HomePage home;
	base.BasePage getdata;
	String email;
	String password;
	
	
	
	public void loginintoapp() throws InterruptedException, IOException {
		home.open();
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin("thoufiqstage3","Test@777");
		home.ClicktoSignin();
	}
	
	public void navigatetomycontent() throws InterruptedException {
		mycon.navigatetomcontent();
	}
	
	public void clickeditvideo() {
		mycon.clickeditvideo2();
	}
	public void updateVisibility() {
		mycon.updatevisisbility();
	}
	public void searchvideo() {
		mycon.searchVideo();
	}

	public void emptythetitlefield() {
		mycon.emptytitlefields();
		// TODO Auto-generated method stub
		
	}

	public void verifythevalidationmessagefortitlepage() {
		// TODO Auto-generated method stub
		mycon.validatetitleerrormessage();
		
	}

	public void entervaliddetailsintitkepage() {
		// TODO Auto-generated method stub
		mycon.entervalidtitlepage();
		
	}

	public void emptyfieldsincategorypage() {
		// TODO Auto-generated method stub
		mycon.emptycategoryfields();
		
	}
	
	public void verifyerrormessageincategory() {
		mycon.validatecategoryerrormessage();
	}

	public void entervaliddetailsincategoryandclicksubmit() {
		mycon.selectcategoryandlangugae();
		// TODO Auto-generated method stub
		
	}

	public void editthedetailsandclicksubmitbutton() {
		// TODO Auto-generated method stub
		mycon.editthedetailsandclicksubmitbutton();
		
	}

	public void validatesaveddetails() {
		
		mycon.validatesaveddetails();
		// TODO Auto-generated method stub
		
	}

	public void clickeditvideooptionandeditdetailsandcancel() {
		// TODO Auto-generated method stub
		mycon.clickeditvideooptionandeditdetailsandcancel();
		
	}

	public void validatethedetails() {
		// TODO Auto-generated method stub
		mycon.validatethedetails();
	}
	
}
