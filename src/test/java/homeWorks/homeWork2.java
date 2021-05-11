package homeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homeWork2 {

    @Test
    public void practical() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazrin\\Documents\\git\\Repo_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String emailId = "email";
        By emailLocator = By.id(emailId);
        WebElement emailBox = driver.findElement(emailLocator);
        emailBox.sendKeys("myemail@gmail.com");

        // driver.findElement(By.id("email")).sendKeys("abcd@test.com");

        String passName = "pass";
        By passLocator = By.name(passName);
        WebElement passBox = driver.findElement(passLocator);
        passBox.sendKeys("passw0rd");

        String logIn = "Log In";
        By logInLocator = By.linkText(logIn);
        WebElement logInButton = driver.findElement(logInLocator);
        logInButton.click();

        driver.close();
    }


    @Test
    public void createNewAccount() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazrin\\Documents\\git\\Repo_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String createAccountText = "Create New Account";
        By accountTextLocator = By.linkText(createAccountText);
        WebElement createAccountButton = driver.findElement(accountTextLocator);
        createAccountButton.click();

        try {
            Thread.sleep(5000);
        } catch (NoSuchElementException | InterruptedException e) {
            e.printStackTrace();
        }

        String firstName = "firstname";
        By firstNameLocator = By.name(firstName);
        WebElement firstNameBox = driver.findElement(firstNameLocator);
        firstNameBox.sendKeys("First");

        String lastName = "lastname";
        By lastNameLocator = By.name(lastName);
        WebElement lastNameBox = driver.findElement(firstNameLocator);
        lastNameBox.sendKeys("Last");


        String phoneNumber = "reg_email__";
        By phoneNumberLocator = By.name(phoneNumber);
        WebElement phoneNumberBox = driver.findElement(phoneNumberLocator);
        phoneNumberBox.sendKeys("9898787800");


        String password = "reg_passwd__";
        By passwordLocator = By.name(password);
        WebElement passwordBox = driver.findElement(passwordLocator);
        passwordBox.sendKeys("passw0rd@123");

        try {
            Thread.sleep(5000);
        } catch (NoSuchElementException | InterruptedException e) {
            e.printStackTrace();
        }

        String singUp = "websubmit";
        By singUpLocator = By.name(singUp);
        WebElement signUpButton = driver.findElement(singUpLocator);
        signUpButton.click();

        driver.close();


    }
}


