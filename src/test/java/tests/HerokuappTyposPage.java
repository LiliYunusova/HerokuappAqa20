package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.typos.TyposPage;

public class HerokuappTyposPage extends BaseTest {
    @Test
    public void checkTyposTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        String expectedResult = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(typosPage.getTyposText(), expectedResult);
    }
}
