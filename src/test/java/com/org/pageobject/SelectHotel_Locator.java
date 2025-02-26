package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.baseclass.adactin.BaseClass_AdactinCucumber;



public class SelectHotel_Locator extends SearchHotel_Locator {
	public static WebElement getRadioBtn() {
		   return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(4,2)));
	   }
	   
	   public static WebElement getContinueBtn() {
		   return driver.findElement(By.id(BaseClass_AdactinCucumber.readFromExcel(4,3))); 
	   }
}
