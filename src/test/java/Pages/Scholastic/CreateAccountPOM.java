package Pages.Scholastic;

import DriverWrapper.WebCommands;
import org.openqa.selenium.By;

public class CreateAccountPOM extends WebCommands {
    By createAccountButtonLocator = By.className ("create-account-trigger");
    By teacherAccountButtonLocator = By.id("acccountTeacther");
    By nextButtonLocator = By.id("linkChooseAcount");

    By titleLocator = By.className("selected-option input-select profile-title required selected-active");
    By titleMrsLocator = By.xpath("");

    By firstNameLocator = By.className("input-text username no-mouseflow required error");
    By lastNameLocator = By.className("input-text username no-mouseflow required error");
    By emailLocator = By.className("input-text email no-mouseflow required valid");
    By passwordLocator = By.className("input-text validatepassword no-mouseflow required valid");
    By phoneNumberLocator = By.className("input-text formatphone numericonly custom-placeholder no-mouseflow phone");

    By termsAgreeButtonLocator = By.className("input-checkbox  required");
    By nextButtonAfterAccountDetailsLocator = By.className("button-continue");

    By stateLocator = By.className("selected-option input-select selected-active");
    By cityLocator = By.className("input-text ui-autocomplete-input valid");
    By searchButtonLocator = By.className("button-continue");

    By schoolNameLocator = By.className("input-text ui-autocomplete-input");
    By nextButtonContinueSchoolSearchLocator = By.className("next-button button-continue school-search");

    By roleSearchLocator = By.className("dialog-content ui-dialog-content ui-widget-content");
    By gradeLocator = By.className("selected-option input-select noscroll");
    By numberOfStudentsLocator = By.className("input-text numericonly valid");
    By nextButtonAfterNumberOfStudentsLocator = By.className("next-button button-continue");

    By preferredReadingLevelSystemLocator = By.className("selected-option input-select required");
    By continueToSiteButtonLocator = By.xpath("//button[text()='CONTINUE TO SITE']");

    public void clickCreateAnAccountButton() {clickThis(createAccountButtonLocator);}

    public void clickTeacherAccountButton() {clickThis(teacherAccountButtonLocator);}

    public void clickNextButtonLocator() {clickThis(nextButtonLocator);}

    public void chooseTitle()
    {clickThis(titleLocator);
    }
}
