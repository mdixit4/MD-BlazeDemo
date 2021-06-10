package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void tearup() {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive data\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
		
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	
	}
	

}
