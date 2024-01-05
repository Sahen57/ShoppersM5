package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetBankingPage {
	public WebDriver driver;
	
	public NetBankingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//iframe[@title='Netbanking']")
	private WebElement netBankingFrameTag;
	
	public WebElement getnetBankingFrameTag()
	{
		return netBankingFrameTag;
	}
	
	@FindBy(xpath="//input[@value='IDHC']")
	private WebElement idhcBankRadioButton;
	
	public WebElement getidhcBankRadioButton()
	{
		return idhcBankRadioButton;
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitButtonOfNetBankingPage;
	
	public WebElement getsubmitButtonOfNetBankingPage()
	{
		return submitButtonOfNetBankingPage;
	}
	

}
