package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constans.PageUrl.*;

public class HerokuappTest extends BaseTest {

    @Test
    public void firstCheckboxUnCheckedTest(){
        driver.get(HEROKUAPP_PAGE_CHECKBOXES);
        boolean isCheckboxSelected = driver.findElement(By.cssSelector("input:first-child")).isSelected();
        Assert.assertFalse(isCheckboxSelected, "Чек-бокc проставлен");
    }

    @Test
    public void firstCheckboxCheckedTest(){
        driver.get(HEROKUAPP_PAGE_CHECKBOXES);
        WebElement checkbox = driver.findElement(By.cssSelector("input:first-child"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected(), "Чек-бокc не выбран");
    }

    @Test
    public void secondCheckboxCheckedTest(){
        driver.get(HEROKUAPP_PAGE_CHECKBOXES);
        boolean isCheckboxSelected = driver.findElement(By.cssSelector("input:last-child")).isSelected();
        Assert.assertTrue(isCheckboxSelected, "Чек-бокc не выбран");
    }

    @Test
    public void secondCheckboxUnCheckedTest(){
        driver.get(HEROKUAPP_PAGE_CHECKBOXES);
        WebElement checkbox = driver.findElement(By.cssSelector("input:last-child"));
        checkbox.click();
        Assert.assertFalse(checkbox.isSelected(), "Чек-бокc выбран");
    }

    @Test
    public void enterNumberDataArrowUpTest(){
        driver.get(HEROKUAPP_PAGE_INPUTS);
        WebElement enterNumber = driver.findElement(By.cssSelector("[type = 'number']"));
        enterNumber.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(enterNumber.getAttribute("value"),"1");
    }

    @Test
    public void enterNumberDataArrowDownTest(){
        driver.get(HEROKUAPP_PAGE_INPUTS);
        WebElement enterNumber = driver.findElement(By.cssSelector("[type = 'number']"));
        enterNumber.sendKeys("5");
        enterNumber.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(enterNumber.getAttribute("value"), "4");
    }

    @Test
    public void checkTyposTest(){
        driver.get(HEROKUAPP_PAGE_TYPOS);
        WebElement text = driver.findElement(By.xpath("//p[contains (text(), 'Sometime')]"));
        String expectedResult  = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(text.getText(),expectedResult);
    }

    @Test
    public void notificationMassageTest(){
        driver.get(HEROKUAPP_PAGE_NOTIFICATION_MASSAGE);
        driver.findElement(By.xpath("//a[text()= 'Click here']")).click();
        WebElement notification = driver.findElement(By.cssSelector("#flash"));
        Assert.assertEquals(notification.getText(), "Action successful\n" +
                "×");
    }

    @Test
    public void checkFirstNameFirstNameTest(){
        driver.get(HEROKUAPP_PAGE_NOTIFICATION_TABLES);
        WebElement firstName = driver.findElement(By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']" +
                "/preceding-sibling::td[1]"));
        Assert.assertEquals(firstName.getText(), "Frank");
    }

    @Test
    public void checkFirstNameLastNameTest(){
        driver.get(HEROKUAPP_PAGE_NOTIFICATION_TABLES);
        WebElement lastName = driver.findElement(By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']" +
                "/preceding-sibling::td[2]"));
        Assert.assertEquals(lastName.getText(), "Bach");
    }

    @Test
    public void checkDueTest(){
        driver.get(HEROKUAPP_PAGE_NOTIFICATION_TABLES);
        WebElement due = driver.findElement(By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']//" +
                "following-sibling::td"));
        Assert.assertEquals(due.getText(), "$51.00");
    }

    @Test
    public void checkWebSiteTest(){
        driver.get(HEROKUAPP_PAGE_NOTIFICATION_TABLES);
        WebElement webSite = driver.findElement(By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']" +
                "//following-sibling::td[2]"));
        Assert.assertEquals(webSite.getText(), "http://www.frank.com");
    }
}
