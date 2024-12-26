package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoViewConcept {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Sellers in Books']"));
		
	//	JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	//	jsUtil.scrollIntoView(ele);
		
		//different way of clicking :
		//1.normal click  --- click on UI --click on middle of the element
		//2.Actions class click -- move to element -- click on middle of the element
		//3.js click  -- click from DOM
		
		//user always work on the UI only.
		//if normal click and actions click not working , in that case go with js click.
		

	//    WebElement registry = driver.findElement(By.linkText("Registry"));
	//    jsUtil.clickElementByJS(registry);
	    
	    
//	    Actions act = new Actions(driver);
	    WebElement registry = driver.findElement(By.linkText("Registry"));
//	    act.moveToElement(registry).click().build().perform();
	    
	    registry.click();
	    
	}

}

