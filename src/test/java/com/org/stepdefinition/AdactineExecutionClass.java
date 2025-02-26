package com.org.stepdefinition;

import com.org.baseclass.adactin.BaseClass_AdactinCucumber;
import com.org.pageobject.BookHotel_Locator;
import com.org.pageobject.BookingConfirmation_Locator;
import com.org.pageobject.LoginPage_Locator;
import com.org.pageobject.SearchHotel_Locator;
import com.org.pageobject.SelectHotel_Locator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactineExecutionClass {
	
	@Given("Log in to the AdactinHotel")
	public void log_in_to_the_adactin_hotel() {	     
	BaseClass_AdactinCucumber.sendInput(LoginPage_Locator.getUsername(), BaseClass_AdactinCucumber.readFromProp("username"));
	BaseClass_AdactinCucumber.sendInput(LoginPage_Locator.getPassword(), BaseClass_AdactinCucumber.readFromProp("password"));
	BaseClass_AdactinCucumber.toClick(LoginPage_Locator.getLoginBtn());
		   
	}
	@When("Enter the search Hotel details")
	public void enter_the_search_hotel_details() {
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(SearchHotel_Locator.getLocation()),BaseClass_AdactinCucumber.readFromExcel(0,2));
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(SearchHotel_Locator.getHotels()),BaseClass_AdactinCucumber.readFromExcel(0,3));
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(SearchHotel_Locator.getRoomType()),BaseClass_AdactinCucumber.readFromExcel(1,0));
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(SearchHotel_Locator.getNoOfRooms()),BaseClass_AdactinCucumber.readFromExcel(1,1));
		BaseClass_AdactinCucumber.sendInput(SearchHotel_Locator.getCheckInDate(),BaseClass_AdactinCucumber.readFromExcel(1,2));
		BaseClass_AdactinCucumber.sendInput(SearchHotel_Locator.getCheckOutDate(),BaseClass_AdactinCucumber.readFromExcel(1,3));
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(SearchHotel_Locator.getAdultRoom()),BaseClass_AdactinCucumber.readFromExcel(2,0));
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(SearchHotel_Locator.getChildRoom()),BaseClass_AdactinCucumber.readFromExcel(2,1));
		BaseClass_AdactinCucumber.toClick(SearchHotel_Locator.getSearch());
	}
	@When("Enter SelectHotel Page details")
	public void enter_select_hotel_page_details() {
		BaseClass_AdactinCucumber.toClick(SelectHotel_Locator.getRadioBtn());
		BaseClass_AdactinCucumber.toClick(SelectHotel_Locator.getContinueBtn());
	}
	@When("Enter BookHotel Page Details")
	public void enter_book_hotel_page_details() {
		BaseClass_AdactinCucumber.sendInput(BookHotel_Locator.getFirstName(), BaseClass_AdactinCucumber.readFromExcel(2, 2));
		BaseClass_AdactinCucumber.sendInput(BookHotel_Locator.getLastName(), BaseClass_AdactinCucumber.readFromExcel(2, 3));
		BaseClass_AdactinCucumber.sendInput(BookHotel_Locator.getAddress(), BaseClass_AdactinCucumber.readFromExcel(3,0));
		BaseClass_AdactinCucumber.sendInput(BookHotel_Locator.getCCNumber(), BaseClass_AdactinCucumber.readFromExcel(3,1));
		BaseClass_AdactinCucumber.sltByVisibleText(BaseClass_AdactinCucumber.selectCls(BookHotel_Locator.getCCType()),BaseClass_AdactinCucumber.readFromExcel(3,2));
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(BookHotel_Locator.getExpMonth()),BaseClass_AdactinCucumber.readFromExcel(3,3));
		BaseClass_AdactinCucumber.sltByValue(BaseClass_AdactinCucumber.selectCls(BookHotel_Locator.getExpYear()),BaseClass_AdactinCucumber.readFromExcel(4,0));
		BaseClass_AdactinCucumber.sendInput(BookHotel_Locator.getCvvNumber(), BaseClass_AdactinCucumber.readFromExcel(4,1));
		BaseClass_AdactinCucumber.toClick(BookHotel_Locator.getBookNow());
		BaseClass_AdactinCucumber.implicitWait(20);
	}
	
	@Then("get the BookingConfirmation and Print the orderNum")
	public void get_the_booking_confirmation_and_print_the_order_num() {
		 String attValue=BaseClass_AdactinCucumber.getAttribute(BookingConfirmation_Locator.getOrderNumber(),BaseClass_AdactinCucumber.readFromExcel(5, 6));
		 System.out.println(attValue);
		 BaseClass_AdactinCucumber.reusableExcelWrite(BaseClass_AdactinCucumber.readFromExcel(9, 0), 5, 7, attValue);
	}
}