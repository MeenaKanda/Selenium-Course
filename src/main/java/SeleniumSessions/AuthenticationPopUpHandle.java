package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpHandle {

	public static void main(String[] args) {
	
		//https://@the-internet.herokuapp.com/basic_auth
	
		//we have to enter username and password withinthe url
		WebDriver driver = new ChromeDriver();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//username= admin
		//password= admin
		
		//limitation: Ex: password/username= admin@123 .if username/password have @ it won't work. because after @ the address of url should only be there.
		// in that case have 2 @ make confusion. 
		
		String username = "admin";
		String password = "admin";
		
    	driver.get("https://"+username+":"+username+"@"+"the-internet.herokuapp.com/basic_auth");
	}

}
