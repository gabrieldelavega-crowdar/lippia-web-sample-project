package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lippia.web.services.LoginServices;


public class LoginSteps {

    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        LoginServices.goLoginPage();
    }

    @And("the user fills the password textbox with (.*)$")
    public void theUserFillsThePasswordTextboxWith(String text) {
        LoginServices.inputPassword(text);
    }

    @And("the user fills the email textbox with (.*)$")
    public void theUserFillsTheEmailTextboxWith(String text) {
        LoginServices.inputEmail(text);
    }



    @And("the user clicks the Login button")
    public void theUserClicksTheLoginButton() {
        LoginServices.clickLoginButton();
    }

    @Then("the user is in Home Page")
    public void theUserIsInHomePage() {
        LoginServices.verifyHomePage();
    }

    @Then("the user see the error message (.*)$")
    public void theUserSeeTheErrorMessage(String text) {
        LoginServices.verifyErrorLoginMessage(text);
    }

}
