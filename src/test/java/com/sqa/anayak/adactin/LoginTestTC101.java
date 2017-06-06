package com.sqa.anayak.adactin;

import org.testng.*;
import org.testng.annotations.*;

public class LoginTestTC101 extends AdactinTest {

	@Test
	public void testLogin() {
		String expectedPageTitle = "AdactIn.com - Search Hotel";
		// we first ran the test with a known wrong value,
		// just so we get the actual value from the error message
		// thrown. Picked that value and then ran the test again.
		AdactinHomePage homePage = new AdactinHomePage(this);
		homePage.login("archananayak", "abc1234");
		Assert.assertEquals(getDriver().getTitle(), expectedPageTitle);
	}

}
