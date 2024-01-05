package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Initialization
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	//getter
	public WebElement getemailTextField()
	{
		return emailTextField;
	}
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	//getter
	public WebElement getpasswordTextField()
	{
		return passwordTextField;
	}
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	//getter
	public WebElement getloginButton()
	{
		return loginButton;
	}

}
