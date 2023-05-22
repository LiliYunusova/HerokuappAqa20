package pages.upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import static constans.PageUrl.UPLOAD_PAGE;

public class UploadPage extends BasePage {

    private By uploadInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public void openUploadPage() {
        driver.get(UPLOAD_PAGE);
    }

    public void uploadPhoto() {
        WebElement input = driver.findElement(uploadInput);
        input.sendKeys(System.getProperty("user.dir").concat("/src/test/resources/photos/Screenshot_1.png"));
    }

    public void uploadButton() {
        driver.findElement(uploadButton).click();
    }
}
