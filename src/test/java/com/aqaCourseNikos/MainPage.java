package com.aqaCourseNikos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:/Lessons/aqaCourseNikos/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String expectedTitle = "Your Store";
        String actTitle = "";
        String baseUrl = "https://prct.arkturko.space";


        driver.get(baseUrl);

        actTitle = driver.getTitle();

        if(actTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed!");
        }

        String tagName = "";

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("(//a[@class='dropdown-item'])[2]")).click();
        tagName = driver.findElement(By.id("input-email")).getTagName();
        System.out.println(tagName);


        // 



    }

}
