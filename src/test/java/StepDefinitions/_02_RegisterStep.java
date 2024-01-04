package StepDefinitions;

import Pages.Parent;
import Pages.RegisterPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_RegisterStep extends Parent {
    RegisterPage dc=new RegisterPage();



    @When("Enter register")
    public void enterRegister() {
        dc.findAndClick("Register");
        dc.findAndSend("FirstName","Kartal");
        dc.findAndSend("LastName","Kayra");
        dc.findAndSend("Address","Dolmabahçe");
        dc.findAndSend("City","İstanbul");
        dc.findAndSend("State","Beşiktaş");
        dc.findAndSend("Zip Code","190316");
        dc.findAndSend("SSN","1903");
        dc.findAndSend("Username","kartalkayra23");
        dc.findAndSend("Password","1903");
        dc.findAndSend("Confirm","1903");
        dc.findAndClick("Register2");


    }

    @Then("User should register successfuly")
    public void userShouldRegisterSuccessfuly() {
        dc.findAndContainsText("succesMessage","Your account was created successfully. You are now logged in.");

    }
}
