package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.ProgressBarPage;

public class ProgressBarPageTest extends PageTest{

    @Test
    public void testIsBarLoaded()
    {
        ProgressBarPage progressBarPage = new ProgressBarPage(driver);

        Assertions.assertTrue(progressBarPage.getLoadingValue());
    }
}
