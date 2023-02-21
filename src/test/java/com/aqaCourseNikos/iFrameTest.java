package com.aqaCourseNikos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameTest {

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String title = "Guru";
        // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demos.telerik.com/kendo-ui/datepicker/index");

        



    }

}
