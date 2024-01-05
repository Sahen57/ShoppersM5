package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	public WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Levis Mens Regular Fit Tee']")
	private WebElement levisProductTee;
	
	public WebElement getlevisProductTee()
	{
		return levisProductTee;
	}
	
	@FindBy(id="buynow_fl")
	private WebElement buyNowButtonOfAddToCartPage;
	
	public WebElement getbuyNowButtonOfAddToCartPage()
	{
		return buyNowButtonOfAddToCartPage;
	}

}
