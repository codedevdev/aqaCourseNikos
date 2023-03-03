package com.aqaCourseNikos.Base;

import common.CommonAction;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static common.Config.HOLD_BROWSER;

public class BaseTest {


    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);

    @AfterAll
    void close(){
        if(!HOLD_BROWSER){
            driver.close();
        }
    }

}
