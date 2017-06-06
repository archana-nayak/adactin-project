package com.sqa.anayak.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import com.sqa.anayak.helpers.*;

public class SearchHotelPage extends AdactinCorePage {

	@FindBy(id = "adult_room")
	private WebElement adultsPerRoomField;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;

	@FindBy(id = "child_room")
	private WebElement childrenPerRoomField;

	@FindBy(id = "hotels")
	private WebElement hotelField;

	@FindBy(id = "location")
	private WebElement locationSelectField;

	@FindBy(id = "room_nos")
	private WebElement numberOfRoomsField;

	@FindBy(id = "")
	private WebElement resetButton;

	@FindBy(id = "room_type")
	private WebElement roomTypeField;

	@FindBy(id = "Submit")
	private WebElement submitButton;

	public SearchHotelPage(BasicTest test) {
		super(test);
		PageFactory.initElements(getDriver(), this);
	}

	public void searchHotels(String locationString, String hotel, String roomType, String numberOfRooms,
			String checkInDate, String checkOutDate, String noOfAdults, String noOfChildren) {

		Select locationSelect = new Select(this.locationSelectField);
		locationSelect.selectByValue(locationString);

		Select hotelSelect = new Select(this.hotelField);
		hotelSelect.selectByValue(hotel);

		Select roomTypeSelect = new Select(this.roomTypeField);
		roomTypeSelect.selectByValue(roomType);

		Select numberOfRoomsSelect = new Select(this.numberOfRoomsField);
		numberOfRoomsSelect.selectByValue(numberOfRooms);

		this.checkInDate.clear();
		this.checkInDate.sendKeys(checkInDate);
		this.checkOutDate.clear();
		this.checkOutDate.sendKeys(checkOutDate);

		Select adultsPerRoom = new Select(this.adultsPerRoomField);
		adultsPerRoom.selectByValue(noOfAdults);

		Select childrenPerRoom = new Select(this.childrenPerRoomField);
		childrenPerRoom.selectByValue(noOfChildren);

		this.submitButton.click();
	}
}