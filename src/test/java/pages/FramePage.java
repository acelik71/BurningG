package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage {

    @FindBy(tagName = "iframe")
    public List<WebElement> frames;


    public void switchToFrame(String text){
        String sampleHeading = switchFrame(frames,"sampleHeading" ).getText();
        Assert.assertEquals(text,sampleHeading);
    }



    public void switchToFrameNotEquals(String text){
        String sampleHeading = switchFrame(frames,"sampleHeading").getText();
        Assert.assertNotEquals(text,sampleHeading);
    }
}
