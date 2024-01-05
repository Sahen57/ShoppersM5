package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress {
	public WebDriver driver;
	
	public MyAddress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addressformButton;
	
	public WebElement getaddressformButton()
	{
		return addressformButton;
	}
	
	@FindBy(xpath="//div[@class='addressListContainer']//h3")
	private WebElement addedAddress;
	
	public WebElement getaddedAddress()
	{
		return addedAddress;
	}
	@FindBy(xpath="//strong[text()='LoveBirds']/../../..//input")
	private WebElement selectAddress;
	
	public WebElement getselectAddress()
	{
		return selectAddress;
	}
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedButton;
	
	public WebElement getproceedButton()
	{
		return proceedButton;
	}

}
