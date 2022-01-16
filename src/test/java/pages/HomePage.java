package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.TestSetup;

import java.util.List;

public class HomePage extends TestSetup {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "Wikipedia1_wikipedia-search-input")
    WebElement srcItem;

    @FindBy(xpath = "//input[@class='wikipedia-search-button']")
    WebElement srcButton;

    @FindBy(xpath = "//*[@id='wikipedia-search-result-link']/a")
    List<WebElement> srcResult;

    public void srchText(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        srcItem.clear();
        srcItem.sendKeys(text);
    }

    public void clickSearch() {
        srcButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String searchResultDisplay() {
        String results = srcResult.get(0).getText();
        for (WebElement webElement : srcResult) {

        }
        return results;
    }

}
