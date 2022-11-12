package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComputersSteps {
    DialogContent dc=new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));



    @And("Select Computers from the All menu")
    public void selectComputersFromTheAllMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@aria-describedby=\"searchDropdownDescription\"]//option)[8]")));

        dc.findAndSelect("allSelectMenu","Computers");

    }
    @And("navigate the page")
    public void navigateThePage() {

        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollBy(0,3000)");
        GWD.Bekle(2);
        js.executeScript("window.scrollBy(0,-3000)");


    }


    @And("drop-down page product number information")
    public void dropDownPageProductNumberInformation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='a-section a-spacing-small a-spacing-top-small'] span")));

        String ProductQuantity=dc.getMyElement("information").getText();
        System.out.println("ProductQuantity = " + ProductQuantity);

    }






}
