package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static Utilities.GWD.Bekle;
import static Utilities.GWD.driver;

public class AutomotiveTitleSteps {
    DialogContent dc=new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    @When("Verify amazon url")
    public void verifyAmazonUrl() {
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));

    }

    @And("Select Automotive from the All menu")
    public void selectAutomotiveFromTheAllMenu() {
        dc.findAndSelect("allSelectMenu","Automotive");
    }

    @And("Click on the search button")
    public void clickOnTheSearchButton() {
        dc.findAndClick("searchButton");
    }

    @And("Click on the Motorcycle & Powersports title")
    public void clickOnTheMotorcyclePowersportsTitle() {
        dc.findAndClick("motorcycleTitle");
    }

    @And("Click on the Protective Gear title")
    public void clickOnTheProtectiveGearTitle() {
        dc.findAndClick("protectiveGearTitle");
    }

    @And("Click on the Helmets title")
    public void clickOnTheHelmetsTitle() {
        dc.findAndClick("helmetsTitle");
    }

    @And("Select random product attributes from the left")
    public void selectRandomProductAttributesFromTheLeft() {
        dc.findAndClick("star4Up");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[cel_widget_id^='MAIN-SEARCH_RESULTS'] h2")));
        dc.findAndClick("helmetBrand");
        dc.findAndSend("lowPriceInput","88");
        dc.findAndSend("highPriceInput","199");
        dc.findAndClick("goButton");
        dc.findAndClick("helmetVehicleType");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[cel_widget_id^='MAIN-SEARCH_RESULTS'] h2")));
        dc.findAndClick("helmetSize");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[cel_widget_id^='MAIN-SEARCH_RESULTS'] h2")));
        dc.findAndClick("helmetColor");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[cel_widget_id^='MAIN-SEARCH_RESULTS'] h2")));


    }

    @And("Click on the a random helmet")
    public void clickOnTheARandomHelmet() {
        dc.findAndClick("helmetSelect");

    }


    @And("Click add to cart")
    public void clickAddToCart() {
        dc.findAndClick("AddToCartButton");

    }

    @And("Verify that the product has been added to the cart")
    public void verifyThatTheProductHasBeenAddedToTheCart() {
        dc.findAndContainsText("AddToCartverify","Added to Cart");

    }

    @And("Delete the product from cart")
    public void deleteTheProductFromCart() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.deleteCartButton));
        dc.findAndClick("deleteCartButton");

    }

    @Then("Verify that the product has been deleted")
    public void verifyThatTheProductHasBeenDeleted() {
        dc.findAndContainsText("deleteCartVerify","was removed from Shopping Cart");
    }
}