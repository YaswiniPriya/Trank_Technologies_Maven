package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StockTradingPage {
	private WebDriver driver;
	
	
	@FindBy (xpath="(//a[text()='Verticals'])[1]")
	WebElement verticals;
	
	@FindBy (xpath="//strong[text()='Trading']")
	WebElement trading;
	
	@FindBy (xpath="(//a[text()='Stock Trading'])[1]")
	WebElement stock_trading;
	
	@FindBy (xpath="(//div[@class=\"cm-industry-choose-item-back-header\"])[1]")
	WebElement option1;
	
	@FindBy (xpath="(//div[@class=\"cm-industry-choose-item-back-header\"])[2]")
	WebElement option2;
	
	@FindBy (xpath="(//div[@class=\"cm-industry-choose-item-back-header\"])[3]")
	WebElement option3;
	
	@FindBy (xpath="(//input[@placeholder=\"Your Name\"])[2]")
	WebElement name;
	
	@FindBy (xpath="(//input[@placeholder=\"Your Mail\"])[2]")
	WebElement email;
		
	@FindBy (xpath="(//input[@placeholder=\"Your Company\"])[2]")
	WebElement company;
	
	@FindBy (xpath="(//select[@name=\"service\"])[2]")
	WebElement service;
	
	@FindBy (xpath="(//input[@placeholder=\"Your Phone\"])[2]")
	WebElement phoneno;
	
	@FindBy (xpath="(//textarea[@placeholder=\"Message\"])[2]")
	WebElement message;
	
	@FindBy (xpath="(//input[@value=\"Submit\"])[2]")
	WebElement submit;
	
	public void verticals_mouseover() {		
		Actions a = new Actions(driver);
		a.moveToElement(verticals).perform();
	}
	public void trading_mouseover() {
		Actions a = new Actions(driver);
		a.moveToElement(trading).perform();
	}
	public void stocktrading_click() {
		stock_trading.click();
	}
	public void option1_mouseover() {
		Actions a = new Actions(driver);
		a.moveToElement(option1).perform();
	}
	public void option2_mouseover() {
		Actions a = new Actions(driver);
		a.moveToElement(option2).perform();
	}
	public void option3_mouseover() {
		Actions a = new Actions(driver);
		a.moveToElement(option3).perform();
	}
	public void name_s(String s) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name); 
		name.sendKeys(s);
	}
	public void email_s(String e) {
		email.sendKeys(e);
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
		File dest = new File("Screenshot_stocktrading.png");
		FileUtils.copyFile(src, dest);
	}
	public void submit_s() {
		submit.click();
	}
	
	public StockTradingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
}
