package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * Author:Sahen
	 * When we get ElementClickInterceptedException(When element is hidden by some other element)
	 * then we will use javascript click.
	 * it will take webdriver object and element ref on which you want to perform javascript click.
	 * @param driver
	 * @param ele
	*/
	public void javascriptClick(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
	}
	/**
	 * To avoid ElementClickInterceptedException
	 * @param driver
	 * @param ele
	 * @param data
	 */
	public void javascriptSendKeys(WebDriver driver,WebElement ele,String data)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].values=arguments[1]",ele,data);
	}
	/**
	 * Author:Sahen
	 * this method will scroll the webpage till the given element
	 * @param driver
	 * @param ele
	 */
	public void javascriptScrollTillWebElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	/**
	 * Author:Sahen
	 * this method will scroll webpage with given coordinates
	 * @param driver
	 * @param xco
	 * @param yco
	 */
	public void javascriptScrollByCoordinates(WebDriver driver,int xco,int yco)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy("+xco+","+yco+");");
	}
	/**
	 * Author:Sahen
	 * this methos will highlight the WebElement border with 2px red colour
	 * @param driver
	 * @param ele
	 */
	public void javascriptHighlightWebElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='2px solid red';", ele);
	}
	/**
	 * To perform Mouse Hover operation on webelement
	 * @param driver
	 * @param ele
	 */
	public void mouseHoverAction(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	/**
	 * To Perform Double Click on WebElemet
	 * @param driver
	 * @param ele
	 */
	public void doubleClickAction(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.doubleClick(ele).perform();
	}
	/**
	 * To Perform Right Click on WebElement
	 * @param driver
	 * @param ele
	 */
	public void rightClickAction(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.contextClick(ele).perform();
	}
	/**
	 * To Perform drag and drop operation between two Element
	 * @param driver
	 * @param draggingElement
	 * @param droppingElement
	 */
	public void dragAndDropAction(WebDriver driver,WebElement draggingElement,WebElement droppingElement)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(draggingElement, droppingElement).perform();
	}
	/**
	 * To perform ClickAndHold Operation
	 * @param driver
	 * @param ele
	 */
	public void clickAndHoldAction(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.clickAndHold(ele).perform();;
	}
	/**
	 * To perform scrolling to webpage till the webelement
	 * @param driver
	 * @param ele
	 */
	public void scrollToWebElementByActionsClass(WebDriver driver,WebElement ele)
	{
		Actions action = new Actions(driver);
		action.scrollToElement(ele).perform();
	}
	/**
	 * this method will wait untill given element reaches to clickable state
	 * @param locator
	 * @param driver
	 * @param timeInSeconds
	 */
	public void explicitlyWaitForElementClickable(By locator,WebDriver driver,int timeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	/**
	 * this method will wait untill alert is present
	 * @param driver
	 * @param timeInSeconds
	 */
	public void explicitlyWaitForAlertTobePresent(WebDriver driver,int timeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	/**
	 * this methos will wait till url is present
	 * @param driver
	 * @param timeInSeconds
	 * @param completeUrl
	 */
	public void explicitlyWaitForUrlToBePresent(WebDriver driver,int timeInSeconds,String completeUrl)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.urlToBe(completeUrl));
	}
	/**
	 * this method will wait until given element is visible
	 * @param driver
	 * @param timeInSeconds
	 * @param ele
	 */
	public void explicitlyWaitForVisibilityOfElement(WebDriver driver,int timeInSeconds,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	/**
	 * This method will wait
	 * @param driver
	 * @param timeDeley
	 * @param completeUrl
	 */
	public void explicitlyWaitForUrl(WebDriver driver,int timeDeley,String completeUrl)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeDeley));
		wait.until(ExpectedConditions.urlToBe(completeUrl));
	}
	/**
	 * 
	 * @param driver
	 * @param ele
	 * @param timeDeley
	 * @param completeUrl
	 */
	public void explicitlyWaitForTitle(WebDriver driver,WebElement ele,int timeDeley,String completeUrl)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeDeley));
		wait.until(ExpectedConditions.titleIs(completeUrl));
	}
	

}
