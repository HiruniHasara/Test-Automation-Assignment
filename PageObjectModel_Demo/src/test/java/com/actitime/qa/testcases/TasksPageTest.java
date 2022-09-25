package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.TasksPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TasksPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TasksPage tasksPage;
	public TasksPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		tasksPage = homePage.clickOnTaskLink();

	}
	
	
	@Test(priority = 1)
	public void tasksPageLogoTest() {
		
		boolean flag= tasksPage.validateActiTimeLogo();
		Assert.assertTrue(flag);
		
	}


	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
