package com.PHPTravel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {
	@FindBy(how = How.XPATH, using = "//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")
	private WebElement inputemail;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"loginfrm\"]/div[1]/div[5]/button")
	private WebElement login;
	
	public void phpTravelFront3() {
		inputemail.sendKeys("anirban5@gmail.com");
		password.sendKeys("mnbvcxz");
		login.click();
	}

}
