package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {

    //cleanup part
    //will be executed after every test scenario
    //to close browser

    @Before
    public void setup() throws InterruptedException {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);//to open login page
        Thread.sleep(2000);
    }
    @After
    public void teardown() {
        System.out.println("Closing browser");
        Driver.closeDriver();
    }
}
