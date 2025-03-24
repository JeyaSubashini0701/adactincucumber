package com.org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\MSARUL\\eclipse-workspace"
		+ "\\AdactinCucumber\\src\\test\\java\\com\\org\\featurefile",glue="com.org.stepdefinition",tags="@adactin",publish=true,monochrome = true,
		plugin = {
		        "pretty", 
		        "html:target/cucumber-reports",  // HTML Report
		        "json:target/cucumber-reports/Cucumber.json",  // JSON Report
		        "junit:target/cucumber-reports/Cucumber.xml"  // JUnit Report
		    })
public class RunnerClass {

}
