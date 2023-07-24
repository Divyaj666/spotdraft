package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInUsingEmail_page {
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement tbEmail;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement tbPassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement btnSignin;
	
	public void signin(String em,String pw)
	{
		this.tbEmail.sendKeys(em);
		this.tbPassword.sendKeys(pw);
		this.btnSignin.click();
	}
	
	public signInUsingEmail_page(WebDriver driver) {
		
		 /* initilizes the webelements */
		PageFactory.initElements(driver, this);
	}

}
