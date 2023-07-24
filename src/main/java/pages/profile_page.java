package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profile_page {
	
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	private WebElement lnkSingout;
	
	@FindBy(xpath="//a[contains(text(),'Help')]")
	private WebElement lnkHelp;
	
	@FindBy(xpath="//a[contains(text(),'Account settings')]")
	private WebElement lnkAcoountSettings;
	
	public void clickSingout()
	{
		this.lnkSingout.click();
	} 
	
	public void clickHelp()
	{
		this.lnkHelp.click();
	} 
	
	public void clickAcoountSettings()
	{
		this.lnkAcoountSettings.click();
	} 
	
	public profile_page(WebDriver driver) {
		
		 /* initilizes the webelements */
		PageFactory.initElements(driver, this);
	}

}
