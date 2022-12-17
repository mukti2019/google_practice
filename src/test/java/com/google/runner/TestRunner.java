package com.google.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="Features",
		glue= "come.google.steps"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
