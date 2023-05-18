package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.draganddrop.DragAndDropPages;

public class DragAndDropTest extends BaseTest {

    @Test
    public void dragAndDropTest() {
        DragAndDropPages dragAndDropPages = new DragAndDropPages(driver);
        dragAndDropPages.openDragAndDrop();
        dragAndDropPages.dragAndDrop();
        String textDropped = driver.findElement(By.id("droppable")).getText();
        Assert.assertEquals(textDropped, "Dropped!");
    }
}
