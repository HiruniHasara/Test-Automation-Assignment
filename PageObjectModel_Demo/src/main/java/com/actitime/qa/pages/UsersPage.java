package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase  {

    @FindBy(xpath = "//div[@id='logo_aT']")
    WebElement actitimeLogo;

    @FindBy(xpath = "//div[@class='userList_manageButtons_component_manageGroupsButton']")
    WebElement departmentsButton;

    @FindBy(xpath = "//div[@id='groupManagementLightBox']")
    WebElement employeeManagementPanel;

    //initialization

    public UsersPage() {

        PageFactory.initElements(driver, this);
    }

    public Boolean validateActiTimeLogo() {

        return actitimeLogo.isDisplayed();
    }

    public Boolean viewEmployeesByDepartment() {

        departmentsButton.click();
        return employeeManagementPanel.isDisplayed();
    }

}
