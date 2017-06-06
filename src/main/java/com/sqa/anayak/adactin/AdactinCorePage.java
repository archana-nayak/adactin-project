package com.sqa.anayak.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.anayak.helpers.*;
import com.sqa.anayak.helpers.po.*;

public class AdactinCorePage extends BasicPage {

	@FindBy(xpath = "html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")
	private WebElement backtohomeLink;

	@FindBy(xpath = "html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logoutLink;

	public AdactinCorePage(BasicTest test) {
		super(test);
		PageFactory.initElements(getDriver(), this);
	}

	public void logout() {
		this.logoutLink.click();
		this.backtohomeLink.click();
	}
}
