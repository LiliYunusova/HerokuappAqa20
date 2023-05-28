package utilites;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AllureTool {

    @Attachment(value = "screenshot", type = "image/png")
    public byte[] makeScreenShot(WebDriver driver) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
    }
}
