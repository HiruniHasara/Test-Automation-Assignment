package com.actitime.qa.testcases;

import com.actitime.qa.pages.ReportsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ReportsPage reportsPage;
	public HomePageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
	
	@Test(priority = 1)
	public void homePageLogoTest() {
		
	boolean flag= homePage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the Logo");
		
	}

	@Test(priority = 2)
	public void homePageTaskLinkTest() {

		homePage.clickOnTaskLink();

	}

	@Test(priority = 2)
	public void homePageUsersLinkTest() {

		homePage.clickOnUsersLink();

	}

	@Test(priority = 2)
	public void homePageReportsLinkTest() {

		homePage.clickOnReportsLink();

	}

	@Test(priority = 2)
	public void homePageTimeTrackLinkTest() {

		homePage.clickOnTimeTrackLink();

	}

	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
