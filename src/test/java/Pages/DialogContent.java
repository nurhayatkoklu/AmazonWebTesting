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

    @FindBy(css = "div>div>div[cel_widget_id='MAIN-SEARCH_RESULTS-2'] h2 span")
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

    @FindBy(css = "div[class='fst-h1-st pageBanner'] h1")
    private WebElement baslikYazisi;

    @FindBy(xpath = "//span[text()='Shave & Hair Removal']")
    private WebElement shaveAndHairRemovalBtn;

    @FindBy(id = "s-result-sort-select")
    private WebElement miniSelectMenu;

    @FindBy(xpath = "(//span[text()='& Up'])[1]")
    private WebElement filtre4YildizVeUzeri;

    @FindBy(xpath = "//span[text()='$200 & Above']")
    private WebElement filtre200DolarVeUzeriBirim;

    @FindBy(xpath = "//span[text()='Premium Selection']")
    private WebElement filtrePremiumSelection;

    @FindBy(xpath = "//span[text()='Amazon.com']")
    private WebElement filtreSellerAmazon;

    @FindBy(css = "div[class='a-section a-spacing-small a-spacing-top-small'] span")
    private WebElement geriyeKalanAramaSonucu;

    @FindBy(css = "h1[id='title'] span")
    private WebElement urunAdi;

    @FindBy(css = "span[class='a-text-bold']+span")
    private WebElement ururBilgi;

    @FindBy(linkText = "LEEDYA Womens Long Sleeve Mama Graphic Shirts Casual Crewneck Sweatshirt Loose Pullover Tops")
    private WebElement christmasSweatshirt;

    @FindBy(xpath = "//*[@id='sw-gtc']/span/a")
    private WebElement gotoCart;

    @FindBy(xpath = "//input[@value='Save for later']")
    private WebElement saveForLater;

    @FindBy(xpath = "(//*[@data-action='save-for-later'])[1]")
    private WebElement verifySavedForLater;

    @FindBy(xpath = "//*[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")
    private WebElement cartEmpty;

    @FindBy(xpath = "//*[@id='submit.add-to-cart']")
    private WebElement addToCart2;
    @FindBy(xpath = "//span[text()='Protective Gear']")
    private WebElement protectiveGearTitle;

    @FindBy(xpath = "//span[text()='Helmets']")
    private WebElement helmetsTitle;

    @FindBy(css = "i[class$='medium-4']")
    private WebElement star4Up;

    @FindBy(css = "li[aria-label='ILM']>span")
    private WebElement helmetBrand;
    @FindBy(id = "low-price")
    private WebElement lowPriceInput;
    @FindBy(id = "high-price")
    private WebElement highPriceInput;
    @FindBy(css = "input[class='a-button-input']")
    private WebElement goButton;
    @FindBy(css = "li[id='p_n_feature_thirteen_browse-bin/7298818011']>span")
    private WebElement helmetVehicleType;
    @FindBy(css = "li[id='p_n_size_seven_browse-vebin/8150031011']>span")
    private WebElement helmetSize;

    @FindBy(css = "a[title='Black']>span>div")
    private WebElement helmetColor;

    @FindBy(css = "div>div>div[cel_widget_id^='MAIN-SEARCH_RESULTS'] h2 span")
    private WebElement helmetSelect;

    @FindBy(css = "input[id='add-to-cart-button']")
    private WebElement AddToCartButton;

    @FindBy(css = "div[class$='sw-atc-message']+span")
    private WebElement AddToCartverify;

    @FindBy(css = "input[title='Delete']")
    public WebElement deleteCartButton;

    @FindBy(css = "div[class$='ewc-item-remove-msg']")
    private WebElement deleteCartVerify;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "textBox":
                myElement = textBox;
                break;
            case "lowPriceInput":
                myElement = lowPriceInput;
                break;
            case "highPriceInput":
                myElement = highPriceInput;
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
            case "shaveAndHairRemovalBtn":
                myElement = shaveAndHairRemovalBtn;
                break;
            case "filtre4YildizVeUzeri":
                myElement = filtre4YildizVeUzeri;
                break;
            case "filtre200DolarVeUzeriBirim":
                myElement = filtre200DolarVeUzeriBirim;
                break;
            case "filtrePremiumSelection":
                myElement = filtrePremiumSelection;
                break;
            case "filtreSellerAmazon":
                myElement = filtreSellerAmazon;
                break;

            case "christmasSweatshirt":
                myElement = christmasSweatshirt;
                break;

            case "gotoCart":
                myElement = gotoCart;
                break;

            case "saveForLater":
                myElement = saveForLater;
                break;

            case "addToCart2":
                myElement = addToCart2;
                break;
            case "protectiveGearTitle":
                myElement = protectiveGearTitle;
                break;
            case "helmetsTitle":
                myElement = helmetsTitle;
                break;
            case "star4Up":
                myElement = star4Up;
                break;
            case "helmetVehicleType":
                myElement = helmetVehicleType;
                break;
            case "helmetBrand":
                myElement = helmetBrand;
                break;
            case "helmetSize":
                myElement = helmetSize;
                break;
            case "helmetColor":
                myElement = helmetColor;
                break;
            case "goButton":
                myElement = goButton;
                break;
            case "helmetSelect":
                myElement = helmetSelect;
                break;
            case "AddToCartButton":
                myElement = AddToCartButton;
                break;
            case "deleteCartButton":
                myElement = deleteCartButton;
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
            case "baslikYazisi":
                myElement = baslikYazisi;break;
            case "geriyeKalanAramaSonucu":
                myElement = geriyeKalanAramaSonucu;break;
            case "verifySavedForLater":
                myElement = verifySavedForLater;break;
            case "cartEmpty":
                myElement = cartEmpty;break;
            case "deleteCartVerify":
                myElement = deleteCartVerify;
                break;
            case "AddToCartverify":
                myElement = AddToCartverify;
                break;



        }
        verifyContainsText(myElement, text);
    }

    public void findAndSelect(String strElement, String value) {

        switch (strElement) {
            case "allSelectMenu":
                myElement = allSelectMenu;
                break;
            case "miniSelectMenu":
                myElement = miniSelectMenu;
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

    public WebElement getMyElement(String strElement) {
        switch (strElement){
            case "geriyeKalanAramaSonucu":myElement=geriyeKalanAramaSonucu;break;
            case "urunAdi":myElement=urunAdi;break;
            case "ururBilgi":myElement=ururBilgi;break;

        }
        return myElement;
    }
}