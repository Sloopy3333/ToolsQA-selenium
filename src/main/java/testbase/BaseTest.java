package testbase;

import commonutils.DriversManger;
import commonutils.PropertiesManager;
import commonutils.UtilsObjects;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class BaseTest extends  {

    public static WebDriver driver;

    @BeforeMethod
    public static void setUp() throws IOException {
        driver = DriversManger.getDriver(PropertiesManager.getPropertyByKey("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(PropertiesManager.getPropertyByKey("aut"));
    }

    @AfterMethod
    public static void tearDown(){
        driver.quit();
    }
}
