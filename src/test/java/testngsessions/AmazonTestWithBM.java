package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestWithBM {

WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	
	
	//Test cases should be independent. so every test cases get opportunity to get executed whether test case pass or fail.
    //AAA Rule
	//AAA stands for : Arrange,Act,Assert
	//Arrange test cases in proper sequence
	//Act write your step properly
	//Assert is mandatory to write
	//1 testcase with 1 Assertion
	
	// 1 test case with 1 Assert is best practice and it is a rule
	
	@Test(priority = 1)  
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");  
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	    Assert.assertTrue(flag);    
	}
	
	@Test(priority = 3)
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
	    Assert.assertTrue(flag);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
