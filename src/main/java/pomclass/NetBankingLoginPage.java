package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetBankingLoginPage {
	public WebDriver driver;
	
	public NetBankingLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//iframe[@src='/select-bank?total=1036']")
	private WebElement parentNetBankingLoginPageFrameTag;
	
	public WebElement getparentNetBankingLoginPageFrameTag()
	{
		return parentNetBankingLoginPageFrameTag;
	}
	
	@FindBy(xpath="//iframe[@src='/net-banking-login/IDHC?total=1036']")
	private WebElement childNetBankingLoginPageFrameTag;
	
	public WebElement getchildNetBankingLoginPageFrameTag()
	{
		return childNetBankingLoginPageFrameTag;
	}
	
	@FindBy(id="User ID")
	private WebElement userIdOfNetBanking;
	
	public WebElement getuserIdOfNetBanking()
	{
		return userIdOfNetBanking;
	}
	
	@FindBy(id="Password")
	private WebElement passwordOfNetBanking;
	
	public WebElement getpasswordOfNetBanking()
	{
		return passwordOfNetBanking;
	}
	
	@FindBy(id="Submit")
	private WebElement submitButtonOfNetBankingLoginPage;
	
	public WebElement getsubmitButtonOfNetBankingLoginPage()
	{
		return submitButtonOfNetBankingLoginPage;
	}
	
	@FindBy(xpath="//iframe[@src='/pay-amount-frame?total=1036&number=741852964510']")
	private WebElement subChildNetBankingPageFrameTag;
	
	public WebElement getsubChildNetBankingPageFrameTag()
	{
		return subChildNetBankingPageFrameTag;
	}
	
	@FindBy(xpath="//button[text()='Pay Now']")
	private WebElement payNowButton;
	
	public WebElement getpayNowButton()
	{
		return payNowButton;
	}
	
	@FindBy(xpath="//iframe[@src='/transaction-message']")
	private WebElement secondSubChildNetBankingPageFrameTag;
	
	public WebElement getsecondSubChildNetBankingPageFrameTag() 
	{
		return secondSubChildNetBankingPageFrameTag;
	}
	
	@FindBy(id="Transaction Message")
	private WebElement transactionMessage;
	
	public WebElement gettransactionMessage()
	{
		return transactionMessage;
	}
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium  css-79xub']")
	private WebElement submitButtonOfTransactionMessage;
	
	public WebElement getsubmitButtonOfTransactionMessage()
	{
		return submitButtonOfTransactionMessage;
	}

}
