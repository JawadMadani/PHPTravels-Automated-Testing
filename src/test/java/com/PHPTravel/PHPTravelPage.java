package com.PHPTravel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PHPTravelPage {
	@FindBy(how = How.XPATH, using = "//*[@id=\"s2id_autogen10\"]/a/span[1]")
	private WebElement locationsearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-drop\"]/div/input")
	private WebElement sendingtext;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div/span")
	private WebElement selectlondon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"adults\"]")
	private WebElement howmanyadults;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"adults\"]/option[3]")
	private WebElement select3;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dpd1\"]/input")
	private WebElement clickcheckinbox;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[14]/div[1]/table/tbody/tr[5]/td[5]")
	private WebElement checkin;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[15]/div[1]/table/tbody/tr[5]/td[7]")
	private WebElement checkout;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"HOTELS\"]/form/div[3]/div[3]/button")
	private WebElement clicksearch;
	
	
	
	public void phpTravelFront() {
		locationsearch.click();
		sendingtext.sendKeys("london");
		selectlondon.click();
		howmanyadults.click();
		select3.click();
		clickcheckinbox.click();
		checkin.click();
		checkout.click();
		clicksearch.click();
	}

}
