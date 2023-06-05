package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
	if (title.contains("Amazon.com")) {
		System.out.println("Correct Title");
	}
	else {
		System.out.println("Incorrect Title");
	}
		
		
		
		
		
	}

}
