package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		
//		driver.findElement(By.id("pizza")).sendKeys("veg pizza"); // this one don't work
		
		//browser -> browser have page -> on the page shadowDOM element available-> under shadowDom one more shadowDom is availabel
		//inside 2nd shadowDOM input element is available. this input element directly not available on the page.
		//input available under shadowDom.
		//we can not switch to shadowDOM like frame(driver.switchTo.frame()) in selenium.
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");   
	
	
	    pizza.sendKeys("veg pizza");
	    
	}

}
