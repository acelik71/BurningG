package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//h5[contains(text(),'Alerts, Frame & Windows')]")
    public WebElement selectAlertsFramesWindowsPage;

    public void click() {
        click(selectAlertsFramesWindowsPage);
    }

    //    @FindBy(id = "ctl00_MainContent_password")
//    public WebElement passwordInputBoxElement;
//
//    public void login(String username, String password){
//        userNameInputBoxElement.sendKeys(username);
//        passwordInputBoxElement.sendKeys(password, Keys.ENTER);
//    }
}
