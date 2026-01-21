package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaperTradingPage {
	
	@FindBy (xpath="//a[text()='Paper Trading']")
	WebElement paper_trading;
	
	@FindBy (xpath="//a[text()=' Contact Us ']")
	WebElement contact_us;
	

	@FindBy (xpath="(//button[text()='Send OTP'])[2]")
	WebElement sendotp;
	
	@FindBy (xpath="(//input[@placeholder=\"Enter OTP\"])[2]")
	WebElement enterotp;
	
	@FindBy (xpath="//input[@placeholder=\"Your Email\"]")
	WebElement email;
	
	public void papertrading_click() {
		paper_trading.click();
	}
	public void contact_us_click() {
		contact_us.click();
	}
	public void email_s(String s) {
		email.sendKeys(s);
	}
	
	public PaperTradingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);

	}

}
