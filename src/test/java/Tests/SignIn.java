package Tests;

import DriverWrapper.Web;
import Pages.Scholastic.CreateAccountPOM;
import Pages.Scholastic.SignInPOM;
import Utils.TestConstant;
import org.testng.annotations.Test;

import java.util.concurrent.TimeoutException;

public class SignIn {
    @Test
    public void signIn () {
        SignInPOM si = new SignInPOM();
        Web web = new Web();
        web.openUrl2("https://clubs3qa1.scholastic.com/");


        si.clickSignInButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        si.typeSignInEmail("nazrinhajiyevaa@gmail.com");
        si.clickContinueButton();
        si.typeSignInPassword("scholastic5");
        si.clickSignInButtonAfterPasswordInput();
    }

    @Test
    public void invalidItemError () {
        SignInPOM si = new SignInPOM();
        Web web = new Web();
        web.openUrl2("https://clubs3qa1.scholastic.com/");


        si.clickSignInButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        web.switchToSignInWindow();
        si.typeSignInEmail("nazrinhajiyevaa@gmail.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        si.clickContinueButton();
        si.typeSignInPassword("Carpediem5");
        si.clickSignInButtonAfterPasswordInput();
        si.scrollToEnterOrders();
        si.clickSFO();
        si.typeStudentName("Harry");
        si.typeItemNumber("111111");
        si.clickAddButton();

    }
}
