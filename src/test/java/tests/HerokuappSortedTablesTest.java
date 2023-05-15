package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.sortedtables.SortedDataTables;

public class HerokuappSortedTablesTest extends BaseTest {

    @Test
    public void checkFirstNameTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String firstName = sortedDataTables.openSortedDataPage()
                .getTextFirstName();
        Assert.assertEquals(firstName, "Frank");
    }

    @Test
    public void checkLastNameTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String lastName = sortedDataTables.openSortedDataPage()
                .getTextLastName();
        Assert.assertEquals(lastName, "Bach");
    }

    @Test
    public void checkDueTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String due = sortedDataTables.openSortedDataPage()
                .getTextDue();
        Assert.assertEquals(due, "$51.00");
    }

    @Test
    public void checkWebsiteTest() {
        SortedDataTables sortedDataTables = new SortedDataTables(driver);
        String website = sortedDataTables.openSortedDataPage()
                .getTextWebsite();
        Assert.assertEquals(website, "http://www.frank.com");
    }
}
