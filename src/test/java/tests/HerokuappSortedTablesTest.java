package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.sortedtables.SortedDataTables;
import utilites.Retry;

public class HerokuappSortedTablesTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void checkFirstNameTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String firstName = sortedDataTables.openSortedDataPage()
                .getTextFirstName();
        Assert.assertEquals(firstName, "Frank");
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkLastNameTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String lastName = sortedDataTables.openSortedDataPage()
                .getTextLastName();
        Assert.assertEquals(lastName, "Bach");
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkDueTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String due = sortedDataTables.openSortedDataPage()
                .getTextDue();
        Assert.assertEquals(due, "$51.00");
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkWebsiteTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String website = sortedDataTables.openSortedDataPage()
                .getTextWebsite();
        Assert.assertEquals(website, "http://www.frank.com");
    }
}
