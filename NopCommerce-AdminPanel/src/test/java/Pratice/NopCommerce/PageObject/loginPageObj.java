package Pratice.NopCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageObj {

	//WebDriver initialization
	WebDriver ldriver;
	
	//Constructor 
	public loginPageObj(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Identification part 
	@FindBy(id="Email")
	WebElement emailfld;
	
	@FindBy(id="Password")
	WebElement passwordfld;
	
	@FindBy(id="RememberMe")
	WebElement remeRadioBtn;

	@FindBy(linkText = "Log in")
	WebElement loginBtn;
	
	//Action part 
	
	public void emailact(String emailid) {
		emailfld.clear();
		emailfld.sendKeys(emailid);
	}
	
	public void passwordact(String password) {
		passwordfld.clear();
		passwordfld.sendKeys(password);
	}
	
	public void remebtn() {
		remeRadioBtn.click();
	}
	
	public void loginact() {
		loginBtn.click();
	}
	
}
