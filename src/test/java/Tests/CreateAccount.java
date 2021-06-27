package Tests;

import DriverWrapper.Web;
import Pages.Scholastic.CreateAccountPOM;
import org.testng.annotations.Test;

public class CreateAccount {
    @Test
    public void createNewAccount() {
        CreateAccountPOM ca = new CreateAccountPOM();
        Web web = new Web();
        web.openUrl2("https://clubs3qa1.scholastic.com/");

        ca.clickCreateAnAccountButton();
        ca.clickTeacherAccountButton();
    }
}
