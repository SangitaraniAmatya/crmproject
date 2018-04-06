 package com.CRMProject.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRMProject.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomepageStep extends TestBase {
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   TestBase.initialization(); 
	}

	@Then("^User is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    
	}
	@Then("^home page page is displayed$")
	public void home_page_page_is_displayed() throws Throwable {
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
	   
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
	}
	}

