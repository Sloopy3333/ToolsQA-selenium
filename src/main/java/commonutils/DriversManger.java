package commonutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriversManger extends UtilsObjects {

    public static WebDriver getDriver(String browser){
        switch (browser) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
                return new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver");
                return new FirefoxDriver();
            }
            default -> {
                throw new IllegalStateException("Unexpected value: " + browser);
            }
        }
    }

}
