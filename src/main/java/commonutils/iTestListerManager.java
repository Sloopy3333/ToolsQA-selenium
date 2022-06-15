package commonutils;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class iTestListerManager extends UtilsObjects implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "test case passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(ReusableUtils.takeScreenshot()).build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        try {
            test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(ReusableUtils.takeScreenshot()).build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        try {
            test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(ReusableUtils.takeScreenshot()).build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        try {
            test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(ReusableUtils.takeScreenshot()).build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentManager.extentSetup();
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.extentClose();
    }
}
