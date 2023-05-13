package FunctionTests;

import WebPages.ProgressBarPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgressBarPageTest extends PageTest{

    @Test
    public void testIsBarLoaded()
    {
        ProgressBarPage progressBarPage = new ProgressBarPage(driver);

        Assertions.assertTrue(progressBarPage.getLoadingValue());
    }
}
