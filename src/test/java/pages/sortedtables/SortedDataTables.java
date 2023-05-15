package pages.sortedtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import static constans.PageUrl.HEROKUAPP_PAGE_NOTIFICATION_TABLES;

public class SortedDataTables extends BasePage {
    private By firstName = By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']" +
            "/preceding-sibling::td[1]");

    private By lastName = By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']" +
            "/preceding-sibling::td[2]");

    private By due = By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']//" +
            "following-sibling::td");
    private By website = By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']" +
            "//following-sibling::td[2]");

    public SortedDataTables(WebDriver driver) {
        super(driver);
    }

    public SortedDataTables openSortedDataPage() {
        driver.get(HEROKUAPP_PAGE_NOTIFICATION_TABLES);
        return this;
    }

    public String getTextFirstName() {
        WebElement textFirstName = driver.findElement(firstName);
        String textFirstName1 = textFirstName.getText();
        return textFirstName1;
    }

    public String getTextLastName() {
        WebElement textLastName = driver.findElement(lastName);
        return textLastName.getText();
    }

    public String getTextDue() {
        WebElement textDue = driver.findElement(due);
        return textDue.getText();
    }

    public String getTextWebsite() {
        WebElement textWebsite = driver.findElement(website);
        return textWebsite.getText();
    }

}
