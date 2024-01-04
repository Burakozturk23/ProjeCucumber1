package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage extends Parent{
    public LoginPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[name=username]")
    private WebElement username;

    @FindBy(css = "[name=password]")
    private WebElement password;

    @FindBy(css = "[value='Log In']")
    private WebElement login;

    @FindBy(css = "[class=smallText]>b")
    private WebElement successMessage;

    @FindBy(css = "[class=error]")
    private WebElement errorMessage;

    @FindBy(css = "div[id=leftPanel] li:nth-of-type(8)")
    private WebElement LogOutBtn;



    WebElement myElement;
    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "username":myElement=username;break;
            case "password":myElement=password;break;


        }
        sendKeysFunction(myElement,value);

    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "login":myElement=login;break;
            case "logout":myElement=LogOutBtn;break;



        }
        clickFunction(myElement);

    }
    public void findAndContainsText(String strElement,String text){
        switch (strElement){
            case "successMessage":myElement=successMessage;break;
            case "errorMessage":myElement=errorMessage;break;

        }
        verifyContainsText(myElement,text);

    }


}
