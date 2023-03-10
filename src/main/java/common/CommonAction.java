package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

// import static constants.Constants.timeoutVariable.IMPLICITY_WAIT;


public class CommonAction {

    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch("CHROME"){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                Assertions.fail("We have a problem with browser spec");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
        return driver;
    }

}
