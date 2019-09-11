package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.Loginpage;


public abstract class BaseTest implements AutoConsts{
	
	public static WebDriver driver;
	FileLib flib=new FileLib();
	
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		Thread.sleep(5000);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
		
		String browser=flib.getKeyPropertyvalue(PROP_PATH, "browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get(flib.getKeyPropertyvalue(PROP_PATH, "url"));
		
	}
	
	

	@BeforeMethod
	public void loginToApp() throws Throwable
	{
		Loginpage lp=new Loginpage(driver);
		lp.setUsername(flib.getKeyPropertyvalue(PROP_PATH, "username"));
		lp.setPassword(flib.getKeyPropertyvalue(PROP_PATH, "password"));
		lp.clickBtn();
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		
			
	}
	
	//@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
