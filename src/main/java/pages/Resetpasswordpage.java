package pages;

import org.openqa.selenium.WebElement;

import base.BasePage;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://stagemyco.net/")

public class Resetpasswordpage extends BasePage {
	
	String resetpassword="xpath=//*[@id=\"root\"]/div[1]/div/form/div[2]/div[3]/div[2]/span";
	String email_id_field="xpath=//*[@id=\"root\"]/div[1]/form/div[2]/input";
	String closeButton="xpath=//*[@id=\"root\"]/div[1]/form/svg";
	String invalidtext="xpath=//*[@id=\"root\"]/div[1]/form/div[1]";
	String resetPasswordBtn="xpath=//*[@id=\"root\"]/div[1]/form/div[3]/button";
//	String resetPasswordBtn="//*[@id=\\\"root\\\"]/div[1]/form/div[3]/button";
	
	
	private String errortext;
	
	
	
	public void click_reset_password_link() {
		click(resetpassword);
	}



	public void validate_email_id_field() {
		isDisplayed(email_id_field);
		
	}



	public void clickontheclose() {
		// TODO Auto-generated method stub
		
		click(closeButton);
	}



	public void enterEmailandclickresetpassword(String email,String errormessage) {
		// TODO Auto-generated method stub
		type(email_id_field, email);
//		boolean btn=isEnabled(resetPasswordBtn);
//		System.out.println(btn);
		if(errormessage.equalsIgnoreCase("User does not exist")) {
			click(resetPasswordBtn);
		}
		
	
		boolean text=getText(invalidtext).equalsIgnoreCase(errormessage);
		System.out.println(text);
		
	}



	public void validatetheinvaliderrormessage() {
		// TODO Auto-generated method stub
		String text=getText(invalidtext);
		boolean test=getText(invalidtext).equalsIgnoreCase("User does not exist");
//		System.out.println(test);
		
	}



	public void withoutEnteringemailaddressandclickresetpassowrd() {
		// TODO Auto-generated method stub
		click(resetPasswordBtn);
		
	}
	

}
