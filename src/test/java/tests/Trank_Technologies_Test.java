package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CFDTradingPage;
import pages.GetAFreeQuotePage;
import pages.PaperTradingPage;
import pages.StockTradingPage;

public class Trank_Technologies_Test extends BaseTest{
	
		

	@Test(priority = 0)
	void Test1_GetFreeQuote_Test() throws InterruptedException, IOException {
		// Get a Free Quote
		GetAFreeQuotePage fq = new GetAFreeQuotePage(driver);
		fq.freequote_click();
		System.out.println("Filling the form");
		fq.name_s("Priya");
		fq.email_s("priyaganji@gmail.com");
		fq.sendotp_s();
		fq.enterotp_s("123456");
		fq.company_s("TCS");
		fq.service_s("Web Development");
		fq.phoneno_s("242424323");
		fq.msg("Hello");
		fq.submit_s();
		driver.navigate().back();
		System.out.println("Filled the form succesfully");
		System.out.println("Get a Free Quote page verified successfully");
		String parent_icon = driver.getWindowHandle();
		driver.switchTo().window(parent_icon);
		Thread.sleep(5000);
		}
	@Test(priority=1)
	void Test2_StockTrading_Test() throws InterruptedException, IOException {
		StockTradingPage st = new StockTradingPage(driver);
		System.out.println("Moving to stock trading page");
		st.verticals_mouseover();
		st.trading_mouseover();
		st.stocktrading_click();
		Thread.sleep(5000);
		System.out.println("Moved to stock trading page");
		st.option1_mouseover();
		Thread.sleep(2000);
		st.option2_mouseover();
		Thread.sleep(2000);
		st.option3_mouseover();
		Thread.sleep(2000);
		System.out.println("Filling the form");
		st.name_s("Priya");
		st.email_s("priyaganji@gmail.com");
		st.company_s("TCS");
		st.service_s("eCommerce Development");
		st.phoneno_s("242424323");
		st.msg("Hello");
		st.submit_s();
		System.out.println("Filled the form");
		System.out.println("Stock trading page verified successfully");
		driver.navigate().back();
	}
	@Test(priority=2)
	void Test3_PaperTrading_Test() throws InterruptedException, IOException {
		StockTradingPage st = new StockTradingPage(driver);
		System.out.println("Moving to paper trading page");
		st.verticals_mouseover();
		st.trading_mouseover();
		PaperTradingPage pt = new PaperTradingPage(driver);
		pt.papertrading_click();
		Thread.sleep(5000);
		pt.contact_us_click();
		Thread.sleep(5000);
		st.name_s("Priya");
		pt.email_s("priyaganji@gmail.com");
		st.company_s("TCS");
		st.service_s("Business Listing");
		st.phoneno_s("242424323");
		st.msg("Hello");
		st.submit_s();
		System.out.println("Filled the free consultation form");
		System.out.println("Paper trading page verified successfully");
		driver.navigate().back();
		
		
	}
	@Test(priority=3)
	void Test4_CFDTradingPage_Test() throws InterruptedException {
		StockTradingPage st = new StockTradingPage(driver);
		System.out.println("Moving to CFD trading page");
		st.verticals_mouseover();
		st.trading_mouseover();
		CFDTradingPage ct = new CFDTradingPage(driver);
		ct.cfdtrading_click();
		Thread.sleep(3000);
		System.out.println("Moved to CFD trading page");
		ct.getintouch_click();
		Thread.sleep(2000);
		System.out.println("Clicking on icons in the footer");
		ct.click_icons();
		System.out.println("Clicked and closed on icons in the footer");
		System.out.println("CFD trading page verified successfully");
		driver.navigate().back();
		
	}
		
	
}


