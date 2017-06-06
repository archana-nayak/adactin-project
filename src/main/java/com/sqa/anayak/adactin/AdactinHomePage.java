package com.sqa.anayak.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.anayak.helpers.*;
import com.sqa.anayak.helpers.po.*;

public class AdactinHomePage extends BasicPage {

	@FindBy(id = "login")
	private WebElement loginButton;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "username")
	private WebElement userNameField;

	public AdactinHomePage(BasicTest test) {
		super(test);
		PageFactory.initElements(getDriver(), this);
	}

	public SearchHotelPage login(String username, String password) {
		this.userNameField.clear();
		this.userNameField.sendKeys(username);
		this.passwordField.clear();
		this.passwordField.sendKeys(password);
		this.loginButton.click();

		return new SearchHotelPage(this.getCurTest());
	}

}
