package utilites;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(">>>>>>>Test " + result.getName() + " started");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("<<<<<<<Test Failed");
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriver();
        AllureTool allureTool =new AllureTool();
        allureTool.makeScreenShot(driver);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("<<<<<<<Test Passed");
    }
}
