package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DualListPage;

import java.util.HashMap;

public class DualListTest extends PageTest{

    @Test
    public void testAddAllToList()
    {
        DualListPage dualListPage = new DualListPage(driver);

        HashMap<Boolean, Integer> actualMap = dualListPage.getSelectSize();
        HashMap<Boolean, Integer> expectedMap = new HashMap<>(){{ put(true, 15); }};

        Assertions.assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testIsRightItemAdded()
    {
        DualListPage dualListPage = new DualListPage(driver);

        HashMap<Integer, Boolean> actualMap = dualListPage.isSelectedItemTrue("Julia");
        HashMap<Integer, Boolean> expectedMap = new HashMap<>(){{ put(14, true); }};

        Assertions.assertEquals(expectedMap, actualMap);
    }
}
