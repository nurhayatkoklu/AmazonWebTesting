package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class _01_StartTest {
    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        WebDriver driver = GWD.getDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }
}
