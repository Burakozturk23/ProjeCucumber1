package StepDefinitions;

import Pages.BillPayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_BillPayStep {
    BillPayPage bp=new BillPayPage();
    @And("Click to Bill Pay button")
    public void clickToBillPayButton() {
        bp.findAndClick("billPayBtn");
    }

    @And("Fill in the Payee Name input as {string}")
    public void fillInThePayeeNameInputAs(String payeename) {
        bp.findAndSend("payeename",payeename);
    }

    @And("Fill in the Bill Address input as {string}")
    public void fillInTheBillAddressInputAs(String billAddress) {
        bp.findAndSend("billAddress",billAddress);
    }

    @And("Fill in the Bill City input as {string}")
    public void fillInTheBillCityInputAs(String billCity) {
        bp.findAndSend("billCity",billCity);
    }

    @And("Fill in the Bill State input as {string}")
    public void fillInTheBillStateInputAs(String billState) {
        bp.findAndSend("billState",billState);
    }

    @And("Fill in the Bill Zip Code input as {string}")
    public void fillInTheBillZipCodeInputAs(String billZipCode) {
        bp.findAndSend("billZipCode",billZipCode);
    }

    @And("Fill in the Bill Phone input as {string}")
    public void fillInTheBillPhoneInputAs(String billPhone) {
        bp.findAndSend("billPhone",billPhone);
    }

    @And("Fill in the Account input as {string}")
    public void fillInTheAccountInputAs(String billAccount) {
        bp.findAndSend("billAccount",billAccount);
    }

    @And("Fill in the Verify Account input as {string}")
    public void fillInTheVerifyAccountInputAs(String billVerifyAccount) {
        bp.findAndSend("billVerifyAccount",billVerifyAccount);
    }

    @And("Fill in the Amount input as {string}")
    public void fillInTheAmountInputAs(String billAmount) {
        bp.findAndSend("billAmount",billAmount);
    }

    @When("Click to Send Payment button")
    public void clickToSendPaymentButton() {
        bp.findAndClick("sendPayment");
    }

    @Then("Bill Payment Complete message should be displayed")
    public void billPaymentCompleteMessageShouldBeDisplayed() {
        bp.findAndContainsText("completeMessage","Complete");
    }

    @And("Click to Log out button{int}")
    public void clickToLogOutButton(int arg0) {

    }
}
