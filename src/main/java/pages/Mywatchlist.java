package pages;

import base.BasePage;

public class Mywatchlist extends BasePage {
	
	String testvideo="xpath=//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]";
	String alertntn="id=moe-dontallow_button";
	String viewall="xpath=//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/a";
	String video2="xpath=//button[contains(text(),'Play')]";
	String savebtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[5]/div/img";
	String signinpopup="xpath=//*[@id=\"root\"]/div[1]/div/form/div[2]/h2";
	String Email = "xpath=//input[@placeholder='Username or email']";
	String Password = "css=input[placeholder='Password']";
	String Login = "xpath=//button[contains(text(),'Sign In')]";
	String saved="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[5]/div/span";
	String mywatchlist="xpath=//*[@id=\"root\"]/div[1]/div/div/ul/li[6]/span/span/img";
	String videoTitle="xpath=//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div[2]/span[1]";
	String thumpnail="xpath=//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div[1]/a/div/picture/img";
	String uploadername="xpath=/html/body/div[5]/div[2]/div/div/div/div/div/div[1]/div[2]/div/a/span";
	String uploadeddays="xpath=/html/body/div[5]/div[2]/div/div/div/div/div/div[1]/div[2]/div/a/span";
	String thumnailforpublic="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/a";
	String thumbnailforunlisted="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/a";
	String visibilityfilter="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/thead/tr/th[2]/div";
	String thumbnailformywatch="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/a/div/div";
	String menubar="xpath=//*[@id=\"root\"]/nav/div/div[1]/span/img";
	String mycontent="xpath=//*[@id=\"root\"]/div[1]/div/div/ul/li[5]/span/span[2]";
	String mywatchlistthumbnail="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/a";
	String searchbutton="xpath=//*[@id=\"root\"]/nav/div/div[3]/ul/li[1]/span/img";
	String searchinput="id=search";
	String searched_video="xpath=//*[@id=\"scrollableDiv\"]/div/div/div[2]/div[1]/a";
	String saved_searchedvideo="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[5]/div/img";
	String logout="xpath=//*[@id=\"root\"]/div[1]/div/div/ul/li[9]/span/span/img";
	String threeDots="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/img";
	String removevideo="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/span";
	String getvideoname="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/span[1]";
//	String alertntn="id=moe-dontallow_button";
	private String videoname;
	private String newuploadvideo;
	private String countstring;
	String counttextpath="xpath=//*[@id=\"root\"]/div[2]/div/span[2]";
	String closesearch="xpath=//*[@id=\"root\"]/nav/div/div[3]/ul/li[2]/span/img";
	
	
	public void playthevideo() {
		// TODO Auto-generated method stub
//		alert();
//		click(alertntn);
		click(testvideo);
		
		
	}

	public void clicksaveButton() {
		click(savebtn);
		getText(signinpopup).equalsIgnoreCase("Watch it. Earn it. Own it.");
		// TODO Auto-generated method stub
		
	}

	public void logintoappandplayvideo(String username,String password) {
		// TODO Auto-generated method stub
		type(Email, username);

		type(Password, password);

		click(Login);
		
	
		
	}

	public void clicksaveButtonafterlogin() {
		// TODO Auto-generated method stub
		click(savebtn);
		getText(saved).equalsIgnoreCase("saved");
		
	}

	public void navigatetomywatchlistveridyvideo() {
		// TODO Auto-generated method stub
		click(mywatchlist);
		isDisplayed(videoTitle);
		isDisplayed(thumpnail);
		isDisplayed(uploadername);
		isDisplayed(uploadeddays);
		
		
	}

	public void clickonthumnailaspublic() {
		click(thumnailforpublic);
		click(menubar);
		click(mycontent);
		scroll();
		
		// TODO Auto-generated method stub
		
	}

	public void clickonthumbnailofunlistedvideo() {
		// TODO Auto-generated method stub
		click(visibilityfilter);
		click(thumbnailforunlisted);
		
	}

	public void clickonthumbnailonthewatchlist() {
		// TODO Auto-generated method stub
		click(mywatchlistthumbnail);
	}

	public void savevideoforuser1() {
		click(searchbutton);
		type(searchinput,"Report User");
		click(searched_video);
		click(saved_searchedvideo);
		
		// TODO Auto-generated method stub
		
		
	}

	public void loginuser2() {
		click(logout);
		
		
		// TODO Auto-generated method stub
		
	}
	public void removeVideo() {
//		videoname=getText(getvideoname);
		click(threeDots);
		click(removevideo);
		//*[@id="root"]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/span[1]
	}

	public void accessremovevideo() {
		// TODO Auto-generated method stub
		click(searchbutton);
		type(searchinput,"Report User");
		click(searched_video);
		getText(saved).equalsIgnoreCase("save");
		click(saved_searchedvideo);
		
		
	}
	
	public void savemultiplevideo() {
		click(alertntn);
//		click(searchbutton);
		
		int k;
		for(k=1;k<=10;k++) {
			click(searchbutton);
			type(searchinput,"New upload 5");
			newuploadvideo="xpath=//*[@id=\"scrollableDiv\"]/div/div/div[2]/div["+k+"]/a";
			click(newuploadvideo);
			click(savebtn);
//			clear(searchinput);
			click(closesearch);
		}
		
	}
	
	public void checkcountvideo() {
		click(mywatchlist);
		countstring=getText(counttextpath);
		System.out.println(countstring);
		countstring.contains("13");
		
	}

}
