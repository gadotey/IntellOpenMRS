package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Gadotey on 2/25/2020
 */
public class GooglePage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(name = "q")
    WebElement searchField;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(id = "res")
    WebElement  searchResult;

    public void searchFor(String input) {
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys(input);
        searchButton.click();
    }

    public boolean isOnResuiltPage() {
        wait.until(ExpectedConditions.visibilityOf(searchResult));
        if (searchResult.isDisplayed()){
            return true;
    }
    return false;
 }
}
