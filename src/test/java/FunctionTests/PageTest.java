package FunctionTests;

import org.junit.jupiter.api.AfterAll;
import WebPages.Pages;
import org.junit.jupiter.api.BeforeEach;

public class PageTest {

    @BeforeEach
    public void setup()
    {
        new Pages();
    }
    @AfterAll
    protected static void closeTheDriver()
    {
        Pages.closeDriver();
    }
}
