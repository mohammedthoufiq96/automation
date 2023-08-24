package pages;

import base.BasePage;

public class Myreward extends BasePage {
	String myrewards="xpath=//*[@id=\"root\"]/div[1]/div/div/ul/li[7]/span/span";
	String rewardbalance="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div[1]/div[1]/h2[2]";
	String viewstatementbtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div[1]/div[1]/button";
	String rewardsfromengagement="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div[1]/div[1]/h2[2]";
	String videoswatched="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/span[2]";
	String rewardsEarned="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/span[2]";
	String campaingsparticipated="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/div[2]/div/div[3]/span[2]";
	String rewardsascontentcontributor="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div[1]/h2";
	String videoswatched1="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/span[2]";
	String rewardsEarned1="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/span[2]";
	String spentonpromotion="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/span[2]";
	String playstore="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div/div/a[1]/img";
	String appstore="xpath=////*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div/div/a[1]/img";

	public void navigatetomyrewardspagefromsidemenu() {
		// TODO Auto-generated method stub
		click(myrewards);
		
	}

	public void verfiytheDetailsinmyrewardpage() {
		// TODO Auto-generated method stub
		isDisplayed(rewardbalance);
		isDisplayed(viewstatementbtn);
		isDisplayed(rewardsfromengagement);
		isDisplayed(videoswatched);
		isDisplayed(rewardsEarned);
		isDisplayed(campaingsparticipated);
		isDisplayed(rewardsascontentcontributor);
		isDisplayed(videoswatched1);
		isDisplayed(rewardsEarned1);
		isDisplayed(spentonpromotion);
		
		
	}

	public void clickondownloadlinks() {
		// TODO Auto-generated method stub#
		click(playstore);
//		back();
//		click(appstore);
		
	}
	

}
