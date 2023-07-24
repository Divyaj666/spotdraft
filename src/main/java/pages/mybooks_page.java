package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mybooks_page {
	
	@FindBy(xpath="//img[@alt='Remove from my books']")
	private WebElement icRemove;
	
	
	
	public void clickRemove()
	{
		this.icRemove.click();
	} 
	
	public mybooks_page(WebDriver driver) {
		
		 /* initilizes the webelements */
		PageFactory.initElements(driver, this);
	}

}
