package StepDefinition.Facebook;

import DriverWrapper.Web;
import Pages.Facebook.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LoginSD {

    @When("I enter '(.*)' in email")
    public void enterLoginEmail(String email) {
        Homepage hp = new Homepage();
        hp.typeLoginEmail(email);
    }

    @And("I enter '(.*)' in password")
    public void enterLoginPassword(String password) {
        Homepage hp = new Homepage();
        hp.typeLoginPassword(password);
    }

    @And("I click on login button")
    public void clickLoginButton() {
        Homepage hp = new Homepage();
        hp.clickLoginButton();
    }

    @And("I am on facebook homepage")
    public void openFacebook() {
        Web web = new Web();
        web.openUrl();
    }

}