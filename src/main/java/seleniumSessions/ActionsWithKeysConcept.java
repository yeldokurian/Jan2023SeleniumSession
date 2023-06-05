package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName = By.id("input-firstname");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(firstName), "Pooja")
				.sendKeys(Keys.TAB)
				.sendKeys("Hegde")
				.sendKeys(Keys.TAB)
				.sendKeys("pooja@gmail.com")
				.sendKeys(Keys.TAB)
				.sendKeys("1234567898")
				.sendKeys(Keys.TAB)
				.sendKeys("SeleniumClass1")
				.sendKeys(Keys.TAB)
				.sendKeys("SeleniumClass1")
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.click()
				.sendKeys(Keys.TAB)
				.click()
				.build()
				.perform();
				
//		driver.get("https://www.amazon.com/");
//		act.sendKeys(Keys.TAB)
//		.sendKeys(Keys.TAB)
//		.sendKeys(Keys.TAB)
//		.sendKeys(Keys.TAB)
//		.sendKeys(Keys.TAB)
//		.sendKeys("MacBook Pro")
//		.sendKeys(Keys.ENTER)
//		.build()
//		.perform();
	}

}