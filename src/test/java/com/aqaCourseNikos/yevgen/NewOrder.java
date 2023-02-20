package com.aqaCourseNikos.yevgen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import static org.apache.tika.mime.MediaType.*;


public class NewOrder extends RegistrationTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedrwr\\chromedrwr\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*String baseUrl = "https://prct.arkturko.space/index.php?route=account/account&language=en-gb&customer_token=ef4a6ab9ccdd7d092c74d83ba7";

                driver.get(baseUrl);

                driver.manage().window().maximize();

        String email = "yevgen@gmail.com";
        String pswrd = "123456789";
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pswrd);
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actAcountTitle = "My Account";
        String title = driver.getTitle();
        if (actAcountTitle!=title){
            System.out.println("you are not on account page, please try again" + " \n") ;
        }else {
            System.out.println( "your title is " + title);
        }*/

        /*driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a")).click();*/


       /* String searchText = "mac";


        driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();


        driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[3]/form/div/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"input-search\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-search\"]")).sendKeys(searchText);
        driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();

        String orderTitle = "MacBook Air";
        String actOrderTitle = driver.getTitle();
        if (orderTitle!=actOrderTitle){
            driver.findElement(By.xpath("//*[@id=\"product-info\"]/ul/li[1]")).click();
        }*/


                    // get te next test page
                String orderUrl = "https://prct.arkturko.space/";
                driver.get(orderUrl);
        driver.manage().window().maximize();

Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/h4/a")).click();
                String macBook = "MacBook";
                // check title
                String actNameMacBook = driver.getTitle();
                if (macBook!=actNameMacBook){
                    System.out.println("your text H2 is incorrect" + "\n" + "please tell about your JS Developers");
                }else {
                    System.out.println("your title is current of this page");
                }

        String imgUrl = "\"https://prct.arkturko.space/image/cache/catalog/demo/macbook_1-500x500.jpg\"";
    Thread.sleep(2000);
        String actUrlImage = driver.getCurrentUrl();
                    if (imgUrl!=actUrlImage){
                        System.out.println("check image");
                    }else {
                        System.out.println("actual image");
                    }

                    driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[4]/a/i")).click();
                    String productName = "Product Name ";
                    driver.findElement(By.xpath("//*[@id=\"shopping-cart\"]/div/table/thead/tr/td[2]")).equals(productName);
                    Thread.sleep(5000);
            driver.quit();
            }

        }












