package com.aqaCourseNikos.yevgen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedrwr\\chromedrwr\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //String baseUrl = "https://auth.adm.tools/";
        String baseUrl = "https://prct.arkturko.space/stores/";

        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //check
        String mail = "test@gmail.com";
        String pswrd = "qwopzxnm10";

        driver.findElement(By.name("username")).sendKeys(mail);
        driver.findElement(By.name("password")).sendKeys(pswrd);
        Thread.sleep(5000);

        //change language to ukraine
        //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();

          //  driver.findElement(By.xpath(" //*[@id=\"form_content\"]/div[1]/div[1]/div/div[2]/a")).click();











    }
}
