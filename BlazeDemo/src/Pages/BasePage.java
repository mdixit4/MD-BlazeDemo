package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	Properties config;
	WebDriverWait wait;
	

	
	public BasePage(WebDriver driver) throws Exception {
		
		this.driver = driver;
		
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\Repository\\Config.properties");
		
		config = new Properties();
		config.load(fis);
		
		
		
		}
	
	
	public WebElement find(By locator) {
		return driver.findElement(locator);
	}
	
	public String getprop(String st) {
		return config.getProperty(st);
	}
	
	public void openurl(String urladd) {
		driver.get(config.getProperty(urladd));
	}
	
	public void click(By locator) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		find(locator).click();
	}
	
	public void clear(By locator) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		find(locator).clear();
	}
	
	public void sendData(By locator, String data) {
		find(locator).sendKeys(data);
	}
	
		
	public void SelectFromDropdown(By locator, String data) {
		Select dd = new Select(find(locator));
		//wait.until(ExpectedConditions.elementToBeClickable(locator));
		dd.selectByVisibleText(config.getProperty(data));
			
	}
	
}

