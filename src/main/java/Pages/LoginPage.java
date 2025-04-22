package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    private By userEmail = By.id("Email");
    private By userPassword = By.id("Password");
    private By loginButton = By.xpath("//button[text()='Log in']");
    private String loginPageTitle = "nopCommerce demo store. Login";
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return this.loginPageTitle;
    }

    public boolean waitForLoginPageToLoad() {
        try {
            System.out.println("Driver : "+driver+" loginPageTitle "+loginPageTitle+" actual page title : "+driver.getTitle());
            wait.until(ExpectedConditions.titleContains("loginPageTitle"));
            return true;
        }catch(Exception e) {
            return false;
        }
    }

    public void enterUserEmail(String userEmail) {
        driver.findElement(this.userEmail).sendKeys(userEmail);
    }

    public void enterUserPassword(String password) {
        driver.findElement(this.userPassword).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
