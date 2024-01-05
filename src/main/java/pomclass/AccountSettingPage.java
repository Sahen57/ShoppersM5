package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingPage {
	public WebDriver driver;
	
	public AccountSettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Initialization
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutIcon;
	
	//getter
	public WebElement getlogoutIcon()
	{
		return logoutIcon;
	}
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileLink;
	
	public WebElement getmyProfileLink()
	{
		return myProfileLink;
	}

}
