package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Home_Kitchen {
    DialogContent dc = new DialogContent();

    @When("Send Home & Kitchen option through text box")
    public void sendHomeKitchenOptionThroughTextBox() {
        dc.findAndSend("textBox", "Home & Kitchen");
    }

    @And("Click on search button")
    public void clickOnSearchButton() {
        dc.findAndClick("searchButton");
    }

    @Then("Results page should appear")
    public void resultsPageShouldAppear() {
        dc.findAndContainsText("confirmingText1", "Price and other details");
    }

    @When("Click on the following elements")
    public void clickOnTheFollowingElements(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
    @Then("the item should be added to the cart")
    public void theItemShouldBeAddedToTheCart() {
        dc.findAndContainsText("confirmingText2","Added to Cart");
    }
    @Then("the cart should be empty")
    public void theCartShouldBeEmpty() {
        dc.findAndContainsText("confirmingText3","Your Amazon Cart is empty");
    }
}
