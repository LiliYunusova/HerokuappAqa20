package pages.notificationmassage;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePageFactory;

import static constans.PageUrl.HEROKUAPP_PAGE_NOTIFICATION_MASSAGE;

public class NotificationPage extends BasePageFactory {
    @FindBy(xpath = "//a[text()= 'Click here']")
    private WebElement clickLink;

    @FindBy(css = "#flash")
    private WebElement notification;

    public NotificationPage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationPage() {
        driver.get(HEROKUAPP_PAGE_NOTIFICATION_MASSAGE);
    }
    @Attachment
    public void clickLinkNotification() {
        clickLink.click();
    }

    public String notificationText() {
        return notification.getText();
    }
}
