package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanda\\Downloads\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanda\\Downloads\\chromedriver_win32.exe");
		
		WebDriver driver = new ChromeDriver();   //when use selenium version 4.5.3
        //when you use <4.6 version you get this error
		//Exception in thread "main" java.lang.IllegalStateException: 
		//The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property; 
	    //<4.6.0 you have to configure .exe file
		//>=4.6.0 onwards we don't need to configure .exe file.
	    //who's responsible to provide .exe file from selenium 3 onwards? 
		//vendor responsibility . before selenium 3 -> selenium responsibility to provide .exe file
	    //chromium-> is a team in google. they are responsible for the chrome Driver
		//.exe file is a platform dependent(windows, mac)
	
		
		//from 4.6.0  -> selenium manager released. 
		//before selenium manager called webdrivermanager.
		//developer of webdrivermanager -> bonigarcia
		
	}
}
