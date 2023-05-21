package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dropdown.DropDownPage;
import utilites.Retry;

public class DropDownTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void selectFirstOptionTest() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        String text = dropDownPage.selectOptionOne();

        Assert.assertEquals(text, "Option 1");
    }

    @Test(retryAnalyzer = Retry.class)
    public void selectSecondOptionTest() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        String text = dropDownPage.selectOptionTwo();

        Assert.assertEquals(text, "Option 2");
    }
}
