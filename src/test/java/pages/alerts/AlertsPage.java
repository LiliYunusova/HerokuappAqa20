package pages.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static constans.PageUrl.HEROKUAPP_PAGE_JAVASCRIPT_ALERTS;

public class AlertsPage extends BasePage {
    private By javaScriptAlertButton = By.cssSelector("[onclick = 'jsAlert()']");
    private By javaScriptConfirmButton = By.cssSelector("[onclick = 'jsConfirm()']");
    private By javaScriptPromptButton = By.cssSelector("[onclick = 'jsPrompt()']");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openHerokuappAlertsPage() {
        driver.get(HEROKUAPP_PAGE_JAVASCRIPT_ALERTS);
    }

    public void clickjavaScriptButton() {
        driver.findElement(javaScriptAlertButton).click();
    }

    public void clickConfirmButton() {
        driver.findElement(javaScriptConfirmButton).click();
    }

    public void clickPromptButton() {
        driver.findElement(javaScriptPromptButton).click();
    }

    public String acceptAlert() {
        clickjavaScriptButton();
        String getAlertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return getAlertText;
    }

    public String dismissAlert() {
        clickConfirmButton();
        String getDismissText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return getDismissText;
    }

    public void promptAlert() {
        clickPromptButton();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
    }
}
