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

    @FindBy(id = "twotabsearchtextbox")
    private WebElement textBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text()='Motorcycle & Powersports']")
    private WebElement motorcycleTitle;

    @FindBy(xpath = "//span[contains(text(),'Price and other details')]")
    private WebElement confirmingText1;

    @FindBy(xpath = "//span[text()='Home & Kitchen']")
    private WebElement homeAndKitchen;

    @FindBy(xpath = "//span[text()='Furniture']")
    private WebElement furniture;

    @FindBy(xpath = "//span[text()='Home Office Furniture']")
    private WebElement homeOfficeFurniture;

    @FindBy(xpath = "//span[text()='Office Chairs']")
    private WebElement officeChairs;

    @FindBy(xpath = "//span[text()='Home Office Desk Chairs']")
    private WebElement deskChairs;

    @FindBy(xpath = "(//span[@class='a-price-whole' and text()='108'])[1]")
    private WebElement executiveChair;

    @FindBy(css = "input[id='add-to-cart-button']")
    private WebElement addToCart;

    @FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
    private WebElement confirmingText2;

    @FindBy(css = "span[class='a-button a-spacing-top-base a-button-span12 a-button-base']")
    private WebElement goToCart;

    @FindBy(css = "span[class='a-button-text a-declarative']")
    private WebElement quantity;

    @FindBy(id= "quantity_0")
    private WebElement delete;

    @FindBy(css = "[class='a-spacing-mini a-spacing-top-base']")
    private WebElement confirmingText3;

    @FindBy(css = "h2[class='a-size-large a-spacing-base']")
    private WebElement booksHeader;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "textBox":
                myElement = textBox;
                break;
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

            case "homeAndKitchen":
                myElement = homeAndKitchen;
                break;
            case "furniture":
                myElement = furniture;
                break;
            case "homeOfficeFurniture":
                myElement = homeOfficeFurniture;
                break;
            case "officeChairs":
                myElement = officeChairs;
                break;
            case "deskChairs":
                myElement = deskChairs;
                break;

            case "addToCart":
                myElement = addToCart;
                break;
            case "goToCart":
                myElement = goToCart;
                break;
            case "quantity":
                myElement = quantity;
                break;
            case "delete":
                myElement = delete;
                break;
        }
        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "confirmingText1":
                myElement = confirmingText1;break;
            case "confirmingText2":
                myElement = confirmingText2;break;
            case "confirmingText3":
                myElement = confirmingText3;break;
            case "booksHeader":
                myElement = booksHeader;break;

        }
        verifyContainsText(myElement, text);
    }

    public void findAndSelect(String strElement, String value) {

        switch (strElement) {
            case "allSelectMenu":
                myElement = allSelectMenu;
                break;
        }
        selectAndFind(allSelectMenu, value);
    }

    public void findAndAction(String strElement) {
        switch (strElement) {
            case "executiveChair":
                myElement = executiveChair;
                break;
        }
        actionFunction(myElement);
    }
}