package commonutils;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends UtilsObjects {

    public static void extentSetup(){
        String reportPath = System.getProperty("user.dir")+"/reports/"+ReusableUtils.getTodayDate()+".html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("Run reports");
    }

    public static void extentClose(){
        extent.flush();
    }
}
