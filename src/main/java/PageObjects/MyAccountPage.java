package PageObjects;

import Utility.BrowserUtility;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private String myAccountPageTitle = "My account - My Shop";

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForMyAccountPageToLoad() {
        try {
            BrowserUtility.waitForTitleToAppear(driver,15,myAccountPageTitle);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
