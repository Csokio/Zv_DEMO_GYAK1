package WebPages;

import org.openqa.selenium.By;

public class BasePage extends Pages {

    public BasePage()
    {
        super();
    }

    private final String url = "http://demo.seleniumeasy.com/basic-first-form-demo.html";

    public void navigate()
    {
        Pages.driver.navigate().to(url);
    }

    //TODO Sum of Valid Numbers
    private final By TEXT_VALUE_A = By.id("value1");
    private final By TEXT_VALUE_B = By.id("value2");

    private final By SUM_NUMBERS = By.id("displayvalue");

    public int getValidSum(int a, int b)
    {
        findElementLocatedBy(TEXT_VALUE_A).sendKeys(String.valueOf(a));
        findElementLocatedBy(TEXT_VALUE_B).sendKeys(String.valueOf(b));
        invokeFunction("return total()");

        return Integer.parseInt(findElementLocatedBy(SUM_NUMBERS).getText());
    }

    //TODO Sum of Invalid Numbers

    public String getInvalidSum(String a, String b)
    {
        findElementLocatedBy(TEXT_VALUE_A).sendKeys(a);
        findElementLocatedBy(TEXT_VALUE_B).sendKeys(b);
        invokeFunction("return total()");

        return findElementLocatedBy(SUM_NUMBERS).getText();
    }

    //TODO Navigate To WebPages.RadioPage

    private final By BUTTON_INPUT_FORMS = By.linkText("Input Forms");
    private final By BUTTON_RADIO_DEMO = By.linkText("Radio Buttons Demo");

    public RadioPage goToRadioPage()
    {
        findElementLocatedBy(BUTTON_INPUT_FORMS).click();
        findElementLocatedBy(BUTTON_RADIO_DEMO).click();
        return new RadioPage();
    }
}
