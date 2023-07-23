package com.itview.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "Feature/DataDriven.feature" }, 
		glue = { "com.itview.stepdefination" }, 
		plugin = { "pretty","html:target/cucumber-report.html" },
		monochrome =true
		//tags = "@Sub"

)

public class TestRunner {

}
