package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.alerts.AlertsPage;
import utilites.Retry;

public class HerokuappAlertsTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void javaScriptAlertTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openHerokuappAlertsPage();
        String actualResult = alertsPage.acceptAlert();
        Assert.assertEquals(actualResult, "I am a JS Alert");
    }

    @Test(retryAnalyzer = Retry.class)
    public void javaScriptConfirmTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openHerokuappAlertsPage();
        String actualResult = alertsPage.dismissAlert();
        Assert.assertEquals(actualResult, "I am a JS Confirm");
    }

    @Test(retryAnalyzer = Retry.class)
    public void javaScriptPromptTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openHerokuappAlertsPage();
        alertsPage.promptAlert();
        String actualResult = driver.findElement(By.xpath("//p[text() = 'You entered: Hello']")).getText();
        Assert.assertEquals(actualResult, "You entered: Hello");
    }
}
