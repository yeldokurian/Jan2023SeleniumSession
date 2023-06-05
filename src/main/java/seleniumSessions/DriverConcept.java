package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConcept {

	public static void main(String[] args) {
		
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\yeldo\\OneDrive\\Pictures\\Documents\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Amazon.com")) {
			
			System.out.println("Title is correct");
		}
		
		else {
			System.out.println("Title is incorrect");
		}

	}

}
