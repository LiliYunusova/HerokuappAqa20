package pages.inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static constans.PageUrl.HEROKUAPP_PAGE_INPUTS;

public class InputsPage extends BasePage {

    private By enterNumber = By.cssSelector("[type = 'number']");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public String arrowUp(){
        driver.get(HEROKUAPP_PAGE_INPUTS);
        driver.findElement(enterNumber).sendKeys(Keys.ARROW_UP);
        return  driver.findElement(enterNumber).getAttribute("value");
    }

    public String arrowDown(){
        driver.get(HEROKUAPP_PAGE_INPUTS);
        driver.findElement(enterNumber).sendKeys("5");
        driver.findElement(enterNumber).sendKeys(Keys.ARROW_DOWN);
        return  driver.findElement(enterNumber).getAttribute("value");
    }
}
