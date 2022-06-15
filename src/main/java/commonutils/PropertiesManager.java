package commonutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager extends UtilsObjects{

    public static String getPropertyByKey(String key) throws IOException {
        String propfile = System.getProperty("user.dir") +  "/src/test/resources/config.properties";
        FileInputStream fis = new FileInputStream(propfile);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }
}
