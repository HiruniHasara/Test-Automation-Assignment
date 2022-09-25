package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.TimeTrackPage;
import com.actitime.qa.pages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeTrackPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TimeTrackPage timeTrackPage;
	public TimeTrackPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		timeTrackPage = homePage.clickOnTimeTrackLink();

	}
	
	
	@Test(priority = 1)
	public void timeTrackPageTitleTest() {

		Boolean flag= timeTrackPage.validateTitle();
		Assert.assertTrue(flag);

	}


	@Test(priority = 2)
	public void approveTimeTrackTest() {

		Boolean flag= timeTrackPage.approveTimeTrack();
		Assert.assertTrue(flag);

	}


	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
