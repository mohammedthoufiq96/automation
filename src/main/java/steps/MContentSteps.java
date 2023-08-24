package steps;

import java.io.IOException;
import java.util.ArrayList;

import base.BasePage;
import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class MContentSteps {

	HomePage home;
	BasePage getdata;
	String useremail="test_mohammed18@yopmail.com";
	String username="test18_thoufiq7";
	String email;
	String password;
	private String useremailid;
	private String no;



	@Step("Navigate to Home Page")
	public MContentSteps navigate() {
		home.open();
		return this;
	}

	@Step("Login to application as registered user")

	public void registereduserlogin() throws InterruptedException, IOException {
		email=getdata.readdata("username");
		password=getdata.readdata("password");

		home.RegisteredUserLogin(email, password);
		

	}

	@Step("Login to application as registered user")

	public void registereduserloginaftermailverfication() throws InterruptedException {

		home.RegisteredUserLoginafteremailverfication(useremail, "Thoufiq@7");

	}

	@Step("Login to application as non admin registered user")

	public void nonadminregistereduserlogin() throws InterruptedException {

		home.RegisteredUserLogin("stgithub001@gmail.com", "Qwaszx@123");

	}

	public void guestusersignup() throws InterruptedException {
		home.signup();

	}

	@Step("Login to application as guest user")

	public void guestuserlogin() throws IOException {
		email=getdata.readdata("usernameold");
		password=getdata.readdata("passwordold");

		home.GuestUserLogin(email,password);

	}

	@Step("Element is Displayed")

	public void eledisplay(String xpath) {

		// home.isDisplayed("//*[@id = 'username']");
		// home.isDisplayed("//input[@id='search']");

	}

	public void navtigateToHomepage() {

		home.clickonHome();

	}

	@Step("Element is Displayed")

	public void footervisible() {
		home.footericons();
	}

	@Step("Element is Displayed")

	public void movetoEnd() {

		home.scrolltoEnd();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Step("Click On dislike Button")

	public void clickonvideo() throws InterruptedException {

		home.clickonvideo();

	}

	@Step("Click On dashboard Button")

	public void clickonDashboard() throws InterruptedException {

		home.clickonDashboard();

	}

	@Step("Dislike Button is greyed out")

	public void dislikegreyedout() throws InterruptedException {

		home.likebtnnotdisplayed();

	}

	@Step("Validate Search")

	public void ValidateSearch() throws InterruptedException {

		home.validateSearch();

	}

	@Step("Login to application as admin user")

	public void adminUserLogin() {

		home.otherUserLogin("admin", "admin123");

	}

	@Step("Click on Like button")
	public void clickonlikebutton() throws InterruptedException {
		home.ClickOnlikeButton();

	}

	@Step("Validate Like button is Greyed out")
	public void likegreyedout() {
		home.likebtnnotdisplayed();

	}

	@Step("Click on Share button")
	public void clickonsharebtn() throws InterruptedException {
		home.ClickonShareButton();

	}

	@Step("Click on whatsapp icon")
	public void clickonwhatsapp() throws InterruptedException {
		home.clickonwhatsapp();

	}

	@Step("Validate Share button")
	public void validateSharebtn() {
		home.validateSharebtn();

	}

	@Step("Validate Like button")
	public void validatelikeebtn() {
		home.likebtndisplayed();

	}

	@Step("Validate Icons")
	public void validateIcons() {
		home.validateIcons();

	}

	@Step("Validate User Promoted Videos")
	public void enterSearch() {
		home.enterSearch();
	}

	@Step("Validate Like button")
	public void validatedislikeebtn() {

		home.dislikebtndisplayed();

	}

	@Step("Click on dislike button")
	public void clickdislikeebtn() throws InterruptedException {

		home.clickondislikeButton();

	}

	@Step("Validate Comment")
	public void validateComment() throws InterruptedException {
		home.validateComment();
	}

	@Step("Click On Comment section")
	public void clickoncommentsection() throws InterruptedException {

		home.addComment();

	}

	@Step("Click On comment section")
	public void clickonCommentsection() throws InterruptedException {

		home.clickoncommentsection();

	}

	@Step("user is not able to add comment in comment box")
	public void addcommentnotvisible() throws InterruptedException {

		home.addcommentnotvisible();

	}

	@Step("Validate Login")
	public void validateSignIn() throws InterruptedException {

		home.loginDisplayed();

	}

	@Step("Validate cancelbtn")
	public void validateCancelbtn() throws InterruptedException {

		home.cancelbtnDisplayed();

	}

	@Step("Validate commentbtn")
	public void validateCommentbtn() throws InterruptedException {

		home.commentbtnDisplayed();

	}

	@Step("Validate Delete option")
	public void validateDeleteOption() throws InterruptedException {

		home.validateDeleteOption();

	}

	@Step("Click on own comment")
	public void cickonOwnComment() throws InterruptedException {

		home.clickOnOwnComment();

	}

	@Step("Click on delete button")
	public void clickDeletebtn() throws InterruptedException {

		home.clickDeleteButton();

	}

	@Step("Validate Deleted comment")
	public void validateDeletedcomment() throws InterruptedException {

		home.validateDeletedcomment();

	}

	@Step("Click other users comment")
	public void clickOtherUsersComment() throws InterruptedException {

		home.clickOtherUsersComment();

	}

	@Step("Validate Recommended Catgeory")
	public void validaterecommendedatgeory() throws InterruptedException {

		home.validaterecommendedatgeory();

	}

	@Step("Validate reply")
	public void validateReply() throws InterruptedException {

//		home.validateReply();

	}

	@Step("Validate Top Trending Category")
	public void validatetoptrendingcategory() throws InterruptedException {

//		home.validatetoptrendingcategory();

	}

	@Step("Validate New Releases Category")
	public void validatenewreleasescategory() throws InterruptedException {

		home.validatenewreleasescategory();

	}

	@Step("Validate Most watched Category")
	public void validatemostwatchedcategory() throws InterruptedException {

		home.validatenewreleasescategory();

	}

	@Step("user clicks on three dots and report link")
	public void clickonthreedots() throws InterruptedException {

		home.clickonthreedots();

	}

	@Step("user selects the options for report")
	public void selectreportoption() throws InterruptedException {

		home.validatenewreleasescategory();

	}

	@Step("user clicks on submit button")
	public void clicksubmit() throws InterruptedException {

//		home.clicksubmitbutton();

	}

	@Step("user validates that report is submitted")
	public void validatereport() throws InterruptedException {

//		home.validatereport();

	}

	// User Registration

	@Step("Validate user click on sign in")
	public void validateuserclickonsignin() throws InterruptedException {
		home.validateuserclickonsignin();
	}

	@Step("Click new user register link")
	public void clicknewuserregisterlink() throws InterruptedException {
		home.clicknewuserregisterlink();
	}

	@Step("Enter register user data")
	public void enterRegisterUserData() throws InterruptedException {
		home.newuserregistration("mohammed", "thoufiq", useremail, username, "Thoufiq@7");
	}

	@Step("User enters valid registration details with an exisiting users username")
	public void Userentersvalidregistrationdetailswithanexisitingusersusername() throws InterruptedException {
		home.userregistrationwithexisitingusername("mohammedtest", "thoufiqtest", "test_mohammed999@yopmail.com",
				"thoufiqstage3", "Thoufiq1233@7");
	}

	@Step("Verify {string} error message should show")
	public void verifyingerrormessage() throws InterruptedException {
		home.verifyerrormessage();
	}

	@Step("Click Register button")
	public void clickRegisterbtn() throws InterruptedException {
		home.clickRegisterbtn();
	}

	@Step("Enter existing User Name")
	public void enterExistingUserName() throws InterruptedException {
		home.feilderrorvalidation("Munna", "Niyaz", "niyaz.munna09@gmail.com", "Niyaz", "!nc0recT");
	}

	@Step("Validate existing User Name error")
	public void validateUserNameError() {
		home.validateUserNameError();

	}

	@Step("Enter email address")
	public void enterEmailAddress() throws InterruptedException {
		home.enterEmailAddress("ABCD", "XYZ", "hkhande", "tyr", "P455w0rd#");

	}

	@Step("validate email address")
	public void validateEmailAddress() {
		home.validateEmailAddress();

	}

	@Step("validate Password field")
	public void validPasswordfield() throws InterruptedException {

		home.enterWrongPassword("ABCD", "XYZ", "test.anushka123@gmail.com", "harsha", "P455w0rd#", "P$55");
		home.validatepasswordmatch();
	}

	@Step("validate Terms and Conditions")
	public void validateTermsandConditions() {
		home.validateTermsandConditions();
	}

	@Step("validate Error messages")
	public void validateErrorMessages() {
		home.validateErrorMessages();

	}

	// Search functionality

	@Step("Validate User Promoted Videos")
	public void videoStartsWithA() {
		home.videoStartsWithA();
	}

	@Step("Validate Suggestions")
	public void validateSuggestions() {
		home.validateSuggestions();
	}

	@Step("Validate search field")
	public void validatesearchfield() {
		home.validatesearchfield();
	}

	// About Us PP and contact Us

	@Step("User clicks on about link")
	public void clickaboutlink() {
		home.clickaboutlink();
	}

	@Step("User is redirected to older website link for about us")
	public void aboutuslink() {
		home.aboutuslink();
	}

	@Step("use scrolls down to the footer section")
	public void footersection() {
		home.footersection();
	}

	@Step("user clicks on Privacy Policy link")
	public void clickprivacypolicylink() {
		home.clickprivacypolicylink();
	}

	@Step("user is redirected to older website link for about Private policy")
	public void privacypolicylink() {
		home.privacypolicylink();
	}

	@Step("user clicks on Contact us link")
	public void clickcontactus() {
		home.clickcontactuslink();
	}

	@Step("user is redirected to older website link for about Contact Us")
	public void contactuslink() {
		home.contactuslink();
	}

	public void verifyMyRewards() {

		home.verifyMyRewards();

	}

	public void uploadVideo() {

		home.uploadVideo();
	}
//	public void viewprofile() {
//		home.viewprofile();
//		
//	}

	public void manageUploads() {

		home.manageUploads();
	}

	public void guestuserregistration() throws InterruptedException {
		// enter valid inputs
		home.newuserregistration("", "", "", "", "");

	}

	public void manageVideos() throws InterruptedException {

		home.clickManageVideos();

	}

	public String deleteFirstVideo() throws InterruptedException {

		home.clickdelete();
		home.confirmDelete();
		String text = home.getTextOfDeleteVideo();
		return text;
	}

	// This verifies if the video has been deleted or not
	public void validateDelete(String videoname) {

		for (int i = 1; i < 100; i++) {

			ArrayList<String> list = new ArrayList<String>();
			String title = home.getText(
					"(//div[contains(@class,'grid dark:bg-dark-default sm:grid-cols')]//descendant::div[contains(@class,'w-full pb-')])["
							+ i + "]");
			list.add(title);
			if ((!list.contains(videoname))) {
				System.out.println("Video deleted succesfully");
			}

			else {
				System.out.println("Video is not deleted");
			}
		}

	}

	public void ClickToMenubar() throws InterruptedException {
		home.ClickToMenubar();

	}

	public void validateHomepageOptions() {
		home.validateHomepageOptions();

	}

	public void BeforeLoginSideBarVisible() {
		home.BeforeLoginSideBarVisible();

	}

	public void AfterLoginSideBarVisible() {
		home.AfterLoginSideBarVisible();
	}

	public void HeaderVisible() throws InterruptedException {
		home.HeaderVisible();

	}

	public void signup() throws InterruptedException {
		home.signup();
	}

	public void ClicktoSignin() throws InterruptedException {
		home.ClicktoSignin();

	}

	public void HeroBanner() {

		home.HeroBanner();
	}

	public void validatesigninpopupdetails() throws InterruptedException {

		home.validatesigninpopupdetails();
	}

	public void enteringemailandpassword() throws InterruptedException, IOException {
		
		username=getdata.readdata("usernameold");
		password=getdata.readdata("passwordold");
//		home.RegisteredUserLogin(username,password);
		home.enteringemailandpassword(username, password);
	}

	public void verifypasswordeye() {
		home.verifypasswordeye();
	}

	public void Recommendedcategory() {
		home.validaterecommendedatgeory();
	}

	public void yolomailcheck() throws InterruptedException {
		home.yolomailcheck();

	}

	public void clickresetpassword() {
		home.clickresetpassword();
		// TODO Auto-generated method stub
		
	}

	public void forgotpasswordflow() {
		
		home.forgotpasswordflow();
		// TODO Auto-generated method stub
		
	}

	public void clicksignuplink() {
		// TODO Auto-generated method stub
		home.clicksignpulink();
		
	}

	public void verifysignuppopup() {
		home.verifysignuppopup();
		// TODO Auto-generated method stub
		
	}

	public void accesstheapplication() {
		home.open();
		// TODO Auto-generated method stub
		
	}

	public void clickonsignin() throws InterruptedException {
		// TODO Auto-generated method stub
		home.validateuserclickonsignin();
		
	}

	public void clickongooglelogin() throws InterruptedException {
		home.clickongooglelogin();
		// TODO Auto-generated method stub
		
	}

	public void enterLogindetailsandvalidate(String string, String string2) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		if(string.equalsIgnoreCase("registered username with space at beginning")) {
			home.validateusernameandpassword(" "+email+"", password);
			home.validateafterlogin(string2,"username");
			
		}else if(string.equalsIgnoreCase("registered username with space at end")) {
			home.validateusernameandpassword(email+" ", password);
			home.validateafterlogin(string2,"username");
			
		}else if(string.equalsIgnoreCase("registered username with space at in between")) {
			home.validateusernameandpassword("thoufiq stage3", password);
			home.validateafterlogin(string2,"username");
			
		}else if(string.equalsIgnoreCase("registered username with space at beginning,inbetween and end")) {
			home.validateusernameandpassword(" thoufiq stage3 ", password);
			home.validateafterlogin(string2,"username");
			
		}else if(string.equalsIgnoreCase("registered password with space at beginning")) {
			home.validateusernameandpassword(email, " "+password+"");
			home.validateafterlogin(string2,"password");
			
		}else if(string.equalsIgnoreCase("registered password with space at ending")) {
			home.validateusernameandpassword(email, password+" ");
			home.validateafterlogin(string2,"password");
			
		}else if(string.equalsIgnoreCase("registered password with space at beginning,inbetween and end")) {
			home.validateusernameandpassword(email, " Test @777 ");
			home.validateafterlogin(string2,"password");
			
		}else if(string.equalsIgnoreCase("invalid password")) {
			home.validateusernameandpassword(email, "Test@777888");
			home.validateafterlogin(string2,"password");
		}
	
		
	}

	public void enterinvalidemailandvalidate(String string, String string2) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println(string);
		useremail=getdata.readdata("useremail");
		password=getdata.readdata("password");
		
		if(string.equalsIgnoreCase("registered email with space at beginning")) {
			home.validateusernameandpassword(" "+useremail+"", password);
			home.validateafterlogin(string2,"username");
			
		}else if(string.equalsIgnoreCase("registered email with space at end")) {
			home.validateusernameandpassword(useremail+" ", password);
			home.validateafterlogin(string2,"username");


		}else if(string.equalsIgnoreCase("registered email with space at in between")) {
			home.validateusernameandpassword("stage_mohammed2 @yopmail.com", password);
			home.validateafterlogin(string2,"username");
			
		}else if(string.equalsIgnoreCase("registered email with space at beginning,inbetween and end")) {
			home.validateusernameandpassword(" stage_mohammed2 @yopmail.com ", password);
			home.validateafterlogin(string2,"username");
			
		}else if(string.equalsIgnoreCase("registered password with space at beginning")) {
			home.validateusernameandpassword(useremail, " "+password+"");
			home.validateafterlogin(string2,"password");
			
		}else if(string.equalsIgnoreCase("registered password with space at ending")) {
			home.validateusernameandpassword(useremail, password+" ");
			home.validateafterlogin(string2,"password");
			
		}else if(string.equalsIgnoreCase("registered password with space at beginning,inbetween and end")) {
			home.validateusernameandpassword(useremail, " Test @777 ");
			home.validateafterlogin(string2,"password");
			
		}else if(string.equalsIgnoreCase("invalid password")) {
			home.validateusernameandpassword(useremail, "Test@777888");
			home.validateafterlogin(string2,"password");
		}
		
	}

	public void clickcommentsignin() {
		home.clickcommentsignin();
		// TODO Auto-generated method stub
		
	}

	public void loginandverifytheaddcomment() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		home.RegisteredUserLogin(email, password);
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		home.addCommentafterlogin(email, password);
		
		
	}

	public void clickonanyvideoandverifysignuppop() throws IOException {
		// TODO Auto-generated method stub
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		home.clickonanyvideoandverifysignuppop(email, password);
		
	}

	public void accessandclickonsigninforverify() throws IOException {
		// TODO Auto-generated method stub
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		home.accessandclicksigninverify(email,password);
		
	}

	public void verifysignuperrormessage(String string) {
		// TODO Auto-generated method stub
		home.verifysignuperrormessage(string);
		
	}

	public void validatemultipleusername(String string) throws InterruptedException {
		// TODO Auto-generated method stub
//		home.generatingtempmail();
		String useremail=useremailid+"@mail7.io";
		if(string.equalsIgnoreCase("space in the middle")) {
			home.newuserregistration("mohammed", "thoufiq", "mohammedthoufiq11@test.com", "stage thoufiq2", "Thoufiq@7");
			
		}
		else if(string.equalsIgnoreCase("space in the start middle and end")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", "mohammedthoufiq11@test.com", " stage thoufiq2 ", "Thoufiq@7");
		}
		else if(string.equalsIgnoreCase("space in the start and end")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, " stagethoufiq2 ", "Thoufiq@7");
		}else if(string.equalsIgnoreCase("space at the end")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2 ", "Thoufiq@7");
		}
		else {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq"+no, "Thoufiq@"+no);
		}
	}

	public void validateregistersuccessandverifymail() throws InterruptedException {
		// TODO Auto-generated method stub
		home.validateregistersuccessandverifymail(useremailid);
		
	}

	public void createmailid() throws InterruptedException, IOException {
		no=getdata.readdata("usernumber");
		useremailid="thoufiqstage"+no;
		int n=Integer.parseInt(no);
		n++;
		String num=Integer.toString(n);
		home.generatingtempmail(useremailid);
		getdata.updatedata("usernumber", num);
		// TODO Auto-generated method stub
		
	}

	public void verifysignupfields() {
		// TODO Auto-generated method stub
		home.verifysignupfields();
		
	}

	public void signuppopclose() {
		// TODO Auto-generated method stub
		home.signuppopclose();
		
	}

	public void userclickpassword() {
		// TODO Auto-generated method stub
		home.userclickpassword();
		
	}

	public void verifythepasswordcondition() {
		// TODO Auto-generated method stub
		home.verifythepasswordcondition();
	}

	public void validatingmultiplepasswords(String string) throws InterruptedException {
		// TODO Auto-generated method stub
		if(string.equalsIgnoreCase("Restricted Characters")) {
			home.newuserregistration("mohammed", "thoufiq", "mohammedthoufiq11@test.com", "stagethoufiq2", "Thoufiq|7");
			
		}
		else if(string.equalsIgnoreCase("less than eight characters")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", "mohammedthoufiq11@test.com", "stagethoufiq2 ", "Tws@7");
		}
		else if(string.equalsIgnoreCase("without any uppercase")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2", "thoufiq@7");
		}else if(string.equalsIgnoreCase("without any lowercase")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2 ", "THOUFIQ@7");
		}
		else if(string.equalsIgnoreCase("without any numbers")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq"+no, "Thoufiq@test");
		}
		else if(string.equalsIgnoreCase("space at start")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2", " Thoufiq@7");
		}
		else if(string.equalsIgnoreCase("space at end")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2", "Thoufiq@7 ");
		}	else if(string.equalsIgnoreCase("space in the middle")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2", "Thoufiq @7");
		}else if(string.equalsIgnoreCase("space in the start middle and end")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2", " Thoufiq @7 ");
		}else if(string.equalsIgnoreCase("password doesnot match")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", useremail, "stagethoufiq2", "Thoufiq@7");
		}
	
		
	}

	public void validatepassworderrormessage() {
		home.validatepassworderrormessage();
		// TODO Auto-generated method stub
		
	}

	public void validatemultipleemailregister(String string) throws InterruptedException {
		// TODO Auto-generated method stub
		if(string.equalsIgnoreCase("with @")) {
			home.newuserregistration("mohammed", "thoufiq", "mohammedthoufiq11test.com", "stagethoufiq2", "Thoufiq@7");
			
		}
		else if(string.equalsIgnoreCase("with space at start")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", " mohammedthoufiq11@test.com ", "stagethoufiq2 ", "Thoufiq@7");
		}
		else if(string.equalsIgnoreCase("with space at end")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", "mohammedthoufiq11 @test.com ", "stagethoufiq2", "Thoufiq@7");
		}else if(string.equalsIgnoreCase("with space at middle")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", "mohammedthoufiq11 @test.com", "stagethoufiq2 ", "Thoufiq@7");
		}
		else if(string.equalsIgnoreCase("with space at start middle and end")) {
			home.open();
			home.validateuserclickonsignin();
			home.signup();
			home.newuserregistration("mohammed", "thoufiq", " mohammedthoufiq11 @test.com ", "stagethoufiq"+no, "Thoufiq@7");
		}
		
	}

	public void validatevideoplayeroption() {
		// TODO Auto-generated method stub
		home.videoplayeroption();
		
	}

	public void clickonuseroption() throws InterruptedException {
		home.clickonuseroption();
		// TODO Auto-generated method stub
		
	}

	public void videodetailsdisplayed() {
		// TODO Auto-generated method stub
		home.videodetailsdisplayed();
	}

	public void navigate_to_the_myplay_section() {
		// TODO Auto-generated method stub
		home.navigate_to_the_myplay_section();
		
	}

	public void clickonmyplay() {
		home.click_myplay_video();
		// TODO Auto-generated method stub
		
	}

	public void validatethesignuppopup() throws InterruptedException {
		// TODO Auto-generated method stub
		home.validatethesignuppopup();
	}

	public void click_on_myplay_video_from_suggestion_videos() {
		// TODO Auto-generated method stub
		home.click_on_myplay_video_from_suggestion_videos();
		
	}

	public void myplay_video_should_start_playing() {
		// TODO Auto-generated method stub
		home.myplay_video_should_start_playing();
	}

	public void refresh_the_page() {
		// TODO Auto-generated method stub
		home.refresh_the_page();
		
	}

	public void the_user_should_be_login_the_signin_pop_up_should_not_be_displayed() {
		// TODO Auto-generated method stub
		home.the_user_should_be_login_the_signin_pop_up_should_not_be_displayed();
		
	}

	public void signinpclose() {
		// TODO Auto-generated method stub
		home.open();
		home.click_myplay_video();
//		home.signinpclose();
		
	}
	public void myplaysignin() throws IOException {
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		home.myplaysignin(email, password);
	}
	public void verifydownloadicons() {
		// TODO Auto-generated method stub
//		home.verifydownloadicons()
		home.verifyDownloadIcons();;
		
	}

	public void userclickonicon() {
		// TODO Auto-generated method stub
		home.clickIosIcon();
		
		
	}

	public void user_is_redirected_to_respective_ios_page() {
		// TODO Auto-generated method stub
		home.validateiospage();
		
	}

	public void userClickonandroidicon() {
		// TODO Auto-generated method stub
		home.open();
		home.clickAndroidIcon();
		
	}

	public void user_rediected_android_page() {
		// TODO Auto-generated method stub
		home.user_rediected_android_page();
	}

	public void validatedownloadicon() {
		// TODO Auto-generated method stub
		home.verifyDownloadIcons();
		
	}

	public void userclickonavideo() {
		// TODO Auto-generated method stub
		home.userclickonavideo();
		
	}

	public void userclickonthreedots() {
		// TODO Auto-generated method stub
		home.clickonthreedots();
		
	}

	public void userclickonreportuseroption() {
		// TODO Auto-generated method stub
		home.userclickonreportuseroption();
		
	}

	public void verifycorrectoptions() {
		// TODO Auto-generated method stub
		home.verifyUserReportOptions();
		
	}

	public void reportthevideo() {
		// TODO Auto-generated method stub
		home.selecttheoptionforreport();
		
	}

	public void navigatetomyplayonhomepage() {
		// TODO Auto-generated method stub
		home.open();
		home.click_myplay_video();
		
	}

	public void verifythreedotsformyplay() {
		// TODO Auto-generated method stub
		home.verifythreedotsformyplay();
		
	}

	public void useraddacomment() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin(username, password);
		home.userclickonavideo();
		home.useraddacomment();
		
	}

	public void usersignsoutandsignin() throws InterruptedException, IOException {
		home.signOut();
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin(username, password);
		// TODO Auto-generated method stub
		
	}

	public void usercommentvisisble() {
		home.userclickonavideo();
		home.commentvisible();
		// TODO Auto-generated method stub
		
	}

	public void userbeginscommentingemoji() {
		// TODO Auto-generated method stub
		home.userbeginscommentingemoji();
		
	}

	public void userclickonthreedotsoncomment() {
		// TODO Auto-generated method stub
		home.userclickonthreedotsoncomment();
		
	}

	public void userclickdeleteoption() {
		home.userclickdeleteoption();
		// TODO Auto-generated method stub
		
	}

	public void userclickondeletecancel() {
		// TODO Auto-generated method stub
		home.userclickondeletecancel();
	}

	public void verifythecmnt() {
		// TODO Auto-generated method stub
		home.verifythecmnt();
		
	}

	public void userclickdeletecmnt() {
		// TODO Auto-generated method stub
		home.userclickdeletecmnt();
		
	}

	public void verifydeletedcomment() {
		// TODO Auto-generated method stub
		home.verifydeletedcomment();
		
	}

	public void deletereplycomment() {
		// TODO Auto-generated method stub
		home.deletereplycmnt();
		
	}

	public void verifycommentsectionofguest() {
//		home.userclickonavideo();
		home.verifyCommentSection();
		
	}

	public void userclickonsignincmnt() {
		// TODO Auto-generated method stub
		home.clickcommentsectionofguest();
		
	}

	public void signincmnt() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		home.signincmnt(username, password);
		
	}

	public void usercmntinemojins() {
//		home.userclickonavideo();
		home.useraddacomment();
		// TODO Auto-generated method stub
		
	}

	public void clickcanceloncomment() {
		// TODO Auto-generated method stub
		home.clickcanceloncomment();
	}

	public void usercommentsagainandclicksubmits() {
		// TODO Auto-generated method stub
		home.usercommentsagainandclicksubmits();
		
	}

	public void commentshouldbedisplayed() {
		// TODO Auto-generated method stub
		home.commentshouldbedisplayed();
		
	}

	public void userclickreply() {
		// TODO Auto-generated method stub
		home.userclickreply();
		
	}

	public void userreplyemoji() {
		// TODO Auto-generated method stub
		home.userreplyemoji();
		
	}

//	public void userclickcancelonreply() {
//		// TODO Auto-generated method stub
//		home.userclickcancelonreply();
//		
//	}

	public void userclicksubmitonreply() {
		// TODO Auto-generated method stub
		home.userclicksubmitonreply();
		
	}

	public void commentshouldbedisplayedudernaththefirst() {
		// TODO Auto-generated method stub
		home.commentshouldbedisplayedudernaththefirst();
		
	}

	public void userclicklikeanddislike() throws InterruptedException {
		// TODO Auto-generated method stub
		home.userclicklikeanddislike();
		
	}

	public void verifysigninpopup() {
		// TODO Auto-generated method stub
		home.verifysignuppopup();
		
	}

	public void registereuserclicklikeanddislike() throws InterruptedException {
		// TODO Auto-generated method stub
		home.userclicklikeanddislike();
		
	}

	public void verifylikeanddislike() {
		// TODO Auto-generated method stub
		home.verifylikeanddislike();
		
	}

	public void useraddcommemtsandclickpost() {
		// TODO Auto-generated method stub
		home.useraddcommemtsandclickpost();
		
	}

	public void verifythecomntonlypostedonce() {
		// TODO Auto-generated method stub
		home.verifythecomntonlypostedonce();
		
	}

	public void useraddcmntandclickpostmanytimes() {
		// TODO Auto-generated method stub
		home.useraddcmntandclickpostmanytimes();
		
	}

	public void verfiythecomntwasonlypostedonce() {
		// TODO Auto-generated method stub
		home.verfiythecomntwasonlypostedonce();
		
	}

	public void navigatestofooter() throws InterruptedException {
		// TODO Auto-generated method stub
		home.navigatestofooter();
	}

	public void verifythesocialmedialinksoffooter() {
		// TODO Auto-generated method stub
		home.verifythesocialmedialinksoffooter();
	}

	public void selectreportcommentoption() {
		// TODO Auto-generated method stub
		home.selectreportcommentoption();
	}

	public void accessyourvideo() throws InterruptedException, IOException {
		email=getdata.readdata("usernameold");
		password=getdata.readdata("passwordold");
		home.RegisteredUserLogin(email, password);
		home.searchyourvideo();
		// TODO Auto-generated method stub
		
	}

	public void selectaoption() {
		// TODO Auto-generated method stub
		home.selectaoption();
		
		
	}

	public void validatethecontentinpopup() {
		// TODO Auto-generated method stub
		home.verifycmntReportOptions();
		
	}

	public void selectandsubmitreportcmnt() {
		// TODO Auto-generated method stub
		home.selectandsubmitreportcmnt();
	}

	public void navigatetomyplayandclickviewall() throws InterruptedException {
		// TODO Auto-generated method stub
		home.navigatetomyplayandclickviewall();
		
	}

	public void verifydetailsmyplayvideo() {
		// TODO Auto-generated method stub
		home.verifydetailsmyplayvideo();
	}

	public void clickonsearchiconandsearchmyplayvideo() throws InterruptedException {
		// TODO Auto-generated method stub
		home.clickonsearchiconandsearchmyplayvideo();
		
	}

	public void accessmyplayvideoinother() {
		// TODO Auto-generated method stub
		home.accessmyplayvideoinother();
	}

	public void logintoapplicationasuser() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		email=getdata.readdata("username");
		password=getdata.readdata("password");
		home.RegisteredUserLogin(email, password);
		
	}

	public void accessmyplayvideoinothercategories() {
		// TODO Auto-generated method stub
		home.accessmyplayvideoinothercategories();
		
	}

	public void playmyplayvideoandverifydetails() throws InterruptedException {
		// TODO Auto-generated method stub
		home.playmyplayvideoandverifydetails();
		
	}

}
