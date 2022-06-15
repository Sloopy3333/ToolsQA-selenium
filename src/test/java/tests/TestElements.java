package tests;

import commonutils.UtilsObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ElementPage;
import pageobjects.HomePage;
import testbase.BaseTest;

public class TestElements extends BaseTest {

    HomePage homePage = PageFactory.initElements(BaseTest.driver, HomePage.class);

    @Test
    public void gotoElements(){
        homePage.clickElement();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");
    }

    @Test
    public void fillForm(){
        HomePage homePage = new HomePage();
        ElementPage elementPage = new ElementPage(driver);
        homePage.clickElement();
        elementPage.clickTextBox();
        elementPage.fillForm("username", "tester@test.com", "tester address", "tester address");
        elementPage.verifyForm("username", "tester@test.com", "tester address", "tester address");
    }

}
