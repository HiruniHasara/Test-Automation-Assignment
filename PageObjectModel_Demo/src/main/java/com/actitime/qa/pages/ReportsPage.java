package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage extends TestBase  {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/table[1]/tbody/tr[1]/td[2]")
    WebElement pageTitle;

    @FindBy(xpath = "//*[contains(text(),'Leave hours by Users')]")
    WebElement leavesReportSection;

    @FindBy(xpath = "//div[@id='createChartLightbox']")
    WebElement leavesChart;

    @FindBy(xpath = "//td[@id='ext-gen127']")
    WebElement chartButton;

    //initialization

    public ReportsPage() {

        PageFactory.initElements(driver, this);
    }

    public Boolean validateTitle() {

        return pageTitle.isDisplayed();
    }


    public Boolean viewLeavesReport() {

        leavesReportSection.click();
        return leavesChart.isEnabled();
    }


    public Boolean lookForLeavesReport() {

        chartButton.click();
        return leavesChart.isEnabled();
    }


}
