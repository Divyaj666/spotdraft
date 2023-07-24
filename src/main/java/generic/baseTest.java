package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseTest {
	
	public static final String userDir=System.getProperty("user.dir");
	public static final String chromeKey="webdriver.chrome.driver";
	public static final String geckoKey="webdriver.gecko.driver";
	public static final String chromeValue=userDir+"\\drivers\\chromedriver.exe";
	public static final String geckoValue=userDir+"\\drivers\\geckodriver.exe";
	public static final String excelPath=userDir+"\\data\\Book1.xlsx";
	
	public WebDriver driver;
	public static Properties p;
	
	public static webActionUtil actionUtil;
	
	@BeforeClass
	public void setDriverPath()
	{
		try
		{
			FileInputStream f=new FileInputStream(userDir+"\\data\\goodReads.properties");
			p=new Properties();
			p.load(f);
			
		}
		catch (Exception e)
		{
			
		}
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
	}
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String BN)
	{
		if(BN.equals("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(BN.equals("firefox"))
			driver=new FirefoxDriver();
		else if(BN.equals("edge"))
			driver=new EdgeDriver();
		
		actionUtil=new webActionUtil(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void KillDriver()
	{
		try
		{
			Runtime.getRuntime().exec("taskKill /IM chromedriver.exe /F");
			Runtime.getRuntime().exec("taskKill /IM geckodriver.exe /F");
			Runtime.getRuntime().exec("taskKill /IM msedgedriver.exe /F");
		}
		catch (IOException e)
		{
			
		}
	}

}
