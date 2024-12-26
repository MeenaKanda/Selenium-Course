package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {

	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * @param browserName
	 * @return  This returns the specific browser driver
	 */  
	
	
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is : " + browserName);
	
	
	switch (browserName.toLowerCase().trim()) {
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "edge":
		driver = new EdgeDriver();
		break;
	case "firefox":
		driver = new FirefoxDriver();
		break;
	
	default:
		System.out.println("please pass the right browser......" + browserName);
		break;
	}
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	return driver;
	}
	
	
	public void launchURL(String url) {
		
		if(url == null) {
			System.out.println("url can not be null");
		}
	
		else if(url.indexOf("https") == 0) {      //url.contains("http")
			driver.get(url);
		}
	}
	
	
	public String getPageTitle() {
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		return title;
	}
	
	
	public String getPageURL() {
		
		String url = driver.getCurrentUrl();
		System.out.println("page current url : " + url);
		return url;
	}
	
	
	public void closeBrowser() {   
		if(driver != null) {
			driver.close();
		}
	}
	
	public void quitBrowser() {   
		if(driver != null) {       
			driver.quit();      
		}
	}
	
	
}
