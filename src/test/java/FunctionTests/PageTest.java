package FunctionTests;

import org.junit.jupiter.api.AfterAll;
import WebPages.Pages;
import org.junit.jupiter.api.BeforeEach;

public class PageTest {

    public PageTest()
    {
        super();
    }
    @BeforeEach
    public void setup()
    {
        new PageTest();
    }
    @AfterAll
    protected static void closeTheDriver()
    {
        Pages.closeDriver();
    }
}
