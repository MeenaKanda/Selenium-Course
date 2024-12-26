package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Program Files\\Java");
		// this only work only when type=file on html. tag could be anything
		//<tag type="file"> -- this is mandatory attribute
		// if type is not file ,//autoIt/Sikuli/Robot 
	}

}
