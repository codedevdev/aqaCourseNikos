package com.aqaCourseNikos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";
        String firstName = "Joker";
        String lastName = "Eneken";
        String phone = "304053903";
        String email = "test@gmail.com";
        String Adress = "Washington str, kulpor";
        String state = "DC";
        String postalCode = "23412";
        String userName = "Twinki";
        String pass = "qwopzxnm20";


        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.findElement(By.name("firstName")).sendKeys(firstName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.name("userName")).sendKeys(email);
        driver.findElement(By.name("adress1")).sendKeys(Adress);
        driver.findElement(By.name("city")).sendKeys("London");
        driver.findElement(By.name("state")).sendKeys(state);
        driver.findElement(By.name("postalCode")).sendKeys(postalCode);
        Select countrySelect = new Select(driver.findElement(By.cssSelector("html>body>div:nth-of-type(2)>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(4)>td>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(5)>td>form>table>tbody>tr:nth-of-type(7)>td:nth-of-type(2)>input")));
        countrySelect.selectByVisibleText("UKRAINE");
        driver.findElement(By.name("email")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.name("confirmPassword")).sendKeys(pass);
        driver.findElement(By.name("submit")).click();





    }

}
