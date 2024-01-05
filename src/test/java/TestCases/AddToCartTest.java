package TestCases;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pomclass.AccountSettingPage;
import pomclass.AddToCartPage;
import pomclass.AddressFormPage;
import pomclass.AddressPage;
import pomclass.HomePage;
import pomclass.MyAddress;
import pomclass.MyProfilePage;
import pomclass.NetBankingLoginPage;
import pomclass.NetBankingPage;
import pomclass.OrderConfermationPage;
import pomclass.PaymentPage;
import pomclass.TshirtPage;
import utilities.BaseClass;
import utilities.IpathConstant;
@Listeners(utilities.ListenersUtility.class)
public class AddToCartTest extends BaseClass {
	@Test(dataProvider = "dataProviderAddress")
	public void Tc_AddAddress_001_Test(String home,String house_Office,String street,String landmark,
			String country,String state,String city,String dpin,String mobn) throws Throwable
	{
		System.out.println("add Address page");
		Thread.sleep(5000);
		HomePage hp = new HomePage(driver);
		hp.javascriptClick(driver);
		//hp.getaccountSettingIcon().click();
		
		AccountSettingPage asp = new AccountSettingPage(driver);
		asp.getmyProfileLink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/my-profile/my-profile-info");
		System.out.println("My profile page is opened");
		MyProfilePage mpp = new MyProfilePage(driver);
		mpp.getmyAddressLink().click();
		MyAddress ma = new MyAddress(driver);
		ma.getaddressformButton().click();
		
		AddressFormPage afp = new AddressFormPage(driver);
		afp.getNameTextField().sendKeys(home);
		afp.getHouseOfficeInformationTextField().sendKeys(house_Office);
		afp.getStreetInformationTextField().sendKeys(street);
		afp.getLandMarkTextField().sendKeys(landmark);
		WebElement countryDropDown = afp.getCountryDropdown();
		ddu.selectDropdownByVisibleText(countryDropDown, country);
		WebElement stateDropDown = afp.getStateDropdown();
		ddu.selectDropdownByVisibleText(stateDropDown, state);
		WebElement cityDropDown = afp.getCityDropdown();
		ddu.selectDropdownByVisibleText(cityDropDown, city);
		afp.getPinCodeTextField().sendKeys(dpin);
		afp.getPhoneNumberTextField().sendKeys(mobn);
		afp.getAddAddressButton().click();
		
		//Assert.assertEquals(ma.getaddedAddress().getText(),home);
		System.out.println("Address Added");
	}
	@DataProvider
	public Object[][] dataProviderAddress() throws Throwable
	{

		return data.accessAllAddress();
	}
	@Test(priority = 1,dependsOnMethods="Tc_AddAddress_001_Test")
	public void Tc_EndToEndCashOnDelivery_Test() throws Throwable
	{
		Thread.sleep(3000);
		System.out.println("CashOnDelivery Test Case");
		String titleHomepage = driver.getTitle();
		//System.out.println(titleHomepage);
		Assert.assertEquals(titleHomepage,"ShoppersStack | Home");
		Thread.sleep(5000);
		HomePage hp = new HomePage(driver);
		WebElement menuMen = hp.getmenMenuLink();
		wdu.mouseHoverAction(driver, menuMen);
		hp.gettshirtPopUpLink().click();
		
		TshirtPage tsp = new TshirtPage(driver);
		WebElement topShirtLink = tsp.gettshirtTopLink();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.shoppersstack.com/sub-category/men-tshirt");
		wdu.mouseHoverAction(driver,topShirtLink);
		tsp.getlevisTshirtAddingProduct().click();
		hp.getaddToCartLink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/cart");
		System.out.println("cart page has opened!!!!");
		AddToCartPage atc = new AddToCartPage(driver);
		String levisProduct = atc.getlevisProductTee().getText();
		Assert.assertEquals(levisProduct, "Levis Mens Regular Fit Tee");
		System.out.println("Product is added to cart!!!");
		
		atc.getbuyNowButtonOfAddToCartPage().click();
		String addressPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(addressPageUrl, "https://www.shoppersstack.com/selectaddress");
		System.out.println("Address page has displayed");
		
		MyAddress mad = new MyAddress(driver);
		mad.getselectAddress().click();
		
		mad.getproceedButton().click();
		
		PaymentPage ppg = new PaymentPage(driver);
		ppg.getcashOnDeliveryRadioButton().click();
		ppg.getproceedButtonOfPaymentPage().click();
		
		
		OrderConfermationPage ocp = new OrderConfermationPage(driver);
		
		Assert.assertEquals(ocp.getorderConfirmText().getText(), "Order Confirmed");
		
		System.out.println("Cash on delivery Order is Confirmed!!!!");
		
	}
	@Test(priority = 2,dependsOnMethods="Tc_AddAddress_001_Test")
	public void Tc_EndToEndNetBanking_Test() throws Throwable
	{
		Thread.sleep(3000);
		System.out.println("NetBanking Test Case");
		String titleHomepage = driver.getTitle();
		//System.out.println(titleHomepage);
		Assert.assertEquals(titleHomepage,"ShoppersStack | Home");
		Thread.sleep(5000);
		HomePage hp = new HomePage(driver);
		WebElement menuMen = hp.getmenMenuLink();
		wdu.mouseHoverAction(driver, menuMen);
		hp.gettshirtPopUpLink().click();
		
		TshirtPage tsp = new TshirtPage(driver);
		WebElement topShirtLink = tsp.gettshirtTopLink();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.shoppersstack.com/sub-category/men-tshirt");
		wdu.mouseHoverAction(driver,topShirtLink);
		tsp.getlevisTshirtAddingProduct().click();
		hp.getaddToCartLink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/cart");
		System.out.println("cart page has opened!!!!");
		AddToCartPage atc = new AddToCartPage(driver);
		String levisProduct = atc.getlevisProductTee().getText();
		Assert.assertEquals(levisProduct, "Levis Mens Regular Fit Tee");
		System.out.println("Product is added to cart!!!");
		
		atc.getbuyNowButtonOfAddToCartPage().click();
		String addressPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(addressPageUrl, "https://www.shoppersstack.com/selectaddress");
		System.out.println("Address page has displayed");
		
		MyAddress mad = new MyAddress(driver);
		mad.getselectAddress().click();
		
		mad.getproceedButton().click();
		
		PaymentPage ppg = new PaymentPage(driver);
		ppg.getnetBankingRadioButton().click();
		ppg.getproceedButtonOfPaymentPage().click();
		
		NetBankingPage nbp = new NetBankingPage(driver);
		driver.switchTo().frame(nbp.getnetBankingFrameTag());
		nbp.getidhcBankRadioButton().click();
		nbp.getsubmitButtonOfNetBankingPage().click();
		driver.switchTo().defaultContent();
		
		NetBankingLoginPage nblp = new NetBankingLoginPage(driver);
		driver.switchTo().frame(nblp.getparentNetBankingLoginPageFrameTag());
		driver.switchTo().frame(nblp.getchildNetBankingLoginPageFrameTag());
		nblp.getuserIdOfNetBanking().sendKeys("singhsahendar@gmail.com");
		nblp.getpasswordOfNetBanking().sendKeys("UIpTsH5");
		nblp.getsubmitButtonOfNetBankingLoginPage().click();
		driver.switchTo().frame(nblp.getsecondSubChildNetBankingPageFrameTag());
		nblp.gettransactionMessage().sendKeys("gift");
		nblp.getsubmitButtonOfTransactionMessage().click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(nblp.getsubChildNetBankingPageFrameTag());
		nblp.getpayNowButton().click();
		driver.switchTo().defaultContent();
	}
//	@Test(priority=3)
//	public void Tc_AddToCart_004_Test()
//	{
//		System.out.println("Second Test Case");
//	}

}
