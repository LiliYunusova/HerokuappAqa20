package pages.typos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePageFactory;

import static constans.PageUrl.HEROKUAPP_PAGE_TYPOS;

public class TyposPage extends BasePageFactory {

    @FindBy(xpath = "//p[contains (text(), 'Sometime')]")
    private WebElement text;

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage(){
        driver.get(HEROKUAPP_PAGE_TYPOS);
    }

    public String getTyposText(){
       return text.getText();
    }

}
