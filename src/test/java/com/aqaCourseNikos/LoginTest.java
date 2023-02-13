package com.aqaCourseNikos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","F:/Lessons/aqaCourseNikos/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://prct.arkturko.space/";


        driver.get(baseUrl);
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("qwopzxnm10");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();



    }


}
