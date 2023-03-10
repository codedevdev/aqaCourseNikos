package com.aqaCourseNikos.Pages;

import com.aqaCourseNikos.Base.BaseTest;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testExmpl(){
        basePage.gotoURL("https://prct.arkturko.space/");
        logPage.buyProduct();
    }

}
