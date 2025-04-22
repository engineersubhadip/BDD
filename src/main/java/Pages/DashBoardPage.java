package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPage {

    WebDriver driver;
    private String dashboardPageTitle = "Dashboard / nopCommerce administration";
    private By logoutLink = By.xpath("//a[text()='Logout']");
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForDashboardPageToLoad() {
        try {
            wait.until(ExpectedConditions.titleContains(dashboardPageTitle));
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public String getLogoutPageTitle() {
        return this.dashboardPageTitle;
    }

    public void clickLogoutLink() {

    }
}
