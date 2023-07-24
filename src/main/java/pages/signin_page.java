package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin_page {
	
	@FindBy(xpath="(//button[contains(@class,'gr-button ')])[1]")
	private WebElement btnAmazonSI;
	
	@FindBy(xpath="(//button[contains(@class,'gr-button ')])[2]")
	private WebElement btnAppleSI;
	
	@FindBy(xpath="(//button[contains(@class,'gr-button ')])[3]")
	private WebElement btnGoogleSI;
	
	@FindBy(xpath="(//button[contains(@class,'gr-button ')])[4]")
	private WebElement btnFacebookSI;
	
	@FindBy(xpath="(//button[contains(@class,'gr-button ')])[5]")
	private WebElement btnEmailSI;
	
	public void clickAmazonSI()
	{
		this.btnAmazonSI.click();
	}
	
	
	
	public void clickAppleSI()
	{
		this.btnAppleSI.click();
	}
	
	public void clickGoogleSI()
	{
		this.btnGoogleSI.click();
	}
	
	public void clickFacebookSI()
	{
		this.btnFacebookSI.click();
	}
	
	public void clickEmailSI()
	{
		this.btnEmailSI.click();
	}
	
	
	public signin_page(WebDriver driver) {
		
		 /* initilizes the webelements */
		PageFactory.initElements(driver, this);
	}

}
