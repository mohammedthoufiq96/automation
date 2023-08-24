package steps;

import java.io.IOException;

public class MyWatchListSteps {
	
	pages.Mywatchlist watchlist;
	pages.HomePage home;
	pages.MycontentPage myco;
	base.BasePage getdata;
	String email;
	String password;
	public void accesstheapplicationandplaythevideo() {
		
		home.open();
		watchlist.playthevideo();
		
	}
	public void clicksaveButton() {
		watchlist.clicksaveButton();
		// TODO Auto-generated method stub
		
	}
	public void logintoappandplayvideo() throws IOException {
		// TODO Auto-generated method stub
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		
		watchlist.logintoappandplayvideo(email,password);
		
	}
	public void clicksaveButtonafterlogin() {
		watchlist.clicksaveButtonafterlogin();
		// TODO Auto-generated method stub
		
	}
	public void navigatetomywatchlistveridyvideo() {
		watchlist.navigatetomywatchlistveridyvideo();
		// TODO Auto-generated method stub
		
	}
	public void logintoapp() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		home.open();
		email=getdata.readdata("username");
		password=getdata.readdata("password");
//		System.out.println(email);
		home.RegisteredUserLogin(email,password);
		home.ClicktoSignin();
	}
	public void navigatetomucontent() throws InterruptedException {
		// TODO Auto-generated method stub
		myco.navigatetomcontent();
		
	}
	public void clickonthumnailaspublic() throws InterruptedException {
		// TODO Auto-generated method stub
		watchlist.clickonthumnailaspublic();
//		myco.navigatetomcontent();
		
	}
	public void clickonthumbnailofunlistedvideo() {
		// TODO Auto-generated method stub
		watchlist.clickonthumbnailofunlistedvideo();
		
	}
	public void navigatetomywatchlist() {
		// TODO Auto-generated method stub
		watchlist.navigatetomywatchlistveridyvideo();
		
	}
	public void clickonthumbnailonthewatchlist() {
		// TODO Auto-generated method stub
		watchlist.clickonthumbnailonthewatchlist();
		
	}
	public void loginbyuser1() throws InterruptedException {
		// TODO Auto-generated method stub
		home.open();
		home.RegisteredUserLogin("thoufiqstage3", "Test@777");
		home.ClicktoSignin();
		watchlist.savevideoforuser1();
		
	}
	public void loginbyuser2() throws InterruptedException {
		watchlist.loginuser2();
		home.open();
		home.RegisteredUserLogin("udaystg1", "Qwaszx@1234");
		home.ClicktoSignin();
		watchlist.savevideoforuser1();
		// TODO Auto-generated method stub
		
	}
	public void removevideo() {
		watchlist.removeVideo();
		// TODO Auto-generated method stub
		
	}
	public void accessremovedvideo() {
		// TODO Auto-generated method stub
		watchlist.accessremovevideo();
		
	}
	public void accessmultiplevideoandsavebutton() {
		// TODO Auto-generated method stub
		watchlist.savemultiplevideo();
		
	}
	public void verifythecount() {
		// TODO Auto-generated method stub
		watchlist.checkcountvideo();
		
	}

	

}
