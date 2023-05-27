package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.notificationmassage.NotificationPage;
import utilites.Retry;

public class HerokuappNotificationTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void notificationMassageTest() {
        NotificationPage notificationPage = new NotificationPage(driver);
        notificationPage.openNotificationPage();
        notificationPage.clickLinkNotification();
        String expectedResult = "Action successfull\n" +
                "×";
        Assert.assertEquals(notificationPage.notificationText(), expectedResult);
    }
}
