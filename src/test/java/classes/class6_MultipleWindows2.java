package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class class6_MultipleWindows2 {

    @Test
    public void multipleWindows() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.linkText("Facebook Pay")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // switch on the Facebook Pay window
        String fbHandle = driver.getWindowHandle();             // fbHandle

        Set<String> allHandles = driver.getWindowHandles();     // [fbHandle, fbPayHandle]

        for (String handle : allHandles) {
            if (!handle.equalsIgnoreCase(fbHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1100);");   // scroll downward 800 pixels

        driver.findElement(By.id("home_fbpay-on-fb_learn-more")).click();


    }
}

