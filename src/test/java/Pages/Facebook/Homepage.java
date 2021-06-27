package Pages.Facebook;

import DriverWrapper.WebCommands;
import org.openqa.selenium.By;

public class Homepage extends WebCommands {

    // WebCommands webCommands = new WebCommands();

    // Locators of Home page webElements
    By loginEmailLocator = By.id("email");
    By loginPassLocator = By.id("pass");
    By loginButtonLocator = By.tagName("button");




    // Method which user will use in testcase to interact with Homepage webElements
    public void typeLoginEmail(String loginEmail) {
        type(loginEmailLocator, loginEmail);
    }

    public void typeLoginPassword(String loginPwd) {
        type(loginPassLocator, loginPwd);
    }

    public void clickLoginButton() {
        clickThis(loginButtonLocator);
    }


}