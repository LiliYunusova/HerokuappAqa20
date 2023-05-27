package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.checkboxes.CheckboxesPage;

public class CheckboxSteps {
    private static CheckboxesPage checkboxesPage;

    @Step("first checkbox")
    public static void firstCheckboxChecked(WebDriver driver) {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openHerokuappCheckboxesPage();
        checkboxesPage.checkbox1Click();
    }

    @Step("second checkbox")
    public static void secondCheckboxChecked(WebDriver driver) {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openHerokuappCheckboxesPage();
        checkboxesPage.checkbox2Click();
    }
}
