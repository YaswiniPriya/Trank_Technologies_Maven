package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GetAFreeQuotePage {
	private WebDriver driver;
	
	@FindBy (xpath="(//a[@href=\"#\"])[1]")
	WebElement freequote;
	
	@FindBy (xpath="//input[@placeholder=\"Your Name\"]")
	WebElement name;
	
	@FindBy (xpath="//input[@placeholder=\"Your Mail\"]")
	WebElement email;
	
	@FindBy (xpath="//button[@id=\"send_career_otp\"]")
	WebElement sendotp;
	
	@FindBy (xpath="//input[@name=\"otp\"]")
	WebElement enterotp;
	
	@FindBy (xpath="//input[@placeholder=\"Your Company\"]")
	WebElement company;
	
	@FindBy (xpath="//select[@name=\"service\"]")
	WebElement service;
	
	@FindBy (xpath="//input[@name=\"phone\"]")
	WebElement phoneno;
	
	@FindBy (xpath="//textarea[@placeholder=\"Message\"]")
	WebElement message;
	
	@FindBy (xpath="//input[@value=\"Submit\"]")
	WebElement submit;
	
	
	public GetAFreeQuotePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	public void freequote_click() throws InterruptedException {
		Thread.sleep(5000);
		freequote.click();
	}
	public void name_s(String s) {
		name.sendKeys("s");
	}
	public void email_s(String e) {
		email.sendKeys(e);
	}
	public void sendotp_s() throws InterruptedException{
		sendotp.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void enterotp_s(String o) {
		enterotp.sendKeys(o);
	}
	public void company_s(String c) {
		company.sendKeys(c);
	}
	public void service_s(String sr) {
		service.sendKeys(sr);
		Select chooseaservice = new Select(service);
		chooseaservice.selectByContainsVisibleText(sr);
	}
	public void phoneno_s(String p) {
		phoneno.sendKeys(p);
	}
	public void msg(String m) throws IOException {
		message.sendKeys(m);
		TakesScreenshot ss= (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("Screenshot_getafreequote.png");
		FileUtils.copyFile(src, dest);
	}
	public void submit_s() {
		submit.click();
	}
}
