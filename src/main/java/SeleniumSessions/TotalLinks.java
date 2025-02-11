package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//get total blank links count? ---assignment
public class TotalLinks {

	    public static WebDriver driver;
	
	    public static void main(String[] args) {
		
	    //System.setProperty("webdriver.chrome.driver","C:\\Users\\kanda\\.cache\\selenium\\chromedriver\\win64\\131.0.6778.85\\chromedriver.exe");
	    driver = new ChromeDriver();
//	    driver = new FirefoxDriver();
//	    driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");

		//find all links on the page:
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
	
		//List => is Interface and order based collections
		
		
		//print the total links count:
		int linksCount = linksList.size();
		System.out.println("total links : " + linksCount);
		
	
		//print the text of each link:
	    //and avoid blank text
/*		for(int i=0; i<linksCount; i++) {
			String text = linksList.get(i).getText();
			
			if(text.length()>0) {
			System.out.println(i + " : " + text); 
			}
		}
		*/
		
		//for each:  prefer this .
 /*   	int count = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			    if(text.length()>0) {
			    	System.out.println(count + " : " +text);
			    }
			    count++;
		}*/
		
		
		//get how many blank links ---Assignment
		//method 1:
		int count1 = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			
			if(text.length() > 0){
				count1++;
				System.out.println(count1 + " : " + text);
			}
		}
		
		System.out.println("total no of not blank list  = " + count1);
		
		System.out.println("total no of blank list = " + (linksCount - count1));
		
		
		System.out.println("********************************------------------******************************");
		
		//get how many blank links ---Assignment
		//method 2:
/*		int count2 = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			
			if(text.length() == 0) {
				count2++;
				System.out.println(count2 + " : " + text);
			}
		}
		System.out.println("total no of blank list = " + count2);
		*/
		
	}

}





