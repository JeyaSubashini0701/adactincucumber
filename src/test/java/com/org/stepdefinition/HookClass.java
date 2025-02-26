package com.org.stepdefinition;

import java.io.IOException;

import com.org.baseclass.adactin.BaseClass_AdactinCucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
   @Before
   public void browserLaunch() {
	   BaseClass_AdactinCucumber.browserLaunch("chrome",BaseClass_AdactinCucumber.readFromProp("url"));
   }
   @After
   public void takeScreenshot() {
	   System.out.println("Screenshot");
	   try {
		BaseClass_AdactinCucumber.takeScreenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
