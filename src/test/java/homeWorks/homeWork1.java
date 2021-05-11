package homeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class homeWork1 {

    @Test
    public void launchPage() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazrin\\Documents\\git\\Repo_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.manage().window().maximize();
        driver.get(url);

        String pageTitle = driver.getTitle();
        String expPageTitle = "Facebook - log in or sign up";

        Assert.assertEquals(pageTitle.toLowerCase(Locale.ROOT), expPageTitle.toLowerCase(Locale.ROOT), "Page title is not equal after ignoring cases");
        Assert.assertTrue(pageTitle.equalsIgnoreCase(expPageTitle), "Page title is not equal after ignoring cases");
        Assert.assertEquals(pageTitle, expPageTitle, "Page title is not appearing as expected");

        String pageUrl = driver.getCurrentUrl();

        driver.close();
    }
}
