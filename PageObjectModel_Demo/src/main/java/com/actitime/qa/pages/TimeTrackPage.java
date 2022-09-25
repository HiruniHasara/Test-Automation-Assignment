package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage extends TestBase  {

    @FindBy(xpath = "//td[@class='pagetitle']")
    WebElement pageTitleTag;

    @FindBy(xpath = "//*[@id=\"approveTTTable\"]/tbody[2]/tr[1]/td[7]/input")
    WebElement checkBox;

    @FindBy(xpath = "//span[@id='approveButton']")
    WebElement approveButton;

    @FindBy(xpath = "//*[@id=\"approveTTTable\"]/tbody[2]/tr[2]/td[2]/span")
    WebElement status;

    //initialization

    public TimeTrackPage() {

        PageFactory.initElements(driver, this);
    }

    public Boolean validateTitle() {

        String title = pageTitleTag.getText();
        if(title.equals("Approve Time-Track")){
            return true;
        }else{
            return false;
        }
    }


    public Boolean approveTimeTrack() {
        checkBox.click();
        boolean flag = approveButton.isEnabled();
        if(flag){
            approveButton.click();
            return flag;
        }else {
            return flag;
        }
    }


}
