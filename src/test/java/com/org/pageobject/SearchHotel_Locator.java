package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.baseclass.adactin.BaseClass_AdactinCucumber;



public class SearchHotel_Locator extends LoginPage_Locator  {
	public static WebElement getLocation() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(1,5)));
    }
	public static WebElement getHotels() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(1,6)));
    }
	public static WebElement getRoomType() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(1,7)));
    }
	public static WebElement getNoOfRooms() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(2,5)));
    }
	public static WebElement getCheckInDate() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(2,6)));
    }
	public static WebElement getCheckOutDate() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(2,7)));
    }
	public static WebElement getAdultRoom() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(3,5)));
    }
	public static WebElement getChildRoom() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(3,6)));
    }
	public static WebElement getSearch() {
    	return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(3,7)));
    }
}
