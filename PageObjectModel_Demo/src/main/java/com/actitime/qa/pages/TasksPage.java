package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends TestBase {

    @FindBy(xpath = "//div[@id='logo_aT']")
    WebElement actitimeLogo;


    public TasksPage () {

        PageFactory.initElements(driver, this);
    }

    public Boolean validateActiTimeLogo() {

        return actitimeLogo.isDisplayed();
    }
}
