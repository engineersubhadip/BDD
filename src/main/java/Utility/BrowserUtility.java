package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtility {
    private static WebDriverWait wait;
    private int globalTime = 40;

    public static void waitForElementToAppear(WebDriver driver, By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForTitleToAppear(WebDriver driver, int time, String title) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static String sanitizeAmount(String amount) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<amount.length(); i++) {
            char currChar = amount.charAt(i);
            if (currChar == '.') {
                sb.append('.');
                continue;
            }
            int currASCII = (int)currChar;
            if (currASCII >= 48 && currASCII <= 57) {
                sb.append(currChar);
            }
        }
        String result = sb.toString();
        return result;
    }
}
