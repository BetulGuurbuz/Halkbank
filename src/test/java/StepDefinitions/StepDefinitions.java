package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import util.DriverFactory;

import java.util.List;

public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("User at home page")
    public void userAtHomePage() {
        homePage.UserAtHomePage();
    }

    @Given("Accept cookies")
    public void acceptCookies() {
        homePage.AcceptCookies();
    }

    @When("Click Sube ve ATM Arama")
    public void clickSubeVeATMArama() {
        homePage.ClickSubeVeATMArama();
    }

    @Given("Write city textbox Ankara")
    public void writeCityTextboxAnkara() {
        homePage.WriteCityTextboxAnkara();
    }

    @Given("Write district textbox Golbasi")
    public void writeDistrictTextboxGolbasi() {
        homePage.WriteDistrictTextboxGolbasi();
    }

    @When("Branch is select branch")
    public void branchIsSelectBranch() {
        homePage.BranchIsSelectBranch();
    }

    @Then("Click search button")
    public void clickSearchButton() {
        homePage.ClickSearchButton();
    }
}
