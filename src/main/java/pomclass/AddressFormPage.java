package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
	public WebDriver driver;
	public AddressFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseOfficeInformationTextField;
	
	@FindBy(id="Street Info")
	private WebElement streetInformationTextField;
	
	@FindBy(id="Landmark")
	private WebElement landMarkTextField;
	
	@FindBy(id="Country")
	private WebElement countryDropdown;
	
	@FindBy(id="State")
	private WebElement stateDropdown;
	
	@FindBy(id="City")
	private WebElement cityDropdown;
	
	@FindBy(id="Pincode")
	private WebElement pinCodeTextField;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	
	//Getters Method 
	public WebElement getNameTextField() 
	{
		return nameTextField;
	}

	public WebElement getHouseOfficeInformationTextField() 
	{
		return houseOfficeInformationTextField;
	}

	public WebElement getStreetInformationTextField() 
	{
		return streetInformationTextField;
	}

	public WebElement getLandMarkTextField() 
	{
		return landMarkTextField;
	}

	public WebElement getCountryDropdown() 
	{
		return countryDropdown;
	}

	public WebElement getStateDropdown() 
	{
		return stateDropdown;
	}

	public WebElement getCityDropdown() 
	{
		return cityDropdown;
	}

	public WebElement getPinCodeTextField() 
	{
		return pinCodeTextField;
	}

	public WebElement getPhoneNumberTextField() 
	{
		return phoneNumberTextField;
	}

	public WebElement getAddAddressButton() 
	{
		return addAddressButton;
	}

}
