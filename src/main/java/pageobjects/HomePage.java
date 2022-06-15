package pageobjects;

import commonutils.UtilsObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseTest;

public class HomePage extends BaseTest {
    WebDriver driver;
    public HomePage(){
        PageFactory.initElements(BaseTest.driver, this);
    }


    @FindBy(xpath = "//h5[contains(text(),'Element')]")
    WebElement elements;

    @FindBy(xpath = "//h5[contains(text(),'Forms')]")
    WebElement Forms;

    @FindBy(xpath = "//h5[contains(text(),'Alerts, Frame & Windows')]")
    WebElement Frames;

    @FindBy(xpath = "//h5[contains(text(),'Widgets')]")
    WebElement Widgets;

    @FindBy(xpath = "//h5[contains(text(),'Interactions')]")
    WebElement Interactions;

    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    WebElement BookStore;

    public void clickElement(){
        elements.click();
    }

    public void clickForms(){
        Forms.click();
    }

    public void clickFrames(){
        Frames.click();
    }

    public void clickWidgets(){
        Widgets.click();
    }

    public void clickInteractions(){
        Interactions.click();
    }

    public void clickBookStore(){
        BookStore.click();
    }

}
