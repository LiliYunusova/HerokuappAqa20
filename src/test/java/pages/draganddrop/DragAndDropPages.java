package pages.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import javax.swing.*;

import static constans.PageUrl.DROPPABLE_PAGE;

public class DragAndDropPages extends BasePage {
    private By frame = By.className("demo-frame");
    private By draggable_element = By.id("draggable");
    private By droppable_element = By.id("droppable");

    public DragAndDropPages(WebDriver driver) {
        super(driver);
    }

    public void openDragAndDrop() {
        driver.get(DROPPABLE_PAGE);
    }

    public void dragAndDrop() {
        WebElement frameElement = driver.findElement(frame);
        driver.switchTo().frame(frameElement);
        WebElement draggable = driver.findElement(draggable_element);
        WebElement droppable = driver.findElement(droppable_element);
        Actions actions = new Actions(driver);
        actions.
                dragAndDrop(draggable, droppable)
                .build()
                .perform();
    }
}
