package steps;
import net.thucydides.core.annotations.Step;
//import net.thucydides.core.annotations.Step;
//import net.thucydides.core.annotations.Steps;

public class ResetpasswordSteps {
	
	pages.Resetpasswordpage reset;
	pages.HomePage home;
	String email;
	private int type;
//	int type;
	@Step("Click on reset password link")
	public void click_reset_password_link() {
		reset.click_reset_password_link();
		
		
	}
	@Step("Validate the text field to enter the email id")
	public void validate_email_id_field() {
		reset.validate_email_id_field();
		
	}
	@Step("click on the close")
	public void click_on_the_close() {
		// TODO Auto-generated method stub
		reset.clickontheclose();
		
	}
	@Step("User Access the application and click on sign")
	public void validateuserclickonsignin() throws InterruptedException {
		reset.open();
		home.validateuserclickonsignin();
		
	}
	public void enterEmailandclickresetpassword(String string,String errormessage) {
		if(string.equalsIgnoreCase("email id as abc")) {
			email="abc@abc.com";
			
		}else if(string.equalsIgnoreCase("valid email but not registered")) {
			email="mohammed555thoufiq@gmail.com";
			
		}else if(string.equalsIgnoreCase("registered email id with space at beginning")) {
			email=" mohammed.thoufiq@ittalenthub.co.uk";
			
		}else if(string.equalsIgnoreCase("registered email id with space at end")) {
			email="mohammed.thoufiq@ittalenthub.co.uk ";
			
		}else if(string.equalsIgnoreCase("registered email id with space at in between")) {
			email="mohammed.thoufiq@ ittalenthub.co.uk";
			type=1;
			
		}else if(string.equalsIgnoreCase("registered email id with space at in between and beginning")) {
			email=" mohammed.thoufiq@ ittalenthub.co.uk";
			
		}else if(string.equalsIgnoreCase("registered email id with space at beginning and end")) {
			email=" mohammed.thoufiq@ittalenthub.co.uk ";
			
		}else if(string.equalsIgnoreCase("registered email id with space at beginning,inbetween and end")) {
			email=" mohammed.thoufiq@ ittalenthub.co.uk ";
			
		}else if(string.equalsIgnoreCase("registered username")) {
			email="udaystg1";
			
		}else {
			email="";
		}
		
		
		reset.enterEmailandclickresetpassword(email,errormessage);
		// TODO Auto-generated method stub
		
	}
	@Step("validate the invalid email error message")
	public void validatetheinvalidErrorMessage() {
		reset.validatetheinvaliderrormessage();
		// TODO Auto-generated method stub
		
	}
	public void withoutEnteringemailaddressandclickresetpassowrd() {
		// TODO Auto-generated method stub
		reset.withoutEnteringemailaddressandclickresetpassowrd();
		
	}
	
	
}
