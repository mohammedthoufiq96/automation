package pages;

import base.BasePage;
import java.time.Duration;
import java.util.List;
import base.BasePage;
import java.time.Duration;
import java.util.List;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.eclipse.jetty.websocket.api.Session;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

@DefaultUrl("https://stagemyco.net/")
public class HomePage extends BasePage {

	String popupDonotAllowButton = "#moe-dontallow_button";
	String SignInButton = "css=button[class='mr-[10px] sm:mr-[25px] sm:ml-[30px] border-none bg-transparent mundial-regular font-[18px]']";
	String homePageicon = "css=img[class='w-[22px] h-[22px] mx-auto']";
	String signup = "xpath=//span[text()='Sign up now']";
	String Email = "xpath=//input[@placeholder='Username or email']";
	String Password = "css=input[placeholder='Password']";
	String Login = "xpath=//button[contains(text(),'Sign In')]";
	String Menu = "css=img[class='w-[35px] h-[15px] ml-[20px] mt-[7px] cursor-pointer']";
	String RegisterLink = "xpath=//a[contains(text(),'Register')]";
	String FirstName = "xpath=//*[@id=\"firstName\"]";
	String LastName = "xpath=//input[@id='lastName']";
	String EmailAdress = "xpath=//input[@id='email']";
	String Username = "xpath=//input[@id='userName']";
	String Password1 = "xpath=//input[@id='password']";
	String ConfirmPassword = "xpath=//input[@id='confirmPassword']";
	String TAC = "xpath=//input[@id='link-checkbox']";
	String Register = "xpath=//button[@id='register-btn']";
	String video = "css=.swiper-slide-active .w-\\[272px\\]";
	String dashboard = "xpath=//div[text()='Dashboard']";
	String dashboardTitle = "//a[text()='View Profile']";
	String Dislike = "xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/div/img";
	String like = "xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[1]/img";
	String commentSection = "xpath=//textarea[@placeholder='Add a comment']";
	String Cancel = "xpath=//button[normalize-space()='Cancel']";
	String post = "xpath=//button[normalize-space()='Post']";
	String ownComment = "xpath=//textarea[@placeholder='Add a comment']";
	String Delete = "xpath = //";
	String threedots = "xpath=(//*[name()='svg'])[1]";
	String Deletebtn = "xpath=(//*[name()='svg'])[1]";
	String Deletedcomment = "xpath=(//div)[612]";
	String otherUsersComment = "xpath=(//span[contains(@class,'ml-[8px]')][normalize-space()='Reply'])[2]";
	String replyOption = "xpath=//div[@class='ml-16']//div[@class='container mx-auto']//div[@class='flex mt-[30px]']//div[@class='w-full']//div[@class='w-full pr-[100px]']//textarea[@class='resize-none dark:bg-dark-textarea appearance-none dark:border-transparent dark:focus:border-transparent focus:ring-0 rounded w-full h-[68px] text-gray-700 dark:focus:text-white dark:text-white leading-tight']";
	String Mplay = "xpath = //";
	String Mlive = "xpath = //";
	String Mbrowses = "xpath = //";
	String videoADs = "xpath = //";
	String bannerADs = "xpath = //*[@id=\"root\"]/div[2]/div/div[1]/img";
	String playVideo = "xpath = //";
	String search = "xpath=//input[@id='search']";
//	String firstVideo = "xpath = //";
	String searchbox = "xpath=//li[@class='mr-3']/span";
	String searchSymbol = "xpath=//li[@class='mr-3']/span";
	String suggestions = "xpath = //";
	String newuserregisterlink = "xpath=//span[contains(text(),'Click here to register')]";
	String registerPage = "xpath = //";
	String registerbtn = "xpath=//button[@id='register-btn']";
	String existingusername = "xpath=//input[@id='userName']";
	String existingUserNameError = "xpath = //";
	String emailAddress = "xpath = //";
	String validateEmailAddressError = "xpath = //";
	String confirmPassword = "xpath = //";
	String password = "xpath = //";
	String passworderror = "xpath = //";
	String confirmPassworderror = "xpath = //";
	String TermsandConditions = "xpath = //";
	String validateErrorMessages = "xpath = //";
	String shareButton = "xpath=img[src='/static/media/share_button.94085d19b7bc4a5cde8f56f4f4add8a6.svg']";
	String icon1 = "xpath=//button[@aria-label='twitter']//img";
	String icon2 = "xpath=//button[@aria-label='whatsapp']//img";
	String icon3 = "xpath=//button[@aria-label='facebook']//img";
	String icon4 = "xpath=//button[@aria-label='email']//img";
	String icon5 = "xpath=//button[@aria-label='reddit']//img";
	String icon6 = "xpath=//button[@aria-label='pinterest']//img";
	String icon7 = "xpath=//a[@target='_blank']//img";
	String icon8 = "xpath=//button[@aria-label='linkedin']//img";
	String icon9 = "xpath=//button[@aria-label='tumblr']//img";
	String icon10 = "//button[@aria-label='telegram']//img";
	String MplayorMlive = "xpath = //";
	String testvideo = "xpath = //";
	String video1 = "xpath = //";
	String video2 = "xpath = //";
	String video3 = "xpath = //";
	String video4 = "xpath = //";
	String video5 = "xpath = //";
	String about = "xpath = //";
	String adBanner = "xpath = //";
	String MplayorMliveorMseed = "xpath = //";
	String opt1 = "xpath = //";
	String opt2 = "xpath = //";
	String opt3 = "xpath = //";
	String opt4 = "xpath = //";
	String opt5 = "xpath = //";
	String defaultcategorieslist = "xpath = //";
	String toptrendingvideos = "xpath = //";
	String mostwatchedvideos = "xpath = //";
	String newreleasesvideos = "xpath = //";
	String defaultcategorieslistRecommended = "xpath = //";
	String categorieslistRecommended = "xpath = //";
	String MycoCategory = "xpath = //";
	String PopularVideosAcrossCountries = "xpath = //";
	String PopularAcrossRegio = "xpath = //";
	String defaultcategoryUserPage = "xpath = //";
	String defaultcategoryUserPageTopTrendingVideo = "xpath = //";
	String defaultcategoryUserPageNewReleaseVideos = "xpath = //";
	String defaultcategoryUserPageNewReleaseVideo = "xpath = //";
	String defaultcategoryUserPagePopularmyco = "xpath = //";
	String defaultcategoryUserPageOnlyforMyco = "xpath = //";
	String PopularAcrossRegion = "xpath = //";
	String in_sreamAds = "xpath = //";
	String ReverseTimer = "xpath = //";
	String forwardBufferBar = "xpath = //";
	String forwardBufferBarWhikeVideoIsPlaying = "xpath = //";
	String streamVideoBufferfBar = "xpath = //";
	String playBtn = "xpath = //";
	String pauseBtn = "xpath = //";
	String muteBtn = "xpath = //";
	String unmuteBtn = "xpath = //";
	String alert = "xpath = //";
	String logo = "xpath=//img[@class='cursor-pointer']";
	String whatsappicon = "xpath=//button[@aria-label='whatsapp']//img";
	String comment = "css=textarea[placeholder='Add a comment']";
	String Recommendedcategory = "xpath=//span[contains(text(),'Recommended videos')]";
	String Toptrendingcategory = "xpath=//span[normalize-space()='Trending']";
	String Newreleasescategory = "xpath=//span[normalize-space()='New releases']";
	String MostWatchedcategory = "xpath=//span[contains(text(),'Most Watched')]";
	String Threedots = "xpath=(//img[contains(@class,'w-[22px] h-[22px] mt-[1px] ml-[8px] cursor-pointer')])[1]";
	String Report = "xpath=";
	String submit = "xpath=";
	String reportcomment = "xpath=";
	String testvideo1 = "xpath=//div[contains(text(),'Test ravi')]";
	String Aboutus = "xpath=//a[contains(text(),'About')]";
	String AboutUsLink = "xpath=";
	String Privacypolicylink = "xpath=//a[contains(text(),'Privacy Policy')]";
	String PrivacyLink = "xpath=";
	String ContactUS = "xpath=//a[contains(text(),'Contact Us')]";
	String ContactUsLink = "xpath=";
	String ExistingUsernameErrorMsg = "xpath=//*[@id=\"root\"]/div[1]/form/div[2]";
	String successaccountcreationmsg = "xpath=//span[@class='text-center text-dark-white mundial-light justify-center py-1 px-6 mx-6 mt-2 text-xl']";
	String InvalidEmailErrorMsg = "xpath=//div[contains(text(),'Invalid email address format.')]";
	String testvideo2 = "css=body > div:nth-child(5) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)";
	String facebook = "xpath=//a[@href='https://www.facebook.com/myco.io.official']";
	String instagram = "xpath=//a[@href='https://www.facebook.com/myco.io.official']";
	String twitter = "xpath=//a[@href='https://twitter.com/myco_io']";
	String officialChat = "xpath=//a[@href='https://t.me/mcontentofficialchat']";
	String youtube = "xpath=//a[@href='https://www.youtube.com/@myco_io']";
	String reddit = "xpath=//a[@href='https://www.reddit.com/r/MContent/']";
	String linkedin="xpath=//a[@href='https://www.linkedin.com/company/myco-io/']";
	String telegram="xpath=//a[@href='https://t.me/mcontentofficialcha']";
	String homePage = "//div[text()='Home']";
	String homePageLogo = "//img[@src='https://assets.stagemyco.net/public/banners/banner-1.svg']";
	String myRewards = "xpath=//button[text()='View MyRewards']";
	String uploadVideo = "xpath=//button[text()='Upload Video']";
	String viewprofile = "xpath=//button[text()='View Profile']";
	String magangeUploads = "xpath=//button[text()='Manage Uploads']";
	String myRewardsTitle = "//h1[text()='MyRewards']";
	String viewprofileTitle = "//h2[text()='Your Myco profile info']";
	String uploadVideoTitle = "//button[text()='browse from your device']";
	String manageuploadTitle = "//a[text()='Upload Video']";
	String myContent = "xpath=//div[text()='MyContent']";
	String deleteButton = "xpath=(//ul[@class='inline-flex']//child::img)[4]";
	String confirmDelete = "xpath=//button[text()='Delete']";
	String firstVideoinManageVideos = "xpath=(//p[@class='text-base text-left'])[1]";
	String Hometab = "css=body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(2) > span:nth-child(1) > img:nth-child(1)";

	String signIntoaddcomments = "css=u[class='text-green-600 mundial-regular text-[14px] leading-[13px] cursor-pointer decoration-none']";
	String myProfile = "html/body/div[2]/div[1]/div/div/ul/li[4]/span/span/img";
	String commentDropDown = "xpath=//h4/img[@class = 'inline-block  md:hidden']";
	String signInToAddComments = "xpath=//div/u";
	String emojisButton = "xpath=//div/img[@data-testid = 'handleEmojiButton']";
	String firstEmoji = "xpath=//ul/li/button[@aria-label = 'grinning face']";
	String postButton = "xpath=//button[@data-testid = 'handleCommentSubmit']";
	String cancelButton = "xpath=//div/button[@data-testid = 'handleCancelButton']";
	String signOutButton = "xpath=//span/div[text() = 'Logout']";
	String firstComment = "xpath=//div[@class = 'pb-4 hidden md:block']/div[position()=2]/div/div/div/div[position()=2]/div/div/div[position()=2]";
	String deleteCommentButton = "xpath=//div/button[@class = 'flex items-center']/span";
	String deleteCommentPopUp = "xpath=//div[@class = 'border-0 dark:bg-dark-default  p-[30px] shadow-lg relative flex flex-col w-full bg-white outline-none focus:outline-none']";
	String replyComment = "xpath=//div[@class = 'pb-4 hidden md:block']/div[position()=3]/div/div/div/div[position()=2]/div/div/div[position()=2]";
	String signuppopupheader = "xpath=//*[@id=\"root\"]/div[1]/div/form/div[2]/h2";
	String googlesignin = "xpath=//*[@id=\"root\"]/div[1]/div/div[1]/a";
	String eye = "xpath=//*[@id=\"password-eye-icon\"]";
	String userexistsmsg = "xpath=//*[@id=\"root\"]/div[1]/form/div[2]";
	String mailurl = "https://yopmail.com/en/wm";
	String mailrefresh = "xpath=/html/body/main/div[2]/div/div[1]/div[2]/div[2]/button";
	String YoloEmail = "xpath=//input[@placeholder='Enter your inbox here']";
	String yoloenter = "xpath=/html/body/div/div[2]/main/div[3]/div/div[1]/div[2]/div/div/form/div/div[1]/div[4]/button";
//	String catchaclick="xpath=/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]";
	String verifyLink = "xpath=/html/body/p/a";
	String mail_id = "/html/body/main/div[2]/div/div[1]/div[1]/div/input";
//	String captcha ="xpath=/html/body/header/div/div/center/div/div/div/div/iframe";
	String mail_header = "xpath=/html/body/div[2]/div[2]/button/div[1]/span[2]";
	String alert_button = "xpath=//*[@id=\"moe-dontallow_button\"]";
	String yolomail="test_mohammed18";
	String resetpassword="xpath=//*[@id=\"root\"]/div[1]/div/form/div[2]/div[3]/div[2]/span";
	String forgotpasswordpopup="xpath=//*[@id=\"root\"]/div[1]/form";
	String forgotpasswordclose="xpath=//form[@class='bg-dark-default max-h-96 mx-auto p-8 m-20 justify-center rounded-xl relative']//*[name()='svg']";
	String signuppopup="xpath=//*[@id=\"root\"]/div[1]/form";
	String mailbox="xpath=//*[@id='identifierId']";
	String mailnext="xpath=//*[@id=\"identifierNext\"]/div/button/span";
	String displayedusername="xpath=//*[@id=\"root\"]/nav/div/div[3]/div/span[1]/div/span";
	String displayedreward="xpath=//*[@id=\"root\"]/nav/div/div[3]/div/span[1]/span";
	String usernamesoaceerror="xpath=//*[@id=\"root\"]/div[1]/div/form/div[2]/div[1]";
	String signincomment="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div/u";
	String commentbox="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div/div/div[2]/div/textarea";
	private String givenErrormessage;
	String signuppopupclose="xpath=//*[@id=\"root\"]/div[1]/div/form/div[1]/svg";
	String alertntn="id=moe-dontallow_button";
	String videoclick="xpath=//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]";
	String sharebtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[4]/div/img";
	String signuperrormessage="xpath=//*[@id=\"root\"]/div[1]/form/div[2]";
	String emailinput="xpath=/html/body/main/section[2]/div/form/div[1]/input[1]";
	String gotoinbox="xpath=/html/body/main/section[2]/div/form/div[1]/input[2]";
	String registersucess="xpath=//*[@id=\"root\"]/div[1]/div/div[4]/span";
	String verifymail="xpath=/html/body/div[2]/div[5]/div/div/div/div/div/div/div/main/div/div/ul[2]/li";
	String clickhere="xpath=/html/body/p/a";
	String registerationmessage="xpath=//*[@id=\"confirmMessage\"]";
	String mailiframe="xpath=/html/body/div[2]/div[5]/div/div/div/div/div/div/div/div/div[3]/div/ul/li/div[2]/iframe";
	String videocounteye="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[3]/div/img";
	String savebtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[5]/div/img";
	String nooflikes="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[1]/span";
	String showdislike="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/div/span";
	String noofcount="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[3]/div/span";
	String clickmyplay="xpath=//*[@id=\"Mplay\"]/div[2]/div[1]/div[1]/div/a";
	String suggestedmyplay="xpath=//*[@id=\"root\"]/div[2]/div/div/div[2]/div/a[1]";
	String playvideo="xpath=//*[@id=\"player\"]/div[1]//*[@id=\"player\"]/div[1]";
	String profilename="xpath=//*[@id=\"root\"]/nav/div/div[3]/div/span[1]/div/span";
	String signinclose="xpath=//div[@class=\"cursor-pointer\"]/*[name()=\"svg\"]";
	String iosicon="xpath=//*[@id=\"root\"]/nav/div/div[3]/ul/li[2]/div[2]/a[2]";
	String androidicon="//div/ul/li[@class = 'hidden md:block mr-3 dark:bg-dark-header ']/div[@class = 'flex']/a";
	String firstvideo="xpath=//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]";
	String reportvideo="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[4]/div/div/div[6]/div/option[2]";
	String selectoptionreport="id='Spam or misleading-radio'";
	String reportsubmit="xpath=//button[normalize-space()='Submit']";
	String reportclose="xpath=/html/body/div[6]/div/div/div/div/button";
	String commentemoji="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[1]/div/div[2]/div/div/img";
	String commentpost="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[1]/div/div[2]/div/div/div[2]/button[2]";
	String latestcomment="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/div[2]/div/div/div[2]/p";
	String emoji="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[1]/div/div[2]/div/div/div[1]/aside/div[3]/section/ul[1]/li/button/img";
	String deletecmnt="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/button";
	String threedotscomment="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/div[3]/div/div[2]/button";
	String canceldeletecmnt="xpath=//button[normalize-space()='Cancel']";
	String deletecmntclick="xpath=//button[normalize-space()='Delete']";
	String replybtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/div[2]/div/div/div[3]/button";
	String replybox="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div/div/div[2]/div/div/div[2]/div/textarea";
	String replypost="xpath=//button[normalize-space()='Post']";
	String replythreebtn="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div[2]/div/div/div/div[3]/div/div[2]/button";
	String replydelete="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div/div/button";
	String clicksignincmnt="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[1]/u";
	String commentcancel="xpath=//button[normalize-space()='Cancel']";
	String searchbtn="xpath=(//img[@class='h-[18px] w-[17px] ml-[15px] cursor-pointer'])[1]";
	String searchBox="xpath=//*[@id=\"search\"]";
	String myvideo="xpath=//*[@id=\"scrollableDiv\"]/div/div/div[2]/div[1]/a";
	String reportcmnt="xpath=//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/button";
	String cmntoption="id='Spam or misleading'";
	String reportcmntopt1="xpath=//label[normalize-space()='Sexual content']";
	String reportcmntopt2="xpath=//label[normalize-space()='Violent or repulsive content']";
	String reportcmntopt3="xpath=//label[normalize-space()='Hateful or abusive content']";
	String reportcmntopt4="xpath=//label[normalize-space()='Harassment or bullying']";
	String reportcmntopt5="xpath=//label[normalize-space()='Harmful or dangerous acts']";
	String reportcmntopt6="xpath=//label[normalize-space()='Promotes terrorism']";
	String reportcmntopt7="xpath=//label[normalize-space()='Spam or misleading']";
	String reportcmntopt8="xpath=//label[normalize-space()='Infringes my rights']";
	String reportcmntopt9="xpath=//label[normalize-space()='Captions issue']";
	String cmntreportsubmit="xpath=//button[normalize-space()='Submit']";
	String navigateviewall="xpath=//*[@id=\"Mplay\"]/div[1]/a";
	String thumbnailmyplay="xpath=//*[@id=\"scrollableDiv\"]/div/div/div[2]/div[2]/a/div[1]/div/img";
	String newreleaseviewall="xpath=//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/a";
	public void RegisteredUserLogin(String username, String password) throws InterruptedException {

//    Thread.sleep(1000);
    Thread.sleep(1000);

//    click(SignInButton);
    click(SignInButton);

//    type(Email, username);
    type(Email, username);

    type(Password, password);
    
    click(Login);
  }
//    type(Password, password);
//  }

	public void RegisteredUserLoginafteremailverfication(String username, String password) throws InterruptedException {

		Thread.sleep(1000);
		new_tab();
		load_url("https://stagemyco.net/");

		click(SignInButton);

		type(Email, username);

		type(Password, password);

	}

	public void ClicktoSignin() throws InterruptedException {
		click(Login);
		Thread.sleep(2000);
	}

	public void clickOnMyProfile() {
		findBy("html/body/div[2]/div[1]/div/div/ul/li[4]/span/span/img").click();
//		click(myProfile);
	}

	public void ClickToMenubar() {
		click(Menu);

	}

	public void GuestUserLogin(String username, String password) {

		click(SignInButton);

		type(Email, username);

		type(Password, password);

		click(Login);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
//			 TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newuserregistration(String firstname, String lastname, String email, String username, String password)
			throws InterruptedException {
		
		type(FirstName, firstname);

    type(LastName, lastname);

    type(EmailAdress, email);

    type(Username, username);

    type(Password1, password);

    type(ConfirmPassword, password);

		type(FirstName, lastname);

		click(TAC);

		click(Register);

//		Thread.sleep(5000);

//		isDisplayed(successaccountcreationmsg);

	}

	public void userregistrationwithexisitingusername(String firstname, String lastname, String email, String username,
			String password) throws InterruptedException {

		type(FirstName, firstname);

    type(LastName, lastname);

    type(EmailAdress, email);

    type(Username, username);

    type(Password1, password);

    type(ConfirmPassword, password);

		type(LastName, lastname);

		click(TAC);

		click(Register);

		Thread.sleep(5000);

		isDisplayed(userexistsmsg);
	}

//  public void clickOnMyProfile() {
//    findBy("html/body/div[2]/div[1]/div/div/ul/li[4]/span/span/img").click();
//    //		click(myProfile);
//  }

//  public void ClickToMenubar() {
//    click(Menu);
//  }

//  public void GuestUserLogin(String username, String password) {
//
//    click(SignInButton);
//
//    type(Email, username);
//
//    type(Password, password);
//
//    click(Login);
//    try {
//      Thread.sleep(6000);
//    } catch (InterruptedException e) {
//      //			 TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//  }

	public void clickonvideo() {
//		withTimeoutOf(Duration.ofSeconds(10)).find((testvideo2));
//		driver.switchTo().alert().accept();
//		alert();
//		click(alert_button);
		click(videoclick);
//		click(video);

	}

	public void clickonHome() {
		find("//*[@id='root']/div[1]/div/div/ul/li[1]/span/span[2]").click();
//		isDisplayed(find("//*[@id='root']/div[1]/div/div/ul/li[1]/span/span[2]"));
	}

	public void footericons() {
		isDisplayed(facebook);
		isDisplayed(instagram);
		isDisplayed(twitter);
		isDisplayed(officialChat);
		isDisplayed(youtube);
		isDisplayed(reddit);
	}

	public void BeforeLoginSideBarVisible() {
		isDisplayed(homePageicon);
	}

	public void AfterLoginSideBarVisible() {
		isDisplayed(homePageicon);
	}

//	public void ClickOnlikeButton() throws InterruptedException {
//
//    type(Username, username);
//
//    type(Password1, password);

//	public void clickondislikeButton() throws InterruptedException {
//
//		Thread.sleep(2000);
//		click(testvideo2);
//
//		Thread.sleep(4000);
//
//    click(Register);
//
//		click(Dislike);
//
//    //		isDisplayed(successaccountcreationmsg);
//
//  }

//  public void userregistrationwithexisitingusername(
//      String firstname, String lastname, String email, String username, String password)
//      throws InterruptedException {
//
//    type(FirstName, firstname);
//
//    type(LastName, lastname);
//
//    type(EmailAdress, email);
//
//    type(Username, username);
//
//    type(Password1, password);

//	public void validateComment() throws InterruptedException {
//
//		Thread.sleep(2000);
//		click(testvideo2);
//
//    type(LastName, lastname);
//
//    click(TAC);
//
//    click(Register);
//
//    Thread.sleep(5000);
//
//    isDisplayed(userexistsmsg);
//  }

  public void otherUserLogin(String username, String password) {

    click(SignInButton);

    type(Email, username);

    type(Password, password);

    click(Login);
  }

//	public void addcommentnotvisible() throws InterruptedException {
//
//		Thread.sleep(2000);
//		click(testvideo2);
//
//  }

//  public void clickonHome() {
//    find("//*[@id='root']/div[1]/div/div/ul/li[1]/span/span[2]").click();
//    //		isDisplayed(find("//*[@id='root']/div[1]/div/div/ul/li[1]/span/span[2]"));
//  }

//  public void footericons() {
//    isDisplayed(facebook);
//    isDisplayed(instagram);
//    isDisplayed(twitter);
//    isDisplayed(officialChat);
//    isDisplayed(youtube);
//    isDisplayed(reddit);
//  }

//  public void BeforeLoginSideBarVisible() {
//    isDisplayed(homePageicon);
//  }

//  public void AfterLoginSideBarVisible() {
//    isDisplayed(homePageicon);
//  }

  public void ClickOnlikeButton() throws InterruptedException {

    Thread.sleep(4000);
    click(testvideo2);
    Thread.sleep(4000);
    scroll();
    click(like);
  }
//    Thread.sleep(4000);
//    click(testvideo2);
//    Thread.sleep(4000);
//    scroll();
//    click(like);
//  }

//  public void clickondislikeButton() throws InterruptedException {
//
//    Thread.sleep(2000);
//    click(testvideo2);
  public void clickondislikeButton() throws InterruptedException {

    Thread.sleep(2000);
    click(testvideo2);

    Thread.sleep(4000);
    Thread.sleep(4000);

    scroll();
    scroll();

    click(Dislike);
  }
//    click(Dislike);
//  }

//  public void elementnotenabled() throws InterruptedException {
  public void elementnotenabled() throws InterruptedException {

    scroll();
    scroll();

    isNotEnabled(Dislike);
  }
//    isNotEnabled(Dislike);
//  }

//  public void validateSearch() {
  public void validateSearch() {

    withTimeoutOf(Duration.ofSeconds(10)).find(("//a[contains(text(),'piratasbitcoin')]"));
  }
//    withTimeoutOf(Duration.ofSeconds(10)).find(("//a[contains(text(),'piratasbitcoin')]"));
//  }

//  public void validateComment() throws InterruptedException {
//
//    Thread.sleep(2000);
//    click(testvideo2);
  public void validateComment() throws InterruptedException {

    Thread.sleep(2000);
    click(testvideo2);

    Thread.sleep(2000);
    Thread.sleep(2000);

    // scroll();
    // scroll();

    isDisplayed(comment);
  }
//    isDisplayed(comment);
//  }

//  public void addComment() {
  public void addComment() {

    // click(commentSection);
    type(commentSection, "testComment");
    click(post);
  }
    // click(commentSection);
//    type(commentSection, "testComment");
//    click(post);
//  }

//  public void clickoncommentsection() {
  public void clickoncommentsection() {

    click(commentSection);
  }
//    click(commentSection);
//  }

//  public void addcommentnotvisible() throws InterruptedException {
//
//    Thread.sleep(2000);
//    click(testvideo2);
  public void addcommentnotvisible() throws InterruptedException {

    Thread.sleep(2000);
    click(testvideo2);

    scroll();
    scroll();

    isNotDisplayed(comment);
  }
//    isNotDisplayed(comment);
//  }

//  public void loginDisplayed() {
//    isDisplayed(signIntoaddcomments);
//  }
  public void loginDisplayed() {
    isDisplayed(signIntoaddcomments);
  }

//  public void cancelbtnDisplayed() {
//    isDisplayed(Cancel);
//  }
  public void cancelbtnDisplayed() {
    isDisplayed(Cancel);
  }

//  public void commentbtnDisplayed() {
//    isNotEnabled(post);
//  }
  public void commentbtnDisplayed() {
    isNotEnabled(post);
  }

//  public void clickOnOwnComment() {
//    click(ownComment);
//  }
  public void clickOnOwnComment() {
    click(ownComment);
  }

//  public void validateDeleteOption() {
//    isDisplayed(Delete);
//  }
  public void validateDeleteOption() {
    isDisplayed(Delete);
  }

//	public void HeroBanner() {
////		isDisplayed(videoADs);
//		isDisplayed(bannerADs);
//		click(bannerADs);
//	}

//    click(threedots);
//    click(Deletebtn);
//  }

//  public void validaterecommendedatgeory() {
//    scroll();
//    isDisplayed(Recommendedcategory);
//  }
  public void validaterecommendedatgeory() {
    scroll();
    isDisplayed(Recommendedcategory);
  }

	public void enterSearch() {

		click(searchSymbol);
		type(search, "test");
		enter();
		isDisplayed(testvideo1);
	}

//  public void validatenewreleasescategory() {
//    scroll();
//    isDisplayed(Newreleasescategory);
//  }
  public void validatenewreleasescategory() {
    scroll();
    isDisplayed(Newreleasescategory);
  }

  public void validatemostwatchedcategory() {
    scroll();
    isDisplayed(MostWatchedcategory);
  }
//  public void validatemostwatchedcategory() {
//    scroll();
//    isDisplayed(MostWatchedcategory);
//  }

//  public void clickonthreedots() {
  public void clickonthreedots() {

    halfscroll();
    click(Threedots);
  }

//	public void validateuserclickonsignin() throws InterruptedException {

  public void selecttheoptionforreport() {
	  click(selectoptionreport);
	  click(reportsubmit);
	  click(reportclose);
	  clickonthreedots();
	  click(selectoptionreport);
	  click(reportsubmit);
	  click(reportclose);
	  clickonthreedots();
	  click(selectoptionreport);
	  click(reportsubmit);
	  click(reportclose);
	  
  }

	public void clicknewuserregisterlink() throws InterruptedException {

		click(newuserregisterlink);
		isDisplayed(registerbtn);
	}

//	public void HeaderVisible() throws InterruptedException {
//		isDisplayed(logo);
//		isDisplayed(search);
//	}

	public void clickRegisterbtn() {
		click(registerbtn);
	}
	
  public void validateOtherUsersComment() {
    isDisplayed(otherUsersComment);
  }

//  public void clickOtherUsersComment() {
//    click(otherUsersComment);
//  }
  public void clickOtherUsersComment() {
    click(otherUsersComment);
  }

	public void feilderrorvalidation(String firstname, String lastname, String email, String username, String password)
			throws InterruptedException {

		type(FirstName, firstname);
	}

//  public void validateMbrowsesMlive() {
//    isDisplayed(Mbrowses);
//    isDisplayed(Mlive);
//  }
  public void validateMbrowsesMlive() {
    isDisplayed(Mbrowses);
    isDisplayed(Mlive);
  }

  public void validateMplay() {
    isNotDisplayed(Mplay);
  }
//  public void validateMplay() {
//    isNotDisplayed(Mplay);
//  }

//  public void validateUserPromotedVideos() {
//    isDisplayed(Delete);
//  }
  public void validateUserPromotedVideos() {
    isDisplayed(Delete);
  }

  public void HeroBanner() {
    //		isDisplayed(videoADs);
    isDisplayed(bannerADs);
    click(bannerADs);
  }
//  public void HeroBanner() {
//    //		isDisplayed(videoADs);
//    isDisplayed(bannerADs);
//    click(bannerADs);
//  }

  public void clickVideoAds() {
    click(videoADs);
  }
//  public void clickVideoAds() {
//    click(videoADs);
//  }

		

	

	public void enterEmailAddress(String firstname, String lastname, String email, String username, String password)
			throws InterruptedException {

		type(FirstName, firstname);
	}

//  public void videoStartsWithA() {
//    click(search);
//    type(search, "test");
//    String videoname = find(("//a[contains(text(),'piratasbitcoin')]")).getText();
//    if (videoname.startsWith(videoname, 'A')) {
//      System.out.print(true);
//    }
//  }
  public void videoStartsWithA() {
    click(search);
    type(search, "test");
    String videoname = find(("//a[contains(text(),'piratasbitcoin')]")).getText();
    if (videoname.startsWith(videoname, 'A')) {
      System.out.print(true);
    }
  }

//  public void validateSuggestions() {
//    isDisplayed(suggestions);
//  }
  public void validateSuggestions() {
    isDisplayed(suggestions);
  }

  public void validatesearchfield() {
    isDisplayed(searchbox);
    isDisplayed(searchSymbol);
  }

//  public void validateuserclickonsignin() throws InterruptedException {
//  public void validatesearchfield() {
//    isDisplayed(searchbox);
//    isDisplayed(searchSymbol);
//  }

  public void validateuserclickonsignin() throws InterruptedException {

    isDisplayed(SignInButton);
    click(SignInButton);
  }

//		type(LastName, lastname);
//
//		click(TAC);
//
//		click(Register);
//
//		Thread.sleep(500);

  public void HeaderVisible() throws InterruptedException {
    isDisplayed(logo);
    isDisplayed(search);
  }

	public void enterWrongPassword(String firstname, String lastname, String email, String username, String password,
			String confpassword) throws InterruptedException {

		type(FirstName, firstname);

		type(LastName, lastname);

		type(EmailAdress, email);

		type(existingusername, username);

		type(Password1, password);

		type(ConfirmPassword, confpassword);

		type(FirstName, lastname);

		click(TAC);

		click(Register);

		Thread.sleep(500);

	}

//  public void validateUserNameError() {
  public void validateUserNameError() {

		String actualmessage = getText(ExistingUsernameErrorMsg);

		verifytext(actualmessage, "Username not available");
	}

//  public void validateEmailAddress() {
  public void validateEmailAddress() {

		String actualmessage = getText(InvalidEmailErrorMsg);

		verifytext(actualmessage, "Invalid email address format.");
	}

	public void validatepasswordmatch() {

		String Password = getText(Password1);

		String ConfirmPassword1 = getText(ConfirmPassword);

		verifytext(Password, ConfirmPassword1);

	}

  public void enterdifConfirmPassword() {
    type(confirmPassword, "testpassword123");
  }
//  public void enterdifConfirmPassword() {
//    type(confirmPassword, "testpassword123");
//  }

//  public void validatePasswordConfirmPasswordError() {
//    isDisplayed(passworderror);
//    isDisplayed(confirmPassworderror);
//  }
  public void validatePasswordConfirmPasswordError() {
    isDisplayed(passworderror);
    isDisplayed(confirmPassworderror);
  }

//  public void validateTermsandConditions() {
//    isDisplayed(TermsandConditions);
//  }
  public void validateTermsandConditions() {
    isDisplayed(TermsandConditions);
  }

//  public void validateErrorMessages() {
//    isDisplayed(validateErrorMessages);
//  }
  public void validateErrorMessages() {
    isDisplayed(validateErrorMessages);
  }

//  public void likebtnnotdisplayed() {
  public void likebtnnotdisplayed() {

    scroll();
    isNotEnabled(like);
  }
//    scroll();
//    isNotEnabled(like);
//  }

//  public void ClickonShareButton() throws InterruptedException {
//    scroll();
  public void ClickonShareButton() throws InterruptedException {
    scroll();

    Thread.sleep(1000);
    // isDisplayed(shareButton);
    click(shareButton);
  }
//    Thread.sleep(1000);
//    // isDisplayed(shareButton);
//    click(shareButton);
//  }

//  public void clickonwhatsapp() throws InterruptedException {
  public void clickonwhatsapp() throws InterruptedException {

    Thread.sleep(7000);
    Thread.sleep(7000);

    click(whatsappicon);
    click(whatsappicon);

    Thread.sleep(15000);
    Thread.sleep(15000);

//    windowhandle("WhatsApp");
  }
//    windowhandle("WhatsApp");
//  }

//  public void validateSharebtn() {
  public void validateSharebtn() {

    scroll();
    isNotEnabled(shareButton);
  }
//    scroll();
//    isNotEnabled(shareButton);
//  }

//  public void validateSharebtnisenabled() {
  public void validateSharebtnisenabled() {

    scroll();
    isEnabled(shareButton);
  }
//    scroll();
//    isEnabled(shareButton);
//  }

//  public void likebtndisplayed() {
  public void likebtndisplayed() {

    scroll();
    isDisplayed(like);
  }
//    scroll();
//    isDisplayed(like);
//  }

//  public void dislikebtndisplayed() {
  public void dislikebtndisplayed() {

    scroll();
    isDisplayed(Dislike);
  }
//    scroll();
//    isDisplayed(Dislike);
//  }

//  public void validateIcons() {
//    isDisplayed(icon1);
//    isDisplayed(icon2);
//    isDisplayed(icon3);
//    isDisplayed(icon4);
//    isDisplayed(icon5);
//    isDisplayed(icon6);
//    isDisplayed(icon7);
//    isDisplayed(icon8);
//    isDisplayed(icon9);
//    isDisplayed(icon10);
//  }
  public void validateIcons() {
    isDisplayed(icon1);
    isDisplayed(icon2);
    isDisplayed(icon3);
    isDisplayed(icon4);
    isDisplayed(icon5);
    isDisplayed(icon6);
    isDisplayed(icon7);
    isDisplayed(icon8);
    isDisplayed(icon9);
    isDisplayed(icon10);
  }

//  public void clickonMplayorMlive() {
//    click(MplayorMlive);
//  }
  public void clickonMplayorMlive() {
    click(MplayorMlive);
  }

//  public void searchVideo() {
//    type(testvideo, "testvideo");
//    click(search);
//  }
  public void searchVideo() {
    type(testvideo, "testvideo");
    click(search);
  }

//  public void validateListOfVideos() {
//    isDisplayed(video1);
//    isDisplayed(video2);
//    isDisplayed(video3);
//    isDisplayed(video4);
//    isDisplayed(video5);
//  }
  public void validateListOfVideos() {
    isDisplayed(video1);
    isDisplayed(video2);
    isDisplayed(video3);
    isDisplayed(video4);
    isDisplayed(video5);
  }

//  public void clickonAbout() {
//    click(about);
//  }
  public void clickonAbout() {
    click(about);
  }

//  public void clickonADBanner() {
//    click(adBanner);
//  }
  public void clickonADBanner() {
    click(adBanner);
  }

//  public void clickonMplayorMliveorMseed() {
//    click(MplayorMliveorMseed);
//  }
  public void clickonMplayorMliveorMseed() {
    click(MplayorMliveorMseed);
  }

//  public void validateHomepageOptions() {
//    isDisplayed(opt1);
//    isDisplayed(opt2);
//    isDisplayed(opt3);
//    isDisplayed(opt4);
//    isDisplayed(opt5);
//  }
  public void validateHomepageOptions() {
    isDisplayed(opt1);
    isDisplayed(opt2);
    isDisplayed(opt3);
    isDisplayed(opt4);
    isDisplayed(opt5);
  }

//  public void validatedefaultcategorieslist() {
//    isEnabled(defaultcategorieslist);
//  }
  public void validatedefaultcategorieslist() {
    isEnabled(defaultcategorieslist);
  }

//  public void dispalyeddefaultcategorieslist() {
//    isDisplayed(defaultcategorieslist);
//  }
  public void dispalyeddefaultcategorieslist() {
    isDisplayed(defaultcategorieslist);
  }

//  public void verifypageTitle() {
    // write code for this
//  public void verifypageTitle() {
//    // write code for this
//
//  }
//  }

//  public void validatetoptrendingvideos() {
//    isEnabled(toptrendingvideos);
//  }
  public void validatetoptrendingvideos() {
    isEnabled(toptrendingvideos);
  }

//  public void displaytoptrendingvideos() {
//    isDisplayed(toptrendingvideos);
//  }
  public void displaytoptrendingvideos() {
    isDisplayed(toptrendingvideos);
  }

//  public void validatemostwatchedvideos() {
//    isEnabled(mostwatchedvideos);
//  }
  public void validatemostwatchedvideos() {
    isEnabled(mostwatchedvideos);
  }

//  public void validatedepopularvideos() {
//    isEnabled(mostwatchedvideos);
//  }
  public void validatedepopularvideos() {
    isEnabled(mostwatchedvideos);
  }

//  public void validatenewreleasesvideos() {
//    isEnabled(newreleasesvideos);
//  }
  public void validatenewreleasesvideos() {
    isEnabled(newreleasesvideos);
  }

//  public void validatedefaultcategorieslistRecommended() {
//    isEnabled(defaultcategorieslistRecommended);
//  }
  public void validatedefaultcategorieslistRecommended() {
    isEnabled(defaultcategorieslistRecommended);
  }

//  public void displayedefaultcategorieslistRecommended() {
//    isDisplayed(categorieslistRecommended);
//  }
  public void displayedefaultcategorieslistRecommended() {
    isDisplayed(categorieslistRecommended);
  }

//  public void validateMycoCategory() {
//    isEnabled(MycoCategory);
//  }
  public void validateMycoCategory() {
    isEnabled(MycoCategory);
  }

//  public void validatePopularVideosAcrossCountries() {
//    isEnabled(PopularVideosAcrossCountries);
//  }
  public void validatePopularVideosAcrossCountries() {
    isEnabled(PopularVideosAcrossCountries);
  }

//  public void validatePopularAcrossRegion() {
//    isEnabled(PopularAcrossRegion);
//  }
  public void validatePopularAcrossRegion() {
    isEnabled(PopularAcrossRegion);
  }

//  public void validatedefaultcategoryUserPage() {
//    isEnabled(defaultcategoryUserPage);
//  }
  public void validatedefaultcategoryUserPage() {
    isEnabled(defaultcategoryUserPage);
  }

//  public void validatedefaultcategoryUserPageTopTrendingVideos() {
//    isEnabled(defaultcategoryUserPageTopTrendingVideo);
//  }
  public void validatedefaultcategoryUserPageTopTrendingVideos() {
    isEnabled(defaultcategoryUserPageTopTrendingVideo);
  }

//  public void validatedefaultcategoryUserPageNewReleaseVideos() {
//    isEnabled(defaultcategoryUserPageNewReleaseVideos);
//  }
  public void validatedefaultcategoryUserPageNewReleaseVideos() {
    isEnabled(defaultcategoryUserPageNewReleaseVideos);
  }

//  public void validatedefaultcategoryUserPageNewReleaseVideo() {
//    isEnabled(defaultcategoryUserPageNewReleaseVideo);
//  }
  public void validatedefaultcategoryUserPageNewReleaseVideo() {
    isEnabled(defaultcategoryUserPageNewReleaseVideo);
  }

//  public void validatedefaultcategoryUserPagePopularmyco() {
//    isEnabled(defaultcategoryUserPagePopularmyco);
//  }
  public void validatedefaultcategoryUserPagePopularmyco() {
    isEnabled(defaultcategoryUserPagePopularmyco);
  }

//  public void validatedefaultcategoryUserPageOnlyforMyco() {
//    isEnabled(defaultcategoryUserPageOnlyforMyco);
//  }
  public void validatedefaultcategoryUserPageOnlyforMyco() {
    isEnabled(defaultcategoryUserPageOnlyforMyco);
  }

//  public void validatein_sreamAds() {
//    isDisplayed(in_sreamAds);
//  }
  public void validatein_sreamAds() {
    isDisplayed(in_sreamAds);
  }

//  public void validateReverseTimer() {
//    isDisplayed(ReverseTimer);
//  }
  public void validateReverseTimer() {
    isDisplayed(ReverseTimer);
  }

//  public void forwardBufferBar() {
//    click(forwardBufferBar);
//  }
  public void forwardBufferBar() {
    click(forwardBufferBar);
  }

//  public void forwardBufferBarWhikeVideoIsPlaying() {
//    click(forwardBufferBarWhikeVideoIsPlaying);
//  }
  public void forwardBufferBarWhikeVideoIsPlaying() {
    click(forwardBufferBarWhikeVideoIsPlaying);
  }

//  public void validatesstreamVideoBufferBar() {
//    isDisplayed(streamVideoBufferfBar);
//  }
  public void validatesstreamVideoBufferBar() {
    isDisplayed(streamVideoBufferfBar);
  }

//  public void playBtn() {
//    click(playBtn);
//  }
  public void playBtn() {
    click(playBtn);
  }

//  public void pauseBtn() {
//    click(pauseBtn);
//  }
  public void pauseBtn() {
    click(pauseBtn);
  }

//  public void muteBtn() {
//    click(muteBtn);
//  }
  public void muteBtn() {
    click(muteBtn);
  }

//  public void unmuteBtn() {
//    click(unmuteBtn);
//  }
  public void unmuteBtn() {
    click(unmuteBtn);
  }

//  public void validatealert() {
//    isDisplayed(alert);
//  }
  public void validatealert() {
    isDisplayed(alert);
  }

//  public void validateplayBtn() {
//    isDisplayed(playBtn);
//  }
  public void validateplayBtn() {
    isDisplayed(playBtn);
  }

//  public void validatepauseBtn() {
//    isDisplayed(pauseBtn);
//  }
  public void validatepauseBtn() {
    isDisplayed(pauseBtn);
  }

//  public void validatemuteBtn() {
//    isDisplayed(muteBtn);
//  }
  public void validatemuteBtn() {
    isDisplayed(muteBtn);
  }

	public void validateunmuteBtn() {
		isDisplayed(unmuteBtn);

	}

	public void clickaboutlink() {

		// scrollelementtoview(Aboutus);
		click(Aboutus);

	}

	public void aboutuslink() {

		currentURL("https://devmyco.net/about");

	}

	public void footersection() {

		scroll();

	}

	public void clickprivacypolicylink() {
		click(Privacypolicylink);

	}

	public void privacypolicylink() {
		currentURL("https://devmyco.net/privacy");

	}

	public void clickcontactuslink() {
		click(ContactUS);

	}

	public void contactuslink() {
		currentURL("https://devmyco.net/contact");

	}

	public void clickonDashboard() {

		click(dashboard);
		isDisplayed(dashboardTitle);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// scroll();

	}

	public void verifyMyRewards() {
		click(myRewards);
		isDisplayed(myRewardsTitle);
		click(dashboard);
		scroll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void uploadVideo() {
		isDisplayed(uploadVideo);
		click(uploadVideo);
		isDisplayed(uploadVideoTitle);
		click("xpath=//*[local-name()='svg']");
		scrolltoEnd();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//	public void viewprofile() {
//		isDisplayed(viewprofile);
//		click(viewprofile);
//		isDisplayed(viewprofileTitle);
//		click("xpath=//*[local-name()='svg']");
//		scrolltoEnd();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}

	public void manageUploads() {
		isDisplayed(magangeUploads);
		click(magangeUploads);
		isDisplayed(manageuploadTitle);

	}

	public void signup() throws InterruptedException {
		click(signup);
		Thread.sleep(3000);

	}

//  public void clickManageVideos() throws InterruptedException {
//    click(myContent);
//    Thread.sleep(3000);
//  }
  public void clickManageVideos() throws InterruptedException {
    click(myContent);
    Thread.sleep(3000);
  }

	public void clickdelete() {
		click(deleteButton);

	}

	public void confirmDelete() throws InterruptedException {

		click(confirmDelete);
		Thread.sleep(3000);
	}

	public String getTextOfDeleteVideo() {
		String text = getText(firstVideoinManageVideos);
		return text;

	}

	public void clickOnFirstVideo() {
		ListOfWebElementFacades allVideos = findAll("//div/div/div/div/div[@class = 'absolute opacity-40 md:opacity-0 "
				+ "group-hover:opacity-40 group-hover:block w-[90%] bg-black h-full transition-all']");
		allVideos.get(1).click();
	}

	public void clickOnLike() {
		findBy("//div/img[@class = 'w-[19px] h-[20px]  ml-[10px]']").click(); // like button
		String popUp = findBy("//div/h2").getText();
		popUp.equalsIgnoreCase("Watch it. Earn it. Own it.");
		ListOfWebElementFacades allIconsInPopUp = findAll("//*[local-name()='svg']/*[local-name()='path']");
		allIconsInPopUp.get(0).click();

	}

	public void verifyDislikeButton() {
		findBy("//div/img[@class = 'w-[19px] h-[20px] mt-[1px] ml-[18px] cursor-pointer']").click(); // dislike button
		String popUp = findBy("//div/h2").getText();
		popUp.equalsIgnoreCase("Watch it. Earn it. Own it.");
		ListOfWebElementFacades allIconsInPopUp = findAll("//*[local-name()='svg']/*[local-name()='path']");
		allIconsInPopUp.get(0).click();
	}

	public void registeredUserLikesAndDislikes() {
		findBy("//div/img[@class = 'w-[19px] h-[20px] mt-[1px] ml-[18px] cursor-pointer']").click(); // dislike button
		findBy("//div/img[@class = 'w-[19px] h-[20px]  ml-[10px]']").click(); // like button
	}

	public void verifyLikeDisLikeUI() {

		// click dislike
		scroll();
		click(Dislike);
		findBy("//div/img[@class = 'w-[19px] h-[20px] mt-[1px] ml-[18px] cursor-pointer']").getAttribute("src")
				.equalsIgnoreCase(
						"https://stagemyco.net/static/media/dislike_button_fill.9cc33c071106ff6065a8d95bad6fa094.svg\n");// highlighted
																															// dislike
		findBy("//div/img[@class = 'w-[19px] h-[20px]  ml-[10px]']").getAttribute("src")
				.equalsIgnoreCase("//div/img[@class = 'w-[19px] h-[20px]  ml-[10px]']\").click(); //like button\n");// not-highlighted
																													// like

		// click like
		scroll();
		click(like);
		findBy("//div/img[@class = 'w-[19px] h-[20px]  ml-[10px]']").getAttribute("src").equalsIgnoreCase(
				"https://stagemyco.net/static/media/like_button_fill.58c73a68bee0f3e225f80fc0bbd421cd.svg");// highlighted
																											// like
		findBy("//div/img[@class = 'w-[19px] h-[20px] mt-[1px] ml-[18px] cursor-pointer']").getAttribute("src")
				.equalsIgnoreCase(
						"https://stagemyco.net/static/media/dislike_button.b8922aab4335e92c089a9f684de545b5.svg");
	}

//	public WebElement waitTillElementVisible(String eleXpath) {
//		
//		//Wait for 60 seconds and return the element if visible.
//	return new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eleXpath)));
//
//	}

	public void verifyCommentSection() {
		// click(commentDropDown);
		scroll();
		isDisplayed(signInToAddComments);
	}

	public void clickSignInFromComments() {
		click(signInToAddComments);

	}

	public void signInComments() throws InterruptedException {

		Thread.sleep(1000);

		type(Email, "testuser55");

    type(Password, "MyPassword123$");
    type(Password, "MyPassword123$");

    click(Login);
    click(Login);

		Thread.sleep(2000);

	}

	public void commentUsingEmojis() {
		scroll();
		type(commentSection, "This is my first comment");
		click(emojisButton);
		click(firstEmoji);
	}

	public void commentWithoutEmojis() {
		ListOfWebElementFacades allCommentsBoxes = findAll("//textarea[@placeholder='Add a comment']");
		WebElementFacade secondComment = allCommentsBoxes.get(1);
		secondComment.typeAndTab("This is my second comment");
	}

	public void cancelComment() {
		click(cancelButton);
	}

	public void postButton() {
		click(postButton);
	}

	public void verifyComment() {
		String comment = getText(firstComment);
		System.out.println(comment);
		comment.contains("This is my comment");

	}

	public void verifyReply() {
		String comment = getText(replyComment);
		comment.contains("This is my second comment");
	}

	public void clickReply() {
		ListOfWebElementFacades replyButtons = findAll("//button/img[@class = 'w-[18px] h-[13px]']");
		System.out.println(replyButtons.get(0));
		replyButtons.get(0).click();
	}

	public void signInAsAnotherUser() {
		click(signOutButton);

	}

	public void clickOnCommentDots() {
		ListOfWebElementFacades commentDots = findAll(
				"//div[@class = 'flex md:pr-6']/div/button[@class = 'flex items-center']");
		commentDots.get(0).click();
	}

	public void isDeleteOptionDisplayed() {
		isDisplayed(deleteCommentButton);

	}

	public void clickDeleteButton() throws InterruptedException {
		Thread.sleep(1000);
		findBy("//div/button[@class = 'flex items-center']/span").click();
	}

	public void cancelDeleteCommentPopUp() {
		findBy("//div/button[@class = 'rounded w-2/5 my-3 px-3 py-2.5 border border-dark-green my-3 mx-2 bg-transparent text-green']")
				.click();
	}

	public void verifyDeleteCommentPopUpIsClosed() {
		isNotEnabled(deleteCommentPopUp);

	}

	public void deleteComment() {
		findBy("//div/button[@class = 'rounded w-2/5 my-3 px-3 py-2.5 my-3 mx-2 bg-dark-green hover:bg-green-300C']")
				.click();
	}

	public void verifyCommentIsRemoved() {
		String comment = getText(firstComment);

	}

	public void clickOnThreeDotsReply() throws InterruptedException {
		Thread.sleep(2000);
		ListOfWebElementFacades commentDots = findAll(
				"//div[@class = 'flex md:pr-6']/div/button[@class = 'flex items-center']");
		commentDots.get(0).click();
	}

	public void signOut() {
		findBy("//div[@class = 'text-[11px] text-gray01'][text() = 'Logout']").click();
	}

	public void clickUserThreeDots() {
		findBy("//div/img[@class = 'w-[22px] h-[22px] mt-[1px] ml-[8px] cursor-pointer']").click();
	}

	public void clickReportVideo() {
//		String reportVideoButton = "xpath=//div/option[text() = 'Report Video']";
		String reportVideo = "xpath=//div/option[text() = 'Report Video']";

//		click(reportVideoButton);
//		findBy("//div/option[text() = 'Report Video']").click();
	}

	public void verifyVideoReportOptions() {
		List<WebElementFacade> allOptions = findAll("//div[@class = 'flex items-center mt-3']/label");
//		findBy("//button[@class = 'rounded ml-5 py-1 px-7 bg-dark-red hover:bg-dark-red-300 text-white mundial-regular leading-none']");//submit report button
		allOptions.get(0).getText().equalsIgnoreCase("Sexual content");
		allOptions.get(1).getText().equalsIgnoreCase("Violent or repulsive content");
		allOptions.get(2).getText().equalsIgnoreCase("Hateful or abusive content");
		allOptions.get(3).getText().equalsIgnoreCase("Harassment or bullying");
		allOptions.get(4).getText().equalsIgnoreCase("Harmful or dangerous acts");
		allOptions.get(5).getText().equalsIgnoreCase("Promotes terrorism");
		allOptions.get(6).getText().equalsIgnoreCase("Spam or misleading");
		allOptions.get(7).getText().equalsIgnoreCase("Infringes my rights");
		allOptions.get(8).getText().equalsIgnoreCase("Captions issue");
		System.out.println(allOptions);
		findBy("//span[@class = 'block text-white']").click();

	}

	public void clickReportUser() {
		scroll();
		System.out.println(("//div/option[position() = 1]"));
//	System.out.println(options);
//		findBy("//select[div/option[text() = 'Report User']]").click();
//	System.out.println(options);
	}

	public void verifyUserReportOptions() {
		List<WebElementFacade> allOptions = findAll("//div[@class = 'flex items-center mt-3']/label");
//		findBy("//button[@class = 'rounded ml-5 py-1 px-7 bg-dark-red hover:bg-dark-red-300 text-white mundial-regular leading-none']");//submit report button
		allOptions.get(0).getText().equalsIgnoreCase("Harassment and cyberbullying");
		allOptions.get(1).getText().equalsIgnoreCase("Privacy");
		allOptions.get(2).getText().equalsIgnoreCase("Impersonation");
		allOptions.get(3).getText().equalsIgnoreCase("Violent threats");
		allOptions.get(4).getText().equalsIgnoreCase("Child endangerment");
		allOptions.get(5).getText().equalsIgnoreCase("Hate speech against a protected group");
		allOptions.get(6).getText().equalsIgnoreCase("Spam and scams");
		allOptions.get(7).getText().equalsIgnoreCase("None of these are my issue");
		System.out.println(allOptions);
		findBy("//span[@class = 'block text-white']").click();

	}

	public void verifyDownloadIcons() {
		findAll(androidicon).get(0)
				.getAttribute("href").equalsIgnoreCase("https://play.google.com/store/apps/details?id=com.mcontent");

		findAll(androidicon).get(1)
				.getAttribute("href")
				.equalsIgnoreCase("https://apps.apple.com/in/app/myco-powered-by-mcontent/id1603970931");

	}

	public void clickIosIcon() {
		findAll(androidicon).get(1)
				.click();
	}

	public void clickAndroidIcon() {
		findAll(androidicon).get(0)
				.click();

	}

	public void validatesigninpopupdetails() throws InterruptedException {
		isDisplayed(Email);
		isDisplayed(Password);
		isDisplayed(SignInButton);
//		isDisplayed(googlesignin);
//		String headertext1=getText(signuppopupheader);
//		assertvalue("test","");
//		click(SignInButton);
	}

	public void enteringemailandpassword(String username, String password) throws InterruptedException {
		Thread.sleep(1000);
		type(Email, username);

		type(Password, password);
//		isDisplayed(googlesignin);
//		String headertext1=getText(signuppopupheader);
//		assertvalue("test","");
//		click(SignInButton);
	}

	public void verifypasswordeye() {
		click(eye);

	}

	public void verifyerrormessage() {
		click(eye);

	}

	public void yolomailcheck() throws InterruptedException {
//		home.openUrl()
		Thread.sleep(1000);
		new_tab();
		load_url(mailurl);
		type(YoloEmail,yolomail);
		click(yoloenter);
//		click(yoloenter);
//		getText(mail_header).equalsIgnoreCase("no-reply@stagemyco.net");
//		close_current_tab();
//		
		// TODO Auto-generated method stub

	}

	public void clickresetpassword() {
		// TODO Auto-generated method stub
		click(resetpassword);
	}

	public void forgotpasswordflow() {
		// TODO Auto-generated method stub
		isDisplayed(forgotpasswordpopup);
		
		
	}

	public void clicksignpulink() {
		click(forgotpasswordclose);
		click(SignInButton);
		click(signup);
		// TODO Auto-generated method stub
		
	}
	public void verifysignuppopup() {
		isDisplayed(signuppopup);
	}

	public void clickongooglelogin() throws InterruptedException {
		click(googlesignin);
		type(mailbox,"mohammed555thoufiq@gmail.com");
		click(mailnext);
//		Thread.sleep(5000);
		// TODO Auto-generated method stub
		
	}

	public void validateafterlogin(String string2,String type) throws IOException {
		// TODO Auto-generated method stub
		if(string2.equalsIgnoreCase("homepage")) {
			isDisplayed(displayedusername);
			isDisplayed(displayedreward);
			
		}else {
			String errormessge=getText(usernamesoaceerror);
			if(type.equalsIgnoreCase("username")) {
				givenErrormessage=readdata("errormessageforspace");
			}else {
				givenErrormessage=readdata("passwordwithspace");
			}
			
			errormessge.equalsIgnoreCase(givenErrormessage);
		}
		
	}
	public void validateusernameandpassword(String username,String password) {
//		System.out.println(username);
		type(Email, username);

		type(Password, password);
		
		click(Login);

	}

	public void clickcommentsignin() {
		click(videoclick);
		click(signIntoaddcomments);
		
		// TODO Auto-generated method stub
		
	}

	public void addCommentafterlogin(String email2, String password2) {
		type(Email, email2);

		type(Password, password2);
		
		click(Login);
		
		type(commentbox,"test");
		click(postButton);
		click(homePageicon);
		click(signOutButton);
		
		
		// TODO Auto-generated method stub
		
	}

	public void clickonanyvideoandverifysignuppop(String email2, String password2) {
		// TODO Auto-generated method stub
		click(videoclick);
		halfscroll();
		click(sharebtn);
		type(Email, email2);

		type(Password, password2);
		
		click(Login);
		click(sharebtn);
		
	}

	public void accessandclicksigninverify(String email2, String password2) {
		// TODO Auto-generated method stub
		isDisplayed(SignInButton);
		click(SignInButton);
		click(alertntn);
		type(Email, email2);

		type(Password, password2);
		
		click(Login);
//		click(signuppopupclose);
		click(signOutButton);
		
	}

	public void verifysignuperrormessage(String string) {
		// TODO Auto-generated method stub
		String message=getText(signuperrormessage);
		message.equalsIgnoreCase(string);
	}

	public void generatingtempmail(String emailid) throws InterruptedException {
		new_tab();
		load_url("https://www.mail7.io/");
//		Thread.sleep(18000);
		type(emailinput,emailid);
//		String email=getinputvalue("email");
		
		click(gotoinbox);
		switchtabsrgttolft();
		// TODO Auto-generated method stub
//		return email;
		
	}

	public void validateregistersuccessandverifymail(String useremailid) throws InterruptedException {
		// TODO Auto-generated method stub
		String sucessmsg=getText(registersucess);
		sucessmsg.equalsIgnoreCase("Success!");
		new_tab();
		load_url("https://www.mail7.io/");
		type(emailinput,useremailid);
		click(gotoinbox);
		Thread.sleep(5000);
		click(verifymail);
		swictch_iframe(mailiframe);
		click(clickhere);
		String msg=getText(registerationmessage);
		msg.equalsIgnoreCase("Your registration has been confirmed!");
		
		
	}

	public void verifysignupfields() {
		// TODO Auto-generated method stub
		isDisplayed(FirstName);
		isDisplayed(LastName);
		isDisplayed(EmailAdress);
		isDisplayed(Username);
		isDisplayed(Password1);
		isDisplayed(ConfirmPassword);
		isDisplayed(TAC);
		isDisplayed(Register);
	
		
	}
	public void signuppopclose() {
		click(alertntn);
		click(signuppopupclose);
	}

	public void userclickpassword() {
		click(Password1);
		// TODO Auto-generated method stub
		
	}

	public void verifythepasswordcondition() {
		// TODO Auto-generated method stub
		
	}

	public void validatepassworderrormessage() {
		// TODO Auto-generated method stub
		String message=getText(signuperrormessage);
		message.equalsIgnoreCase("password should not have spaces");
		
		
	}

	public void videoplayeroption() {
		isDisplayed(like);
		isDisplayed(Dislike);
		isDisplayed(videocounteye);
		isDisplayed(sharebtn);
		isDisplayed(savebtn);
		isDisplayed(Threedots);
		// TODO Auto-generated method stub
		
	}

	public void clickonuseroption() throws InterruptedException {
		// TODO Auto-generated method stub
		halfscroll();
		click(like);
		String url=getcurrentURL();
		validatesigninpopupdetails();
		load_url(url);
		
		click(Dislike);
		validatesigninpopupdetails();
		load_url(url);
		click(videocounteye);
		validatesigninpopupdetails();
		load_url(url);
		click(sharebtn);
		validatesigninpopupdetails();
		load_url(url);
		click(savebtn);
		validatesigninpopupdetails();
		load_url(url);
		click(Threedots);
		validatesigninpopupdetails();
		
	}

	public void videodetailsdisplayed() {
		// TODO Auto-generated method stub
		isDisplayed(nooflikes);
		isDisplayed(showdislike);
		isDisplayed(noofcount);
		
		
		
	}

	public void navigate_to_the_myplay_section() {
		// TODO Auto-generated method stub
//		home.navigate_to_the_myplay_section();
//		click(clickmyplay);
		halfscroll();
		
	}
	public void click_myplay_video() {
		click(clickmyplay);
	}

	public void validatethesignuppopup() throws InterruptedException {
		validatesigninpopupdetails();
		// TODO Auto-generated method stub
		
	}

	public void click_on_myplay_video_from_suggestion_videos() {
		// TODO Auto-generated method stub
		click(suggestedmyplay);
		
	}

	public void myplay_video_should_start_playing() {
		// TODO Auto-generated method stub
		click(playvideo);
		
	}

	public void refresh_the_page() {
		// TODO Auto-generated method stub
		String url=getcurrentURL();
		load_url(url);
		
	}

	public void the_user_should_be_login_the_signin_pop_up_should_not_be_displayed() {
		// TODO Auto-generated method stub
		isDisplayed(profilename);
		
	}

	public void signinpclose() {
		// TODO Auto-generated method stub
//		String url=getcurrentURL();
//		load_url(url);
		click(alertntn);
		click(signinclose);
//		click(homePageicon);
//		click(playvideo);
	}
	public void myplaysignin(String username,String password) {
		type(Email, username);

		type(Password, password);

		click(Login);
	}
	public void validateiospage() {
		// TODO Auto-generated method stub
		String url=getcurrentURL();
		url.contains("apple");
		
		
	}



	public void user_rediected_android_page() {
		// TODO Auto-generated method stub
		String url=getcurrentURL();
		url.contains("play");
		
		
	}



	public void userclickonavideo() {
		// TODO Auto-generated method stub
		click(firstvideo);
	}



	public void clickoncommentthreedots() {
		// TODO Auto-generated method stub
		
	}



	public void userclickonreportuseroption() {
		// TODO Auto-generated method stub
		click(reportvideo);
		
	}



	public void verifythreedotsformyplay() {
		// TODO Auto-generated method stub
		isDisplayed(threedots);
		
	}



	public void useraddacomment() {
		// TODO Auto-generated method stub
		type(commentSection,"test");
		click(commentemoji);
		click(emoji);
		click(commentpost);
	}



	public void commentvisible() {
		// TODO Auto-generated method stub
		String text=getText(latestcomment);
		text.contains("test");
		
		
	}



	public void userbeginscommentingemoji() {
		click(commentSection);
		click(commentemoji);
		click(emoji);
		click(commentpost);
		// TODO Auto-generated method stub
		
	}



	public void userclickonthreedotsoncomment() {
		// TODO Auto-generated method stub
		click(threedotscomment);
		
	}



	public void validateDeletedcomment() {
		isDisplayed(deletecmnt);
		// TODO Auto-generated method stub
		
	}



	public void userclickdeleteoption() {
		// TODO Auto-generated method stub
		click(deletecmnt);
		
	}



	public void userclickondeletecancel() {
		// TODO Auto-generated method stub
		click(canceldeletecmnt);
	}



	public void verifythecmnt() {
		// TODO Auto-generated method stub
		isDisplayed(latestcomment);
		
	}



	public void userclickdeletecmnt() {
		// TODO Auto-generated method stub
		halfscroll();
		click(deletecmntclick);
		
	}



	public void verifydeletedcomment() {
		// TODO Auto-generated method stub
		isDisplayed(latestcomment);
		
	}



	public void deletereplycmnt() {
		click(replybtn);
		type(replybox,"test");
		click(replypost);
		click(replythreebtn);
		click(replydelete);
		click(deletecmntclick);
		// TODO Auto-generated method stub
		
	}



	public void clickcommentsectionofguest() {
		// TODO Auto-generated method stub
		click(clicksignincmnt);
		
		
	}



	public void clickcanceloncomment() {
		// TODO Auto-generated method stub
		click(commentcancel);
		
	}



	public void usercommentsagainandclicksubmits() {
		// TODO Auto-generated method stub
		click(commentpost);
	}



	public void commentshouldbedisplayed() {
		// TODO Auto-generated method stub
		isDisplayed(latestcomment);
		
	}



	public void userclickreply() {
		// TODO Auto-generated method stub
		click(replybtn);
		
	
		
	}



	public void userreplyemoji() {
		// TODO Auto-generated method stub
		type(replybox,"test");
		
	}


//
//	public void userclickcancelonreply() {
//		// TODO Auto-generated method stub
//		click();
//		
//	}



	public void userclicksubmitonreply() {
		// TODO Auto-generated method stub
		click(replypost);
		
	}



	public void commentshouldbedisplayedudernaththefirst() {
		// TODO Auto-generated method stub
		isDisplayed(latestcomment);
		
	}



	public void signincmnt(String username2, String password2) {
		// TODO Auto-generated method stub

		type(Email, username2);

		type(Password, password2);

		click(Login);
		
	}



	public void userclicklikeanddislike() throws InterruptedException {
		// TODO Auto-generated method stub
		halfscroll();
		click(like);
		String url=getcurrentURL();
		validatesigninpopupdetails();
		load_url(url);
		
		click(Dislike);
		validatesigninpopupdetails();
		load_url(url);
		
	}



	public void verifylikeanddislike() {
		// TODO Auto-generated method stub
		isDisplayed(like);
	}



	public void useraddcommemtsandclickpost() {
		// TODO Auto-generated method stub
		click(commentSection);
		click(commentemoji);
		click(emoji);
		click(commentpost);
		
	}



	public void verifythecomntonlypostedonce() {
		// TODO Auto-generated method stub
		isDisplayed(latestcomment);
		
	}



	public void useraddcmntandclickpostmanytimes() {
		// TODO Auto-generated method stub
		click(replybtn);
		click(replybox);
		type(replybox,"test");
		click(replypost);
		
	}



	public void verfiythecomntwasonlypostedonce() {
		// TODO Auto-generated method stub
		isDisplayed(latestcomment);
		
	}



	public void navigatestofooter() throws InterruptedException {
		// TODO Auto-generated method stub
		scroll_down();
		
	}



	public void verifythesocialmedialinksoffooter() {
		// TODO Auto-generated method stub
		String url=getcurrentURL();
		click(facebook);
		click(instagram);
		click(twitter);
		click(officialChat);
		click(youtube);
		click(reddit);
		
		
		
	}



	public void selectreportcommentoption() {
		// TODO Auto-generated method stub
		click(reportcmnt);
		
	}



	public void searchyourvideo() throws InterruptedException {
		// TODO Auto-generated method stub
		click(alertntn);
		Thread.sleep(1000);
		click(searchbtn);
		type(searchBox,"6 you people");
		click(myvideo);
		scroll();
		scroll();
		
		
	}



	public void selectaoption() {
		// TODO Auto-generated method stub
		click(cmntoption);
		
	}



	public void selectandsubmitreportcmnt() {
		// TODO Auto-generated method stub
		click(reportcmntopt7);
		click(cmntreportsubmit);
//		click(reportclose);
		
	}



	public void verifycmntReportOptions() {
		// TODO Auto-generated method stub
		String text1=getText(reportcmntopt1);
		System.out.println(text1);
		getText(reportcmntopt1).equalsIgnoreCase("Sexual content");
		getText(reportcmntopt2).equalsIgnoreCase("Violent or repulsive content");
		getText(reportcmntopt3).equalsIgnoreCase("Hateful or abusive content");
		getText(reportcmntopt4).equalsIgnoreCase("Harassment or bullying");
		getText(reportcmntopt5).equalsIgnoreCase("Harmful or dangerous acts");
		getText(reportcmntopt6).equalsIgnoreCase("Promotes terrorism");
		getText(reportcmntopt7).equalsIgnoreCase("Spam or misleading");
		getText(reportcmntopt8).equalsIgnoreCase("Infringes my rights");
		getText(reportcmntopt9).equalsIgnoreCase("Captions issue");
		
	}



	public void navigatetomyplayandclickviewall() throws InterruptedException {
		// TODO Auto-generated method stub
		scroll();
		Thread.sleep(1000);
		scroll();
		click(navigateviewall);
		
		
	}



	public void verifydetailsmyplayvideo() {
		// TODO Auto-generated method stub
		isDisplayed(thumbnailmyplay);
		load_url("https://stagemyco.net/");
		
	}



	public void clickonsearchiconandsearchmyplayvideo() throws InterruptedException {
		// TODO Auto-generated method stub
//		click(alertntn);
		Thread.sleep(1000);
		click(searchbtn);
		type(searchBox,"water fall test");
		
	}



	public void accessmyplayvideoinother() {
		// TODO Auto-generated method stub
		click(newreleaseviewall);
		
		
	}



	public void accessmyplayvideoinothercategories() {
		// TODO Auto-generated method stub
		click(newreleaseviewall);
		
	}



	public void playmyplayvideoandverifydetails() throws InterruptedException {
		// TODO Auto-generated method stub
		load_url("https://stagemyco.net/");
		scroll();
		Thread.sleep(1000);
		scroll();
		click(clickmyplay);
		
	}
	

}
