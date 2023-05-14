package pages.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constans.PageUrl.HEROKUAPP_PAGE_CHECKBOXES;

public class CheckboxesPage extends BasePage{
    private By CHECKBOX1 = By.cssSelector("input:first-child");
    private  By CHECKBOX2 = By.cssSelector("input:last-child");


    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }
    public void openHerokuappCheckboxesPage(){
        driver.get(HEROKUAPP_PAGE_CHECKBOXES);
    }
    public boolean isCheckbox1Selected(){
        WebElement isCheckboxSelected = driver.findElement(CHECKBOX1);
        return isCheckboxSelected.isSelected();
    }
    public boolean isCheckbox2Selected(){
        WebElement isCheckboxSelected = driver.findElement(CHECKBOX2);
        return isCheckboxSelected.isSelected();
    }
    public void checkbox1Click(){
        driver.findElement(CHECKBOX1).click();
    }
    public void checkbox2Click(){
        driver.findElement(CHECKBOX2).click();
    }
}
