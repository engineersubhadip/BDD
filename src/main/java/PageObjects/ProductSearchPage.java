package PageObjects;

import Utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductSearchPage {

    private WebDriver driver;
    private By productList = By.xpath("//div[contains(@class,'product-grid')] //div");
    private By productSearchHeader = By.xpath("//h1[contains(text(),'Search')]");
    private By successMsg = By.xpath("//div[@id='product-search']/div[last()]/preceding-sibling::div");
    private By shoppingCartIcon = By.xpath("//a[@title = 'Shopping Cart']");

    public ProductSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForProductSearchPageToLoad() {
        try {
            BrowserUtility.waitForElementToAppear(driver,productSearchHeader,15);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean validateSearchResults(String userProduct) {
        try {
            BrowserUtility.waitForElementToAppear(driver, productList, 20);
        } catch (Exception e) {
            return false;
        }
        List<WebElement> productListAppeared = driver.findElements(this.productList);
        if (productListAppeared.size() == 0) {
            return false;
        }
        for (WebElement currProduct : productListAppeared) {
            String currProductName = currProduct.findElement(By.xpath("./div[2]/div[@class='caption']/h4")).getText();
            if (currProductName.equalsIgnoreCase(userProduct)) {
                return true;
            }
        }
        return false;
    }

    public void addToCart(String userProduct) {
        try {
            BrowserUtility.waitForElementToAppear(driver, productList, 20);
        } catch (Exception e) {
            e.printStackTrace();
            return ;
        }
        List<WebElement> productListAppeared = driver.findElements(this.productList);

        for (WebElement currProduct : productListAppeared) {
            String currProductName = currProduct.findElement(By.xpath("./div[2]/div[@class='caption']/h4")).getText();
            if (currProductName.equalsIgnoreCase(userProduct)) {
                currProduct.findElement(By.xpath("./div[2]/div[last()]/button[1]")).click();
                break;
            }
        }
    }

    public boolean waitForSuccessMessageToAppear() {
        try {
            BrowserUtility.waitForElementToAppear(driver,successMsg,10);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void clickOnShoppingCartIcon() {
        BrowserUtility.waitForElementToAppear(driver,shoppingCartIcon, 10);
        driver.findElement(shoppingCartIcon).click();
    }
}
