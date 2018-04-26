package com.PHPTravel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POMTestForPHPTravel {
	private WebDriver driver;
	
	@Given("^book a hotel in london$")
	 public void goToSite() {
	 driver = new ChromeDriver();
	 driver.get("http://www.phptravels.net/");
	  }
	
	
	@When("^the page is launched$")
	public void performingSearch() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		PHP Travel Page feature 1
		PHPTravelPage performSearch = PageFactory.initElements(driver, PHPTravelPage.class);
		performSearch.phpTravelFront();
		
//		PHP Travel Sign Up Page
		SignUpPage performSearch2 = PageFactory.initElements(driver, SignUpPage.class);
		performSearch2.phpTravelFront2();
		
//		PHP Travel Sign In
		SignInPage performSearch3 = PageFactory.initElements(driver, SignInPage.class);
		performSearch3.phpTravelFront3();
		
//		PHP Travel feature 3
		Feature3 performSearch4 = PageFactory.initElements(driver, Feature3.class);
		performSearch4.phpTravelFront4();
		
	 }
	
	
	@Then("^quit the page$")
	public void check() {
//		driver.quit();
	}
	

}
