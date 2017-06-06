package com.sqa.anayak.adactin;

import com.sqa.anayak.helpers.*;

public class AdactinLoginTest extends LoginTest {

	public AdactinLoginTest() {
		super("http://adactin.com/HotelApp");
	}

	@Override
	public void login() {
		AdactinHomePage homePage = new AdactinHomePage(this);
		homePage.login(getProp("username"), getProp("password"));
	}

	@Override
	public void logout() {
		AdactinCorePage corePage = new AdactinCorePage(this);
		corePage.logout();
	}
}