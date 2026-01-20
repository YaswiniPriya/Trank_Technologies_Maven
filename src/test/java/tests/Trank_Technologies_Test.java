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
	
		
	@Test(priority = 5,enabled=false)
	void Test5_ChatIcon_Test() throws InterruptedException {
		// Chat Icon
		Thread.sleep(10000);
		WebElement c = driver.findElement(By.xpath("(//iframe[@title=\"chat widget\"])[1]"));
		System.out.println("Foundchat icon");
		if(c.isDisplayed() && c.isEnabled()) {
			driver.switchTo().frame(c);
			driver.findElement(By.xpath("//button[@title=\"Chat widget\"]")).click();
			System.out.println("Clicked on chat button");
		}
		else
		{
			System.out.println("Chat icon is not visible");
		}
		
		
	}
	@Test(priority = 0)
	void Test1_menu_Test() throws InterruptedException {
		Actions a = new Actions(driver);
		//driver.findElement(By.xpath("(//img[@alt='Trank Technologies'])[1]")).click();
		//System.out.println("Image clicked");
		
		//Verticals drop down
		System.out.println("Checking verticals drop down...");						
	    String[] v_dd = {"//li[@data-id=\"trading\"]", "//strong[text()='Retail and Ecommerce']", "//strong[text()='Healthcare']", "//strong[text()='Fintech']", "//strong[text()='Custom App']"};
		String[] trading = {"(//a[text()='Stock Trading'])[1]", "//a[text()='Paper Trading']", "(//a[text()='CFD Trading'])[1]", "(//a[normalize-space()='Trading App Development in Massachusetts'])[1]", "//a[text()='Algo Trading']", "(//a[normalize-space() = 'Custom Trading'])[1]", "(//a[text()='Web Portal Trading'])[1]"};
		String[] retailandcom = {"//a[normalize-space() = 'eCommerce Website Development']", "//a[text() = 'eCommerce App Development']"};
		String[] healthcare= {"(//a[normalize-space() = 'Diet & Nutritions'])[1]", "(//a[text() = 'Health tracking App'])[1]"};
		String[] fintech = {"(//a[normalize-space()='Pos Software Development'])[1]","(//a[text()='Crypto'])[1]"};
		String[] customapp = {"(//a[normalize-space()='Desktop App Development'])[1]", "(//a[text()='HRM Development'])[1]", "(//a[text()='Travel'])[1]", "(//a[text()='Dating App Development'])[1]", "(//a[text()='CRM Development USA'])[1]", "(//a[text()='ERP App Development'])[1]", "(//a[text()='E-Learning'])[1]", "(//a[text()='Real Estate'])[1]"};
				
        String[][] verticals= {trading,retailandcom,healthcare,fintech,customapp};
        		
		for(int i=0;i<v_dd.length;i++) {
			for(int j=0;j<verticals[i].length;j++) {
				//Step 1 - mouse hover on verticals tab
				WebElement verticals_tab=driver.findElement(By.xpath("(//a[text()='Verticals'])[1]"));
				a.moveToElement(verticals_tab).perform();
				Thread.sleep(500);
				
				//Step 2 - mouse hover on main_verticals
				WebElement temp_mainVertical=driver.findElement(By.xpath(v_dd[i]));
				a.moveToElement(temp_mainVertical).perform();
				Thread.sleep(500);
				
				//Step 3 - clicking on the sub vertical
				WebElement temp_subVertical=driver.findElement(By.xpath(verticals[i][j]));
				a.moveToElement(temp_subVertical).click().perform();
				Thread.sleep(500);
				
				//Step 4 - Navigating to back
				driver.navigate().back();
				Thread.sleep(500);
								
			}
			
		}
		System.out.println("All Verticals are Completed..."); 
		
		//Technologies drop down
	String[] t_dd = {"//strong[text()='eCommerce Development']", "//strong[text()='Mobile App Development']", "//strong[text()='Artificial Intelligence']"};
		String[] ecomdev = {"//a[text()='Magento Development']", "(//a[text()='Codeigniter Development'])[1]", "(//a[text()='Big Commerce'])[1]", "(//a[text()='CS-Cart Development'])[1]", "(//a[normalize-space()='Nop Commerce'])[1]", "(//a[text()='Laravel Development'])[1]" , "(//a[text()='Drupal Development'])[1]" , "(//a[text()='Joomla Development'])[1]",
				"(//a[text()='Express JS Development'])[1]" , "(//a[text()='Opencart Development'])[1]" , "(//a[text()='WordPress Development'])[1]" , "(//a[text()='Shopify Development'])[1]" ,
				"(//a[text()='Node JS Development'])[1]" , "(//a[text()='Woo Commerce'])[1]" , "(//a[text()='Prestashop Development'])[1]" , "(//a[text()='Wix Development'])[1]" ,
				"(//a[text()='React JS Development'])[1]"};
		String[] mobileappdev= {"//a[contains(text(),'React Native Mobile')]" , "(//a[contains(text(),'Xamarin Mobile App')])[1]" , "(//a[contains(text(),'Flutter Mobile App')])[1]" , 
				"(//a[contains(text(),'Swift App')])[1]" , "(//a[contains(text(),'Enterprise Mobile App')])[1]" , "(//a[contains(text(),'Kotlin Mobile App')])[1]" , "(//a[contains(text(),'Ionic App')])[1]" ,
				 "(//a[contains(text(),'Appointment Booking')])[1]"};
		String[] ai = {};
		
		String[][] technologies = {ecomdev,mobileappdev,ai};
		System.out.println("Checking technologies drop down...");
		for(int i=0;i<t_dd.length;i++) {
			for(int j=0;j<technologies[i].length;j++) {
				//Step 1 - mouse hover on technologies tab
				WebElement tech_tab=driver.findElement(By.xpath("(//a[text()='Technologies'])[1]"));
				a.moveToElement(tech_tab).perform();
				Thread.sleep(500);
				
				//Step 2 - mouse hover on main_technologies
				WebElement temp_mainTech=driver.findElement(By.xpath(t_dd[i]));
				a.moveToElement(temp_mainTech).perform();
				Thread.sleep(500);
				
				//Step 3 - clicking on the sub technologies
				WebElement temp_subTech=driver.findElement(By.xpath(technologies[i][j]));
				a.moveToElement(temp_subTech).click().perform();
				Thread.sleep(500);
				
				//Step 4 - Navigating to back
				driver.navigate().back();
				Thread.sleep(500);			
			}
			}
		System.out.println("All Technologies tabs are Completed...");
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		System.out.println("Clicked on About us.....");
		driver.navigate().back();
		
		}
	@Test(priority = 1)
	void Test2_DropDown_Test() throws InterruptedException {
			System.out.println("Selecting drop down.....");
			WebElement dd = driver.findElement(By.xpath("//select[@id=\"countrySelector\"]"));
			Select country = new Select(dd);
			List<WebElement> options = country.getOptions();
			System.out.println("Number of items in drop down are:" + options.size());
			for(int i=0;i< options.size();i++) {
				dd.click();
				System.out.println("Selecting option:" + options.get(i).getText());
				Thread.sleep(5000);
			}			
		}
	@Test(priority = 2)
	void Test3_Icons_Test() throws InterruptedException {
			//clicking on social media icons
			
			String[] icons = {"//a[@class=\"cm-wa-btn box-shadow-2\"]",
					"//a[@href=\"https://www.facebook.com/TrankTechnologies\"]",
				"//a[@href=\"https://in.linkedin.com/company/trank-technologies-official\"]",
				"//a[@href=\"https://www.instagram.com/tranktechnologies/\"]",
				"//a[@href=\"https://in.pinterest.com/tranktechnologies12/\"]",
				"//a[@href=\"https://twitter.com/tranktechno\"]",
				"//a[@href=\"https://www.youtube.com/channel/UCWu1Y-tfrXf-Utpaft830Cg\"]",
				"//a[@href=\"https://www.quora.com/profile/Trank-Technologies-1\"]"};
			for(String icon: icons) {
				int i=1;
				driver.findElement(By.xpath(icon)).click();
				System.out.println("Clicked on  icon" + i + "....." );
				Thread.sleep(2000);
				i++;
				}
			String parent_icon = driver.getWindowHandle();
				for(String window_icon: driver.getWindowHandles()) {
					if(!window_icon.equals(parent_icon)) {
						driver.switchTo().window(window_icon);
						driver.close();
				}		
		}
				driver.switchTo().window(parent_icon);
		}
	@Test(priority = 4)
	void Test4_GetFreeQuote_Test() throws InterruptedException, IOException {
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
		}
	@Test(priority=6)
	void Test6_StockTrading_Test() throws InterruptedException, IOException {
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
	}
	@Test(priority=7)
	void Test7_PaperTrading_Test() throws InterruptedException, IOException {
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
		
		
	}
	@Test(priority=8)
	void Test8_CFDTradingPage_Test() throws InterruptedException {
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
		driver.navigate().back();
		
	}
				
		//Clicking on explore button
	/*	driver.findElement(By.xpath("(//a[text()='Explore More'])[1]")).click();
		System.out.println("Navigated to explore button");
		driver.navigate().back();*/
				
		//driver.quit();
}


