package FunctionTests;

import org.junit.jupiter.api.AfterAll;
import WebPages.Pages;

public class PageTest {

    @AfterAll
    protected static void closeTheDriver()
    {
        Pages.closeDriver();
    }
}
