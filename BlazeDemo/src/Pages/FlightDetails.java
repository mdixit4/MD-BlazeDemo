package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightDetails extends BasePage{
	
	
	public FlightDetails(WebDriver driver) throws Exception {
		super(driver);
	
	}

	private By ChooseFlight = By.xpath("//tbody/tr[3]/td[1]/input[1]");
	
	public void choseFlight() {
		click(ChooseFlight);
	}

}
