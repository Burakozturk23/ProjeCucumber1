package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Parent{
    public RegisterPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerButton;
    @FindBy(id = "customer.firstName")
    private WebElement firstName;
    @FindBy(id = "customer.lastName")
    private WebElement lastName;
    @FindBy(id = "customer.address.street")
    private WebElement Address;
    @FindBy(id = "customer.address.city")
    private WebElement City;
    @FindBy(id = "customer.address.state")
    private WebElement State;
    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCode;
    @FindBy(id = "customer.ssn")
    private WebElement SSN;
    @FindBy(id = "customer.username")
    private WebElement userName;
    @FindBy(id = "customer.password")
    private WebElement passWord;
    @FindBy(id = "repeatedPassword")
    private WebElement Confirm;

    @FindBy(xpath = "(//input[@class='button'])[2]")
    private WebElement registerButton2;
    @FindBy(css = "div[id=\"rightPanel\"]>p")
    private WebElement successMessage;







    WebElement myElement;

    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "FirstName":myElement=firstName;break;
            case "LastName":myElement=lastName;break;
            case "Address":myElement=Address;break;
            case "City":myElement=City;break;
            case "State":myElement=State;break;
            case "Zip Code":myElement=zipCode;break;
            case "SSN":myElement=SSN;break;
            case "Username":myElement=userName;break;
            case "Password":myElement=passWord;break;
            case "Confirm":myElement=Confirm;break;


        }
        sendKeysFunction(myElement,value);

    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "Register":myElement=registerButton;break;
            case "Register2":myElement=registerButton2;break;




        }
        clickFunction(myElement);

    }
    public void findAndContainsText(String strElement,String text){
        switch (strElement){
            case "succesMessage":myElement=successMessage;break;


        }
        verifyContainsText(myElement,text);

    }










}
