package com.PHPTravel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class SignUpPage {
//	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'My Account')])[2]")
//	private WebElement register;
	
	@FindBys({
		@FindBy(xpath = "//*[@id=\"li_myaccount\"]/a")
	})
	private List<WebElement> myaccount;
	
	@FindBys({
		@FindBy(xpath = "//*[@id=\"li_myaccount\"]/ul/li[2]/a")
	})
	private List<WebElement> signup;
	
//	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Sign Up')])[2]")
//	private WebElement signupp;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headersignupform\"]/div[3]/input")
	private WebElement inputfname;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headersignupform\"]/div[4]/input")
	private WebElement inputsname;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headersignupform\"]/div[5]/input")
	private WebElement mnumber;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headersignupform\"]/div[6]/input")
	private WebElement inputemail;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headersignupform\"]/div[7]/input")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headersignupform\"]/div[8]/input")
	private WebElement passwordagain;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headersignupform\"]/div[9]/button")
	private WebElement signupbutton;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Jay')])[2]")
	private WebElement clicklogout;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Logout')])[2]")
	private WebElement logout;
	
	
	
	public void phpTravelFront2() {
		myaccount.get(1).click();
		signup.get(1).click();
		inputfname.sendKeys("Jay");
		inputsname.sendKeys("M");
		mnumber.sendKeys("2345235233");
		inputemail.sendKeys("anirban5@gmail.com");
		password.sendKeys("mnbvcxz");
		passwordagain.sendKeys("mnbvcxz");
		signupbutton.click();
		clicklogout.click();
		logout.click();
	}

}
