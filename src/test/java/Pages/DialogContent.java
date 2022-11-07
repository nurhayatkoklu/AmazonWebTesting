package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "")
    private WebElement x;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "x":
                myElement = x;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "otherFrame":
                myElement = x;
                break;


        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {

            case "assertPage":
                myElement = x;
                break;

        }

        verifyContainsText(myElement, text);
    }

}
