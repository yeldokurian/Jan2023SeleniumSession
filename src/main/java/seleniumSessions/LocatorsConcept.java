package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		driver.findElement(By.name("firstname")).sendKeys("Yeldo");
//		driver.findElement(By.name("lastname")).sendKeys("Thozuppadan");
//		driver.findElement(By.name("agree")).click();
//		
  By fn = By.name("firstname");
  By ln = By.name("lastname");
  By email = By.id("input-email");
  By teplephone = By.id("input-telephone");
  By pwd = By.id("input-password");
  By pwdconf = By.id("input-confirm");
  By check = By.name("agree");
  By submit = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
  
  
 
  
  ElementUtil eleUtil = new ElementUtil(driver);
  eleUtil.doSendKeys(fn, "Yeldo");
  eleUtil.doSendKeys(ln, "Thozuppadan");
  eleUtil.doSendKeys(email, "yeldokurian67@gmail.com");
  eleUtil.doSendKeys(teplephone, "8604562154");
  eleUtil.doSendKeys(pwd, "SeleniumClass1");
  eleUtil.doSendKeys(pwdconf, "SeleniumClass1");
  eleUtil.doClick(check);
  eleUtil.doClick(submit);
  
//  String message = elUtil.doGetElementText(msgTag);
//	if (message.equals("Your Account Has Been Created!")) {
		System.out.println("PASS-- USer account created successfully");
//	} else {
		System.out.println("FAIL--User account creation FAILED");
		
	}
	}
//}
