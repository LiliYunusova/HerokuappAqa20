package pages.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import static constans.PageUrl.DROPDOWN_PAGE;

public class DropDownPage extends BasePage {

    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropDownPage() {
        driver.get(DROPDOWN_PAGE);
    }

    public String selectOptionOne() {
        WebElement drop = driver.findElement(dropdown);
        Select select = new Select(drop);
        select.selectByValue("1");
        return select.getFirstSelectedOption().getText();
    }

    public String selectOptionTwo() {
        WebElement drop = driver.findElement(dropdown);
        Select select = new Select(drop);
        select.selectByValue("2");
        return select.getFirstSelectedOption().getText();
    }
}
