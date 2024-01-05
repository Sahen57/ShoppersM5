package pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//initialization
	@FindBy(xpath="//a[@id='men']")
	private WebElement menMenuLink;
	
	//getter 
	public WebElement getmenMenuLink()
	{
		return menMenuLink;
	}
	//initialization
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirtPopUpLink;
	//getter
	public WebElement gettshirtPopUpLink()
	{
		return tshirtPopUpLink;
	}
	
	//Initialization
	@FindBy(xpath="//button[@aria-label='Account settings']")
	private WebElement accountSettingIcon;
	
	//getter
	public WebElement getaccountSettingIcon()
	{
		return accountSettingIcon;
	}
	//initialization
	@FindBy(xpath="//a[@id='cart']")
	private WebElement addToCartLink;
	
	//getter
	public WebElement getaddToCartLink()
	{
		return addToCartLink;
	}
	public void javascriptClick(WebDriver driver)
	{
		WebElement ele=driver.findElement(By.xpath("//button[@aria-label='Account settings']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
	}

}
