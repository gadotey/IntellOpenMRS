package tests;

import base.BaseUtil;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.RetryAnalyzer;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Gadotey on 2/25/2020
 */
public class LoginPageTest extends BaseUtil {

    //RetryAnalyzer will make the test run again in case if fails
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void  testing() {
        LoginPage logPage = new LoginPage(driver);
        logPage.Username1("Admin");
        logPage.Password("Admin123");
        assertTrue(logPage.isOnResuiltPage());
    }


}
