package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.FlightDetails;
import Pages.FlightReservationDetails;
import Pages.HomePage;


public class E2E extends BaseClass {

	HomePage objhp;
	FlightDetails objfd;
	FlightReservationDetails objfrd;

	@Test
	public void TC01_LaunchSiteAndSelectToAndFromCities() throws Exception {

		objhp = new HomePage(driver);
		objhp.Launchurl();
		objhp.SelectDepartureCity();
		objhp.SelectDestnationCity();
		objhp.ClickFindFlights();
		
	}

	@Test
	public void TC02_SelectFlight() throws Exception {

		objfd = new FlightDetails(driver);
		objfd.choseFlight();
		
	}
	
	@Test
	public void TC02_EnterFlightReservationDetails() throws Exception {

		objfrd = new FlightReservationDetails(driver);
		objfrd.enterName();
		objfrd.enterAddress();
		objfrd.enterCity();
		objfrd.enterState();
		objfrd.enterZipCode();
		objfrd.enterCardType();
		objfrd.enterCReditCardNumber();
		objfrd.enterMonth();
		objfrd.enterYear();
		objfrd.enterNameOnCard();
		objfrd.select_RememberMe();
		objfrd.clickPurchaseFlight();
		
	}
		

		
		
	}

