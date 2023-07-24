package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_page {
	
	@FindBy(xpath="(//a[contains(@class,'gr-button')])[1]")
	private WebElement btnAmazonSU;
	
	@FindBy(xpath="(//a[contains(@class,'gr-button')])[2]")
	private WebElement btnAppleSU;
	
	@FindBy(xpath="(//a[contains(@class,'gr-button')])[3]")
	private WebElement btnFacebookSU;
	
	@FindBy(xpath="(//a[contains(@class,'gr-button')])[4]")
	private WebElement btnEmailSU;
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	private WebElement lnkSignin;
	
	public void clickAmazonSU()
	{
		this.btnAmazonSU.click();
	}
	
	
	
	public void clickAppleSU()
	{
		this.btnAppleSU.click();
	}
	
	public void clickFacebookSU()
	{
		this.btnFacebookSU.click();
	}
	
	public void clickEmailSU()
	{
		this.btnEmailSU.click();
	}
	
	public void clickSignin()
	{
		this.lnkSignin.click();
	}
	
	public register_page(WebDriver driver) {
		
		 /* initilizes the webelements */
		PageFactory.initElements(driver, this);
	}


}
