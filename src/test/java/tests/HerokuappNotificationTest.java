package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.notificationmassage.NotificationPage;

public class HerokuappNotificationTest extends BaseTest {

    @Test
    public void notificationMassageTest() {
        NotificationPage notificationPage = new NotificationPage(driver);
        notificationPage.openNotificationPage();
        notificationPage.clickLinkNotification();
        String expectedResult = "Action successful\n" +
                "×";
        Assert.assertEquals(notificationPage.notificationText(), expectedResult);
    }
}
