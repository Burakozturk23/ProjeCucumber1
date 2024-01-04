package StepDefinitions;

import Pages.LoginPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_LoginStep {
    LoginPage lp = new LoginPage();

    @Given("Navigate to bank")
    public void navigateToBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Fill in the Login Username input as {string}")
    public void fillInTheLoginUsernameInputAs(String username) {
        lp.findAndSend("username", username);
    }

    @And("Fill in the Login Password input as {string}")
    public void fillInTheLoginPasswordInputAs(String password) {
        lp.findAndSend("password", password);

    }

    @When("Click to Log in button")
    public void clickToLogInButton() {
        lp.findAndClick("login");

    }

    @Then("Verify that you are logged in")
    public void verifyThatYouAreLoggedIn() {
        lp.findAndContainsText("successMessage", "Welcome");
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        lp.findAndContainsText("errorMessage", "has been logged.");
    }

    @And("Click to Log out button")
    public void clickToLogOutButton() {
        lp.findAndClick("logout");
    }


}