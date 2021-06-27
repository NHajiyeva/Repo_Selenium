package StepDefinition.Hotels;

import Pages.Hotels.HomepagePOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalendarSD {
    @When("I click on check in calendar")
    public void clickCheckInCalendar() {
        HomepagePOM hp = new HomepagePOM();
        hp.clickCheckInCalendar();
    }

    @Then("I verify that I am unable to click the past dates")
    public void verifyPastDatesUnable() {
        HomepagePOM hp = new HomepagePOM();

    }

    @Then("I verify that I am unable to click back button")
    public void verifyBackButtonNotClickable() {
        HomepagePOM hp = new HomepagePOM();
    }

    @When("I click on guests")
    public void clickOnGuests() {
        HomepagePOM hp = new HomepagePOM();
        hp.clickOnGuestButton();
    }

    @And("I select adults as '(.*)'")
    public void selectAdultCount(String adultCount) {
        HomepagePOM hp = new HomepagePOM();
        hp.addAdultButton(adultCount);
    }

    @And("I select children as '(.*)'")
    public void selectChildCount() {
        HomepagePOM hp = new HomepagePOM();

    }

    @And("I select first child age as '(.*)'")
    public void addFirstChildAge() {
        HomepagePOM hp = new HomepagePOM();

    }

    @And("I select second child age as '(.*)'")
    public void addSecondChildAge() {
        HomepagePOM hp = new HomepagePOM();

    }

    @And("I click apply button")
    public void clickGuestApplyButton() {
        HomepagePOM hp = new HomepagePOM();
        hp.clickGuestApplyButton();
    }

    @Then("I verify that total number of guests are same as selected")
    public void totalNumberGuestsVerification() {
        HomepagePOM hp = new HomepagePOM();

    }

    @Then("I verify on rooms pop-up that number of adults as children are same as selected")
    public void roomPopUpNumberVerification() {
        HomepagePOM hp = new HomepagePOM();
        hp.questsCountVerification();
    }

    @When("I enter '(.*)' in destination")
    public void enterDestination() {
        HomepagePOM hp = new HomepagePOM();

    }

    @And("I select '(.*)' from auto suggestion")
    public void selectDestinationFromAutosggestion() {
        HomepagePOM hp = new HomepagePOM();

    }

    @And("I select '(.*)' as check in date")
    public void selectCheckInDate() {
        HomepagePOM hp = new HomepagePOM();

    }

    @And("I select '(.*)' as check out date")
    public void selectCheckOutDate() {
        HomepagePOM hp = new HomepagePOM();

    }

    @And("I click apply")
    public void clickCalendarApply() {
        HomepagePOM hp = new HomepagePOM();
        hp.clickCalendarApplyButton();
    }

    @And("I click on search button")
    public void clickOnSearchButton() {
        HomepagePOM hp = new HomepagePOM();
        hp.clickSearchButton();
    }

    @Then("I verify that change dates button appears at the end of the results")
    public void changeDatesAppearanceVerification() {
        HomepagePOM hp = new HomepagePOM();
        hp.changeDatesVerification();
    }

}

