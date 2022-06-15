package commonutils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import testbase.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableUtils extends BaseTest {

    public static String getTodayDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss");
        return sdf.format(new Date());
    }

    public static String takeScreenshot() throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destPath = System.getProperty("user.dir")+"/reports/screenshots/"+ReusableUtils.getTodayDate()+".jpeg";
        FileHandler.copy(src, new File(destPath) );
        return destPath;
    }

}
