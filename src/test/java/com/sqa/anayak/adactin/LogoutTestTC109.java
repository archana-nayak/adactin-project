package com.sqa.anayak.adactin;

import org.testng.annotations.*;

import com.sqa.anayak.enums.*;
import com.sqa.anayak.exceptions.*;
import com.sqa.anayak.helpers.*;

public class LogoutTestTC109 extends SauceLabsTest {

	/**
	 * @param baseUrl
	 * @throws BrowserNotSupportedBySauceLabsException
	 */
	public LogoutTestTC109() throws BrowserNotSupportedBySauceLabsException {
		super("http://adactin.com/HotelApp/");

	}

	@Override
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
				new Object[] { "Sydney", "Hotel Creek", "Double", "5", "31/05/2017", "01/06/2017", "3", "3" },
				new Object[] { "Brisbane", "Hotel Cornice", "Double", "5", "31/05/2017", "01/06/2017", "3", "3" },
				new Object[] { "London", "Hotel Sunshine", "Double", "5", "31/05/2017", "01/06/2017", "3", "3" } };
	}

	@Test(dataProvider = "dataProvider") // this is the method in saucelabsTest
	public void testSearchHotels(String username, String accessKey, Browser browser, String version, String platform,
			String city, String hotel, String roomtype, String numofroom, String checkindate, String checkoutdate,
			String adultsperroom, String childsperroom) throws BrowserNotSupportedBySauceLabsException {
		this.preTest(username, accessKey, browser, version, platform);
		SearchHotelPage searchPage = new AdactinHomePage(this).login(getProp("username"), getProp("password"));
		searchPage.searchHotels(city, hotel, roomtype, numofroom, checkindate, checkoutdate, adultsperroom,
				childsperroom);
		this.takeScreenShot("Hotel Results - " + hotel + " (" + city + ")");
	}
}