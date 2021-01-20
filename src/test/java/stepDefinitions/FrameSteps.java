package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AlertsFramesWindowsPage;
import pages.FramePage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FrameSteps {
    //this is how we create page objects
    HomePage homePage = new HomePage();
    AlertsFramesWindowsPage alertsFrameWindowsPAge = new AlertsFramesWindowsPage();
    FramePage framePage=new FramePage();

    @And("go to Frame page")
    public void goToFramePage() {
        alertsFrameWindowsPAge.selectFramePage.click();
    }

    @Given("User clicks AlertsFramesWindowsPage element")
    public void userClicksElement() throws InterruptedException {
        homePage.selectAlertsFramesWindowsPage.click();
        Thread.sleep(2000);
    }

    @And("user switch to frameOne and check the presence of the {string}")
    public void userSwitchToFrameOneAndCheckThePresenceOfThe(String text) {
framePage.switchToFrame(text);
    }

    @And("user switch to frameOne and check not equal the presence of the {string}")
    public void userSwitchToFrameOneAndCheckNotEqualThePresenceOfThe(String text) {
        framePage.switchToFrameNotEquals(text);
    }
}
