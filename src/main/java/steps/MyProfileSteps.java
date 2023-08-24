package steps;

import java.io.IOException;

import net.thucydides.core.annotations.Step;

public class MyProfileSteps {
	
	
	pages.MyProfilePage mpp;
	base.BasePage getdata;
	
	String username;
	String password;

//  pages.MyProfilePage mpp;

	@Step("User access the application and navigates to MyProfile")
	public void navigate() throws InterruptedException, IOException {
		mpp.open();
		username=getdata.readdata("username");
		password=getdata.readdata("password");
		mpp.RegisteredUserLogin(username,password);	
		mpp.ClickToMenubar();
		mpp.clickOnMyProfile();
	}
	
	@Step("verify the features of MyProfile are correct")
	public void validateFeatures() {
		mpp.validateMyProfileFeatures();
	}
	
	@Step("user clicks on the edit profile link")
	public void clickEditProfile() {
		mpp.clickEditProfile();
	}

//  @Step("verify the features of MyProfile are correct")
//  public void validateFeatures() {
//    mpp.validateMyProfileFeatures();
//  }
//
//  @Step("user clicks on the edit profile link")
//  public void clickEditProfile() {
//    mpp.clickEditProfile();
//  }

	@Step("user edits location and submits changes")
	public void editLocation() throws InterruptedException {
		mpp.editLocation();
				
	}

  @Step("the correct fields should be available to edit")
  public void verfiyFields() {
    mpp.validatePopUp();
  }

	
	@Step("user clicks on the change password button")
	public void clickChangePassword1() {
		mpp.clickChangePassword();
	}
	
	
	@Step("user enters valid old password matching new passwords below eight char")
	public void belowEight() throws IOException {
		password=getdata.readdata("password");
		mpp.belowEight(password);		
	}
	
	@Step("correct below eight error message should display")
	public void ValidateBelowEightError() throws IOException {
		mpp.validateBelowEightError();
			}

	@Step("user enters valid old password matching new passwords w\\/o uppercase")
	public void withoutUpperCase() throws IOException {
		password=getdata.readdata("password");
		mpp.withoutUpperCase(password);	
	}

	@Step("correct w\\/o uppercase error message should display")
	public void validateUpperCaseError() throws IOException {
		mpp.validateUpperCaseError();
		
	}

	@Step("user enters valid old password matching new passwords w\\/o lowercase")
	public void withoutLowerCase() throws IOException {
		password=getdata.readdata("password");
		mpp.withoutLowerCase(password);
	}
	
	@Step("correct w\\/o lowercase error message should display")
	public void validateLowerCaseError() throws IOException {
		mpp.validateLowerCaseError();		
	}
	
	@Step("user enters valid old password matching new passwords w\\\\/o any digits")
	public void withoutDigits() throws IOException {
		password=getdata.readdata("password");
		mpp.withoutDigits(password);
		
	}

	@Step("correct w\\\\/o digits error message should display")
	public void validateWithoutDigits() throws IOException {
		
		mpp.validateWithoutDigitsError();
	}

	@Step("user enters valid old password matching new passwords with restricted char")
	public void withRestrictedChar() throws IOException {
		password=getdata.readdata("password");
		mpp.withRestrictedChar(password);
	}
	
	@Step("correct w\\/o restricted char error message should display")
	public void validateRestrictedCharError() throws IOException {
		mpp.validateRestrictedCharError();	
	}
	
	@Step("user enters valid old password and mis-matching new passwords")
	public void misMatchingPasswords() throws IOException {
		password=getdata.readdata("password");
		mpp.misMatchPasswords(password);
	}
	
	@Step("correct mismatch error message should display")
	public void validateMisMatchError() throws IOException {
		mpp.validateMisMatchPasswordsError();
		}
	
	
	@Step("user enters invalid old password and valid new passwords")
	public void invalidOldPassword() {
		mpp.invalidOldPassword();
		}
	
	@Step("correct invalid old password error message should display")
	public void validateInvalidOldPasswordError() throws IOException {
		mpp.validateInvalidOldPasswordError();
	}
	
	@Step("user enters valid old password matching new passwords with a space")
	public void newPasswordWithSpace() throws IOException {
		password=getdata.readdata("password");
		mpp.newPasswordWithSpace(password);
			
	}
	
	@Step("correct no space erorr error message should display")
	public void validateNewPasswordWithSpaceError() throws IOException {
		mpp.validateNewPasswordWithSpaceError();
	}
	
	@Step("user enters valid old password with space valid new passwords")
	public void oldPasswordWithSpace() {
		mpp.oldPasswordWithSpace();

		}
	
	@Step("correct no space error message should display")
	public void validateOldPasswordWithSpaceError() throws IOException {
		mpp.validateOldPasswordWithSpaceError();
	}

//  @Step("correct w\\/o uppercase error message should display")
//  public void validateUpperCaseError() {
//    mpp.validateUpperCaseError();
//  }

//  @Step("user enters valid old password matching new passwords w\\/o lowercase")
//  public void withoutLowerCase() {
//    mpp.withoutLowerCase();
//  }

	@Step("user clicks on the deactivate\\\\/delete your account link")
	public void clickDeactivatelink() {
	mpp.clickDeactivateLink();
		
	}
	
	@Step("user clicks cancel on the pop-up")
	public void cancelDeactivatePopUp() {
		mpp.cancelDeactivateAction();
	}
	
	@Step("pop-up should close and user should be redirected to MyProfile")
	public void verifyPopUpCloses() {
		mpp.verifyPopUpIsClosed();
	}
	
	@Step("user clicks on the deactivate\\\\/delete your account link again")
	public void clickDeactivateLinkAgain() throws InterruptedException {
		mpp.clickDeactivateLinkAgain();
	}
	
	
	@Step("the user should be logged out and the home page should be displayed")
	public void verifyUserIsLoggedout() {
		mpp.verifyUserIsLoggedOut();
	}
	
	@Step("user tried to login with the deactivated account")
	public void attemptToLogIn() throws InterruptedException, IOException {
		username=getdata.readdata("username1");
		password=getdata.readdata("password1");
		mpp.RegisteredUserLogin(username, password);		
	}
	
	@Step("login should fail correct error message should display")
	public void verifyDeactivatedErrorMessage() {
		mpp.verifyDeactivatedErrorMessage();
	}

//  @Step("user enters valid old password matching new passwords w\\\\/o any digits")
//  public void withoutDigits() {
//    mpp.withoutDigits();
//  }

	@Step("user clicks on the edit icon placed on the my profile pic")
	public void clickEditIcon() {
		mpp.clickEditIcon();
	}
	
	@Step("user should be able to edit and upload a new image")
	public void verifyEditAndUpload() {
		mpp.uploadPhoto();
	}
	
	@Step("user crops the picture and clicks on Submit")
	public void cropPhotoAndSubmit() throws InterruptedException {
		mpp.cropAndSubmit();
		
	}
	
	@Step("verify the image is updated on all pages")
	public void verifyUpdatedImage() {
		mpp.verifyImageOnPlatform();
	}

//  @Step("user enters valid old password matching new passwords with restricted char")
//  public void withRestrictedChar() {
//    mpp.withRestrictedChar();
//  }
//
//  @Step("correct w\\/o restricted char error message should display")
//  public void validateRestrictedCharError() {
//    mpp.validateRestrictedCharError();
//  }
//
//  @Step("user enters valid old password and mis-matching new passwords")
//  public void misMatchingPasswords() {
//    mpp.misMatchPasswords();
//  }
//
//  @Step("correct mismatch error message should display")
//  public void validateMisMatchError() {
//    mpp.validateMisMatchPasswordsError();
//  }

//  @Step("user enters invalid old password and valid new passwords")
//  public void invalidOldPassword() {
//    mpp.invalidOldPassword();
//  }

	@Step("user attempts to log in with the new password")
	public void logInWithNewPassword() {
		mpp.logInWithNewPassword();		
	}

	public void loginandclickeditprofile() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		mpp.open();
		username=getdata.readdata("username1");
		password=getdata.readdata("password1");
		System.out.println(username);
		mpp.RegisteredUserLogin(username,password);	
		mpp.ClickToMenubar();
		mpp.clickOnMyProfile();
		
	}

	public void clickonchangepassword() {
		// TODO Auto-generated method stub
		mpp.clickChangePassword();
		
	}

	public void entervaliddetailstochangepassword() {
		// TODO Auto-generated method stub
		mpp.entervaliddetailstochangepassword();
		
	}

	public void verifysuccessmessage() {
		// TODO Auto-generated method stub
		mpp.verifysuccessmessage();
		
	}

	public void loginwitholdandnewpassword() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		username=getdata.readdata("username1");
//		password=getdata.readdata("T");
		mpp.RegisteredUserLogin(username,"Test@555");	
		mpp.logInWithNewPassword();
		mpp.RegisteredUserLogin(username,"Test@666");
		
	}

	public void verifyloginafterDeactivation() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//		username=getdata.readdata("username1");
//		password=getdata.readdata("password1");
//		mpp.RegisteredUserLogin(username,password);
		mpp.clickOnMyProfile();
		
		
	}
}
