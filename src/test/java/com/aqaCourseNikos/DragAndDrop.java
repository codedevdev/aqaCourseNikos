package com.aqaCourseNikos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class DragAndDrop {

    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String baseUrl = "https://prct.arkturko.space/";
        driver.get(baseUrl);

        WebElement butt_home = driver.findElement(By.xpath("(//button[@formaction='https://prct.arkturko.space/index.php?route=checkout/cart|add&language=en-gb'])[3]"));
        WebElement camerasCategory = driver.findElement(By.name("search"));
        
        Actions builder = new Actions(driver);

        Action seriesOfAction = builder
                .moveToElement(camerasCategory)
                .click()
                .keyDown(camerasCategory, Keys.SHIFT)
                .sendKeys(camerasCategory, "koker")
                .doubleClick(camerasCategory)
                .contextClick()
                .build();
        seriesOfAction.perform();

    }

}
