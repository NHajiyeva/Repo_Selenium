package Pages.Scholastic;

import DriverWrapper.WebCommands;
import org.openqa.selenium.By;

public class SignInPOM extends WebCommands {
    By signInAccountLocator = By.xpath("//a[@class='signin pureguest dialog-close disable-autoplay signin-myscholastic']");
    By signInEmailLocator = By.id("user-text-field");
    By continueButton = By.id("signin-email-submit-button");

    By signInPasswordLocator = By.id("password-text-field");
    By signInButtonAfterPasswordInput = By.id("password");

    By enterOrdersLocator = By.id("enter-orders");
    By sfoLocator = By.id("student-flyer-orders");
    By studentNameLocator = By.id("student-name");
    By itemNumberLocator = By.id("item-number");
    By addButtonLocator = By.id("btn-add");
    String signInString = "iframeMyScholastic";
    By sfoError = By.id("error-message-tooltip");

    public void clickSignInButton() {clickThis(signInAccountLocator);}

    public void typeSignInEmail(String signInEmail){type(signInEmailLocator, signInEmail);}

    public void clickContinueButton() {clickThis(continueButton);}

    public void switchToSignInWindow() {switchToWindow(signInString);}

    public void typeSignInPassword(String signInPassword) {type(signInPasswordLocator, signInPassword);}

    public void clickSignInButtonAfterPasswordInput() {clickThis(signInButtonAfterPasswordInput);}

    public void scrollToEnterOrders() {moveMouseOverElement(enterOrdersLocator);}

    public void clickSFO() {clickThis(sfoLocator);}

    public void typeStudentName(String studentsName){type(studentNameLocator,studentsName);}

    public void typeItemNumber(String itemNumber){type(itemNumberLocator,itemNumber);}

    public void clickAddButton() {clickThis(addButtonLocator);}





}
