package com.itview.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDriven {
	
	WebDriver w;
	
	@Given("Open firefox and navigate to calculate page")
	public void open_firefox_and_navigate_to_calculate_page() {
		
		w = new FirefoxDriver();
		w.get("https://juliemr.github.io/protractor-demo/");
	   
	}

	@When("Enter two numbers {string} and {string} with operator {string}")
	public void enter_two_numbers_and_with_operator(String firstnumber, String secondnumber, String operator) throws InterruptedException {
	   
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys(firstnumber);

		WebElement operator_dropdown = w.findElement(By.xpath("/html/body/div/div/form/select"));
		Select sc = new Select(operator_dropdown);
		sc.selectByVisibleText(operator);

		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys(secondnumber);
		Thread.sleep(2000);
		w.findElement(By.id("gobutton")).click();
		
	}

	@Then("Validate output {string}")
	public void validate_output(String Result) throws Exception {
		
		Thread.sleep(2000);		
		String output=w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals(Result, output);
	//	w.close();
	   
	}
}
