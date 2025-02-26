package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.org.baseclass.adactin.BaseClass_AdactinCucumber;

public class BookHotel_Locator extends SelectHotel_Locator {
	public static WebElement getFirstName() {
		return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(4, 4)));
		
	}
	
	public static WebElement getLastName() {
		 return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(4, 5)));
		
	}
	public static WebElement getAddress() {
		 return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(4, 6)));
		
	}
	public static WebElement getCCNumber() {
		 return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(4, 7)));
		
	}
	public static WebElement getCCType() {
		 return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(5, 0)));
		
	}
	public static WebElement getExpMonth() {
		 return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(5, 1)));
		
	}
	public static WebElement getExpYear() {
		 return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(5, 2)));
		
	}
	public static WebElement getCvvNumber() {
		return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(5, 3)));
		
	}
	public static WebElement getBookNow() {
		return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(5, 4)));
		
	}
} 
