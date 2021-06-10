package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	
	
	public HomePage(WebDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By DepartureCity = By.xpath("//select[@name='fromPort']");
	private By DestinationCity = By.xpath("//select[@name='toPort']");
	private By FindFlights = By.xpath("//input[@type='submit']");
	
	public void Launchurl() {
		openurl("URL");
		
	}
	
	public void SelectDepartureCity() {
		SelectFromDropdown(DepartureCity,"DepCity");
		
	}
	
	public void SelectDestnationCity() {
		SelectFromDropdown(DestinationCity,"DestCity");
		
	}
	
	public void ClickFindFlights() {
		click(FindFlights);
		
	}
	
	
}
