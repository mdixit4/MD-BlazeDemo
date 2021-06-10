package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FlightReservationDetails extends BasePage {

	public FlightReservationDetails(WebDriver driver) throws Exception {
		super(driver);
		
	}
	
	private By Name = By.xpath("//tbody/tr[3]/td[1]/input[1]");
	private By Address = By.xpath("//input[@id = 'inputName']");
	private By City = By.xpath("//input[@id = 'city']");
	private By State = By.xpath("//input[@id = 'state']");
	private By Zipcode = By.xpath("//input[@id = 'zipCode']");
	private By CardType = By.xpath("//select[@id = 'cardType']");
	private By CreditCardNumber = By.xpath("//input[@id = 'creditCardNumber']");
	private By Month = By.xpath("//input[@id = 'creditCardMonth']");
	private By Year = By.xpath("//input[@id = 'creditCardYear']");
	private By NameOnCard = By.xpath("//input[@id = 'nameOnCard']");
	private By RememberMe = By.xpath("//input[@id = 'rememberMe']");
	private By PurchaseFlight = By.xpath("//input[@type = 'submit']");
	private By ReservationConfirmationMsg = By.xpath("//h1[normalize-space()='Thank you for your purchase today!']");
	
	
	public void enterName() {
		clear(Name);
		click(Name);
		sendData(Name, "ABC");
	}
	
	
	public void enterAddress() {
		clear(Address);
		click(Address);
		sendData(Address, "101 Central street");
	}
	
	public void enterCity() {
		clear(City);
		click(City);
		sendData(City, "Pune");
	}
	
	public void enterState() {
		clear(State);
		click(State);
		sendData(State, "Maharashtra");
	}
	
	public void enterZipCode() {
		clear(Zipcode);
		click(Zipcode);
		sendData(Zipcode, "12345");
	}
	
	public void enterCardType() {
		SelectFromDropdown(CardType, "American Express");
	}
	
	
	public void enterCReditCardNumber() {
		clear(CreditCardNumber);
		click(CreditCardNumber);
		sendData(CreditCardNumber, "1234567890");
	}
	
	public void enterMonth() {
		clear(Month);
		click(Month);
		sendData(Month, "June");
	}
	
	public void enterYear() {
		clear(Year);
		click(Year);
		sendData(Year, "2021");
	}
	
	
	public void enterNameOnCard() {
		clear(NameOnCard);
		click(NameOnCard);
		sendData(NameOnCard, "aaa bbb");
	}
	
	public void select_RememberMe() {
		click(RememberMe);
	}
	
	String Actualmsg = "Thank you for your purchase today!";
	
	public void clickPurchaseFlight() throws Exception {
		click(PurchaseFlight);
		Thread.sleep(3000);
		Assert.assertEquals(Actualmsg, ReservationConfirmationMsg);
		
	}
	
	
	
	
}
