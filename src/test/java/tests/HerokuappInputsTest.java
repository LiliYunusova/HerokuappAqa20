package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.inputs.InputsPage;
import utilites.Retry;

public class HerokuappInputsTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void enterNumberDataArrowUpTest() {
        InputsPage inputsPage = new InputsPage(driver);
        String number = inputsPage.arrowUp();
        Assert.assertEquals(number, "1");
    }

    @Test(retryAnalyzer = Retry.class)
    public void enterNumberDataArrowDownTest() {
        InputsPage inputsPage = new InputsPage(driver);
        String number = inputsPage.arrowDown();
        Assert.assertEquals(number, "4");
    }

}
