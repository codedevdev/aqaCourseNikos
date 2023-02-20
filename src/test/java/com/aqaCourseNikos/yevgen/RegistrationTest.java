package com.aqaCourseNikos.yevgen;

import org.assertj.core.error.ShouldBeEqualIgnoringSeconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedrwr\\chromedrwr\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //String baseUrl = "https://auth.adm.tools/";
        String baseUrl = "https://prct.arkturko.space/";

        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


            driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();

            driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[1]/a")).click();
            String firstName = "yevgen";
            String lastName = "oleksandrovich";
            String email = "yevgen@gmail.com";
            String pswrd = "123456789";
            String titleOkRegister = "Your Account Has Been Created!";


            driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(firstName);
            driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(lastName);
            driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pswrd);



            driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
            driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        /*    driver.getTitle().equalsIgnoreCase(titleOkRegister);
        System.out.println(titleOkRegister);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();*/

Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();

        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[2]/a")).click();

 /*       driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(lastName);*/
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pswrd);
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
        //driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).sendKeys(pswrd);

            String actAccount = "My Account";
            String expectedTitle = "";
            driver.getTitle();
            if (actAccount != expectedTitle){
                System.out.println(expectedTitle);
            }




    }
}
