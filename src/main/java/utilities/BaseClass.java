package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomclass.AccountSettingPage;
import pomclass.HomePage;
import pomclass.LoginPage;
import pomclass.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public DataFromPropertiesAndExcel data=new DataFromPropertiesAndExcel();
	public WebDriverUtility wdu=new WebDriverUtility();
	public DropdownUtility ddu = new DropdownUtility();
	
	@BeforeClass
	public void launchBrowser() throws Throwable
	{
		System.out.println("------Launching Browser---------");
		String browser = data.propertiesFileData("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver= new ChromeDriver();
		}
		
		String URL = data.propertiesFileData("url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@BeforeMethod
	public void loginToApplication() throws Throwable
	{
		System.out.println("------Login To Application--------");
		WelcomePage wlp = new WelcomePage(driver);
		wlp.getmainLoginButton().click();
		LoginPage login = new LoginPage(driver);
		String emailId = data.propertiesFileData("email");
		login.getemailTextField().sendKeys(emailId);
		String pass = data.propertiesFileData("password");
		login.getpasswordTextField().sendKeys(pass);
		login.getloginButton().click();
	}
	@AfterMethod
	public void logoutFromApplication() throws InterruptedException
	{
		System.out.println("------Logout from Application-------");
		Thread.sleep(10000);
		HomePage hp = new HomePage(driver);
		hp.getaccountSettingIcon().click();
		Thread.sleep(5000);
		AccountSettingPage asp = new AccountSettingPage(driver);
		asp.getlogoutIcon().click();
	}
	@AfterClass
	public void quitBrowser()
	{
		System.out.println("-----Quitting Browser------");
		driver.quit();
	}

}
