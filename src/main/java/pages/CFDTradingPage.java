package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CFDTradingPage {
	
	@FindBy (xpath="(//a[text()='CFD Trading'])[1]")
	WebElement cfd_trading;
	
	@FindBy (xpath="//a[text()='Get In Touch']")
	WebElement getintouch;
	
	public void cfdtrading_click() {
		cfd_trading.click();
	}
	public void getintouch_click() {
		getintouch.click();
	}
	
	public CFDTradingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
