package com.itview.stepdefination;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginTest {
	
	WebDriver w;

	@Given("Browser should be open with login page")
	public void browser_should_be_with_login_page() {
		
		w = new ChromeDriver();
		w.get("http://altoromutual.com:8080/login.jsp");

	}

	@When("User should enter Username and Password and click on login button")
	public void user_should_enter_username_and_password_and_click_on_login_button() throws Exception {

		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		Thread.sleep(1000);
		w.findElement(By.xpath("//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(1000);
	}

	@Then("Home Page should get open and verify page title")
	public void home_page_should_get_open_and_verify_page_title() {
		
		String pageTitle=w.getTitle();
		Assert.assertEquals("Altoro Mutual", pageTitle);
		
		w.findElement(By.linkText("Sign Off")).click();
		w.quit();
	}
}
