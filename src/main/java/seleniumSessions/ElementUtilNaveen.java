package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtilNaveen {

	private WebDriver driver;

	public ElementUtilNaveen(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		if(value==null) {
			System.out.println("null vlaues are not allowed");
			throw new MySeleniumException("VALUECANNOTBENULL");
		}
		
		WebElement ele = getElement(locator);
		ele.clear();
		ele.sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
			element = driver.findElement(locator);
			System.out.println("element is found with locator: " + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found using this locator..." + locator);	
			try {
				Thread.sleep(5000);//static wait  ---> dynamic wait- exp wait
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}
	
	
	public void doClear(By locator) {
		getElement(locator).clear();
	}
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	
	public boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String doGetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();//0
		
		for(WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}
	
	public List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinksList = getElements(locator);
		List<String> elesTextList = new ArrayList<String>();
		
		for(WebElement e : elementsLinksList) {
			String text = e.getText();
			elesTextList.add(text);
		}
		return elesTextList;
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void clickElementFromPageSection(By locator, String eleText) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(eleText)) {
				e.click();
				break;
			}
		}
	}
	
	public boolean IsElementDisplayed(By locator) {
		List<WebElement> eleList = getElements(locator);
		if(eleList.size()>0) {
			System.out.println(locator + " element is present on the page");
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void search(String searchKey, By searchLocator, String suggName, By suggestions)
			throws InterruptedException {

		doSendKeys(searchLocator, searchKey);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(suggestions);
		System.out.println("total suggestions: " + suggList.size());

		if (suggList.size() > 0) {

			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println(text);
					if (text.contains(suggName)) {
						e.click();
						break;
					}
				}
				else {
					System.out.println("blank values -- no sugeestions");
					break;
				}
			}
		}
		else {
			System.out.println("no search suggestions found");
		}

	}
	
	
	//**************************Drop Down Utils************************//
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void doSelectDropDownByValueAttribute(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	public int getDropDownValueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}
	
	public List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("total values : " + optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}
	
	public boolean doSelectDropDownValue(By locator, String dropDownValue) {
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values : " + optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals(dropDownValue)) {
					flag = true;
					e.click();
					break;
				}
		}
		
		if(flag==false) {
				System.out.println(dropDownValue + " is not present in the drop down " + locator);	
		}
		return flag;
	}
	
	
	
	public boolean DoSelectValueFromDropDownWithoutSelect(By locator, String value) {
		boolean flag = false;
		List<WebElement> optionsList = getElements(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
				if(text.equals(value)) {
					flag = true;
					e.click();
					break;
				}
		}
		
		if(flag == false) {
			System.out.println(value + " is not present in the drop down " + locator);	
		}
		
		return flag;
		
	}
	
	//****************Actions class Utils************************
	
	
	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	
	public void doDragAndDrop(By sourceLocator, By targetLocator) {
		Actions act = new Actions(driver);
		act.dragAndDrop(getElement(sourceLocator), getElement(targetLocator)).build().perform();
	}
	
	public void doContextClick(By locator) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).build().perform();
	}
	
	public void doMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).build().perform();
	}
	
	
	public void handleTwoLevelMenu(By parentMenu, By childMenu) throws InterruptedException {
		doMoveToElement(parentMenu);
		Thread.sleep(2000);
		doClick(childMenu);
	}
	
	
	public void handleTwoLevelMenu(By parentMenu, String childMenuLinkText) throws InterruptedException {
		doMoveToElement(parentMenu);
		Thread.sleep(2000);
		doClick(By.linkText(childMenuLinkText));
	}
	
	
	public void multiLevelMenuChildMenuHandle(By parentMenuLocator, String level2LinkText, String level3LinkText,
			String level4LinkText) throws InterruptedException {
		
		WebElement level1 = getElement(parentMenuLocator);
		Actions act = new Actions(driver);

		act.moveToElement(level1).build().perform();
		Thread.sleep(1000);

		WebElement level2 = getElement(By.linkText(level2LinkText));
		act.moveToElement(level2).build().perform();
		Thread.sleep(1000);

		WebElement level3 = getElement(By.linkText(level3LinkText));
		act.moveToElement(level3).build().perform();
		Thread.sleep(1000);

		doClick(By.linkText(level4LinkText));
	}
	
	

}

