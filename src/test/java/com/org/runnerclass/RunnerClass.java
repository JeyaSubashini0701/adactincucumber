package com.org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\org\\featurefile\\Adactin.feature",glue="com.org.stepdefinition",tags="@adactin",
		plugin = {
		        "pretty", 
		        "junit:target\\cucumberreports\\Cucumber.xml"  // JUnit Report
		    },monochrome = true)
public class RunnerClass {

}
