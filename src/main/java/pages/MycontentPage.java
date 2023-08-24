package pages;

import org.openqa.selenium.Keys;

import base.BasePage;

public class MycontentPage extends BasePage {
	
	String mycontent="xpath=//*[@id=\"root\"]/div[1]/div/div/ul/li[5]/span/span/img";
	String uploadvideo="xpath=//*[@id=\"root\"]/div[2]/div/div[2]/div[4]/a";
	String brwsefromdevice="xpath=//*[@id=\"dz-container\"]/div[2]/button";
	String fileinput="//input[@type='file']";
	String fileinput2="xpath=//input[@type='file']";
	String alertntn="id=moe-dontallow_button";
	String cancelbtn="xpath=//*[@id=\"root\"]/div[2]/div[2]/div/section/div/div[2]/button";
	String nextbtn="xpath=//*[@id=\"root\"]/div[2]/div[2]/div/section/div/div[2]/button[2]";
	String title="xpath=//input[@placeholder='Enter a title']";
	String descrip="xpath=//textarea[@placeholder='Add a description']";
	String title2="//input[@placeholder='Enter a title']";
	String descrip2="//textarea[@placeholder='Add a description']";
	String uploadfile="//input[@type='file']";
	String uploadfile2="xpath=//input[@type='file']";
	String titlenext="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div/button[2]";
	String publicradio="id=radio-5";
	String radionext="xpath=//*[@id=\"root\"]/div[2]/div/div/div[3]/div/div/button[3]";
	String videoforkids="id=radio-1";
	String agerestric="id=radio-4";
	String Tags="xpath=//*[@id=\"react-select-3-input\"]";
	String language="xpath=//*[@id=\"react-select-4-input\"]";
	String category="xpath=//*[@id=\"react-select-2-input\"]";
	String restriction="xpath=//*[@id=\"react-select-5-input\"]";
	String recordloc="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/form/div[1]/div[4]/input";
	String terms="id=link-checkbox";
	String submitbtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[3]/div/div/button[3]";
	String searchbutton="//*[@id=\"root\"]/nav/div/div[3]/ul/li[1]/span/img";
	String finishbutton="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div[2]/button";
	String visibilityfilter="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/thead/tr/th[2]/div";
	int i=1;
	String promotevideo="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr["+i+"]/td[1]/div[1]/div[1]/div/div[2]/ul/img[1]";
	String boostradio="xpath=//*[@id=\"root\"]/div[2]/form/div/div[3]/div[2]/div[1]/span/input";
	String promotenext="xpath=//*[@id=\"root\"]/div[2]/form/div/div[4]/button[2]";
	String promotefinish="xpath=//*[@id=\"root\"]/div[2]/form/div/div[3]/div/div/div[3]/button";
	String home="xpath=//*[@id=\"root\"]/nav/div/div[2]/div/span/a/img";
	String visibility_text="xpath=/html/body/div[2]/div[2]/div/div[5]/div/div/div/table/tbody/tr[1]/td[2]";
	String deletebtn="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div[1]/div/div[2]/ul/img[4]";
	String deletepopup="xpath=//*[@id=\"root\"]/div[2]/div/div/button[2]";
	String lowbalancemessage="xpath=//*[@id=\"root\"]/div[2]/form/div/div[3]/div[2]/span";
	String lowbalancepromotevideo="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr/td[1]/div[1]/div[1]/div/div[2]/ul/img[1]";
	String invalidmessage="xpath=//*[@id=\"root\"]/div[2]/form/div/div[2]";
	String editbtn="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div[1]/div/div[2]/ul/img[3]";
	String unlistedradio="id=radio-6";
	String editclose="xpath=//*[@id=\"root\"]/div[2]/div/div/div[3]/button";
	String searchbtn="xpath=//*[@id=\"root\"]/nav/div/div[3]/ul/li[1]/span/img";
	String searchinput="id=search";
	String videoname="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div[1]/div/div[1]/a/p";
	String namevideo;
	String videolink="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/a";
	String validtitlemessage="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]";
	String validatecategorymessage="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div";
	String canceleditbtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[3]/div/div/button[1]";
	String downloadbtn="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div[1]/div/div[2]/ul/img[5]";
	String promotionexistserror="xpath=//*[@id=\"root\"]/div[2]/form/div/div[2]";
	String cancelbtnpromote="xpath=//*[@id=\"root\"]/div[2]/form/div/div[4]/button[1]";
	String discardpromote="xpath=//*[@id=\"root\"]/div[3]/div/div/button[2]";
	String namevideo2;
	private int j=1;
	String setcapaignbtn="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr["+j+"]/td[1]/div[1]/div[1]/div/div[2]/ul/img[2]";
	String setcampaignthumpnail="xpath=/html/body/div[8]/div/div/div/div/form/div/div[1]/div[1]/picture/img";
	String setcampaignvideotitle="xpath=/html/body/div[8]/div/div/div/div/form/div/div[1]/div[2]/p";
	String setcampaignbalance="xpath=/html/body/div[8]/div/div/div/div/form/div/div[2]/div[1]/p";
	String setcampaignbalance2="xpath=/html/body/div[8]/div/div/div/div/form/div/div[2]/div[1]/p/span";
	String viewercountinbox="xpath=//input[@placeholder='Enter number of users']";
	String rewardforeachuserinbox="xpath=/html/body/div[8]/div/div/div/div/form/div/div[2]/div[5]/div[1]/input";
	String campaignduration="id=react-select-8-input";
	String setcampaignnext="xpath=/html/body/div[8]/div/div/div/div/form/div/div[4]/div/button";
	String setcampaignnext1="/html/body/div[8]/div/div/div/div/form/div/div[4]/div/button";
	String setcampaigntext="xpath=/html/body/div[10]/div/div/div/div/div[2]/div[1]/div[3]/p";
	String setcampaignfinish="xpath=//button[normalize-space()='Finish']";
	String cancelcampaign="xpath=//a[normalize-space()='Cancel']";
	String discardcampaign="xpath=//*[@id=\"root\"]/div[2]/div/div/button[2]";
	String rewardsdeducted="xpath=/html/body/div[10]/div/div/div/div/form/div/div[2]/div[5]/div[2]/p";
	private String rewardBalance;
	private int rewardBalanceupdated;
	String errormessage="xpath=/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div";
	String errormessage2="xpath=/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div";
	String userbox="xpath=/(//input[contains(@placeholder,'Enter number of users')])[1]";
	String headeruploadbtn="xpath=//*[@id=\"root\"]/nav/div/div[3]/ul/li[3]/span/img";
	
	

	public void navigatetomcontentandclickuploadvideo() {
		// TODO Auto-generated method stub
		click(alertntn);
		click(mycontent);
		
		
		
	}

	public void clickbrwsefromdevice() {
		// TODO Auto-generated method stub
		click(uploadvideo);
		execu_script(fileinput);
//		click(brwsefromdevice);
		type(fileinput2,"C:\\Users\\mkami\\Downloads\\Screenrecorder-2023-02-28-13-06-19-127.mp4");
		
	}

	public void clickCancel() {
		click(cancelbtn);
		// TODO Auto-generated method stub
		
		
	}

	public void clicknext() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		click(nextbtn);
		
	}

	public void enterTitledescriptionthumbnail() {
		// TODO Auto-generated method stub
		type(title,"test_video");
		type(descrip,"test_video description");
		execu_script(uploadfile);
		type(fileinput2,"C:\\Users\\mkami\\Downloads\\1677567886290.jpg");
		click(titlenext);
		
	}

	public void selectaspublic() {
		click(videoforkids);
		click(agerestric);
		click(publicradio);
		click(radionext);
		// TODO Auto-generated method stub
		
	}

	public void selectcategoryandlangugae() {
		// TODO Auto-generated method stub
		type(category,"Comedy");
		waitFor(getElement(category)).sendKeys(Keys.RETURN);
		type(category,"Automobiles");
		waitFor(getElement(category)).sendKeys(Keys.RETURN);
		type(category,"Reels");
		waitFor(getElement(category)).sendKeys(Keys.RETURN);
		type(category,"Education");
		waitFor(getElement(category)).sendKeys(Keys.RETURN);
//		selectdropdown(category,"English");
		type(category,"Entertainment");
		waitFor(getElement(category)).sendKeys(Keys.RETURN);
		type(category,"Music");
		waitFor(getElement(category)).sendKeys(Keys.RETURN);
		type(language,"English");
		waitFor(getElement(language)).sendKeys(Keys.RETURN);
		type(restriction,"None");
		waitFor(getElement(restriction)).sendKeys(Keys.RETURN);
		type(Tags,"automobile");
		waitFor(getElement(Tags)).sendKeys(Keys.RETURN);
		type(Tags,"comedy");
		waitFor(getElement(Tags)).sendKeys(Keys.RETURN);
		type(Tags,"Music");
		waitFor(getElement(Tags)).sendKeys(Keys.RETURN);
		type(recordloc,"Dubai");
		scroll();
		
		
		click(terms);
		click(submitbtn);
		click(finishbutton);
		
	}

	public void navigatetomcontent() throws InterruptedException {
		click(alertntn);
		click(mycontent);

//		
		halfscroll();
		click(visibilityfilter);
		click(visibilityfilter);
		Thread.sleep(5000);
			
//			System.out.println("in");
			
		
		// TODO Auto-generated method stub
		
	}

	public void clickondelete() {
		click(visibilityfilter);
		click(deletebtn);
		click(deletepopup);
		// TODO Auto-generated method stub
		
	}

	public void clickonpromote() {
		
		if(i==1) {
			click(promotevideo);
		}else {
			promotevideo="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr["+i+"]/td[1]/div[1]/div[1]/div/div[2]/ul/img[1]";
//			System.out.println(i);
			try {
				click(promotevideo);
				selectthelevel();
			}
			catch(Exception e) {
				click(home);
			}
			
			
			
		}
		
		
		
		
	
		// TODO Auto-generated method stub
		
	}
	public void lowbalancepromte() {
		click(lowbalancepromotevideo);
	}

	public void selectthelevel() {
		click(boostradio);
		click(promotenext);
//		System.out.println(t);
		try {
			click(promotefinish);
			 
		}
		catch(Exception e) {
			click(cancelbtnpromote);
			click(discardpromote);
			i++;
			clickonpromote();
			
			  //  Block of code to handle errors
		}
		
		click(home);
		// TODO Auto-generated method stub
		
	}
	
	public void validatelowbalance() {
		String balancetext=getText(lowbalancemessage);
		System.out.println(balancetext);
		balancetext.equalsIgnoreCase("You have insufficient wallet balance, please earn or buy additional rewards to proceed.");
	}
	
	
	public void clickeditvideo() {
		namevideo=getText(videoname);
		click(editbtn);
//		click(titlenext);
	}
	
	public void updatevisisbility() {
		click(titlenext);
		click(unlistedradio);
		click(radionext);
		click(terms);
		click(submitbtn);
		click(editclose);
	}
	public void searchVideo() {
		click(searchbtn);
		type(searchinput,namevideo);
	}
	
//	public void loadvideourl() {
//		load_url("https://stagemyco.net/");
//		
//	}
	
	public void emptytitlefields() {
		clear(title2);
		clear(title2);
		clear(descrip2);
		clear(descrip2);
		click(titlenext);
		click(radionext);
	}
	public void validatetitleerrormessage() {
		isDisplayed(validtitlemessage);
	}
	public void emptycategoryfields() {
		clear(category);
		clear(language);
		click(Tags);
		click(submitbtn);
	}
	public void validatecategoryerrormessage() {
		isDisplayed(validatecategorymessage);
	}
	
	public void entervalidtitlepage() {
		type(title,"test_video");
		type(descrip,"test_video description");
		click(titlenext);
		click(radionext);
		
	}
	public void clickeditvideo2() {
//		namevideo=getText(videoname);
		click(editbtn);
//		click(titlenext);
	}

	public void editthedetailsandclicksubmitbutton() {
		// TODO Auto-generated method stub
		type(title,"test_video2");
		type(descrip,"test_video2 description");
		click(titlenext);
		click(radionext);
		type(category,"Romance");
		waitFor(getElement(category)).sendKeys(Keys.RETURN);
		waitFor(getElement(Tags)).sendKeys(Keys.RETURN);
		type(Tags,"Romance");
		
		click(terms);
		click(submitbtn);
		click(editclose);
		
		
		
	}

	public void validatesaveddetails() {
		
		// TODO Auto-generated method stub
		namevideo=getText(videoname);
		namevideo.equalsIgnoreCase("test_video2");
		
	}

	public void clickeditvideooptionandeditdetailsandcancel() {
		// TODO Auto-generated method stub
		namevideo=getText(videoname);
		click(editbtn);
		clear(title2);
		type(title,"test_video2");
		clear(descrip2);
		type(descrip,"test_video2 description");
		click(titlenext);
		click(radionext);
		
		click(terms);
		click(canceleditbtn);
		namevideo2=getText(videoname);
		
	}

	public void validatethedetails() {
		namevideo.equalsIgnoreCase(namevideo2);
		// TODO Auto-generated method stub
		
	}
	
	public void clickdownloadbtn() {
		click(downloadbtn);
	}

	public void clickonsetcampaign() {
		
		if(j==1) {
//			System.out.println(j);
//			System.out.println(setcapaignbtn);
			
			click(setcapaignbtn);
//			scroll();
			
			
			
			
		}else {
			halfscroll();
			setcapaignbtn="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr["+j+"]/td[1]/div[1]/div[1]/div/div[2]/ul/img[2]";
			click(setcapaignbtn);
			entervaliddetails();
			clicknextandfinish();
		}
		
		// TODO Auto-generated method stub
		
	}

	public void clickoncancel() {
		click(cancelcampaign);
		click(discardcampaign);
		// TODO Auto-generated method stub
		
	}

	public void entervaliddetails() {
//		System.out.println("in");
		
		rewardBalance=getText(setcampaignbalance2);
		type(viewercountinbox,"5");
		type(rewardforeachuserinbox,"5");
//		getText(rewardsdeducted).equalsIgnoreCase("25 Rewards will be deducted from your wallet");
//		click(campaignduration);
//		type(campaignduration,"24");
//		waitFor(getElement(category)).sendKeys(Keys.RETURN);
		selectvalues();
		
		// TODO Auto-generated method stub
		
	}

	public void clicknextandfinish() {
		click(setcampaignnext);
//		getText(setcampaigntext).equalsIgnoreCase("");
		// TODO Auto-generated method stub
		try {
			click(setcampaignfinish);
		}
		catch(Exception e) {
			click(cancelcampaign);
			click(discardcampaign);
			j++;
			clickonsetcampaign();
			
			}
		
	}

	public void verifytherewardswhebcampaignisactiveted() {
		// TODO Auto-generated method stub
		click(setcapaignbtn);
		rewardBalanceupdated=Integer.parseInt(rewardBalance)-25;
		rewardBalance=Integer.toString(rewardBalanceupdated);
		getText(setcampaignbalance2).equalsIgnoreCase(rewardBalance);
		click(cancelcampaign);
		click(discardcampaign);
//		promotevideo="xpath=//*[@id=\"scrollableDiv\"]/div/div/div/table/tbody/tr["+j+"]/td[1]/div[1]/div[1]/div/div[2]/ul/img[1]";
//		click(promotevideo);;
		
	}

	public void enterinvaliddetails() {
		// TODO Auto-generated method stub
//		scroll();
		type(viewercountinbox,"1");
		type(rewardforeachuserinbox,"200000");
		selectvalues();
		boolean result=isEnabled(setcampaignnext1);
		if(result==true) {
			click(setcampaignnext);
		}
//		click(setcampaignnext);
		click(cancelcampaign);
		click(discardcampaign);
		clickonsetcampaign();
		type(rewardforeachuserinbox,"200000");
		selectvalues();
		result=isEnabled(setcampaignnext1);
		if(result==true) {
			click(setcampaignnext);
		}
//		click(setcampaignnext);
		click(cancelcampaign);
		click(discardcampaign);
		click(setcapaignbtn);
//		type(rewardforeachuserinbox,"200000");
		type(viewercountinbox,"1");
		type(rewardforeachuserinbox,"-200");
		selectvalues();
		result=isEnabled(setcampaignnext1);
		if(result==true) {
			click(setcampaignnext);
		}
//		getText(errormessage).equalsIgnoreCase("Reward for each user should be greater than 0");
		click(cancelcampaign);
		click(discardcampaign);
		click(setcapaignbtn);
//		clear(rewardforeachuserinbox);
		type(rewardforeachuserinbox,"0");
		type(rewardforeachuserinbox,"200000");
		selectvalues();
		result=isEnabled(setcampaignnext1);
		if(result==true) {
			click(setcampaignnext);
		}
//		getText(errormessage2).equalsIgnoreCase("Number of user should be greater than 0");
		click(cancelcampaign);
		click(discardcampaign);
		click(setcapaignbtn);
		type(viewercountinbox,"0");
		type(rewardforeachuserinbox,"100");
		selectvalues();
		result=isEnabled(setcampaignnext1);
		if(result==true) {
			click(setcampaignnext);
		}
//		click(setcampaignnext);
		
		
	}

	public void clickonuploadvideoheader() {
		// TODO Auto-generated method stub
		click(headeruploadbtn);
	}

	
	


	
	
	

}
