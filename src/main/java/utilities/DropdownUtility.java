package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility {
	public void selectDropdownByVisibleText(WebElement selectTag,String textValue)
	{
		Select select = new Select(selectTag);
		select.selectByVisibleText(textValue);
	}
	public void selectDropdownByValueOfAttribute(WebElement selectTag,String attributeValue)
	{
		Select select = new Select(selectTag);
		select.selectByValue(attributeValue);
	}
	public void selectDropdownByIndex(WebElement selectTag,int index)
	{
		Select select = new Select(selectTag);
		select.selectByIndex(index);
	}
	public void deselectDropdownByText(WebElement selectTag,String textValue)
	{
		Select select = new Select(selectTag);
		select.deselectByVisibleText(textValue);
	}
	public void deselectDropdownByValueOfAttribute(WebElement selectTag,String attributeValue)
	{
		Select select = new Select(selectTag);
		select.deselectByValue(attributeValue);
	}
	public void deselectDropdownByIndex(WebElement selectTag,int index)
	{
		Select select = new Select(selectTag);
		select.deselectByIndex(index);
	}
	public ArrayList<String> toGetAllOptionsText(WebElement selectTagOfDropDown)
	{
		Select select = new Select(selectTagOfDropDown);
		List<WebElement> allOptions = select.getOptions();
		
		ArrayList<String> allOptionsTexts = new ArrayList<String>();
		for(WebElement ele:allOptions)
		{
			allOptionsTexts.add(ele.getText());
		}
		return allOptionsTexts;
	}
	public WebElement toGetPerticularOptionOnIndex(WebElement selectTagOfDropdown,int indexOfOption)
	{
		Select select = new Select(selectTagOfDropdown);
		List<WebElement> allOptions = select.getOptions();
		WebElement particularOptionWebElement = allOptions.get(indexOfOption);
		return particularOptionWebElement;
	}

}
