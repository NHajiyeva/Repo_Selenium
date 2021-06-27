package Tests;

import DriverWrapper.Web;
import Pages.Facebook.Homepage;
import org.testng.annotations.Test;

public class Login {

    @Test
    public void verifyInvalidCredentials() {

        Homepage hpage = new Homepage();

        // Open facebook.com
        Web web = new Web();
        web.openUrl();

        hpage.typeLoginEmail("invalid@gmail.com");
        hpage.typeLoginPassword("invalid");
        hpage.clickLoginButton();

        // verify error


    }



}