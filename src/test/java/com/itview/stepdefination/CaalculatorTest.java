package com.itview.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaalculatorTest {

	WebDriver w;
	
	/*
	 * @Before public void openBrowser() { w = new FirefoxDriver(); }
	 */
	

	@Given("Application url for testing")
	public void application_url_for_testing() throws Exception {

		
		w.get("https://juliemr.github.io/protractor-demo/");
		Thread.sleep(5000);
	}

	@When("User should enter two enter and perform Addition operation")
	public void user_should_enter_two_enter_and_perform_addition_operation() throws Exception {

		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("4");

		WebElement operator_dropdown = w.findElement(By.xpath("/html/body/div/div/form/select"));
		Select sc = new Select(operator_dropdown);
		sc.selectByVisibleText("+");

		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("4");
		Thread.sleep(2000);
		w.findElement(By.id("gobutton")).click();
		Thread.sleep(2000);

	}

	@Then("Result should get display and verify output value for Addition.")
	public void result_should_get_display_and_verify_output_value_for_addition() throws Exception {

		Thread.sleep(2000);
		String output=w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals("8", output);
		//w.quit();
	}

	@When("User should enter two enter and perform subtraction operation")
	public void user_should_enter_two_enter_and_perform_subtraction_operation() throws Exception {

		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("10");

		WebElement operator_dropdown = w.findElement(By.xpath("/html/body/div/div/form/select"));
		Select sc = new Select(operator_dropdown);
		sc.selectByVisibleText("-");

		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("7");
		Thread.sleep(2000);
		w.findElement(By.id("gobutton")).click();
		Thread.sleep(2000);

	}

	@Then("Result should get display and verify output value for subtraction  .")
	public void result_should_get_display_and_verify_output_value_for_subtraction() throws Exception {

		Thread.sleep(2000);
		String output=w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals("3", output);
		//w.quit();
	}

	@When("User should enter two enter and perform multiplication operation")
	public void user_should_enter_two_enter_and_perform_multiplication_operation() throws Exception {

		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("3");

		WebElement operator_dropdown = w.findElement(By.xpath("/html/body/div/div/form/select"));
		Select sc = new Select(operator_dropdown);
		sc.selectByVisibleText("*");

		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("3");
		Thread.sleep(2000);
		w.findElement(By.id("gobutton")).click();
		Thread.sleep(2000);

	}

	@Then("Result should get display and verify output value for multiplication .")
	public void result_should_get_display_and_verify_output_value_for_multiplication() throws Exception {
		Thread.sleep(2000);
		String output=w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals("9", output);
	//	w.quit();
	}
	
	/*
	 * @After public void closeBrowser() { w.quit(); }
	 */
}
