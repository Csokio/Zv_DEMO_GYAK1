package WebPages;

import WebPages.Pages;
import org.openqa.selenium.By;

public class RadioPage extends Pages {

    public RadioPage()
    {
        super();
    }


    private final String url = "http://demo.seleniumeasy.com/basic-radiobutton-demo.html";

    public void navigate()
    {
        driver.navigate().to(url);
    }

    //TODO Single Radio Button Value
    private final By BUTTON_MALE = By.xpath("(//input[@value='Male'])[1]");

    private final By BUTTON_GET_CHECK_VALUE = By.id("buttoncheck");

    private final By TEXT_VALUE = By.xpath("//p[@class=\"radiobutton\"]");

    public String getCheckedValue()
    {
        findElementLocatedBy(BUTTON_MALE).click();
        findElementLocatedBy(BUTTON_GET_CHECK_VALUE).click();
        return findElementLocatedBy(TEXT_VALUE).getText();
    }

    //TODO Multiple Radio Buttons

    private final By BUTTON_MALE_SECOND = By.xpath("(//input[@value='Male'])[2]");

    private final By BUTTON_AGES = By.xpath("//input[@value=\"5 - 15\"]");

    private final By TEXT_VALUES = By.xpath("//p[@class=\"groupradiobutton\"]");

    public String getValues()
    {
        navigate();
        findElementLocatedBy(BUTTON_MALE_SECOND).click();
        findElementLocatedBy(BUTTON_AGES).click();
        invokeFunction("getValues();");
        return findElementLocatedBy(TEXT_VALUES).getText();
    }
}
