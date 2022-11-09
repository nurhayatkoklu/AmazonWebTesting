package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static Utilities.GWD.driver;

public class AutomotiveTitleSteps {
    DialogContent dc=new DialogContent();
    @When("Verify amazon url")
    public void verifyAmazonUrl() {
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));

    }

    @And("Select Automotive from the All menu")
    public void selectAutomotiveFromTheAllMenu() {
//        Select menu=new Select(dc.allSelectMenu);
//        menu.selectByVisibleText("Automotive");
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
    }

    @And("Click on the Helmets title")
    public void clickOnTheHelmetsTitle() {
    }

    @And("Select random product attributes from the left")
    public void selectRandomProductAttributesFromTheLeft() {
    }

    @And("Click on the a random helmet")
    public void clickOnTheARandomHelmet() {
    }

    @And("Select the size")
    public void selectTheSize() {
    }

    @And("Click add to cart")
    public void clickAddToCart() {
    }

    @And("Verify that the product has been added to the cart")
    public void verifyThatTheProductHasBeenAddedToTheCart() {
    }

    @And("Delete the product from cart")
    public void deleteTheProductFromCart() {
    }

    @Then("Verify that the product has been deleted")
    public void verifyThatTheProductHasBeenDeleted() {
    }
}
