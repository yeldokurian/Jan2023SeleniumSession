package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {

//			above
//   Left<-----ele------>Right
//			below
		
//		near---100 PX
//		Slenium 4.x
//		--->Right of element
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.aqi.in/dashboard/canada");
//		WebElement ele = driver.findElement(By.linkText("Brossard, Canada"));
//		String rightscore = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(rightscore);
		
//		<----Left of Element
//		WebElement ele2 = driver.findElement(By.linkText("Brossard, Canada"));
//		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele2)).getText();
//		System.out.println(leftIndex);
//		---below the element
//		String belowCity = driver.findElement(with(By.tagName("p")).below(ele2)).getText();
//		System.out.println(belowCity);
//		------Above the element
//		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele2)).getText();
//		System.out.println(aboveCity);
		
//		 --------Near of element
//		String nearCity = driver.findElement(with(By.tagName("p")).near(ele2)).getText();
//		System.out.println(nearCity);
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));
//		driver.findElement(with(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).toLeftOf(ele)).click();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		driver.findElement(with(By.name("agree")).toLeftOf(ele)).click();
		
		
	}

}
