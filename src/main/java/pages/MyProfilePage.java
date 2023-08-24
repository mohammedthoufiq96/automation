package pages;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BasePage;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://stagemyco.net/")
public class MyProfilePage extends BasePage {
  String Password = "css=input[placeholder='Password']";
  String Login = "xpath=//button[contains(text(),'Sign In')]";
  String SignInButton =
      "css=button[class='mr-[10px] sm:mr-[25px] sm:ml-[30px] border-none bg-transparent"
          + " mundial-regular font-[18px]']";
  String homePageicon = "css=img[class='w-[22px] h-[22px] mx-auto']";
  String signup = "xpath=//span[text()='Sign up now']";
  String Email = "xpath=//input[@placeholder='Username or email']";
  String Menu = "css=img[class='w-[35px] h-[15px] ml-[20px] mt-[7px] cursor-pointer']";

	String currentPasswordInput = "xpath=//input[@placeholder='Enter Current Password']";
	String newPasswordInput1 = "xpath=//input[@placeholder='Enter New Password']";
	String newPasswordInput2 =  "xpath=//input[@placeholder='Confirm New Password']";
	String changePasswordCancelButton = "xpath=//button[contains(text(), 'Cancel')]";
	String changePasswordSubmitButton = "xpath=//button[contains(text(), 'Submit')]";
	
	
	
	String deactivateLink = "xpath=//a[contains(text(), 'Deactivate/Delete your account')]";
	String logOutSideMenu = "xpath=//span/div[contains(text(), 'Logout')]";
	String  signInSideMenu = "xpath=//span/div[contains(text(), 'Sign in')]";
	String usernameInput = "xpath=//html/body/div[2]/div[1]/div/form/div[2]/div[2]/input";
	String passwordInput = "xpath=html/body/div[2]/div[1]/div/form/div[2]/div[3]/input";
	String  signInBtn = "xpath=html/body/div[2]/div[1]/div/form/div[2]/div[4]/button";
	
	String cancelDeactivation = "xpath=//*[@id=\"root\"]/div[2]/div/div/div/div/div[4]/div[2]/div[2]/div/div/div/button[1]";
	String  deactivateButton = "xpath=//html/body/div[2]/div[2]/div/div/div/div[4]/div[2]/div[2]/div/div/div/button[2]";
	String editIcon = "xpath=//html/body/div[2]/div[2]/div/div/div/div[2]/div/div[1]/img[2]";
	String  photoUpload = "xpath=//html/body/div[5]/div/div/div/div/input";
	String myprofile="//*[@id=\"root\"]/div[1]/div/div/ul/li[4]/span/span[2]";
	String editprofile="xpath=//*[@id=\"root\"]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[2]/div/img";
	String editpopup="xpath=/html/body/div[7]/div/div/div/div";
	String Locationbox="xpath=//input[@placeholder='Location']";
	String Locationbox1="//input[@placeholder='Location']";
	String editsubmit="xpath=//button[contains(text(),'Submit')]";
	String editcontinue="xpath=//button[contains(text(),'Continue')]";
	String changepassword="xpath=//*[@id=\"root\"]/div[2]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/button";
	String oldpassword="xpath=//*[@id=\"password\"]";
	String newpassword="xpath=//*[@id=\"newPassword\"]";
	String newpassword1="xpath=//*[@id=\"confirmPassword\"]";
	String passwordsubmit="xpath=/html/body/div[17]/div/div/div/div/div[2]/div[4]/button[2]";
	String passwordcontinue="xpath=//button[contains(text(), 'Continue')]";
	String signOutButton = "xpath=//span/div[text() = 'Logout']";
	String menuclose="xpath=//*[@id=\"root\"]/nav/div/div[1]/span/img";
	String eyebutton="\"//div[@id='password-eye-icon']\"";
	String passwordcancel="xpath=//button[normalize-space()='Cancel']";
	String deactive="xpath=//div/button[contains(text(), 'Deactive Account')]";
	String closedeactive="xpath=//a/button[contains(text(), 'Close')]";
	String validatemessagepassword="xpath=//div[@class='justify-center text-red-500 mundial-regular text-center mt-3']";
	private String getvalidatemessage;
	String editpic="xpath=//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div/div[1]/img[2]";
	String uploadpic="xpath=//input[@type='file']";
	String cropelement="ReactCrop__crop-selection";
	String uploadsubmit="xpath=//button[normalize-space()='Submit']";
	String closeuploadimage="xpath=//img[@src='/static/media/close.4fd9283e0674fff9cf4a9fc78dd2cb4f.svg']";
	String alertntn="id=moe-dontallow_button";
	
	public void RegisteredUserLogin(String username, String password) throws InterruptedException {

    Thread.sleep(1000);
    Thread.sleep(1000);

    click(SignInButton);
    click(SignInButton);

    type(Email, username);

    findBy("//div[@id='password-eye-icon']").click();
    type(Email, username);

    findBy("//div[@id='password-eye-icon']").click();

    type(Password, password);
    type(Password, password);

    click(Login);
    click(Login);

		Thread.sleep(2000);

	}
	
	public void ClickToMenubar() throws InterruptedException {	
		Thread.sleep(1000);
		  click(Menu);
		Thread.sleep(2000);
		  
	}
	
	public void clickOnMyProfile() throws InterruptedException {
//		Thread.sleep(1000);
		click(alertntn);
		findBy(myprofile).click();
	}
	

	
	
	public void validateMyProfileFeatures() {
//		findBy("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]").isDisplayed();
//		findBy("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]").isDisplayed();
//		findBy("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[2]").isDisplayed();
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div/p").getText().equalsIgnoreCase("first name last");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div/p").getText().equalsIgnoreCase("hellos worlds");
		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[1]/h2").getText().equalsIgnoreCase("Personal Information");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[2]/div/span").getText().equalsIgnoreCase("Edit details");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[1]/div[1]/p").getText().equalsIgnoreCase("name:");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[1]/div[2]/p").getText().equalsIgnoreCase("hellos worlds");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[2]/div[1]/p").getText().equalsIgnoreCase("user id:");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[2]/div[2]/p").getText().equalsIgnoreCase("testuser215");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[3]/div[1]/p").getText().equalsIgnoreCase("Email ID:");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[4]/div[1]/p").getText().equalsIgnoreCase("date of birth:");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[5]/div[1]/p").getText().equalsIgnoreCase("location:");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[6]/div[1]/p").getText().equalsIgnoreCase("phone:");
//		findBy("html/body/div[2]/div[2]/div/div/div/div[4]/div[2]/div[1]/h2").getText().equalsIgnoreCase("Account Safety & Security");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div[2]/div/div[1]/div[1]/p").getText().equalsIgnoreCase("Password");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/button").isDisplayed();
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div[3]/h2").getText().equalsIgnoreCase("Account Settings");
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div[3]/h2").getText().equalsIgnoreCase("Deactivate/Delete your account");		
	}
	
	
	public void clickEditProfile () {
//		findBy("/html/body/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[2]/div/span").click();
		click(editprofile);
	}

	public void validatePopUp() {
//		findBy("html/body/div[4]/div/div/div").isDisplayed();
//		findBy("html/body/div[4]/div/div/div/div/div[2]/div[1]/p").isDisplayed();
//		findBy("html/body/div[4]/div/div/div/div/div[2]/div[2]/input").isDisplayed();
//		findBy("html/body/div[4]/div/div/div/div/div[2]/div[3]/p").isDisplayed();
//		 findBy("html/body/div[4]/div/div/div/div/div[2]/div[4]/p").isDisplayed();
		isDisplayed(editpopup);
//		click(editsubmit);
		
	}
	
	public void editLocation() {
//		 findBy("html/body/div[4]/div/div/div/div/div[2]/div[4]/input").typeAndTab("Madrid");
//		 findBy("html/body/div[4]/div/div/div/div/div[2]/div[6]/button[2]").click();
//		Thread.sleep(1000);
//		type(Locationbox, "");
//		findBy(Locationbox).sendKeys("");
//		findBy(Locationbox).clear();
		clear(Locationbox1);
		type(Locationbox, "location");
		click(editsubmit);
//		click(editcontinue);
	}
	
	public void validateProfileUpdate() {
		click(editcontinue);
		
	}

	public void clickChangePassword() {
	click(changepassword);
	}


  public void passwordPopUp() {
    findBy("html/body/div[7]/div/div/div/div/div[1]/span")
        .getText()
        .equalsIgnoreCase("Change your password");
    isDisplayed(changePasswordCancelButton);
    isDisplayed(changePasswordSubmitButton);
    isDisplayed(currentPasswordInput);
    isDisplayed(newPasswordInput1);
    isDisplayed(newPasswordInput2);
  }


	public void enterMatchingPasswords() {
		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
		allEyeIcons.get(0).click();
		allEyeIcons.get(1).click();
		allEyeIcons.get(2).click();
		type(currentPasswordInput,"MyPassword123$");
		type(newPasswordInput1,"SecretPassword123?");
		type(newPasswordInput2,"SecretPassword123?");
	}

  //
  public void changePasswordSubmit() {
    click(changePasswordSubmitButton);
    findBy("//button[contains(text(), 'Continue')]").click();
  }
  //
//  public void changePasswordSubmit() {
//    click(changePasswordSubmitButton);
//    findBy("//button[contains(text(), 'Continue')]").click();
//  }

  public void logInWithOldPassword() {
    find("html/body/div[2]/div[1]/div/div/ul/li[9]/span").click();
    click(SignInButton);
    type(Email, "testuser55");
    type(Password, "MyPassword123$");
    click(Login);
  }
//  public void logInWithOldPassword() {
//    find("html/body/div[2]/div[1]/div/div/ul/li[9]/span").click();
//    click(SignInButton);
//    type(Email, "testuser55");
//    type(Password, "MyPassword123$");
//    click(Login);
//  }

  public void verifyOldPasswordError() {
    findBy("html/body/div[2]/div[1]/div/form/div[2]/div[1]")
        .getText()
        .equalsIgnoreCase("Incorrect username or password.");
  }
//  public void verifyOldPasswordError() {
//    findBy("html/body/div[2]/div[1]/div/form/div[2]/div[1]")
//        .getText()
//        .equalsIgnoreCase("Incorrect username or password.");
//  }

//  public void logInWithNewPassword() {
  public void logInWithNewPassword() {

		click(signOutButton);

	}

	

	public void belowEight(String password2) {
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,password2);
		type(newPasswordInput1,"P0375$");
		type(newPasswordInput2,"P0375$");
		click(changePasswordSubmitButton);
	}


	public void validateBelowEightError() throws IOException {
		String message=readdata("passwordmessagebelowEight");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
	}


	public void withoutUpperCase(String password2) {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,password2);
		type(newPasswordInput1,"test@555");
		type(newPasswordInput2,"test@555");
		click(changePasswordSubmitButton);
	}


	public void validateUpperCaseError() throws IOException {
		String message=readdata("passwordmessagenouppercase");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
	}


	public void withoutLowerCase(String password2) {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,password2);
		type(newPasswordInput1,"TEST@5");
		type(newPasswordInput2,"TEST@5");
		click(changePasswordSubmitButton);
	}
	
	public void validateLowerCaseError() throws IOException {
//		clickChangePassword();
		String message=readdata("passwordmessageforlowercase");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
	}

	public void withoutDigits(String password2) {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,password2);
		type(newPasswordInput1,"Test@Test");
		type(newPasswordInput2,"Test@Test");
		click(changePasswordSubmitButton);

	}

	public void validateWithoutDigitsError() throws IOException {
//		clickChangePassword();
		String message=readdata("passwordmessagenumber");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
	}

	public void withRestrictedChar(String password2) {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,password2);
		type(newPasswordInput1,"MyPassword&375|");
		type(newPasswordInput2,"MyPassword&375|");
		click(changePasswordSubmitButton);
	}

	public void validateRestrictedCharError() throws IOException {
		String message=readdata("passwordrestrictchar");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
//		findBy("html/body/div[7]/div/div/div/div/div[2]").getText().equalsIgnoreCase("password should not have & ^ | \" .");
	}

	public void misMatchPasswords(String password2) {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,password2);
		type(newPasswordInput1,"Test@555");
		type(newPasswordInput2,"Test@55555");
		click(changePasswordSubmitButton);
		
	}

	public void validateMisMatchPasswordsError() throws IOException {
		String message=readdata("passwordmismatch");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
//		findBy("/html/body/div[7]/div/div/div/div/div[2]").getText().equalsIgnoreCase("New password and confirm new password should match.");
	}

	
	public void invalidOldPassword() {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,"Test@5Test");
		type(newPasswordInput1,"Test@555");
		type(newPasswordInput2,"Test@555");
		click(changePasswordSubmitButton);
	}
	
	
	public void validateInvalidOldPasswordError() throws IOException {
		String message=readdata("invalidoldpassword");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
//		findBy("html/body/div[7]/div/div/div/div/div[2]").getText().equalsIgnoreCase("Please enter valid old password");
	}

	public void newPasswordWithSpace(String password2) {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,password2);
		type(newPasswordInput1,"Test@ 555");
		type(newPasswordInput2,"Test@ 555");
		click(changePasswordSubmitButton);
	}

	public void validateNewPasswordWithSpaceError() throws IOException {
		String message=readdata("newpasswordwithspace");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
;//		findBy("/html/body/div[7]/div/div/div/div/div[2]").getText().equalsIgnoreCase("password should not have spaces");
	}

	public void oldPasswordWithSpace() {
		clickChangePassword();
//		ListOfWebElementFacades allEyeIcons = findAll(eyebutton);
//		allEyeIcons.get(0).click();
//		allEyeIcons.get(1).click();
//		allEyeIcons.get(2).click();
		type(currentPasswordInput,"Test@ 777");
		type(newPasswordInput1,"Test@555");
		type(newPasswordInput2,"Test@555");
		click(changePasswordSubmitButton);
	}

	public void validateOldPasswordWithSpaceError() throws IOException {
		String message=readdata("newpasswordwithspace");
		getvalidatemessage=getText(validatemessagepassword);
//		System.out.println(getvalidatemessage);
		getvalidatemessage.equalsIgnoreCase(message);
		click(changePasswordCancelButton);
//		findBy("/html/body/div[7]/div/div/div/div/div[2]").getText().equalsIgnoreCase("password should not have spaces");
	}

	

  public void clickDeactivateLink() {
    click(deactivateLink);
  }

  public void cancelDeactivateAction() {
    click(cancelDeactivation);
  }


	public void verifyPopUpIsClosed() {
		isDisplayed(deactivateLink);
		}
	
	public void clickDeactivateLinkAgain() throws InterruptedException {
		click(deactivateLink);
		click(deactive);
		click(closedeactive);
//		findBy("//a/button[contains(text(), 'Close')]").click();
		Thread.sleep(2000);
	}


	public void verifyUserIsLoggedOut() {
		isDisplayed(SignInButton);
	}


  public void verifyDeactivatedErrorMessage() {
    // TODO Auto-generated method stub

  }


	public void clickEditIcon() {
		click(editpic);
		
	}


	public void uploadPhoto() {
		String path1=System.getProperty("user.dir");
		System.out.println(path1);
		String path=path1+"\\assests\\pictures\\th.jpg";
		System.out.println(path);
		type(uploadpic,path);
//		findBy("//html/body/div[5]/div/div/div/div/input").sendKeys(path);
//		findBy("/html/body/div[5]/div/div/div/div/div[4]/button").click();//submit button
	}


	public void cropAndSubmit() throws InterruptedException {
//		findBy("html/body/div[5]/div/div/div/div/div[4]/button").click();
//		findBy("//div[@class = 'flex items-start justify-end rounded-t']/img").click();
		cropimage(cropelement);
		click(uploadsubmit);
		Thread.sleep(2000);
		
	}


	public void verifyImageOnPlatform() {
		click(closeuploadimage);
		String src = findBy("//img[contains(@alt,'profile img')]").getAttribute("src");
//		System.out.println(src);
		src.contains("th");
	}

	public void entervaliddetailstochangepassword() {
		// TODO Auto-generated method stub
		type(oldpassword,"Test@666");
		type(newpassword,"Test@555");
		type(newpassword1,"Test@555");
		click(changePasswordSubmitButton);
		
		
	}

	public void verifysuccessmessage() {
		click(passwordcontinue);
		click(menuclose);
		click(signOutButton);
		// TODO Auto-generated method stub
		
	}

	
	
	
}

