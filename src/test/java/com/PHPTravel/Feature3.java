package com.PHPTravel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Feature3 {
	@FindBy(how = How.XPATH, using = "(//img[@alt='PHPTRAVELS'])[2]")
	private WebElement bookingpage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"offcanvas-menu\"]/ul/li[1]/a/span[1]/img")
	private WebElement hotelss;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"collapse1\"]/div[1]/div/div[9]/div/ins")
	private WebElement fivestar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchform\"]")
	private WebElement searchform;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"body-section\"]/div[5]/div[3]/div/table/tbody/tr[1]/td/div[2]/div/div[5]/a/button")
	private WebElement fivestarhotel;
	
//	@FindBy(how = How.XPATH, using = "//*[@id=\"adults\"]")
//	private WebElement howmanyadults;
	
//	@FindBy(how = How.XPATH, using = "//*[@id=\"adults\"]/option[3]")
//	private WebElement threeadults;
	
	
	
	
	
	public void phpTravelFront4() {
		bookingpage.click();
		hotelss.click();
		fivestar.click();
		searchform.click();
		fivestarhotel.click();
//		howmanyadults.click();
//		threeadults.click();
		

	}

}
