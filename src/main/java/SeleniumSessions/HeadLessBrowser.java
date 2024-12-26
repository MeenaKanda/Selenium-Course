package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	// HeadLessBrowser : browser is launched but not visible
	// running testcases in the headless - testing is happening behind the scene
	// faster than normal  browser mode
	//execution happening behind the scence . so it will not disturb our work.
	
	//sanity test cases we use it work
	//if there are so many navigation headless mode might not work.
    // for the complex html dom - it might not work
	//dont prefer. it is not at all user requirement.
	//headless just to minimize the time to closing
	
	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions(); 
//		co.setHeadless(true);
//		co.setHeadless(false);  //depricated method
//		co.addArguments("--headless");
//		co.addArguments("--incognito");

//		co.addArguments("--headless=new");
		co.addArguments("--headless=chrome");

		WebDriver driver = new ChromeDriver(co); 
		driver.get("https://naveenautomationlabs.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        driver.quit();
	
	}

}
