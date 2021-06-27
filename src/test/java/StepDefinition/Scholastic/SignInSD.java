package StepDefinition.Scholastic;


import Pages.Scholastic.SignInPOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SignInSD {
    @When("I click sign in button")
    public void clickSignInButton() {
        SignInPOM si = new SignInPOM();
        si.clickSignInButton();
    }
    @And("I enter 'nazrinhajiyevaa@gmail.com' in email address")
    public void enterSignInEmail() {
        SignInPOM si = new SignInPOM();
        si.typeSignInEmail("nazrinhajiyevaa@gmail.com");
    }
    @And ("I click continue button")
    public void clickContinueButton() {
        SignInPOM si = new SignInPOM();
        si.clickContinueButton();
    }

    @And ("I enter 'scholastic5' in password")
    public void enterSignInPassword() {
        SignInPOM si = new SignInPOM();
        si.typeSignInPassword("scholastic5");
    }

    @And ("I click continue button")
    public void clickContinueButtonAfterPasswordInput() {
        SignInPOM si = new SignInPOM();
        si.clickSignInButtonAfterPasswordInput();
    }
}
