package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dropdown.DropDownPage;
import utilites.Retry;

public class DropDownTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class, description = "Select first option")
    @Description("Select first option")
    public void selectFirstOptionTest() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        String text = dropDownPage.selectOptionOne();

        Assert.assertEquals(text, "Option 1");
    }

    @Test(retryAnalyzer = Retry.class, description = "Select second option")
    @Description("Select second option")
    public void selectSecondOptionTest() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        String text = dropDownPage.selectOptionTwo();

        Assert.assertEquals(text, "Option 2");
    }
}
