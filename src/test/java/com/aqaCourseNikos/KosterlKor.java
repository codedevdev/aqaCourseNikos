package com.aqaCourseNikos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class KosterlKor {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();



        String baseUrl = "https://demo.guru99.com/popup.php";

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]")).click();
        String Main = driver.getWindowHandle();

        Set<String> allWind = driver.getWindowHandles();
        Iterator<String> allWind2 = allWind.iterator();

        while (allWind2.hasNext()) {
            String ChildWind = allWind2.next();
            if (!Main.equalsIgnoreCase(ChildWind)) {

                driver.switchTo().window(ChildWind);
                driver.findElement(By.name("emailid")).sendKeys("joe43ker@test.com");
                driver.findElement(By.name("btnLogin")).click();
                driver.close();
            }

            driver.switchTo().window(Main);

        }
    }
}
