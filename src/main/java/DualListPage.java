import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

public class DualListPage extends Pages{

    public DualListPage(WebDriver driver)
    {
        super(driver);
    }

    private final String url = "http://demo.seleniumeasy.com/jquery-dual-list-box-demo.html";

    private void navigate()
    {
        driver.navigate().to(url);
    }

    //TODO List Add All

    private final By BUTTON_ADD_ALL = By.xpath("//button[@class='pAddAll btn btn-primary btn-sm']");

    private final By SELECT_RESULT = By.xpath("//select[@class='form-control pickListSelect pickListResult']");

    public HashMap<Boolean, Integer> getSelectSize()
    {
        HashMap<Boolean, Integer> resultMap = new HashMap<>();

        navigate();
        findElementLocatedBy(BUTTON_ADD_ALL).click();
        Select select = new Select(findElementLocatedBy(SELECT_RESULT));
        boolean key = select.isMultiple();
        int value = select.getOptions().size();

        resultMap.put(key, value);
        return  resultMap;
    }

    //TODO List Add One

    private final By BUTTON_ADD = By.xpath("//button[@class='pAdd btn btn-primary btn-sm']");

    private final By SELECT_ORIGINAL = By.xpath("//select[@class='form-control pickListSelect pickData']");

    public HashMap<Integer, Boolean> isSelectedItemTrue(String name)
    {
        HashMap<Integer, Boolean> resultMap = new HashMap<>();

        navigate();
        Select select = new Select(findElementLocatedBy(SELECT_ORIGINAL));
        select.selectByVisibleText(name);
        findElementLocatedBy(BUTTON_ADD).click();
        int key = select.getOptions().size();

        Select newSelect = new Select(findElementLocatedBy(SELECT_RESULT));
        boolean value = newSelect.getOptions().get(0).getText().equals(name);

        resultMap.put(key, value);
        return resultMap;
    }
}
