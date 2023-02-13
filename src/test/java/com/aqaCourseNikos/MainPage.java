package com.aqaCourseNikos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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

        String getText = "";

        getText = driver.findElement(By.xpath("(//div[@class='card-body']//p)[2]")).getText();
        System.out.println(getText);

        driver.findElement(By.linkText("Forgotten Password")).click();
        String forgotPass = "";
        forgotPass = driver.getTitle();

        if(forgotPass.contentEquals(forgotPass)){
            System.out.println("Tittle is correct");
        }else{
            System.out.println("Title isn't correct");
        }

        driver.findElement(By.partialLinkText("Add")).click();







    }

}
