package PageObjects;

import Utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;
    private String shoppingCartPageTitle = "Shopping Cart";
    private By quantityLoc = By.xpath("//div[contains(@class,'input')]/input[contains(@name,'quantity')]");
    private By updateLoc = By.xpath("//button[@data-original-title = 'Update']");
    private By unitPrice = By.xpath("//div[@id='content']/h1/following-sibling::form //table //tbody //td[last()-1]");
    private By totalPrice = By.xpath("//div[@id='content']/h1/following-sibling::form //table //tbody //td[last()]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForCartPageToLoad() {
        try {
            BrowserUtility.waitForTitleToAppear(driver,15, shoppingCartPageTitle);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void enterProductCount(String quantity) {
        BrowserUtility.waitForElementToAppear(driver,quantityLoc, 10);
        driver.findElement(quantityLoc).clear();
        driver.findElement(quantityLoc).sendKeys(quantity);
    }

    public void clickOnUpdateButton() {
        BrowserUtility.waitForElementToAppear(driver, updateLoc, 10);
        driver.findElement(updateLoc).click();
    }

    public boolean verifyTotalPrice() {
        try {
            BrowserUtility.waitForElementToAppear(driver, totalPrice, 15);
            BrowserUtility.waitForElementToAppear(driver, unitPrice, 15);
            BrowserUtility.waitForElementToAppear(driver, quantityLoc, 15);
        } catch (Exception e) {
            return false;
        }
        Double unitPrice = Double.parseDouble(BrowserUtility.sanitizeAmount( driver.findElement(this.unitPrice).getText()));
        Double totalPrice = Double.parseDouble(BrowserUtility.sanitizeAmount( driver.findElement(this.totalPrice).getText()));
        Double quantityPurchased = Double.parseDouble(BrowserUtility.sanitizeAmount(driver.findElement(this.quantityLoc).getAttribute("value")));

        return totalPrice == (quantityPurchased * unitPrice);
    }


}
