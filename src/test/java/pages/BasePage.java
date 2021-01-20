package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.getDriver;

public abstract class BasePage {

    public BasePage() {
        //makes @FindBy work
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void click(WebElement element){
    element.click();
    }

    public WebElement switchFrame(List<WebElement> frames, String elementID) {
        WebDriverWait wait=new WebDriverWait(getDriver(),10);
        return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frames.get(0))).findElement(By.id(elementID));
    }
}
