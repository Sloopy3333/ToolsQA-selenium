package pageobjects;

import commonutils.UtilsObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ElementPage extends UtilsObjects {
    WebDriver driver;

    public ElementPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li/span[contains(text(),'Text Box')]")
    WebElement liTextBox;

    @FindBy(xpath = "//li/span[contains(text(),'Check Box')]")
    WebElement liCheckBox;

    @FindBy(xpath = "//li/span[contains(text(),'Radio Button')]")
    WebElement liRadioButton;

    @FindBy(xpath = "//li/span[contains(text(),'Web Tables')]")
    WebElement liWebTables;

    @FindBy(xpath = "//li/span[contains(text(),'Buttons')]")
    WebElement liButtons;

    @FindBy(xpath = "//li/span[contains(text(),'Links')]")
    WebElement liLinks;

    @FindBy(xpath = "//li/span[contains(text(),'Broken Links - Images')]")
    WebElement liBroken;

    @FindBy(xpath = "//li/span[contains(text(),'Upload and Download')]")
    WebElement liUploadDownload;

    @FindBy(xpath = "//li/span[contains(text(),'Dynamic Properties')]")
    WebElement liDynamic;

    public void clickTextBox(){
        liTextBox.click();
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement buttonSubmit;

    @FindBy(id = "name")
    WebElement resultName;

    @FindBy(id = "email")
    WebElement resultEmail;

    @FindBy(xpath = "//p[@id = 'currentAddress']")
    WebElement resultCAddress;

    @FindBy(xpath = "//p[@id = 'permanentAddress']")
    WebElement resultPAddress;

    public void fillForm(String uname, String email, String cAddress, String pAddress){
        userName.sendKeys(uname);
        userEmail.sendKeys(email);
        currentAddress.sendKeys(cAddress);
        permanentAddress.sendKeys(pAddress);
        buttonSubmit.click();
    }

    public void verifyForm(String uname, String email, String cAddress, String pAddress) {
        Assert.assertTrue(resultName.getText().contains(uname));
        Assert.assertTrue(resultEmail.getText().contains(email));
        Assert.assertTrue(resultCAddress.getText().contains(cAddress));
        Assert.assertTrue(resultPAddress.getText().contains(pAddress));
    }
    }

