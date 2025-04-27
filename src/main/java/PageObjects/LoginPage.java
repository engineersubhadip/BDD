package PageObjects;

import Utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userEmail = By.id("email");
    private By userPassword = By.id("passwd");
    private By loginBtn = By.id("SubmitLogin");
    private String loginPageTitle = "Login - My Shop";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForLoginPageToLoad() {
        try {
            BrowserUtility.waitForTitleToAppear(driver,20, this.loginPageTitle);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void enterUserEmail(String userEmail) {
        BrowserUtility.waitForElementToAppear(driver,this.userEmail,10);
        driver.findElement(this.userEmail).sendKeys(userEmail);
    }

    public void enterUserPassword(String userPassword) {
        BrowserUtility.waitForElementToAppear(driver,this.userPassword, 10);
        driver.findElement(this.userPassword).sendKeys(userPassword);
    }

    public void clickLoginButton() {
        BrowserUtility.waitForElementToAppear(driver,this.loginBtn,10);
        driver.findElement(this.loginBtn).click();
    }
}
