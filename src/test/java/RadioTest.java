import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest extends PageTest{

    @Test
    public void testSingleRadio()
    {
        BasePage basePage = new BasePage(driver);
        basePage.navigate();

        RadioPage radioPage = basePage.goToRadioPage();
        radioPage.navigate();

        String actual = radioPage.getCheckedValue();
        String expected = "Radio button 'Male' is checked";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultipleRadio()
    {
        RadioPage radioPage = new RadioPage(driver);

        String actual = radioPage.getValues();
        String expected = "Sex : Male\n" +
                "Age group: 5 - 15";

        Assertions.assertEquals(expected, actual);
    }
}
