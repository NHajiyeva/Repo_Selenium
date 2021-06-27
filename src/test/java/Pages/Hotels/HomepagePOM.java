package Pages.Hotels;

import DriverWrapper.WebCommands;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomepagePOM extends WebCommands {

    By closePopUpWindow = By.xpath("//button[@aria-label='Close overlay']");
    By checkInCalendarButton = By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/form/div[2]/div[1]/button/div/span[1]");
    By destinationSection = By.xpath("//button[@class='_1yFrqc']");
    // By boraBora = By.xpath("//div[@class='_3oGbmD']");
    By boraBora = By.xpath("//section[@class='modal-bd in-viewport-root']//button//span");
    By guestButton = By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/form/div[2]/div[2]/button/span[2]/span[2]");

    By addAdult = By.xpath("//select[@name='q-room-0-adults']");
    By addChildren = By.xpath("//select[@name='q-room-0-children']");

    By childAge1locator = By.xpath("//select[@name='q-room-0-child-0-age']");
    By childAge2locator = By.xpath("//select[@name='q-room-0-child-1-age']");


    By roomPopUpGuestCount = By.xpath("//div[@class='_1sygyM']");
    By adultSelectedTotal = By.xpath("//div[@class='_1VHBgw']");
    By childSelectedTotalLocator = By.xpath("//div[@class='_1VHBgw']");
    By guestApplyButtonLocator = By.xpath("//button[@class='_3pFoIe']");

    By allGuestsTotalLocator = By.xpath("//span[@class='rIhyt1']");
    By nextCalendarButtonLocator = By.xpath("//button[@aria-label='Next']");
    By calendarApplyButtonLocator = By.xpath("//button[@class='_3pFoIe']");
    By searchButtonLocator = By.xpath("//div[@class='_1RDbO5']");

    By changeDatesLocator = By.xpath("//button[@aria-label='Change dates']");
    By checkInDate = By.xpath("//div[@class='_2U8Hy7']");


    public void closePopUpWindow() {
        clickThis(closePopUpWindow);
    }

    public void clickCheckInCalendar() {
        clickThis(checkInCalendarButton);
    }

    public void typeDestinationSection(String destination) {
        type(destinationSection, destination);
    }

    public void clickDestinationSection() {
        clickThis(destinationSection);
    }

    public void chooseFromAutosuggestion() {
        selectFromAutoSuggestion(boraBora, "Bora Bora");
    }

    public void clickOnGuestButton() {
        clickThis(guestButton);
    }

    public void addAdultButton(String adultNum) {
        selectFromDropdown(addAdult, adultNum);
    }

    public void addChildren(String childNum) {
        selectFromDropdown(addChildren, childNum);
    }

    public void addChildAge1(String childAge1) {
        selectFromDropdown(childAge1locator, childAge1);
    }

    public void addChildAge2(String childAge2) {
        selectFromDropdown(childAge2locator, childAge2);
    }

    public void questsCountVerification() {
        Assert.assertEquals(String.valueOf(roomPopUpGuestCount), adultSelectedTotal, childSelectedTotalLocator);
    }

    public void clickGuestApplyButton() {
        clickThis(guestApplyButtonLocator);
    }

    public void allGuestsCountVerification() {
        Assert.assertEquals(allGuestsTotalLocator, adultSelectedTotal);
    }

    public void clickNextCalendarButton(int click) {

        for (int i = 0; i < click; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickThis(nextCalendarButtonLocator);
        }
    }

    public void clickCalendarApplyButton() {
        clickThis(calendarApplyButtonLocator);
    }

    public void clickSearchButton() {
        clickThis(searchButtonLocator);
    }

    public void changeDatesVerification() {
        isElementDisplayed(changeDatesLocator);
    }

    public void scrollToEndOfPage() {
        scrollToBottom();
    }


}
