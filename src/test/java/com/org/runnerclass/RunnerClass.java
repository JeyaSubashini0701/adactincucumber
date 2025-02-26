package com.org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\MSARUL\\eclipse-workspace"
		+ "\\AdactinCucumber\\src\\test\\java\\com\\org\\featurefile",glue="com.org.stepdefinition",tags="@adactin",publish=true,monochrome = true)
public class RunnerClass {

}
