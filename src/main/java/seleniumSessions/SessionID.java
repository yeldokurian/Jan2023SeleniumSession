package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SessionID {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
		co.addArguments("--incognito");
//		ChromeDriver driver = new ChromeDriver(co);
		
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
//		EdgeDriver driver = new EdgeDriver(eo);
//		
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		FirefoxDriver driver = new FirefoxDriver(fo);
		
		
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	
		
		

	}

}
