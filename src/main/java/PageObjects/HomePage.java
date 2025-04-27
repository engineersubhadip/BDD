package PageObjects;

import Utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;
    private String homePageTitle = "Your Store";
    private By searchBar = By.xpath("//div[@id='search']/input");
    private By searchButton = By.xpath("//div[@id='search'] //button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForHomePageToLoad() {
        try {
            BrowserUtility.waitForTitleToAppear(driver,20,homePageTitle);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void enterProductName(String userProduct) throws InterruptedException {
        BrowserUtility.waitForElementToAppear(driver,searchBar,20);
        driver.findElement(searchBar).sendKeys(userProduct);
    }

    public void clickSearchButton() {
        BrowserUtility.waitForElementToAppear(driver,searchButton,20);
        driver.findElement(searchButton).click();
    }
}
