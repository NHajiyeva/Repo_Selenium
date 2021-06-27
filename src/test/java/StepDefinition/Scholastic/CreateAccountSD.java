package StepDefinition.Scholastic;

import Pages.Scholastic.CreateAccountPOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateAccountSD {
    @When("I click on create an account button")
    public void clickCreateAccountButton() {
        CreateAccountPOM ca = new CreateAccountPOM();
        ca.clickCreateAnAccountButton();
    }

    @And("And I choose teacher")
    public void clickTeacherAccountButtton() {
        CreateAccountPOM ca = new CreateAccountPOM();
        ca.clickTeacherAccountButton();
    }

    @And("I click next button")
    public void clickNextButton() {
        CreateAccountPOM ca = new CreateAccountPOM();
        ca.clickNextButtonLocator();
    }


}
