package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CFDTradingPage {
	
	 WebDriver driver;
	@FindBy (xpath="(//a[text()='CFD Trading'])[1]")
	WebElement cfd_trading;
	
	@FindBy (xpath="//a[text()='Get In Touch']")
	WebElement getintouch;
	
	@FindBy (xpath ="//a[@href=\"https://www.facebook.com/TrankTechnologies\"]")
	WebElement facebook;
	
	@FindBy (xpath="//a[@href=\"https://in.linkedin.com/company/trank-technologies-official\"]")
	WebElement linkedin;
	
	@FindBy (xpath="//a[@href=\"https://www.instagram.com/tranktechnologies/\"]")
	WebElement instagram;
	
	@FindBy (xpath="//a[@href=\"https://in.pinterest.com/tranktechnologies12/\"]")
	WebElement pininterest;
	
	@FindBy (xpath="//a[@href=\"https://twitter.com/tranktechno\"]")
	WebElement twitter;
	
	@FindBy (xpath="//a[@href=\"https://www.youtube.com/channel/UCWu1Y-tfrXf-Utpaft830Cg\"]")
	WebElement youtube;
	
	@FindBy (xpath="//a[@href=\"https://www.quora.com/profile/Trank-Technologies-1\"]")
	WebElement quora;
	
	public void cfdtrading_click() {
		cfd_trading.click();
	}
	public void getintouch_click() {
		getintouch.click();
	}
	public void click_icons() throws InterruptedException {
		facebook.click();
		Thread.sleep(2000);
		linkedin.click();
		Thread.sleep(2000);

		instagram.click();
		Thread.sleep(2000);

		pininterest.click();
		Thread.sleep(2000);

		twitter.click();
		Thread.sleep(2000);

		youtube.click();
		Thread.sleep(2000);

		quora.click();
		Thread.sleep(2000);

		String parent_icon = driver.getWindowHandle();
		for(String window_icon: driver.getWindowHandles()) {
			if(!window_icon.equals(parent_icon)) {
				driver.switchTo().window(window_icon);
				driver.close();
													}		
			}
		driver.switchTo().window(parent_icon);
		
	}
	
	public CFDTradingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	

}
