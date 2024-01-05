package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfermationPage {
	public WebDriver driver;
	
	public OrderConfermationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Order Confirmed']")
	private WebElement orderConfirmText;
	
	public WebElement getorderConfirmText()
	{
		return orderConfirmText;
	}

}
