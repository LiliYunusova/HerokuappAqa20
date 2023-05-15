package pages.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import static constans.PageUrl.HEROKUAPP_PAGE_CHECKBOXES;

public class CheckboxesPage extends BasePage {
    private By checkbox1 = By.cssSelector("input:first-child");
    private By checkbox2 = By.cssSelector("input:last-child");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openHerokuappCheckboxesPage() {
        driver.get(HEROKUAPP_PAGE_CHECKBOXES);
    }

    public boolean isCheckbox1Selected() {
        WebElement isCheckboxSelected = driver.findElement(checkbox1);
        return isCheckboxSelected.isSelected();
    }

    public boolean isCheckbox2Selected() {
        WebElement isCheckboxSelected = driver.findElement(checkbox2);
        return isCheckboxSelected.isSelected();
    }

    public void checkbox1Click() {
        driver.findElement(checkbox1).click();
    }

    public void checkbox2Click() {
        driver.findElement(checkbox2).click();
    }
}
