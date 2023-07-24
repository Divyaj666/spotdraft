package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage_page {
	
	@FindBy(xpath="(//a[contains(text(),'Home')])[2]")
	private WebElement ddhome;
	
	@FindBy(xpath="(//a[contains(text(),'My Books')])[2]")
	private WebElement ddMybooks;
	
	@FindBy(xpath="(//a[@role='button'])[6]")
	private WebElement ddBrowser;
	
	@FindBy(xpath="(//a[@role='button'])[7]")
	private WebElement ddCommunity;
	
	@FindBy(xpath="(//input[@name='q'])[1]")
	private WebElement tbSearch;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement btnSearch;
	
	@FindBy(xpath="(//span[contains(@class,'headerPersonal')])[1]")
	private WebElement icNotification;
	
	@FindBy(xpath="(//span[contains(@class,'headerPersonal')])[2]")
	private WebElement icGropDiscussion;
	
	@FindBy(xpath="(//span[contains(@class,'headerPersonal')])[3]")
	private WebElement icMessage;
	
	@FindBy(xpath="(//span[contains(@class,'headerPersonal')])[4]")
	private WebElement icFriends;
	
	@FindBy(xpath="(//span[contains(@class,'headerPersonal')])[4]")
	private WebElement icProfile;
	
	public void clickHome()
	{
		this.ddhome.click();
	}
	
	public void clickMybooks()
	{
		this.ddMybooks.click();
	}
	
	public void clickBrowser()
	{
		this.ddBrowser.click();
	}
	
	
	public void clickCommunity()
	{
		this.ddCommunity.click();
	}
	
	public void clickSearch(String bn)
	{
		this.tbSearch.sendKeys(bn);
		this.btnSearch.click();
	}
	
	public void clickNotification()
	{
		this.icNotification.click();
	}
	
	public void clickGroupDiscussion()
	{
		this.icGropDiscussion.click();;
	}
	
	public void clickMessage()
	{
		this.icMessage.click();;
	}
	
	public void clickFriends()
	{
		this.icFriends.click();;
	}
	
	public void clickProfile()
	{
		this.icProfile.click();;
	}
	
	
	public homepage_page(WebDriver driver) {
		
		 /* initilizes the webelements */
		PageFactory.initElements(driver, this);
	}

}
