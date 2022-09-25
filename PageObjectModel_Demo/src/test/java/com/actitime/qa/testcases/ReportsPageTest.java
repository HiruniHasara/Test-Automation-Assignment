package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.ReportsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportsPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ReportsPage reportsPage;

	public ReportsPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		reportsPage = homePage.clickOnReportsLink();

	}
	
	
	@Test(priority = 1)
	public void reportsPageTitleTest() {
		
		boolean flag= reportsPage.validateTitle();
		Assert.assertTrue(flag);
		
	}

	@Test(priority = 2)
	public void viewLeavesReportTest() {

		Boolean flag= reportsPage.viewLeavesReport();
		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void lookForLeavesReportTest() {

		Boolean flag= reportsPage.lookForLeavesReport();
		Assert.assertTrue(flag);

	}


	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
