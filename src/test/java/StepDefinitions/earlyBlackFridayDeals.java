package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class earlyBlackFridayDeals {
    DialogContent dc=new DialogContent();
    @Given("Send {string} to searchbox")
    public void sendToSearchbox(String earlyDeal) {
        dc.findAndSend("textBox", earlyDeal);
    }

    @And("Sort products according to customer reviews")
    public void sortProductsAccordingToCustomerReviews() {
        WebElement menu= GWD.getDriver().findElement(By.id("s-result-sort-select"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(3);
        WebElement review=GWD.driver.findElement(By.xpath("//*[@id='s-result-sort-select_3']"));
        review.click();
    }

    @And("Scroll through the products")
    public void scrollThroughTheProducts() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollBy(0, 300)");
        GWD.Bekle(1);
        js.executeScript("window.scrollBy(0, 300)");
        GWD.Bekle(1);
        js.executeScript("window.scrollBy(0, 300)");
        GWD.Bekle(1);
        js.executeScript("window.scrollBy(0, 300)");
        GWD.Bekle(1);
        js.executeScript("window.scrollBy(0, 300)");
        GWD.Bekle(1);
        js.executeScript("window.scrollBy(0, -1500)");
        GWD.Bekle(1);
    }

    @And("Sort products high to low")
    public void sortProductsAccordingToNewestArrivals() {
        WebElement menu= GWD.getDriver().findElement(By.id("s-result-sort-select"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(2);
       // GWD.Bekle(1);
       // WebElement highToLow=GWD.driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]"));
       // highToLow.click();
       // highToLow.click();
    }

    @And("Buy a Christmas sweatshirt")
    public void buyAChristmasSweatshirt() {
        dc.findAndClick("christmasSweatshirt");
    }

    @And("Select sweatshirt size and add to cart")
    public void selectSweatshirtSize() {

        WebElement menu= GWD.getDriver().findElement(By.xpath("//*[@id='native_dropdown_selected_size_name']"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(2);
        GWD.Bekle(1);
        dc.findAndClick("addToCart2");
    }

    @And("Click go to cart")
    public void clickGoToCart() {

        dc.findAndClick("goToCart");
    }

    @And("Click Save for later")
    public void clickSaveForLater() {

        dc.findAndClick("saveForLater");
    }

    @And("Confirm that product saved for later")
    public void confirmThatProductSavedForLater() {
        dc.findAndContainsText("verifySavedForLater", "has been moved to Saved for Later.");
    }

    @Then("Verify the cart is empty")
    public void verifyTheCartIsEmpty() {
        dc.findAndContainsText("cartEmpty", "$0.00");
    }

    @And("Sort products according to customer reviews second time")
    public void sortProductsAccordingToCustomerReviewsSecondTime() {
        WebElement menu= GWD.getDriver().findElement(By.id("s-result-sort-select"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(3);
    }


    @And("Add to cart")
    public void addToCart() {
        dc.findAndClick("addToCart2");
    }
}
