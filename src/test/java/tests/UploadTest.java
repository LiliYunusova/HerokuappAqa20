package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.upload.UploadPage;

public class UploadTest extends BaseTest {

    @Test
    public void uploadFileTest() {
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.openUploadPage();
        uploadPage.uploadPhoto();
        uploadPage.uploadButton();
        String text = driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(text, "Screenshot_1.png");
    }
}
