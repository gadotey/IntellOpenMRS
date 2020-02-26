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
public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 40);
    }
//    private By registrationDesk = By.id("Registration Desk");
//    private By inPatientWard = By.xpath("//li[@id='Inpatient Ward']");
//    private By outPatientWard = By.xpath("//li[@id='Outpatient Clinic']");
//    private By Pharmacy = By.id("Pharmacy");
//    private By Laboratory = By.id("Laboratory");
//    //private By registrationDesk = By.xpath("//li[@id='Registration Desk']");
//    private By submitButton = By.id("loginButton");
//    private By errorMessage = By.id("error-message");
//    private By Title = By.xpath("//*[@id=\"home-container\"]/h4");
//
//    private boolean locationElement;


    @FindBy(xpath = "//label[contains(text(),'Username:')]")
    WebElement usernameEditBox;

    @FindBy(xpath = "//label[contains(text(),'Password:')]")
    WebElement passwordEditBox;

    @FindBy(id = "Registration Desk")
    WebElement RegistrationDesk;

    @FindBy(id = "loginButton")
    WebElement loginButton;


      public void Username1(String input) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameEditBox));
        usernameEditBox.sendKeys(input);
        }

    public void Password(String input) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameEditBox));
        passwordEditBox.sendKeys(input);
        RegistrationDesk.click();
        loginButton.click();
    }

    public boolean isOnResuiltPage() {
        wait.until(ExpectedConditions.visibilityOf(usernameEditBox));
        if (usernameEditBox.isDisplayed()){
            return true;
        }
        return false;
    }

 }

