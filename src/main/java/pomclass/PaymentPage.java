package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public WebDriver driver;
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Cash On Delivery (COD)']/preceding-sibling::span/input")
	private WebElement cashOnDeliveryRadioButton;
	
	public WebElement getcashOnDeliveryRadioButton()
	{
		return cashOnDeliveryRadioButton;
	}
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedButtonOfPaymentPage;
	
	public WebElement getproceedButtonOfPaymentPage()
	{
		return proceedButtonOfPaymentPage;
	}
	
	@FindBy(xpath="//input[@value='Net Banking']")
	private WebElement netBankingRadioButton;
	
	public WebElement getnetBankingRadioButton()
	{
		return netBankingRadioButton;
	}

}
