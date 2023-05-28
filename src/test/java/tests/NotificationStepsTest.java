package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.notificationmassage.NotificationPage;
import steps.NotificationSteps;

public class NotificationStepsTest extends BaseTest{

    @Test
    public void notificationCheck(){
        NotificationSteps.notificationMassageCheck(driver);
        NotificationPage notificationPage = new NotificationPage(driver);
        String text = notificationPage.notificationText();
        String expectedResult = "Action successful\n" +
                "×";
        Assert.assertEquals(text, expectedResult);
    }
}
