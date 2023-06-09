package tests;

import org.junit.jupiter.api.*;
import pages.BasePage;


public class BaseTest extends PageTest{

    @Test
    public void testSumOfValidNumbers()
    {
        BasePage basePage = new BasePage(driver);

        basePage.navigate();
        int actual = basePage.getValidSum(10,20);
        int expected = 30;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSumOfInvalidNumbers()
    {
        BasePage basePage = new BasePage(driver);

        basePage.navigate();
        String actual = basePage.getInvalidSum("Hello", "John");
        String expected = "NaN";

        Assertions.assertEquals(expected, actual);
    }
}
