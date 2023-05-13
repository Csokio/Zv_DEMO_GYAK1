import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AlertPage extends Pages{

    public AlertPage(WebDriver driver)
    {
        super(driver);
    }

    private final String url = "http://demo.seleniumeasy.com/javascript-alert-box-demo.html";


    public void navigate()
    {
        driver.navigate().to(url);
    }
    //TODO Single Name Alert Box

    private final By TEXT_ALERT = By.id("prompt-demo");

    public String getSingleAlertMessage(String message)
    {
        navigate();
        invokeFunction("myPromptFunction()");
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
        return findElementLocatedBy(TEXT_ALERT).getText();
    }

    //TODO Multiple Name Alert Box

    public List<String> getMultipleAlertMessage(String nameA, String nameB)
    {
        List<String> resultList = new ArrayList<>();

        navigate();
        invokeFunction("myPromptFunction()");
        driver.switchTo().alert().sendKeys(nameA);
        driver.switchTo().alert().accept();
        resultList.add(findElementLocatedBy(TEXT_ALERT).getText());

        invokeFunction("myPromptFunction()");
        driver.switchTo().alert().sendKeys(nameB);
        driver.switchTo().alert().dismiss();
        resultList.add(findElementLocatedBy(TEXT_ALERT).getText());

        return resultList;
    }
}
