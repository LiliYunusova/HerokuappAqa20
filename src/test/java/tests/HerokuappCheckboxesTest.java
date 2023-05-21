package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.checkboxes.CheckboxesPage;
import utilites.Retry;

public class HerokuappCheckboxesTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void firstCheckboxUnCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openHerokuappCheckboxesPage();
        Assert.assertFalse(checkboxesPage.isCheckbox1Selected(), "Чек бокс проставлен");
    }

    @Test(retryAnalyzer = Retry.class)
    public void firstCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openHerokuappCheckboxesPage();
        checkboxesPage.checkbox1Click();
        Assert.assertTrue(checkboxesPage.isCheckbox1Selected(), "Чек бок не проставлен");
    }

    @Test(retryAnalyzer = Retry.class)
    public void secondCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openHerokuappCheckboxesPage();
        Assert.assertTrue(checkboxesPage.isCheckbox2Selected(), "Чек бокс проставлен");
    }

    @Test(retryAnalyzer = Retry.class)
    public void secondCheckboxUnCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openHerokuappCheckboxesPage();
        checkboxesPage.checkbox2Click();
        Assert.assertFalse(checkboxesPage.isCheckbox2Selected(), "Чек бокс проставлен");
    }


}
