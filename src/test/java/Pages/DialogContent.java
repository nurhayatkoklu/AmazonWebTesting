package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "searchDropdownBox")
    public WebElement allSelectMenu;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text()='Motorcycle & Powersports']")
    private WebElement motorcycleTitle;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

//            case "x":
//                myElement = x;
//                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "searchButton":
                myElement = searchButton;
                break;

            case "motorcycleTitle":
                myElement = motorcycleTitle;
                break;
        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {

//            case "assertPage":
//                myElement = x;
//                break;

        }

        verifyContainsText(myElement, text);
    }

    public void findAndSelect(String strElement, String value) {
        switch (strElement) {
            case "allSelectMenu":
                myElement = allSelectMenu;
                break;
        }
        selectAndFind(allSelectMenu,value);

    }
}