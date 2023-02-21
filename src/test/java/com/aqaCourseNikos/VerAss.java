package com.aqaCourseNikos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerAss {

    public static void main(String[] args) {


        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        SoftAssertions softAssert = new SoftAssertions();
        driver.manage().window().maximize();
        String eTitle = "Guru99 Payment Gateway";
        // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/payment-gateway/index.php");
        String aTitle = driver.getTitle();

    }
}
