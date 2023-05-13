package FunctionTests;

import org.junit.jupiter.api.AfterAll;
import WebPages.Pages;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class PageTest {

    protected WebDriver driver;
    @BeforeEach
    public void setup()
    {
        driver = Pages.initDriver();
    }
    @AfterAll
    public static void closeTheDriver()
    {
        Pages.closeDriver();
    }
}
