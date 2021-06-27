package Tests.Hotels;

import DriverWrapper.Web;
import Pages.Hotels.HomepagePOM;
import org.testng.annotations.Test;

public class Calendar {
    @Test
    public void totalGuestVerification() {
        HomepagePOM hp = new HomepagePOM();
        Web web = new Web();
        web.openUrl2("https://hotels.com/");
        hp.threadSleep(3000);
    //  hp.closePopUpWindow();
        hp.clickOnGuestButton();
        hp.addAdultButton("4");
        hp.addChildren("2");
        hp.addChildAge1("4");
        hp.addChildAge2("<1");
        hp.questsCountVerification();

    }

    @Test
    public void changeDatesButtonVerification() {
        HomepagePOM hp = new HomepagePOM();
        Web web = new Web();
        web.openUrl2("https://hotels.com/");
        hp.threadSleep(3000);
        // hp.closePopUpWindow();
        hp.typeDestinationSection("Bora Bora");
        hp.chooseFromAutosuggestion();
        hp.clickCheckInCalendar();
        hp.clickNextCalendarButton(3);
        hp.threadSleep(2000);
        hp.clickCalendarApplyButton();
        hp.clickSearchButton();
        hp.threadSleep(2000);
        hp.scrollDownByPixel(1500);
        hp.threadSleep(2000);
        hp.scrollDownByPixel(1500);
        hp.threadSleep(2000);
        hp.scrollDownByPixel(2000);
        hp.changeDatesVerification();

    }
}



