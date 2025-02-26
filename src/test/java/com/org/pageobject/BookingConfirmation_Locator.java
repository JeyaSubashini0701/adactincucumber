package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.baseclass.adactin.BaseClass_AdactinCucumber;



public class BookingConfirmation_Locator extends SelectHotel_Locator {
	public static WebElement getOrderNumber() {
		   return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(5, 5)));
	   }
}
