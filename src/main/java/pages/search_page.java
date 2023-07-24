package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_page {
	
	@FindBy(xpath="(//input[@name='q'])[2]")
	private WebElement tbSearch1;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnSearch1;
	
	@FindBy(xpath="(//button[@class='wtrToRead'])[1]")
	private WebElement btnRead;
	
	public void clickSearch1(String bn)
	{
		this.tbSearch1.sendKeys(bn);
		this.btnSearch1.click();
	}
	
	public void clickWantToRead()
	{
		this.btnRead.click();
	} 
	
	public search_page(WebDriver driver) {
		
		 /* initilizes the webelements */
		PageFactory.initElements(driver, this);
	}

}
