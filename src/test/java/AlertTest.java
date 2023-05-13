import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlertTest extends PageTest{

    @Test
    public void testSingleAlert()
    {
        AlertPage alertPage = new AlertPage(driver);

        String actual = alertPage.getSingleAlertMessage("John Wick");
        String expected = "You have entered 'John Wick' !";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultipleAlert()
    {
        AlertPage alertPage = new AlertPage(driver);

        List<String> actualList = alertPage.getMultipleAlertMessage("Luke", "Leila");
        String expected = "You have entered 'Luke' !";
        for(String sentence: actualList){
            boolean value = sentence.equals(expected);
            Assertions.assertTrue(value);
        }
    }
}
