package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home_Kitchen {
    DialogContent dc = new DialogContent();

    @When("Send Home & Kitchen option through text box")
    public void sendHomeKitchenOptionThroughTextBox() {
        dc.findAndSend("textBox","Home & Kitchen");
    }
    @And("Click on search button")
    public void clickOnSearchButton() {
        dc.findAndClick("searchButton");
    }
    @Then("Results page should appear")
    public void resultsPageShouldAppear() {
        dc.findAndContainsText("confirmingText","Home & Kitchen");
    }
}
