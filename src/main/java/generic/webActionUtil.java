package generic;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webActionUtil {
	
WebDriver driver;
	
	public webActionUtil(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public static String getData(String excelPath,String sheetName,int row,int col)
	{
		try
		{
		FileInputStream f1=new FileInputStream(excelPath);
        Workbook book = WorkbookFactory.create(f1);
		String d = book.getSheet(sheetName).getRow( row).getCell(col).getStringCellValue();
	    return d;
		}
		catch (Exception e) 
		{
		return null;
		}
	}
	
	public void validatePopup()
	{
		
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.alertIsPresent());
			
			Alert a = driver.switchTo().alert();
		
			a.accept();
			
		
	}

	

}
