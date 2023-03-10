package com.aqaCourseNikos.Base;

import common.CommonAction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;


import static common.Config.HOLD_BROWSER;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage logPage = new LoginPage(driver);

    @AfterAll
    void close(){
        if(!HOLD_BROWSER){
            driver.close();
        }
    }

}
