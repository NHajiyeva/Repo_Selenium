package classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class class6_MultipleWindows {

    @Test
    public void multipleWindows() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * Method to get the window stored in driver
         *
         * Method: getWindowHandle()
         * return type: String
         */

        String currentHandle = driver.getWindowHandle();

        System.out.println("Current handle: " + currentHandle);

        /**
         * Method to get ALL window handles of windows launched due to automation
         *
         * Method: getWindowHandles()
         * return type: Set<String>
         */
        Set<String> allHandles = driver.getWindowHandles();

        System.out.println("All handles: " + allHandles);

        /**
         * To change/switch the handle value in driver.
         *
         * method: switchTo().window()
         * input: String (newHandle)
         *
         */
        for (String handle : allHandles) {
            if (!handle.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(handle);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.close();
            }
        }

        driver.switchTo().window(currentHandle);


    }
}
