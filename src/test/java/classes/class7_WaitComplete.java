package classes;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

public class class7_WaitComplete {


    @Test
    public void waitComplete() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        /**
         *
         * Timeout: max time driver will wait (30 seconds)
         * Polling Period: Time after will driver will try to find the webElement again (1 second)
         *
         * driver.FindElelemnt() 9:00:00pm
         * wait for polling period (1 sec)
         * driver.FindElelemnt() 9:00:01pm
         * wait for polling period (1 sec)
         * driver.FindElelemnt() 9:00:02pm
         *
         * ..
         * ..
         * wait for polling period (1 sec)
         * driver.FindElelemnt() 9:00:30pm
         * NoSuchElement exception
         *
         */

        /**
         * Types:
         * 1. Implicit Wait
         * 2. Explicit Wait
         * 3. Fluent Wait
         */

        /**
         * Implicit Wait:
         * (like, changing the settings in the driver)
         * Wait for a certain amount time before throwing NoSuchElementException;
         * and stop waiting as soon the element is found.
         *
         * Implicit uses default polling period: 250ms
         *
         */

//        driver.findElement(By.id("email2")).sendKeys("abcd");
//        driver.findElement(By.id("email2")).sendKeys("abcd"); // 8 sec
//        driver.findElement(By.id("email3")).sendKeys("abcd"); // 4 sec
//        driver.findElement(By.id("email4")).sendKeys("abcd");

        /**
         * Explicit Wait
         * Wait for a certain amount of time until the specified condition is/are met
         * As soon as the condition(s) is/are met, stop waiting and move ahead in code.
         *
         * Timeout is always in Seconds unit
         * Polling period: 500ms
         *
         */
//        WebDriverWait eWait = new WebDriverWait(driver, 20);
//        eWait.until(ExpectedConditions.titleIs("Facebook"));


//        eWait.until(ExpectedConditions.and(
//                ExpectedConditions.alertIsPresent(),
//                ExpectedConditions.titleContains("Facebook")
//            )
//        );

//        eWait.until(ExpectedConditions.or(
//                ExpectedConditions.alertIsPresent(),
//                ExpectedConditions.titleContains("Facebook")
//            )
//        );

        /**
         *  Fluent Wait
         *
         *  Wait for a certain amount of time until the element is found or condition(s) is met
         *  when waiting timeout is over, throws TimeOutException
         *
         *  user can
         *      define the polling period
         *      ignore the specific exception(s) during the wait time
         *      put a custom error message to display when timeout is over.
         *
         */
        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");

        WebElement ele = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id(""));
            }
        });

        // to use fluent wait with Explicit conditions
        fWait.until(ExpectedConditions.elementToBeClickable(By.id("")));


    }
}

