package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	public WebDriver driver;
	
	public AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addAddressForm;
	
	public WebElement getaddAddressForm()
	{
		return addAddressForm;
	}
	

}
