package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.draganddrop.DragAndDropPages;
import utilites.Retry;

public class DragAndDropTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class, description = "Drag and Drop")
    @Description("Drag and Drop")
    public void dragAndDropTest() {
        DragAndDropPages dragAndDropPages = new DragAndDropPages(driver);
        dragAndDropPages.openDragAndDrop();
        dragAndDropPages.dragAndDrop();
        String textDropped = driver.findElement(By.id("droppable")).getText();
        Assert.assertEquals(textDropped, "Dropped!");
    }
}
