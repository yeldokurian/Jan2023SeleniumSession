package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertshandling {

	public static void main(String[] args) throws InterruptedException {
		// Pop ups (coming because od the Java Script)
		// 1. Alert pop ups
		// 2. Confirmation pop ups
		// 3. Prompt pop ups
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//Button[text()='Click for JS Alert']")).click();
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		alert.accept();
//		alert.dismiss();
		
//		driver.findElement(By.xpath("//Button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(4000);
//		
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		alert.accept();
//		alert.dismiss();
//		
		driver.findElement(By.xpath("//Button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
//		alert.sendKeys("Entering Text");
//		alert.accept();
		alert.dismiss();
		
		
		
		
			
	}
	
//	}

}
