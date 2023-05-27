package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.notificationmassage.NotificationPage;

public class NotificationSteps {

    private static NotificationPage notificationPage;

    @Step("Notification page")
    public static void notificationMassageCheck(WebDriver driver){
        notificationPage = new NotificationPage(driver);
        notificationPage.openNotificationPage();
        notificationPage.clickLinkNotification();
    }
}
