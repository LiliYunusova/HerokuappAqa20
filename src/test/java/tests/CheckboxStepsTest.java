package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.checkboxes.CheckboxesPage;
import steps.CheckboxSteps;

public class CheckboxStepsTest extends BaseTest {

    @Test
    public void checkbox1Check(){
        CheckboxSteps.firstCheckboxChecked(driver);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isCheckbox1Checked = checkboxesPage.isCheckbox1Selected();
        Assert.assertTrue(isCheckbox1Checked, "Чек бокс проставлен");
    }

    @Test
    public void checkbox2Check(){
        CheckboxSteps.secondCheckboxChecked(driver);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isCheckbox2Checked = checkboxesPage.isCheckbox2Selected();
        Assert.assertFalse(isCheckbox2Checked, "Чек бокс  не проставлен");
    }
}
