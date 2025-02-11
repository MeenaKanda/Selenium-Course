package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWatiWithElements {
     
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footer = By.cssSelector("footer a");
		
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> footerList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		List<WebElement> footerList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
				
		System.out.println(footerList.size());
		
	}

	public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
	public static List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
}


