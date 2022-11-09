package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "searchDropdownBox")
    public WebElement allSelectMenu;

    @FindBy(id="twotabsearchtextbox")
    private WebElement textBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text()='Motorcycle & Powersports']")
    private WebElement motorcycleTitle;

    @FindBy (xpath = "//span[contains(text(),'Price and other details')]")
    private WebElement confirmingText1;

    @FindBy(css = "li[id='n/1055398']")
    private WebElement homeAndKitchen;

    @FindBy(xpath="//li[@id='n/1063306']")
    private WebElement furniture;
    @FindBy(xpath = "//span[@class='s-color-swatch-inner-circle-fill' and @style='background-color: #574944']")
    private WebElement compDesk;

    @FindBy (css = "input[id='add-to-cart-button']")
    private WebElement addToCart;

    @FindBy (css = "[class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
    private WebElement confirmingText2;

    @FindBy (css = "span[id='nav-cart-count']")
    private WebElement goToCart;

    @FindBy (xpath = "//i[@class='a-icon a-icon-dropdown']")
    private WebElement quantity;

    @FindBy (id="quantity_0")
    private WebElement delete;

    @FindBy (css = "[class='a-spacing-mini a-spacing-top-base']")
    private WebElement confirmingText3;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case"textBox":myElement = textBox;break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "searchButton":
                myElement = searchButton;break;
            case "motorcycleTitle":
                myElement = motorcycleTitle;break;

            case "homeAndKitchen":
                myElement = homeAndKitchen;break;
            case "furniture":
                myElement = furniture;break;
            case "compDesk":
                myElement = compDesk;break;
            case "addToCart":
                myElement = addToCart;break;
            case "goToCart":
                myElement = goToCart;break;
            case "quantity":
                myElement = quantity;break;
            case "delete":
                myElement = delete;break;
        }
        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "confirmingText1": myElement = confirmingText1;break;
            case "confirmingText2": myElement = confirmingText2;break;
            case "confirmingText3": myElement = confirmingText3;break;
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