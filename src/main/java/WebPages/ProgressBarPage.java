package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarPage extends Pages{

    public ProgressBarPage(WebDriver driver)
    {
        super(driver);
    }

    private final String url = "http://demo.seleniumeasy.com/bootstrap-download-progress-demo.html";

    private final By BUTTON_PROGRESS = By.id("cricle-btn");

    private final By TEXT_PROGRESS = By.xpath("//div[@class='percenttext']");

    public boolean getLoadingValue()
    {
        driver.navigate().to(url);
        findElementLocatedBy(BUTTON_PROGRESS).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean result = wait.until(ExpectedConditions.textToBe(TEXT_PROGRESS, "100%"));

        return result;
    }
}
