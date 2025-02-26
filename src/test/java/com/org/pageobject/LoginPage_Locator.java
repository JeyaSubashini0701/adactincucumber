package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.baseclass.adactin.BaseClass_AdactinCucumber;

public class LoginPage_Locator extends BaseClass_AdactinCucumber {
   public static WebElement getUsername() {
	   return driver.findElement(By.id("username"));
   }
   public static WebElement getPassword() {
	   return driver.findElement(By.id("password"));
   }
   public static WebElement getLoginBtn() {
	   return driver.findElement(By.id("login"));
   }
}
