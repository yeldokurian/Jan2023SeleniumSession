package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPageTest {

	public static void main(String[] args) {
	BrowserUtil brUtil = new BrowserUtil();
	WebDriver driver = brUtil.initDriver("chrome");
	brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	String title = brUtil.getPageTitle();
	System.out.println("Page Title :" + title);
	System.out.println(brUtil.getPageURL());
	
	
	By email = By.id("input-email");
	By pwd = By.id("input-password");
	
	ElementUtil eleUtil = new ElementUtil(driver);
	
	eleUtil.doSendKeys(email, "yeldokurian67@gmail.com");
	eleUtil.doSendKeys(pwd, "SeleniumClass1");
	
	
//	brUtil.quitBrowser();
	

	}

}
